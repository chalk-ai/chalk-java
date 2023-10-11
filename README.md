# Chalk Java client

The official [Chalk](https://chalk.ai) client library for Java.

## Usage
### Requirements

- JDK 17 or JDK 20

### Installation
In your build.gradle, add these line under `dependencies`, substituting VERSION with your intended Chalk version:
```java
implementation 'chalk:chalk-java:VERSION'
```

### Connect to Chalk

Create a client using the `ChalkClient.create()` method.  The returned client gets its configuration:

1. From environment variables
2. From a ~/.chalk.yml file if neither (1) is not available

```java
import chalk.ChalkClient;


ChalkClient client = ChalkClient.create();
```

Alternatively, create a client using specific overrides:
```java
import chalk.ChalkClient;

        
ChalkClient client = ChalkClient.builder()
                    .setEnvironmentId("tmnma7wesandrsn")
                    .setClientId("kjhsfd43kjhfd8fdjk")
                    .setClientSecret("mnxcvuyqwmj7cnwe4mgfnuywe6jnas9sdn")
                    .build();
```

#### Debug client configuration

Use the method `ChalkClient.printConfig` to debug a connection or authentication issue. This method prints all config
variables and their sources to `stdout`. See the list of environment variables in `chalk.client.ConfigEnvVars`.

```bash
---------------------------------------------------------------------------------------------------------------------------
Config             Value                                                 Source                                        
---------------------------------------------------------------------------------------------------------------------------
Environment ID     prod                                                  ChalkClient builder argument                  
Client ID          client-4b8c614111f93f8255127e89d154a8a6               environment variable 'CHALK_CLIENT_ID'        
Api Server         http://127.0.0.1:8000                                 config file /Users/papan/.chalk.yml           
Client Secret      *************************************************     environment variable 'CHALK_CLIENT_SECRET'    
---------------------------------------------------------------------------------------------------------------------------
```


## Online Query

### Without codegen
You can make online queries with or without codegen, and while codegen is recommended, querying without codegen allows you
to access the underlying Arrow data structures directly. Here's an example querying for both a scalar feature (`user.spending_mean_30d`) and a has-many feature (`user.transactions`): 
```java
import chalk.client.ChalkClient;
import chalk.models.OnlineQueryParams;
import chalk.models.OnlineQueryResult;
import org.apache.arrow.vector.table.Table;
import org.apache.arrow.vector.table.Row;
import org.apache.arrow.vector.FieldVector;
import org.apache.arrow.vector.complex.reader.FieldReader;


public class Main {
    public static void main(String[] args) {
        try {
            ChalkClient client = ChalkClient.create();
        } catch (ChalkException e) {
            e.printStackTrace();
            return;
        }
        var userIds = new int[] {1, 2, 3};
        var params = OnlineQueryParams.builder()
                    .withInput("user.id", userIds)
                    .withOutputs("user.spending_mean_30d", "user.transactions")
                    .build();
        
        try (OnlineQueryResult result = client.onlineQuery(params)) {
            for (Row row : result.getScalarsTable()) {
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

### Codegen enhanced queries
For the best query experience, we recommend using the [codegen](https://docs.chalk.ai/cli/codegen) feature of Chalk CLI.
With codegen, you can
generate Java classes that are exactly equivalent to the features that you have defined in Python. For instance, given
these Python features and dataclasses:
```python
@features
class Transaction:
    id: Primary[str]
    user_id: int
    amount: float
    ts: datetime = feature_time()
    tags: List[str]
    user: User = has_one(lambda: User.id == Transaction.user_id)

@features
class Account:
    id: Primary[str]
    transactions: DataFrame[Transaction] = has_many(lambda: Transaction.account_id == Account.id)

@features
class User:
    id: Primary[str]
    
    account_id: str
    account: Account = has_one(lambda: Account.id == User.account_id)
    count_payments: Windowed[int] = windowed("1m", "5m")
    
@dataclasses.dataclass
class Address:
    street: str
    city: str
```
Chalk CLI will generate:
```java
// Transaction.java
public class Transaction extends FeaturesClass {
    public Feature<String> id;
    public Feature<Long> userId;
    public Feature<Double> amount;
    public Feature<java.time.LocalDateTime> ts;
    public Feature<List<String>> tags;
    
    public Feature<String> accountId;
    public Account account;
}

// Account.java
public class Account extends FeaturesClass {
    public Feature<String> id;
    public Feature<Double> balance;
    
    @HasMany(localKey = "id", foreignKey = "account_id")
    public Feature<List<Transaction>> transactions; 
}

// User.java
public class CardUser extends FeaturesClass {
    public Feature<String> id;
    public Feature<String> name;
    public Feature<String> accountId;
    public Account account;
    public _WindowedFeatures13 countPayments;
}

// Features.java. This is the root class that contains all features
// that can be used when specifying inputs.
public class Features {
    public static User user;

    private static Exception initException = Initializer.initFeatures(Features.class);

    public static Exception getInitException() {
        return Features.initException;
    }
}

// _WindowedFeatures13.java
public class _WindowedFeatures13 extends WindowedFeaturesClass {
    public Feature<Integer> window_1m;
    public Feature<Integer> window_5m;
}

// Address.java
public class Address extends StructFeaturesClass {
    public Feature<String> street;
    public Feature<String> city;
}
```
#### Type-checked queries
With these classes, we can now confidently write type-checked queries. 

```java
import com.example.my_project.codegen_output_folder.Features;

var userIds = new str[] {"user_1"};
var params = OnlineQueryParams.builder()
            .withInput(Features.card_user.id, userIds)
            .withOutputs(Features.card_user.id, Feature.card_user.name)  // Scalar features
            .withOutput(Features.card_user.account.balance)              // Has-one feature
            .withOutput(Features.card_user.account.transactions)         // Has-many feature
            .withOutput(Features.card_user.countPayments.window_5m)      // Windowed feature
            .withOutput(Features.card_user.address)                      // Struct-like feature
            .build();
```

Make sure to first check whether the feature classes in `Feature` has been initialized successfully:
```java
if (Features.getInitException() != null) {
    Features.getInitException().printStackTrace();
    return;
}
```

#### Object-oriented results
We can also unmarshal the result of a query from its Arrow representation into the generated classes.

```java
    try (OnlineQueryResult result = client.onlineQuery(params)) {
        CardUser[] users = result.unmarshal(CardUser.class);
        for (CardUser user : users) {
            String name = user.id.name.getValue();                              // Scalar features
            Double balance = user.account.balance.getValue();                   // Has-one feature
            List<Transaction> txns = user.account.transactions.getValue();      // Has-many feature
            Integer countPayments = user.countPayments.window_5m.getValue();    // Windowed feature
            String street = user.address.street.getValue();                     // Struct-like feature
        }
    } catch (ChalkException e) {
        e.printStackTrace();
    }
```
