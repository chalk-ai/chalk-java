// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/team.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.chalk.server.v1;

/**
 * Protobuf type {@code chalk.server.v1.Project}
 */
public final class Project extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:chalk.server.v1.Project)
    ProjectOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      Project.class.getName());
  }
  // Use Project.newBuilder() to construct.
  private Project(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Project() {
    id_ = "";
    teamId_ = "";
    name_ = "";
    environments_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.server.v1.TeamProto.internal_static_chalk_server_v1_Project_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.server.v1.TeamProto.internal_static_chalk_server_v1_Project_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.server.v1.Project.class, ai.chalk.protos.chalk.server.v1.Project.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object id_ = "";
  /**
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TEAM_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object teamId_ = "";
  /**
   * <code>string team_id = 2 [json_name = "teamId"];</code>
   * @return The teamId.
   */
  @java.lang.Override
  public java.lang.String getTeamId() {
    java.lang.Object ref = teamId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      teamId_ = s;
      return s;
    }
  }
  /**
   * <code>string team_id = 2 [json_name = "teamId"];</code>
   * @return The bytes for teamId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTeamIdBytes() {
    java.lang.Object ref = teamId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      teamId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <code>string name = 3 [json_name = "name"];</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 3 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENVIRONMENTS_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private java.util.List<ai.chalk.protos.chalk.server.v1.Environment> environments_;
  /**
   * <code>repeated .chalk.server.v1.Environment environments = 4 [json_name = "environments"];</code>
   */
  @java.lang.Override
  public java.util.List<ai.chalk.protos.chalk.server.v1.Environment> getEnvironmentsList() {
    return environments_;
  }
  /**
   * <code>repeated .chalk.server.v1.Environment environments = 4 [json_name = "environments"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends ai.chalk.protos.chalk.server.v1.EnvironmentOrBuilder> 
      getEnvironmentsOrBuilderList() {
    return environments_;
  }
  /**
   * <code>repeated .chalk.server.v1.Environment environments = 4 [json_name = "environments"];</code>
   */
  @java.lang.Override
  public int getEnvironmentsCount() {
    return environments_.size();
  }
  /**
   * <code>repeated .chalk.server.v1.Environment environments = 4 [json_name = "environments"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.server.v1.Environment getEnvironments(int index) {
    return environments_.get(index);
  }
  /**
   * <code>repeated .chalk.server.v1.Environment environments = 4 [json_name = "environments"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.server.v1.EnvironmentOrBuilder getEnvironmentsOrBuilder(
      int index) {
    return environments_.get(index);
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(id_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, id_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(teamId_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, teamId_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 3, name_);
    }
    for (int i = 0; i < environments_.size(); i++) {
      output.writeMessage(4, environments_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(id_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, id_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(teamId_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, teamId_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(3, name_);
    }
    for (int i = 0; i < environments_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, environments_.get(i));
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
    if (!(obj instanceof ai.chalk.protos.chalk.server.v1.Project)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.server.v1.Project other = (ai.chalk.protos.chalk.server.v1.Project) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (!getTeamId()
        .equals(other.getTeamId())) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (!getEnvironmentsList()
        .equals(other.getEnvironmentsList())) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + TEAM_ID_FIELD_NUMBER;
    hash = (53 * hash) + getTeamId().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (getEnvironmentsCount() > 0) {
      hash = (37 * hash) + ENVIRONMENTS_FIELD_NUMBER;
      hash = (53 * hash) + getEnvironmentsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.server.v1.Project parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.Project parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.Project parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.Project parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.Project parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.Project parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.Project parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.server.v1.Project parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.server.v1.Project parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.server.v1.Project parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.Project parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.server.v1.Project parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.server.v1.Project prototype) {
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
   * Protobuf type {@code chalk.server.v1.Project}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.server.v1.Project)
      ai.chalk.protos.chalk.server.v1.ProjectOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.server.v1.TeamProto.internal_static_chalk_server_v1_Project_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.server.v1.TeamProto.internal_static_chalk_server_v1_Project_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.server.v1.Project.class, ai.chalk.protos.chalk.server.v1.Project.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.server.v1.Project.newBuilder()
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
      id_ = "";
      teamId_ = "";
      name_ = "";
      if (environmentsBuilder_ == null) {
        environments_ = java.util.Collections.emptyList();
      } else {
        environments_ = null;
        environmentsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.server.v1.TeamProto.internal_static_chalk_server_v1_Project_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.Project getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.server.v1.Project.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.Project build() {
      ai.chalk.protos.chalk.server.v1.Project result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.Project buildPartial() {
      ai.chalk.protos.chalk.server.v1.Project result = new ai.chalk.protos.chalk.server.v1.Project(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(ai.chalk.protos.chalk.server.v1.Project result) {
      if (environmentsBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0)) {
          environments_ = java.util.Collections.unmodifiableList(environments_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.environments_ = environments_;
      } else {
        result.environments_ = environmentsBuilder_.build();
      }
    }

    private void buildPartial0(ai.chalk.protos.chalk.server.v1.Project result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.id_ = id_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.teamId_ = teamId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.name_ = name_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ai.chalk.protos.chalk.server.v1.Project) {
        return mergeFrom((ai.chalk.protos.chalk.server.v1.Project)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.server.v1.Project other) {
      if (other == ai.chalk.protos.chalk.server.v1.Project.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getTeamId().isEmpty()) {
        teamId_ = other.teamId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (environmentsBuilder_ == null) {
        if (!other.environments_.isEmpty()) {
          if (environments_.isEmpty()) {
            environments_ = other.environments_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureEnvironmentsIsMutable();
            environments_.addAll(other.environments_);
          }
          onChanged();
        }
      } else {
        if (!other.environments_.isEmpty()) {
          if (environmentsBuilder_.isEmpty()) {
            environmentsBuilder_.dispose();
            environmentsBuilder_ = null;
            environments_ = other.environments_;
            bitField0_ = (bitField0_ & ~0x00000008);
            environmentsBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getEnvironmentsFieldBuilder() : null;
          } else {
            environmentsBuilder_.addAllMessages(other.environments_);
          }
        }
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
              id_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              teamId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              ai.chalk.protos.chalk.server.v1.Environment m =
                  input.readMessage(
                      ai.chalk.protos.chalk.server.v1.Environment.parser(),
                      extensionRegistry);
              if (environmentsBuilder_ == null) {
                ensureEnvironmentsIsMutable();
                environments_.add(m);
              } else {
                environmentsBuilder_.addMessage(m);
              }
              break;
            } // case 34
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

    private java.lang.Object id_ = "";
    /**
     * <code>string id = 1 [json_name = "id"];</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string id = 1 [json_name = "id"];</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string id = 1 [json_name = "id"];</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1 [json_name = "id"];</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      id_ = getDefaultInstance().getId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1 [json_name = "id"];</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object teamId_ = "";
    /**
     * <code>string team_id = 2 [json_name = "teamId"];</code>
     * @return The teamId.
     */
    public java.lang.String getTeamId() {
      java.lang.Object ref = teamId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        teamId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string team_id = 2 [json_name = "teamId"];</code>
     * @return The bytes for teamId.
     */
    public com.google.protobuf.ByteString
        getTeamIdBytes() {
      java.lang.Object ref = teamId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        teamId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string team_id = 2 [json_name = "teamId"];</code>
     * @param value The teamId to set.
     * @return This builder for chaining.
     */
    public Builder setTeamId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      teamId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string team_id = 2 [json_name = "teamId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTeamId() {
      teamId_ = getDefaultInstance().getTeamId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string team_id = 2 [json_name = "teamId"];</code>
     * @param value The bytes for teamId to set.
     * @return This builder for chaining.
     */
    public Builder setTeamIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      teamId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 3 [json_name = "name"];</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 3 [json_name = "name"];</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 3 [json_name = "name"];</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 3 [json_name = "name"];</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string name = 3 [json_name = "name"];</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.util.List<ai.chalk.protos.chalk.server.v1.Environment> environments_ =
      java.util.Collections.emptyList();
    private void ensureEnvironmentsIsMutable() {
      if (!((bitField0_ & 0x00000008) != 0)) {
        environments_ = new java.util.ArrayList<ai.chalk.protos.chalk.server.v1.Environment>(environments_);
        bitField0_ |= 0x00000008;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        ai.chalk.protos.chalk.server.v1.Environment, ai.chalk.protos.chalk.server.v1.Environment.Builder, ai.chalk.protos.chalk.server.v1.EnvironmentOrBuilder> environmentsBuilder_;

    /**
     * <code>repeated .chalk.server.v1.Environment environments = 4 [json_name = "environments"];</code>
     */
    public java.util.List<ai.chalk.protos.chalk.server.v1.Environment> getEnvironmentsList() {
      if (environmentsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(environments_);
      } else {
        return environmentsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .chalk.server.v1.Environment environments = 4 [json_name = "environments"];</code>
     */
    public int getEnvironmentsCount() {
      if (environmentsBuilder_ == null) {
        return environments_.size();
      } else {
        return environmentsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .chalk.server.v1.Environment environments = 4 [json_name = "environments"];</code>
     */
    public ai.chalk.protos.chalk.server.v1.Environment getEnvironments(int index) {
      if (environmentsBuilder_ == null) {
        return environments_.get(index);
      } else {
        return environmentsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .chalk.server.v1.Environment environments = 4 [json_name = "environments"];</code>
     */
    public Builder setEnvironments(
        int index, ai.chalk.protos.chalk.server.v1.Environment value) {
      if (environmentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEnvironmentsIsMutable();
        environments_.set(index, value);
        onChanged();
      } else {
        environmentsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .chalk.server.v1.Environment environments = 4 [json_name = "environments"];</code>
     */
    public Builder setEnvironments(
        int index, ai.chalk.protos.chalk.server.v1.Environment.Builder builderForValue) {
      if (environmentsBuilder_ == null) {
        ensureEnvironmentsIsMutable();
        environments_.set(index, builderForValue.build());
        onChanged();
      } else {
        environmentsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .chalk.server.v1.Environment environments = 4 [json_name = "environments"];</code>
     */
    public Builder addEnvironments(ai.chalk.protos.chalk.server.v1.Environment value) {
      if (environmentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEnvironmentsIsMutable();
        environments_.add(value);
        onChanged();
      } else {
        environmentsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .chalk.server.v1.Environment environments = 4 [json_name = "environments"];</code>
     */
    public Builder addEnvironments(
        int index, ai.chalk.protos.chalk.server.v1.Environment value) {
      if (environmentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEnvironmentsIsMutable();
        environments_.add(index, value);
        onChanged();
      } else {
        environmentsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .chalk.server.v1.Environment environments = 4 [json_name = "environments"];</code>
     */
    public Builder addEnvironments(
        ai.chalk.protos.chalk.server.v1.Environment.Builder builderForValue) {
      if (environmentsBuilder_ == null) {
        ensureEnvironmentsIsMutable();
        environments_.add(builderForValue.build());
        onChanged();
      } else {
        environmentsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .chalk.server.v1.Environment environments = 4 [json_name = "environments"];</code>
     */
    public Builder addEnvironments(
        int index, ai.chalk.protos.chalk.server.v1.Environment.Builder builderForValue) {
      if (environmentsBuilder_ == null) {
        ensureEnvironmentsIsMutable();
        environments_.add(index, builderForValue.build());
        onChanged();
      } else {
        environmentsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .chalk.server.v1.Environment environments = 4 [json_name = "environments"];</code>
     */
    public Builder addAllEnvironments(
        java.lang.Iterable<? extends ai.chalk.protos.chalk.server.v1.Environment> values) {
      if (environmentsBuilder_ == null) {
        ensureEnvironmentsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, environments_);
        onChanged();
      } else {
        environmentsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .chalk.server.v1.Environment environments = 4 [json_name = "environments"];</code>
     */
    public Builder clearEnvironments() {
      if (environmentsBuilder_ == null) {
        environments_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
      } else {
        environmentsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .chalk.server.v1.Environment environments = 4 [json_name = "environments"];</code>
     */
    public Builder removeEnvironments(int index) {
      if (environmentsBuilder_ == null) {
        ensureEnvironmentsIsMutable();
        environments_.remove(index);
        onChanged();
      } else {
        environmentsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .chalk.server.v1.Environment environments = 4 [json_name = "environments"];</code>
     */
    public ai.chalk.protos.chalk.server.v1.Environment.Builder getEnvironmentsBuilder(
        int index) {
      return getEnvironmentsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .chalk.server.v1.Environment environments = 4 [json_name = "environments"];</code>
     */
    public ai.chalk.protos.chalk.server.v1.EnvironmentOrBuilder getEnvironmentsOrBuilder(
        int index) {
      if (environmentsBuilder_ == null) {
        return environments_.get(index);  } else {
        return environmentsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .chalk.server.v1.Environment environments = 4 [json_name = "environments"];</code>
     */
    public java.util.List<? extends ai.chalk.protos.chalk.server.v1.EnvironmentOrBuilder> 
         getEnvironmentsOrBuilderList() {
      if (environmentsBuilder_ != null) {
        return environmentsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(environments_);
      }
    }
    /**
     * <code>repeated .chalk.server.v1.Environment environments = 4 [json_name = "environments"];</code>
     */
    public ai.chalk.protos.chalk.server.v1.Environment.Builder addEnvironmentsBuilder() {
      return getEnvironmentsFieldBuilder().addBuilder(
          ai.chalk.protos.chalk.server.v1.Environment.getDefaultInstance());
    }
    /**
     * <code>repeated .chalk.server.v1.Environment environments = 4 [json_name = "environments"];</code>
     */
    public ai.chalk.protos.chalk.server.v1.Environment.Builder addEnvironmentsBuilder(
        int index) {
      return getEnvironmentsFieldBuilder().addBuilder(
          index, ai.chalk.protos.chalk.server.v1.Environment.getDefaultInstance());
    }
    /**
     * <code>repeated .chalk.server.v1.Environment environments = 4 [json_name = "environments"];</code>
     */
    public java.util.List<ai.chalk.protos.chalk.server.v1.Environment.Builder> 
         getEnvironmentsBuilderList() {
      return getEnvironmentsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        ai.chalk.protos.chalk.server.v1.Environment, ai.chalk.protos.chalk.server.v1.Environment.Builder, ai.chalk.protos.chalk.server.v1.EnvironmentOrBuilder> 
        getEnvironmentsFieldBuilder() {
      if (environmentsBuilder_ == null) {
        environmentsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            ai.chalk.protos.chalk.server.v1.Environment, ai.chalk.protos.chalk.server.v1.Environment.Builder, ai.chalk.protos.chalk.server.v1.EnvironmentOrBuilder>(
                environments_,
                ((bitField0_ & 0x00000008) != 0),
                getParentForChildren(),
                isClean());
        environments_ = null;
      }
      return environmentsBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:chalk.server.v1.Project)
  }

  // @@protoc_insertion_point(class_scope:chalk.server.v1.Project)
  private static final ai.chalk.protos.chalk.server.v1.Project DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.server.v1.Project();
  }

  public static ai.chalk.protos.chalk.server.v1.Project getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Project>
      PARSER = new com.google.protobuf.AbstractParser<Project>() {
    @java.lang.Override
    public Project parsePartialFrom(
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

  public static com.google.protobuf.Parser<Project> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Project> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.server.v1.Project getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
