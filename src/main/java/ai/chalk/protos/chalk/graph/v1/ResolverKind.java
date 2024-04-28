// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/graph/v1/graph.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.chalk.graph.v1;

/**
 * Protobuf enum {@code chalk.graph.v1.ResolverKind}
 */
public enum ResolverKind
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>RESOLVER_KIND_UNSPECIFIED = 0;</code>
   */
  RESOLVER_KIND_UNSPECIFIED(0),
  /**
   * <code>RESOLVER_KIND_ONLINE = 1;</code>
   */
  RESOLVER_KIND_ONLINE(1),
  /**
   * <code>RESOLVER_KIND_OFFLINE = 2;</code>
   */
  RESOLVER_KIND_OFFLINE(2),
  UNRECOGNIZED(-1),
  ;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      ResolverKind.class.getName());
  }
  /**
   * <code>RESOLVER_KIND_UNSPECIFIED = 0;</code>
   */
  public static final int RESOLVER_KIND_UNSPECIFIED_VALUE = 0;
  /**
   * <code>RESOLVER_KIND_ONLINE = 1;</code>
   */
  public static final int RESOLVER_KIND_ONLINE_VALUE = 1;
  /**
   * <code>RESOLVER_KIND_OFFLINE = 2;</code>
   */
  public static final int RESOLVER_KIND_OFFLINE_VALUE = 2;


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
  public static ResolverKind valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ResolverKind forNumber(int value) {
    switch (value) {
      case 0: return RESOLVER_KIND_UNSPECIFIED;
      case 1: return RESOLVER_KIND_ONLINE;
      case 2: return RESOLVER_KIND_OFFLINE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ResolverKind>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ResolverKind> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ResolverKind>() {
          public ResolverKind findValueByNumber(int number) {
            return ResolverKind.forNumber(number);
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

  private static final ResolverKind[] VALUES = values();

  public static ResolverKind valueOf(
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

  private ResolverKind(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:chalk.graph.v1.ResolverKind)
}
