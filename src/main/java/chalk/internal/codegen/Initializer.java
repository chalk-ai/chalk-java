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
            try {
                var featureClass = Initializer.init(field, "", null, null);
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
        for (Field field : fields) {
            var feature = Initializer.init(field, Utils.toSnakeCase(fc.getClass().getSimpleName()),null, featureMap);
            field.set(fc, feature);
        }
        return featureMap;
    }

    public static Object init(Field f, String parentFqn, String fqnOverride, Map<String, Feature<?>> featureMap) throws Exception {
        String fqn = parentFqn;
        String snakeName = Utils.toSnakeCase(f.getName());
        if (fqn.length() > 0) {
            fqn = fqn + "." + snakeName;
        } else {
            fqn = snakeName;
        }
        if (fqnOverride != null) {
            fqn = fqnOverride;
        }
        if (FeaturesBase.class.isAssignableFrom(f.getType())) {
            // RECURSIVE CASE
            FeaturesBase fc = (FeaturesBase) f.getType().getConstructor().newInstance();
            fc.setFqn(fqn);
            for (Field ff : f.getType().getFields()) {
                if (StructFeaturesClass.class.isAssignableFrom(f.getType())) {
                    fqnOverride = fqn;
                }
                var obj = init(ff, fqn, fqnOverride, featureMap);
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
