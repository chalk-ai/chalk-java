# Chalk Java client

The official [Chalk](https://chalk.ai) client library for Java.

## Usage
### Requirements

- at least JDK 17

### Installation
The Java client is hosted on Maven Central.
#### Gradle
Add the following dependency block to your `build.gradle`.
```java
implementation 'ai.chalk:chalk-java:1.0.5-test'
```

#### Maven
Add the following dependency block to your `pom.xml`.
```xml
<dependencies>
    <dependency>
        <groupId>ai.chalk</groupId>
        <artifactId>chalk-java</artifactId>
        <version>1.0.5-test</version>
    </dependency>
</dependencies>
```

### Connect to Chalk

Create a client using the `ChalkClient.create()` method.  The returned client gets its configuration:

1. From environment variables
2. From a ~/.chalk.yml file if (1) is not available

```java
import ai.chalk.client.ChalkClient;


ChalkClient client = ChalkClient.create();
```

Alternatively, create a client using specific overrides. The overrides will take precedence over (1) and (2) above.
```java
import ai.chalk.client.ChalkClient;

        
ChalkClient client = ChalkClient.builder()
                    .withEnvironmentId("tmnma7wesandrsn")
                    .withClientId("kjhsfd43kjhfd8fdjk")
                    .withClientSecret("mnxcvuyqwmj7cnwe4mgfnuywe6jnas9sdn")
                    .build();
```

#### gRPC client
To use gRPC as the underlying protocol, simply use the `createGrpc()` method instead.
```java
ChalkClient client = ChalkClient.createGrpc();
```
Or if using the builder, call the `withGrpc()` method:

```java
ChalkClient client = ChalkClient.builder()
                    .withEnvironmentId("tmnma7wesandrsn")
                    .withGrpc()
                    .build();
```


## Memory management
Chalk uses Arrow objects during serialization of requests and deserialization of responses. These objects need to be
closed to free up memory. 

### Client level
If you're creating an instance of `ChalkClient` that persists throughout the lifetime of your application, you can
choose not to call the `close()` method. 

Otherwise, wrap the client in a try-with-resources block to ensure that the Arrow resources
are closed properly.
```java
try (ChalkClient client = ChalkClient.create()) {
    // Use the client
}
```

### Request level
When making a query, wrap it in a try-with-resources block, too.
```java
try (OnlineQueryResult result = client.onlineQuery(params)) {
    // Use the result
}
```


#### Debug client configuration

Use the method `ChalkClient.printConfig` to debug a connection or authentication issue. This method prints all config
variables and their sources to `stdout`. See the list of environment variables in `ai.chalk.client.ConfigEnvVars`.

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
### Getting started
If you're just getting started, here's an example query with minimal prerequisite setup steps:
```java
import ai.chalk.client.ChalkClient;
import ai.chalk.models.OnlineQueryParams;
import ai.chalk.models.OnlineQueryResult;
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
        var userIds = Arrays.asList(1, 2, 3);
        var params = OnlineQueryParams.builder()
                    .withInput("card_user.id", userIds)
                    .withOutputs("card_user.full_name")
                    .build();
        
        try (OnlineQueryResult result = client.onlineQuery(params)) {
            for (Row row : result.getScalarsTable()) {
                long userId = row.getInt64("card_user.id");
                double meanSpent = row.getFloat8("card_user.spending_mean_30d");
                System.out.println("User " + userId + " spent an average of $" + meanSpent + " per day in the last 30 days");
            }
        } catch (ChalkException e) {
            e.printStackTrace();
        }
    }
}
```
The same example, with codegen set up, would look like this:
```java
try {
    ChalkClient client = ChalkClient.create();
} catch (ChalkException e) {
    e.printStackTrace();
    return;
}
var userIds = Arrays.asList(1, 2, 3);
var params = OnlineQueryParams.builder()
            .withInput(Features.user.id, userIds)
            .withOutputs(Features.user.fullName)
            .build();

try (OnlineQueryResult result = client.onlineQuery(params)) {
    CardUser[] users = result.unmarshal(CardUser.class);
    for (CardUser user : users) {
        long userId = user.id.getValue();
        double meanSpent = user.spending_mean_30d.getValue();
        System.out.println("User " + userId + " spent an average of $" + meanSpent + " per day in the last 30 days");
    }
} catch (ChalkException e) {
    e.printStackTrace();
}
```

### Codegen enhanced queries
For the best query experience, we recommend using the [codegen](https://docs.chalk.ai/cli/codegen) feature of Chalk CLI.
With codegen, you can generate Java classes that are exactly equivalent to the features that you have defined in Python.
For instance, given these Python features and dataclasses:
```python
@features
class Transaction:
    id: Primary[str]
    user_id: str
    amount: float
    ts: datetime = feature_time()
    tags: List[str]
    user: User = has_one(lambda: User.id == Transaction.user_id)

@features
class Account:
    id: Primary[str]
    balance: float
    
@features
class User:
    id: Primary[str]
    
    account_id: str
    account: Account = has_one(lambda: Account.id == User.account_id)
    count_payments: Windowed[int] = windowed("1m", "5m")
    spending_mean_30d: float
    transactions: DataFrame[Transaction] = has_many(lambda: Transaction.user_id == User.id)
    
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
    public Feature<String> user_id;
    public Feature<Double> amount;
    public Feature<java.time.LocalDateTime> ts;
    public Feature<List<String>> tags;
    public CardUser user;
}

// Account.java
public class Account extends FeaturesClass {
    public Feature<String> id;
    public Feature<Double> balance;
}

// User.java
public class CardUser extends FeaturesClass {
    public Feature<String> id;
    public Feature<String> name;
    public Feature<String> account_id;
    public Account account;
    public _WindowedFeatures_1m_5m count_payments;
    public Feature<Double> spending_mean_30d;
    @HasMany(localKey = "id", foreignKey = "user_id")
    public Feature<List<Transaction>> transactions;
}

// Features.java. This is the root class that contains all features
// that can be used when specifying inputs.
public class Features {
    public static CardUser user;
    public static Account account;
    public static Transaction transaction;

    private static Exception initException = Initializer.initFeatures(Features.class);

    public static Exception getInitException() {
        return Features.initException;
    }
}

// _WindowedFeatures_1m_5m.java
public class _WindowedFeatures_1m_5m extends WindowedFeaturesClass {
    public Feature<Integer> bucket_1m;
    public Feature<Integer> bucket_5m;
}

// Address.java
public class Address extends StructFeaturesClass {
    public Feature<String> street;
    public Feature<String> city;
}
```
#### Type-checked queries
With these classes, we can now write type-checked queries. 

```java
import com.example.my_project.codegen_output_folder.Features;

var userIds = Arrays.asList("user_1");
var params = OnlineQueryParams.builder()
            .withInput(Features.user.id, userIds)
            .withOutputs(Features.user.id, Feature.card_user.name)  // Scalar features
            .withOutputs(Features.user.account.balance)             // Has-one feature
            .withOutputs(Features.user.transactions)                // Has-many feature
            .withOutputs(Features.user.count_payments.bucket_5m)    // Windowed feature
            .withOutputs(Features.user.address)                     // Struct-like feature
            .build();
```

Make sure to first check whether the feature classes in `Features` have been initialized successfully:
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
            List<Transaction> txns = user.transactions.getValue();              // Has-many feature
            Integer countPayments = user.count_payments.window_5m.getValue();   // Windowed feature
            String street = user.address.street.getValue();                     // Struct-like feature
        }
    } catch (ChalkException e) {
        e.printStackTrace();
    }
