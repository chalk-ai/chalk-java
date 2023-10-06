package chalk.features;


public class FeaturesClass extends FeaturesBase {
    // joinKey would be a non-root FQN. For example,
    // the has-one relationship `User` <> `Account`
    // could be joined on either "user.account_id"
    // or "account.user_id". It should never be
    // an FQN with nesting,
    // i.e. "user.bank.account.bank_id"
    public String joinKey;

    public FeaturesClass(String joinKey) {
        this.joinKey = joinKey;
    }

    public FeaturesClass() {

    }

    public String getJoinKey() {
        return joinKey;
    }
}
