package ai.chalk.flink.examples;

import ai.chalk.flink.core.ChalkRowConverter;
import ai.chalk.flink.core.ChalkSinkConfig;
import ai.chalk.flink.sink.ChalkRichSinkFunction;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

import java.time.Duration;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Minimal end-to-end example: build a stream of records and push them into Chalk's online store via
 * {@code upload_features}. Run against a real environment with credentials in the environment:
 *
 * <pre>
 *   export CHALK_CLIENT_ID=...
 *   export CHALK_CLIENT_SECRET=...
 *   export CHALK_ENVIRONMENT_ID=...   # optional; defaults to the token's primary environment
 *
 *   flink run -c ai.chalk.flink.examples.ChalkUploadFeaturesJob build/libs/chalk-flink-sink-0.1.0.jar
 * </pre>
 *
 * Swap {@code fromElements} for a real source (Kafka, Kinesis, ...); everything downstream is the
 * same. The only requirement on the converter is that each row include the resolver's primary-key
 * feature ({@code user.id} here).
 */
public final class ChalkUploadFeaturesJob {

    /** Example event flowing through the pipeline. Public fields + no-arg ctor => Flink POJO. */
    public static final class UserScoreEvent {
        public long userId;
        public double fraudScore;
        public String riskBucket;

        public UserScoreEvent() {}

        public UserScoreEvent(long userId, double fraudScore, String riskBucket) {
            this.userId = userId;
            this.fraudScore = fraudScore;
            this.riskBucket = riskBucket;
        }
    }

    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        // Checkpointing drives at-least-once flushes; interval bounds worst-case upload latency.
        env.enableCheckpointing(10_000);

        ChalkSinkConfig config = ChalkSinkConfig.builder()
                .clientId(requireEnv("CHALK_CLIENT_ID"))
                .clientSecret(requireEnv("CHALK_CLIENT_SECRET"))
                .environmentId(System.getenv("CHALK_ENVIRONMENT_ID")) // nullable
                .batchSize(500)
                .flushInterval(Duration.ofSeconds(5))
                .uploadTimeout(Duration.ofSeconds(30))
                .maxRetries(3)
                .build();

        // Map each event to a Chalk feature row keyed by fully-qualified feature name.
        ChalkRowConverter<UserScoreEvent> converter = event -> {
            Map<String, Object> row = new LinkedHashMap<>();
            row.put("user.id", event.userId);            // primary key — required
            row.put("user.fraud_score", event.fraudScore);
            row.put("user.risk_bucket", event.riskBucket);
            return row;
        };

        DataStreamSource<UserScoreEvent> events = env.fromElements(
                new UserScoreEvent(1L, 0.87, "high"),
                new UserScoreEvent(2L, 0.12, "low"),
                new UserScoreEvent(3L, 0.55, "medium"));

        // Version-agnostic default (Flink 1.x):
        events.addSink(new ChalkRichSinkFunction<>(config, converter))
                .name("chalk-upload-features");

        // Flink 1.15+/2.0 alternative (modern Sink2 API):
        //   events.sinkTo(new ai.chalk.flink.sink.ChalkSink<>(config, converter))
        //         .name("chalk-upload-features");

        env.execute("chalk-upload-features-example");
    }

    private static String requireEnv(String name) {
        String value = System.getenv(name);
        if (value == null || value.isEmpty()) {
            throw new IllegalStateException("missing required environment variable: " + name);
        }
        return value;
    }

    private ChalkUploadFeaturesJob() {}
}
