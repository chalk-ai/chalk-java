package ai.chalk.client;

import ai.chalk.client.e2e.FraudTemplateFeatures;
import ai.chalk.client.e2e.User;
import ai.chalk.exceptions.ChalkException;
import ai.chalk.models.OnlineQueryParams;
import ai.chalk.models.OnlineQueryResult;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;


import java.util.Arrays;


public class TestBuilder {
    private static ChalkClient.Builder builder;

    @BeforeAll
    public static void setUpClass() throws Exception {
        if (FraudTemplateFeatures.getInitException() != null) {
            throw FraudTemplateFeatures.getInitException();
        }
        builder = ChalkClient.builder();
    }
    @Test
    public void test() throws Exception {
        assertThrows(ChalkException.class, () -> builder.withDeploymentTag("tag").withBranch("branch").build());
    }
}
