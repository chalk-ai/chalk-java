// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/pod_request.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

/**
 * Protobuf type {@code chalk.server.v1.GetPodRequestChartsResponse}
 */
public final class GetPodRequestChartsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chalk.server.v1.GetPodRequestChartsResponse)
    GetPodRequestChartsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetPodRequestChartsResponse.newBuilder() to construct.
  private GetPodRequestChartsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetPodRequestChartsResponse() {
    charts_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetPodRequestChartsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.server.v1.PodRequestProto.internal_static_chalk_server_v1_GetPodRequestChartsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.server.v1.PodRequestProto.internal_static_chalk_server_v1_GetPodRequestChartsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.server.v1.GetPodRequestChartsResponse.class, ai.chalk.protos.chalk.server.v1.GetPodRequestChartsResponse.Builder.class);
  }

  public static final int CHARTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<ai.chalk.protos.chalk.chart.v1.DenseTimeSeriesChart> charts_;
  /**
   * <pre>
   * Return one chart per resource type, as it does not make sense to graph different resource types on the
   * same chart (even though our graph libraries do allow this, they have different units and orders of magnitude)
   * </pre>
   *
   * <code>repeated .chalk.chart.v1.DenseTimeSeriesChart charts = 1 [json_name = "charts"];</code>
   */
  @java.lang.Override
  public java.util.List<ai.chalk.protos.chalk.chart.v1.DenseTimeSeriesChart> getChartsList() {
    return charts_;
  }
  /**
   * <pre>
   * Return one chart per resource type, as it does not make sense to graph different resource types on the
   * same chart (even though our graph libraries do allow this, they have different units and orders of magnitude)
   * </pre>
   *
   * <code>repeated .chalk.chart.v1.DenseTimeSeriesChart charts = 1 [json_name = "charts"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends ai.chalk.protos.chalk.chart.v1.DenseTimeSeriesChartOrBuilder> 
      getChartsOrBuilderList() {
    return charts_;
  }
  /**
   * <pre>
   * Return one chart per resource type, as it does not make sense to graph different resource types on the
   * same chart (even though our graph libraries do allow this, they have different units and orders of magnitude)
   * </pre>
   *
   * <code>repeated .chalk.chart.v1.DenseTimeSeriesChart charts = 1 [json_name = "charts"];</code>
   */
  @java.lang.Override
  public int getChartsCount() {
    return charts_.size();
  }
  /**
   * <pre>
   * Return one chart per resource type, as it does not make sense to graph different resource types on the
   * same chart (even though our graph libraries do allow this, they have different units and orders of magnitude)
   * </pre>
   *
   * <code>repeated .chalk.chart.v1.DenseTimeSeriesChart charts = 1 [json_name = "charts"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.chart.v1.DenseTimeSeriesChart getCharts(int index) {
    return charts_.get(index);
  }
  /**
   * <pre>
   * Return one chart per resource type, as it does not make sense to graph different resource types on the
   * same chart (even though our graph libraries do allow this, they have different units and orders of magnitude)
   * </pre>
   *
   * <code>repeated .chalk.chart.v1.DenseTimeSeriesChart charts = 1 [json_name = "charts"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.chart.v1.DenseTimeSeriesChartOrBuilder getChartsOrBuilder(
      int index) {
    return charts_.get(index);
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
    for (int i = 0; i < charts_.size(); i++) {
      output.writeMessage(1, charts_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < charts_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, charts_.get(i));
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
    if (!(obj instanceof ai.chalk.protos.chalk.server.v1.GetPodRequestChartsResponse)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.server.v1.GetPodRequestChartsResponse other = (ai.chalk.protos.chalk.server.v1.GetPodRequestChartsResponse) obj;

    if (!getChartsList()
        .equals(other.getChartsList())) return false;
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
    if (getChartsCount() > 0) {
      hash = (37 * hash) + CHARTS_FIELD_NUMBER;
      hash = (53 * hash) + getChartsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.server.v1.GetPodRequestChartsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.GetPodRequestChartsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.GetPodRequestChartsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.GetPodRequestChartsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.GetPodRequestChartsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.GetPodRequestChartsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.GetPodRequestChartsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.server.v1.GetPodRequestChartsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.server.v1.GetPodRequestChartsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.server.v1.GetPodRequestChartsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.GetPodRequestChartsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.server.v1.GetPodRequestChartsResponse parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.server.v1.GetPodRequestChartsResponse prototype) {
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
   * Protobuf type {@code chalk.server.v1.GetPodRequestChartsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.server.v1.GetPodRequestChartsResponse)
      ai.chalk.protos.chalk.server.v1.GetPodRequestChartsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.server.v1.PodRequestProto.internal_static_chalk_server_v1_GetPodRequestChartsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.server.v1.PodRequestProto.internal_static_chalk_server_v1_GetPodRequestChartsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.server.v1.GetPodRequestChartsResponse.class, ai.chalk.protos.chalk.server.v1.GetPodRequestChartsResponse.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.server.v1.GetPodRequestChartsResponse.newBuilder()
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
      if (chartsBuilder_ == null) {
        charts_ = java.util.Collections.emptyList();
      } else {
        charts_ = null;
        chartsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.server.v1.PodRequestProto.internal_static_chalk_server_v1_GetPodRequestChartsResponse_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.GetPodRequestChartsResponse getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.server.v1.GetPodRequestChartsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.GetPodRequestChartsResponse build() {
      ai.chalk.protos.chalk.server.v1.GetPodRequestChartsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.GetPodRequestChartsResponse buildPartial() {
      ai.chalk.protos.chalk.server.v1.GetPodRequestChartsResponse result = new ai.chalk.protos.chalk.server.v1.GetPodRequestChartsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(ai.chalk.protos.chalk.server.v1.GetPodRequestChartsResponse result) {
      if (chartsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          charts_ = java.util.Collections.unmodifiableList(charts_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.charts_ = charts_;
      } else {
        result.charts_ = chartsBuilder_.build();
      }
    }

    private void buildPartial0(ai.chalk.protos.chalk.server.v1.GetPodRequestChartsResponse result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof ai.chalk.protos.chalk.server.v1.GetPodRequestChartsResponse) {
        return mergeFrom((ai.chalk.protos.chalk.server.v1.GetPodRequestChartsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.server.v1.GetPodRequestChartsResponse other) {
      if (other == ai.chalk.protos.chalk.server.v1.GetPodRequestChartsResponse.getDefaultInstance()) return this;
      if (chartsBuilder_ == null) {
        if (!other.charts_.isEmpty()) {
          if (charts_.isEmpty()) {
            charts_ = other.charts_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureChartsIsMutable();
            charts_.addAll(other.charts_);
          }
          onChanged();
        }
      } else {
        if (!other.charts_.isEmpty()) {
          if (chartsBuilder_.isEmpty()) {
            chartsBuilder_.dispose();
            chartsBuilder_ = null;
            charts_ = other.charts_;
            bitField0_ = (bitField0_ & ~0x00000001);
            chartsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getChartsFieldBuilder() : null;
          } else {
            chartsBuilder_.addAllMessages(other.charts_);
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
              ai.chalk.protos.chalk.chart.v1.DenseTimeSeriesChart m =
                  input.readMessage(
                      ai.chalk.protos.chalk.chart.v1.DenseTimeSeriesChart.parser(),
                      extensionRegistry);
              if (chartsBuilder_ == null) {
                ensureChartsIsMutable();
                charts_.add(m);
              } else {
                chartsBuilder_.addMessage(m);
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

    private java.util.List<ai.chalk.protos.chalk.chart.v1.DenseTimeSeriesChart> charts_ =
      java.util.Collections.emptyList();
    private void ensureChartsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        charts_ = new java.util.ArrayList<ai.chalk.protos.chalk.chart.v1.DenseTimeSeriesChart>(charts_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        ai.chalk.protos.chalk.chart.v1.DenseTimeSeriesChart, ai.chalk.protos.chalk.chart.v1.DenseTimeSeriesChart.Builder, ai.chalk.protos.chalk.chart.v1.DenseTimeSeriesChartOrBuilder> chartsBuilder_;

    /**
     * <pre>
     * Return one chart per resource type, as it does not make sense to graph different resource types on the
     * same chart (even though our graph libraries do allow this, they have different units and orders of magnitude)
     * </pre>
     *
     * <code>repeated .chalk.chart.v1.DenseTimeSeriesChart charts = 1 [json_name = "charts"];</code>
     */
    public java.util.List<ai.chalk.protos.chalk.chart.v1.DenseTimeSeriesChart> getChartsList() {
      if (chartsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(charts_);
      } else {
        return chartsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Return one chart per resource type, as it does not make sense to graph different resource types on the
     * same chart (even though our graph libraries do allow this, they have different units and orders of magnitude)
     * </pre>
     *
     * <code>repeated .chalk.chart.v1.DenseTimeSeriesChart charts = 1 [json_name = "charts"];</code>
     */
    public int getChartsCount() {
      if (chartsBuilder_ == null) {
        return charts_.size();
      } else {
        return chartsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Return one chart per resource type, as it does not make sense to graph different resource types on the
     * same chart (even though our graph libraries do allow this, they have different units and orders of magnitude)
     * </pre>
     *
     * <code>repeated .chalk.chart.v1.DenseTimeSeriesChart charts = 1 [json_name = "charts"];</code>
     */
    public ai.chalk.protos.chalk.chart.v1.DenseTimeSeriesChart getCharts(int index) {
      if (chartsBuilder_ == null) {
        return charts_.get(index);
      } else {
        return chartsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Return one chart per resource type, as it does not make sense to graph different resource types on the
     * same chart (even though our graph libraries do allow this, they have different units and orders of magnitude)
     * </pre>
     *
     * <code>repeated .chalk.chart.v1.DenseTimeSeriesChart charts = 1 [json_name = "charts"];</code>
     */
    public Builder setCharts(
        int index, ai.chalk.protos.chalk.chart.v1.DenseTimeSeriesChart value) {
      if (chartsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureChartsIsMutable();
        charts_.set(index, value);
        onChanged();
      } else {
        chartsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Return one chart per resource type, as it does not make sense to graph different resource types on the
     * same chart (even though our graph libraries do allow this, they have different units and orders of magnitude)
     * </pre>
     *
     * <code>repeated .chalk.chart.v1.DenseTimeSeriesChart charts = 1 [json_name = "charts"];</code>
     */
    public Builder setCharts(
        int index, ai.chalk.protos.chalk.chart.v1.DenseTimeSeriesChart.Builder builderForValue) {
      if (chartsBuilder_ == null) {
        ensureChartsIsMutable();
        charts_.set(index, builderForValue.build());
        onChanged();
      } else {
        chartsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Return one chart per resource type, as it does not make sense to graph different resource types on the
     * same chart (even though our graph libraries do allow this, they have different units and orders of magnitude)
     * </pre>
     *
     * <code>repeated .chalk.chart.v1.DenseTimeSeriesChart charts = 1 [json_name = "charts"];</code>
     */
    public Builder addCharts(ai.chalk.protos.chalk.chart.v1.DenseTimeSeriesChart value) {
      if (chartsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureChartsIsMutable();
        charts_.add(value);
        onChanged();
      } else {
        chartsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Return one chart per resource type, as it does not make sense to graph different resource types on the
     * same chart (even though our graph libraries do allow this, they have different units and orders of magnitude)
     * </pre>
     *
     * <code>repeated .chalk.chart.v1.DenseTimeSeriesChart charts = 1 [json_name = "charts"];</code>
     */
    public Builder addCharts(
        int index, ai.chalk.protos.chalk.chart.v1.DenseTimeSeriesChart value) {
      if (chartsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureChartsIsMutable();
        charts_.add(index, value);
        onChanged();
      } else {
        chartsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Return one chart per resource type, as it does not make sense to graph different resource types on the
     * same chart (even though our graph libraries do allow this, they have different units and orders of magnitude)
     * </pre>
     *
     * <code>repeated .chalk.chart.v1.DenseTimeSeriesChart charts = 1 [json_name = "charts"];</code>
     */
    public Builder addCharts(
        ai.chalk.protos.chalk.chart.v1.DenseTimeSeriesChart.Builder builderForValue) {
      if (chartsBuilder_ == null) {
        ensureChartsIsMutable();
        charts_.add(builderForValue.build());
        onChanged();
      } else {
        chartsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Return one chart per resource type, as it does not make sense to graph different resource types on the
     * same chart (even though our graph libraries do allow this, they have different units and orders of magnitude)
     * </pre>
     *
     * <code>repeated .chalk.chart.v1.DenseTimeSeriesChart charts = 1 [json_name = "charts"];</code>
     */
    public Builder addCharts(
        int index, ai.chalk.protos.chalk.chart.v1.DenseTimeSeriesChart.Builder builderForValue) {
      if (chartsBuilder_ == null) {
        ensureChartsIsMutable();
        charts_.add(index, builderForValue.build());
        onChanged();
      } else {
        chartsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Return one chart per resource type, as it does not make sense to graph different resource types on the
     * same chart (even though our graph libraries do allow this, they have different units and orders of magnitude)
     * </pre>
     *
     * <code>repeated .chalk.chart.v1.DenseTimeSeriesChart charts = 1 [json_name = "charts"];</code>
     */
    public Builder addAllCharts(
        java.lang.Iterable<? extends ai.chalk.protos.chalk.chart.v1.DenseTimeSeriesChart> values) {
      if (chartsBuilder_ == null) {
        ensureChartsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, charts_);
        onChanged();
      } else {
        chartsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Return one chart per resource type, as it does not make sense to graph different resource types on the
     * same chart (even though our graph libraries do allow this, they have different units and orders of magnitude)
     * </pre>
     *
     * <code>repeated .chalk.chart.v1.DenseTimeSeriesChart charts = 1 [json_name = "charts"];</code>
     */
    public Builder clearCharts() {
      if (chartsBuilder_ == null) {
        charts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        chartsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Return one chart per resource type, as it does not make sense to graph different resource types on the
     * same chart (even though our graph libraries do allow this, they have different units and orders of magnitude)
     * </pre>
     *
     * <code>repeated .chalk.chart.v1.DenseTimeSeriesChart charts = 1 [json_name = "charts"];</code>
     */
    public Builder removeCharts(int index) {
      if (chartsBuilder_ == null) {
        ensureChartsIsMutable();
        charts_.remove(index);
        onChanged();
      } else {
        chartsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Return one chart per resource type, as it does not make sense to graph different resource types on the
     * same chart (even though our graph libraries do allow this, they have different units and orders of magnitude)
     * </pre>
     *
     * <code>repeated .chalk.chart.v1.DenseTimeSeriesChart charts = 1 [json_name = "charts"];</code>
     */
    public ai.chalk.protos.chalk.chart.v1.DenseTimeSeriesChart.Builder getChartsBuilder(
        int index) {
      return getChartsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Return one chart per resource type, as it does not make sense to graph different resource types on the
     * same chart (even though our graph libraries do allow this, they have different units and orders of magnitude)
     * </pre>
     *
     * <code>repeated .chalk.chart.v1.DenseTimeSeriesChart charts = 1 [json_name = "charts"];</code>
     */
    public ai.chalk.protos.chalk.chart.v1.DenseTimeSeriesChartOrBuilder getChartsOrBuilder(
        int index) {
      if (chartsBuilder_ == null) {
        return charts_.get(index);  } else {
        return chartsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Return one chart per resource type, as it does not make sense to graph different resource types on the
     * same chart (even though our graph libraries do allow this, they have different units and orders of magnitude)
     * </pre>
     *
     * <code>repeated .chalk.chart.v1.DenseTimeSeriesChart charts = 1 [json_name = "charts"];</code>
     */
    public java.util.List<? extends ai.chalk.protos.chalk.chart.v1.DenseTimeSeriesChartOrBuilder> 
         getChartsOrBuilderList() {
      if (chartsBuilder_ != null) {
        return chartsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(charts_);
      }
    }
    /**
     * <pre>
     * Return one chart per resource type, as it does not make sense to graph different resource types on the
     * same chart (even though our graph libraries do allow this, they have different units and orders of magnitude)
     * </pre>
     *
     * <code>repeated .chalk.chart.v1.DenseTimeSeriesChart charts = 1 [json_name = "charts"];</code>
     */
    public ai.chalk.protos.chalk.chart.v1.DenseTimeSeriesChart.Builder addChartsBuilder() {
      return getChartsFieldBuilder().addBuilder(
          ai.chalk.protos.chalk.chart.v1.DenseTimeSeriesChart.getDefaultInstance());
    }
    /**
     * <pre>
     * Return one chart per resource type, as it does not make sense to graph different resource types on the
     * same chart (even though our graph libraries do allow this, they have different units and orders of magnitude)
     * </pre>
     *
     * <code>repeated .chalk.chart.v1.DenseTimeSeriesChart charts = 1 [json_name = "charts"];</code>
     */
    public ai.chalk.protos.chalk.chart.v1.DenseTimeSeriesChart.Builder addChartsBuilder(
        int index) {
      return getChartsFieldBuilder().addBuilder(
          index, ai.chalk.protos.chalk.chart.v1.DenseTimeSeriesChart.getDefaultInstance());
    }
    /**
     * <pre>
     * Return one chart per resource type, as it does not make sense to graph different resource types on the
     * same chart (even though our graph libraries do allow this, they have different units and orders of magnitude)
     * </pre>
     *
     * <code>repeated .chalk.chart.v1.DenseTimeSeriesChart charts = 1 [json_name = "charts"];</code>
     */
    public java.util.List<ai.chalk.protos.chalk.chart.v1.DenseTimeSeriesChart.Builder> 
         getChartsBuilderList() {
      return getChartsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        ai.chalk.protos.chalk.chart.v1.DenseTimeSeriesChart, ai.chalk.protos.chalk.chart.v1.DenseTimeSeriesChart.Builder, ai.chalk.protos.chalk.chart.v1.DenseTimeSeriesChartOrBuilder> 
        getChartsFieldBuilder() {
      if (chartsBuilder_ == null) {
        chartsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            ai.chalk.protos.chalk.chart.v1.DenseTimeSeriesChart, ai.chalk.protos.chalk.chart.v1.DenseTimeSeriesChart.Builder, ai.chalk.protos.chalk.chart.v1.DenseTimeSeriesChartOrBuilder>(
                charts_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        charts_ = null;
      }
      return chartsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:chalk.server.v1.GetPodRequestChartsResponse)
  }

  // @@protoc_insertion_point(class_scope:chalk.server.v1.GetPodRequestChartsResponse)
  private static final ai.chalk.protos.chalk.server.v1.GetPodRequestChartsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.server.v1.GetPodRequestChartsResponse();
  }

  public static ai.chalk.protos.chalk.server.v1.GetPodRequestChartsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetPodRequestChartsResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetPodRequestChartsResponse>() {
    @java.lang.Override
    public GetPodRequestChartsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetPodRequestChartsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetPodRequestChartsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.server.v1.GetPodRequestChartsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

