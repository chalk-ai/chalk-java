package ai.chalk.client;

import ai.chalk.client.ChalkClient;
import org.junit.jupiter.api.Test;

public class TestChalkClient {
    @Test
    public void test() {
        try {
            ChalkClient client = ChalkClient.builder().setApiServer("http://localhost:8000").build();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

