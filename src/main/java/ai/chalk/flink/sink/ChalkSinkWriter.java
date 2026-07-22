package ai.chalk.flink.sink;

import ai.chalk.flink.core.ChalkFeatureUploader;
import ai.chalk.flink.core.ChalkRowConverter;
import ai.chalk.flink.core.ChalkSinkConfig;
import ai.chalk.flink.core.ChalkUploadClientFactory;
import org.apache.flink.api.connector.sink2.SinkWriter;

import java.util.Map;

/**
 * {@link SinkWriter} that batches feature rows and uploads them via Chalk {@code upload_features}.
 * One instance per parallel subtask, created by {@link ChalkSink#createWriter}.
 *
 * <p>Flink invokes {@link #flush(boolean)} on every checkpoint barrier (and at end-of-input), which
 * drains the buffer — this is what gives at-least-once alignment on the Sink2 API. Upload latency
 * is therefore bounded by the smaller of the configured flush interval and the checkpoint interval.
 *
 * @param <IN> the stream element type
 */
public class ChalkSinkWriter<IN> implements SinkWriter<IN> {

    private final ChalkRowConverter<IN> converter;
    private final ChalkFeatureUploader uploader;

    ChalkSinkWriter(ChalkSinkConfig config, ChalkRowConverter<IN> converter, ChalkUploadClientFactory clientFactory) {
        this.converter = converter;
        this.uploader = clientFactory == null
                ? new ChalkFeatureUploader(config)
                : new ChalkFeatureUploader(config, clientFactory.create(config));
    }

    @Override
    public void write(IN element, Context context) {
        Map<String, Object> row = converter.toRow(element);
        if (row != null) {
            uploader.add(row);
        }
    }

    @Override
    public void flush(boolean endOfInput) {
        uploader.flush();
    }

    @Override
    public void close() {
        uploader.close();
    }
}
