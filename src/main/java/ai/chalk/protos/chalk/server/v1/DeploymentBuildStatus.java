// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/builder.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

/**
 * Protobuf enum {@code chalk.server.v1.DeploymentBuildStatus}
 */
public enum DeploymentBuildStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>DEPLOYMENT_BUILD_STATUS_UNSPECIFIED = 0;</code>
   */
  DEPLOYMENT_BUILD_STATUS_UNSPECIFIED(0),
  /**
   * <code>DEPLOYMENT_BUILD_STATUS_UNKNOWN = 1;</code>
   */
  DEPLOYMENT_BUILD_STATUS_UNKNOWN(1),
  /**
   * <code>DEPLOYMENT_BUILD_STATUS_PENDING = 2;</code>
   */
  DEPLOYMENT_BUILD_STATUS_PENDING(2),
  /**
   * <code>DEPLOYMENT_BUILD_STATUS_QUEUED = 3;</code>
   */
  DEPLOYMENT_BUILD_STATUS_QUEUED(3),
  /**
   * <code>DEPLOYMENT_BUILD_STATUS_WORKING = 4;</code>
   */
  DEPLOYMENT_BUILD_STATUS_WORKING(4),
  /**
   * <code>DEPLOYMENT_BUILD_STATUS_SUCCESS = 5;</code>
   */
  DEPLOYMENT_BUILD_STATUS_SUCCESS(5),
  /**
   * <code>DEPLOYMENT_BUILD_STATUS_FAILURE = 6;</code>
   */
  DEPLOYMENT_BUILD_STATUS_FAILURE(6),
  /**
   * <code>DEPLOYMENT_BUILD_STATUS_INTERNAL_ERROR = 7;</code>
   */
  DEPLOYMENT_BUILD_STATUS_INTERNAL_ERROR(7),
  /**
   * <code>DEPLOYMENT_BUILD_STATUS_TIMEOUT = 8;</code>
   */
  DEPLOYMENT_BUILD_STATUS_TIMEOUT(8),
  /**
   * <code>DEPLOYMENT_BUILD_STATUS_CANCELLED = 9;</code>
   */
  DEPLOYMENT_BUILD_STATUS_CANCELLED(9),
  /**
   * <code>DEPLOYMENT_BUILD_STATUS_EXPIRED = 10;</code>
   */
  DEPLOYMENT_BUILD_STATUS_EXPIRED(10),
  /**
   * <code>DEPLOYMENT_BUILD_STATUS_BOOT_ERRORS = 11;</code>
   */
  DEPLOYMENT_BUILD_STATUS_BOOT_ERRORS(11),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>DEPLOYMENT_BUILD_STATUS_UNSPECIFIED = 0;</code>
   */
  public static final int DEPLOYMENT_BUILD_STATUS_UNSPECIFIED_VALUE = 0;
  /**
   * <code>DEPLOYMENT_BUILD_STATUS_UNKNOWN = 1;</code>
   */
  public static final int DEPLOYMENT_BUILD_STATUS_UNKNOWN_VALUE = 1;
  /**
   * <code>DEPLOYMENT_BUILD_STATUS_PENDING = 2;</code>
   */
  public static final int DEPLOYMENT_BUILD_STATUS_PENDING_VALUE = 2;
  /**
   * <code>DEPLOYMENT_BUILD_STATUS_QUEUED = 3;</code>
   */
  public static final int DEPLOYMENT_BUILD_STATUS_QUEUED_VALUE = 3;
  /**
   * <code>DEPLOYMENT_BUILD_STATUS_WORKING = 4;</code>
   */
  public static final int DEPLOYMENT_BUILD_STATUS_WORKING_VALUE = 4;
  /**
   * <code>DEPLOYMENT_BUILD_STATUS_SUCCESS = 5;</code>
   */
  public static final int DEPLOYMENT_BUILD_STATUS_SUCCESS_VALUE = 5;
  /**
   * <code>DEPLOYMENT_BUILD_STATUS_FAILURE = 6;</code>
   */
  public static final int DEPLOYMENT_BUILD_STATUS_FAILURE_VALUE = 6;
  /**
   * <code>DEPLOYMENT_BUILD_STATUS_INTERNAL_ERROR = 7;</code>
   */
  public static final int DEPLOYMENT_BUILD_STATUS_INTERNAL_ERROR_VALUE = 7;
  /**
   * <code>DEPLOYMENT_BUILD_STATUS_TIMEOUT = 8;</code>
   */
  public static final int DEPLOYMENT_BUILD_STATUS_TIMEOUT_VALUE = 8;
  /**
   * <code>DEPLOYMENT_BUILD_STATUS_CANCELLED = 9;</code>
   */
  public static final int DEPLOYMENT_BUILD_STATUS_CANCELLED_VALUE = 9;
  /**
   * <code>DEPLOYMENT_BUILD_STATUS_EXPIRED = 10;</code>
   */
  public static final int DEPLOYMENT_BUILD_STATUS_EXPIRED_VALUE = 10;
  /**
   * <code>DEPLOYMENT_BUILD_STATUS_BOOT_ERRORS = 11;</code>
   */
  public static final int DEPLOYMENT_BUILD_STATUS_BOOT_ERRORS_VALUE = 11;


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
  public static DeploymentBuildStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DeploymentBuildStatus forNumber(int value) {
    switch (value) {
      case 0: return DEPLOYMENT_BUILD_STATUS_UNSPECIFIED;
      case 1: return DEPLOYMENT_BUILD_STATUS_UNKNOWN;
      case 2: return DEPLOYMENT_BUILD_STATUS_PENDING;
      case 3: return DEPLOYMENT_BUILD_STATUS_QUEUED;
      case 4: return DEPLOYMENT_BUILD_STATUS_WORKING;
      case 5: return DEPLOYMENT_BUILD_STATUS_SUCCESS;
      case 6: return DEPLOYMENT_BUILD_STATUS_FAILURE;
      case 7: return DEPLOYMENT_BUILD_STATUS_INTERNAL_ERROR;
      case 8: return DEPLOYMENT_BUILD_STATUS_TIMEOUT;
      case 9: return DEPLOYMENT_BUILD_STATUS_CANCELLED;
      case 10: return DEPLOYMENT_BUILD_STATUS_EXPIRED;
      case 11: return DEPLOYMENT_BUILD_STATUS_BOOT_ERRORS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DeploymentBuildStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DeploymentBuildStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DeploymentBuildStatus>() {
          public DeploymentBuildStatus findValueByNumber(int number) {
            return DeploymentBuildStatus.forNumber(number);
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
    return ai.chalk.protos.chalk.server.v1.BuilderProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final DeploymentBuildStatus[] VALUES = values();

  public static DeploymentBuildStatus valueOf(
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

  private DeploymentBuildStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:chalk.server.v1.DeploymentBuildStatus)
}

