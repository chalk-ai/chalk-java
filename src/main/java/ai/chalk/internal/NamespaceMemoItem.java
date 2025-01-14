package ai.chalk.internal;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NamespaceMemoItem {
    public Map<String, List<Integer>> resolvedFieldNameToIndices;
    public List<Boolean> isFieldFeaturesBaseSubclass;

    public NamespaceMemoItem() {
        resolvedFieldNameToIndices = new HashMap<>();
        isFieldFeaturesBaseSubclass = new ArrayList<>();
    }
}
