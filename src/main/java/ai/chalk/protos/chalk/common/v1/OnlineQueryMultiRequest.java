// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/common/v1/online_query.proto

// Protobuf Java Version: 3.25.3
package ai.chalk.protos.chalk.common.v1;

/**
 * Protobuf type {@code chalk.common.v1.OnlineQueryMultiRequest}
 */
public final class OnlineQueryMultiRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chalk.common.v1.OnlineQueryMultiRequest)
    OnlineQueryMultiRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OnlineQueryMultiRequest.newBuilder() to construct.
  private OnlineQueryMultiRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OnlineQueryMultiRequest() {
    queries_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OnlineQueryMultiRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.common.v1.OnlineQueryProto.internal_static_chalk_common_v1_OnlineQueryMultiRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.common.v1.OnlineQueryProto.internal_static_chalk_common_v1_OnlineQueryMultiRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.common.v1.OnlineQueryMultiRequest.class, ai.chalk.protos.chalk.common.v1.OnlineQueryMultiRequest.Builder.class);
  }

  public static final int QUERIES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<ai.chalk.protos.chalk.common.v1.GenericSingleQuery> queries_;
  /**
   * <code>repeated .chalk.common.v1.GenericSingleQuery queries = 1 [json_name = "queries"];</code>
   */
  @java.lang.Override
  public java.util.List<ai.chalk.protos.chalk.common.v1.GenericSingleQuery> getQueriesList() {
    return queries_;
  }
  /**
   * <code>repeated .chalk.common.v1.GenericSingleQuery queries = 1 [json_name = "queries"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends ai.chalk.protos.chalk.common.v1.GenericSingleQueryOrBuilder> 
      getQueriesOrBuilderList() {
    return queries_;
  }
  /**
   * <code>repeated .chalk.common.v1.GenericSingleQuery queries = 1 [json_name = "queries"];</code>
   */
  @java.lang.Override
  public int getQueriesCount() {
    return queries_.size();
  }
  /**
   * <code>repeated .chalk.common.v1.GenericSingleQuery queries = 1 [json_name = "queries"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.common.v1.GenericSingleQuery getQueries(int index) {
    return queries_.get(index);
  }
  /**
   * <code>repeated .chalk.common.v1.GenericSingleQuery queries = 1 [json_name = "queries"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.common.v1.GenericSingleQueryOrBuilder getQueriesOrBuilder(
      int index) {
    return queries_.get(index);
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
    for (int i = 0; i < queries_.size(); i++) {
      output.writeMessage(1, queries_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < queries_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, queries_.get(i));
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
    if (!(obj instanceof ai.chalk.protos.chalk.common.v1.OnlineQueryMultiRequest)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.common.v1.OnlineQueryMultiRequest other = (ai.chalk.protos.chalk.common.v1.OnlineQueryMultiRequest) obj;

    if (!getQueriesList()
        .equals(other.getQueriesList())) return false;
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
    if (getQueriesCount() > 0) {
      hash = (37 * hash) + QUERIES_FIELD_NUMBER;
      hash = (53 * hash) + getQueriesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.common.v1.OnlineQueryMultiRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.common.v1.OnlineQueryMultiRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.common.v1.OnlineQueryMultiRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.common.v1.OnlineQueryMultiRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.common.v1.OnlineQueryMultiRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.common.v1.OnlineQueryMultiRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.common.v1.OnlineQueryMultiRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.common.v1.OnlineQueryMultiRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.common.v1.OnlineQueryMultiRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.common.v1.OnlineQueryMultiRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.common.v1.OnlineQueryMultiRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.common.v1.OnlineQueryMultiRequest parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.common.v1.OnlineQueryMultiRequest prototype) {
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
   * Protobuf type {@code chalk.common.v1.OnlineQueryMultiRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.common.v1.OnlineQueryMultiRequest)
      ai.chalk.protos.chalk.common.v1.OnlineQueryMultiRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.common.v1.OnlineQueryProto.internal_static_chalk_common_v1_OnlineQueryMultiRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.common.v1.OnlineQueryProto.internal_static_chalk_common_v1_OnlineQueryMultiRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.common.v1.OnlineQueryMultiRequest.class, ai.chalk.protos.chalk.common.v1.OnlineQueryMultiRequest.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.common.v1.OnlineQueryMultiRequest.newBuilder()
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
      if (queriesBuilder_ == null) {
        queries_ = java.util.Collections.emptyList();
      } else {
        queries_ = null;
        queriesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.common.v1.OnlineQueryProto.internal_static_chalk_common_v1_OnlineQueryMultiRequest_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.common.v1.OnlineQueryMultiRequest getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.common.v1.OnlineQueryMultiRequest.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.common.v1.OnlineQueryMultiRequest build() {
      ai.chalk.protos.chalk.common.v1.OnlineQueryMultiRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.common.v1.OnlineQueryMultiRequest buildPartial() {
      ai.chalk.protos.chalk.common.v1.OnlineQueryMultiRequest result = new ai.chalk.protos.chalk.common.v1.OnlineQueryMultiRequest(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(ai.chalk.protos.chalk.common.v1.OnlineQueryMultiRequest result) {
      if (queriesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          queries_ = java.util.Collections.unmodifiableList(queries_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.queries_ = queries_;
      } else {
        result.queries_ = queriesBuilder_.build();
      }
    }

    private void buildPartial0(ai.chalk.protos.chalk.common.v1.OnlineQueryMultiRequest result) {
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
      if (other instanceof ai.chalk.protos.chalk.common.v1.OnlineQueryMultiRequest) {
        return mergeFrom((ai.chalk.protos.chalk.common.v1.OnlineQueryMultiRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.common.v1.OnlineQueryMultiRequest other) {
      if (other == ai.chalk.protos.chalk.common.v1.OnlineQueryMultiRequest.getDefaultInstance()) return this;
      if (queriesBuilder_ == null) {
        if (!other.queries_.isEmpty()) {
          if (queries_.isEmpty()) {
            queries_ = other.queries_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureQueriesIsMutable();
            queries_.addAll(other.queries_);
          }
          onChanged();
        }
      } else {
        if (!other.queries_.isEmpty()) {
          if (queriesBuilder_.isEmpty()) {
            queriesBuilder_.dispose();
            queriesBuilder_ = null;
            queries_ = other.queries_;
            bitField0_ = (bitField0_ & ~0x00000001);
            queriesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getQueriesFieldBuilder() : null;
          } else {
            queriesBuilder_.addAllMessages(other.queries_);
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
              ai.chalk.protos.chalk.common.v1.GenericSingleQuery m =
                  input.readMessage(
                      ai.chalk.protos.chalk.common.v1.GenericSingleQuery.parser(),
                      extensionRegistry);
              if (queriesBuilder_ == null) {
                ensureQueriesIsMutable();
                queries_.add(m);
              } else {
                queriesBuilder_.addMessage(m);
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

    private java.util.List<ai.chalk.protos.chalk.common.v1.GenericSingleQuery> queries_ =
      java.util.Collections.emptyList();
    private void ensureQueriesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        queries_ = new java.util.ArrayList<ai.chalk.protos.chalk.common.v1.GenericSingleQuery>(queries_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        ai.chalk.protos.chalk.common.v1.GenericSingleQuery, ai.chalk.protos.chalk.common.v1.GenericSingleQuery.Builder, ai.chalk.protos.chalk.common.v1.GenericSingleQueryOrBuilder> queriesBuilder_;

    /**
     * <code>repeated .chalk.common.v1.GenericSingleQuery queries = 1 [json_name = "queries"];</code>
     */
    public java.util.List<ai.chalk.protos.chalk.common.v1.GenericSingleQuery> getQueriesList() {
      if (queriesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(queries_);
      } else {
        return queriesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .chalk.common.v1.GenericSingleQuery queries = 1 [json_name = "queries"];</code>
     */
    public int getQueriesCount() {
      if (queriesBuilder_ == null) {
        return queries_.size();
      } else {
        return queriesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .chalk.common.v1.GenericSingleQuery queries = 1 [json_name = "queries"];</code>
     */
    public ai.chalk.protos.chalk.common.v1.GenericSingleQuery getQueries(int index) {
      if (queriesBuilder_ == null) {
        return queries_.get(index);
      } else {
        return queriesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .chalk.common.v1.GenericSingleQuery queries = 1 [json_name = "queries"];</code>
     */
    public Builder setQueries(
        int index, ai.chalk.protos.chalk.common.v1.GenericSingleQuery value) {
      if (queriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureQueriesIsMutable();
        queries_.set(index, value);
        onChanged();
      } else {
        queriesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .chalk.common.v1.GenericSingleQuery queries = 1 [json_name = "queries"];</code>
     */
    public Builder setQueries(
        int index, ai.chalk.protos.chalk.common.v1.GenericSingleQuery.Builder builderForValue) {
      if (queriesBuilder_ == null) {
        ensureQueriesIsMutable();
        queries_.set(index, builderForValue.build());
        onChanged();
      } else {
        queriesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .chalk.common.v1.GenericSingleQuery queries = 1 [json_name = "queries"];</code>
     */
    public Builder addQueries(ai.chalk.protos.chalk.common.v1.GenericSingleQuery value) {
      if (queriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureQueriesIsMutable();
        queries_.add(value);
        onChanged();
      } else {
        queriesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .chalk.common.v1.GenericSingleQuery queries = 1 [json_name = "queries"];</code>
     */
    public Builder addQueries(
        int index, ai.chalk.protos.chalk.common.v1.GenericSingleQuery value) {
      if (queriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureQueriesIsMutable();
        queries_.add(index, value);
        onChanged();
      } else {
        queriesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .chalk.common.v1.GenericSingleQuery queries = 1 [json_name = "queries"];</code>
     */
    public Builder addQueries(
        ai.chalk.protos.chalk.common.v1.GenericSingleQuery.Builder builderForValue) {
      if (queriesBuilder_ == null) {
        ensureQueriesIsMutable();
        queries_.add(builderForValue.build());
        onChanged();
      } else {
        queriesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .chalk.common.v1.GenericSingleQuery queries = 1 [json_name = "queries"];</code>
     */
    public Builder addQueries(
        int index, ai.chalk.protos.chalk.common.v1.GenericSingleQuery.Builder builderForValue) {
      if (queriesBuilder_ == null) {
        ensureQueriesIsMutable();
        queries_.add(index, builderForValue.build());
        onChanged();
      } else {
        queriesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .chalk.common.v1.GenericSingleQuery queries = 1 [json_name = "queries"];</code>
     */
    public Builder addAllQueries(
        java.lang.Iterable<? extends ai.chalk.protos.chalk.common.v1.GenericSingleQuery> values) {
      if (queriesBuilder_ == null) {
        ensureQueriesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, queries_);
        onChanged();
      } else {
        queriesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .chalk.common.v1.GenericSingleQuery queries = 1 [json_name = "queries"];</code>
     */
    public Builder clearQueries() {
      if (queriesBuilder_ == null) {
        queries_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        queriesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .chalk.common.v1.GenericSingleQuery queries = 1 [json_name = "queries"];</code>
     */
    public Builder removeQueries(int index) {
      if (queriesBuilder_ == null) {
        ensureQueriesIsMutable();
        queries_.remove(index);
        onChanged();
      } else {
        queriesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .chalk.common.v1.GenericSingleQuery queries = 1 [json_name = "queries"];</code>
     */
    public ai.chalk.protos.chalk.common.v1.GenericSingleQuery.Builder getQueriesBuilder(
        int index) {
      return getQueriesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .chalk.common.v1.GenericSingleQuery queries = 1 [json_name = "queries"];</code>
     */
    public ai.chalk.protos.chalk.common.v1.GenericSingleQueryOrBuilder getQueriesOrBuilder(
        int index) {
      if (queriesBuilder_ == null) {
        return queries_.get(index);  } else {
        return queriesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .chalk.common.v1.GenericSingleQuery queries = 1 [json_name = "queries"];</code>
     */
    public java.util.List<? extends ai.chalk.protos.chalk.common.v1.GenericSingleQueryOrBuilder> 
         getQueriesOrBuilderList() {
      if (queriesBuilder_ != null) {
        return queriesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(queries_);
      }
    }
    /**
     * <code>repeated .chalk.common.v1.GenericSingleQuery queries = 1 [json_name = "queries"];</code>
     */
    public ai.chalk.protos.chalk.common.v1.GenericSingleQuery.Builder addQueriesBuilder() {
      return getQueriesFieldBuilder().addBuilder(
          ai.chalk.protos.chalk.common.v1.GenericSingleQuery.getDefaultInstance());
    }
    /**
     * <code>repeated .chalk.common.v1.GenericSingleQuery queries = 1 [json_name = "queries"];</code>
     */
    public ai.chalk.protos.chalk.common.v1.GenericSingleQuery.Builder addQueriesBuilder(
        int index) {
      return getQueriesFieldBuilder().addBuilder(
          index, ai.chalk.protos.chalk.common.v1.GenericSingleQuery.getDefaultInstance());
    }
    /**
     * <code>repeated .chalk.common.v1.GenericSingleQuery queries = 1 [json_name = "queries"];</code>
     */
    public java.util.List<ai.chalk.protos.chalk.common.v1.GenericSingleQuery.Builder> 
         getQueriesBuilderList() {
      return getQueriesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        ai.chalk.protos.chalk.common.v1.GenericSingleQuery, ai.chalk.protos.chalk.common.v1.GenericSingleQuery.Builder, ai.chalk.protos.chalk.common.v1.GenericSingleQueryOrBuilder> 
        getQueriesFieldBuilder() {
      if (queriesBuilder_ == null) {
        queriesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            ai.chalk.protos.chalk.common.v1.GenericSingleQuery, ai.chalk.protos.chalk.common.v1.GenericSingleQuery.Builder, ai.chalk.protos.chalk.common.v1.GenericSingleQueryOrBuilder>(
                queries_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        queries_ = null;
      }
      return queriesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:chalk.common.v1.OnlineQueryMultiRequest)
  }

  // @@protoc_insertion_point(class_scope:chalk.common.v1.OnlineQueryMultiRequest)
  private static final ai.chalk.protos.chalk.common.v1.OnlineQueryMultiRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.common.v1.OnlineQueryMultiRequest();
  }

  public static ai.chalk.protos.chalk.common.v1.OnlineQueryMultiRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OnlineQueryMultiRequest>
      PARSER = new com.google.protobuf.AbstractParser<OnlineQueryMultiRequest>() {
    @java.lang.Override
    public OnlineQueryMultiRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<OnlineQueryMultiRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OnlineQueryMultiRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.common.v1.OnlineQueryMultiRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

