package ai.chalk.flink.sink;

import ai.chalk.flink.core.ChalkRowConverter;
import ai.chalk.flink.core.ChalkSinkConfig;
import ai.chalk.flink.core.ChalkUploadClient;
import ai.chalk.flink.core.ChalkUploadClientFactory;
import ai.chalk.flink.core.UploadOutcome;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Runs the sink adapters on a real Flink local mini-cluster (via {@code env.execute()}) with a fake
 * upload client injected through {@link ChalkUploadClientFactory}. This exercises the parts unit
 * tests can't: job-graph serialization of the config/converter/factory, the operator lifecycle
 * (open → invoke/write → snapshot/flush → close), and end-to-end delivery of every row. It does NOT
 * touch Chalk or Arrow encoding — that's the injected client's job.
 */
class ChalkSinkMiniClusterTest {

    // Local mini-cluster runs in-JVM, so subtasks can report into static state.
    private static final ConcurrentLinkedQueue<Integer> UPLOADED_ROW_COUNTS = new ConcurrentLinkedQueue<>();
    private static final AtomicInteger CLOSES = new AtomicInteger();

    @BeforeEach
    void reset() {
        UPLOADED_ROW_COUNTS.clear();
        CLOSES.set(0);
    }

    /** Serializable factory returning a fake client that records how many rows it uploaded. */
    private static final class RecordingFactory implements ChalkUploadClientFactory {
        @Override
        public ChalkUploadClient create(ChalkSinkConfig config) {
            return new ChalkUploadClient() {
                @Override
                public UploadOutcome upload(Map<String, List<?>> columnarInputs) {
                    int rows = columnarInputs.getOrDefault("user.id", List.of()).size();
                    UPLOADED_ROW_COUNTS.add(rows);
                    return new UploadOutcome("op", List.of());
                }

                @Override
                public void close() {
                    CLOSES.incrementAndGet();
                }
            };
        }
    }

    private static ChalkSinkConfig config() {
        return ChalkSinkConfig.builder()
                .clientId("cid").clientSecret("secret")
                .batchSize(2) // exercise a mid-stream flush plus a close flush
                .flushInterval(Duration.ofSeconds(1))
                .build();
    }

    private static ChalkRowConverter<Long> converter() {
        return id -> Map.of("user.id", id, "user.score", id * 0.1);
    }

    private static int totalUploadedRows() {
        return UPLOADED_ROW_COUNTS.stream().mapToInt(Integer::intValue).sum();
    }

    @Test
    void richSinkFunctionDeliversAllRowsThroughRealFlinkRuntime() throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setParallelism(2);              // multiple subtasks -> exercises serialization + fan-out
        env.enableCheckpointing(200);       // drives snapshot/flush wiring

        env.fromElements(1L, 2L, 3L, 4L, 5L)
                .addSink(new ChalkRichSinkFunction<>(config(), converter(), new RecordingFactory()))
                .name("chalk-upload");

        env.execute("richsink-minicluster");

        assertEquals(5, totalUploadedRows(), "every input row must be uploaded exactly once");
        assertTrue(CLOSES.get() >= 1, "close() must run on the sink subtask(s)");
    }

    @Test
    void sink2DeliversAllRowsThroughRealFlinkRuntime() throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setParallelism(2);
        env.enableCheckpointing(200);

        env.fromElements(1L, 2L, 3L, 4L, 5L)
                .sinkTo(new ChalkSink<>(config(), converter(), new RecordingFactory()))
                .name("chalk-upload");

        env.execute("sink2-minicluster");

        assertEquals(5, totalUploadedRows(), "every input row must be uploaded exactly once");
        assertTrue(CLOSES.get() >= 1, "close() must run on the sink writer(s)");
    }
}
