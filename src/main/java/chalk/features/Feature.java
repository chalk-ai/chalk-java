package chalk.features;


import lombok.Data;

@Data
public class Feature<T> {
    private String fqn;
    private T value;

    public Feature() {
    }

    public Feature(String fqn, T value) {
        this.fqn = fqn;
        this.value = value;
    }

    public void setFqn(String fqn) {
        this.fqn = fqn;
    }

    public void setValue(Object value) {
        this.value = (T) value;
    }
}
