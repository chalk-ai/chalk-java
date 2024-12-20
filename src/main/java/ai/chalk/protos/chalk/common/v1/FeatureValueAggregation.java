// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/common/v1/feature_values.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.common.v1;

/**
 * Protobuf enum {@code chalk.common.v1.FeatureValueAggregation}
 */
@java.lang.Deprecated public enum FeatureValueAggregation
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>FEATURE_VALUE_AGGREGATION_UNSPECIFIED = 0;</code>
   */
  FEATURE_VALUE_AGGREGATION_UNSPECIFIED(0),
  /**
   * <code>FEATURE_VALUE_AGGREGATION_UNIQUE_VALUES = 1;</code>
   */
  FEATURE_VALUE_AGGREGATION_UNIQUE_VALUES(1),
  /**
   * <code>FEATURE_VALUE_AGGREGATION_TOTAL_OBSERVATIONS = 2;</code>
   */
  FEATURE_VALUE_AGGREGATION_TOTAL_OBSERVATIONS(2),
  /**
   * <code>FEATURE_VALUE_AGGREGATION_NULL_PERCENTAGE = 3;</code>
   */
  FEATURE_VALUE_AGGREGATION_NULL_PERCENTAGE(3),
  /**
   * <code>FEATURE_VALUE_AGGREGATION_MAX_VALUE = 4;</code>
   */
  FEATURE_VALUE_AGGREGATION_MAX_VALUE(4),
  /**
   * <code>FEATURE_VALUE_AGGREGATION_MIN_VALUE = 5;</code>
   */
  FEATURE_VALUE_AGGREGATION_MIN_VALUE(5),
  /**
   * <code>FEATURE_VALUE_AGGREGATION_AVERAGE = 6;</code>
   */
  FEATURE_VALUE_AGGREGATION_AVERAGE(6),
  /**
   * <code>FEATURE_VALUE_AGGREGATION_UNIQUE_PKEYS = 7;</code>
   */
  FEATURE_VALUE_AGGREGATION_UNIQUE_PKEYS(7),
  /**
   * <code>FEATURE_VALUE_AGGREGATION_P95 = 8;</code>
   */
  FEATURE_VALUE_AGGREGATION_P95(8),
  /**
   * <code>FEATURE_VALUE_AGGREGATION_P75 = 9;</code>
   */
  FEATURE_VALUE_AGGREGATION_P75(9),
  /**
   * <code>FEATURE_VALUE_AGGREGATION_P50 = 10;</code>
   */
  FEATURE_VALUE_AGGREGATION_P50(10),
  /**
   * <code>FEATURE_VALUE_AGGREGATION_P25 = 11;</code>
   */
  FEATURE_VALUE_AGGREGATION_P25(11),
  /**
   * <code>FEATURE_VALUE_AGGREGATION_P05 = 12;</code>
   */
  FEATURE_VALUE_AGGREGATION_P05(12),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>FEATURE_VALUE_AGGREGATION_UNSPECIFIED = 0;</code>
   */
  public static final int FEATURE_VALUE_AGGREGATION_UNSPECIFIED_VALUE = 0;
  /**
   * <code>FEATURE_VALUE_AGGREGATION_UNIQUE_VALUES = 1;</code>
   */
  public static final int FEATURE_VALUE_AGGREGATION_UNIQUE_VALUES_VALUE = 1;
  /**
   * <code>FEATURE_VALUE_AGGREGATION_TOTAL_OBSERVATIONS = 2;</code>
   */
  public static final int FEATURE_VALUE_AGGREGATION_TOTAL_OBSERVATIONS_VALUE = 2;
  /**
   * <code>FEATURE_VALUE_AGGREGATION_NULL_PERCENTAGE = 3;</code>
   */
  public static final int FEATURE_VALUE_AGGREGATION_NULL_PERCENTAGE_VALUE = 3;
  /**
   * <code>FEATURE_VALUE_AGGREGATION_MAX_VALUE = 4;</code>
   */
  public static final int FEATURE_VALUE_AGGREGATION_MAX_VALUE_VALUE = 4;
  /**
   * <code>FEATURE_VALUE_AGGREGATION_MIN_VALUE = 5;</code>
   */
  public static final int FEATURE_VALUE_AGGREGATION_MIN_VALUE_VALUE = 5;
  /**
   * <code>FEATURE_VALUE_AGGREGATION_AVERAGE = 6;</code>
   */
  public static final int FEATURE_VALUE_AGGREGATION_AVERAGE_VALUE = 6;
  /**
   * <code>FEATURE_VALUE_AGGREGATION_UNIQUE_PKEYS = 7;</code>
   */
  public static final int FEATURE_VALUE_AGGREGATION_UNIQUE_PKEYS_VALUE = 7;
  /**
   * <code>FEATURE_VALUE_AGGREGATION_P95 = 8;</code>
   */
  public static final int FEATURE_VALUE_AGGREGATION_P95_VALUE = 8;
  /**
   * <code>FEATURE_VALUE_AGGREGATION_P75 = 9;</code>
   */
  public static final int FEATURE_VALUE_AGGREGATION_P75_VALUE = 9;
  /**
   * <code>FEATURE_VALUE_AGGREGATION_P50 = 10;</code>
   */
  public static final int FEATURE_VALUE_AGGREGATION_P50_VALUE = 10;
  /**
   * <code>FEATURE_VALUE_AGGREGATION_P25 = 11;</code>
   */
  public static final int FEATURE_VALUE_AGGREGATION_P25_VALUE = 11;
  /**
   * <code>FEATURE_VALUE_AGGREGATION_P05 = 12;</code>
   */
  public static final int FEATURE_VALUE_AGGREGATION_P05_VALUE = 12;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static FeatureValueAggregation valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static FeatureValueAggregation forNumber(int value) {
    switch (value) {
      case 0: return FEATURE_VALUE_AGGREGATION_UNSPECIFIED;
      case 1: return FEATURE_VALUE_AGGREGATION_UNIQUE_VALUES;
      case 2: return FEATURE_VALUE_AGGREGATION_TOTAL_OBSERVATIONS;
      case 3: return FEATURE_VALUE_AGGREGATION_NULL_PERCENTAGE;
      case 4: return FEATURE_VALUE_AGGREGATION_MAX_VALUE;
      case 5: return FEATURE_VALUE_AGGREGATION_MIN_VALUE;
      case 6: return FEATURE_VALUE_AGGREGATION_AVERAGE;
      case 7: return FEATURE_VALUE_AGGREGATION_UNIQUE_PKEYS;
      case 8: return FEATURE_VALUE_AGGREGATION_P95;
      case 9: return FEATURE_VALUE_AGGREGATION_P75;
      case 10: return FEATURE_VALUE_AGGREGATION_P50;
      case 11: return FEATURE_VALUE_AGGREGATION_P25;
      case 12: return FEATURE_VALUE_AGGREGATION_P05;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<FeatureValueAggregation>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      FeatureValueAggregation> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<FeatureValueAggregation>() {
          public FeatureValueAggregation findValueByNumber(int number) {
            return FeatureValueAggregation.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.common.v1.FeatureValuesProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final FeatureValueAggregation[] VALUES = values();

  public static FeatureValueAggregation valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private FeatureValueAggregation(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:chalk.common.v1.FeatureValueAggregation)
}

