package ai.chalk.internal;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NamespaceMemoItem {
    public Map<String, List<FieldMeta>> resolvedNameToFieldMeta;
    public NamespaceMemoItem() {
        resolvedNameToFieldMeta = new HashMap<>();
    }
}
