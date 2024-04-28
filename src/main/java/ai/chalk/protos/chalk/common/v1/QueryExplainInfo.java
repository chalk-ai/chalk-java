// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/common/v1/online_query.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.chalk.common.v1;

/**
 * Protobuf type {@code chalk.common.v1.QueryExplainInfo}
 */
public final class QueryExplainInfo extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:chalk.common.v1.QueryExplainInfo)
    QueryExplainInfoOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      QueryExplainInfo.class.getName());
  }
  // Use QueryExplainInfo.newBuilder() to construct.
  private QueryExplainInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private QueryExplainInfo() {
    planString_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.common.v1.OnlineQueryProto.internal_static_chalk_common_v1_QueryExplainInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.common.v1.OnlineQueryProto.internal_static_chalk_common_v1_QueryExplainInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.common.v1.QueryExplainInfo.class, ai.chalk.protos.chalk.common.v1.QueryExplainInfo.Builder.class);
  }

  private int bitField0_;
  public static final int PLAN_STRING_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object planString_ = "";
  /**
   * <pre>
   * Unstructured string representation of the plan
   * </pre>
   *
   * <code>optional string plan_string = 1 [json_name = "planString"];</code>
   * @return Whether the planString field is set.
   */
  @java.lang.Override
  public boolean hasPlanString() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Unstructured string representation of the plan
   * </pre>
   *
   * <code>optional string plan_string = 1 [json_name = "planString"];</code>
   * @return The planString.
   */
  @java.lang.Override
  public java.lang.String getPlanString() {
    java.lang.Object ref = planString_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      planString_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Unstructured string representation of the plan
   * </pre>
   *
   * <code>optional string plan_string = 1 [json_name = "planString"];</code>
   * @return The bytes for planString.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPlanStringBytes() {
    java.lang.Object ref = planString_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      planString_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, planString_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, planString_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ai.chalk.protos.chalk.common.v1.QueryExplainInfo)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.common.v1.QueryExplainInfo other = (ai.chalk.protos.chalk.common.v1.QueryExplainInfo) obj;

    if (hasPlanString() != other.hasPlanString()) return false;
    if (hasPlanString()) {
      if (!getPlanString()
          .equals(other.getPlanString())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasPlanString()) {
      hash = (37 * hash) + PLAN_STRING_FIELD_NUMBER;
      hash = (53 * hash) + getPlanString().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.common.v1.QueryExplainInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.common.v1.QueryExplainInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.common.v1.QueryExplainInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.common.v1.QueryExplainInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.common.v1.QueryExplainInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.common.v1.QueryExplainInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.common.v1.QueryExplainInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.common.v1.QueryExplainInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.common.v1.QueryExplainInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.common.v1.QueryExplainInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.common.v1.QueryExplainInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.common.v1.QueryExplainInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ai.chalk.protos.chalk.common.v1.QueryExplainInfo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code chalk.common.v1.QueryExplainInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.common.v1.QueryExplainInfo)
      ai.chalk.protos.chalk.common.v1.QueryExplainInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.common.v1.OnlineQueryProto.internal_static_chalk_common_v1_QueryExplainInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.common.v1.OnlineQueryProto.internal_static_chalk_common_v1_QueryExplainInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.common.v1.QueryExplainInfo.class, ai.chalk.protos.chalk.common.v1.QueryExplainInfo.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.common.v1.QueryExplainInfo.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      planString_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.common.v1.OnlineQueryProto.internal_static_chalk_common_v1_QueryExplainInfo_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.common.v1.QueryExplainInfo getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.common.v1.QueryExplainInfo.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.common.v1.QueryExplainInfo build() {
      ai.chalk.protos.chalk.common.v1.QueryExplainInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.common.v1.QueryExplainInfo buildPartial() {
      ai.chalk.protos.chalk.common.v1.QueryExplainInfo result = new ai.chalk.protos.chalk.common.v1.QueryExplainInfo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.common.v1.QueryExplainInfo result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.planString_ = planString_;
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ai.chalk.protos.chalk.common.v1.QueryExplainInfo) {
        return mergeFrom((ai.chalk.protos.chalk.common.v1.QueryExplainInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.common.v1.QueryExplainInfo other) {
      if (other == ai.chalk.protos.chalk.common.v1.QueryExplainInfo.getDefaultInstance()) return this;
      if (other.hasPlanString()) {
        planString_ = other.planString_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              planString_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object planString_ = "";
    /**
     * <pre>
     * Unstructured string representation of the plan
     * </pre>
     *
     * <code>optional string plan_string = 1 [json_name = "planString"];</code>
     * @return Whether the planString field is set.
     */
    public boolean hasPlanString() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Unstructured string representation of the plan
     * </pre>
     *
     * <code>optional string plan_string = 1 [json_name = "planString"];</code>
     * @return The planString.
     */
    public java.lang.String getPlanString() {
      java.lang.Object ref = planString_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        planString_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Unstructured string representation of the plan
     * </pre>
     *
     * <code>optional string plan_string = 1 [json_name = "planString"];</code>
     * @return The bytes for planString.
     */
    public com.google.protobuf.ByteString
        getPlanStringBytes() {
      java.lang.Object ref = planString_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        planString_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Unstructured string representation of the plan
     * </pre>
     *
     * <code>optional string plan_string = 1 [json_name = "planString"];</code>
     * @param value The planString to set.
     * @return This builder for chaining.
     */
    public Builder setPlanString(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      planString_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Unstructured string representation of the plan
     * </pre>
     *
     * <code>optional string plan_string = 1 [json_name = "planString"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPlanString() {
      planString_ = getDefaultInstance().getPlanString();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Unstructured string representation of the plan
     * </pre>
     *
     * <code>optional string plan_string = 1 [json_name = "planString"];</code>
     * @param value The bytes for planString to set.
     * @return This builder for chaining.
     */
    public Builder setPlanStringBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      planString_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:chalk.common.v1.QueryExplainInfo)
  }

  // @@protoc_insertion_point(class_scope:chalk.common.v1.QueryExplainInfo)
  private static final ai.chalk.protos.chalk.common.v1.QueryExplainInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.common.v1.QueryExplainInfo();
  }

  public static ai.chalk.protos.chalk.common.v1.QueryExplainInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryExplainInfo>
      PARSER = new com.google.protobuf.AbstractParser<QueryExplainInfo>() {
    @java.lang.Override
    public QueryExplainInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<QueryExplainInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryExplainInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.common.v1.QueryExplainInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

