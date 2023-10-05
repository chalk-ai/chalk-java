package chalk.arrow.test_features;

import chalk.features.Feature;
import chalk.features.FeaturesClass;
import org.apache.arrow.vector.table.Table;

import java.util.List;

public class ArrowUser extends FeaturesClass {
    // Create one field for every possible data type
    public Feature<String> id;
    public Feature<String> favoriteString;
    public Feature<String> favoriteLargeString;
    public Feature<Byte> favoriteByte;
    public Feature<Short> favoriteShort;
    public Feature<Integer> favoriteInteger;
    public Feature<Long> favoriteBigInteger;
    public Feature<Double> favoriteDouble;
    public Feature<Float> favoriteFloat;
    public Feature<Boolean> favoriteBool;
    public Feature<java.time.LocalDate> favoriteDateMilli;
    public Feature<java.time.LocalDate> favoriteDateSec;
    public Feature<java.time.LocalDateTime> favoriteTimestampSec;
    public Feature<java.time.ZonedDateTime> favoriteTimestampSecTZ;
    public Feature<java.time.LocalDateTime> favoriteTimestampMilli;
    public Feature<java.time.ZonedDateTime> favoriteTimestampMilliTZ;
    public Feature<java.time.LocalDateTime> favoriteTimestampMicro;
    public Feature<java.time.ZonedDateTime> favoriteTimestampMicroTZ;
    public Feature<java.time.LocalDateTime> favoriteTimestampNano;
    public Feature<java.time.ZonedDateTime> favoriteTimestampNanoTZ;
    public Feature<java.time.LocalTime> favoriteLocalTime;
    public Feature<java.time.Duration> favoriteDuration;
    public Feature<Double> favoriteDecimal;
    public Feature<List<String>> favoriteStrings;
    public VanillaDataclass favoriteStruct;
    public Feature<List<VanillaDataclass>> favoriteStructList;
    public DataclassWithComplexFeatures favoriteStructComplex;
    public Feature<String> favoriteHasOneId;
    public MyTail favoriteHasOne;
    public Feature<String> leastFavoriteHasOneId;
    public MyTail leastFavoriteHasOne;
    public Feature<Table> favoriteHasMany;
}