```

### Without codegen
Querying without codegen means accessing the underlying Arrow data structures directly. Here's an example querying
for both a scalar feature (`user.spending_mean_30d`) and a has-many feature (`user.transactions`):
```java
import ai.chalk.client.ChalkClient;
import ai.chalk.models.OnlineQueryParams;
import ai.chalk.models.OnlineQueryResult;
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
        var userIds = Arrays.asList(1, 2, 3);
        var params = OnlineQueryParams.builder()
                    .withInput("card_user.id", userIds)
                    .withOutputs("card_user.spending_mean_30d", "card_user.transactions")
                    .build();
        
        try (OnlineQueryResult result = client.onlineQuery(params)) {
            for (Row row : result.getScalarsTable()) {
                long userId = row.getVarCharObj("card_user.id");
                double meanSpent = row.getFloat8("card_user.spending_mean_30d");
                System.out.println(
                    "User " + userId + " spent an average of $" + meanSpent + " per day in the last 30 days"
                );
            }

            // Or get the values by first obtaining a FieldVector copy
            try (
                FieldVector idCol = result.getScalarsTable().getVectorCopy("card_user.id");
                FieldVector spendingCol = result.getScalarsTable().getVectorCopy("card_user.spending_mean_30d");
            ) {
                System.out.println(
                    "User " + idCol.getObject(0) + " spent an average of $" +
                    spendingCol.getObject(0) + " per day in the last 30 days"
                );
            }
                
            Table txnTable = result.getGroupsTables().get("card_user.transactions");
            try (FieldVector txnAmountVector = txnTable.getVectorCopy("transaction.amount")) {
                // Do something with the transaction amount vector
            };
            
            
        } catch (ChalkException e) {
            e.printStackTrace();
        }
    }
}
```
