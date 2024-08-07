// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/topic.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

/**
 * Protobuf type {@code chalk.server.v1.Topic}
 */
public final class Topic extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chalk.server.v1.Topic)
    TopicOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Topic.newBuilder() to construct.
  private Topic(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Topic() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Topic();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.server.v1.TopicProto.internal_static_chalk_server_v1_Topic_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.server.v1.TopicProto.internal_static_chalk_server_v1_Topic_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.server.v1.Topic.class, ai.chalk.protos.chalk.server.v1.Topic.Builder.class);
  }

  private int topicCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object topic_;
  public enum TopicCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    SQS_TOPIC(1),
    PUBSUB_TOPIC(2),
    TOPIC_NOT_SET(0);
    private final int value;
    private TopicCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static TopicCase valueOf(int value) {
      return forNumber(value);
    }

    public static TopicCase forNumber(int value) {
      switch (value) {
        case 1: return SQS_TOPIC;
        case 2: return PUBSUB_TOPIC;
        case 0: return TOPIC_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public TopicCase
  getTopicCase() {
    return TopicCase.forNumber(
        topicCase_);
  }

  public static final int SQS_TOPIC_FIELD_NUMBER = 1;
  /**
   * <code>.chalk.server.v1.SQSTopic sqs_topic = 1 [json_name = "sqsTopic"];</code>
   * @return Whether the sqsTopic field is set.
   */
  @java.lang.Override
  public boolean hasSqsTopic() {
    return topicCase_ == 1;
  }
  /**
   * <code>.chalk.server.v1.SQSTopic sqs_topic = 1 [json_name = "sqsTopic"];</code>
   * @return The sqsTopic.
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.server.v1.SQSTopic getSqsTopic() {
    if (topicCase_ == 1) {
       return (ai.chalk.protos.chalk.server.v1.SQSTopic) topic_;
    }
    return ai.chalk.protos.chalk.server.v1.SQSTopic.getDefaultInstance();
  }
  /**
   * <code>.chalk.server.v1.SQSTopic sqs_topic = 1 [json_name = "sqsTopic"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.server.v1.SQSTopicOrBuilder getSqsTopicOrBuilder() {
    if (topicCase_ == 1) {
       return (ai.chalk.protos.chalk.server.v1.SQSTopic) topic_;
    }
    return ai.chalk.protos.chalk.server.v1.SQSTopic.getDefaultInstance();
  }

  public static final int PUBSUB_TOPIC_FIELD_NUMBER = 2;
  /**
   * <code>.chalk.server.v1.PubSubTopic pubsub_topic = 2 [json_name = "pubsubTopic"];</code>
   * @return Whether the pubsubTopic field is set.
   */
  @java.lang.Override
  public boolean hasPubsubTopic() {
    return topicCase_ == 2;
  }
  /**
   * <code>.chalk.server.v1.PubSubTopic pubsub_topic = 2 [json_name = "pubsubTopic"];</code>
   * @return The pubsubTopic.
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.server.v1.PubSubTopic getPubsubTopic() {
    if (topicCase_ == 2) {
       return (ai.chalk.protos.chalk.server.v1.PubSubTopic) topic_;
    }
    return ai.chalk.protos.chalk.server.v1.PubSubTopic.getDefaultInstance();
  }
  /**
   * <code>.chalk.server.v1.PubSubTopic pubsub_topic = 2 [json_name = "pubsubTopic"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.server.v1.PubSubTopicOrBuilder getPubsubTopicOrBuilder() {
    if (topicCase_ == 2) {
       return (ai.chalk.protos.chalk.server.v1.PubSubTopic) topic_;
    }
    return ai.chalk.protos.chalk.server.v1.PubSubTopic.getDefaultInstance();
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
    if (topicCase_ == 1) {
      output.writeMessage(1, (ai.chalk.protos.chalk.server.v1.SQSTopic) topic_);
    }
    if (topicCase_ == 2) {
      output.writeMessage(2, (ai.chalk.protos.chalk.server.v1.PubSubTopic) topic_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (topicCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (ai.chalk.protos.chalk.server.v1.SQSTopic) topic_);
    }
    if (topicCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (ai.chalk.protos.chalk.server.v1.PubSubTopic) topic_);
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
    if (!(obj instanceof ai.chalk.protos.chalk.server.v1.Topic)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.server.v1.Topic other = (ai.chalk.protos.chalk.server.v1.Topic) obj;

    if (!getTopicCase().equals(other.getTopicCase())) return false;
    switch (topicCase_) {
      case 1:
        if (!getSqsTopic()
            .equals(other.getSqsTopic())) return false;
        break;
      case 2:
        if (!getPubsubTopic()
            .equals(other.getPubsubTopic())) return false;
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
    switch (topicCase_) {
      case 1:
        hash = (37 * hash) + SQS_TOPIC_FIELD_NUMBER;
        hash = (53 * hash) + getSqsTopic().hashCode();
        break;
      case 2:
        hash = (37 * hash) + PUBSUB_TOPIC_FIELD_NUMBER;
        hash = (53 * hash) + getPubsubTopic().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.server.v1.Topic parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.Topic parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.Topic parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.Topic parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.Topic parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.Topic parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.Topic parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.server.v1.Topic parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.server.v1.Topic parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.server.v1.Topic parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.Topic parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.server.v1.Topic parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.server.v1.Topic prototype) {
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
   * Protobuf type {@code chalk.server.v1.Topic}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.server.v1.Topic)
      ai.chalk.protos.chalk.server.v1.TopicOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.server.v1.TopicProto.internal_static_chalk_server_v1_Topic_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.server.v1.TopicProto.internal_static_chalk_server_v1_Topic_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.server.v1.Topic.class, ai.chalk.protos.chalk.server.v1.Topic.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.server.v1.Topic.newBuilder()
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
      if (sqsTopicBuilder_ != null) {
        sqsTopicBuilder_.clear();
      }
      if (pubsubTopicBuilder_ != null) {
        pubsubTopicBuilder_.clear();
      }
      topicCase_ = 0;
      topic_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.server.v1.TopicProto.internal_static_chalk_server_v1_Topic_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.Topic getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.server.v1.Topic.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.Topic build() {
      ai.chalk.protos.chalk.server.v1.Topic result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.Topic buildPartial() {
      ai.chalk.protos.chalk.server.v1.Topic result = new ai.chalk.protos.chalk.server.v1.Topic(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.server.v1.Topic result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(ai.chalk.protos.chalk.server.v1.Topic result) {
      result.topicCase_ = topicCase_;
      result.topic_ = this.topic_;
      if (topicCase_ == 1 &&
          sqsTopicBuilder_ != null) {
        result.topic_ = sqsTopicBuilder_.build();
      }
      if (topicCase_ == 2 &&
          pubsubTopicBuilder_ != null) {
        result.topic_ = pubsubTopicBuilder_.build();
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
      if (other instanceof ai.chalk.protos.chalk.server.v1.Topic) {
        return mergeFrom((ai.chalk.protos.chalk.server.v1.Topic)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.server.v1.Topic other) {
      if (other == ai.chalk.protos.chalk.server.v1.Topic.getDefaultInstance()) return this;
      switch (other.getTopicCase()) {
        case SQS_TOPIC: {
          mergeSqsTopic(other.getSqsTopic());
          break;
        }
        case PUBSUB_TOPIC: {
          mergePubsubTopic(other.getPubsubTopic());
          break;
        }
        case TOPIC_NOT_SET: {
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
                  getSqsTopicFieldBuilder().getBuilder(),
                  extensionRegistry);
              topicCase_ = 1;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getPubsubTopicFieldBuilder().getBuilder(),
                  extensionRegistry);
              topicCase_ = 2;
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
    private int topicCase_ = 0;
    private java.lang.Object topic_;
    public TopicCase
        getTopicCase() {
      return TopicCase.forNumber(
          topicCase_);
    }

    public Builder clearTopic() {
      topicCase_ = 0;
      topic_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.server.v1.SQSTopic, ai.chalk.protos.chalk.server.v1.SQSTopic.Builder, ai.chalk.protos.chalk.server.v1.SQSTopicOrBuilder> sqsTopicBuilder_;
    /**
     * <code>.chalk.server.v1.SQSTopic sqs_topic = 1 [json_name = "sqsTopic"];</code>
     * @return Whether the sqsTopic field is set.
     */
    @java.lang.Override
    public boolean hasSqsTopic() {
      return topicCase_ == 1;
    }
    /**
     * <code>.chalk.server.v1.SQSTopic sqs_topic = 1 [json_name = "sqsTopic"];</code>
     * @return The sqsTopic.
     */
    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.SQSTopic getSqsTopic() {
      if (sqsTopicBuilder_ == null) {
        if (topicCase_ == 1) {
          return (ai.chalk.protos.chalk.server.v1.SQSTopic) topic_;
        }
        return ai.chalk.protos.chalk.server.v1.SQSTopic.getDefaultInstance();
      } else {
        if (topicCase_ == 1) {
          return sqsTopicBuilder_.getMessage();
        }
        return ai.chalk.protos.chalk.server.v1.SQSTopic.getDefaultInstance();
      }
    }
    /**
     * <code>.chalk.server.v1.SQSTopic sqs_topic = 1 [json_name = "sqsTopic"];</code>
     */
    public Builder setSqsTopic(ai.chalk.protos.chalk.server.v1.SQSTopic value) {
      if (sqsTopicBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        topic_ = value;
        onChanged();
      } else {
        sqsTopicBuilder_.setMessage(value);
      }
      topicCase_ = 1;
      return this;
    }
    /**
     * <code>.chalk.server.v1.SQSTopic sqs_topic = 1 [json_name = "sqsTopic"];</code>
     */
    public Builder setSqsTopic(
        ai.chalk.protos.chalk.server.v1.SQSTopic.Builder builderForValue) {
      if (sqsTopicBuilder_ == null) {
        topic_ = builderForValue.build();
        onChanged();
      } else {
        sqsTopicBuilder_.setMessage(builderForValue.build());
      }
      topicCase_ = 1;
      return this;
    }
    /**
     * <code>.chalk.server.v1.SQSTopic sqs_topic = 1 [json_name = "sqsTopic"];</code>
     */
    public Builder mergeSqsTopic(ai.chalk.protos.chalk.server.v1.SQSTopic value) {
      if (sqsTopicBuilder_ == null) {
        if (topicCase_ == 1 &&
            topic_ != ai.chalk.protos.chalk.server.v1.SQSTopic.getDefaultInstance()) {
          topic_ = ai.chalk.protos.chalk.server.v1.SQSTopic.newBuilder((ai.chalk.protos.chalk.server.v1.SQSTopic) topic_)
              .mergeFrom(value).buildPartial();
        } else {
          topic_ = value;
        }
        onChanged();
      } else {
        if (topicCase_ == 1) {
          sqsTopicBuilder_.mergeFrom(value);
        } else {
          sqsTopicBuilder_.setMessage(value);
        }
      }
      topicCase_ = 1;
      return this;
    }
    /**
     * <code>.chalk.server.v1.SQSTopic sqs_topic = 1 [json_name = "sqsTopic"];</code>
     */
    public Builder clearSqsTopic() {
      if (sqsTopicBuilder_ == null) {
        if (topicCase_ == 1) {
          topicCase_ = 0;
          topic_ = null;
          onChanged();
        }
      } else {
        if (topicCase_ == 1) {
          topicCase_ = 0;
          topic_ = null;
        }
        sqsTopicBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.chalk.server.v1.SQSTopic sqs_topic = 1 [json_name = "sqsTopic"];</code>
     */
    public ai.chalk.protos.chalk.server.v1.SQSTopic.Builder getSqsTopicBuilder() {
      return getSqsTopicFieldBuilder().getBuilder();
    }
    /**
     * <code>.chalk.server.v1.SQSTopic sqs_topic = 1 [json_name = "sqsTopic"];</code>
     */
    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.SQSTopicOrBuilder getSqsTopicOrBuilder() {
      if ((topicCase_ == 1) && (sqsTopicBuilder_ != null)) {
        return sqsTopicBuilder_.getMessageOrBuilder();
      } else {
        if (topicCase_ == 1) {
          return (ai.chalk.protos.chalk.server.v1.SQSTopic) topic_;
        }
        return ai.chalk.protos.chalk.server.v1.SQSTopic.getDefaultInstance();
      }
    }
    /**
     * <code>.chalk.server.v1.SQSTopic sqs_topic = 1 [json_name = "sqsTopic"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.server.v1.SQSTopic, ai.chalk.protos.chalk.server.v1.SQSTopic.Builder, ai.chalk.protos.chalk.server.v1.SQSTopicOrBuilder> 
        getSqsTopicFieldBuilder() {
      if (sqsTopicBuilder_ == null) {
        if (!(topicCase_ == 1)) {
          topic_ = ai.chalk.protos.chalk.server.v1.SQSTopic.getDefaultInstance();
        }
        sqsTopicBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ai.chalk.protos.chalk.server.v1.SQSTopic, ai.chalk.protos.chalk.server.v1.SQSTopic.Builder, ai.chalk.protos.chalk.server.v1.SQSTopicOrBuilder>(
                (ai.chalk.protos.chalk.server.v1.SQSTopic) topic_,
                getParentForChildren(),
                isClean());
        topic_ = null;
      }
      topicCase_ = 1;
      onChanged();
      return sqsTopicBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.server.v1.PubSubTopic, ai.chalk.protos.chalk.server.v1.PubSubTopic.Builder, ai.chalk.protos.chalk.server.v1.PubSubTopicOrBuilder> pubsubTopicBuilder_;
    /**
     * <code>.chalk.server.v1.PubSubTopic pubsub_topic = 2 [json_name = "pubsubTopic"];</code>
     * @return Whether the pubsubTopic field is set.
     */
    @java.lang.Override
    public boolean hasPubsubTopic() {
      return topicCase_ == 2;
    }
    /**
     * <code>.chalk.server.v1.PubSubTopic pubsub_topic = 2 [json_name = "pubsubTopic"];</code>
     * @return The pubsubTopic.
     */
    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.PubSubTopic getPubsubTopic() {
      if (pubsubTopicBuilder_ == null) {
        if (topicCase_ == 2) {
          return (ai.chalk.protos.chalk.server.v1.PubSubTopic) topic_;
        }
        return ai.chalk.protos.chalk.server.v1.PubSubTopic.getDefaultInstance();
      } else {
        if (topicCase_ == 2) {
          return pubsubTopicBuilder_.getMessage();
        }
        return ai.chalk.protos.chalk.server.v1.PubSubTopic.getDefaultInstance();
      }
    }
    /**
     * <code>.chalk.server.v1.PubSubTopic pubsub_topic = 2 [json_name = "pubsubTopic"];</code>
     */
    public Builder setPubsubTopic(ai.chalk.protos.chalk.server.v1.PubSubTopic value) {
      if (pubsubTopicBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        topic_ = value;
        onChanged();
      } else {
        pubsubTopicBuilder_.setMessage(value);
      }
      topicCase_ = 2;
      return this;
    }
    /**
     * <code>.chalk.server.v1.PubSubTopic pubsub_topic = 2 [json_name = "pubsubTopic"];</code>
     */
    public Builder setPubsubTopic(
        ai.chalk.protos.chalk.server.v1.PubSubTopic.Builder builderForValue) {
      if (pubsubTopicBuilder_ == null) {
        topic_ = builderForValue.build();
        onChanged();
      } else {
        pubsubTopicBuilder_.setMessage(builderForValue.build());
      }
      topicCase_ = 2;
      return this;
    }
    /**
     * <code>.chalk.server.v1.PubSubTopic pubsub_topic = 2 [json_name = "pubsubTopic"];</code>
     */
    public Builder mergePubsubTopic(ai.chalk.protos.chalk.server.v1.PubSubTopic value) {
      if (pubsubTopicBuilder_ == null) {
        if (topicCase_ == 2 &&
            topic_ != ai.chalk.protos.chalk.server.v1.PubSubTopic.getDefaultInstance()) {
          topic_ = ai.chalk.protos.chalk.server.v1.PubSubTopic.newBuilder((ai.chalk.protos.chalk.server.v1.PubSubTopic) topic_)
              .mergeFrom(value).buildPartial();
        } else {
          topic_ = value;
        }
        onChanged();
      } else {
        if (topicCase_ == 2) {
          pubsubTopicBuilder_.mergeFrom(value);
        } else {
          pubsubTopicBuilder_.setMessage(value);
        }
      }
      topicCase_ = 2;
      return this;
    }
    /**
     * <code>.chalk.server.v1.PubSubTopic pubsub_topic = 2 [json_name = "pubsubTopic"];</code>
     */
    public Builder clearPubsubTopic() {
      if (pubsubTopicBuilder_ == null) {
        if (topicCase_ == 2) {
          topicCase_ = 0;
          topic_ = null;
          onChanged();
        }
      } else {
        if (topicCase_ == 2) {
          topicCase_ = 0;
          topic_ = null;
        }
        pubsubTopicBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.chalk.server.v1.PubSubTopic pubsub_topic = 2 [json_name = "pubsubTopic"];</code>
     */
    public ai.chalk.protos.chalk.server.v1.PubSubTopic.Builder getPubsubTopicBuilder() {
      return getPubsubTopicFieldBuilder().getBuilder();
    }
    /**
     * <code>.chalk.server.v1.PubSubTopic pubsub_topic = 2 [json_name = "pubsubTopic"];</code>
     */
    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.PubSubTopicOrBuilder getPubsubTopicOrBuilder() {
      if ((topicCase_ == 2) && (pubsubTopicBuilder_ != null)) {
        return pubsubTopicBuilder_.getMessageOrBuilder();
      } else {
        if (topicCase_ == 2) {
          return (ai.chalk.protos.chalk.server.v1.PubSubTopic) topic_;
        }
        return ai.chalk.protos.chalk.server.v1.PubSubTopic.getDefaultInstance();
      }
    }
    /**
     * <code>.chalk.server.v1.PubSubTopic pubsub_topic = 2 [json_name = "pubsubTopic"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.server.v1.PubSubTopic, ai.chalk.protos.chalk.server.v1.PubSubTopic.Builder, ai.chalk.protos.chalk.server.v1.PubSubTopicOrBuilder> 
        getPubsubTopicFieldBuilder() {
      if (pubsubTopicBuilder_ == null) {
        if (!(topicCase_ == 2)) {
          topic_ = ai.chalk.protos.chalk.server.v1.PubSubTopic.getDefaultInstance();
        }
        pubsubTopicBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ai.chalk.protos.chalk.server.v1.PubSubTopic, ai.chalk.protos.chalk.server.v1.PubSubTopic.Builder, ai.chalk.protos.chalk.server.v1.PubSubTopicOrBuilder>(
                (ai.chalk.protos.chalk.server.v1.PubSubTopic) topic_,
                getParentForChildren(),
                isClean());
        topic_ = null;
      }
      topicCase_ = 2;
      onChanged();
      return pubsubTopicBuilder_;
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


    // @@protoc_insertion_point(builder_scope:chalk.server.v1.Topic)
  }

  // @@protoc_insertion_point(class_scope:chalk.server.v1.Topic)
  private static final ai.chalk.protos.chalk.server.v1.Topic DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.server.v1.Topic();
  }

  public static ai.chalk.protos.chalk.server.v1.Topic getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Topic>
      PARSER = new com.google.protobuf.AbstractParser<Topic>() {
    @java.lang.Override
    public Topic parsePartialFrom(
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

  public static com.google.protobuf.Parser<Topic> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Topic> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.server.v1.Topic getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

