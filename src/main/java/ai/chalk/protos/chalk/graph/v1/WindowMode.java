// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/graph/v1/graph.proto

// Protobuf Java Version: 3.25.3
package ai.chalk.protos.chalk.graph.v1;

/**
 * Protobuf enum {@code chalk.graph.v1.WindowMode}
 */
public enum WindowMode
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>WINDOW_MODE_UNSPECIFIED = 0;</code>
   */
  WINDOW_MODE_UNSPECIFIED(0),
  /**
   * <code>WINDOW_MODE_CONTINUOUS = 1;</code>
   */
  WINDOW_MODE_CONTINUOUS(1),
  /**
   * <code>WINDOW_MODE_TUMBLING = 2;</code>
   */
  WINDOW_MODE_TUMBLING(2),
  /**
   * <code>WINDOW_MODE_CDC = 3;</code>
   */
  WINDOW_MODE_CDC(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>WINDOW_MODE_UNSPECIFIED = 0;</code>
   */
  public static final int WINDOW_MODE_UNSPECIFIED_VALUE = 0;
  /**
   * <code>WINDOW_MODE_CONTINUOUS = 1;</code>
   */
  public static final int WINDOW_MODE_CONTINUOUS_VALUE = 1;
  /**
   * <code>WINDOW_MODE_TUMBLING = 2;</code>
   */
  public static final int WINDOW_MODE_TUMBLING_VALUE = 2;
  /**
   * <code>WINDOW_MODE_CDC = 3;</code>
   */
  public static final int WINDOW_MODE_CDC_VALUE = 3;


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
  public static WindowMode valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static WindowMode forNumber(int value) {
    switch (value) {
      case 0: return WINDOW_MODE_UNSPECIFIED;
      case 1: return WINDOW_MODE_CONTINUOUS;
      case 2: return WINDOW_MODE_TUMBLING;
      case 3: return WINDOW_MODE_CDC;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<WindowMode>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      WindowMode> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<WindowMode>() {
          public WindowMode findValueByNumber(int number) {
            return WindowMode.forNumber(number);
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
    return ai.chalk.protos.chalk.graph.v1.GraphProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final WindowMode[] VALUES = values();

  public static WindowMode valueOf(
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

  private WindowMode(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:chalk.graph.v1.WindowMode)
}

