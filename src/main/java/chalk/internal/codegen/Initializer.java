package chalk.internal.codegen;

import chalk.features.Feature;
import chalk.features.FeaturesBase;
import chalk.features.FeaturesClass;
import chalk.features.StructFeaturesClass;
import chalk.internal.Utils;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Initializer {
    private static Set<String> seen = new HashSet<>();

    public static Exception initFeatures(Class<?> cls) {
        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields) {
            if (!FeaturesBase.class.isAssignableFrom(field.getType())) {
                continue;
            }
            var rootFeatureFqn = Utils.toSnakeCase(field.getType().getSimpleName());
            try {
                var featureClass = Initializer.init(field, rootFeatureFqn, null);
                field.set(cls, featureClass);
            } catch (Exception e) {
                return e;
            }
        }
        return null;
    }

    public static Map<String, Feature<?>> initResult(FeaturesClass fc) throws Exception {
        Field[] fields = fc.getClass().getDeclaredFields();
        Map<String, Feature<?>> featureMap = new java.util.HashMap<>();
        var rootFeatureFqn = Utils.toSnakeCase(fc.getClass().getSimpleName());
        for (Field field : fields) {
            var childFqn = rootFeatureFqn + "." + Utils.toSnakeCase(field.getName());
            var feature = Initializer.init(field, childFqn, featureMap);
            field.set(fc, feature);
        }
        return featureMap;
    }

    public static Object init(Field f, String fqn, Map<String, Feature<?>> featureMap) throws Exception {
        if (FeaturesBase.class.isAssignableFrom(f.getType())) {
            // RECURSIVE CASE
            FeaturesBase fc = (FeaturesBase) f.getType().getConstructor().newInstance();
            fc.setFqn(fqn);
            for (Field ff : f.getType().getFields()) {
                String snakeName = Utils.toSnakeCase(ff.getName());
                var childFqn = fqn + "." + snakeName;
                if (StructFeaturesClass.class.isAssignableFrom(f.getType())) {
                    childFqn = fqn;  // Struct feature classes' FQN end with the last actual feature in the chain.
                }
                var obj = init(ff, childFqn, featureMap);
                ff.set(fc, obj);
            }
            return fc;
        } else if (f.getType() == Feature.class) {
            // BASE CASE
            Feature<?> feature = (Feature<?>) f.getType().getConstructor().newInstance();
            feature.setFqn(fqn);
            if (featureMap != null) {
                featureMap.put(fqn, feature);
            }
            return feature;
        } else {
            throw new Exception("Unknown type found during call - expected `FeaturesClass` or `Feature`, found: " + f.getType());
        }
    }
}
