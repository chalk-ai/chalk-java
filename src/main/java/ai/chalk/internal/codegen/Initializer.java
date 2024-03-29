package ai.chalk.internal.codegen;

import ai.chalk.features.Feature;
import ai.chalk.features.FeaturesBase;
import ai.chalk.features.StructFeaturesClass;
import ai.chalk.features.WindowedFeaturesClass;
import ai.chalk.features.*;
import ai.chalk.internal.Utils;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class Initializer {
    public static Exception initFeatures(Class<?> cls) {
        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields) {
            if (!FeaturesBase.class.isAssignableFrom(field.getType())) {
                continue;
            }
            var rootFeatureFqn = Utils.toSnakeCase(field.getType().getSimpleName());
            try {
                var featureClass = Initializer.init(field, rootFeatureFqn, null, new HashSet<>());
                field.set(cls, featureClass);
            } catch (Exception e) {
                return e;
            }
        }
        return null;
    }

    public static Map<String, Feature<?>> initResult(FeaturesBase fc) throws Exception {
        Field[] myFields = fc.getClass().getDeclaredFields();
        Field[] parentFields = fc.getClass().getSuperclass().getDeclaredFields();
        Field[] fields = Stream.concat(Arrays.stream(myFields), Arrays.stream(parentFields)).toArray(Field[]::new);

        Map<String, Feature<?>> featureMap = new java.util.HashMap<>();
        var rootFeatureFqn = Utils.toSnakeCase(fc.getClass().getSimpleName());
        for (Field field : fields) {
            var childFqn = rootFeatureFqn + "." + field.getName();
            var feature = Initializer.init(field, childFqn, featureMap, new HashSet<>());
            field.set(fc, feature);
        }
        return featureMap;
    }

    public static Object init(Field f, String fqn, Map<String, Feature<?>> featureMap, Set<Class<?>> seenClassesInChain) throws Exception {
        if (FeaturesBase.class.isAssignableFrom(f.getType())) {
            if (seenClassesInChain.contains(f.getType())) {
                // We simply stop initing
                return null;
            }
            seenClassesInChain.add(f.getType());
            // RECURSIVE CASE
            FeaturesBase fc = (FeaturesBase) f.getType().getConstructor().newInstance();
            fc.setFqn(fqn);
            for (Field ff : f.getType().getFields()) {
                var childFqn = fqn + "." + ff.getName();
                if (StructFeaturesClass.class.isAssignableFrom(f.getType()) && featureMap == null) {
                    // For input features, struct field FQNs end at the last actual feature in the chain.
                    // Only override the fqn for StructFeaturesClass children for initing features that are
                    // used to specify query inputs. For features that are used to store query outputs, we
                    // want a fake FQN (fake being struct fields should not have an FQN).
                    childFqn = fqn;
                } else if (WindowedFeaturesClass.class.isAssignableFrom(f.getType())) {
                    // Convert user.average_transactions.bucket_1h to user.average_transactions__3600s__
                    String lastPart = Utils.getDotDelimitedLastSection(childFqn);
                    String durationWithUnitStr = lastPart.substring("bucket_".length());
                    String convertedDurationStr = Utils.convertBucketDurationToSeconds(durationWithUnitStr);
                    String replacementPart = String.format("__%s__", convertedDurationStr);
                    String partToReplace = "." + lastPart;
                    childFqn = childFqn.replace(partToReplace, replacementPart);
                }
                var obj = init(ff, childFqn, featureMap, seenClassesInChain);
                ff.set(fc, obj);
            }
            seenClassesInChain.remove(f.getType());
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
