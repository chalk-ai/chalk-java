// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/common/v1/chalk_error.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.chalk.common.v1;

/**
 * <pre>
 *
 * Network errors are thrown outside your resolvers.
 * For example, your request was unauthenticated,
 * connection failed, or an error occurred within Chalk.
 * </pre>
 *
 * Protobuf enum {@code chalk.common.v1.ErrorCodeCategory}
 */
public enum ErrorCodeCategory
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * -- DEFAULT VALUE --
   * </pre>
   *
   * <code>ERROR_CODE_CATEGORY_NETWORK_UNSPECIFIED = 0;</code>
   */
  ERROR_CODE_CATEGORY_NETWORK_UNSPECIFIED(0),
  /**
   * <pre>
   *
   * Request errors are raised before execution of your
   * resolver code. They may occur due to invalid feature
   * names in the input or a request that cannot be satisfied
   * by the resolvers you have defined.
   * </pre>
   *
   * <code>ERROR_CODE_CATEGORY_REQUEST = 1;</code>
   */
  ERROR_CODE_CATEGORY_REQUEST(1),
  /**
   * <pre>
   *
   * Field errors are raised while running a feature resolver
   * for a particular field. For this type of error, you'll
   * find a feature and resolver attribute in the error type.
   * When a feature resolver crashes, you will receive null
   * value in the response. To differentiate from a resolver
   * returning a null value and a failure in the resolver,
   * you need to check the error schema.
   * </pre>
   *
   * <code>ERROR_CODE_CATEGORY_FIELD = 2;</code>
   */
  ERROR_CODE_CATEGORY_FIELD(2),
  UNRECOGNIZED(-1),
  ;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      ErrorCodeCategory.class.getName());
  }
  /**
   * <pre>
   * -- DEFAULT VALUE --
   * </pre>
   *
   * <code>ERROR_CODE_CATEGORY_NETWORK_UNSPECIFIED = 0;</code>
   */
  public static final int ERROR_CODE_CATEGORY_NETWORK_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   *
   * Request errors are raised before execution of your
   * resolver code. They may occur due to invalid feature
   * names in the input or a request that cannot be satisfied
   * by the resolvers you have defined.
   * </pre>
   *
   * <code>ERROR_CODE_CATEGORY_REQUEST = 1;</code>
   */
  public static final int ERROR_CODE_CATEGORY_REQUEST_VALUE = 1;
  /**
   * <pre>
   *
   * Field errors are raised while running a feature resolver
   * for a particular field. For this type of error, you'll
   * find a feature and resolver attribute in the error type.
   * When a feature resolver crashes, you will receive null
   * value in the response. To differentiate from a resolver
   * returning a null value and a failure in the resolver,
   * you need to check the error schema.
   * </pre>
   *
   * <code>ERROR_CODE_CATEGORY_FIELD = 2;</code>
   */
  public static final int ERROR_CODE_CATEGORY_FIELD_VALUE = 2;


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
  public static ErrorCodeCategory valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ErrorCodeCategory forNumber(int value) {
    switch (value) {
      case 0: return ERROR_CODE_CATEGORY_NETWORK_UNSPECIFIED;
      case 1: return ERROR_CODE_CATEGORY_REQUEST;
      case 2: return ERROR_CODE_CATEGORY_FIELD;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ErrorCodeCategory>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ErrorCodeCategory> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ErrorCodeCategory>() {
          public ErrorCodeCategory findValueByNumber(int number) {
            return ErrorCodeCategory.forNumber(number);
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
    return ai.chalk.protos.chalk.common.v1.ChalkErrorProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final ErrorCodeCategory[] VALUES = values();

  public static ErrorCodeCategory valueOf(
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

  private ErrorCodeCategory(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:chalk.common.v1.ErrorCodeCategory)
}

