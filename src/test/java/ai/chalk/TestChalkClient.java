package ai.chalk;

import ai.chalk.client.ChalkClient;
import ai.chalk.client.ClientConfig;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
public class TestChalkClient {


    @Test
    public void test() {
        System.out.println("RUNNING SOME TESTS");
        ChalkClient client = ChalkClient.builder().setApiServer("http://localhost:8000").build();
    }

}

