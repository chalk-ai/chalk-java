package ai.chalk.client;

public interface ChalkClient {
    static Builder builder() {
        return new BuilderImpl();
    }


}



