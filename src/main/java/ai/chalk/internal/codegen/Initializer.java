package ai.chalk.internal.codegen;

import ai.chalk.features.*;
import ai.chalk.internal.FieldMeta;
import ai.chalk.internal.NamespaceMemoItem;
import ai.chalk.internal.Utils;

import javax.annotation.Nullable;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;

import static ai.chalk.internal.Utils.getResolvedName;

public class Initializer {
    public static Exception initFeatures(Class<?> cls) {
        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields) {
            if (!FeaturesBase.class.isAssignableFrom(field.getType())) {
                continue;
            }
            Map<Class<?>, NamespaceMemoItem> memo = new HashMap<>();
            try {
                Initializer.buildNamespaceMemo(field.getType(), memo, new HashSet<>());
            } catch (Exception e) {
                return e;
            }
            var namespace = Utils.chalkpySnakeCase(field.getType().getSimpleName());
            try {
                var featureClass = Initializer.init(field, namespace, null, new HashSet<>(), memo, true);
                field.set(cls, featureClass);
            } catch (Exception e) {
                return e;
            }
        }
        return null;
    }

    public static <T extends FeaturesBase> List<Field> getFeaturesClassFieldsInner(Class<T> cls) {
        List<Field> res = new ArrayList<>();
        res.addAll(Arrays.asList(cls.getDeclaredFields()));
        res.addAll(Arrays.asList(cls.getSuperclass().getDeclaredFields()));
        return res;
    }

    public static <T extends FeaturesBase> List<Field> getFeaturesClassFields(Class<T> cls) throws Exception {
        if (FeaturesClass.class.isAssignableFrom(cls)) {
            @SuppressWarnings("unchecked")
            var castCls = (Class<? extends FeaturesClass>) cls;
            return getFeaturesClassFieldsInner(castCls);
        } else if (StructFeaturesClass.class.isAssignableFrom(cls)) {
            @SuppressWarnings("unchecked")
            var castCls = (Class<? extends StructFeaturesClass>) cls;
            return getFeaturesClassFieldsInner(castCls);
        } else if (WindowedFeaturesClass.class.isAssignableFrom(cls)) {
            @SuppressWarnings("unchecked")
            var castCls = (Class<? extends WindowedFeaturesClass>) cls;
            return getFeaturesClassFieldsInner(castCls);
        } else {
            throw new Exception("Unknown FeaturesBase subclass found during call: " + cls.getSimpleName());
        }
    }

    public static Map<String, List<Feature<?>>> initResult(FeaturesBase fc, Map<Class<?>, NamespaceMemoItem> memo, String namespace) throws Exception {
        List<Field> fields = getFeaturesClassFields(fc.getClass());
        Map<String, List<Feature<?>>> featureMap = new java.util.HashMap<>();

        NamespaceMemoItem nsMemo = memo.get(fc.getClass());
        if (nsMemo == null) {
            throw new Exception(
                String.format(
                    "memo not found for namespace %s, found keys: %s",
                    fc.getClass().getSimpleName(),
                    memo.keySet()
                )
            );
        }

        for (Map.Entry<String, List<Integer>> entry : nsMemo.resolvedFieldNameToIndices.entrySet()) {
            String resolvedName = entry.getKey();
            List<Integer> indices = entry.getValue();
            for (int i : indices) {
                Field field = fields.get(i);
                String childFqn = namespace + "." + resolvedName;
                var feature = Initializer.init(
                    field,
                    childFqn,
                    featureMap,
                    new HashSet<>(),
                    memo,
                    nsMemo.fieldMetas.get(i).isFeaturesBase()
                );
                field.set(fc, feature);
            }
        }
        return featureMap;
    }

    public static Object init(
        Field f,
        String fqn,
        Map<String, List<Feature<?>>> featureMap,
        Set<Class<?>> seenClassesInChain,
        Map<Class<?>, NamespaceMemoItem> memo,
        @Nullable Boolean isFieldFeaturesBaseSubclass
    ) throws Exception {
        if (isFieldFeaturesBaseSubclass == null) {
            isFieldFeaturesBaseSubclass = FeaturesBase.class.isAssignableFrom(f.getType());
        }
        if (isFieldFeaturesBaseSubclass) {
            // RECURSIVE CASE
            @SuppressWarnings("unchecked")
            var castCls = (Class<? extends FeaturesBase>) f.getType();

            if (seenClassesInChain.contains(f.getType())) {
                // We simply stop initing
                return null;
            }
            seenClassesInChain.add(f.getType());

            NamespaceMemoItem memoItem = memo.get(castCls);
            if (memoItem == null) {
                throw new Exception(
                    String.format(
                        "memo not found for features class %s, found keys: %s",
                        castCls.getSimpleName(),
                        memo.keySet()
                    )
                );
            }

            FeaturesBase fc = (FeaturesBase) f.getType().getConstructor().newInstance();
            fc.setFqn(fqn);

            List<Field> fields = getFeaturesClassFields(castCls);
            for (Map.Entry<String, List<Integer>> entry : memoItem.resolvedFieldNameToIndices.entrySet()) {
                String resolvedName = entry.getKey();
                List<Integer> indices = entry.getValue();
                for (int i : indices) {
                    Field childField = fields.get(i);
                    String childFqn;
                    if (StructFeaturesClass.class.isAssignableFrom(f.getType()) && featureMap == null) {
                        // For input features, struct field FQNs end at the last actual feature in the chain.
                        // Only override the fqn for StructFeaturesClass children for initing features that are
                        // used to specify query inputs. For features that are used to store query outputs, we
                        // want a fake FQN (fake being struct fields should not have an FQN).
                        childFqn = fqn;
                    } else if (WindowedFeaturesClass.class.isAssignableFrom(f.getType())) {
                        // "user.average_transactions" + "__3600__"
                        childFqn = fqn+resolvedName;
                    } else {
                        childFqn = fqn + "." + resolvedName;
                    }
                    childField.set(
                        fc,
                        init(
                            childField,
                            childFqn,
                            featureMap,
                            seenClassesInChain,
                            memo,
                            memoItem.fieldMetas.get(i).isFeaturesBase()
                        )
                    );
                }
            }
            seenClassesInChain.remove(f.getType());
            return fc;
        } else if (f.getType() == Feature.class) {
            // BASE CASE
            Feature<?> feature = (Feature<?>) f.getType().getConstructor().newInstance();
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

    /*
     * Unlike init that branches out and initializes all fields, initScoped only initializes
     * the fields relevant to the specified FQN.
     */
    public static List<FieldSetter> initScoped(
        FeaturesClass cls,
        List<String> fqnParts,
        Map<Class<?>, NamespaceMemoItem> memo
    ) throws Exception {
        if (fqnParts.size() < 2) {
            throw new Exception(
                    String.format(
                            "FQN '%s' must have at least 2 parts, found %d",
                            String.join(".", fqnParts),
                            fqnParts.size()
                    )
            );
        }

        NamespaceMemoItem nsMemo = memo.get(cls.getClass());
        if (nsMemo == null) {
            throw new Exception(
                    String.format(
                            "memo not found for namespace '%s', found keys: %s",
                            cls.getClass().getSimpleName(),
                            memo.keySet()
                    )
            );
        }

        List<Integer> indices = nsMemo.resolvedFieldNameToIndices.get(fqnParts.get(1));
        if (indices == null) {
            throw new Exception(
                    String.format(
                            "FQN '%s' not found in namespace memo for '%s', got '%s' instead",
                            fqnParts.get(1),
                            cls.getClass().getSimpleName(),
                            nsMemo.resolvedFieldNameToIndices.keySet()
                    )
            );
        }

        List<FieldSetter> targetFields = new ArrayList<>();
        for (int i : indices) {
            List<FieldSetter> res = initScopedInner(
                    cls,
                    nsMemo.fieldMetas.get(i),
                    fqnParts.subList(1, fqnParts.size()),
                    memo
            );
            targetFields.addAll(res);
        }

        return targetFields;
    }

    public static List<FieldSetter> initScopedInner(
        Object parent,
        FieldMeta meta,
        List<String> fqnParts,
        Map<Class<?>, NamespaceMemoItem> memo
    ) throws Exception {
        if (fqnParts.size() == 1) {
            if (meta.isWindowed()) {
                WindowedFeaturesClass windowedObj = (WindowedFeaturesClass) meta.field().get(parent);
                if (windowedObj == null) {
                    windowedObj = (WindowedFeaturesClass) meta.field().getType().getConstructor().newInstance();
                    meta.field().set(parent, windowedObj);
                }
                var windowedMemo = memo.get(windowedObj.getClass());
                if (windowedMemo == null) {
                    throw new Exception(
                            String.format(
                                    "memo not found for windowed features class %s, found keys: %s",
                                    windowedObj.getClass().getSimpleName(),
                                    memo.keySet()
                            )
                    );
                }
                List<Integer> fieldIdxs = windowedMemo.resolvedFieldNameToIndices.get(fqnParts.get(0));
                if (fieldIdxs == null) {
                    throw new Exception(
                            String.format(
                                    "FQN '%s' not found in windowed features memo for '%s', got '%s' instead",
                                    fqnParts.get(0),
                                    windowedObj.getClass().getSimpleName(),
                                    windowedMemo.resolvedFieldNameToIndices.keySet()
                            )
                    );
                }
                List<FieldMeta> metas = new ArrayList<>();
                for (int idx : fieldIdxs) {
                    var windowedChildField = windowedMemo.fieldMetas.get(idx);
                    metas.add(windowedChildField);
                }
                return List.of(new FieldSetter(
                    windowedObj,
                    metas
                ));
            } else {
                return List.of(new FieldSetter(
                    parent,
                    List.of(meta)
                ));
            }
        }

        FeaturesBase fc = (FeaturesBase) meta.field().get(parent);
        if (fc == null) {
            fc = (FeaturesBase) meta.field().getType().getConstructor().newInstance();
            meta.field().set(parent, fc);
        }
        var nextMemo = memo.get(fc.getClass());
        if (nextMemo == null) {
            throw new Exception(
                    String.format(
                            "memo not found for features class %s, found keys: %s",
                            fc.getClass().getSimpleName(),
                            memo.keySet()
                    )
            );
        }

        List<Integer> indices = nextMemo.resolvedFieldNameToIndices.get(fqnParts.get(1));
        List<FieldSetter> targetFields = new ArrayList<>();
        for (int i : indices) {
            List<FieldSetter> res = initScopedInner(
                fc,
                nextMemo.fieldMetas.get(i),
                fqnParts.subList(1, fqnParts.size()),
                memo
            );
            targetFields.addAll(res);
        }

        return targetFields;
    }

    public static Class<?> getUnderlyingClass(Type typ) {
        if (typ instanceof ParameterizedType parametrizedTyp) {
            Type rawTyp = parametrizedTyp.getRawType();

            if (!(rawTyp instanceof Class<?> cls)) {
                return typ.getClass();
            }
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

    public static Class<?> unwrapFeatureType(Type typ) {
        if (typ instanceof ParameterizedType parametrizedTyp) {
            Type rawTyp = parametrizedTyp.getRawType();

            if (!(rawTyp instanceof Class<?> cls)) {
                return typ.getClass();
            }
            if (Feature.class.isAssignableFrom(cls)) {
                var args = parametrizedTyp.getActualTypeArguments();
                return unwrapFeatureType(args[0]);
            } else {
                return (Class<?>) ((ParameterizedType) typ).getRawType();
            }
        } else {
            if (typ instanceof Class) {
                return (Class<?>) typ;
            } else {
                return typ.getClass();
            }
        }
    }

    public static void alterMemoForUnmarshaller(Map<Class<?>, NamespaceMemoItem> memo) {
        for (Map.Entry<Class<?>, NamespaceMemoItem> entry : memo.entrySet()) {
            NamespaceMemoItem memoItem = entry.getValue();
            for (String resolvedName : memoItem.resolvedFieldNameToIndices.keySet().stream().toList()) {
                var indices = memoItem.resolvedFieldNameToIndices.get(resolvedName);
                for (int i : indices) {
                    FieldMeta meta = memoItem.fieldMetas.get(i);
                    if (meta.isWindowed()) {
                        var windowedMemo = memo.get(meta.field().getType());
                        for (String childFieldName : windowedMemo.resolvedFieldNameToIndices.keySet()) {
                            // Map windowed child fields to the base windowed field
                            // i.e. "average_txns__3600__" -> "average_txns"
                            var newKey = resolvedName + childFieldName;
                            if (!memoItem.resolvedFieldNameToIndices.containsKey(newKey)) {
                                memoItem.resolvedFieldNameToIndices.put(newKey, new ArrayList<>());
                            }
                            memoItem.resolvedFieldNameToIndices.get(newKey).add(i);
                        }

                        // Prepend base windowed feature name to windowed child fields
                        // i.e.
                        // {
                        //   "__3600__": [0],
                        //   "__2592000__": [1]
                        // }
                        // ->
                        // {
                        //   "average_txns__3600__": [0],
                        //   "average_txns__2592000__": [1]
                        // }
                        var prependedMap = new HashMap<String, List<Integer>>();
                        for (Map.Entry<String, List<Integer>> innerEntry : windowedMemo.resolvedFieldNameToIndices.entrySet()) {
                            prependedMap.put(resolvedName + innerEntry.getKey(), innerEntry.getValue());
                        }
                        windowedMemo.resolvedFieldNameToIndices = prependedMap;
                    }
                }
            }
        }
    }

    public static void buildNamespaceMemo(
            Class<?> cls,
            Map<Class<?>, NamespaceMemoItem> classMemo,
            Set<String> visitedNamespaces
    ) throws Exception {
        if (FeaturesBase.class.isAssignableFrom(cls)) {
            @SuppressWarnings("unchecked")
            List<Field> fields = getFeaturesClassFields((Class<FeaturesBase>) cls);

            String namespace = Utils.chalkpySnakeCase(cls.getSimpleName());
            if (visitedNamespaces.contains(namespace)) {
                return;
            }
            visitedNamespaces.add(namespace);

            var memoItem = new NamespaceMemoItem();
            for (int i = 0; i < fields.size(); i++) {
                var resolvedName = getResolvedName(fields.get(i));
                if (!memoItem.resolvedFieldNameToIndices.containsKey(resolvedName)) {
                    memoItem.resolvedFieldNameToIndices.put(resolvedName, new ArrayList<>());
                }
                memoItem.resolvedFieldNameToIndices.get(resolvedName).add(i);

                var fieldType = fields.get(i).getType();
                boolean isFeaturesBase = FeaturesBase.class.isAssignableFrom(fieldType);
                boolean isFeaturesClass = isFeaturesBase && FeaturesClass.class.isAssignableFrom(fieldType);
                boolean isStructFeaturesClass = isFeaturesBase && StructFeaturesClass.class.isAssignableFrom(fieldType);
                boolean isWindowedFeaturesClass = isFeaturesBase && WindowedFeaturesClass.class.isAssignableFrom(fieldType);
                boolean isFeature = Feature.class.isAssignableFrom(fieldType);

                // Must use `getGenericType` here to get a type that contains the underlying class
                var genericType = fields.get(i).getGenericType();
                Class<?> underlyingClass = getUnderlyingClass(genericType);

                @SuppressWarnings("unchecked")
                FieldMeta meta = new FieldMeta(
                    fields.get(i),
                    isFeaturesBase ? (Class<? extends FeaturesBase>) fieldType : null,
                    isFeaturesClass ? (Class<? extends FeaturesClass>) fieldType : null,
                    isStructFeaturesClass ? (Class<? extends StructFeaturesClass>) fieldType : null,
                    isWindowedFeaturesClass ? (Class<? extends WindowedFeaturesClass>) fieldType : null,
                    isFeature && List.class.isAssignableFrom(unwrapFeatureType(genericType)) ? underlyingClass : null,
                    isFeature
                );
                memoItem.fieldMetas.add(meta);

                buildNamespaceMemo(
                    underlyingClass,
                    classMemo,
                    visitedNamespaces
                );
            }
            classMemo.put(cls, memoItem);
        }
    };
}
