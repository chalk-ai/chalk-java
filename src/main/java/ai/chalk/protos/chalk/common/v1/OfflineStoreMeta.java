// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/common/v1/agent.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.common.v1;

/**
 * Protobuf type {@code chalk.common.v1.OfflineStoreMeta}
 */
public final class OfflineStoreMeta extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chalk.common.v1.OfflineStoreMeta)
    OfflineStoreMetaOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OfflineStoreMeta.newBuilder() to construct.
  private OfflineStoreMeta(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OfflineStoreMeta() {
    dialect_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OfflineStoreMeta();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.common.v1.AgentProto.internal_static_chalk_common_v1_OfflineStoreMeta_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.common.v1.AgentProto.internal_static_chalk_common_v1_OfflineStoreMeta_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.common.v1.OfflineStoreMeta.class, ai.chalk.protos.chalk.common.v1.OfflineStoreMeta.Builder.class);
  }

  public static final int DIALECT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object dialect_ = "";
  /**
   * <code>string dialect = 1 [json_name = "dialect"];</code>
   * @return The dialect.
   */
  @java.lang.Override
  public java.lang.String getDialect() {
    java.lang.Object ref = dialect_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dialect_ = s;
      return s;
    }
  }
  /**
   * <code>string dialect = 1 [json_name = "dialect"];</code>
   * @return The bytes for dialect.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDialectBytes() {
    java.lang.Object ref = dialect_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dialect_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dialect_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, dialect_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dialect_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, dialect_);
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
    if (!(obj instanceof ai.chalk.protos.chalk.common.v1.OfflineStoreMeta)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.common.v1.OfflineStoreMeta other = (ai.chalk.protos.chalk.common.v1.OfflineStoreMeta) obj;

    if (!getDialect()
        .equals(other.getDialect())) return false;
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
    hash = (37 * hash) + DIALECT_FIELD_NUMBER;
    hash = (53 * hash) + getDialect().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.common.v1.OfflineStoreMeta parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.common.v1.OfflineStoreMeta parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.common.v1.OfflineStoreMeta parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.common.v1.OfflineStoreMeta parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.common.v1.OfflineStoreMeta parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.common.v1.OfflineStoreMeta parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.common.v1.OfflineStoreMeta parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.common.v1.OfflineStoreMeta parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.common.v1.OfflineStoreMeta parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.common.v1.OfflineStoreMeta parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.common.v1.OfflineStoreMeta parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.common.v1.OfflineStoreMeta parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ai.chalk.protos.chalk.common.v1.OfflineStoreMeta prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code chalk.common.v1.OfflineStoreMeta}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.common.v1.OfflineStoreMeta)
      ai.chalk.protos.chalk.common.v1.OfflineStoreMetaOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.common.v1.AgentProto.internal_static_chalk_common_v1_OfflineStoreMeta_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.common.v1.AgentProto.internal_static_chalk_common_v1_OfflineStoreMeta_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.common.v1.OfflineStoreMeta.class, ai.chalk.protos.chalk.common.v1.OfflineStoreMeta.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.common.v1.OfflineStoreMeta.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      dialect_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.common.v1.AgentProto.internal_static_chalk_common_v1_OfflineStoreMeta_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.common.v1.OfflineStoreMeta getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.common.v1.OfflineStoreMeta.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.common.v1.OfflineStoreMeta build() {
      ai.chalk.protos.chalk.common.v1.OfflineStoreMeta result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.common.v1.OfflineStoreMeta buildPartial() {
      ai.chalk.protos.chalk.common.v1.OfflineStoreMeta result = new ai.chalk.protos.chalk.common.v1.OfflineStoreMeta(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.common.v1.OfflineStoreMeta result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.dialect_ = dialect_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ai.chalk.protos.chalk.common.v1.OfflineStoreMeta) {
        return mergeFrom((ai.chalk.protos.chalk.common.v1.OfflineStoreMeta)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.common.v1.OfflineStoreMeta other) {
      if (other == ai.chalk.protos.chalk.common.v1.OfflineStoreMeta.getDefaultInstance()) return this;
      if (!other.getDialect().isEmpty()) {
        dialect_ = other.dialect_;
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
              dialect_ = input.readStringRequireUtf8();
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

    private java.lang.Object dialect_ = "";
    /**
     * <code>string dialect = 1 [json_name = "dialect"];</code>
     * @return The dialect.
     */
    public java.lang.String getDialect() {
      java.lang.Object ref = dialect_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dialect_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string dialect = 1 [json_name = "dialect"];</code>
     * @return The bytes for dialect.
     */
    public com.google.protobuf.ByteString
        getDialectBytes() {
      java.lang.Object ref = dialect_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dialect_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string dialect = 1 [json_name = "dialect"];</code>
     * @param value The dialect to set.
     * @return This builder for chaining.
     */
    public Builder setDialect(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      dialect_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string dialect = 1 [json_name = "dialect"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDialect() {
      dialect_ = getDefaultInstance().getDialect();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string dialect = 1 [json_name = "dialect"];</code>
     * @param value The bytes for dialect to set.
     * @return This builder for chaining.
     */
    public Builder setDialectBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      dialect_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:chalk.common.v1.OfflineStoreMeta)
  }

  // @@protoc_insertion_point(class_scope:chalk.common.v1.OfflineStoreMeta)
  private static final ai.chalk.protos.chalk.common.v1.OfflineStoreMeta DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.common.v1.OfflineStoreMeta();
  }

  public static ai.chalk.protos.chalk.common.v1.OfflineStoreMeta getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OfflineStoreMeta>
      PARSER = new com.google.protobuf.AbstractParser<OfflineStoreMeta>() {
    @java.lang.Override
    public OfflineStoreMeta parsePartialFrom(
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

  public static com.google.protobuf.Parser<OfflineStoreMeta> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OfflineStoreMeta> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.common.v1.OfflineStoreMeta getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

