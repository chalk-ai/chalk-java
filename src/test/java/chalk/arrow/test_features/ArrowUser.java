package chalk.arrow.test_features;

import chalk.features.Feature;
import chalk.features.FeaturesClass;
import org.apache.arrow.vector.table.Table;

import java.util.List;

public class ArrowUser extends FeaturesClass {
    // Create one field for every possible data type
    public Feature<String> id;
    public Feature<String> favoriteUtf8;
    public Feature<String> favoriteLargeUtf8;
    public Feature<Byte> favoriteByte;
    public Feature<Short> favoriteShort;
    public Feature<Integer> favoriteInteger;
    public Feature<Long> favoriteBigInteger;
    public Feature<Double> favoriteFloat8;
    public Feature<Float> favoriteFloat4;
    public Feature<Boolean> favoriteBoolean;
    public Feature<java.time.LocalDate> favoriteDateMilli;
    public Feature<java.time.LocalDate> favoriteDateDay;
    public Feature<java.time.LocalDateTime> favoriteTimestampSec;
    public Feature<java.time.ZonedDateTime> favoriteTimestampSecTz;
    public Feature<java.time.LocalDateTime> favoriteTimestampMilli;
    public Feature<java.time.ZonedDateTime> favoriteTimestampMilliTz;
    public Feature<java.time.LocalDateTime> favoriteTimestampMicro;
    public Feature<java.time.ZonedDateTime> favoriteTimestampMicroTz;
    public Feature<java.time.LocalDateTime> favoriteTimestampNano;
    public Feature<java.time.ZonedDateTime> favoriteTimestampNanoTz;
    public Feature<java.time.LocalTime> favoriteTimeSec;
    public Feature<java.time.LocalTime> favoriteTimeMilli;
    public Feature<java.time.LocalTime> favoriteTimeMicro;
    public Feature<java.time.LocalTime> favoriteTimeNano;
    public Feature<java.time.Duration> favoriteDurationSec;
    public Feature<java.time.Duration> favoriteDurationMilli;
    public Feature<java.time.Duration> favoriteDurationMicro;
    public Feature<java.time.Duration> favoriteDurationNano;
    public VanillaDataclass favoriteStruct;
    public Feature<List<VanillaDataclass>> favoriteStructList;
    public DataclassWithComplexFeatures favoriteStructComplex;
    public Feature<String> favoriteHasOneId;
    public MyTail favoriteHasOne;
    public Feature<String> leastFavoriteHasOneId;
    public MyTail leastFavoriteHasOne;
    public Feature<Table> favoriteHasMany;
    public Feature<List<String>> favoriteStrings;

    // TODO: Add support for Decimal
    //    public Feature<BigDecimal> favoriteDecimal;
}
