package chalk.internal.codegen;

import chalk.features.Feature;
import chalk.features.FeaturesClass;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

public class Initializer {
    private static Set<String> seen = new HashSet<>();

    public static Exception initRoot(Class<?> cls) {
        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields) {
            if (!FeaturesClass.class.isAssignableFrom(field.getType())) {
                continue;
            }
            try {
                Initializer.init(field, "", cls);
            } catch (Exception e) {
                return e;
            }
        }
        return null;
    }

    public static void init(Field f, String parentFqn, Object obj) throws Exception {
        String fqn = parentFqn;
        if (fqn.length() > 0) {
            fqn = fqn + "." + f.getName();
        } else {
            fqn = f.getName();
        }
        if (FeaturesClass.class.isAssignableFrom(f.getType())) {
            // RECURSIVE CASE
            FeaturesClass fc = (FeaturesClass) f.getType().getConstructor().newInstance();
            f.set(obj, fc);
            fc.setFqn(fqn);
            for (Field ff : f.getType().getFields()) {
                init(ff, fqn, fc);
            }
        } else if (f.getType() == Feature.class) {
            // BASE CASE
            Feature<?> feature = (Feature<?>) f.getType().getConstructor().newInstance();
            feature.setFqn(fqn);
            f.set(obj, feature);
        }
    }
}
