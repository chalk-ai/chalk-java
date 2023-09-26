package chalk.features;


import lombok.Data;

@Data
public class Feature<T> {
    private String fqn;
    private T value;
}
