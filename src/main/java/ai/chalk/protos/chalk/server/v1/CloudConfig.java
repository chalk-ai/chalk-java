// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/environment.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

/**
 * Protobuf type {@code chalk.server.v1.CloudConfig}
 */
public final class CloudConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chalk.server.v1.CloudConfig)
    CloudConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CloudConfig.newBuilder() to construct.
  private CloudConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CloudConfig() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CloudConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.server.v1.EnvironmentProto.internal_static_chalk_server_v1_CloudConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.server.v1.EnvironmentProto.internal_static_chalk_server_v1_CloudConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.server.v1.CloudConfig.class, ai.chalk.protos.chalk.server.v1.CloudConfig.Builder.class);
  }

  private int configCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object config_;
  public enum ConfigCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    AWS(1),
    GCP(2),
    CONFIG_NOT_SET(0);
    private final int value;
    private ConfigCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ConfigCase valueOf(int value) {
      return forNumber(value);
    }

    public static ConfigCase forNumber(int value) {
      switch (value) {
        case 1: return AWS;
        case 2: return GCP;
        case 0: return CONFIG_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ConfigCase
  getConfigCase() {
    return ConfigCase.forNumber(
        configCase_);
  }

  public static final int AWS_FIELD_NUMBER = 1;
  /**
   * <code>.chalk.server.v1.AWSCloudConfig aws = 1 [json_name = "aws"];</code>
   * @return Whether the aws field is set.
   */
  @java.lang.Override
  public boolean hasAws() {
    return configCase_ == 1;
  }
  /**
   * <code>.chalk.server.v1.AWSCloudConfig aws = 1 [json_name = "aws"];</code>
   * @return The aws.
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.server.v1.AWSCloudConfig getAws() {
    if (configCase_ == 1) {
       return (ai.chalk.protos.chalk.server.v1.AWSCloudConfig) config_;
    }
    return ai.chalk.protos.chalk.server.v1.AWSCloudConfig.getDefaultInstance();
  }
  /**
   * <code>.chalk.server.v1.AWSCloudConfig aws = 1 [json_name = "aws"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.server.v1.AWSCloudConfigOrBuilder getAwsOrBuilder() {
    if (configCase_ == 1) {
       return (ai.chalk.protos.chalk.server.v1.AWSCloudConfig) config_;
    }
    return ai.chalk.protos.chalk.server.v1.AWSCloudConfig.getDefaultInstance();
  }

  public static final int GCP_FIELD_NUMBER = 2;
  /**
   * <code>.chalk.server.v1.GCPCloudConfig gcp = 2 [json_name = "gcp"];</code>
   * @return Whether the gcp field is set.
   */
  @java.lang.Override
  public boolean hasGcp() {
    return configCase_ == 2;
  }
  /**
   * <code>.chalk.server.v1.GCPCloudConfig gcp = 2 [json_name = "gcp"];</code>
   * @return The gcp.
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.server.v1.GCPCloudConfig getGcp() {
    if (configCase_ == 2) {
       return (ai.chalk.protos.chalk.server.v1.GCPCloudConfig) config_;
    }
    return ai.chalk.protos.chalk.server.v1.GCPCloudConfig.getDefaultInstance();
  }
  /**
   * <code>.chalk.server.v1.GCPCloudConfig gcp = 2 [json_name = "gcp"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.server.v1.GCPCloudConfigOrBuilder getGcpOrBuilder() {
    if (configCase_ == 2) {
       return (ai.chalk.protos.chalk.server.v1.GCPCloudConfig) config_;
    }
    return ai.chalk.protos.chalk.server.v1.GCPCloudConfig.getDefaultInstance();
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
    if (configCase_ == 1) {
      output.writeMessage(1, (ai.chalk.protos.chalk.server.v1.AWSCloudConfig) config_);
    }
    if (configCase_ == 2) {
      output.writeMessage(2, (ai.chalk.protos.chalk.server.v1.GCPCloudConfig) config_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (configCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (ai.chalk.protos.chalk.server.v1.AWSCloudConfig) config_);
    }
    if (configCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (ai.chalk.protos.chalk.server.v1.GCPCloudConfig) config_);
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
    if (!(obj instanceof ai.chalk.protos.chalk.server.v1.CloudConfig)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.server.v1.CloudConfig other = (ai.chalk.protos.chalk.server.v1.CloudConfig) obj;

    if (!getConfigCase().equals(other.getConfigCase())) return false;
    switch (configCase_) {
      case 1:
        if (!getAws()
            .equals(other.getAws())) return false;
        break;
      case 2:
        if (!getGcp()
            .equals(other.getGcp())) return false;
        break;
      case 0:
      default:
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
    switch (configCase_) {
      case 1:
        hash = (37 * hash) + AWS_FIELD_NUMBER;
        hash = (53 * hash) + getAws().hashCode();
        break;
      case 2:
        hash = (37 * hash) + GCP_FIELD_NUMBER;
        hash = (53 * hash) + getGcp().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.server.v1.CloudConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.CloudConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.CloudConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.CloudConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.CloudConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.CloudConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.CloudConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.server.v1.CloudConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.server.v1.CloudConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.server.v1.CloudConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.CloudConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.server.v1.CloudConfig parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.server.v1.CloudConfig prototype) {
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
   * Protobuf type {@code chalk.server.v1.CloudConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.server.v1.CloudConfig)
      ai.chalk.protos.chalk.server.v1.CloudConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.server.v1.EnvironmentProto.internal_static_chalk_server_v1_CloudConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.server.v1.EnvironmentProto.internal_static_chalk_server_v1_CloudConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.server.v1.CloudConfig.class, ai.chalk.protos.chalk.server.v1.CloudConfig.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.server.v1.CloudConfig.newBuilder()
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
      if (awsBuilder_ != null) {
        awsBuilder_.clear();
      }
      if (gcpBuilder_ != null) {
        gcpBuilder_.clear();
      }
      configCase_ = 0;
      config_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.server.v1.EnvironmentProto.internal_static_chalk_server_v1_CloudConfig_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.CloudConfig getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.server.v1.CloudConfig.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.CloudConfig build() {
      ai.chalk.protos.chalk.server.v1.CloudConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.CloudConfig buildPartial() {
      ai.chalk.protos.chalk.server.v1.CloudConfig result = new ai.chalk.protos.chalk.server.v1.CloudConfig(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.server.v1.CloudConfig result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(ai.chalk.protos.chalk.server.v1.CloudConfig result) {
      result.configCase_ = configCase_;
      result.config_ = this.config_;
      if (configCase_ == 1 &&
          awsBuilder_ != null) {
        result.config_ = awsBuilder_.build();
      }
      if (configCase_ == 2 &&
          gcpBuilder_ != null) {
        result.config_ = gcpBuilder_.build();
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
      if (other instanceof ai.chalk.protos.chalk.server.v1.CloudConfig) {
        return mergeFrom((ai.chalk.protos.chalk.server.v1.CloudConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.server.v1.CloudConfig other) {
      if (other == ai.chalk.protos.chalk.server.v1.CloudConfig.getDefaultInstance()) return this;
      switch (other.getConfigCase()) {
        case AWS: {
          mergeAws(other.getAws());
          break;
        }
        case GCP: {
          mergeGcp(other.getGcp());
          break;
        }
        case CONFIG_NOT_SET: {
          break;
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
              input.readMessage(
                  getAwsFieldBuilder().getBuilder(),
                  extensionRegistry);
              configCase_ = 1;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getGcpFieldBuilder().getBuilder(),
                  extensionRegistry);
              configCase_ = 2;
              break;
            } // case 18
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
    private int configCase_ = 0;
    private java.lang.Object config_;
    public ConfigCase
        getConfigCase() {
      return ConfigCase.forNumber(
          configCase_);
    }

    public Builder clearConfig() {
      configCase_ = 0;
      config_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.server.v1.AWSCloudConfig, ai.chalk.protos.chalk.server.v1.AWSCloudConfig.Builder, ai.chalk.protos.chalk.server.v1.AWSCloudConfigOrBuilder> awsBuilder_;
    /**
     * <code>.chalk.server.v1.AWSCloudConfig aws = 1 [json_name = "aws"];</code>
     * @return Whether the aws field is set.
     */
    @java.lang.Override
    public boolean hasAws() {
      return configCase_ == 1;
    }
    /**
     * <code>.chalk.server.v1.AWSCloudConfig aws = 1 [json_name = "aws"];</code>
     * @return The aws.
     */
    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.AWSCloudConfig getAws() {
      if (awsBuilder_ == null) {
        if (configCase_ == 1) {
          return (ai.chalk.protos.chalk.server.v1.AWSCloudConfig) config_;
        }
        return ai.chalk.protos.chalk.server.v1.AWSCloudConfig.getDefaultInstance();
      } else {
        if (configCase_ == 1) {
          return awsBuilder_.getMessage();
        }
        return ai.chalk.protos.chalk.server.v1.AWSCloudConfig.getDefaultInstance();
      }
    }
    /**
     * <code>.chalk.server.v1.AWSCloudConfig aws = 1 [json_name = "aws"];</code>
     */
    public Builder setAws(ai.chalk.protos.chalk.server.v1.AWSCloudConfig value) {
      if (awsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        config_ = value;
        onChanged();
      } else {
        awsBuilder_.setMessage(value);
      }
      configCase_ = 1;
      return this;
    }
    /**
     * <code>.chalk.server.v1.AWSCloudConfig aws = 1 [json_name = "aws"];</code>
     */
    public Builder setAws(
        ai.chalk.protos.chalk.server.v1.AWSCloudConfig.Builder builderForValue) {
      if (awsBuilder_ == null) {
        config_ = builderForValue.build();
        onChanged();
      } else {
        awsBuilder_.setMessage(builderForValue.build());
      }
      configCase_ = 1;
      return this;
    }
    /**
     * <code>.chalk.server.v1.AWSCloudConfig aws = 1 [json_name = "aws"];</code>
     */
    public Builder mergeAws(ai.chalk.protos.chalk.server.v1.AWSCloudConfig value) {
      if (awsBuilder_ == null) {
        if (configCase_ == 1 &&
            config_ != ai.chalk.protos.chalk.server.v1.AWSCloudConfig.getDefaultInstance()) {
          config_ = ai.chalk.protos.chalk.server.v1.AWSCloudConfig.newBuilder((ai.chalk.protos.chalk.server.v1.AWSCloudConfig) config_)
              .mergeFrom(value).buildPartial();
        } else {
          config_ = value;
        }
        onChanged();
      } else {
        if (configCase_ == 1) {
          awsBuilder_.mergeFrom(value);
        } else {
          awsBuilder_.setMessage(value);
        }
      }
      configCase_ = 1;
      return this;
    }
    /**
     * <code>.chalk.server.v1.AWSCloudConfig aws = 1 [json_name = "aws"];</code>
     */
    public Builder clearAws() {
      if (awsBuilder_ == null) {
        if (configCase_ == 1) {
          configCase_ = 0;
          config_ = null;
          onChanged();
        }
      } else {
        if (configCase_ == 1) {
          configCase_ = 0;
          config_ = null;
        }
        awsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.chalk.server.v1.AWSCloudConfig aws = 1 [json_name = "aws"];</code>
     */
    public ai.chalk.protos.chalk.server.v1.AWSCloudConfig.Builder getAwsBuilder() {
      return getAwsFieldBuilder().getBuilder();
    }
    /**
     * <code>.chalk.server.v1.AWSCloudConfig aws = 1 [json_name = "aws"];</code>
     */
    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.AWSCloudConfigOrBuilder getAwsOrBuilder() {
      if ((configCase_ == 1) && (awsBuilder_ != null)) {
        return awsBuilder_.getMessageOrBuilder();
      } else {
        if (configCase_ == 1) {
          return (ai.chalk.protos.chalk.server.v1.AWSCloudConfig) config_;
        }
        return ai.chalk.protos.chalk.server.v1.AWSCloudConfig.getDefaultInstance();
      }
    }
    /**
     * <code>.chalk.server.v1.AWSCloudConfig aws = 1 [json_name = "aws"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.server.v1.AWSCloudConfig, ai.chalk.protos.chalk.server.v1.AWSCloudConfig.Builder, ai.chalk.protos.chalk.server.v1.AWSCloudConfigOrBuilder> 
        getAwsFieldBuilder() {
      if (awsBuilder_ == null) {
        if (!(configCase_ == 1)) {
          config_ = ai.chalk.protos.chalk.server.v1.AWSCloudConfig.getDefaultInstance();
        }
        awsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ai.chalk.protos.chalk.server.v1.AWSCloudConfig, ai.chalk.protos.chalk.server.v1.AWSCloudConfig.Builder, ai.chalk.protos.chalk.server.v1.AWSCloudConfigOrBuilder>(
                (ai.chalk.protos.chalk.server.v1.AWSCloudConfig) config_,
                getParentForChildren(),
                isClean());
        config_ = null;
      }
      configCase_ = 1;
      onChanged();
      return awsBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.server.v1.GCPCloudConfig, ai.chalk.protos.chalk.server.v1.GCPCloudConfig.Builder, ai.chalk.protos.chalk.server.v1.GCPCloudConfigOrBuilder> gcpBuilder_;
    /**
     * <code>.chalk.server.v1.GCPCloudConfig gcp = 2 [json_name = "gcp"];</code>
     * @return Whether the gcp field is set.
     */
    @java.lang.Override
    public boolean hasGcp() {
      return configCase_ == 2;
    }
    /**
     * <code>.chalk.server.v1.GCPCloudConfig gcp = 2 [json_name = "gcp"];</code>
     * @return The gcp.
     */
    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.GCPCloudConfig getGcp() {
      if (gcpBuilder_ == null) {
        if (configCase_ == 2) {
          return (ai.chalk.protos.chalk.server.v1.GCPCloudConfig) config_;
        }
        return ai.chalk.protos.chalk.server.v1.GCPCloudConfig.getDefaultInstance();
      } else {
        if (configCase_ == 2) {
          return gcpBuilder_.getMessage();
        }
        return ai.chalk.protos.chalk.server.v1.GCPCloudConfig.getDefaultInstance();
      }
    }
    /**
     * <code>.chalk.server.v1.GCPCloudConfig gcp = 2 [json_name = "gcp"];</code>
     */
    public Builder setGcp(ai.chalk.protos.chalk.server.v1.GCPCloudConfig value) {
      if (gcpBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        config_ = value;
        onChanged();
      } else {
        gcpBuilder_.setMessage(value);
      }
      configCase_ = 2;
      return this;
    }
    /**
     * <code>.chalk.server.v1.GCPCloudConfig gcp = 2 [json_name = "gcp"];</code>
     */
    public Builder setGcp(
        ai.chalk.protos.chalk.server.v1.GCPCloudConfig.Builder builderForValue) {
      if (gcpBuilder_ == null) {
        config_ = builderForValue.build();
        onChanged();
      } else {
        gcpBuilder_.setMessage(builderForValue.build());
      }
      configCase_ = 2;
      return this;
    }
    /**
     * <code>.chalk.server.v1.GCPCloudConfig gcp = 2 [json_name = "gcp"];</code>
     */
    public Builder mergeGcp(ai.chalk.protos.chalk.server.v1.GCPCloudConfig value) {
      if (gcpBuilder_ == null) {
        if (configCase_ == 2 &&
            config_ != ai.chalk.protos.chalk.server.v1.GCPCloudConfig.getDefaultInstance()) {
          config_ = ai.chalk.protos.chalk.server.v1.GCPCloudConfig.newBuilder((ai.chalk.protos.chalk.server.v1.GCPCloudConfig) config_)
              .mergeFrom(value).buildPartial();
        } else {
          config_ = value;
        }
        onChanged();
      } else {
        if (configCase_ == 2) {
          gcpBuilder_.mergeFrom(value);
        } else {
          gcpBuilder_.setMessage(value);
        }
      }
      configCase_ = 2;
      return this;
    }
    /**
     * <code>.chalk.server.v1.GCPCloudConfig gcp = 2 [json_name = "gcp"];</code>
     */
    public Builder clearGcp() {
      if (gcpBuilder_ == null) {
        if (configCase_ == 2) {
          configCase_ = 0;
          config_ = null;
          onChanged();
        }
      } else {
        if (configCase_ == 2) {
          configCase_ = 0;
          config_ = null;
        }
        gcpBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.chalk.server.v1.GCPCloudConfig gcp = 2 [json_name = "gcp"];</code>
     */
    public ai.chalk.protos.chalk.server.v1.GCPCloudConfig.Builder getGcpBuilder() {
      return getGcpFieldBuilder().getBuilder();
    }
    /**
     * <code>.chalk.server.v1.GCPCloudConfig gcp = 2 [json_name = "gcp"];</code>
     */
    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.GCPCloudConfigOrBuilder getGcpOrBuilder() {
      if ((configCase_ == 2) && (gcpBuilder_ != null)) {
        return gcpBuilder_.getMessageOrBuilder();
      } else {
        if (configCase_ == 2) {
          return (ai.chalk.protos.chalk.server.v1.GCPCloudConfig) config_;
        }
        return ai.chalk.protos.chalk.server.v1.GCPCloudConfig.getDefaultInstance();
      }
    }
    /**
     * <code>.chalk.server.v1.GCPCloudConfig gcp = 2 [json_name = "gcp"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.server.v1.GCPCloudConfig, ai.chalk.protos.chalk.server.v1.GCPCloudConfig.Builder, ai.chalk.protos.chalk.server.v1.GCPCloudConfigOrBuilder> 
        getGcpFieldBuilder() {
      if (gcpBuilder_ == null) {
        if (!(configCase_ == 2)) {
          config_ = ai.chalk.protos.chalk.server.v1.GCPCloudConfig.getDefaultInstance();
        }
        gcpBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ai.chalk.protos.chalk.server.v1.GCPCloudConfig, ai.chalk.protos.chalk.server.v1.GCPCloudConfig.Builder, ai.chalk.protos.chalk.server.v1.GCPCloudConfigOrBuilder>(
                (ai.chalk.protos.chalk.server.v1.GCPCloudConfig) config_,
                getParentForChildren(),
                isClean());
        config_ = null;
      }
      configCase_ = 2;
      onChanged();
      return gcpBuilder_;
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


    // @@protoc_insertion_point(builder_scope:chalk.server.v1.CloudConfig)
  }

  // @@protoc_insertion_point(class_scope:chalk.server.v1.CloudConfig)
  private static final ai.chalk.protos.chalk.server.v1.CloudConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.server.v1.CloudConfig();
  }

  public static ai.chalk.protos.chalk.server.v1.CloudConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CloudConfig>
      PARSER = new com.google.protobuf.AbstractParser<CloudConfig>() {
    @java.lang.Override
    public CloudConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<CloudConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CloudConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.server.v1.CloudConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

