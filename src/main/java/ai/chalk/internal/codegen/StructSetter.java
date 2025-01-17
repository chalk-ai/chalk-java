package ai.chalk.internal.codegen;

import ai.chalk.features.Feature;
import ai.chalk.features.StructFeaturesClass;
import ai.chalk.internal.NamespaceMemoItem;
import io.netty.util.internal.SuppressJava6Requirement;

import java.util.Map;

public class StructSetter implements Setter {
    private final StructFeaturesClass struct;
    private final NamespaceMemoItem memo;
    public StructSetter(StructFeaturesClass struct, NamespaceMemoItem memo) {
        this.struct = struct;
        this.memo = memo;
    }

    public void set(Object value) throws Exception {
        @SuppressWarnings("unchecked")
        Map<String, Object> valueMap = (Map<String, Object>) value;
        for (Map.Entry<String, Object> entry : valueMap.entrySet()) {
            String fieldName = entry.getKey();
            var indices = memo.resolvedFieldNameToIndices.get(fieldName);
            for (int i : indices) {
                Feature<?> newFeature = new Feature<>();
                memo.fieldMetas.get(i).field().set(struct, newFeature);
                newFeature.setValue(entry.getValue());
            }
        }
    }
}
