// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/chart.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

/**
 * <pre>
 * Deprecated - whenever possible, use `common/v1/chart.proto`
 * </pre>
 *
 * Protobuf type {@code chalk.server.v1.Chart}
 */
public final class Chart extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chalk.server.v1.Chart)
    ChartOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Chart.newBuilder() to construct.
  private Chart(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Chart() {
    title_ = "";
    series_ = java.util.Collections.emptyList();
    xTimestampMs_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Chart();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.server.v1.ChartProto.internal_static_chalk_server_v1_Chart_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.server.v1.ChartProto.internal_static_chalk_server_v1_Chart_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.server.v1.Chart.class, ai.chalk.protos.chalk.server.v1.Chart.Builder.class);
  }

  public static final int TITLE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object title_ = "";
  /**
   * <code>string title = 1 [json_name = "title"];</code>
   * @return The title.
   */
  @java.lang.Override
  public java.lang.String getTitle() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      title_ = s;
      return s;
    }
  }
  /**
   * <code>string title = 1 [json_name = "title"];</code>
   * @return The bytes for title.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTitleBytes() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      title_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SERIES_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<ai.chalk.protos.chalk.server.v1.Series> series_;
  /**
   * <code>repeated .chalk.server.v1.Series series = 2 [json_name = "series"];</code>
   */
  @java.lang.Override
  public java.util.List<ai.chalk.protos.chalk.server.v1.Series> getSeriesList() {
    return series_;
  }
  /**
   * <code>repeated .chalk.server.v1.Series series = 2 [json_name = "series"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends ai.chalk.protos.chalk.server.v1.SeriesOrBuilder> 
      getSeriesOrBuilderList() {
    return series_;
  }
  /**
   * <code>repeated .chalk.server.v1.Series series = 2 [json_name = "series"];</code>
   */
  @java.lang.Override
  public int getSeriesCount() {
    return series_.size();
  }
  /**
   * <code>repeated .chalk.server.v1.Series series = 2 [json_name = "series"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.server.v1.Series getSeries(int index) {
    return series_.get(index);
  }
  /**
   * <code>repeated .chalk.server.v1.Series series = 2 [json_name = "series"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.server.v1.SeriesOrBuilder getSeriesOrBuilder(
      int index) {
    return series_.get(index);
  }

  public static final int X_TIMESTAMP_MS_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.LongList xTimestampMs_ =
      emptyLongList();
  /**
   * <code>repeated int64 x_timestamp_ms = 4 [json_name = "xTimestampMs"];</code>
   * @return A list containing the xTimestampMs.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getXTimestampMsList() {
    return xTimestampMs_;
  }
  /**
   * <code>repeated int64 x_timestamp_ms = 4 [json_name = "xTimestampMs"];</code>
   * @return The count of xTimestampMs.
   */
  public int getXTimestampMsCount() {
    return xTimestampMs_.size();
  }
  /**
   * <code>repeated int64 x_timestamp_ms = 4 [json_name = "xTimestampMs"];</code>
   * @param index The index of the element to return.
   * @return The xTimestampMs at the given index.
   */
  public long getXTimestampMs(int index) {
    return xTimestampMs_.getLong(index);
  }
  private int xTimestampMsMemoizedSerializedSize = -1;

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
    getSerializedSize();
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(title_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, title_);
    }
    for (int i = 0; i < series_.size(); i++) {
      output.writeMessage(2, series_.get(i));
    }
    if (getXTimestampMsList().size() > 0) {
      output.writeUInt32NoTag(34);
      output.writeUInt32NoTag(xTimestampMsMemoizedSerializedSize);
    }
    for (int i = 0; i < xTimestampMs_.size(); i++) {
      output.writeInt64NoTag(xTimestampMs_.getLong(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(title_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, title_);
    }
    for (int i = 0; i < series_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, series_.get(i));
    }
    {
      int dataSize = 0;
      for (int i = 0; i < xTimestampMs_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(xTimestampMs_.getLong(i));
      }
      size += dataSize;
      if (!getXTimestampMsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      xTimestampMsMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof ai.chalk.protos.chalk.server.v1.Chart)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.server.v1.Chart other = (ai.chalk.protos.chalk.server.v1.Chart) obj;

    if (!getTitle()
        .equals(other.getTitle())) return false;
    if (!getSeriesList()
        .equals(other.getSeriesList())) return false;
    if (!getXTimestampMsList()
        .equals(other.getXTimestampMsList())) return false;
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
    hash = (37 * hash) + TITLE_FIELD_NUMBER;
    hash = (53 * hash) + getTitle().hashCode();
    if (getSeriesCount() > 0) {
      hash = (37 * hash) + SERIES_FIELD_NUMBER;
      hash = (53 * hash) + getSeriesList().hashCode();
    }
    if (getXTimestampMsCount() > 0) {
      hash = (37 * hash) + X_TIMESTAMP_MS_FIELD_NUMBER;
      hash = (53 * hash) + getXTimestampMsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.server.v1.Chart parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.Chart parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.Chart parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.Chart parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.Chart parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.server.v1.Chart parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.Chart parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.server.v1.Chart parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.server.v1.Chart parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.server.v1.Chart parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.server.v1.Chart parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.server.v1.Chart parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.server.v1.Chart prototype) {
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
   * Deprecated - whenever possible, use `common/v1/chart.proto`
   * </pre>
   *
   * Protobuf type {@code chalk.server.v1.Chart}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.server.v1.Chart)
      ai.chalk.protos.chalk.server.v1.ChartOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.server.v1.ChartProto.internal_static_chalk_server_v1_Chart_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.server.v1.ChartProto.internal_static_chalk_server_v1_Chart_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.server.v1.Chart.class, ai.chalk.protos.chalk.server.v1.Chart.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.server.v1.Chart.newBuilder()
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
      title_ = "";
      if (seriesBuilder_ == null) {
        series_ = java.util.Collections.emptyList();
      } else {
        series_ = null;
        seriesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      xTimestampMs_ = emptyLongList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.server.v1.ChartProto.internal_static_chalk_server_v1_Chart_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.Chart getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.server.v1.Chart.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.Chart build() {
      ai.chalk.protos.chalk.server.v1.Chart result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.server.v1.Chart buildPartial() {
      ai.chalk.protos.chalk.server.v1.Chart result = new ai.chalk.protos.chalk.server.v1.Chart(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(ai.chalk.protos.chalk.server.v1.Chart result) {
      if (seriesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          series_ = java.util.Collections.unmodifiableList(series_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.series_ = series_;
      } else {
        result.series_ = seriesBuilder_.build();
      }
    }

    private void buildPartial0(ai.chalk.protos.chalk.server.v1.Chart result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.title_ = title_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        xTimestampMs_.makeImmutable();
        result.xTimestampMs_ = xTimestampMs_;
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
      if (other instanceof ai.chalk.protos.chalk.server.v1.Chart) {
        return mergeFrom((ai.chalk.protos.chalk.server.v1.Chart)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.server.v1.Chart other) {
      if (other == ai.chalk.protos.chalk.server.v1.Chart.getDefaultInstance()) return this;
      if (!other.getTitle().isEmpty()) {
        title_ = other.title_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (seriesBuilder_ == null) {
        if (!other.series_.isEmpty()) {
          if (series_.isEmpty()) {
            series_ = other.series_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureSeriesIsMutable();
            series_.addAll(other.series_);
          }
          onChanged();
        }
      } else {
        if (!other.series_.isEmpty()) {
          if (seriesBuilder_.isEmpty()) {
            seriesBuilder_.dispose();
            seriesBuilder_ = null;
            series_ = other.series_;
            bitField0_ = (bitField0_ & ~0x00000002);
            seriesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSeriesFieldBuilder() : null;
          } else {
            seriesBuilder_.addAllMessages(other.series_);
          }
        }
      }
      if (!other.xTimestampMs_.isEmpty()) {
        if (xTimestampMs_.isEmpty()) {
          xTimestampMs_ = other.xTimestampMs_;
          xTimestampMs_.makeImmutable();
          bitField0_ |= 0x00000004;
        } else {
          ensureXTimestampMsIsMutable();
          xTimestampMs_.addAll(other.xTimestampMs_);
        }
        onChanged();
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
              title_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              ai.chalk.protos.chalk.server.v1.Series m =
                  input.readMessage(
                      ai.chalk.protos.chalk.server.v1.Series.parser(),
                      extensionRegistry);
              if (seriesBuilder_ == null) {
                ensureSeriesIsMutable();
                series_.add(m);
              } else {
                seriesBuilder_.addMessage(m);
              }
              break;
            } // case 18
            case 32: {
              long v = input.readInt64();
              ensureXTimestampMsIsMutable();
              xTimestampMs_.addLong(v);
              break;
            } // case 32
            case 34: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureXTimestampMsIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                xTimestampMs_.addLong(input.readInt64());
              }
              input.popLimit(limit);
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

    private java.lang.Object title_ = "";
    /**
     * <code>string title = 1 [json_name = "title"];</code>
     * @return The title.
     */
    public java.lang.String getTitle() {
      java.lang.Object ref = title_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        title_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string title = 1 [json_name = "title"];</code>
     * @return The bytes for title.
     */
    public com.google.protobuf.ByteString
        getTitleBytes() {
      java.lang.Object ref = title_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        title_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string title = 1 [json_name = "title"];</code>
     * @param value The title to set.
     * @return This builder for chaining.
     */
    public Builder setTitle(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      title_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string title = 1 [json_name = "title"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTitle() {
      title_ = getDefaultInstance().getTitle();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string title = 1 [json_name = "title"];</code>
     * @param value The bytes for title to set.
     * @return This builder for chaining.
     */
    public Builder setTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      title_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.util.List<ai.chalk.protos.chalk.server.v1.Series> series_ =
      java.util.Collections.emptyList();
    private void ensureSeriesIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        series_ = new java.util.ArrayList<ai.chalk.protos.chalk.server.v1.Series>(series_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        ai.chalk.protos.chalk.server.v1.Series, ai.chalk.protos.chalk.server.v1.Series.Builder, ai.chalk.protos.chalk.server.v1.SeriesOrBuilder> seriesBuilder_;

    /**
     * <code>repeated .chalk.server.v1.Series series = 2 [json_name = "series"];</code>
     */
    public java.util.List<ai.chalk.protos.chalk.server.v1.Series> getSeriesList() {
      if (seriesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(series_);
      } else {
        return seriesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .chalk.server.v1.Series series = 2 [json_name = "series"];</code>
     */
    public int getSeriesCount() {
      if (seriesBuilder_ == null) {
        return series_.size();
      } else {
        return seriesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .chalk.server.v1.Series series = 2 [json_name = "series"];</code>
     */
    public ai.chalk.protos.chalk.server.v1.Series getSeries(int index) {
      if (seriesBuilder_ == null) {
        return series_.get(index);
      } else {
        return seriesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .chalk.server.v1.Series series = 2 [json_name = "series"];</code>
     */
    public Builder setSeries(
        int index, ai.chalk.protos.chalk.server.v1.Series value) {
      if (seriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSeriesIsMutable();
        series_.set(index, value);
        onChanged();
      } else {
        seriesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .chalk.server.v1.Series series = 2 [json_name = "series"];</code>
     */
    public Builder setSeries(
        int index, ai.chalk.protos.chalk.server.v1.Series.Builder builderForValue) {
      if (seriesBuilder_ == null) {
        ensureSeriesIsMutable();
        series_.set(index, builderForValue.build());
        onChanged();
      } else {
        seriesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .chalk.server.v1.Series series = 2 [json_name = "series"];</code>
     */
    public Builder addSeries(ai.chalk.protos.chalk.server.v1.Series value) {
      if (seriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSeriesIsMutable();
        series_.add(value);
        onChanged();
      } else {
        seriesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .chalk.server.v1.Series series = 2 [json_name = "series"];</code>
     */
    public Builder addSeries(
        int index, ai.chalk.protos.chalk.server.v1.Series value) {
      if (seriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSeriesIsMutable();
        series_.add(index, value);
        onChanged();
      } else {
        seriesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .chalk.server.v1.Series series = 2 [json_name = "series"];</code>
     */
    public Builder addSeries(
        ai.chalk.protos.chalk.server.v1.Series.Builder builderForValue) {
      if (seriesBuilder_ == null) {
        ensureSeriesIsMutable();
        series_.add(builderForValue.build());
        onChanged();
      } else {
        seriesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .chalk.server.v1.Series series = 2 [json_name = "series"];</code>
     */
    public Builder addSeries(
        int index, ai.chalk.protos.chalk.server.v1.Series.Builder builderForValue) {
      if (seriesBuilder_ == null) {
        ensureSeriesIsMutable();
        series_.add(index, builderForValue.build());
        onChanged();
      } else {
        seriesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .chalk.server.v1.Series series = 2 [json_name = "series"];</code>
     */
    public Builder addAllSeries(
        java.lang.Iterable<? extends ai.chalk.protos.chalk.server.v1.Series> values) {
      if (seriesBuilder_ == null) {
        ensureSeriesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, series_);
        onChanged();
      } else {
        seriesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .chalk.server.v1.Series series = 2 [json_name = "series"];</code>
     */
    public Builder clearSeries() {
      if (seriesBuilder_ == null) {
        series_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        seriesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .chalk.server.v1.Series series = 2 [json_name = "series"];</code>
     */
    public Builder removeSeries(int index) {
      if (seriesBuilder_ == null) {
        ensureSeriesIsMutable();
        series_.remove(index);
        onChanged();
      } else {
        seriesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .chalk.server.v1.Series series = 2 [json_name = "series"];</code>
     */
    public ai.chalk.protos.chalk.server.v1.Series.Builder getSeriesBuilder(
        int index) {
      return getSeriesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .chalk.server.v1.Series series = 2 [json_name = "series"];</code>
     */
    public ai.chalk.protos.chalk.server.v1.SeriesOrBuilder getSeriesOrBuilder(
        int index) {
      if (seriesBuilder_ == null) {
        return series_.get(index);  } else {
        return seriesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .chalk.server.v1.Series series = 2 [json_name = "series"];</code>
     */
    public java.util.List<? extends ai.chalk.protos.chalk.server.v1.SeriesOrBuilder> 
         getSeriesOrBuilderList() {
      if (seriesBuilder_ != null) {
        return seriesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(series_);
      }
    }
    /**
     * <code>repeated .chalk.server.v1.Series series = 2 [json_name = "series"];</code>
     */
    public ai.chalk.protos.chalk.server.v1.Series.Builder addSeriesBuilder() {
      return getSeriesFieldBuilder().addBuilder(
          ai.chalk.protos.chalk.server.v1.Series.getDefaultInstance());
    }
    /**
     * <code>repeated .chalk.server.v1.Series series = 2 [json_name = "series"];</code>
     */
    public ai.chalk.protos.chalk.server.v1.Series.Builder addSeriesBuilder(
        int index) {
      return getSeriesFieldBuilder().addBuilder(
          index, ai.chalk.protos.chalk.server.v1.Series.getDefaultInstance());
    }
    /**
     * <code>repeated .chalk.server.v1.Series series = 2 [json_name = "series"];</code>
     */
    public java.util.List<ai.chalk.protos.chalk.server.v1.Series.Builder> 
         getSeriesBuilderList() {
      return getSeriesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        ai.chalk.protos.chalk.server.v1.Series, ai.chalk.protos.chalk.server.v1.Series.Builder, ai.chalk.protos.chalk.server.v1.SeriesOrBuilder> 
        getSeriesFieldBuilder() {
      if (seriesBuilder_ == null) {
        seriesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            ai.chalk.protos.chalk.server.v1.Series, ai.chalk.protos.chalk.server.v1.Series.Builder, ai.chalk.protos.chalk.server.v1.SeriesOrBuilder>(
                series_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        series_ = null;
      }
      return seriesBuilder_;
    }

    private com.google.protobuf.Internal.LongList xTimestampMs_ = emptyLongList();
    private void ensureXTimestampMsIsMutable() {
      if (!xTimestampMs_.isModifiable()) {
        xTimestampMs_ = makeMutableCopy(xTimestampMs_);
      }
      bitField0_ |= 0x00000004;
    }
    /**
     * <code>repeated int64 x_timestamp_ms = 4 [json_name = "xTimestampMs"];</code>
     * @return A list containing the xTimestampMs.
     */
    public java.util.List<java.lang.Long>
        getXTimestampMsList() {
      xTimestampMs_.makeImmutable();
      return xTimestampMs_;
    }
    /**
     * <code>repeated int64 x_timestamp_ms = 4 [json_name = "xTimestampMs"];</code>
     * @return The count of xTimestampMs.
     */
    public int getXTimestampMsCount() {
      return xTimestampMs_.size();
    }
    /**
     * <code>repeated int64 x_timestamp_ms = 4 [json_name = "xTimestampMs"];</code>
     * @param index The index of the element to return.
     * @return The xTimestampMs at the given index.
     */
    public long getXTimestampMs(int index) {
      return xTimestampMs_.getLong(index);
    }
    /**
     * <code>repeated int64 x_timestamp_ms = 4 [json_name = "xTimestampMs"];</code>
     * @param index The index to set the value at.
     * @param value The xTimestampMs to set.
     * @return This builder for chaining.
     */
    public Builder setXTimestampMs(
        int index, long value) {

      ensureXTimestampMsIsMutable();
      xTimestampMs_.setLong(index, value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 x_timestamp_ms = 4 [json_name = "xTimestampMs"];</code>
     * @param value The xTimestampMs to add.
     * @return This builder for chaining.
     */
    public Builder addXTimestampMs(long value) {

      ensureXTimestampMsIsMutable();
      xTimestampMs_.addLong(value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 x_timestamp_ms = 4 [json_name = "xTimestampMs"];</code>
     * @param values The xTimestampMs to add.
     * @return This builder for chaining.
     */
    public Builder addAllXTimestampMs(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureXTimestampMsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, xTimestampMs_);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 x_timestamp_ms = 4 [json_name = "xTimestampMs"];</code>
     * @return This builder for chaining.
     */
    public Builder clearXTimestampMs() {
      xTimestampMs_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000004);
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


    // @@protoc_insertion_point(builder_scope:chalk.server.v1.Chart)
  }

  // @@protoc_insertion_point(class_scope:chalk.server.v1.Chart)
  private static final ai.chalk.protos.chalk.server.v1.Chart DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.server.v1.Chart();
  }

  public static ai.chalk.protos.chalk.server.v1.Chart getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Chart>
      PARSER = new com.google.protobuf.AbstractParser<Chart>() {
    @java.lang.Override
    public Chart parsePartialFrom(
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

  public static com.google.protobuf.Parser<Chart> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Chart> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.server.v1.Chart getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

