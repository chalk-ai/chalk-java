package ai.chalk.client;

import ai.chalk.internal.arrow.FeatherProcessor;
import org.apache.arrow.memory.RootAllocator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public abstract class AllocatorTest {
    protected RootAllocator allocator;

    @BeforeEach
    public void setUp() {
        allocator = new RootAllocator(FeatherProcessor.ROOT_ALLOCATOR_SIZE);
    }

    @AfterEach
    public void tearDown() {
        allocator.close();
    }
}
