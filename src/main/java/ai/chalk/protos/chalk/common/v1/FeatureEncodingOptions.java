// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/common/v1/online_query.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.common.v1;

/**
 * Protobuf type {@code chalk.common.v1.FeatureEncodingOptions}
 */
public final class FeatureEncodingOptions extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chalk.common.v1.FeatureEncodingOptions)
    FeatureEncodingOptionsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FeatureEncodingOptions.newBuilder() to construct.
  private FeatureEncodingOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FeatureEncodingOptions() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FeatureEncodingOptions();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.common.v1.OnlineQueryProto.internal_static_chalk_common_v1_FeatureEncodingOptions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.common.v1.OnlineQueryProto.internal_static_chalk_common_v1_FeatureEncodingOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.common.v1.FeatureEncodingOptions.class, ai.chalk.protos.chalk.common.v1.FeatureEncodingOptions.Builder.class);
  }

  public static final int ENCODE_STRUCTS_AS_OBJECTS_FIELD_NUMBER = 1;
  private boolean encodeStructsAsObjects_ = false;
  /**
   * <code>bool encode_structs_as_objects = 1 [json_name = "encodeStructsAsObjects"];</code>
   * @return The encodeStructsAsObjects.
   */
  @java.lang.Override
  public boolean getEncodeStructsAsObjects() {
    return encodeStructsAsObjects_;
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
    if (encodeStructsAsObjects_ != false) {
      output.writeBool(1, encodeStructsAsObjects_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (encodeStructsAsObjects_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, encodeStructsAsObjects_);
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
    if (!(obj instanceof ai.chalk.protos.chalk.common.v1.FeatureEncodingOptions)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.common.v1.FeatureEncodingOptions other = (ai.chalk.protos.chalk.common.v1.FeatureEncodingOptions) obj;

    if (getEncodeStructsAsObjects()
        != other.getEncodeStructsAsObjects()) return false;
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
    hash = (37 * hash) + ENCODE_STRUCTS_AS_OBJECTS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEncodeStructsAsObjects());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.common.v1.FeatureEncodingOptions parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.common.v1.FeatureEncodingOptions parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.common.v1.FeatureEncodingOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.common.v1.FeatureEncodingOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.common.v1.FeatureEncodingOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.common.v1.FeatureEncodingOptions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.common.v1.FeatureEncodingOptions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.common.v1.FeatureEncodingOptions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.common.v1.FeatureEncodingOptions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.common.v1.FeatureEncodingOptions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.common.v1.FeatureEncodingOptions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.common.v1.FeatureEncodingOptions parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.common.v1.FeatureEncodingOptions prototype) {
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
   * Protobuf type {@code chalk.common.v1.FeatureEncodingOptions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.common.v1.FeatureEncodingOptions)
      ai.chalk.protos.chalk.common.v1.FeatureEncodingOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.common.v1.OnlineQueryProto.internal_static_chalk_common_v1_FeatureEncodingOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.common.v1.OnlineQueryProto.internal_static_chalk_common_v1_FeatureEncodingOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.common.v1.FeatureEncodingOptions.class, ai.chalk.protos.chalk.common.v1.FeatureEncodingOptions.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.common.v1.FeatureEncodingOptions.newBuilder()
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
      encodeStructsAsObjects_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.common.v1.OnlineQueryProto.internal_static_chalk_common_v1_FeatureEncodingOptions_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.common.v1.FeatureEncodingOptions getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.common.v1.FeatureEncodingOptions.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.common.v1.FeatureEncodingOptions build() {
      ai.chalk.protos.chalk.common.v1.FeatureEncodingOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.common.v1.FeatureEncodingOptions buildPartial() {
      ai.chalk.protos.chalk.common.v1.FeatureEncodingOptions result = new ai.chalk.protos.chalk.common.v1.FeatureEncodingOptions(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.common.v1.FeatureEncodingOptions result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.encodeStructsAsObjects_ = encodeStructsAsObjects_;
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
      if (other instanceof ai.chalk.protos.chalk.common.v1.FeatureEncodingOptions) {
        return mergeFrom((ai.chalk.protos.chalk.common.v1.FeatureEncodingOptions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.common.v1.FeatureEncodingOptions other) {
      if (other == ai.chalk.protos.chalk.common.v1.FeatureEncodingOptions.getDefaultInstance()) return this;
      if (other.getEncodeStructsAsObjects() != false) {
        setEncodeStructsAsObjects(other.getEncodeStructsAsObjects());
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
            case 8: {
              encodeStructsAsObjects_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
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

    private boolean encodeStructsAsObjects_ ;
    /**
     * <code>bool encode_structs_as_objects = 1 [json_name = "encodeStructsAsObjects"];</code>
     * @return The encodeStructsAsObjects.
     */
    @java.lang.Override
    public boolean getEncodeStructsAsObjects() {
      return encodeStructsAsObjects_;
    }
    /**
     * <code>bool encode_structs_as_objects = 1 [json_name = "encodeStructsAsObjects"];</code>
     * @param value The encodeStructsAsObjects to set.
     * @return This builder for chaining.
     */
    public Builder setEncodeStructsAsObjects(boolean value) {

      encodeStructsAsObjects_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>bool encode_structs_as_objects = 1 [json_name = "encodeStructsAsObjects"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEncodeStructsAsObjects() {
      bitField0_ = (bitField0_ & ~0x00000001);
      encodeStructsAsObjects_ = false;
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


    // @@protoc_insertion_point(builder_scope:chalk.common.v1.FeatureEncodingOptions)
  }

  // @@protoc_insertion_point(class_scope:chalk.common.v1.FeatureEncodingOptions)
  private static final ai.chalk.protos.chalk.common.v1.FeatureEncodingOptions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.common.v1.FeatureEncodingOptions();
  }

  public static ai.chalk.protos.chalk.common.v1.FeatureEncodingOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FeatureEncodingOptions>
      PARSER = new com.google.protobuf.AbstractParser<FeatureEncodingOptions>() {
    @java.lang.Override
    public FeatureEncodingOptions parsePartialFrom(
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

  public static com.google.protobuf.Parser<FeatureEncodingOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FeatureEncodingOptions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.common.v1.FeatureEncodingOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

