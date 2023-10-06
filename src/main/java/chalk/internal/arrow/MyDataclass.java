package chalk.internal.arrow;

import chalk.features.Feature;
import chalk.features.StructFeaturesClass;

import java.time.LocalDateTime;

public class MyDataclass extends StructFeaturesClass {
    public Feature<Long> niceNumber;
    public Feature<LocalDateTime> niceDatetime;
}
