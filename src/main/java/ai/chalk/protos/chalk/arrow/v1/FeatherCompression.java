// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/arrow/v1/arrow.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.chalk.arrow.v1;

/**
 * Protobuf enum {@code chalk.arrow.v1.FeatherCompression}
 */
public enum FeatherCompression
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>FEATHER_COMPRESSION_UNSPECIFIED = 0;</code>
   */
  FEATHER_COMPRESSION_UNSPECIFIED(0),
  /**
   * <code>FEATHER_COMPRESSION_UNCOMPRESSED = 1;</code>
   */
  FEATHER_COMPRESSION_UNCOMPRESSED(1),
  /**
   * <code>FEATHER_COMPRESSION_LZ4 = 2;</code>
   */
  FEATHER_COMPRESSION_LZ4(2),
  /**
   * <code>FEATHER_COMPRESSION_ZSTD = 3;</code>
   */
  FEATHER_COMPRESSION_ZSTD(3),
  UNRECOGNIZED(-1),
  ;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      FeatherCompression.class.getName());
  }
  /**
   * <code>FEATHER_COMPRESSION_UNSPECIFIED = 0;</code>
   */
  public static final int FEATHER_COMPRESSION_UNSPECIFIED_VALUE = 0;
  /**
   * <code>FEATHER_COMPRESSION_UNCOMPRESSED = 1;</code>
   */
  public static final int FEATHER_COMPRESSION_UNCOMPRESSED_VALUE = 1;
  /**
   * <code>FEATHER_COMPRESSION_LZ4 = 2;</code>
   */
  public static final int FEATHER_COMPRESSION_LZ4_VALUE = 2;
  /**
   * <code>FEATHER_COMPRESSION_ZSTD = 3;</code>
   */
  public static final int FEATHER_COMPRESSION_ZSTD_VALUE = 3;


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
  public static FeatherCompression valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static FeatherCompression forNumber(int value) {
    switch (value) {
      case 0: return FEATHER_COMPRESSION_UNSPECIFIED;
      case 1: return FEATHER_COMPRESSION_UNCOMPRESSED;
      case 2: return FEATHER_COMPRESSION_LZ4;
      case 3: return FEATHER_COMPRESSION_ZSTD;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<FeatherCompression>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      FeatherCompression> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<FeatherCompression>() {
          public FeatherCompression findValueByNumber(int number) {
            return FeatherCompression.forNumber(number);
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
    return ai.chalk.protos.chalk.arrow.v1.ArrowProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final FeatherCompression[] VALUES = values();

  public static FeatherCompression valueOf(
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

  private FeatherCompression(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:chalk.arrow.v1.FeatherCompression)
}
