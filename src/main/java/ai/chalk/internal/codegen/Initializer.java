package ai.chalk.internal.codegen;

import ai.chalk.features.*;
import ai.chalk.internal.NamespaceMemoItem;
import ai.chalk.internal.Utils;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;
import java.util.stream.Stream;

public class Initializer {
    public static Exception initFeatures(Class<?> cls) {
        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields) {
            if (!FeaturesBase.class.isAssignableFrom(field.getType())) {
                continue;
            }
            var rootFeatureFqn = Utils.chalkpySnakeCase(field.getType().getSimpleName());
            try {
                var featureClass = Initializer.init(field, rootFeatureFqn, null, new HashSet<>());
                field.set(cls, featureClass);
            } catch (Exception e) {
                return e;
            }
        }
        return null;
    }

    public static <T extends FeaturesBase> Field[] getFeaturesClassFields(Class<T> cls) {
        Field[] myFields = cls.getDeclaredFields();
        Field[] parentFields = cls.getSuperclass().getDeclaredFields();
        return Stream.concat(Arrays.stream(myFields), Arrays.stream(parentFields)).toArray(Field[]::new);
    }

    public static Map<String, List<Feature<?>>> initResult(FeaturesBase fc) throws Exception {
        Field[] fields = getFeaturesClassFields((Class<FeaturesBase>) fc.getClass());
        Map<String, List<Feature<?>>> featureMap = new java.util.HashMap<>();
        var rootFeatureFqn = Utils.chalkpySnakeCase(fc.getClass().getSimpleName());
        for (Field field : fields) {
            var childFqn = rootFeatureFqn + "." + Utils.getResolvedName(field);
            var feature = Initializer.init(field, childFqn, featureMap, new HashSet<>());
            field.set(fc, feature);
        }
        return featureMap;
    }

    public static Object init(Field f, String fqn, Map<String, List<Feature<?>>> featureMap, Set<Class<?>> seenClassesInChain) throws Exception {
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
                var childFqn = fqn + "." + Utils.getResolvedName(ff);
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
            if (f.isAnnotationPresent(Versioned.class)) {
                Versioned versionInfo = f.getAnnotation(Versioned.class);
                if (versionInfo.defaultVersion() == 0) {
                    // Is not base version feature, so we need to strip the `_vN` suffix by splitting on '_'
                    String[] parts = fqn.split("_");
                    // Parse the digits from the last part of the FQN, which looks something like `v1`
                    String versionStr = parts[parts.length - 1].substring(1);
                    String baseFqn = String.join("_", Arrays.copyOf(parts, parts.length - 1));
                    if (versionStr.equals("1")) {
                        // If the version is 1, we don't need to append it to the FQN
                        fqn = baseFqn;
                    } else {
                        fqn = baseFqn + "@" + versionStr;
                    }
                } else if (versionInfo.defaultVersion() > 1) {
                    // Is base version feature, so we need to append the default version to the FQN
                    fqn += "@" + versionInfo.defaultVersion();
                }
            }
            feature.setFqn(fqn);
            if (featureMap != null) {
                if (featureMap.containsKey(fqn)) {
                    // Only versioned features should have multiple features with the same FQN
                    // i.e. `Features.user.versioned_feature` and `Features.user.versioned_feature_v2`
                    //       have the same FQN `user.versioned_feature@2` if the default version is 2.
                    featureMap.get(fqn).add(feature);
                } else {
                    featureMap.put(fqn, new ArrayList<>(List.of(feature)));
                }
            }
            return feature;
        } else {
            throw new Exception("Unknown type found during call - expected `FeaturesClass` or `Feature`, found: " + f.getType());
        }
    }

    public static Class<?> getUnderlyingClass(Type typ) {
        if (typ instanceof ParameterizedType) {
            var parametrizedTyp = (ParameterizedType) typ;
            Type rawTyp = parametrizedTyp.getRawType();

            if (!(rawTyp instanceof Class)) {
                return typ.getClass();
            }
            var cls = (Class<?>) rawTyp;
            if (Feature.class.isAssignableFrom(cls)) {
                var args = parametrizedTyp.getActualTypeArguments();
                return getUnderlyingClass(args[0]);
            } else if (List.class.isAssignableFrom(cls)) {
                var args = parametrizedTyp.getActualTypeArguments();
                return getUnderlyingClass(args[0]);
            } else {
                return typ.getClass();
            }
        } else {
            if (typ instanceof Class) {
                return (Class<?>) typ;
            } else {
                return typ.getClass();
            }

        }
    }

    public static void buildNamespaceMemo(
        Class<?> cls,
        Map<String, NamespaceMemoItem> memo,
        Set<String> visitedNamespaces
    ) throws Exception {
        if (FeaturesClass.class.isAssignableFrom(cls)) {
            @SuppressWarnings("unchecked")
            var castCls = (Class<? extends FeaturesClass>) cls;
            String namespace = Utils.chalkpySnakeCase(cls.getSimpleName());
            if (visitedNamespaces.contains(namespace)) {
                return;
            }
            visitedNamespaces.add(namespace);
            var memoItem = new NamespaceMemoItem();
            Field[] fields = getFeaturesClassFields(castCls);
            for (int i = 0; i < fields.length; i++) {
                var resolvedName = Utils.getResolvedName(fields[i]);
                if (!memoItem.resolvedFieldNameToIndices.containsKey(resolvedName)) {
                    memoItem.resolvedFieldNameToIndices.put(resolvedName, new ArrayList<>());
                }
                memoItem.resolvedFieldNameToIndices.get(resolvedName).add(i);

                var fqn = namespace + "." + resolvedName;
                if (!memoItem.resolvedFieldNameToIndices.containsKey(fqn)) {
                    memoItem.resolvedFieldNameToIndices.put(fqn, new ArrayList<>());
                }
                memoItem.resolvedFieldNameToIndices.get(fqn).add(i);

                buildNamespaceMemo(getUnderlyingClass(fields[i].getGenericType()), memo, visitedNamespaces);
            }
            memo.put(namespace, memoItem);
        }
    };
}
