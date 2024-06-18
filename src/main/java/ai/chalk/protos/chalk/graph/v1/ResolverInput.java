// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/graph/v1/graph.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.graph.v1;

/**
 * Protobuf type {@code chalk.graph.v1.ResolverInput}
 */
public final class ResolverInput extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chalk.graph.v1.ResolverInput)
    ResolverInputOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ResolverInput.newBuilder() to construct.
  private ResolverInput(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResolverInput() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ResolverInput();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.graph.v1.GraphProto.internal_static_chalk_graph_v1_ResolverInput_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.graph.v1.GraphProto.internal_static_chalk_graph_v1_ResolverInput_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.graph.v1.ResolverInput.class, ai.chalk.protos.chalk.graph.v1.ResolverInput.Builder.class);
  }

  private int annotationCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object annotation_;
  public enum AnnotationCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    FEATURE(1),
    DF(2),
    STATE(3),
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
        case 3: return STATE;
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
   * <code>.chalk.graph.v1.FeatureInput feature = 1 [json_name = "feature"];</code>
   * @return Whether the feature field is set.
   */
  @java.lang.Override
  public boolean hasFeature() {
    return annotationCase_ == 1;
  }
  /**
   * <code>.chalk.graph.v1.FeatureInput feature = 1 [json_name = "feature"];</code>
   * @return The feature.
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.graph.v1.FeatureInput getFeature() {
    if (annotationCase_ == 1) {
       return (ai.chalk.protos.chalk.graph.v1.FeatureInput) annotation_;
    }
    return ai.chalk.protos.chalk.graph.v1.FeatureInput.getDefaultInstance();
  }
  /**
   * <code>.chalk.graph.v1.FeatureInput feature = 1 [json_name = "feature"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.graph.v1.FeatureInputOrBuilder getFeatureOrBuilder() {
    if (annotationCase_ == 1) {
       return (ai.chalk.protos.chalk.graph.v1.FeatureInput) annotation_;
    }
    return ai.chalk.protos.chalk.graph.v1.FeatureInput.getDefaultInstance();
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

  public static final int STATE_FIELD_NUMBER = 3;
  /**
   * <code>.chalk.graph.v1.ResolverState state = 3 [json_name = "state"];</code>
   * @return Whether the state field is set.
   */
  @java.lang.Override
  public boolean hasState() {
    return annotationCase_ == 3;
  }
  /**
   * <code>.chalk.graph.v1.ResolverState state = 3 [json_name = "state"];</code>
   * @return The state.
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.graph.v1.ResolverState getState() {
    if (annotationCase_ == 3) {
       return (ai.chalk.protos.chalk.graph.v1.ResolverState) annotation_;
    }
    return ai.chalk.protos.chalk.graph.v1.ResolverState.getDefaultInstance();
  }
  /**
   * <code>.chalk.graph.v1.ResolverState state = 3 [json_name = "state"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.graph.v1.ResolverStateOrBuilder getStateOrBuilder() {
    if (annotationCase_ == 3) {
       return (ai.chalk.protos.chalk.graph.v1.ResolverState) annotation_;
    }
    return ai.chalk.protos.chalk.graph.v1.ResolverState.getDefaultInstance();
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
      output.writeMessage(1, (ai.chalk.protos.chalk.graph.v1.FeatureInput) annotation_);
    }
    if (annotationCase_ == 2) {
      output.writeMessage(2, (ai.chalk.protos.chalk.graph.v1.DataFrameType) annotation_);
    }
    if (annotationCase_ == 3) {
      output.writeMessage(3, (ai.chalk.protos.chalk.graph.v1.ResolverState) annotation_);
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
        .computeMessageSize(1, (ai.chalk.protos.chalk.graph.v1.FeatureInput) annotation_);
    }
    if (annotationCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (ai.chalk.protos.chalk.graph.v1.DataFrameType) annotation_);
    }
    if (annotationCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, (ai.chalk.protos.chalk.graph.v1.ResolverState) annotation_);
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
    if (!(obj instanceof ai.chalk.protos.chalk.graph.v1.ResolverInput)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.graph.v1.ResolverInput other = (ai.chalk.protos.chalk.graph.v1.ResolverInput) obj;

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
      case 3:
        if (!getState()
            .equals(other.getState())) return false;
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
      case 3:
        hash = (37 * hash) + STATE_FIELD_NUMBER;
        hash = (53 * hash) + getState().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.graph.v1.ResolverInput parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.graph.v1.ResolverInput parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.graph.v1.ResolverInput parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.graph.v1.ResolverInput parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.graph.v1.ResolverInput parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.graph.v1.ResolverInput parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.graph.v1.ResolverInput parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.graph.v1.ResolverInput parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.graph.v1.ResolverInput parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.graph.v1.ResolverInput parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.graph.v1.ResolverInput parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.graph.v1.ResolverInput parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.graph.v1.ResolverInput prototype) {
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
   * Protobuf type {@code chalk.graph.v1.ResolverInput}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.graph.v1.ResolverInput)
      ai.chalk.protos.chalk.graph.v1.ResolverInputOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.graph.v1.GraphProto.internal_static_chalk_graph_v1_ResolverInput_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.graph.v1.GraphProto.internal_static_chalk_graph_v1_ResolverInput_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.graph.v1.ResolverInput.class, ai.chalk.protos.chalk.graph.v1.ResolverInput.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.graph.v1.ResolverInput.newBuilder()
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
      if (featureBuilder_ != null) {
        featureBuilder_.clear();
      }
      if (dfBuilder_ != null) {
        dfBuilder_.clear();
      }
      if (stateBuilder_ != null) {
        stateBuilder_.clear();
      }
      annotationCase_ = 0;
      annotation_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.graph.v1.GraphProto.internal_static_chalk_graph_v1_ResolverInput_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.graph.v1.ResolverInput getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.graph.v1.ResolverInput.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.graph.v1.ResolverInput build() {
      ai.chalk.protos.chalk.graph.v1.ResolverInput result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.graph.v1.ResolverInput buildPartial() {
      ai.chalk.protos.chalk.graph.v1.ResolverInput result = new ai.chalk.protos.chalk.graph.v1.ResolverInput(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.graph.v1.ResolverInput result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(ai.chalk.protos.chalk.graph.v1.ResolverInput result) {
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
      if (annotationCase_ == 3 &&
          stateBuilder_ != null) {
        result.annotation_ = stateBuilder_.build();
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
      if (other instanceof ai.chalk.protos.chalk.graph.v1.ResolverInput) {
        return mergeFrom((ai.chalk.protos.chalk.graph.v1.ResolverInput)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.graph.v1.ResolverInput other) {
      if (other == ai.chalk.protos.chalk.graph.v1.ResolverInput.getDefaultInstance()) return this;
      switch (other.getAnnotationCase()) {
        case FEATURE: {
          mergeFeature(other.getFeature());
          break;
        }
        case DF: {
          mergeDf(other.getDf());
          break;
        }
        case STATE: {
          mergeState(other.getState());
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
            case 26: {
              input.readMessage(
                  getStateFieldBuilder().getBuilder(),
                  extensionRegistry);
              annotationCase_ = 3;
              break;
            } // case 26
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

    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.graph.v1.FeatureInput, ai.chalk.protos.chalk.graph.v1.FeatureInput.Builder, ai.chalk.protos.chalk.graph.v1.FeatureInputOrBuilder> featureBuilder_;
    /**
     * <code>.chalk.graph.v1.FeatureInput feature = 1 [json_name = "feature"];</code>
     * @return Whether the feature field is set.
     */
    @java.lang.Override
    public boolean hasFeature() {
      return annotationCase_ == 1;
    }
    /**
     * <code>.chalk.graph.v1.FeatureInput feature = 1 [json_name = "feature"];</code>
     * @return The feature.
     */
    @java.lang.Override
    public ai.chalk.protos.chalk.graph.v1.FeatureInput getFeature() {
      if (featureBuilder_ == null) {
        if (annotationCase_ == 1) {
          return (ai.chalk.protos.chalk.graph.v1.FeatureInput) annotation_;
        }
        return ai.chalk.protos.chalk.graph.v1.FeatureInput.getDefaultInstance();
      } else {
        if (annotationCase_ == 1) {
          return featureBuilder_.getMessage();
        }
        return ai.chalk.protos.chalk.graph.v1.FeatureInput.getDefaultInstance();
      }
    }
    /**
     * <code>.chalk.graph.v1.FeatureInput feature = 1 [json_name = "feature"];</code>
     */
    public Builder setFeature(ai.chalk.protos.chalk.graph.v1.FeatureInput value) {
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
     * <code>.chalk.graph.v1.FeatureInput feature = 1 [json_name = "feature"];</code>
     */
    public Builder setFeature(
        ai.chalk.protos.chalk.graph.v1.FeatureInput.Builder builderForValue) {
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
     * <code>.chalk.graph.v1.FeatureInput feature = 1 [json_name = "feature"];</code>
     */
    public Builder mergeFeature(ai.chalk.protos.chalk.graph.v1.FeatureInput value) {
      if (featureBuilder_ == null) {
        if (annotationCase_ == 1 &&
            annotation_ != ai.chalk.protos.chalk.graph.v1.FeatureInput.getDefaultInstance()) {
          annotation_ = ai.chalk.protos.chalk.graph.v1.FeatureInput.newBuilder((ai.chalk.protos.chalk.graph.v1.FeatureInput) annotation_)
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
     * <code>.chalk.graph.v1.FeatureInput feature = 1 [json_name = "feature"];</code>
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
     * <code>.chalk.graph.v1.FeatureInput feature = 1 [json_name = "feature"];</code>
     */
    public ai.chalk.protos.chalk.graph.v1.FeatureInput.Builder getFeatureBuilder() {
      return getFeatureFieldBuilder().getBuilder();
    }
    /**
     * <code>.chalk.graph.v1.FeatureInput feature = 1 [json_name = "feature"];</code>
     */
    @java.lang.Override
    public ai.chalk.protos.chalk.graph.v1.FeatureInputOrBuilder getFeatureOrBuilder() {
      if ((annotationCase_ == 1) && (featureBuilder_ != null)) {
        return featureBuilder_.getMessageOrBuilder();
      } else {
        if (annotationCase_ == 1) {
          return (ai.chalk.protos.chalk.graph.v1.FeatureInput) annotation_;
        }
        return ai.chalk.protos.chalk.graph.v1.FeatureInput.getDefaultInstance();
      }
    }
    /**
     * <code>.chalk.graph.v1.FeatureInput feature = 1 [json_name = "feature"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.graph.v1.FeatureInput, ai.chalk.protos.chalk.graph.v1.FeatureInput.Builder, ai.chalk.protos.chalk.graph.v1.FeatureInputOrBuilder> 
        getFeatureFieldBuilder() {
      if (featureBuilder_ == null) {
        if (!(annotationCase_ == 1)) {
          annotation_ = ai.chalk.protos.chalk.graph.v1.FeatureInput.getDefaultInstance();
        }
        featureBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ai.chalk.protos.chalk.graph.v1.FeatureInput, ai.chalk.protos.chalk.graph.v1.FeatureInput.Builder, ai.chalk.protos.chalk.graph.v1.FeatureInputOrBuilder>(
                (ai.chalk.protos.chalk.graph.v1.FeatureInput) annotation_,
                getParentForChildren(),
                isClean());
        annotation_ = null;
      }
      annotationCase_ = 1;
      onChanged();
      return featureBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
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
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.graph.v1.DataFrameType, ai.chalk.protos.chalk.graph.v1.DataFrameType.Builder, ai.chalk.protos.chalk.graph.v1.DataFrameTypeOrBuilder> 
        getDfFieldBuilder() {
      if (dfBuilder_ == null) {
        if (!(annotationCase_ == 2)) {
          annotation_ = ai.chalk.protos.chalk.graph.v1.DataFrameType.getDefaultInstance();
        }
        dfBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
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

    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.graph.v1.ResolverState, ai.chalk.protos.chalk.graph.v1.ResolverState.Builder, ai.chalk.protos.chalk.graph.v1.ResolverStateOrBuilder> stateBuilder_;
    /**
     * <code>.chalk.graph.v1.ResolverState state = 3 [json_name = "state"];</code>
     * @return Whether the state field is set.
     */
    @java.lang.Override
    public boolean hasState() {
      return annotationCase_ == 3;
    }
    /**
     * <code>.chalk.graph.v1.ResolverState state = 3 [json_name = "state"];</code>
     * @return The state.
     */
    @java.lang.Override
    public ai.chalk.protos.chalk.graph.v1.ResolverState getState() {
      if (stateBuilder_ == null) {
        if (annotationCase_ == 3) {
          return (ai.chalk.protos.chalk.graph.v1.ResolverState) annotation_;
        }
        return ai.chalk.protos.chalk.graph.v1.ResolverState.getDefaultInstance();
      } else {
        if (annotationCase_ == 3) {
          return stateBuilder_.getMessage();
        }
        return ai.chalk.protos.chalk.graph.v1.ResolverState.getDefaultInstance();
      }
    }
    /**
     * <code>.chalk.graph.v1.ResolverState state = 3 [json_name = "state"];</code>
     */
    public Builder setState(ai.chalk.protos.chalk.graph.v1.ResolverState value) {
      if (stateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        annotation_ = value;
        onChanged();
      } else {
        stateBuilder_.setMessage(value);
      }
      annotationCase_ = 3;
      return this;
    }
    /**
     * <code>.chalk.graph.v1.ResolverState state = 3 [json_name = "state"];</code>
     */
    public Builder setState(
        ai.chalk.protos.chalk.graph.v1.ResolverState.Builder builderForValue) {
      if (stateBuilder_ == null) {
        annotation_ = builderForValue.build();
        onChanged();
      } else {
        stateBuilder_.setMessage(builderForValue.build());
      }
      annotationCase_ = 3;
      return this;
    }
    /**
     * <code>.chalk.graph.v1.ResolverState state = 3 [json_name = "state"];</code>
     */
    public Builder mergeState(ai.chalk.protos.chalk.graph.v1.ResolverState value) {
      if (stateBuilder_ == null) {
        if (annotationCase_ == 3 &&
            annotation_ != ai.chalk.protos.chalk.graph.v1.ResolverState.getDefaultInstance()) {
          annotation_ = ai.chalk.protos.chalk.graph.v1.ResolverState.newBuilder((ai.chalk.protos.chalk.graph.v1.ResolverState) annotation_)
              .mergeFrom(value).buildPartial();
        } else {
          annotation_ = value;
        }
        onChanged();
      } else {
        if (annotationCase_ == 3) {
          stateBuilder_.mergeFrom(value);
        } else {
          stateBuilder_.setMessage(value);
        }
      }
      annotationCase_ = 3;
      return this;
    }
    /**
     * <code>.chalk.graph.v1.ResolverState state = 3 [json_name = "state"];</code>
     */
    public Builder clearState() {
      if (stateBuilder_ == null) {
        if (annotationCase_ == 3) {
          annotationCase_ = 0;
          annotation_ = null;
          onChanged();
        }
      } else {
        if (annotationCase_ == 3) {
          annotationCase_ = 0;
          annotation_ = null;
        }
        stateBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.chalk.graph.v1.ResolverState state = 3 [json_name = "state"];</code>
     */
    public ai.chalk.protos.chalk.graph.v1.ResolverState.Builder getStateBuilder() {
      return getStateFieldBuilder().getBuilder();
    }
    /**
     * <code>.chalk.graph.v1.ResolverState state = 3 [json_name = "state"];</code>
     */
    @java.lang.Override
    public ai.chalk.protos.chalk.graph.v1.ResolverStateOrBuilder getStateOrBuilder() {
      if ((annotationCase_ == 3) && (stateBuilder_ != null)) {
        return stateBuilder_.getMessageOrBuilder();
      } else {
        if (annotationCase_ == 3) {
          return (ai.chalk.protos.chalk.graph.v1.ResolverState) annotation_;
        }
        return ai.chalk.protos.chalk.graph.v1.ResolverState.getDefaultInstance();
      }
    }
    /**
     * <code>.chalk.graph.v1.ResolverState state = 3 [json_name = "state"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.graph.v1.ResolverState, ai.chalk.protos.chalk.graph.v1.ResolverState.Builder, ai.chalk.protos.chalk.graph.v1.ResolverStateOrBuilder> 
        getStateFieldBuilder() {
      if (stateBuilder_ == null) {
        if (!(annotationCase_ == 3)) {
          annotation_ = ai.chalk.protos.chalk.graph.v1.ResolverState.getDefaultInstance();
        }
        stateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ai.chalk.protos.chalk.graph.v1.ResolverState, ai.chalk.protos.chalk.graph.v1.ResolverState.Builder, ai.chalk.protos.chalk.graph.v1.ResolverStateOrBuilder>(
                (ai.chalk.protos.chalk.graph.v1.ResolverState) annotation_,
                getParentForChildren(),
                isClean());
        annotation_ = null;
      }
      annotationCase_ = 3;
      onChanged();
      return stateBuilder_;
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


    // @@protoc_insertion_point(builder_scope:chalk.graph.v1.ResolverInput)
  }

  // @@protoc_insertion_point(class_scope:chalk.graph.v1.ResolverInput)
  private static final ai.chalk.protos.chalk.graph.v1.ResolverInput DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.graph.v1.ResolverInput();
  }

  public static ai.chalk.protos.chalk.graph.v1.ResolverInput getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResolverInput>
      PARSER = new com.google.protobuf.AbstractParser<ResolverInput>() {
    @java.lang.Override
    public ResolverInput parsePartialFrom(
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

  public static com.google.protobuf.Parser<ResolverInput> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResolverInput> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.graph.v1.ResolverInput getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

