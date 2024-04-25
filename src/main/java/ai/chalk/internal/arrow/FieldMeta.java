package ai.chalk.internal.arrow;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.arrow.vector.types.pojo.ArrowType;

import java.util.List;


@AllArgsConstructor
@Data
public class FieldMeta {
    public String fqn;
    public List<Object> values;
    public ArrowType type;
}
