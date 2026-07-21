package ai.chalk.flink.sink;

import ai.chalk.flink.core.ChalkFeatureUploader;
import ai.chalk.flink.core.ChalkRowConverter;
import ai.chalk.flink.core.ChalkSinkConfig;
import ai.chalk.flink.core.ChalkUploadClientFactory;
import org.apache.flink.configuration.Configuration;
import org.apache.flink.runtime.state.FunctionInitializationContext;
import org.apache.flink.runtime.state.FunctionSnapshotContext;
import org.apache.flink.streaming.api.checkpoint.CheckpointedFunction;
import org.apache.flink.streaming.api.functions.sink.RichSinkFunction;

import java.util.Map;

/**
 * Chalk {@code upload_features} sink on the legacy {@code RichSinkFunction} API. This is the most
 * broadly compatible adapter: {@code RichSinkFunction} + {@code CheckpointedFunction} is present
 * across Flink 1.x. Use it with {@code stream.addSink(...)}. Caveats: {@code open(Configuration)} is
 * deprecated from 1.19 (in favor of {@code open(OpenContext)}), and {@code SinkFunction} /
 * {@code RichSinkFunction} is removed in Flink 2.0 — target {@link ChalkSink} (Sink2) on 1.15+/2.0.
 *
 * <p>At-least-once: {@link #snapshotState} flushes the buffer so every row observed before a
 * checkpoint barrier is acked by Chalk before that checkpoint completes. On failure Flink replays
 * from the last checkpoint; re-sends are safe because {@code upload_features} is a primary-key
 * upsert. There is no Flink-managed operator state to restore — the in-flight buffer is transient
 * and simply rebuilt from replayed records.
 *
 * @param <IN> the stream element type
 */
public class ChalkRichSinkFunction<IN> extends RichSinkFunction<IN> implements CheckpointedFunction {

    private static final long serialVersionUID = 1L;

    private final ChalkSinkConfig config;
    private final ChalkRowConverter<IN> converter;
    private final ChalkUploadClientFactory clientFactory; // nullable -> real ChalkClient transport

    private transient ChalkFeatureUploader uploader;

    public ChalkRichSinkFunction(ChalkSinkConfig config, ChalkRowConverter<IN> converter) {
        this(config, converter, null);
    }

    /** Advanced/test constructor: inject the upload-client factory (e.g. a fake for MiniCluster). */
    public ChalkRichSinkFunction(
            ChalkSinkConfig config, ChalkRowConverter<IN> converter, ChalkUploadClientFactory clientFactory) {
        this.config = config;
        this.converter = converter;
        this.clientFactory = clientFactory;
    }

    @Override
    public void open(Configuration parameters) {
        // One uploader (and one ChalkClient / gRPC channel) per parallel subtask.
        this.uploader = clientFactory == null
                ? new ChalkFeatureUploader(config)
                : new ChalkFeatureUploader(config, clientFactory.create(config));
    }

    @Override
    public void invoke(IN value, Context context) {
        Map<String, Object> row = converter.toRow(value);
        if (row != null) {
            uploader.add(row);
        }
    }

    @Override
    public void snapshotState(FunctionSnapshotContext context) {
        if (uploader != null) {
            uploader.flush(); // ack all buffered rows before this checkpoint is acknowledged
        }
    }

    @Override
    public void initializeState(FunctionInitializationContext context) {
        // No managed state: the buffer is transient and rebuilt from replayed input on restore.
    }

    @Override
    public void close() {
        if (uploader != null) {
            uploader.close(); // final flush + shut down the gRPC channel
        }
    }
}
