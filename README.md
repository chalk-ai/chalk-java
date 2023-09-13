# Chalk Java client

The official [Chalk](https://chalk.ai) client library for Java.

## Usage
### Requirements

- JDK 17

### Installation
(Instructions to be released)

### Connect to Chalk

Create a client using the `ChalkClient.create()` method.  The returned client gets its configuration:

1. From environment variables
2. From a ~/.chalk.yml file if neither (1) is not available

```java
import chalk.ChalkClient


ChalkClient client = ChalkClient.create();
```

Alternatively, create a client using specific overrides:
```java
import chalk.ChalkClient

        
ChalkClient client = ChalkClient.builder()
                    .setEnvironmentId("tmnma7wesandrsn")
                    .setClientId("kjhsfd43kjhfd8fdjk")
                    .setClientSecret("mnxcvuyqwmj7cnwe4mgfnuywe6jnas9sdn")
                    .build();
```

#### Debug client configuration

Use the method `ChalkClient.printConfig` to debug a connection or authentication issue. This method prints all config
variables and their sources to `stdout`.



### Online Query
Example querying for both a scalar feature (`user.spending_mean_30d`) and a has-many feature (`user.transactions`): 
```java
import chalk.client.ChalkClient;
import chalk.models.OnlineQueryParams;
import chalk.models.OnlineQueryResult;
import org.apache.arrow.vector.table.Table;
import org.apache.arrow.vector.FieldVector;
import org.apache.arrow.vector.complex.reader.FieldReader;


public class Main {
    public static void main(String[] args) {
        ChalkClient client = ChalkClient.create();
        var userIds = new int[] {1, 2, 3};
        var params = OnlineQueryParams.builder()
                    .withInputs("user.id", userIds)
                    .withOutputs("user.spending_mean_30d", "user.transactions")
                    .build();
        
        try (OnlineQueryResult result = client.onlineQuery(params)) {
            var row = result.getScalarsTable().immutableRow();
            while (row.hasNext()) {
                row.next();
                long userId = row.getInt64("user.id");
                double meanSpent = row.getFloat8("user.spending_mean_30d");
                System.out.println("User " + userId + " spent an average of $" + meanSpent + " per day in the last 30 days");
            }
                
            Table txnTable = result.getGroupsTables().get("user.transactions");
            FieldVector txnAmountVector = txnTable.getColumn("amount");
            // Do something with the transaction amount vector
        } catch (ChalkException e) {
            e.printStackTrace();
        }
    }
}
```
