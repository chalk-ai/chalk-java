package ai.chalk.client;

import ai.chalk.internal.arrow.FeatherProcessor;
import org.apache.arrow.memory.RootAllocator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public abstract class AllocatorTest {
    protected static RootAllocator allocator;

    @BeforeAll
    public static void setUp() {
        allocator = new RootAllocator(FeatherProcessor.ALLOCATOR_SIZE_ROOT);
    }

    @AfterAll
    public static void tearDown() {
        allocator.close();
    }
}
