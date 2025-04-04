// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/datasets.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

/**
 * Protobuf enum {@code chalk.server.v1.DatasetRevisionStatus}
 */
public enum DatasetRevisionStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>DATASET_REVISION_STATUS_UNSPECIFIED = 0;</code>
   */
  DATASET_REVISION_STATUS_UNSPECIFIED(0),
  /**
   * <code>DATASET_REVISION_STATUS_UNKNOWN = 1;</code>
   */
  DATASET_REVISION_STATUS_UNKNOWN(1),
  /**
   * <code>DATASET_REVISION_STATUS_WORKING = 2;</code>
   */
  DATASET_REVISION_STATUS_WORKING(2),
  /**
   * <code>DATASET_REVISION_STATUS_COMPLETED = 3;</code>
   */
  DATASET_REVISION_STATUS_COMPLETED(3),
  /**
   * <code>DATASET_REVISION_STATUS_FAILED = 4;</code>
   */
  DATASET_REVISION_STATUS_FAILED(4),
  /**
   * <code>DATASET_REVISION_STATUS_CANCELED = 5;</code>
   */
  DATASET_REVISION_STATUS_CANCELED(5),
  /**
   * <code>DATASET_REVISION_STATUS_QUEUED = 6;</code>
   */
  DATASET_REVISION_STATUS_QUEUED(6),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>DATASET_REVISION_STATUS_UNSPECIFIED = 0;</code>
   */
  public static final int DATASET_REVISION_STATUS_UNSPECIFIED_VALUE = 0;
  /**
   * <code>DATASET_REVISION_STATUS_UNKNOWN = 1;</code>
   */
  public static final int DATASET_REVISION_STATUS_UNKNOWN_VALUE = 1;
  /**
   * <code>DATASET_REVISION_STATUS_WORKING = 2;</code>
   */
  public static final int DATASET_REVISION_STATUS_WORKING_VALUE = 2;
  /**
   * <code>DATASET_REVISION_STATUS_COMPLETED = 3;</code>
   */
  public static final int DATASET_REVISION_STATUS_COMPLETED_VALUE = 3;
  /**
   * <code>DATASET_REVISION_STATUS_FAILED = 4;</code>
   */
  public static final int DATASET_REVISION_STATUS_FAILED_VALUE = 4;
  /**
   * <code>DATASET_REVISION_STATUS_CANCELED = 5;</code>
   */
  public static final int DATASET_REVISION_STATUS_CANCELED_VALUE = 5;
  /**
   * <code>DATASET_REVISION_STATUS_QUEUED = 6;</code>
   */
  public static final int DATASET_REVISION_STATUS_QUEUED_VALUE = 6;


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
  public static DatasetRevisionStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DatasetRevisionStatus forNumber(int value) {
    switch (value) {
      case 0: return DATASET_REVISION_STATUS_UNSPECIFIED;
      case 1: return DATASET_REVISION_STATUS_UNKNOWN;
      case 2: return DATASET_REVISION_STATUS_WORKING;
      case 3: return DATASET_REVISION_STATUS_COMPLETED;
      case 4: return DATASET_REVISION_STATUS_FAILED;
      case 5: return DATASET_REVISION_STATUS_CANCELED;
      case 6: return DATASET_REVISION_STATUS_QUEUED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DatasetRevisionStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DatasetRevisionStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DatasetRevisionStatus>() {
          public DatasetRevisionStatus findValueByNumber(int number) {
            return DatasetRevisionStatus.forNumber(number);
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
    return ai.chalk.protos.chalk.server.v1.DatasetsProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final DatasetRevisionStatus[] VALUES = values();

  public static DatasetRevisionStatus valueOf(
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

  private DatasetRevisionStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:chalk.server.v1.DatasetRevisionStatus)
}

