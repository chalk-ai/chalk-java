package ai.chalk.client;

import ai.chalk.internal.config.models.JWT;
import org.junit.jupiter.api.Test;

public class TestChalkClient {
    @Test
    public void test() {
        ChalkClient client = null;
        try {
            client = ChalkClient.builder().build();
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        System.out.println(">>> CLIENT CONFIG: ");


        try {
            JWT jwt = client.handler().getJwt();
            System.out.println(">>> JWT: " + jwt.getValue());
        } catch (Exception e) {
            System.out.println(">>> OOPS");
            e.printStackTrace();
        }



    }

//    @Test
//    public void testConfigLoader() throws Exception {
//        var tokens = loadAllTokens();
//        System.out.println(">>> TOKENS: " + tokens);
//        try {
//            var config = loadAllTokens();
//            System.out.println(">>> HELLO");
//        } catch (Exception e ) {
//            System.out.println("HI");
//        }
////    }

}

