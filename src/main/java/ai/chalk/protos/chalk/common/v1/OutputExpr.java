// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/common/v1/online_query.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.common.v1;

/**
 * <pre>
 * Represent an online query output. Currently these are just single feature FQNs.
 * In the future these could be expressions like `User.card.transactions[_.amount &lt; 100]`
 * </pre>
 *
 * Protobuf type {@code chalk.common.v1.OutputExpr}
 */
public final class OutputExpr extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chalk.common.v1.OutputExpr)
    OutputExprOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OutputExpr.newBuilder() to construct.
  private OutputExpr(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OutputExpr() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OutputExpr();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.common.v1.OnlineQueryProto.internal_static_chalk_common_v1_OutputExpr_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.common.v1.OnlineQueryProto.internal_static_chalk_common_v1_OutputExpr_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.common.v1.OutputExpr.class, ai.chalk.protos.chalk.common.v1.OutputExpr.Builder.class);
  }

  private int exprCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object expr_;
  public enum ExprCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    FEATURE_FQN(1),
    EXPR_NOT_SET(0);
    private final int value;
    private ExprCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ExprCase valueOf(int value) {
      return forNumber(value);
    }

    public static ExprCase forNumber(int value) {
      switch (value) {
        case 1: return FEATURE_FQN;
        case 0: return EXPR_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ExprCase
  getExprCase() {
    return ExprCase.forNumber(
        exprCase_);
  }

  public static final int FEATURE_FQN_FIELD_NUMBER = 1;
  /**
   * <code>string feature_fqn = 1 [json_name = "featureFqn"];</code>
   * @return Whether the featureFqn field is set.
   */
  public boolean hasFeatureFqn() {
    return exprCase_ == 1;
  }
  /**
   * <code>string feature_fqn = 1 [json_name = "featureFqn"];</code>
   * @return The featureFqn.
   */
  public java.lang.String getFeatureFqn() {
    java.lang.Object ref = "";
    if (exprCase_ == 1) {
      ref = expr_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (exprCase_ == 1) {
        expr_ = s;
      }
      return s;
    }
  }
  /**
   * <code>string feature_fqn = 1 [json_name = "featureFqn"];</code>
   * @return The bytes for featureFqn.
   */
  public com.google.protobuf.ByteString
      getFeatureFqnBytes() {
    java.lang.Object ref = "";
    if (exprCase_ == 1) {
      ref = expr_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (exprCase_ == 1) {
        expr_ = b;
      }
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
    if (exprCase_ == 1) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, expr_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (exprCase_ == 1) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, expr_);
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
    if (!(obj instanceof ai.chalk.protos.chalk.common.v1.OutputExpr)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.common.v1.OutputExpr other = (ai.chalk.protos.chalk.common.v1.OutputExpr) obj;

    if (!getExprCase().equals(other.getExprCase())) return false;
    switch (exprCase_) {
      case 1:
        if (!getFeatureFqn()
            .equals(other.getFeatureFqn())) return false;
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
    switch (exprCase_) {
      case 1:
        hash = (37 * hash) + FEATURE_FQN_FIELD_NUMBER;
        hash = (53 * hash) + getFeatureFqn().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.common.v1.OutputExpr parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.common.v1.OutputExpr parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.common.v1.OutputExpr parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.common.v1.OutputExpr parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.common.v1.OutputExpr parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.common.v1.OutputExpr parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.common.v1.OutputExpr parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.common.v1.OutputExpr parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.common.v1.OutputExpr parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.common.v1.OutputExpr parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.common.v1.OutputExpr parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.common.v1.OutputExpr parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.common.v1.OutputExpr prototype) {
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
   * <pre>
   * Represent an online query output. Currently these are just single feature FQNs.
   * In the future these could be expressions like `User.card.transactions[_.amount &lt; 100]`
   * </pre>
   *
   * Protobuf type {@code chalk.common.v1.OutputExpr}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.common.v1.OutputExpr)
      ai.chalk.protos.chalk.common.v1.OutputExprOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.common.v1.OnlineQueryProto.internal_static_chalk_common_v1_OutputExpr_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.common.v1.OnlineQueryProto.internal_static_chalk_common_v1_OutputExpr_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.common.v1.OutputExpr.class, ai.chalk.protos.chalk.common.v1.OutputExpr.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.common.v1.OutputExpr.newBuilder()
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
      exprCase_ = 0;
      expr_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.common.v1.OnlineQueryProto.internal_static_chalk_common_v1_OutputExpr_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.common.v1.OutputExpr getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.common.v1.OutputExpr.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.common.v1.OutputExpr build() {
      ai.chalk.protos.chalk.common.v1.OutputExpr result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.common.v1.OutputExpr buildPartial() {
      ai.chalk.protos.chalk.common.v1.OutputExpr result = new ai.chalk.protos.chalk.common.v1.OutputExpr(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.common.v1.OutputExpr result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(ai.chalk.protos.chalk.common.v1.OutputExpr result) {
      result.exprCase_ = exprCase_;
      result.expr_ = this.expr_;
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
      if (other instanceof ai.chalk.protos.chalk.common.v1.OutputExpr) {
        return mergeFrom((ai.chalk.protos.chalk.common.v1.OutputExpr)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.common.v1.OutputExpr other) {
      if (other == ai.chalk.protos.chalk.common.v1.OutputExpr.getDefaultInstance()) return this;
      switch (other.getExprCase()) {
        case FEATURE_FQN: {
          exprCase_ = 1;
          expr_ = other.expr_;
          onChanged();
          break;
        }
        case EXPR_NOT_SET: {
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
              java.lang.String s = input.readStringRequireUtf8();
              exprCase_ = 1;
              expr_ = s;
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
    private int exprCase_ = 0;
    private java.lang.Object expr_;
    public ExprCase
        getExprCase() {
      return ExprCase.forNumber(
          exprCase_);
    }

    public Builder clearExpr() {
      exprCase_ = 0;
      expr_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     * <code>string feature_fqn = 1 [json_name = "featureFqn"];</code>
     * @return Whether the featureFqn field is set.
     */
    @java.lang.Override
    public boolean hasFeatureFqn() {
      return exprCase_ == 1;
    }
    /**
     * <code>string feature_fqn = 1 [json_name = "featureFqn"];</code>
     * @return The featureFqn.
     */
    @java.lang.Override
    public java.lang.String getFeatureFqn() {
      java.lang.Object ref = "";
      if (exprCase_ == 1) {
        ref = expr_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (exprCase_ == 1) {
          expr_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string feature_fqn = 1 [json_name = "featureFqn"];</code>
     * @return The bytes for featureFqn.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getFeatureFqnBytes() {
      java.lang.Object ref = "";
      if (exprCase_ == 1) {
        ref = expr_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (exprCase_ == 1) {
          expr_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string feature_fqn = 1 [json_name = "featureFqn"];</code>
     * @param value The featureFqn to set.
     * @return This builder for chaining.
     */
    public Builder setFeatureFqn(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      exprCase_ = 1;
      expr_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string feature_fqn = 1 [json_name = "featureFqn"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFeatureFqn() {
      if (exprCase_ == 1) {
        exprCase_ = 0;
        expr_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <code>string feature_fqn = 1 [json_name = "featureFqn"];</code>
     * @param value The bytes for featureFqn to set.
     * @return This builder for chaining.
     */
    public Builder setFeatureFqnBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      exprCase_ = 1;
      expr_ = value;
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


    // @@protoc_insertion_point(builder_scope:chalk.common.v1.OutputExpr)
  }

  // @@protoc_insertion_point(class_scope:chalk.common.v1.OutputExpr)
  private static final ai.chalk.protos.chalk.common.v1.OutputExpr DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.common.v1.OutputExpr();
  }

  public static ai.chalk.protos.chalk.common.v1.OutputExpr getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OutputExpr>
      PARSER = new com.google.protobuf.AbstractParser<OutputExpr>() {
    @java.lang.Override
    public OutputExpr parsePartialFrom(
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

  public static com.google.protobuf.Parser<OutputExpr> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OutputExpr> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.common.v1.OutputExpr getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

