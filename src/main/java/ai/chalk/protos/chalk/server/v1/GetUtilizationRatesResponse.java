// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/billing.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.chalk.server.v1;

/**
 * Protobuf type {@code chalk.server.v1.GetUtilizationRatesResponse}
 */
public final class GetUtilizationRatesResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:chalk.server.v1.GetUtilizationRatesResponse)
    GetUtilizationRatesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      GetUtilizationRatesResponse.class.getName());
  }
  // Use GetUtilizationRatesResponse.newBuilder() to construct.
  private GetUtilizationRatesResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private GetUtilizationRatesResponse() {
    rates_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.server.v1.BillingProto.internal_static_chalk_server_v1_GetUtilizationRatesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.server.v1.BillingProto.internal_static_chalk_server_v1_GetUtilizationRatesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.server.v1.GetUtilizationRatesResponse.class, ai.chalk.protos.chalk.server.v1.GetUtilizationRatesResponse.Builder.class);
  }

  public static final int RATES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<ai.chalk.protos.chalk.usage.v1.MachineRate> rates_;
  /**
   * <code>repeated .chalk.usage.v1.MachineRate rates = 1 [json_name = "rates"];</code>
   */
  @java.lang.Override
  public java.util.List<ai.chalk.protos.chalk.usage.v1.MachineRate> getRatesList() {
    return rates_;
  }
  /**
   * <code>repeated .chalk.usage.v1.MachineRate rates = 1 [json_name = "rates"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends ai.chalk.protos.chalk.usage.v1.MachineRateOrBuilder> 
      getRatesOrBuilderList() {
    return rates_;
  }
  /**
   * <code>repeated .chalk.usage.v1.MachineRate rates = 1 [json_name = "rates"];</code>
   */
  @java.lang.Override
  public int getRatesCount() {
    return rates_.size();
  }
  /**
   * <code>repeated .chalk.usage.v1.MachineRate rates = 1 [json_name = "rates"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.usage.v1.MachineRate getRates(int index) {
    return rates_.get(index);
  }
  /**
   * <code>repeated .chalk.usage.v1.MachineRate rates = 1 [json_name = "rates"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.usage.v1.MachineRateOrBuilder getRatesOrBuilder(
      int index) {
    return rates_.get(index);
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
    for (int i = 0; i < rates_.size(); i++) {
      output.writeMessage(1, rates_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < rates_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, rates_.get(i));
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
    if (!(obj instanceof ai.chalk.protos.chalk.server.v1.GetUtilizationRatesResponse)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.server.v1.GetUtilizationRatesResponse other = (ai.chalk.protos.chalk.server.v1.GetUtilizationRatesResponse) obj;

    if (!getRatesList()
        .equals(other.getRatesList())) return false;
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
    if (getRatesCount() > 0) {
      hash = (37 * hash) + RATES_FIELD_NUMBER;
      hash = (53 * hash) + getRatesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.server.v1.GetUtilizationRatesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.GetUtilizationRatesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.GetUtilizationRatesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.GetUtilizationRatesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.GetUtilizationRatesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.GetUtilizationRatesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.GetUtilizationRatesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.server.v1.GetUtilizationRatesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.server.v1.GetUtilizationRatesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.server.v1.GetUtilizationRatesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.GetUtilizationRatesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.server.v1.GetUtilizationRatesResponse parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.server.v1.GetUtilizationRatesResponse prototype) {
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
   * Protobuf type {@code chalk.server.v1.GetUtilizationRatesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.server.v1.GetUtilizationRatesResponse)
      ai.chalk.protos.chalk.server.v1.GetUtilizationRatesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.server.v1.BillingProto.internal_static_chalk_server_v1_GetUtilizationRatesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.server.v1.BillingProto.internal_static_chalk_server_v1_GetUtilizationRatesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.server.v1.GetUtilizationRatesResponse.class, ai.chalk.protos.chalk.server.v1.GetUtilizationRatesResponse.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.server.v1.GetUtilizationRatesResponse.newBuilder()
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
      if (ratesBuilder_ == null) {
        rates_ = java.util.Collections.emptyList();
      } else {
        rates_ = null;
        ratesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.server.v1.BillingProto.internal_static_chalk_server_v1_GetUtilizationRatesResponse_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.GetUtilizationRatesResponse getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.server.v1.GetUtilizationRatesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.GetUtilizationRatesResponse build() {
      ai.chalk.protos.chalk.server.v1.GetUtilizationRatesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.GetUtilizationRatesResponse buildPartial() {
      ai.chalk.protos.chalk.server.v1.GetUtilizationRatesResponse result = new ai.chalk.protos.chalk.server.v1.GetUtilizationRatesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(ai.chalk.protos.chalk.server.v1.GetUtilizationRatesResponse result) {
      if (ratesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          rates_ = java.util.Collections.unmodifiableList(rates_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.rates_ = rates_;
      } else {
        result.rates_ = ratesBuilder_.build();
      }
    }

    private void buildPartial0(ai.chalk.protos.chalk.server.v1.GetUtilizationRatesResponse result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ai.chalk.protos.chalk.server.v1.GetUtilizationRatesResponse) {
        return mergeFrom((ai.chalk.protos.chalk.server.v1.GetUtilizationRatesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.server.v1.GetUtilizationRatesResponse other) {
      if (other == ai.chalk.protos.chalk.server.v1.GetUtilizationRatesResponse.getDefaultInstance()) return this;
      if (ratesBuilder_ == null) {
        if (!other.rates_.isEmpty()) {
          if (rates_.isEmpty()) {
            rates_ = other.rates_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRatesIsMutable();
            rates_.addAll(other.rates_);
          }
          onChanged();
        }
      } else {
        if (!other.rates_.isEmpty()) {
          if (ratesBuilder_.isEmpty()) {
            ratesBuilder_.dispose();
            ratesBuilder_ = null;
            rates_ = other.rates_;
            bitField0_ = (bitField0_ & ~0x00000001);
            ratesBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getRatesFieldBuilder() : null;
          } else {
            ratesBuilder_.addAllMessages(other.rates_);
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
              ai.chalk.protos.chalk.usage.v1.MachineRate m =
                  input.readMessage(
                      ai.chalk.protos.chalk.usage.v1.MachineRate.parser(),
                      extensionRegistry);
              if (ratesBuilder_ == null) {
                ensureRatesIsMutable();
                rates_.add(m);
              } else {
                ratesBuilder_.addMessage(m);
              }
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

    private java.util.List<ai.chalk.protos.chalk.usage.v1.MachineRate> rates_ =
      java.util.Collections.emptyList();
    private void ensureRatesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        rates_ = new java.util.ArrayList<ai.chalk.protos.chalk.usage.v1.MachineRate>(rates_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        ai.chalk.protos.chalk.usage.v1.MachineRate, ai.chalk.protos.chalk.usage.v1.MachineRate.Builder, ai.chalk.protos.chalk.usage.v1.MachineRateOrBuilder> ratesBuilder_;

    /**
     * <code>repeated .chalk.usage.v1.MachineRate rates = 1 [json_name = "rates"];</code>
     */
    public java.util.List<ai.chalk.protos.chalk.usage.v1.MachineRate> getRatesList() {
      if (ratesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(rates_);
      } else {
        return ratesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .chalk.usage.v1.MachineRate rates = 1 [json_name = "rates"];</code>
     */
    public int getRatesCount() {
      if (ratesBuilder_ == null) {
        return rates_.size();
      } else {
        return ratesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .chalk.usage.v1.MachineRate rates = 1 [json_name = "rates"];</code>
     */
    public ai.chalk.protos.chalk.usage.v1.MachineRate getRates(int index) {
      if (ratesBuilder_ == null) {
        return rates_.get(index);
      } else {
        return ratesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .chalk.usage.v1.MachineRate rates = 1 [json_name = "rates"];</code>
     */
    public Builder setRates(
        int index, ai.chalk.protos.chalk.usage.v1.MachineRate value) {
      if (ratesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRatesIsMutable();
        rates_.set(index, value);
        onChanged();
      } else {
        ratesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .chalk.usage.v1.MachineRate rates = 1 [json_name = "rates"];</code>
     */
    public Builder setRates(
        int index, ai.chalk.protos.chalk.usage.v1.MachineRate.Builder builderForValue) {
      if (ratesBuilder_ == null) {
        ensureRatesIsMutable();
        rates_.set(index, builderForValue.build());
        onChanged();
      } else {
        ratesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .chalk.usage.v1.MachineRate rates = 1 [json_name = "rates"];</code>
     */
    public Builder addRates(ai.chalk.protos.chalk.usage.v1.MachineRate value) {
      if (ratesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRatesIsMutable();
        rates_.add(value);
        onChanged();
      } else {
        ratesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .chalk.usage.v1.MachineRate rates = 1 [json_name = "rates"];</code>
     */
    public Builder addRates(
        int index, ai.chalk.protos.chalk.usage.v1.MachineRate value) {
      if (ratesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRatesIsMutable();
        rates_.add(index, value);
        onChanged();
      } else {
        ratesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .chalk.usage.v1.MachineRate rates = 1 [json_name = "rates"];</code>
     */
    public Builder addRates(
        ai.chalk.protos.chalk.usage.v1.MachineRate.Builder builderForValue) {
      if (ratesBuilder_ == null) {
        ensureRatesIsMutable();
        rates_.add(builderForValue.build());
        onChanged();
      } else {
        ratesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .chalk.usage.v1.MachineRate rates = 1 [json_name = "rates"];</code>
     */
    public Builder addRates(
        int index, ai.chalk.protos.chalk.usage.v1.MachineRate.Builder builderForValue) {
      if (ratesBuilder_ == null) {
        ensureRatesIsMutable();
        rates_.add(index, builderForValue.build());
        onChanged();
      } else {
        ratesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .chalk.usage.v1.MachineRate rates = 1 [json_name = "rates"];</code>
     */
    public Builder addAllRates(
        java.lang.Iterable<? extends ai.chalk.protos.chalk.usage.v1.MachineRate> values) {
      if (ratesBuilder_ == null) {
        ensureRatesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, rates_);
        onChanged();
      } else {
        ratesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .chalk.usage.v1.MachineRate rates = 1 [json_name = "rates"];</code>
     */
    public Builder clearRates() {
      if (ratesBuilder_ == null) {
        rates_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        ratesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .chalk.usage.v1.MachineRate rates = 1 [json_name = "rates"];</code>
     */
    public Builder removeRates(int index) {
      if (ratesBuilder_ == null) {
        ensureRatesIsMutable();
        rates_.remove(index);
        onChanged();
      } else {
        ratesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .chalk.usage.v1.MachineRate rates = 1 [json_name = "rates"];</code>
     */
    public ai.chalk.protos.chalk.usage.v1.MachineRate.Builder getRatesBuilder(
        int index) {
      return getRatesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .chalk.usage.v1.MachineRate rates = 1 [json_name = "rates"];</code>
     */
    public ai.chalk.protos.chalk.usage.v1.MachineRateOrBuilder getRatesOrBuilder(
        int index) {
      if (ratesBuilder_ == null) {
        return rates_.get(index);  } else {
        return ratesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .chalk.usage.v1.MachineRate rates = 1 [json_name = "rates"];</code>
     */
    public java.util.List<? extends ai.chalk.protos.chalk.usage.v1.MachineRateOrBuilder> 
         getRatesOrBuilderList() {
      if (ratesBuilder_ != null) {
        return ratesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(rates_);
      }
    }
    /**
     * <code>repeated .chalk.usage.v1.MachineRate rates = 1 [json_name = "rates"];</code>
     */
    public ai.chalk.protos.chalk.usage.v1.MachineRate.Builder addRatesBuilder() {
      return getRatesFieldBuilder().addBuilder(
          ai.chalk.protos.chalk.usage.v1.MachineRate.getDefaultInstance());
    }
    /**
     * <code>repeated .chalk.usage.v1.MachineRate rates = 1 [json_name = "rates"];</code>
     */
    public ai.chalk.protos.chalk.usage.v1.MachineRate.Builder addRatesBuilder(
        int index) {
      return getRatesFieldBuilder().addBuilder(
          index, ai.chalk.protos.chalk.usage.v1.MachineRate.getDefaultInstance());
    }
    /**
     * <code>repeated .chalk.usage.v1.MachineRate rates = 1 [json_name = "rates"];</code>
     */
    public java.util.List<ai.chalk.protos.chalk.usage.v1.MachineRate.Builder> 
         getRatesBuilderList() {
      return getRatesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        ai.chalk.protos.chalk.usage.v1.MachineRate, ai.chalk.protos.chalk.usage.v1.MachineRate.Builder, ai.chalk.protos.chalk.usage.v1.MachineRateOrBuilder> 
        getRatesFieldBuilder() {
      if (ratesBuilder_ == null) {
        ratesBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            ai.chalk.protos.chalk.usage.v1.MachineRate, ai.chalk.protos.chalk.usage.v1.MachineRate.Builder, ai.chalk.protos.chalk.usage.v1.MachineRateOrBuilder>(
                rates_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        rates_ = null;
      }
      return ratesBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:chalk.server.v1.GetUtilizationRatesResponse)
  }

  // @@protoc_insertion_point(class_scope:chalk.server.v1.GetUtilizationRatesResponse)
  private static final ai.chalk.protos.chalk.server.v1.GetUtilizationRatesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.server.v1.GetUtilizationRatesResponse();
  }

  public static ai.chalk.protos.chalk.server.v1.GetUtilizationRatesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetUtilizationRatesResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetUtilizationRatesResponse>() {
    @java.lang.Override
    public GetUtilizationRatesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetUtilizationRatesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetUtilizationRatesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.server.v1.GetUtilizationRatesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
