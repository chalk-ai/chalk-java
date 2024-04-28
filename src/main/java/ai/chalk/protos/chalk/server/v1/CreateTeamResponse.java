// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/team.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.chalk.server.v1;

/**
 * Protobuf type {@code chalk.server.v1.CreateTeamResponse}
 */
public final class CreateTeamResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:chalk.server.v1.CreateTeamResponse)
    CreateTeamResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      CreateTeamResponse.class.getName());
  }
  // Use CreateTeamResponse.newBuilder() to construct.
  private CreateTeamResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private CreateTeamResponse() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.server.v1.TeamProto.internal_static_chalk_server_v1_CreateTeamResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.server.v1.TeamProto.internal_static_chalk_server_v1_CreateTeamResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.server.v1.CreateTeamResponse.class, ai.chalk.protos.chalk.server.v1.CreateTeamResponse.Builder.class);
  }

  private int bitField0_;
  public static final int TEAM_FIELD_NUMBER = 1;
  private ai.chalk.protos.chalk.server.v1.Team team_;
  /**
   * <code>.chalk.server.v1.Team team = 1 [json_name = "team"];</code>
   * @return Whether the team field is set.
   */
  @java.lang.Override
  public boolean hasTeam() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.chalk.server.v1.Team team = 1 [json_name = "team"];</code>
   * @return The team.
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.server.v1.Team getTeam() {
    return team_ == null ? ai.chalk.protos.chalk.server.v1.Team.getDefaultInstance() : team_;
  }
  /**
   * <code>.chalk.server.v1.Team team = 1 [json_name = "team"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.server.v1.TeamOrBuilder getTeamOrBuilder() {
    return team_ == null ? ai.chalk.protos.chalk.server.v1.Team.getDefaultInstance() : team_;
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
      output.writeMessage(1, getTeam());
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
        .computeMessageSize(1, getTeam());
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
    if (!(obj instanceof ai.chalk.protos.chalk.server.v1.CreateTeamResponse)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.server.v1.CreateTeamResponse other = (ai.chalk.protos.chalk.server.v1.CreateTeamResponse) obj;

    if (hasTeam() != other.hasTeam()) return false;
    if (hasTeam()) {
      if (!getTeam()
          .equals(other.getTeam())) return false;
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
    if (hasTeam()) {
      hash = (37 * hash) + TEAM_FIELD_NUMBER;
      hash = (53 * hash) + getTeam().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.server.v1.CreateTeamResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.CreateTeamResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.CreateTeamResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.CreateTeamResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.CreateTeamResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.CreateTeamResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.CreateTeamResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.server.v1.CreateTeamResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.server.v1.CreateTeamResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.server.v1.CreateTeamResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.CreateTeamResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.server.v1.CreateTeamResponse parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.server.v1.CreateTeamResponse prototype) {
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
   * Protobuf type {@code chalk.server.v1.CreateTeamResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.server.v1.CreateTeamResponse)
      ai.chalk.protos.chalk.server.v1.CreateTeamResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.server.v1.TeamProto.internal_static_chalk_server_v1_CreateTeamResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.server.v1.TeamProto.internal_static_chalk_server_v1_CreateTeamResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.server.v1.CreateTeamResponse.class, ai.chalk.protos.chalk.server.v1.CreateTeamResponse.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.server.v1.CreateTeamResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage
              .alwaysUseFieldBuilders) {
        getTeamFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      team_ = null;
      if (teamBuilder_ != null) {
        teamBuilder_.dispose();
        teamBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.server.v1.TeamProto.internal_static_chalk_server_v1_CreateTeamResponse_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.CreateTeamResponse getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.server.v1.CreateTeamResponse.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.CreateTeamResponse build() {
      ai.chalk.protos.chalk.server.v1.CreateTeamResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.CreateTeamResponse buildPartial() {
      ai.chalk.protos.chalk.server.v1.CreateTeamResponse result = new ai.chalk.protos.chalk.server.v1.CreateTeamResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.server.v1.CreateTeamResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.team_ = teamBuilder_ == null
            ? team_
            : teamBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ai.chalk.protos.chalk.server.v1.CreateTeamResponse) {
        return mergeFrom((ai.chalk.protos.chalk.server.v1.CreateTeamResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.server.v1.CreateTeamResponse other) {
      if (other == ai.chalk.protos.chalk.server.v1.CreateTeamResponse.getDefaultInstance()) return this;
      if (other.hasTeam()) {
        mergeTeam(other.getTeam());
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
                  getTeamFieldBuilder().getBuilder(),
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

    private ai.chalk.protos.chalk.server.v1.Team team_;
    private com.google.protobuf.SingleFieldBuilder<
        ai.chalk.protos.chalk.server.v1.Team, ai.chalk.protos.chalk.server.v1.Team.Builder, ai.chalk.protos.chalk.server.v1.TeamOrBuilder> teamBuilder_;
    /**
     * <code>.chalk.server.v1.Team team = 1 [json_name = "team"];</code>
     * @return Whether the team field is set.
     */
    public boolean hasTeam() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.chalk.server.v1.Team team = 1 [json_name = "team"];</code>
     * @return The team.
     */
    public ai.chalk.protos.chalk.server.v1.Team getTeam() {
      if (teamBuilder_ == null) {
        return team_ == null ? ai.chalk.protos.chalk.server.v1.Team.getDefaultInstance() : team_;
      } else {
        return teamBuilder_.getMessage();
      }
    }
    /**
     * <code>.chalk.server.v1.Team team = 1 [json_name = "team"];</code>
     */
    public Builder setTeam(ai.chalk.protos.chalk.server.v1.Team value) {
      if (teamBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        team_ = value;
      } else {
        teamBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.server.v1.Team team = 1 [json_name = "team"];</code>
     */
    public Builder setTeam(
        ai.chalk.protos.chalk.server.v1.Team.Builder builderForValue) {
      if (teamBuilder_ == null) {
        team_ = builderForValue.build();
      } else {
        teamBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.server.v1.Team team = 1 [json_name = "team"];</code>
     */
    public Builder mergeTeam(ai.chalk.protos.chalk.server.v1.Team value) {
      if (teamBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          team_ != null &&
          team_ != ai.chalk.protos.chalk.server.v1.Team.getDefaultInstance()) {
          getTeamBuilder().mergeFrom(value);
        } else {
          team_ = value;
        }
      } else {
        teamBuilder_.mergeFrom(value);
      }
      if (team_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.chalk.server.v1.Team team = 1 [json_name = "team"];</code>
     */
    public Builder clearTeam() {
      bitField0_ = (bitField0_ & ~0x00000001);
      team_ = null;
      if (teamBuilder_ != null) {
        teamBuilder_.dispose();
        teamBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.server.v1.Team team = 1 [json_name = "team"];</code>
     */
    public ai.chalk.protos.chalk.server.v1.Team.Builder getTeamBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTeamFieldBuilder().getBuilder();
    }
    /**
     * <code>.chalk.server.v1.Team team = 1 [json_name = "team"];</code>
     */
    public ai.chalk.protos.chalk.server.v1.TeamOrBuilder getTeamOrBuilder() {
      if (teamBuilder_ != null) {
        return teamBuilder_.getMessageOrBuilder();
      } else {
        return team_ == null ?
            ai.chalk.protos.chalk.server.v1.Team.getDefaultInstance() : team_;
      }
    }
    /**
     * <code>.chalk.server.v1.Team team = 1 [json_name = "team"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        ai.chalk.protos.chalk.server.v1.Team, ai.chalk.protos.chalk.server.v1.Team.Builder, ai.chalk.protos.chalk.server.v1.TeamOrBuilder> 
        getTeamFieldBuilder() {
      if (teamBuilder_ == null) {
        teamBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            ai.chalk.protos.chalk.server.v1.Team, ai.chalk.protos.chalk.server.v1.Team.Builder, ai.chalk.protos.chalk.server.v1.TeamOrBuilder>(
                getTeam(),
                getParentForChildren(),
                isClean());
        team_ = null;
      }
      return teamBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:chalk.server.v1.CreateTeamResponse)
  }

  // @@protoc_insertion_point(class_scope:chalk.server.v1.CreateTeamResponse)
  private static final ai.chalk.protos.chalk.server.v1.CreateTeamResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.server.v1.CreateTeamResponse();
  }

  public static ai.chalk.protos.chalk.server.v1.CreateTeamResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateTeamResponse>
      PARSER = new com.google.protobuf.AbstractParser<CreateTeamResponse>() {
    @java.lang.Override
    public CreateTeamResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateTeamResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateTeamResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.server.v1.CreateTeamResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

