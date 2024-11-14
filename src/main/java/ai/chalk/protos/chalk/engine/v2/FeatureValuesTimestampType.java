// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/engine/v2/feature_values.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.engine.v2;

/**
 * Protobuf enum {@code chalk.engine.v2.FeatureValuesTimestampType}
 */
public enum FeatureValuesTimestampType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>FEATURE_VALUES_TIMESTAMP_TYPE_UNSPECIFIED = 0;</code>
   */
  FEATURE_VALUES_TIMESTAMP_TYPE_UNSPECIFIED(0),
  /**
   * <code>FEATURE_VALUES_TIMESTAMP_TYPE_INSERTED_AT = 1;</code>
   */
  FEATURE_VALUES_TIMESTAMP_TYPE_INSERTED_AT(1),
  /**
   * <code>FEATURE_VALUES_TIMESTAMP_TYPE_OBSERVED_AT = 2;</code>
   */
  FEATURE_VALUES_TIMESTAMP_TYPE_OBSERVED_AT(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>FEATURE_VALUES_TIMESTAMP_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int FEATURE_VALUES_TIMESTAMP_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <code>FEATURE_VALUES_TIMESTAMP_TYPE_INSERTED_AT = 1;</code>
   */
  public static final int FEATURE_VALUES_TIMESTAMP_TYPE_INSERTED_AT_VALUE = 1;
  /**
   * <code>FEATURE_VALUES_TIMESTAMP_TYPE_OBSERVED_AT = 2;</code>
   */
  public static final int FEATURE_VALUES_TIMESTAMP_TYPE_OBSERVED_AT_VALUE = 2;


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
  public static FeatureValuesTimestampType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static FeatureValuesTimestampType forNumber(int value) {
    switch (value) {
      case 0: return FEATURE_VALUES_TIMESTAMP_TYPE_UNSPECIFIED;
      case 1: return FEATURE_VALUES_TIMESTAMP_TYPE_INSERTED_AT;
      case 2: return FEATURE_VALUES_TIMESTAMP_TYPE_OBSERVED_AT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<FeatureValuesTimestampType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      FeatureValuesTimestampType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<FeatureValuesTimestampType>() {
          public FeatureValuesTimestampType findValueByNumber(int number) {
            return FeatureValuesTimestampType.forNumber(number);
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
    return ai.chalk.protos.chalk.engine.v2.FeatureValuesProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final FeatureValuesTimestampType[] VALUES = values();

  public static FeatureValuesTimestampType valueOf(
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

  private FeatureValuesTimestampType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:chalk.engine.v2.FeatureValuesTimestampType)
}

