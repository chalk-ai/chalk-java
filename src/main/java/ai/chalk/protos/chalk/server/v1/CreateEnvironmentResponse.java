// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/team.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

/**
 * Protobuf type {@code chalk.server.v1.CreateEnvironmentResponse}
 */
public final class CreateEnvironmentResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chalk.server.v1.CreateEnvironmentResponse)
    CreateEnvironmentResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateEnvironmentResponse.newBuilder() to construct.
  private CreateEnvironmentResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateEnvironmentResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateEnvironmentResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.server.v1.TeamProto.internal_static_chalk_server_v1_CreateEnvironmentResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.server.v1.TeamProto.internal_static_chalk_server_v1_CreateEnvironmentResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.server.v1.CreateEnvironmentResponse.class, ai.chalk.protos.chalk.server.v1.CreateEnvironmentResponse.Builder.class);
  }

  private int bitField0_;
  public static final int ENVIRONMENT_FIELD_NUMBER = 1;
  private ai.chalk.protos.chalk.server.v1.Environment environment_;
  /**
   * <code>.chalk.server.v1.Environment environment = 1 [json_name = "environment"];</code>
   * @return Whether the environment field is set.
   */
  @java.lang.Override
  public boolean hasEnvironment() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.chalk.server.v1.Environment environment = 1 [json_name = "environment"];</code>
   * @return The environment.
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.server.v1.Environment getEnvironment() {
    return environment_ == null ? ai.chalk.protos.chalk.server.v1.Environment.getDefaultInstance() : environment_;
  }
  /**
   * <code>.chalk.server.v1.Environment environment = 1 [json_name = "environment"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.server.v1.EnvironmentOrBuilder getEnvironmentOrBuilder() {
    return environment_ == null ? ai.chalk.protos.chalk.server.v1.Environment.getDefaultInstance() : environment_;
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
      output.writeMessage(1, getEnvironment());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getEnvironment());
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
    if (!(obj instanceof ai.chalk.protos.chalk.server.v1.CreateEnvironmentResponse)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.server.v1.CreateEnvironmentResponse other = (ai.chalk.protos.chalk.server.v1.CreateEnvironmentResponse) obj;

    if (hasEnvironment() != other.hasEnvironment()) return false;
    if (hasEnvironment()) {
      if (!getEnvironment()
          .equals(other.getEnvironment())) return false;
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
    if (hasEnvironment()) {
      hash = (37 * hash) + ENVIRONMENT_FIELD_NUMBER;
      hash = (53 * hash) + getEnvironment().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.server.v1.CreateEnvironmentResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.CreateEnvironmentResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.CreateEnvironmentResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.CreateEnvironmentResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.CreateEnvironmentResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.CreateEnvironmentResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.CreateEnvironmentResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.server.v1.CreateEnvironmentResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.server.v1.CreateEnvironmentResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.server.v1.CreateEnvironmentResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.CreateEnvironmentResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.server.v1.CreateEnvironmentResponse parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.server.v1.CreateEnvironmentResponse prototype) {
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
   * Protobuf type {@code chalk.server.v1.CreateEnvironmentResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.server.v1.CreateEnvironmentResponse)
      ai.chalk.protos.chalk.server.v1.CreateEnvironmentResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.server.v1.TeamProto.internal_static_chalk_server_v1_CreateEnvironmentResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.server.v1.TeamProto.internal_static_chalk_server_v1_CreateEnvironmentResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.server.v1.CreateEnvironmentResponse.class, ai.chalk.protos.chalk.server.v1.CreateEnvironmentResponse.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.server.v1.CreateEnvironmentResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getEnvironmentFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      environment_ = null;
      if (environmentBuilder_ != null) {
        environmentBuilder_.dispose();
        environmentBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.server.v1.TeamProto.internal_static_chalk_server_v1_CreateEnvironmentResponse_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.CreateEnvironmentResponse getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.server.v1.CreateEnvironmentResponse.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.CreateEnvironmentResponse build() {
      ai.chalk.protos.chalk.server.v1.CreateEnvironmentResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.CreateEnvironmentResponse buildPartial() {
      ai.chalk.protos.chalk.server.v1.CreateEnvironmentResponse result = new ai.chalk.protos.chalk.server.v1.CreateEnvironmentResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.server.v1.CreateEnvironmentResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.environment_ = environmentBuilder_ == null
            ? environment_
            : environmentBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof ai.chalk.protos.chalk.server.v1.CreateEnvironmentResponse) {
        return mergeFrom((ai.chalk.protos.chalk.server.v1.CreateEnvironmentResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.server.v1.CreateEnvironmentResponse other) {
      if (other == ai.chalk.protos.chalk.server.v1.CreateEnvironmentResponse.getDefaultInstance()) return this;
      if (other.hasEnvironment()) {
        mergeEnvironment(other.getEnvironment());
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
              input.readMessage(
                  getEnvironmentFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private ai.chalk.protos.chalk.server.v1.Environment environment_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.server.v1.Environment, ai.chalk.protos.chalk.server.v1.Environment.Builder, ai.chalk.protos.chalk.server.v1.EnvironmentOrBuilder> environmentBuilder_;
    /**
     * <code>.chalk.server.v1.Environment environment = 1 [json_name = "environment"];</code>
     * @return Whether the environment field is set.
     */
    public boolean hasEnvironment() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.chalk.server.v1.Environment environment = 1 [json_name = "environment"];</code>
     * @return The environment.
     */
    public ai.chalk.protos.chalk.server.v1.Environment getEnvironment() {
      if (environmentBuilder_ == null) {
        return environment_ == null ? ai.chalk.protos.chalk.server.v1.Environment.getDefaultInstance() : environment_;
      } else {
        return environmentBuilder_.getMessage();
      }
    }
    /**
     * <code>.chalk.server.v1.Environment environment = 1 [json_name = "environment"];</code>
     */
    public Builder setEnvironment(ai.chalk.protos.chalk.server.v1.Environment value) {
      if (environmentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        environment_ = value;
      } else {
        environmentBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.server.v1.Environment environment = 1 [json_name = "environment"];</code>
     */
    public Builder setEnvironment(
        ai.chalk.protos.chalk.server.v1.Environment.Builder builderForValue) {
      if (environmentBuilder_ == null) {
        environment_ = builderForValue.build();
      } else {
        environmentBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.server.v1.Environment environment = 1 [json_name = "environment"];</code>
     */
    public Builder mergeEnvironment(ai.chalk.protos.chalk.server.v1.Environment value) {
      if (environmentBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          environment_ != null &&
          environment_ != ai.chalk.protos.chalk.server.v1.Environment.getDefaultInstance()) {
          getEnvironmentBuilder().mergeFrom(value);
        } else {
          environment_ = value;
        }
      } else {
        environmentBuilder_.mergeFrom(value);
      }
      if (environment_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.chalk.server.v1.Environment environment = 1 [json_name = "environment"];</code>
     */
    public Builder clearEnvironment() {
      bitField0_ = (bitField0_ & ~0x00000001);
      environment_ = null;
      if (environmentBuilder_ != null) {
        environmentBuilder_.dispose();
        environmentBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.server.v1.Environment environment = 1 [json_name = "environment"];</code>
     */
    public ai.chalk.protos.chalk.server.v1.Environment.Builder getEnvironmentBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getEnvironmentFieldBuilder().getBuilder();
    }
    /**
     * <code>.chalk.server.v1.Environment environment = 1 [json_name = "environment"];</code>
     */
    public ai.chalk.protos.chalk.server.v1.EnvironmentOrBuilder getEnvironmentOrBuilder() {
      if (environmentBuilder_ != null) {
        return environmentBuilder_.getMessageOrBuilder();
      } else {
        return environment_ == null ?
            ai.chalk.protos.chalk.server.v1.Environment.getDefaultInstance() : environment_;
      }
    }
    /**
     * <code>.chalk.server.v1.Environment environment = 1 [json_name = "environment"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.server.v1.Environment, ai.chalk.protos.chalk.server.v1.Environment.Builder, ai.chalk.protos.chalk.server.v1.EnvironmentOrBuilder> 
        getEnvironmentFieldBuilder() {
      if (environmentBuilder_ == null) {
        environmentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ai.chalk.protos.chalk.server.v1.Environment, ai.chalk.protos.chalk.server.v1.Environment.Builder, ai.chalk.protos.chalk.server.v1.EnvironmentOrBuilder>(
                getEnvironment(),
                getParentForChildren(),
                isClean());
        environment_ = null;
      }
      return environmentBuilder_;
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


    // @@protoc_insertion_point(builder_scope:chalk.server.v1.CreateEnvironmentResponse)
  }

  // @@protoc_insertion_point(class_scope:chalk.server.v1.CreateEnvironmentResponse)
  private static final ai.chalk.protos.chalk.server.v1.CreateEnvironmentResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.server.v1.CreateEnvironmentResponse();
  }

  public static ai.chalk.protos.chalk.server.v1.CreateEnvironmentResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateEnvironmentResponse>
      PARSER = new com.google.protobuf.AbstractParser<CreateEnvironmentResponse>() {
    @java.lang.Override
    public CreateEnvironmentResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateEnvironmentResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateEnvironmentResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.server.v1.CreateEnvironmentResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

