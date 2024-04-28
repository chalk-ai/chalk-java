// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/status.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.chalk.server.v1;

/**
 * Protobuf enum {@code chalk.server.v1.HealthCheckStatus}
 */
public enum HealthCheckStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>HEALTH_CHECK_STATUS_UNSPECIFIED = 0;</code>
   */
  HEALTH_CHECK_STATUS_UNSPECIFIED(0),
  /**
   * <code>HEALTH_CHECK_STATUS_OK = 1;</code>
   */
  HEALTH_CHECK_STATUS_OK(1),
  /**
   * <code>HEALTH_CHECK_STATUS_FAILING = 2;</code>
   */
  HEALTH_CHECK_STATUS_FAILING(2),
  UNRECOGNIZED(-1),
  ;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      HealthCheckStatus.class.getName());
  }
  /**
   * <code>HEALTH_CHECK_STATUS_UNSPECIFIED = 0;</code>
   */
  public static final int HEALTH_CHECK_STATUS_UNSPECIFIED_VALUE = 0;
  /**
   * <code>HEALTH_CHECK_STATUS_OK = 1;</code>
   */
  public static final int HEALTH_CHECK_STATUS_OK_VALUE = 1;
  /**
   * <code>HEALTH_CHECK_STATUS_FAILING = 2;</code>
   */
  public static final int HEALTH_CHECK_STATUS_FAILING_VALUE = 2;


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
  public static HealthCheckStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static HealthCheckStatus forNumber(int value) {
    switch (value) {
      case 0: return HEALTH_CHECK_STATUS_UNSPECIFIED;
      case 1: return HEALTH_CHECK_STATUS_OK;
      case 2: return HEALTH_CHECK_STATUS_FAILING;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<HealthCheckStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      HealthCheckStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<HealthCheckStatus>() {
          public HealthCheckStatus findValueByNumber(int number) {
            return HealthCheckStatus.forNumber(number);
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
    return ai.chalk.protos.chalk.server.v1.StatusProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final HealthCheckStatus[] VALUES = values();

  public static HealthCheckStatus valueOf(
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

  private HealthCheckStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:chalk.server.v1.HealthCheckStatus)
}

