// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/graph/v1/graph.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.chalk.graph.v1;

/**
 * Protobuf type {@code chalk.graph.v1.ResolverOutput}
 */
public final class ResolverOutput extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:chalk.graph.v1.ResolverOutput)
    ResolverOutputOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      ResolverOutput.class.getName());
  }
  // Use ResolverOutput.newBuilder() to construct.
  private ResolverOutput(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ResolverOutput() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.graph.v1.GraphProto.internal_static_chalk_graph_v1_ResolverOutput_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.graph.v1.GraphProto.internal_static_chalk_graph_v1_ResolverOutput_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.graph.v1.ResolverOutput.class, ai.chalk.protos.chalk.graph.v1.ResolverOutput.Builder.class);
  }

  private int annotationCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object annotation_;
  public enum AnnotationCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    FEATURE(1),
    DF(2),
    ANNOTATION_NOT_SET(0);
    private final int value;
    private AnnotationCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static AnnotationCase valueOf(int value) {
      return forNumber(value);
    }

    public static AnnotationCase forNumber(int value) {
      switch (value) {
        case 1: return FEATURE;
        case 2: return DF;
        case 0: return ANNOTATION_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public AnnotationCase
  getAnnotationCase() {
    return AnnotationCase.forNumber(
        annotationCase_);
  }

  public static final int FEATURE_FIELD_NUMBER = 1;
  /**
   * <code>.chalk.graph.v1.FeatureReference feature = 1 [json_name = "feature"];</code>
   * @return Whether the feature field is set.
   */
  @java.lang.Override
  public boolean hasFeature() {
    return annotationCase_ == 1;
  }
  /**
   * <code>.chalk.graph.v1.FeatureReference feature = 1 [json_name = "feature"];</code>
   * @return The feature.
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.graph.v1.FeatureReference getFeature() {
    if (annotationCase_ == 1) {
       return (ai.chalk.protos.chalk.graph.v1.FeatureReference) annotation_;
    }
    return ai.chalk.protos.chalk.graph.v1.FeatureReference.getDefaultInstance();
  }
  /**
   * <code>.chalk.graph.v1.FeatureReference feature = 1 [json_name = "feature"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.graph.v1.FeatureReferenceOrBuilder getFeatureOrBuilder() {
    if (annotationCase_ == 1) {
       return (ai.chalk.protos.chalk.graph.v1.FeatureReference) annotation_;
    }
    return ai.chalk.protos.chalk.graph.v1.FeatureReference.getDefaultInstance();
  }

  public static final int DF_FIELD_NUMBER = 2;
  /**
   * <code>.chalk.graph.v1.DataFrameType df = 2 [json_name = "df"];</code>
   * @return Whether the df field is set.
   */
  @java.lang.Override
  public boolean hasDf() {
    return annotationCase_ == 2;
  }
  /**
   * <code>.chalk.graph.v1.DataFrameType df = 2 [json_name = "df"];</code>
   * @return The df.
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.graph.v1.DataFrameType getDf() {
    if (annotationCase_ == 2) {
       return (ai.chalk.protos.chalk.graph.v1.DataFrameType) annotation_;
    }
    return ai.chalk.protos.chalk.graph.v1.DataFrameType.getDefaultInstance();
  }
  /**
   * <code>.chalk.graph.v1.DataFrameType df = 2 [json_name = "df"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.graph.v1.DataFrameTypeOrBuilder getDfOrBuilder() {
    if (annotationCase_ == 2) {
       return (ai.chalk.protos.chalk.graph.v1.DataFrameType) annotation_;
    }
    return ai.chalk.protos.chalk.graph.v1.DataFrameType.getDefaultInstance();
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
    if (annotationCase_ == 1) {
      output.writeMessage(1, (ai.chalk.protos.chalk.graph.v1.FeatureReference) annotation_);
    }
    if (annotationCase_ == 2) {
      output.writeMessage(2, (ai.chalk.protos.chalk.graph.v1.DataFrameType) annotation_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (annotationCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (ai.chalk.protos.chalk.graph.v1.FeatureReference) annotation_);
    }
    if (annotationCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (ai.chalk.protos.chalk.graph.v1.DataFrameType) annotation_);
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
    if (!(obj instanceof ai.chalk.protos.chalk.graph.v1.ResolverOutput)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.graph.v1.ResolverOutput other = (ai.chalk.protos.chalk.graph.v1.ResolverOutput) obj;

    if (!getAnnotationCase().equals(other.getAnnotationCase())) return false;
    switch (annotationCase_) {
      case 1:
        if (!getFeature()
            .equals(other.getFeature())) return false;
        break;
      case 2:
        if (!getDf()
            .equals(other.getDf())) return false;
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
    switch (annotationCase_) {
      case 1:
        hash = (37 * hash) + FEATURE_FIELD_NUMBER;
        hash = (53 * hash) + getFeature().hashCode();
        break;
      case 2:
        hash = (37 * hash) + DF_FIELD_NUMBER;
        hash = (53 * hash) + getDf().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.graph.v1.ResolverOutput parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.graph.v1.ResolverOutput parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.graph.v1.ResolverOutput parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.graph.v1.ResolverOutput parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.graph.v1.ResolverOutput parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.graph.v1.ResolverOutput parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.graph.v1.ResolverOutput parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.graph.v1.ResolverOutput parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.graph.v1.ResolverOutput parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.graph.v1.ResolverOutput parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.graph.v1.ResolverOutput parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.graph.v1.ResolverOutput parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.graph.v1.ResolverOutput prototype) {
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
   * Protobuf type {@code chalk.graph.v1.ResolverOutput}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.graph.v1.ResolverOutput)
      ai.chalk.protos.chalk.graph.v1.ResolverOutputOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.graph.v1.GraphProto.internal_static_chalk_graph_v1_ResolverOutput_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.graph.v1.GraphProto.internal_static_chalk_graph_v1_ResolverOutput_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.graph.v1.ResolverOutput.class, ai.chalk.protos.chalk.graph.v1.ResolverOutput.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.graph.v1.ResolverOutput.newBuilder()
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
      if (featureBuilder_ != null) {
        featureBuilder_.clear();
      }
      if (dfBuilder_ != null) {
        dfBuilder_.clear();
      }
      annotationCase_ = 0;
      annotation_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.graph.v1.GraphProto.internal_static_chalk_graph_v1_ResolverOutput_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.graph.v1.ResolverOutput getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.graph.v1.ResolverOutput.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.graph.v1.ResolverOutput build() {
      ai.chalk.protos.chalk.graph.v1.ResolverOutput result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.graph.v1.ResolverOutput buildPartial() {
      ai.chalk.protos.chalk.graph.v1.ResolverOutput result = new ai.chalk.protos.chalk.graph.v1.ResolverOutput(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.graph.v1.ResolverOutput result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(ai.chalk.protos.chalk.graph.v1.ResolverOutput result) {
      result.annotationCase_ = annotationCase_;
      result.annotation_ = this.annotation_;
      if (annotationCase_ == 1 &&
          featureBuilder_ != null) {
        result.annotation_ = featureBuilder_.build();
      }
      if (annotationCase_ == 2 &&
          dfBuilder_ != null) {
        result.annotation_ = dfBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ai.chalk.protos.chalk.graph.v1.ResolverOutput) {
        return mergeFrom((ai.chalk.protos.chalk.graph.v1.ResolverOutput)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.graph.v1.ResolverOutput other) {
      if (other == ai.chalk.protos.chalk.graph.v1.ResolverOutput.getDefaultInstance()) return this;
      switch (other.getAnnotationCase()) {
        case FEATURE: {
          mergeFeature(other.getFeature());
          break;
        }
        case DF: {
          mergeDf(other.getDf());
          break;
        }
        case ANNOTATION_NOT_SET: {
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
                  getFeatureFieldBuilder().getBuilder(),
                  extensionRegistry);
              annotationCase_ = 1;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getDfFieldBuilder().getBuilder(),
                  extensionRegistry);
              annotationCase_ = 2;
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
    private int annotationCase_ = 0;
    private java.lang.Object annotation_;
    public AnnotationCase
        getAnnotationCase() {
      return AnnotationCase.forNumber(
          annotationCase_);
    }

    public Builder clearAnnotation() {
      annotationCase_ = 0;
      annotation_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilder<
        ai.chalk.protos.chalk.graph.v1.FeatureReference, ai.chalk.protos.chalk.graph.v1.FeatureReference.Builder, ai.chalk.protos.chalk.graph.v1.FeatureReferenceOrBuilder> featureBuilder_;
    /**
     * <code>.chalk.graph.v1.FeatureReference feature = 1 [json_name = "feature"];</code>
     * @return Whether the feature field is set.
     */
    @java.lang.Override
    public boolean hasFeature() {
      return annotationCase_ == 1;
    }
    /**
     * <code>.chalk.graph.v1.FeatureReference feature = 1 [json_name = "feature"];</code>
     * @return The feature.
     */
    @java.lang.Override
    public ai.chalk.protos.chalk.graph.v1.FeatureReference getFeature() {
      if (featureBuilder_ == null) {
        if (annotationCase_ == 1) {
          return (ai.chalk.protos.chalk.graph.v1.FeatureReference) annotation_;
        }
        return ai.chalk.protos.chalk.graph.v1.FeatureReference.getDefaultInstance();
      } else {
        if (annotationCase_ == 1) {
          return featureBuilder_.getMessage();
        }
        return ai.chalk.protos.chalk.graph.v1.FeatureReference.getDefaultInstance();
      }
    }
    /**
     * <code>.chalk.graph.v1.FeatureReference feature = 1 [json_name = "feature"];</code>
     */
    public Builder setFeature(ai.chalk.protos.chalk.graph.v1.FeatureReference value) {
      if (featureBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        annotation_ = value;
        onChanged();
      } else {
        featureBuilder_.setMessage(value);
      }
      annotationCase_ = 1;
      return this;
    }
    /**
     * <code>.chalk.graph.v1.FeatureReference feature = 1 [json_name = "feature"];</code>
     */
    public Builder setFeature(
        ai.chalk.protos.chalk.graph.v1.FeatureReference.Builder builderForValue) {
      if (featureBuilder_ == null) {
        annotation_ = builderForValue.build();
        onChanged();
      } else {
        featureBuilder_.setMessage(builderForValue.build());
      }
      annotationCase_ = 1;
      return this;
    }
    /**
     * <code>.chalk.graph.v1.FeatureReference feature = 1 [json_name = "feature"];</code>
     */
    public Builder mergeFeature(ai.chalk.protos.chalk.graph.v1.FeatureReference value) {
      if (featureBuilder_ == null) {
        if (annotationCase_ == 1 &&
            annotation_ != ai.chalk.protos.chalk.graph.v1.FeatureReference.getDefaultInstance()) {
          annotation_ = ai.chalk.protos.chalk.graph.v1.FeatureReference.newBuilder((ai.chalk.protos.chalk.graph.v1.FeatureReference) annotation_)
              .mergeFrom(value).buildPartial();
        } else {
          annotation_ = value;
        }
        onChanged();
      } else {
        if (annotationCase_ == 1) {
          featureBuilder_.mergeFrom(value);
        } else {
          featureBuilder_.setMessage(value);
        }
      }
      annotationCase_ = 1;
      return this;
    }
    /**
     * <code>.chalk.graph.v1.FeatureReference feature = 1 [json_name = "feature"];</code>
     */
    public Builder clearFeature() {
      if (featureBuilder_ == null) {
        if (annotationCase_ == 1) {
          annotationCase_ = 0;
          annotation_ = null;
          onChanged();
        }
      } else {
        if (annotationCase_ == 1) {
          annotationCase_ = 0;
          annotation_ = null;
        }
        featureBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.chalk.graph.v1.FeatureReference feature = 1 [json_name = "feature"];</code>
     */
    public ai.chalk.protos.chalk.graph.v1.FeatureReference.Builder getFeatureBuilder() {
      return getFeatureFieldBuilder().getBuilder();
    }
    /**
     * <code>.chalk.graph.v1.FeatureReference feature = 1 [json_name = "feature"];</code>
     */
    @java.lang.Override
    public ai.chalk.protos.chalk.graph.v1.FeatureReferenceOrBuilder getFeatureOrBuilder() {
      if ((annotationCase_ == 1) && (featureBuilder_ != null)) {
        return featureBuilder_.getMessageOrBuilder();
      } else {
        if (annotationCase_ == 1) {
          return (ai.chalk.protos.chalk.graph.v1.FeatureReference) annotation_;
        }
        return ai.chalk.protos.chalk.graph.v1.FeatureReference.getDefaultInstance();
      }
    }
    /**
     * <code>.chalk.graph.v1.FeatureReference feature = 1 [json_name = "feature"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        ai.chalk.protos.chalk.graph.v1.FeatureReference, ai.chalk.protos.chalk.graph.v1.FeatureReference.Builder, ai.chalk.protos.chalk.graph.v1.FeatureReferenceOrBuilder> 
        getFeatureFieldBuilder() {
      if (featureBuilder_ == null) {
        if (!(annotationCase_ == 1)) {
          annotation_ = ai.chalk.protos.chalk.graph.v1.FeatureReference.getDefaultInstance();
        }
        featureBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            ai.chalk.protos.chalk.graph.v1.FeatureReference, ai.chalk.protos.chalk.graph.v1.FeatureReference.Builder, ai.chalk.protos.chalk.graph.v1.FeatureReferenceOrBuilder>(
                (ai.chalk.protos.chalk.graph.v1.FeatureReference) annotation_,
                getParentForChildren(),
                isClean());
        annotation_ = null;
      }
      annotationCase_ = 1;
      onChanged();
      return featureBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilder<
        ai.chalk.protos.chalk.graph.v1.DataFrameType, ai.chalk.protos.chalk.graph.v1.DataFrameType.Builder, ai.chalk.protos.chalk.graph.v1.DataFrameTypeOrBuilder> dfBuilder_;
    /**
     * <code>.chalk.graph.v1.DataFrameType df = 2 [json_name = "df"];</code>
     * @return Whether the df field is set.
     */
    @java.lang.Override
    public boolean hasDf() {
      return annotationCase_ == 2;
    }
    /**
     * <code>.chalk.graph.v1.DataFrameType df = 2 [json_name = "df"];</code>
     * @return The df.
     */
    @java.lang.Override
    public ai.chalk.protos.chalk.graph.v1.DataFrameType getDf() {
      if (dfBuilder_ == null) {
        if (annotationCase_ == 2) {
          return (ai.chalk.protos.chalk.graph.v1.DataFrameType) annotation_;
        }
        return ai.chalk.protos.chalk.graph.v1.DataFrameType.getDefaultInstance();
      } else {
        if (annotationCase_ == 2) {
          return dfBuilder_.getMessage();
        }
        return ai.chalk.protos.chalk.graph.v1.DataFrameType.getDefaultInstance();
      }
    }
    /**
     * <code>.chalk.graph.v1.DataFrameType df = 2 [json_name = "df"];</code>
     */
    public Builder setDf(ai.chalk.protos.chalk.graph.v1.DataFrameType value) {
      if (dfBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        annotation_ = value;
        onChanged();
      } else {
        dfBuilder_.setMessage(value);
      }
      annotationCase_ = 2;
      return this;
    }
    /**
     * <code>.chalk.graph.v1.DataFrameType df = 2 [json_name = "df"];</code>
     */
    public Builder setDf(
        ai.chalk.protos.chalk.graph.v1.DataFrameType.Builder builderForValue) {
      if (dfBuilder_ == null) {
        annotation_ = builderForValue.build();
        onChanged();
      } else {
        dfBuilder_.setMessage(builderForValue.build());
      }
      annotationCase_ = 2;
      return this;
    }
    /**
     * <code>.chalk.graph.v1.DataFrameType df = 2 [json_name = "df"];</code>
     */
    public Builder mergeDf(ai.chalk.protos.chalk.graph.v1.DataFrameType value) {
      if (dfBuilder_ == null) {
        if (annotationCase_ == 2 &&
            annotation_ != ai.chalk.protos.chalk.graph.v1.DataFrameType.getDefaultInstance()) {
          annotation_ = ai.chalk.protos.chalk.graph.v1.DataFrameType.newBuilder((ai.chalk.protos.chalk.graph.v1.DataFrameType) annotation_)
              .mergeFrom(value).buildPartial();
        } else {
          annotation_ = value;
        }
        onChanged();
      } else {
        if (annotationCase_ == 2) {
          dfBuilder_.mergeFrom(value);
        } else {
          dfBuilder_.setMessage(value);
        }
      }
      annotationCase_ = 2;
      return this;
    }
    /**
     * <code>.chalk.graph.v1.DataFrameType df = 2 [json_name = "df"];</code>
     */
    public Builder clearDf() {
      if (dfBuilder_ == null) {
        if (annotationCase_ == 2) {
          annotationCase_ = 0;
          annotation_ = null;
          onChanged();
        }
      } else {
        if (annotationCase_ == 2) {
          annotationCase_ = 0;
          annotation_ = null;
        }
        dfBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.chalk.graph.v1.DataFrameType df = 2 [json_name = "df"];</code>
     */
    public ai.chalk.protos.chalk.graph.v1.DataFrameType.Builder getDfBuilder() {
      return getDfFieldBuilder().getBuilder();
    }
    /**
     * <code>.chalk.graph.v1.DataFrameType df = 2 [json_name = "df"];</code>
     */
    @java.lang.Override
    public ai.chalk.protos.chalk.graph.v1.DataFrameTypeOrBuilder getDfOrBuilder() {
      if ((annotationCase_ == 2) && (dfBuilder_ != null)) {
        return dfBuilder_.getMessageOrBuilder();
      } else {
        if (annotationCase_ == 2) {
          return (ai.chalk.protos.chalk.graph.v1.DataFrameType) annotation_;
        }
        return ai.chalk.protos.chalk.graph.v1.DataFrameType.getDefaultInstance();
      }
    }
    /**
     * <code>.chalk.graph.v1.DataFrameType df = 2 [json_name = "df"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        ai.chalk.protos.chalk.graph.v1.DataFrameType, ai.chalk.protos.chalk.graph.v1.DataFrameType.Builder, ai.chalk.protos.chalk.graph.v1.DataFrameTypeOrBuilder> 
        getDfFieldBuilder() {
      if (dfBuilder_ == null) {
        if (!(annotationCase_ == 2)) {
          annotation_ = ai.chalk.protos.chalk.graph.v1.DataFrameType.getDefaultInstance();
        }
        dfBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            ai.chalk.protos.chalk.graph.v1.DataFrameType, ai.chalk.protos.chalk.graph.v1.DataFrameType.Builder, ai.chalk.protos.chalk.graph.v1.DataFrameTypeOrBuilder>(
                (ai.chalk.protos.chalk.graph.v1.DataFrameType) annotation_,
                getParentForChildren(),
                isClean());
        annotation_ = null;
      }
      annotationCase_ = 2;
      onChanged();
      return dfBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:chalk.graph.v1.ResolverOutput)
  }

  // @@protoc_insertion_point(class_scope:chalk.graph.v1.ResolverOutput)
  private static final ai.chalk.protos.chalk.graph.v1.ResolverOutput DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.graph.v1.ResolverOutput();
  }

  public static ai.chalk.protos.chalk.graph.v1.ResolverOutput getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResolverOutput>
      PARSER = new com.google.protobuf.AbstractParser<ResolverOutput>() {
    @java.lang.Override
    public ResolverOutput parsePartialFrom(
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

  public static com.google.protobuf.Parser<ResolverOutput> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResolverOutput> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.graph.v1.ResolverOutput getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

