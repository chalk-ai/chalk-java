package ai.chalk.arrow.test_features;

import ai.chalk.features.Feature;
import ai.chalk.features.FeaturesClass;
import ai.chalk.features.HasMany;

import java.util.List;

public class ArrowUser extends FeaturesClass {
    public Feature<String> id;
    public Feature<String> favoriteUtf8;
    public Feature<String> favoriteUtf8Nullable;
    public Feature<String> favoriteLargeUtf8;
    public Feature<String> favoriteLargeUtf8Nullable;
    public Feature<Byte> favoriteTinyInt;
    public Feature<Byte> favoriteTinyIntNullable;
    public Feature<Short> favoriteSmallInt;
    public Feature<Short> favoriteSmallIntNullable;
    public Feature<Integer> favoriteInt;
    public Feature<Integer> favoriteIntNullable;
    public Feature<Long> favoriteBigInt;
    public Feature<Long> favoriteBigIntNullable;
    public Feature<Double> favoriteFloat8;
    public Feature<Double> favoriteFloat8Nullable;
    public Feature<Float> favoriteFloat4;
    public Feature<Float> favoriteFloat4Nullable;
    public Feature<Boolean> favoriteBoolean;
    public Feature<Boolean> favoriteBooleanNullable;
    public Feature<java.time.LocalDate> favoriteDateMilli;
    public Feature<java.time.LocalDate> favoriteDateMilliNullable;
    public Feature<java.time.LocalDate> favoriteDateDay;
    public Feature<java.time.LocalDate> favoriteDateDayNullable;
    public Feature<java.time.LocalDateTime> favoriteTimestampSec;
    public Feature<java.time.LocalDateTime> favoriteTimestampSecNullable;
    public Feature<java.time.ZonedDateTime> favoriteTimestampSecTz;
    public Feature<java.time.ZonedDateTime> favoriteTimestampSecTzNullable;
    public Feature<java.time.LocalDateTime> favoriteTimestampMilli;
    // nullable
    public Feature<java.time.LocalDateTime> favoriteTimestampMilliNullable;
    public Feature<java.time.ZonedDateTime> favoriteTimestampMilliTz;
    public Feature<java.time.ZonedDateTime> favoriteTimestampMilliTzNullable;
    public Feature<java.time.LocalDateTime> favoriteTimestampMicro;
    // nullable
    public Feature<java.time.LocalDateTime> favoriteTimestampMicroNullable;

    public Feature<java.time.ZonedDateTime> favoriteTimestampMicroTz;
    public Feature<java.time.ZonedDateTime> favoriteTimestampMicroTzNullable;
    public Feature<java.time.LocalDateTime> favoriteTimestampNano;
    public Feature<java.time.LocalDateTime> favoriteTimestampNanoNullable;
    public Feature<java.time.ZonedDateTime> favoriteTimestampNanoTz;
    public Feature<java.time.ZonedDateTime> favoriteTimestampNanoTzNullable;
    public Feature<java.time.LocalTime> favoriteTimeSec;
    public Feature<java.time.LocalTime> favoriteTimeSecNullable;
    public Feature<java.time.LocalTime> favoriteTimeMilli;
    public Feature<java.time.LocalTime> favoriteTimeMilliNullable;
    public Feature<java.time.LocalTime> favoriteTimeMicro;
    public Feature<java.time.LocalTime> favoriteTimeMicroNullable;
    public Feature<java.time.LocalTime> favoriteTimeNano;
    public Feature<java.time.LocalTime> favoriteTimeNanoNullable;
    public Feature<java.time.Duration> favoriteDurationSec;
    public Feature<java.time.Duration> favoriteDurationSecNullable;
    public Feature<java.time.Duration> favoriteDurationMilli;
    public Feature<java.time.Duration> favoriteDurationMilliNullable;
    public Feature<java.time.Duration> favoriteDurationMicro;
    public Feature<java.time.Duration> favoriteDurationMicroNullable;
    public Feature<java.time.Duration> favoriteDurationNano;
    public Feature<java.time.Duration> favoriteDurationNanoNullable;
    public VanillaDataclass favoriteStruct;
    public VanillaDataclass favoriteStructNullable;
    public NestedMapDataclass nestedMapDataclass;
    public Feature<List<String>> favoriteStringList;
    public Feature<List<String>> favoriteStringListNullable;
    public Feature<List<Boolean>> favoriteBooleanList;
    public Feature<List<Long>> favoriteLongList;
    public Feature<List<Double>> favoriteDoubleList;
    public Feature<List<java.time.LocalDateTime>> favoriteTimestampSecList;
    public Feature<List<VanillaDataclass>> favoriteStructList;
    public Feature<List<List<VanillaDataclass>>> favoriteStructListList;
    public DataclassWithComplexFeatures favoriteStructComplex;
    public Feature<String> favoriteHasOneId;
    public MyTail favoriteHasOne;

    @HasMany(localKey = "id", foreignKey = "user_id")
    public Feature<List<Transaction>> smallTransactions;

    public _WindowedFeatures favoriteWindowed;

    // Tests multiple windowed features with the same duration buckets
    public _WindowedFeatures favoriteWindowedSameBuckets;


    // TODO: Add support for these data types
    //    public Feature<BigDecimal> favoriteDecimal;
    //    public WindowedFeatureAbc windowedFeatureAbc;
}
