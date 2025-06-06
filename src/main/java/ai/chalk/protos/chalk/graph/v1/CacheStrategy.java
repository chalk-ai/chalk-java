// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/graph/v1/graph.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.graph.v1;

/**
 * Protobuf enum {@code chalk.graph.v1.CacheStrategy}
 */
public enum CacheStrategy
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>CACHE_STRATEGY_UNSPECIFIED = 0;</code>
   */
  CACHE_STRATEGY_UNSPECIFIED(0),
  /**
   * <code>CACHE_STRATEGY_ALL = 1;</code>
   */
  CACHE_STRATEGY_ALL(1),
  /**
   * <code>CACHE_STRATEGY_NO_NULLS = 2;</code>
   */
  CACHE_STRATEGY_NO_NULLS(2),
  /**
   * <code>CACHE_STRATEGY_EVICT_NULLS = 3;</code>
   */
  CACHE_STRATEGY_EVICT_NULLS(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>CACHE_STRATEGY_UNSPECIFIED = 0;</code>
   */
  public static final int CACHE_STRATEGY_UNSPECIFIED_VALUE = 0;
  /**
   * <code>CACHE_STRATEGY_ALL = 1;</code>
   */
  public static final int CACHE_STRATEGY_ALL_VALUE = 1;
  /**
   * <code>CACHE_STRATEGY_NO_NULLS = 2;</code>
   */
  public static final int CACHE_STRATEGY_NO_NULLS_VALUE = 2;
  /**
   * <code>CACHE_STRATEGY_EVICT_NULLS = 3;</code>
   */
  public static final int CACHE_STRATEGY_EVICT_NULLS_VALUE = 3;


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
  public static CacheStrategy valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static CacheStrategy forNumber(int value) {
    switch (value) {
      case 0: return CACHE_STRATEGY_UNSPECIFIED;
      case 1: return CACHE_STRATEGY_ALL;
      case 2: return CACHE_STRATEGY_NO_NULLS;
      case 3: return CACHE_STRATEGY_EVICT_NULLS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CacheStrategy>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      CacheStrategy> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CacheStrategy>() {
          public CacheStrategy findValueByNumber(int number) {
            return CacheStrategy.forNumber(number);
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
    return ai.chalk.protos.chalk.graph.v1.GraphProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final CacheStrategy[] VALUES = values();

  public static CacheStrategy valueOf(
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

  private CacheStrategy(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:chalk.graph.v1.CacheStrategy)
}

