package ai.chalk.internal.codegen;

import ai.chalk.features.*;
import ai.chalk.internal.FieldMeta;
import ai.chalk.internal.NamespaceMemoItem;
import ai.chalk.internal.Utils;

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
                var featureClass = Initializer.initAll(field, namespace, new HashSet<>(), memo);
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


    /*
     * `initAll` initializes all `Feature` fields of a `FeaturesClass`
     * so that they are ready to be used when specifying inputs to
     * a query.
     */
    public static Object initAll(
        Field f,
        String fqn,
        Set<Class<?>> seenClassesInChain,
        Map<Class<?>, NamespaceMemoItem> memo
    ) throws Exception {
        if (FeaturesBase.class.isAssignableFrom(f.getType())) {
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

            for (Map.Entry<String, List<FieldMeta>> entry : memoItem.resolvedNameToFieldMetas.entrySet()) {
                String resolvedName = entry.getKey();
                for (FieldMeta meta : entry.getValue()) {
                    Field childField = meta.field();
                    String childFqn;
                    if (StructFeaturesClass.class.isAssignableFrom(f.getType())) {
                        // Fields of StructFeaturesClass are not real features.
                        // The StructFeaturesClass itself is a real feature.
                        // So we set the FQN of the child to the parent FQN.
                        childFqn = fqn;
                    } else if (WindowedFeaturesClass.class.isAssignableFrom(f.getType())) {
                        // "user.average_transactions" + "__3600__"
                        childFqn = fqn+resolvedName;
                    } else {
                        childFqn = fqn + "." + resolvedName;
                    }
                    childField.set(
                        fc,
                        initAll(
                            childField,
                            childFqn,
                            seenClassesInChain,
                            memo
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
            return feature;
        } else {
            throw new Exception("Unknown type found during call - expected `FeaturesClass` or `Feature`, found: " + f.getType());
        }
    }

    /*
     * Unlike `initAll` that branches out and initializes all fields, `initScoped` only initializes
     * the fields relevant to the specified FQN.
     */
    public static List<FieldSetter> initScoped(
        FeaturesClass cls,
        String rootNamespace,
        List<String> fieldNames,
        Map<Class<?>, NamespaceMemoItem> memo
    ) throws Exception {
        if (fieldNames.size() < 1) {
            throw new Exception(
                "internal error - there should be at least 1 field name in the chain of field names"
            );
        }

        NamespaceMemoItem nsMemo = memo.get(cls.getClass());
        if (nsMemo == null) {
            throw new Exception(
                    String.format(
                            "internal error- memo not found for namespace '%s', found keys: %s instead. This could " +
                            "also happen if the codegen'd classes are edited.",
                            cls.getClass().getSimpleName(),
                            memo.keySet()
                    )
            );
        }

        var nextFieldName = fieldNames.get(0);
        List<FieldMeta> fieldMetas = nsMemo.resolvedNameToFieldMetas.get(nextFieldName);
        if (fieldMetas == null) {
            throw new Exception(
                    String.format(
                            "internal error - Field '%s' not found in namespace memo for '%s', got '%s' instead. " +
                            "This could also happen if the codegen'd classes are edited.",
                            nextFieldName,
                            cls.getClass().getSimpleName(),
                            nsMemo.resolvedNameToFieldMetas.keySet()
                    )
            );
        }

        List<FieldSetter> targetFields = new ArrayList<>();
        for (FieldMeta meta: fieldMetas) {
            List<FieldSetter> res = initScopedInner(
                    cls,
                    meta,
                    rootNamespace,
                    fieldNames,
                    0,
                    memo
            );
            targetFields.addAll(res);
        }

        return targetFields;
    }

    public static List<FieldSetter> initScopedInner(
        Object parent,
        FieldMeta meta,
        String rootNamespace,
        List<String> fieldNames,
        int fieldNamesIdx,
        Map<Class<?>, NamespaceMemoItem> memo
    ) throws Exception {
        var fieldType = meta.field().getType();
        if (fieldNamesIdx == fieldNames.size() - 1) {
            // When the last field is a scalar feature with FQN "user.account.address.street_number":
            //       `parent`: `Address` instance
            //       `meta`: `FieldMeta` instance for `street_number`, where `meta.field()` corresponds
            //               to the `street_number` field on `Address`
            //       `fieldNames`: ["account", "address", "street_number"]
            //       `fieldNamesIdx`: 2
            //
            // When last field is a windowed child pseudofeature with FQN "user.avg_txn__3600__":
            //      `parent`: `User` instance
            //      `meta`: `FieldMeta` instance for the `User.avg_txn` field which is a subclass
            //              `WindowedFeaturesClass`.
            //      `fieldNames`: ["average_txn__3600__"]
            //      `fieldNamesIdx`: 0
            //
            if (WindowedFeaturesClass.class.isAssignableFrom(fieldType)) {
                var windowedMemo = memo.get(fieldType);
                if (windowedMemo == null) {
                    throw new Exception(
                            String.format(
                                    "internal error - memo not found for windowed features class %s, found keys: %s." +
                                            " This could also happen if the codegen'd classes are edited",
                                    fieldType.getSimpleName(),
                                    memo.keySet()
                            )
                    );
                }

                WindowedFeaturesClass windowedObj = (WindowedFeaturesClass) meta.field().get(parent);
                if (windowedObj == null) {
                    windowedObj = (WindowedFeaturesClass) meta.field().getType().getConstructor().newInstance();
                    meta.field().set(parent, windowedObj);
                    String baseWindowedFeatureFqn = rootNamespace + ".";
                    if (fieldNames.size() > 1) {
                        // Remote windowed feature
                        baseWindowedFeatureFqn += String.join(
                                ".", fieldNames.subList(0, fieldNames.size())
                        );
                    }
                    baseWindowedFeatureFqn += meta.resolvedName();
                    windowedObj.setFqn(baseWindowedFeatureFqn);
                }

                // This would be one of the buckets in the windowed feature
                // e.g. windowChildFieldName here would be "average_txn__3600__"
                var windowChildFieldName = fieldNames.get(fieldNamesIdx);
                List<FieldMeta> fieldMetas = windowedMemo.resolvedNameToFieldMetas.get(windowChildFieldName);
                if (fieldMetas == null) {
                    throw new Exception(
                            String.format(
                                    "internal error - field '%s' not found in windowed features memo for '%s', got '%s' " +
                                    "instead. This could also happen if the codegen'd classes are edited.",
                                    fieldNames.get(fieldNamesIdx),
                                    windowedObj.getClass().getSimpleName(),
                                    windowedMemo.resolvedNameToFieldMetas.keySet()
                            )
                    );
                }
                return List.of(new FieldSetter(
                    windowedObj,
                    fieldMetas
                ));
            } else {
                return List.of(new FieldSetter(
                    parent,
                    List.of(meta)
                ));
            }
        }

        var nextMemo = memo.get(fieldType);
        if (nextMemo == null) {
            throw new Exception(
                    String.format(
                            "internal error - memo not found for features class %s, found keys: %s. This could also " +
                                    "happen if the codegen'd classes are edited",
                            fieldType.getSimpleName(),
                            memo.keySet()
                    )
            );
        }

        var fc = meta.field().get(parent);
        if (fc == null) {
            fc = meta.field().getType().getConstructor().newInstance();
            meta.field().set(parent, fc);
            // unchecked cast because we know that `fc` is a `FeaturesBase` instance,
            // since it exists in the memo
            ((FeaturesBase) fc).setFqn(
                    rootNamespace + "." + String.join(".", fieldNames.subList(0, fieldNamesIdx + 1))
            );
        }

        var nextFieldIdx = fieldNamesIdx + 1;
        var nextFieldName = fieldNames.get(nextFieldIdx);
        List<FieldMeta> metas = nextMemo.resolvedNameToFieldMetas.get(nextFieldName);
        if (metas == null) {
            throw new Exception(
                    String.format(
                            "internal error - Field '%s' not found in memo for '%s', got keys '%s' instead. This could"+
                            " also happen if the codegen'd classes are edited.",
                            nextFieldName,
                            fc.getClass().getSimpleName(),
                            nextMemo.resolvedNameToFieldMetas.keySet()
                    )
            );
        }
        List<FieldSetter> targetFields = new ArrayList<>();
        for (FieldMeta nextMeta : metas) {
            List<FieldSetter> res = initScopedInner(
                fc,
                nextMeta,
                rootNamespace,
                fieldNames,
                nextFieldIdx,
                memo
            );
            targetFields.addAll(res);
        }

        return targetFields;
    }


    /*
     * Unwraps
     *     - `Feature<List<T>>` to `T`
     *     - `Feature<T>` to `T`
     *     - `List<T>` to `T`
     */
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


    /*
     * Unwraps `Feature<List<T>>` to `List<T>`.
     */
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


    /*
     * When unmarshalling, we want the memo to readily contain the most helpful information
     * for unmarshalling. Since `WindowedFeaturesClass` child fields are not hiearchically
     * structured the same way as actual windowed child features returned from Chalk,
     * we alter memo to mimic that original structure for straightforward unmarshalling.
     */
    public static void alterMemoForUnmarshaller(Map<Class<?>, NamespaceMemoItem> memo) throws Exception {
        for (Map.Entry<Class<?>, NamespaceMemoItem> entry : memo.entrySet()) {
            NamespaceMemoItem memoItem = entry.getValue();
            // Copying the keyset because we are editing the map in-place.
            var keySet = memoItem.resolvedNameToFieldMetas.keySet().toArray(new String[0]);
            for (String resolvedName : keySet) {
                List<FieldMeta> fieldMetas = memoItem.resolvedNameToFieldMetas.get(resolvedName);
                for (FieldMeta meta : fieldMetas) {
                    if (WindowedFeaturesClass.class.isAssignableFrom(meta.field().getType())) {
                        var windowedMemo = memo.get(meta.field().getType());
                        for (String childFieldName : windowedMemo.resolvedNameToFieldMetas.keySet()) {
                            // Map windowed child fields to the base windowed field
                            // i.e. "average_txns__3600__" -> "average_txns"
                            var newKey = resolvedName + childFieldName;
                            if (!memoItem.resolvedNameToFieldMetas.containsKey(newKey)) {
                                memoItem.resolvedNameToFieldMetas.put(newKey, new ArrayList<>());
                            }
                            memoItem.resolvedNameToFieldMetas.get(newKey).add(meta);
                        }

                        // Prepend base windowed feature name to windowed child fields
                        // i.e.
                        // {
                        //   "__3600__": [field-meta-0],
                        //   "__2592000__": [field-meta-1]
                        // }
                        // ->
                        // {
                        //   // Multiple distinct feature classes can use the same WindowedFeaturesClass
                        //   "average_txns__3600__": [field-meta-0],
                        //   "average_txns__2592000__": [field-meta-1],
                        //   "some_other_feature_from_another_class__3600__": [field-meta-0],
                        //   "some_other_feature_from_another_class__2592000__": [field-meta-1]
                        // }
                        var oldMap = windowedMemo.resolvedNameToFieldMetas;
                        var newMap = new HashMap<>(windowedMemo.resolvedNameToFieldMetas);
                        for (Map.Entry<String, List<FieldMeta>> innerEntry : oldMap.entrySet()) {
                            var prependedName = resolvedName + innerEntry.getKey();
                            if (newMap.containsKey(prependedName)) {
                                throw new Exception(
                                    String.format(
                                        "Prepended name '%s' already exists in memo, this means multiple distinct " +
                                        "feature classes have the same name for a windowed feature with the same " +
                                        "WindowedFeaturesClass type. This has yet to be supported in the unmarshaller.",
                                        prependedName
                                    )
                                );
                            }
                            newMap.put(prependedName, innerEntry.getValue());
                        }
                        windowedMemo.resolvedNameToFieldMetas = newMap;
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
            for (Field field : fields) {
                var fieldType = field.getType();
                // Must use `getGenericType` here to get a type that contains the underlying class
                var genericType = field.getGenericType();
                boolean isList = (
                        Feature.class.isAssignableFrom(fieldType) &&
                        List.class.isAssignableFrom(unwrapFeatureType(genericType))
                );
                var resolvedName = getResolvedName(field);
                FieldMeta meta = new FieldMeta(field, isList ? getUnderlyingClass(genericType) : null, resolvedName);

                if (!memoItem.resolvedNameToFieldMetas.containsKey(resolvedName)) {
                    memoItem.resolvedNameToFieldMetas.put(resolvedName, new ArrayList<>());
                }
                memoItem.resolvedNameToFieldMetas.get(resolvedName).add(meta);

                buildNamespaceMemo(
                        meta.isList() ? meta.listUnderlyingClass() : fieldType,
                        classMemo,
                        visitedNamespaces
                );
            }
            classMemo.put(cls, memoItem);
        }
    };
}
