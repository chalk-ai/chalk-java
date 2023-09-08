package ai.chalk.client;

import org.junit.jupiter.api.Test;

public class TestChalkClient {
    @Test
    public void test() {
        ChalkClient client = null;
        try {
            client = ChalkClient.create();
            client.printConfig();
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
    }
}

