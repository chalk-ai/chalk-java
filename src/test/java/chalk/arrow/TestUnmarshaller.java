package chalk.arrow;

import chalk.client.features.User;
import chalk.internal.arrow.TableUnmarshaller;
import chalk.models.OnlineQueryParams;
import chalk.models.OnlineQueryResult;
import org.junit.jupiter.api.Test;

import java.util.Map;


public class TestUnmarshaller {


    public void getTestTableWithAllArrowTypes() {

    }

    @Test
    public void testUnmarshalIntoUser() throws Exception {
        User[] users = new User[10];
        users = TableUnmarshaller.unmarshal(table, User.class);
        };
        for (User user : users) {
            assert user != null;
            assert user.socureScore != null;
        }
    }
}
