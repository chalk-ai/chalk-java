// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/common/v1/operation_kind.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.common.v1;

/**
 * Protobuf enum {@code chalk.common.v1.OperationKind}
 */
public enum OperationKind
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>OPERATION_KIND_UNSPECIFIED = 0;</code>
   */
  OPERATION_KIND_UNSPECIFIED(0),
  /**
   * <pre>
   * also known as inference
   * </pre>
   *
   * <code>OPERATION_KIND_ONLINE_QUERY = 1;</code>
   */
  OPERATION_KIND_ONLINE_QUERY(1),
  /**
   * <code>OPERATION_KIND_MIGRATION = 2;</code>
   */
  OPERATION_KIND_MIGRATION(2),
  /**
   * <code>OPERATION_KIND_CRON = 3;</code>
   */
  OPERATION_KIND_CRON(3),
  /**
   * <code>OPERATION_KIND_STREAMING = 4;</code>
   */
  OPERATION_KIND_STREAMING(4),
  /**
   * <code>OPERATION_KIND_MIGRATION_SAMPLER = 5;</code>
   */
  OPERATION_KIND_MIGRATION_SAMPLER(5),
  /**
   * <code>OPERATION_KIND_WINDOWED_STREAMING = 6;</code>
   */
  OPERATION_KIND_WINDOWED_STREAMING(6),
  /**
   * <code>OPERATION_KIND_OFFLINE_QUERY = 7;</code>
   */
  OPERATION_KIND_OFFLINE_QUERY(7),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>OPERATION_KIND_UNSPECIFIED = 0;</code>
   */
  public static final int OPERATION_KIND_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * also known as inference
   * </pre>
   *
   * <code>OPERATION_KIND_ONLINE_QUERY = 1;</code>
   */
  public static final int OPERATION_KIND_ONLINE_QUERY_VALUE = 1;
  /**
   * <code>OPERATION_KIND_MIGRATION = 2;</code>
   */
  public static final int OPERATION_KIND_MIGRATION_VALUE = 2;
  /**
   * <code>OPERATION_KIND_CRON = 3;</code>
   */
  public static final int OPERATION_KIND_CRON_VALUE = 3;
  /**
   * <code>OPERATION_KIND_STREAMING = 4;</code>
   */
  public static final int OPERATION_KIND_STREAMING_VALUE = 4;
  /**
   * <code>OPERATION_KIND_MIGRATION_SAMPLER = 5;</code>
   */
  public static final int OPERATION_KIND_MIGRATION_SAMPLER_VALUE = 5;
  /**
   * <code>OPERATION_KIND_WINDOWED_STREAMING = 6;</code>
   */
  public static final int OPERATION_KIND_WINDOWED_STREAMING_VALUE = 6;
  /**
   * <code>OPERATION_KIND_OFFLINE_QUERY = 7;</code>
   */
  public static final int OPERATION_KIND_OFFLINE_QUERY_VALUE = 7;


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
  public static OperationKind valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static OperationKind forNumber(int value) {
    switch (value) {
      case 0: return OPERATION_KIND_UNSPECIFIED;
      case 1: return OPERATION_KIND_ONLINE_QUERY;
      case 2: return OPERATION_KIND_MIGRATION;
      case 3: return OPERATION_KIND_CRON;
      case 4: return OPERATION_KIND_STREAMING;
      case 5: return OPERATION_KIND_MIGRATION_SAMPLER;
      case 6: return OPERATION_KIND_WINDOWED_STREAMING;
      case 7: return OPERATION_KIND_OFFLINE_QUERY;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<OperationKind>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      OperationKind> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<OperationKind>() {
          public OperationKind findValueByNumber(int number) {
            return OperationKind.forNumber(number);
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
    return ai.chalk.protos.chalk.common.v1.OperationKindProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final OperationKind[] VALUES = values();

  public static OperationKind valueOf(
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

  private OperationKind(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:chalk.common.v1.OperationKind)
}

