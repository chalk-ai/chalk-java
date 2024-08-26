// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/aggregate/v1/service.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.aggregate.v1;

/**
 * Protobuf type {@code chalk.aggregate.v1.GetAggregateBackfillJobsResponse}
 */
public final class GetAggregateBackfillJobsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chalk.aggregate.v1.GetAggregateBackfillJobsResponse)
    GetAggregateBackfillJobsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetAggregateBackfillJobsResponse.newBuilder() to construct.
  private GetAggregateBackfillJobsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetAggregateBackfillJobsResponse() {
    jobs_ = java.util.Collections.emptyList();
    cursor_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetAggregateBackfillJobsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.aggregate.v1.ServiceProto.internal_static_chalk_aggregate_v1_GetAggregateBackfillJobsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.aggregate.v1.ServiceProto.internal_static_chalk_aggregate_v1_GetAggregateBackfillJobsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsResponse.class, ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsResponse.Builder.class);
  }

  public static final int JOBS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillJob> jobs_;
  /**
   * <code>repeated .chalk.aggregate.v1.AggregateBackfillJob jobs = 1 [json_name = "jobs"];</code>
   */
  @java.lang.Override
  public java.util.List<ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillJob> getJobsList() {
    return jobs_;
  }
  /**
   * <code>repeated .chalk.aggregate.v1.AggregateBackfillJob jobs = 1 [json_name = "jobs"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillJobOrBuilder> 
      getJobsOrBuilderList() {
    return jobs_;
  }
  /**
   * <code>repeated .chalk.aggregate.v1.AggregateBackfillJob jobs = 1 [json_name = "jobs"];</code>
   */
  @java.lang.Override
  public int getJobsCount() {
    return jobs_.size();
  }
  /**
   * <code>repeated .chalk.aggregate.v1.AggregateBackfillJob jobs = 1 [json_name = "jobs"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillJob getJobs(int index) {
    return jobs_.get(index);
  }
  /**
   * <code>repeated .chalk.aggregate.v1.AggregateBackfillJob jobs = 1 [json_name = "jobs"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillJobOrBuilder getJobsOrBuilder(
      int index) {
    return jobs_.get(index);
  }

  public static final int CURSOR_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object cursor_ = "";
  /**
   * <code>string cursor = 2 [json_name = "cursor"];</code>
   * @return The cursor.
   */
  @java.lang.Override
  public java.lang.String getCursor() {
    java.lang.Object ref = cursor_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cursor_ = s;
      return s;
    }
  }
  /**
   * <code>string cursor = 2 [json_name = "cursor"];</code>
   * @return The bytes for cursor.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCursorBytes() {
    java.lang.Object ref = cursor_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cursor_ = b;
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
    for (int i = 0; i < jobs_.size(); i++) {
      output.writeMessage(1, jobs_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cursor_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, cursor_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < jobs_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, jobs_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cursor_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, cursor_);
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
    if (!(obj instanceof ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsResponse)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsResponse other = (ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsResponse) obj;

    if (!getJobsList()
        .equals(other.getJobsList())) return false;
    if (!getCursor()
        .equals(other.getCursor())) return false;
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
    if (getJobsCount() > 0) {
      hash = (37 * hash) + JOBS_FIELD_NUMBER;
      hash = (53 * hash) + getJobsList().hashCode();
    }
    hash = (37 * hash) + CURSOR_FIELD_NUMBER;
    hash = (53 * hash) + getCursor().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsResponse parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsResponse prototype) {
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
   * Protobuf type {@code chalk.aggregate.v1.GetAggregateBackfillJobsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.aggregate.v1.GetAggregateBackfillJobsResponse)
      ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.aggregate.v1.ServiceProto.internal_static_chalk_aggregate_v1_GetAggregateBackfillJobsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.aggregate.v1.ServiceProto.internal_static_chalk_aggregate_v1_GetAggregateBackfillJobsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsResponse.class, ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsResponse.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsResponse.newBuilder()
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
      if (jobsBuilder_ == null) {
        jobs_ = java.util.Collections.emptyList();
      } else {
        jobs_ = null;
        jobsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      cursor_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.aggregate.v1.ServiceProto.internal_static_chalk_aggregate_v1_GetAggregateBackfillJobsResponse_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsResponse getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsResponse build() {
      ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsResponse buildPartial() {
      ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsResponse result = new ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsResponse result) {
      if (jobsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          jobs_ = java.util.Collections.unmodifiableList(jobs_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.jobs_ = jobs_;
      } else {
        result.jobs_ = jobsBuilder_.build();
      }
    }

    private void buildPartial0(ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.cursor_ = cursor_;
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
      if (other instanceof ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsResponse) {
        return mergeFrom((ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsResponse other) {
      if (other == ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsResponse.getDefaultInstance()) return this;
      if (jobsBuilder_ == null) {
        if (!other.jobs_.isEmpty()) {
          if (jobs_.isEmpty()) {
            jobs_ = other.jobs_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureJobsIsMutable();
            jobs_.addAll(other.jobs_);
          }
          onChanged();
        }
      } else {
        if (!other.jobs_.isEmpty()) {
          if (jobsBuilder_.isEmpty()) {
            jobsBuilder_.dispose();
            jobsBuilder_ = null;
            jobs_ = other.jobs_;
            bitField0_ = (bitField0_ & ~0x00000001);
            jobsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getJobsFieldBuilder() : null;
          } else {
            jobsBuilder_.addAllMessages(other.jobs_);
          }
        }
      }
      if (!other.getCursor().isEmpty()) {
        cursor_ = other.cursor_;
        bitField0_ |= 0x00000002;
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
              ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillJob m =
                  input.readMessage(
                      ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillJob.parser(),
                      extensionRegistry);
              if (jobsBuilder_ == null) {
                ensureJobsIsMutable();
                jobs_.add(m);
              } else {
                jobsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              cursor_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
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
    private int bitField0_;

    private java.util.List<ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillJob> jobs_ =
      java.util.Collections.emptyList();
    private void ensureJobsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        jobs_ = new java.util.ArrayList<ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillJob>(jobs_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillJob, ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillJob.Builder, ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillJobOrBuilder> jobsBuilder_;

    /**
     * <code>repeated .chalk.aggregate.v1.AggregateBackfillJob jobs = 1 [json_name = "jobs"];</code>
     */
    public java.util.List<ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillJob> getJobsList() {
      if (jobsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(jobs_);
      } else {
        return jobsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .chalk.aggregate.v1.AggregateBackfillJob jobs = 1 [json_name = "jobs"];</code>
     */
    public int getJobsCount() {
      if (jobsBuilder_ == null) {
        return jobs_.size();
      } else {
        return jobsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .chalk.aggregate.v1.AggregateBackfillJob jobs = 1 [json_name = "jobs"];</code>
     */
    public ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillJob getJobs(int index) {
      if (jobsBuilder_ == null) {
        return jobs_.get(index);
      } else {
        return jobsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .chalk.aggregate.v1.AggregateBackfillJob jobs = 1 [json_name = "jobs"];</code>
     */
    public Builder setJobs(
        int index, ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillJob value) {
      if (jobsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureJobsIsMutable();
        jobs_.set(index, value);
        onChanged();
      } else {
        jobsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .chalk.aggregate.v1.AggregateBackfillJob jobs = 1 [json_name = "jobs"];</code>
     */
    public Builder setJobs(
        int index, ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillJob.Builder builderForValue) {
      if (jobsBuilder_ == null) {
        ensureJobsIsMutable();
        jobs_.set(index, builderForValue.build());
        onChanged();
      } else {
        jobsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .chalk.aggregate.v1.AggregateBackfillJob jobs = 1 [json_name = "jobs"];</code>
     */
    public Builder addJobs(ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillJob value) {
      if (jobsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureJobsIsMutable();
        jobs_.add(value);
        onChanged();
      } else {
        jobsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .chalk.aggregate.v1.AggregateBackfillJob jobs = 1 [json_name = "jobs"];</code>
     */
    public Builder addJobs(
        int index, ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillJob value) {
      if (jobsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureJobsIsMutable();
        jobs_.add(index, value);
        onChanged();
      } else {
        jobsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .chalk.aggregate.v1.AggregateBackfillJob jobs = 1 [json_name = "jobs"];</code>
     */
    public Builder addJobs(
        ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillJob.Builder builderForValue) {
      if (jobsBuilder_ == null) {
        ensureJobsIsMutable();
        jobs_.add(builderForValue.build());
        onChanged();
      } else {
        jobsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .chalk.aggregate.v1.AggregateBackfillJob jobs = 1 [json_name = "jobs"];</code>
     */
    public Builder addJobs(
        int index, ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillJob.Builder builderForValue) {
      if (jobsBuilder_ == null) {
        ensureJobsIsMutable();
        jobs_.add(index, builderForValue.build());
        onChanged();
      } else {
        jobsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .chalk.aggregate.v1.AggregateBackfillJob jobs = 1 [json_name = "jobs"];</code>
     */
    public Builder addAllJobs(
        java.lang.Iterable<? extends ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillJob> values) {
      if (jobsBuilder_ == null) {
        ensureJobsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, jobs_);
        onChanged();
      } else {
        jobsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .chalk.aggregate.v1.AggregateBackfillJob jobs = 1 [json_name = "jobs"];</code>
     */
    public Builder clearJobs() {
      if (jobsBuilder_ == null) {
        jobs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        jobsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .chalk.aggregate.v1.AggregateBackfillJob jobs = 1 [json_name = "jobs"];</code>
     */
    public Builder removeJobs(int index) {
      if (jobsBuilder_ == null) {
        ensureJobsIsMutable();
        jobs_.remove(index);
        onChanged();
      } else {
        jobsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .chalk.aggregate.v1.AggregateBackfillJob jobs = 1 [json_name = "jobs"];</code>
     */
    public ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillJob.Builder getJobsBuilder(
        int index) {
      return getJobsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .chalk.aggregate.v1.AggregateBackfillJob jobs = 1 [json_name = "jobs"];</code>
     */
    public ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillJobOrBuilder getJobsOrBuilder(
        int index) {
      if (jobsBuilder_ == null) {
        return jobs_.get(index);  } else {
        return jobsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .chalk.aggregate.v1.AggregateBackfillJob jobs = 1 [json_name = "jobs"];</code>
     */
    public java.util.List<? extends ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillJobOrBuilder> 
         getJobsOrBuilderList() {
      if (jobsBuilder_ != null) {
        return jobsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(jobs_);
      }
    }
    /**
     * <code>repeated .chalk.aggregate.v1.AggregateBackfillJob jobs = 1 [json_name = "jobs"];</code>
     */
    public ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillJob.Builder addJobsBuilder() {
      return getJobsFieldBuilder().addBuilder(
          ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillJob.getDefaultInstance());
    }
    /**
     * <code>repeated .chalk.aggregate.v1.AggregateBackfillJob jobs = 1 [json_name = "jobs"];</code>
     */
    public ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillJob.Builder addJobsBuilder(
        int index) {
      return getJobsFieldBuilder().addBuilder(
          index, ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillJob.getDefaultInstance());
    }
    /**
     * <code>repeated .chalk.aggregate.v1.AggregateBackfillJob jobs = 1 [json_name = "jobs"];</code>
     */
    public java.util.List<ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillJob.Builder> 
         getJobsBuilderList() {
      return getJobsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillJob, ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillJob.Builder, ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillJobOrBuilder> 
        getJobsFieldBuilder() {
      if (jobsBuilder_ == null) {
        jobsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillJob, ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillJob.Builder, ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillJobOrBuilder>(
                jobs_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        jobs_ = null;
      }
      return jobsBuilder_;
    }

    private java.lang.Object cursor_ = "";
    /**
     * <code>string cursor = 2 [json_name = "cursor"];</code>
     * @return The cursor.
     */
    public java.lang.String getCursor() {
      java.lang.Object ref = cursor_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cursor_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string cursor = 2 [json_name = "cursor"];</code>
     * @return The bytes for cursor.
     */
    public com.google.protobuf.ByteString
        getCursorBytes() {
      java.lang.Object ref = cursor_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cursor_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string cursor = 2 [json_name = "cursor"];</code>
     * @param value The cursor to set.
     * @return This builder for chaining.
     */
    public Builder setCursor(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      cursor_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string cursor = 2 [json_name = "cursor"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCursor() {
      cursor_ = getDefaultInstance().getCursor();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string cursor = 2 [json_name = "cursor"];</code>
     * @param value The bytes for cursor to set.
     * @return This builder for chaining.
     */
    public Builder setCursorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      cursor_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:chalk.aggregate.v1.GetAggregateBackfillJobsResponse)
  }

  // @@protoc_insertion_point(class_scope:chalk.aggregate.v1.GetAggregateBackfillJobsResponse)
  private static final ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsResponse();
  }

  public static ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetAggregateBackfillJobsResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetAggregateBackfillJobsResponse>() {
    @java.lang.Override
    public GetAggregateBackfillJobsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetAggregateBackfillJobsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetAggregateBackfillJobsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

