// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/expression/v1/expression.proto

// Protobuf Java Version: 3.25.3
package ai.chalk.protos.chalk.expression.v1;

/**
 * Protobuf enum {@code chalk.expression.v1.WindowFrameBoundType}
 */
public enum WindowFrameBoundType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>WINDOW_FRAME_BOUND_TYPE_UNSPECIFIED = 0;</code>
   */
  WINDOW_FRAME_BOUND_TYPE_UNSPECIFIED(0),
  /**
   * <code>WINDOW_FRAME_BOUND_TYPE_CURRENT_ROW = 1;</code>
   */
  WINDOW_FRAME_BOUND_TYPE_CURRENT_ROW(1),
  /**
   * <code>WINDOW_FRAME_BOUND_TYPE_PRECEDING = 2;</code>
   */
  WINDOW_FRAME_BOUND_TYPE_PRECEDING(2),
  /**
   * <code>WINDOW_FRAME_BOUND_TYPE_FOLLOWING = 3;</code>
   */
  WINDOW_FRAME_BOUND_TYPE_FOLLOWING(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>WINDOW_FRAME_BOUND_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int WINDOW_FRAME_BOUND_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <code>WINDOW_FRAME_BOUND_TYPE_CURRENT_ROW = 1;</code>
   */
  public static final int WINDOW_FRAME_BOUND_TYPE_CURRENT_ROW_VALUE = 1;
  /**
   * <code>WINDOW_FRAME_BOUND_TYPE_PRECEDING = 2;</code>
   */
  public static final int WINDOW_FRAME_BOUND_TYPE_PRECEDING_VALUE = 2;
  /**
   * <code>WINDOW_FRAME_BOUND_TYPE_FOLLOWING = 3;</code>
   */
  public static final int WINDOW_FRAME_BOUND_TYPE_FOLLOWING_VALUE = 3;


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
  public static WindowFrameBoundType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static WindowFrameBoundType forNumber(int value) {
    switch (value) {
      case 0: return WINDOW_FRAME_BOUND_TYPE_UNSPECIFIED;
      case 1: return WINDOW_FRAME_BOUND_TYPE_CURRENT_ROW;
      case 2: return WINDOW_FRAME_BOUND_TYPE_PRECEDING;
      case 3: return WINDOW_FRAME_BOUND_TYPE_FOLLOWING;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<WindowFrameBoundType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      WindowFrameBoundType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<WindowFrameBoundType>() {
          public WindowFrameBoundType findValueByNumber(int number) {
            return WindowFrameBoundType.forNumber(number);
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
    return ai.chalk.protos.chalk.expression.v1.ExpressionProto.getDescriptor().getEnumTypes().get(4);
  }

  private static final WindowFrameBoundType[] VALUES = values();

  public static WindowFrameBoundType valueOf(
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

  private WindowFrameBoundType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:chalk.expression.v1.WindowFrameBoundType)
}

