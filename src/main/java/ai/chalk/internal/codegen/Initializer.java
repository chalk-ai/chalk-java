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
                var featureClass = Initializer.init(field, namespace, new HashSet<>(), memo);
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

    public static Object init(
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

            for (Map.Entry<String, List<FieldMeta>> entry : memoItem.resolvedNameToFieldMeta.entrySet()) {
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
                        init(
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

        List<FieldMeta> fieldMetas = nsMemo.resolvedNameToFieldMeta.get(fqnParts.get(1));
        if (fieldMetas == null) {
            throw new Exception(
                    String.format(
                            "FQN '%s' not found in namespace memo for '%s', got '%s' instead",
                            fqnParts.get(1),
                            cls.getClass().getSimpleName(),
                            nsMemo.resolvedNameToFieldMeta.keySet()
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
                List<FieldMeta> fieldMetas = windowedMemo.resolvedNameToFieldMeta.get(fqnParts.get(0));
                if (fieldMetas == null) {
                    throw new Exception(
                            String.format(
                                    "FQN '%s' not found in windowed features memo for '%s', got '%s' instead",
                                    fqnParts.get(0),
                                    windowedObj.getClass().getSimpleName(),
                                    windowedMemo.resolvedNameToFieldMeta.keySet()
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

        List<FieldMeta> metas = nextMemo.resolvedNameToFieldMeta.get(fqnParts.get(1));
        if (metas == null) {
            throw new Exception(
                    String.format(
                            "FQN '%s' not found in features memo for '%s', got keys '%s' instead",
                            fqnParts.get(1),
                            fc.getClass().getSimpleName(),
                            nextMemo.resolvedNameToFieldMeta.keySet()
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
            for (String resolvedName : memoItem.resolvedNameToFieldMeta.keySet().stream().toList()) {
                List<FieldMeta> fieldMetas = memoItem.resolvedNameToFieldMeta.get(resolvedName);
                for (FieldMeta meta : fieldMetas) {
                    if (meta.isWindowed()) {
                        var windowedMemo = memo.get(meta.field().getType());
                        for (String childFieldName : windowedMemo.resolvedNameToFieldMeta.keySet()) {
                            // Map windowed child fields to the base windowed field
                            // i.e. "average_txns__3600__" -> "average_txns"
                            var newKey = resolvedName + childFieldName;
                            if (!memoItem.resolvedNameToFieldMeta.containsKey(newKey)) {
                                memoItem.resolvedNameToFieldMeta.put(newKey, new ArrayList<>());
                            }
                            memoItem.resolvedNameToFieldMeta.get(newKey).add(meta);
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
                        var prependedMap = new HashMap<String, List<FieldMeta>>();
                        for (Map.Entry<String, List<FieldMeta>> innerEntry : windowedMemo.resolvedNameToFieldMeta.entrySet()) {
                            prependedMap.put(resolvedName + innerEntry.getKey(), innerEntry.getValue());
                        }
                        windowedMemo.resolvedNameToFieldMeta = prependedMap;
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

                var resolvedName = getResolvedName(fields.get(i));
                if (!memoItem.resolvedNameToFieldMeta.containsKey(resolvedName)) {
                    memoItem.resolvedNameToFieldMeta.put(resolvedName, new ArrayList<>());
                }
                memoItem.resolvedNameToFieldMeta.get(resolvedName).add(meta);

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
