package chalk.internal.arrow;

import chalk.features.Feature;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class TypeGetter {
    public static Class<?> getListFeatureInnerType(Class<?> clazz, String fieldName) throws Exception {
        for (Field field : clazz.getDeclaredFields()) {
            if (field.getType() == Feature.class && field.getName().equals(fieldName)) {
                Type genericType = field.getGenericType();

                if (genericType instanceof ParameterizedType) {
                    ParameterizedType paramType = (ParameterizedType) genericType;
                    Type[] typeArgs = paramType.getActualTypeArguments();
                    for (Type arg : typeArgs) {
                        if (arg instanceof ParameterizedType) {
                            ParameterizedType innerParamType = (ParameterizedType) arg;
                            Type[] innerTypeArgs = innerParamType.getActualTypeArguments();
                            for (Type innerArg : innerTypeArgs) {
                                if (innerArg instanceof Class<?>) {
                                    return (Class<?>) innerArg;
                                }
                            }
                        }
                    }
                }
                throw new Exception("Expected field '" + fieldName + "' to be a list of dataclasses, but found '" + genericType.getTypeName() + "' instead");
            }
        }
        throw new IllegalArgumentException("Field " + fieldName + " does not exist in class " + clazz.getName());
    }
}