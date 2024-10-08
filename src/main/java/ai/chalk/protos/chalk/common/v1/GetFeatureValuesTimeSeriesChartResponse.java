// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/common/v1/feature_values.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.common.v1;

/**
 * Protobuf type {@code chalk.common.v1.GetFeatureValuesTimeSeriesChartResponse}
 */
@java.lang.Deprecated public final class GetFeatureValuesTimeSeriesChartResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chalk.common.v1.GetFeatureValuesTimeSeriesChartResponse)
    GetFeatureValuesTimeSeriesChartResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetFeatureValuesTimeSeriesChartResponse.newBuilder() to construct.
  private GetFeatureValuesTimeSeriesChartResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetFeatureValuesTimeSeriesChartResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetFeatureValuesTimeSeriesChartResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.common.v1.FeatureValuesProto.internal_static_chalk_common_v1_GetFeatureValuesTimeSeriesChartResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.common.v1.FeatureValuesProto.internal_static_chalk_common_v1_GetFeatureValuesTimeSeriesChartResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.common.v1.GetFeatureValuesTimeSeriesChartResponse.class, ai.chalk.protos.chalk.common.v1.GetFeatureValuesTimeSeriesChartResponse.Builder.class);
  }

  private int bitField0_;
  public static final int CHART_FIELD_NUMBER = 1;
  private ai.chalk.protos.chalk.server.v1.TimeSeriesChart chart_;
  /**
   * <code>.chalk.server.v1.TimeSeriesChart chart = 1 [json_name = "chart"];</code>
   * @return Whether the chart field is set.
   */
  @java.lang.Override
  public boolean hasChart() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.chalk.server.v1.TimeSeriesChart chart = 1 [json_name = "chart"];</code>
   * @return The chart.
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.server.v1.TimeSeriesChart getChart() {
    return chart_ == null ? ai.chalk.protos.chalk.server.v1.TimeSeriesChart.getDefaultInstance() : chart_;
  }
  /**
   * <code>.chalk.server.v1.TimeSeriesChart chart = 1 [json_name = "chart"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.server.v1.TimeSeriesChartOrBuilder getChartOrBuilder() {
    return chart_ == null ? ai.chalk.protos.chalk.server.v1.TimeSeriesChart.getDefaultInstance() : chart_;
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
      output.writeMessage(1, getChart());
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
        .computeMessageSize(1, getChart());
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
    if (!(obj instanceof ai.chalk.protos.chalk.common.v1.GetFeatureValuesTimeSeriesChartResponse)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.common.v1.GetFeatureValuesTimeSeriesChartResponse other = (ai.chalk.protos.chalk.common.v1.GetFeatureValuesTimeSeriesChartResponse) obj;

    if (hasChart() != other.hasChart()) return false;
    if (hasChart()) {
      if (!getChart()
          .equals(other.getChart())) return false;
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
    if (hasChart()) {
      hash = (37 * hash) + CHART_FIELD_NUMBER;
      hash = (53 * hash) + getChart().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.common.v1.GetFeatureValuesTimeSeriesChartResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.common.v1.GetFeatureValuesTimeSeriesChartResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.common.v1.GetFeatureValuesTimeSeriesChartResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.common.v1.GetFeatureValuesTimeSeriesChartResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.common.v1.GetFeatureValuesTimeSeriesChartResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.common.v1.GetFeatureValuesTimeSeriesChartResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.common.v1.GetFeatureValuesTimeSeriesChartResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.common.v1.GetFeatureValuesTimeSeriesChartResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.common.v1.GetFeatureValuesTimeSeriesChartResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.common.v1.GetFeatureValuesTimeSeriesChartResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.common.v1.GetFeatureValuesTimeSeriesChartResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.common.v1.GetFeatureValuesTimeSeriesChartResponse parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.common.v1.GetFeatureValuesTimeSeriesChartResponse prototype) {
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
   * Protobuf type {@code chalk.common.v1.GetFeatureValuesTimeSeriesChartResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.common.v1.GetFeatureValuesTimeSeriesChartResponse)
      ai.chalk.protos.chalk.common.v1.GetFeatureValuesTimeSeriesChartResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.common.v1.FeatureValuesProto.internal_static_chalk_common_v1_GetFeatureValuesTimeSeriesChartResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.common.v1.FeatureValuesProto.internal_static_chalk_common_v1_GetFeatureValuesTimeSeriesChartResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.common.v1.GetFeatureValuesTimeSeriesChartResponse.class, ai.chalk.protos.chalk.common.v1.GetFeatureValuesTimeSeriesChartResponse.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.common.v1.GetFeatureValuesTimeSeriesChartResponse.newBuilder()
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
        getChartFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      chart_ = null;
      if (chartBuilder_ != null) {
        chartBuilder_.dispose();
        chartBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.common.v1.FeatureValuesProto.internal_static_chalk_common_v1_GetFeatureValuesTimeSeriesChartResponse_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.common.v1.GetFeatureValuesTimeSeriesChartResponse getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.common.v1.GetFeatureValuesTimeSeriesChartResponse.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.common.v1.GetFeatureValuesTimeSeriesChartResponse build() {
      ai.chalk.protos.chalk.common.v1.GetFeatureValuesTimeSeriesChartResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.common.v1.GetFeatureValuesTimeSeriesChartResponse buildPartial() {
      ai.chalk.protos.chalk.common.v1.GetFeatureValuesTimeSeriesChartResponse result = new ai.chalk.protos.chalk.common.v1.GetFeatureValuesTimeSeriesChartResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.common.v1.GetFeatureValuesTimeSeriesChartResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.chart_ = chartBuilder_ == null
            ? chart_
            : chartBuilder_.build();
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
      if (other instanceof ai.chalk.protos.chalk.common.v1.GetFeatureValuesTimeSeriesChartResponse) {
        return mergeFrom((ai.chalk.protos.chalk.common.v1.GetFeatureValuesTimeSeriesChartResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.common.v1.GetFeatureValuesTimeSeriesChartResponse other) {
      if (other == ai.chalk.protos.chalk.common.v1.GetFeatureValuesTimeSeriesChartResponse.getDefaultInstance()) return this;
      if (other.hasChart()) {
        mergeChart(other.getChart());
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
                  getChartFieldBuilder().getBuilder(),
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

    private ai.chalk.protos.chalk.server.v1.TimeSeriesChart chart_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.server.v1.TimeSeriesChart, ai.chalk.protos.chalk.server.v1.TimeSeriesChart.Builder, ai.chalk.protos.chalk.server.v1.TimeSeriesChartOrBuilder> chartBuilder_;
    /**
     * <code>.chalk.server.v1.TimeSeriesChart chart = 1 [json_name = "chart"];</code>
     * @return Whether the chart field is set.
     */
    public boolean hasChart() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.chalk.server.v1.TimeSeriesChart chart = 1 [json_name = "chart"];</code>
     * @return The chart.
     */
    public ai.chalk.protos.chalk.server.v1.TimeSeriesChart getChart() {
      if (chartBuilder_ == null) {
        return chart_ == null ? ai.chalk.protos.chalk.server.v1.TimeSeriesChart.getDefaultInstance() : chart_;
      } else {
        return chartBuilder_.getMessage();
      }
    }
    /**
     * <code>.chalk.server.v1.TimeSeriesChart chart = 1 [json_name = "chart"];</code>
     */
    public Builder setChart(ai.chalk.protos.chalk.server.v1.TimeSeriesChart value) {
      if (chartBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        chart_ = value;
      } else {
        chartBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.server.v1.TimeSeriesChart chart = 1 [json_name = "chart"];</code>
     */
    public Builder setChart(
        ai.chalk.protos.chalk.server.v1.TimeSeriesChart.Builder builderForValue) {
      if (chartBuilder_ == null) {
        chart_ = builderForValue.build();
      } else {
        chartBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.server.v1.TimeSeriesChart chart = 1 [json_name = "chart"];</code>
     */
    public Builder mergeChart(ai.chalk.protos.chalk.server.v1.TimeSeriesChart value) {
      if (chartBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          chart_ != null &&
          chart_ != ai.chalk.protos.chalk.server.v1.TimeSeriesChart.getDefaultInstance()) {
          getChartBuilder().mergeFrom(value);
        } else {
          chart_ = value;
        }
      } else {
        chartBuilder_.mergeFrom(value);
      }
      if (chart_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.chalk.server.v1.TimeSeriesChart chart = 1 [json_name = "chart"];</code>
     */
    public Builder clearChart() {
      bitField0_ = (bitField0_ & ~0x00000001);
      chart_ = null;
      if (chartBuilder_ != null) {
        chartBuilder_.dispose();
        chartBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.chalk.server.v1.TimeSeriesChart chart = 1 [json_name = "chart"];</code>
     */
    public ai.chalk.protos.chalk.server.v1.TimeSeriesChart.Builder getChartBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getChartFieldBuilder().getBuilder();
    }
    /**
     * <code>.chalk.server.v1.TimeSeriesChart chart = 1 [json_name = "chart"];</code>
     */
    public ai.chalk.protos.chalk.server.v1.TimeSeriesChartOrBuilder getChartOrBuilder() {
      if (chartBuilder_ != null) {
        return chartBuilder_.getMessageOrBuilder();
      } else {
        return chart_ == null ?
            ai.chalk.protos.chalk.server.v1.TimeSeriesChart.getDefaultInstance() : chart_;
      }
    }
    /**
     * <code>.chalk.server.v1.TimeSeriesChart chart = 1 [json_name = "chart"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.server.v1.TimeSeriesChart, ai.chalk.protos.chalk.server.v1.TimeSeriesChart.Builder, ai.chalk.protos.chalk.server.v1.TimeSeriesChartOrBuilder> 
        getChartFieldBuilder() {
      if (chartBuilder_ == null) {
        chartBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ai.chalk.protos.chalk.server.v1.TimeSeriesChart, ai.chalk.protos.chalk.server.v1.TimeSeriesChart.Builder, ai.chalk.protos.chalk.server.v1.TimeSeriesChartOrBuilder>(
                getChart(),
                getParentForChildren(),
                isClean());
        chart_ = null;
      }
      return chartBuilder_;
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


    // @@protoc_insertion_point(builder_scope:chalk.common.v1.GetFeatureValuesTimeSeriesChartResponse)
  }

  // @@protoc_insertion_point(class_scope:chalk.common.v1.GetFeatureValuesTimeSeriesChartResponse)
  private static final ai.chalk.protos.chalk.common.v1.GetFeatureValuesTimeSeriesChartResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.common.v1.GetFeatureValuesTimeSeriesChartResponse();
  }

  public static ai.chalk.protos.chalk.common.v1.GetFeatureValuesTimeSeriesChartResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetFeatureValuesTimeSeriesChartResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetFeatureValuesTimeSeriesChartResponse>() {
    @java.lang.Override
    public GetFeatureValuesTimeSeriesChartResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetFeatureValuesTimeSeriesChartResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetFeatureValuesTimeSeriesChartResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.common.v1.GetFeatureValuesTimeSeriesChartResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

