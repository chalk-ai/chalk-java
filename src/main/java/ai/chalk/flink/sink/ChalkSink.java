package ai.chalk.flink.sink;

import ai.chalk.flink.core.ChalkRowConverter;
import ai.chalk.flink.core.ChalkSinkConfig;
import ai.chalk.flink.core.ChalkUploadClientFactory;
import org.apache.flink.api.connector.sink2.Sink;
import org.apache.flink.api.connector.sink2.SinkWriter;

/**
 * Chalk {@code upload_features} sink on the modern Sink2 API (Flink 1.15+). Use it with
 * {@code stream.sinkTo(new ChalkSink<>(config, converter))}.
 *
 * <p>Compiled against the Flink 1.18 {@code Sink.createWriter(InitContext)} signature, which is
 * source-compatible across 1.15–1.19. On Flink 2.0 the parameter type is {@code WriterInitContext};
 * adjust the one override below if targeting 2.0. The {@link ChalkRichSinkFunction} adapter remains
 * the choice for older (pre-1.15) clusters.
 *
 * <p>{@link Sink} is serialized and shipped to TaskManagers, so both {@link ChalkSinkConfig} and the
 * {@link ChalkRowConverter} must be serializable (they are).
 *
 * @param <IN> the stream element type
 */
public class ChalkSink<IN> implements Sink<IN> {

    private static final long serialVersionUID = 1L;

    private final ChalkSinkConfig config;
    private final ChalkRowConverter<IN> converter;
    private final ChalkUploadClientFactory clientFactory; // nullable -> real ChalkClient transport

    public ChalkSink(ChalkSinkConfig config, ChalkRowConverter<IN> converter) {
        this(config, converter, null);
    }

    /** Advanced/test constructor: inject the upload-client factory (e.g. a fake for MiniCluster). */
    public ChalkSink(
            ChalkSinkConfig config, ChalkRowConverter<IN> converter, ChalkUploadClientFactory clientFactory) {
        this.config = config;
        this.converter = converter;
        this.clientFactory = clientFactory;
    }

    @Override
    public SinkWriter<IN> createWriter(InitContext context) {
        return new ChalkSinkWriter<>(config, converter, clientFactory);
    }
}
