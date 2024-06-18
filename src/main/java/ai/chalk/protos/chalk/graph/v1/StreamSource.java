// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/graph/v1/sources.proto

// Protobuf Java Version: 3.25.3
package ai.chalk.protos.chalk.graph.v1;

/**
 * Protobuf type {@code chalk.graph.v1.StreamSource}
 */
public final class StreamSource extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chalk.graph.v1.StreamSource)
    StreamSourceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StreamSource.newBuilder() to construct.
  private StreamSource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StreamSource() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StreamSource();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.graph.v1.SourcesProto.internal_static_chalk_graph_v1_StreamSource_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.graph.v1.SourcesProto.internal_static_chalk_graph_v1_StreamSource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.graph.v1.StreamSource.class, ai.chalk.protos.chalk.graph.v1.StreamSource.Builder.class);
  }

  private int sourceCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object source_;
  public enum SourceCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    KAFKA(1),
    KINESIS(2),
    SOURCE_NOT_SET(0);
    private final int value;
    private SourceCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static SourceCase valueOf(int value) {
      return forNumber(value);
    }

    public static SourceCase forNumber(int value) {
      switch (value) {
        case 1: return KAFKA;
        case 2: return KINESIS;
        case 0: return SOURCE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public SourceCase
  getSourceCase() {
    return SourceCase.forNumber(
        sourceCase_);
  }

  public static final int KAFKA_FIELD_NUMBER = 1;
  /**
   * <code>.chalk.graph.v1.KafkaSource kafka = 1 [json_name = "kafka"];</code>
   * @return Whether the kafka field is set.
   */
  @java.lang.Override
  public boolean hasKafka() {
    return sourceCase_ == 1;
  }
  /**
   * <code>.chalk.graph.v1.KafkaSource kafka = 1 [json_name = "kafka"];</code>
   * @return The kafka.
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.graph.v1.KafkaSource getKafka() {
    if (sourceCase_ == 1) {
       return (ai.chalk.protos.chalk.graph.v1.KafkaSource) source_;
    }
    return ai.chalk.protos.chalk.graph.v1.KafkaSource.getDefaultInstance();
  }
  /**
   * <code>.chalk.graph.v1.KafkaSource kafka = 1 [json_name = "kafka"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.graph.v1.KafkaSourceOrBuilder getKafkaOrBuilder() {
    if (sourceCase_ == 1) {
       return (ai.chalk.protos.chalk.graph.v1.KafkaSource) source_;
    }
    return ai.chalk.protos.chalk.graph.v1.KafkaSource.getDefaultInstance();
  }

  public static final int KINESIS_FIELD_NUMBER = 2;
  /**
   * <code>.chalk.graph.v1.KinesisSource kinesis = 2 [json_name = "kinesis"];</code>
   * @return Whether the kinesis field is set.
   */
  @java.lang.Override
  public boolean hasKinesis() {
    return sourceCase_ == 2;
  }
  /**
   * <code>.chalk.graph.v1.KinesisSource kinesis = 2 [json_name = "kinesis"];</code>
   * @return The kinesis.
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.graph.v1.KinesisSource getKinesis() {
    if (sourceCase_ == 2) {
       return (ai.chalk.protos.chalk.graph.v1.KinesisSource) source_;
    }
    return ai.chalk.protos.chalk.graph.v1.KinesisSource.getDefaultInstance();
  }
  /**
   * <code>.chalk.graph.v1.KinesisSource kinesis = 2 [json_name = "kinesis"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.graph.v1.KinesisSourceOrBuilder getKinesisOrBuilder() {
    if (sourceCase_ == 2) {
       return (ai.chalk.protos.chalk.graph.v1.KinesisSource) source_;
    }
    return ai.chalk.protos.chalk.graph.v1.KinesisSource.getDefaultInstance();
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
    if (sourceCase_ == 1) {
      output.writeMessage(1, (ai.chalk.protos.chalk.graph.v1.KafkaSource) source_);
    }
    if (sourceCase_ == 2) {
      output.writeMessage(2, (ai.chalk.protos.chalk.graph.v1.KinesisSource) source_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (sourceCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (ai.chalk.protos.chalk.graph.v1.KafkaSource) source_);
    }
    if (sourceCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (ai.chalk.protos.chalk.graph.v1.KinesisSource) source_);
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
    if (!(obj instanceof ai.chalk.protos.chalk.graph.v1.StreamSource)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.graph.v1.StreamSource other = (ai.chalk.protos.chalk.graph.v1.StreamSource) obj;

    if (!getSourceCase().equals(other.getSourceCase())) return false;
    switch (sourceCase_) {
      case 1:
        if (!getKafka()
            .equals(other.getKafka())) return false;
        break;
      case 2:
        if (!getKinesis()
            .equals(other.getKinesis())) return false;
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
    switch (sourceCase_) {
      case 1:
        hash = (37 * hash) + KAFKA_FIELD_NUMBER;
        hash = (53 * hash) + getKafka().hashCode();
        break;
      case 2:
        hash = (37 * hash) + KINESIS_FIELD_NUMBER;
        hash = (53 * hash) + getKinesis().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.graph.v1.StreamSource parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.graph.v1.StreamSource parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.graph.v1.StreamSource parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.graph.v1.StreamSource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.graph.v1.StreamSource parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.graph.v1.StreamSource parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.graph.v1.StreamSource parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.graph.v1.StreamSource parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.graph.v1.StreamSource parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.graph.v1.StreamSource parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.graph.v1.StreamSource parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.graph.v1.StreamSource parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.graph.v1.StreamSource prototype) {
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
   * Protobuf type {@code chalk.graph.v1.StreamSource}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.graph.v1.StreamSource)
      ai.chalk.protos.chalk.graph.v1.StreamSourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.graph.v1.SourcesProto.internal_static_chalk_graph_v1_StreamSource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.graph.v1.SourcesProto.internal_static_chalk_graph_v1_StreamSource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.graph.v1.StreamSource.class, ai.chalk.protos.chalk.graph.v1.StreamSource.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.graph.v1.StreamSource.newBuilder()
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
      if (kafkaBuilder_ != null) {
        kafkaBuilder_.clear();
      }
      if (kinesisBuilder_ != null) {
        kinesisBuilder_.clear();
      }
      sourceCase_ = 0;
      source_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.graph.v1.SourcesProto.internal_static_chalk_graph_v1_StreamSource_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.graph.v1.StreamSource getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.graph.v1.StreamSource.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.graph.v1.StreamSource build() {
      ai.chalk.protos.chalk.graph.v1.StreamSource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.graph.v1.StreamSource buildPartial() {
      ai.chalk.protos.chalk.graph.v1.StreamSource result = new ai.chalk.protos.chalk.graph.v1.StreamSource(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.graph.v1.StreamSource result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(ai.chalk.protos.chalk.graph.v1.StreamSource result) {
      result.sourceCase_ = sourceCase_;
      result.source_ = this.source_;
      if (sourceCase_ == 1 &&
          kafkaBuilder_ != null) {
        result.source_ = kafkaBuilder_.build();
      }
      if (sourceCase_ == 2 &&
          kinesisBuilder_ != null) {
        result.source_ = kinesisBuilder_.build();
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
      if (other instanceof ai.chalk.protos.chalk.graph.v1.StreamSource) {
        return mergeFrom((ai.chalk.protos.chalk.graph.v1.StreamSource)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.graph.v1.StreamSource other) {
      if (other == ai.chalk.protos.chalk.graph.v1.StreamSource.getDefaultInstance()) return this;
      switch (other.getSourceCase()) {
        case KAFKA: {
          mergeKafka(other.getKafka());
          break;
        }
        case KINESIS: {
          mergeKinesis(other.getKinesis());
          break;
        }
        case SOURCE_NOT_SET: {
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
                  getKafkaFieldBuilder().getBuilder(),
                  extensionRegistry);
              sourceCase_ = 1;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getKinesisFieldBuilder().getBuilder(),
                  extensionRegistry);
              sourceCase_ = 2;
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
    private int sourceCase_ = 0;
    private java.lang.Object source_;
    public SourceCase
        getSourceCase() {
      return SourceCase.forNumber(
          sourceCase_);
    }

    public Builder clearSource() {
      sourceCase_ = 0;
      source_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.graph.v1.KafkaSource, ai.chalk.protos.chalk.graph.v1.KafkaSource.Builder, ai.chalk.protos.chalk.graph.v1.KafkaSourceOrBuilder> kafkaBuilder_;
    /**
     * <code>.chalk.graph.v1.KafkaSource kafka = 1 [json_name = "kafka"];</code>
     * @return Whether the kafka field is set.
     */
    @java.lang.Override
    public boolean hasKafka() {
      return sourceCase_ == 1;
    }
    /**
     * <code>.chalk.graph.v1.KafkaSource kafka = 1 [json_name = "kafka"];</code>
     * @return The kafka.
     */
    @java.lang.Override
    public ai.chalk.protos.chalk.graph.v1.KafkaSource getKafka() {
      if (kafkaBuilder_ == null) {
        if (sourceCase_ == 1) {
          return (ai.chalk.protos.chalk.graph.v1.KafkaSource) source_;
        }
        return ai.chalk.protos.chalk.graph.v1.KafkaSource.getDefaultInstance();
      } else {
        if (sourceCase_ == 1) {
          return kafkaBuilder_.getMessage();
        }
        return ai.chalk.protos.chalk.graph.v1.KafkaSource.getDefaultInstance();
      }
    }
    /**
     * <code>.chalk.graph.v1.KafkaSource kafka = 1 [json_name = "kafka"];</code>
     */
    public Builder setKafka(ai.chalk.protos.chalk.graph.v1.KafkaSource value) {
      if (kafkaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        source_ = value;
        onChanged();
      } else {
        kafkaBuilder_.setMessage(value);
      }
      sourceCase_ = 1;
      return this;
    }
    /**
     * <code>.chalk.graph.v1.KafkaSource kafka = 1 [json_name = "kafka"];</code>
     */
    public Builder setKafka(
        ai.chalk.protos.chalk.graph.v1.KafkaSource.Builder builderForValue) {
      if (kafkaBuilder_ == null) {
        source_ = builderForValue.build();
        onChanged();
      } else {
        kafkaBuilder_.setMessage(builderForValue.build());
      }
      sourceCase_ = 1;
      return this;
    }
    /**
     * <code>.chalk.graph.v1.KafkaSource kafka = 1 [json_name = "kafka"];</code>
     */
    public Builder mergeKafka(ai.chalk.protos.chalk.graph.v1.KafkaSource value) {
      if (kafkaBuilder_ == null) {
        if (sourceCase_ == 1 &&
            source_ != ai.chalk.protos.chalk.graph.v1.KafkaSource.getDefaultInstance()) {
          source_ = ai.chalk.protos.chalk.graph.v1.KafkaSource.newBuilder((ai.chalk.protos.chalk.graph.v1.KafkaSource) source_)
              .mergeFrom(value).buildPartial();
        } else {
          source_ = value;
        }
        onChanged();
      } else {
        if (sourceCase_ == 1) {
          kafkaBuilder_.mergeFrom(value);
        } else {
          kafkaBuilder_.setMessage(value);
        }
      }
      sourceCase_ = 1;
      return this;
    }
    /**
     * <code>.chalk.graph.v1.KafkaSource kafka = 1 [json_name = "kafka"];</code>
     */
    public Builder clearKafka() {
      if (kafkaBuilder_ == null) {
        if (sourceCase_ == 1) {
          sourceCase_ = 0;
          source_ = null;
          onChanged();
        }
      } else {
        if (sourceCase_ == 1) {
          sourceCase_ = 0;
          source_ = null;
        }
        kafkaBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.chalk.graph.v1.KafkaSource kafka = 1 [json_name = "kafka"];</code>
     */
    public ai.chalk.protos.chalk.graph.v1.KafkaSource.Builder getKafkaBuilder() {
      return getKafkaFieldBuilder().getBuilder();
    }
    /**
     * <code>.chalk.graph.v1.KafkaSource kafka = 1 [json_name = "kafka"];</code>
     */
    @java.lang.Override
    public ai.chalk.protos.chalk.graph.v1.KafkaSourceOrBuilder getKafkaOrBuilder() {
      if ((sourceCase_ == 1) && (kafkaBuilder_ != null)) {
        return kafkaBuilder_.getMessageOrBuilder();
      } else {
        if (sourceCase_ == 1) {
          return (ai.chalk.protos.chalk.graph.v1.KafkaSource) source_;
        }
        return ai.chalk.protos.chalk.graph.v1.KafkaSource.getDefaultInstance();
      }
    }
    /**
     * <code>.chalk.graph.v1.KafkaSource kafka = 1 [json_name = "kafka"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.graph.v1.KafkaSource, ai.chalk.protos.chalk.graph.v1.KafkaSource.Builder, ai.chalk.protos.chalk.graph.v1.KafkaSourceOrBuilder> 
        getKafkaFieldBuilder() {
      if (kafkaBuilder_ == null) {
        if (!(sourceCase_ == 1)) {
          source_ = ai.chalk.protos.chalk.graph.v1.KafkaSource.getDefaultInstance();
        }
        kafkaBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ai.chalk.protos.chalk.graph.v1.KafkaSource, ai.chalk.protos.chalk.graph.v1.KafkaSource.Builder, ai.chalk.protos.chalk.graph.v1.KafkaSourceOrBuilder>(
                (ai.chalk.protos.chalk.graph.v1.KafkaSource) source_,
                getParentForChildren(),
                isClean());
        source_ = null;
      }
      sourceCase_ = 1;
      onChanged();
      return kafkaBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.graph.v1.KinesisSource, ai.chalk.protos.chalk.graph.v1.KinesisSource.Builder, ai.chalk.protos.chalk.graph.v1.KinesisSourceOrBuilder> kinesisBuilder_;
    /**
     * <code>.chalk.graph.v1.KinesisSource kinesis = 2 [json_name = "kinesis"];</code>
     * @return Whether the kinesis field is set.
     */
    @java.lang.Override
    public boolean hasKinesis() {
      return sourceCase_ == 2;
    }
    /**
     * <code>.chalk.graph.v1.KinesisSource kinesis = 2 [json_name = "kinesis"];</code>
     * @return The kinesis.
     */
    @java.lang.Override
    public ai.chalk.protos.chalk.graph.v1.KinesisSource getKinesis() {
      if (kinesisBuilder_ == null) {
        if (sourceCase_ == 2) {
          return (ai.chalk.protos.chalk.graph.v1.KinesisSource) source_;
        }
        return ai.chalk.protos.chalk.graph.v1.KinesisSource.getDefaultInstance();
      } else {
        if (sourceCase_ == 2) {
          return kinesisBuilder_.getMessage();
        }
        return ai.chalk.protos.chalk.graph.v1.KinesisSource.getDefaultInstance();
      }
    }
    /**
     * <code>.chalk.graph.v1.KinesisSource kinesis = 2 [json_name = "kinesis"];</code>
     */
    public Builder setKinesis(ai.chalk.protos.chalk.graph.v1.KinesisSource value) {
      if (kinesisBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        source_ = value;
        onChanged();
      } else {
        kinesisBuilder_.setMessage(value);
      }
      sourceCase_ = 2;
      return this;
    }
    /**
     * <code>.chalk.graph.v1.KinesisSource kinesis = 2 [json_name = "kinesis"];</code>
     */
    public Builder setKinesis(
        ai.chalk.protos.chalk.graph.v1.KinesisSource.Builder builderForValue) {
      if (kinesisBuilder_ == null) {
        source_ = builderForValue.build();
        onChanged();
      } else {
        kinesisBuilder_.setMessage(builderForValue.build());
      }
      sourceCase_ = 2;
      return this;
    }
    /**
     * <code>.chalk.graph.v1.KinesisSource kinesis = 2 [json_name = "kinesis"];</code>
     */
    public Builder mergeKinesis(ai.chalk.protos.chalk.graph.v1.KinesisSource value) {
      if (kinesisBuilder_ == null) {
        if (sourceCase_ == 2 &&
            source_ != ai.chalk.protos.chalk.graph.v1.KinesisSource.getDefaultInstance()) {
          source_ = ai.chalk.protos.chalk.graph.v1.KinesisSource.newBuilder((ai.chalk.protos.chalk.graph.v1.KinesisSource) source_)
              .mergeFrom(value).buildPartial();
        } else {
          source_ = value;
        }
        onChanged();
      } else {
        if (sourceCase_ == 2) {
          kinesisBuilder_.mergeFrom(value);
        } else {
          kinesisBuilder_.setMessage(value);
        }
      }
      sourceCase_ = 2;
      return this;
    }
    /**
     * <code>.chalk.graph.v1.KinesisSource kinesis = 2 [json_name = "kinesis"];</code>
     */
    public Builder clearKinesis() {
      if (kinesisBuilder_ == null) {
        if (sourceCase_ == 2) {
          sourceCase_ = 0;
          source_ = null;
          onChanged();
        }
      } else {
        if (sourceCase_ == 2) {
          sourceCase_ = 0;
          source_ = null;
        }
        kinesisBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.chalk.graph.v1.KinesisSource kinesis = 2 [json_name = "kinesis"];</code>
     */
    public ai.chalk.protos.chalk.graph.v1.KinesisSource.Builder getKinesisBuilder() {
      return getKinesisFieldBuilder().getBuilder();
    }
    /**
     * <code>.chalk.graph.v1.KinesisSource kinesis = 2 [json_name = "kinesis"];</code>
     */
    @java.lang.Override
    public ai.chalk.protos.chalk.graph.v1.KinesisSourceOrBuilder getKinesisOrBuilder() {
      if ((sourceCase_ == 2) && (kinesisBuilder_ != null)) {
        return kinesisBuilder_.getMessageOrBuilder();
      } else {
        if (sourceCase_ == 2) {
          return (ai.chalk.protos.chalk.graph.v1.KinesisSource) source_;
        }
        return ai.chalk.protos.chalk.graph.v1.KinesisSource.getDefaultInstance();
      }
    }
    /**
     * <code>.chalk.graph.v1.KinesisSource kinesis = 2 [json_name = "kinesis"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.graph.v1.KinesisSource, ai.chalk.protos.chalk.graph.v1.KinesisSource.Builder, ai.chalk.protos.chalk.graph.v1.KinesisSourceOrBuilder> 
        getKinesisFieldBuilder() {
      if (kinesisBuilder_ == null) {
        if (!(sourceCase_ == 2)) {
          source_ = ai.chalk.protos.chalk.graph.v1.KinesisSource.getDefaultInstance();
        }
        kinesisBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ai.chalk.protos.chalk.graph.v1.KinesisSource, ai.chalk.protos.chalk.graph.v1.KinesisSource.Builder, ai.chalk.protos.chalk.graph.v1.KinesisSourceOrBuilder>(
                (ai.chalk.protos.chalk.graph.v1.KinesisSource) source_,
                getParentForChildren(),
                isClean());
        source_ = null;
      }
      sourceCase_ = 2;
      onChanged();
      return kinesisBuilder_;
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


    // @@protoc_insertion_point(builder_scope:chalk.graph.v1.StreamSource)
  }

  // @@protoc_insertion_point(class_scope:chalk.graph.v1.StreamSource)
  private static final ai.chalk.protos.chalk.graph.v1.StreamSource DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.graph.v1.StreamSource();
  }

  public static ai.chalk.protos.chalk.graph.v1.StreamSource getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StreamSource>
      PARSER = new com.google.protobuf.AbstractParser<StreamSource>() {
    @java.lang.Override
    public StreamSource parsePartialFrom(
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

  public static com.google.protobuf.Parser<StreamSource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StreamSource> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.graph.v1.StreamSource getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

