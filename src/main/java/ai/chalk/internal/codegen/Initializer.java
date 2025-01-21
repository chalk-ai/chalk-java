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

        List<FieldMeta> fieldMetas = nsMemo.resolvedNameToFieldMetas.get(fqnParts.get(1));
        if (fieldMetas == null) {
            throw new Exception(
                    String.format(
                            "Field '%s' not found in namespace memo for '%s', got '%s' instead",
                            fqnParts.get(1),
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
            if (WindowedFeaturesClass.class.isAssignableFrom(meta.field().getType())) {
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
                List<FieldMeta> fieldMetas = windowedMemo.resolvedNameToFieldMetas.get(fqnParts.get(0));
                if (fieldMetas == null) {
                    throw new Exception(
                            String.format(
                                    "Field '%s' not found in windowed features memo for '%s', got '%s' instead",
                                    fqnParts.get(0),
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

        var fc = meta.field().get(parent);
        if (fc == null) {
            fc = meta.field().getType().getConstructor().newInstance();
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

        List<FieldMeta> metas = nextMemo.resolvedNameToFieldMetas.get(fqnParts.get(1));
        if (metas == null) {
            throw new Exception(
                    String.format(
                            "FQN '%s' not found in features memo for '%s', got keys '%s' instead",
                            fqnParts.get(1),
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
                fqnParts.subList(1, fqnParts.size()),
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
                FieldMeta meta = new FieldMeta(field, isList ? getUnderlyingClass(genericType) : null);

                var resolvedName = getResolvedName(field);
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
