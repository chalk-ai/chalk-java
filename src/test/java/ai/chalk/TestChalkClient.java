package ai.chalk;

import ai.chalk.client.ChalkClient;
import org.junit.jupiter.api.Test;

public class TestChalkClient {


    @Test
    public void test() {
        System.out.println("RUNNING SOME TESTS");
        ChalkClient client = ChalkClient.builder().setApiServer("http://localhost:8000").build();
    }

}

