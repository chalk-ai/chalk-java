// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/usage/v1/rate.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.usage.v1;

/**
 * <pre>
 * Cloud represents a cloud provider.
 * </pre>
 *
 * Protobuf enum {@code chalk.usage.v1.BillingCloud}
 */
public enum BillingCloud
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>BILLING_CLOUD_UNSPECIFIED = 0;</code>
   */
  BILLING_CLOUD_UNSPECIFIED(0),
  /**
   * <code>BILLING_CLOUD_AWS = 1;</code>
   */
  BILLING_CLOUD_AWS(1),
  /**
   * <code>BILLING_CLOUD_GCP = 2;</code>
   */
  BILLING_CLOUD_GCP(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>BILLING_CLOUD_UNSPECIFIED = 0;</code>
   */
  public static final int BILLING_CLOUD_UNSPECIFIED_VALUE = 0;
  /**
   * <code>BILLING_CLOUD_AWS = 1;</code>
   */
  public static final int BILLING_CLOUD_AWS_VALUE = 1;
  /**
   * <code>BILLING_CLOUD_GCP = 2;</code>
   */
  public static final int BILLING_CLOUD_GCP_VALUE = 2;


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
  public static BillingCloud valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static BillingCloud forNumber(int value) {
    switch (value) {
      case 0: return BILLING_CLOUD_UNSPECIFIED;
      case 1: return BILLING_CLOUD_AWS;
      case 2: return BILLING_CLOUD_GCP;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<BillingCloud>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      BillingCloud> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<BillingCloud>() {
          public BillingCloud findValueByNumber(int number) {
            return BillingCloud.forNumber(number);
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
    return ai.chalk.protos.chalk.usage.v1.RateProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final BillingCloud[] VALUES = values();

  public static BillingCloud valueOf(
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

  private BillingCloud(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:chalk.usage.v1.BillingCloud)
}

