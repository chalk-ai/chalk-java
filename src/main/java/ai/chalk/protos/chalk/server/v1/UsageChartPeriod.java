// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/billing.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

/**
 * Protobuf enum {@code chalk.server.v1.UsageChartPeriod}
 */
public enum UsageChartPeriod
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>USAGE_CHART_PERIOD_UNSPECIFIED = 0;</code>
   */
  USAGE_CHART_PERIOD_UNSPECIFIED(0),
  /**
   * <code>USAGE_CHART_PERIOD_DAILY = 1;</code>
   */
  USAGE_CHART_PERIOD_DAILY(1),
  /**
   * <code>USAGE_CHART_PERIOD_MONTHLY = 2;</code>
   */
  USAGE_CHART_PERIOD_MONTHLY(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>USAGE_CHART_PERIOD_UNSPECIFIED = 0;</code>
   */
  public static final int USAGE_CHART_PERIOD_UNSPECIFIED_VALUE = 0;
  /**
   * <code>USAGE_CHART_PERIOD_DAILY = 1;</code>
   */
  public static final int USAGE_CHART_PERIOD_DAILY_VALUE = 1;
  /**
   * <code>USAGE_CHART_PERIOD_MONTHLY = 2;</code>
   */
  public static final int USAGE_CHART_PERIOD_MONTHLY_VALUE = 2;


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
  public static UsageChartPeriod valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static UsageChartPeriod forNumber(int value) {
    switch (value) {
      case 0: return USAGE_CHART_PERIOD_UNSPECIFIED;
      case 1: return USAGE_CHART_PERIOD_DAILY;
      case 2: return USAGE_CHART_PERIOD_MONTHLY;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<UsageChartPeriod>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      UsageChartPeriod> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<UsageChartPeriod>() {
          public UsageChartPeriod findValueByNumber(int number) {
            return UsageChartPeriod.forNumber(number);
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
    return ai.chalk.protos.chalk.server.v1.BillingProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final UsageChartPeriod[] VALUES = values();

  public static UsageChartPeriod valueOf(
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

  private UsageChartPeriod(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:chalk.server.v1.UsageChartPeriod)
}

