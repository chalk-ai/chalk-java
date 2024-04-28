// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/engine/v1/plan.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.chalk.engine.v1;

/**
 * <pre>
 * Represents a feature in the graph that corresponds to a single column in a table, i.e. not a has-many or a dataframe.
 * Basically a "scalar" but shouldn't be confused w/ ScalarFeatureType
 * </pre>
 *
 * Protobuf type {@code chalk.engine.v1.FeatureColumnKey}
 */
public final class FeatureColumnKey extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:chalk.engine.v1.FeatureColumnKey)
    FeatureColumnKeyOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      FeatureColumnKey.class.getName());
  }
  // Use FeatureColumnKey.newBuilder() to construct.
  private FeatureColumnKey(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private FeatureColumnKey() {
    rootFqn_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.engine.v1.PlanProto.internal_static_chalk_engine_v1_FeatureColumnKey_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.engine.v1.PlanProto.internal_static_chalk_engine_v1_FeatureColumnKey_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.engine.v1.FeatureColumnKey.class, ai.chalk.protos.chalk.engine.v1.FeatureColumnKey.Builder.class);
  }

  public static final int ROOT_FQN_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object rootFqn_ = "";
  /**
   * <code>string root_fqn = 1 [json_name = "rootFqn"];</code>
   * @return The rootFqn.
   */
  @java.lang.Override
  public java.lang.String getRootFqn() {
    java.lang.Object ref = rootFqn_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      rootFqn_ = s;
      return s;
    }
  }
  /**
   * <code>string root_fqn = 1 [json_name = "rootFqn"];</code>
   * @return The bytes for rootFqn.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRootFqnBytes() {
    java.lang.Object ref = rootFqn_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      rootFqn_ = b;
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(rootFqn_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, rootFqn_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(rootFqn_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, rootFqn_);
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
    if (!(obj instanceof ai.chalk.protos.chalk.engine.v1.FeatureColumnKey)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.engine.v1.FeatureColumnKey other = (ai.chalk.protos.chalk.engine.v1.FeatureColumnKey) obj;

    if (!getRootFqn()
        .equals(other.getRootFqn())) return false;
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
    hash = (37 * hash) + ROOT_FQN_FIELD_NUMBER;
    hash = (53 * hash) + getRootFqn().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.engine.v1.FeatureColumnKey parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.engine.v1.FeatureColumnKey parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.engine.v1.FeatureColumnKey parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.engine.v1.FeatureColumnKey parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.engine.v1.FeatureColumnKey parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.engine.v1.FeatureColumnKey parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.engine.v1.FeatureColumnKey parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.engine.v1.FeatureColumnKey parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.engine.v1.FeatureColumnKey parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.engine.v1.FeatureColumnKey parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.engine.v1.FeatureColumnKey parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.engine.v1.FeatureColumnKey parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.engine.v1.FeatureColumnKey prototype) {
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
   * <pre>
   * Represents a feature in the graph that corresponds to a single column in a table, i.e. not a has-many or a dataframe.
   * Basically a "scalar" but shouldn't be confused w/ ScalarFeatureType
   * </pre>
   *
   * Protobuf type {@code chalk.engine.v1.FeatureColumnKey}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.engine.v1.FeatureColumnKey)
      ai.chalk.protos.chalk.engine.v1.FeatureColumnKeyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.engine.v1.PlanProto.internal_static_chalk_engine_v1_FeatureColumnKey_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.engine.v1.PlanProto.internal_static_chalk_engine_v1_FeatureColumnKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.engine.v1.FeatureColumnKey.class, ai.chalk.protos.chalk.engine.v1.FeatureColumnKey.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.engine.v1.FeatureColumnKey.newBuilder()
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
      rootFqn_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.engine.v1.PlanProto.internal_static_chalk_engine_v1_FeatureColumnKey_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.engine.v1.FeatureColumnKey getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.engine.v1.FeatureColumnKey.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.engine.v1.FeatureColumnKey build() {
      ai.chalk.protos.chalk.engine.v1.FeatureColumnKey result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.engine.v1.FeatureColumnKey buildPartial() {
      ai.chalk.protos.chalk.engine.v1.FeatureColumnKey result = new ai.chalk.protos.chalk.engine.v1.FeatureColumnKey(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.engine.v1.FeatureColumnKey result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.rootFqn_ = rootFqn_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ai.chalk.protos.chalk.engine.v1.FeatureColumnKey) {
        return mergeFrom((ai.chalk.protos.chalk.engine.v1.FeatureColumnKey)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.engine.v1.FeatureColumnKey other) {
      if (other == ai.chalk.protos.chalk.engine.v1.FeatureColumnKey.getDefaultInstance()) return this;
      if (!other.getRootFqn().isEmpty()) {
        rootFqn_ = other.rootFqn_;
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
              rootFqn_ = input.readStringRequireUtf8();
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

    private java.lang.Object rootFqn_ = "";
    /**
     * <code>string root_fqn = 1 [json_name = "rootFqn"];</code>
     * @return The rootFqn.
     */
    public java.lang.String getRootFqn() {
      java.lang.Object ref = rootFqn_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        rootFqn_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string root_fqn = 1 [json_name = "rootFqn"];</code>
     * @return The bytes for rootFqn.
     */
    public com.google.protobuf.ByteString
        getRootFqnBytes() {
      java.lang.Object ref = rootFqn_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        rootFqn_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string root_fqn = 1 [json_name = "rootFqn"];</code>
     * @param value The rootFqn to set.
     * @return This builder for chaining.
     */
    public Builder setRootFqn(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      rootFqn_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string root_fqn = 1 [json_name = "rootFqn"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRootFqn() {
      rootFqn_ = getDefaultInstance().getRootFqn();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string root_fqn = 1 [json_name = "rootFqn"];</code>
     * @param value The bytes for rootFqn to set.
     * @return This builder for chaining.
     */
    public Builder setRootFqnBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      rootFqn_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:chalk.engine.v1.FeatureColumnKey)
  }

  // @@protoc_insertion_point(class_scope:chalk.engine.v1.FeatureColumnKey)
  private static final ai.chalk.protos.chalk.engine.v1.FeatureColumnKey DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.engine.v1.FeatureColumnKey();
  }

  public static ai.chalk.protos.chalk.engine.v1.FeatureColumnKey getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FeatureColumnKey>
      PARSER = new com.google.protobuf.AbstractParser<FeatureColumnKey>() {
    @java.lang.Override
    public FeatureColumnKey parsePartialFrom(
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

  public static com.google.protobuf.Parser<FeatureColumnKey> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FeatureColumnKey> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.engine.v1.FeatureColumnKey getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

