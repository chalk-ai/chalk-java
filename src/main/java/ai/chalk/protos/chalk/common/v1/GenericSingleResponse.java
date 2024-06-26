// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/common/v1/online_query.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.common.v1;

/**
 * Protobuf type {@code chalk.common.v1.GenericSingleResponse}
 */
public final class GenericSingleResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chalk.common.v1.GenericSingleResponse)
    GenericSingleResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GenericSingleResponse.newBuilder() to construct.
  private GenericSingleResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GenericSingleResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GenericSingleResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.common.v1.OnlineQueryProto.internal_static_chalk_common_v1_GenericSingleResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.chalk.protos.chalk.common.v1.OnlineQueryProto.internal_static_chalk_common_v1_GenericSingleResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.chalk.protos.chalk.common.v1.GenericSingleResponse.class, ai.chalk.protos.chalk.common.v1.GenericSingleResponse.Builder.class);
  }

  private int queryCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object query_;
  public enum QueryCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    SINGLE_RESPONSE(1),
    BULK_RESPONSE(2),
    QUERY_NOT_SET(0);
    private final int value;
    private QueryCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static QueryCase valueOf(int value) {
      return forNumber(value);
    }

    public static QueryCase forNumber(int value) {
      switch (value) {
        case 1: return SINGLE_RESPONSE;
        case 2: return BULK_RESPONSE;
        case 0: return QUERY_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public QueryCase
  getQueryCase() {
    return QueryCase.forNumber(
        queryCase_);
  }

  public static final int SINGLE_RESPONSE_FIELD_NUMBER = 1;
  /**
   * <code>.chalk.common.v1.OnlineQueryResponse single_response = 1 [json_name = "singleResponse"];</code>
   * @return Whether the singleResponse field is set.
   */
  @java.lang.Override
  public boolean hasSingleResponse() {
    return queryCase_ == 1;
  }
  /**
   * <code>.chalk.common.v1.OnlineQueryResponse single_response = 1 [json_name = "singleResponse"];</code>
   * @return The singleResponse.
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.common.v1.OnlineQueryResponse getSingleResponse() {
    if (queryCase_ == 1) {
       return (ai.chalk.protos.chalk.common.v1.OnlineQueryResponse) query_;
    }
    return ai.chalk.protos.chalk.common.v1.OnlineQueryResponse.getDefaultInstance();
  }
  /**
   * <code>.chalk.common.v1.OnlineQueryResponse single_response = 1 [json_name = "singleResponse"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.common.v1.OnlineQueryResponseOrBuilder getSingleResponseOrBuilder() {
    if (queryCase_ == 1) {
       return (ai.chalk.protos.chalk.common.v1.OnlineQueryResponse) query_;
    }
    return ai.chalk.protos.chalk.common.v1.OnlineQueryResponse.getDefaultInstance();
  }

  public static final int BULK_RESPONSE_FIELD_NUMBER = 2;
  /**
   * <code>.chalk.common.v1.OnlineQueryBulkResponse bulk_response = 2 [json_name = "bulkResponse"];</code>
   * @return Whether the bulkResponse field is set.
   */
  @java.lang.Override
  public boolean hasBulkResponse() {
    return queryCase_ == 2;
  }
  /**
   * <code>.chalk.common.v1.OnlineQueryBulkResponse bulk_response = 2 [json_name = "bulkResponse"];</code>
   * @return The bulkResponse.
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.common.v1.OnlineQueryBulkResponse getBulkResponse() {
    if (queryCase_ == 2) {
       return (ai.chalk.protos.chalk.common.v1.OnlineQueryBulkResponse) query_;
    }
    return ai.chalk.protos.chalk.common.v1.OnlineQueryBulkResponse.getDefaultInstance();
  }
  /**
   * <code>.chalk.common.v1.OnlineQueryBulkResponse bulk_response = 2 [json_name = "bulkResponse"];</code>
   */
  @java.lang.Override
  public ai.chalk.protos.chalk.common.v1.OnlineQueryBulkResponseOrBuilder getBulkResponseOrBuilder() {
    if (queryCase_ == 2) {
       return (ai.chalk.protos.chalk.common.v1.OnlineQueryBulkResponse) query_;
    }
    return ai.chalk.protos.chalk.common.v1.OnlineQueryBulkResponse.getDefaultInstance();
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
    if (queryCase_ == 1) {
      output.writeMessage(1, (ai.chalk.protos.chalk.common.v1.OnlineQueryResponse) query_);
    }
    if (queryCase_ == 2) {
      output.writeMessage(2, (ai.chalk.protos.chalk.common.v1.OnlineQueryBulkResponse) query_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (queryCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (ai.chalk.protos.chalk.common.v1.OnlineQueryResponse) query_);
    }
    if (queryCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (ai.chalk.protos.chalk.common.v1.OnlineQueryBulkResponse) query_);
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
    if (!(obj instanceof ai.chalk.protos.chalk.common.v1.GenericSingleResponse)) {
      return super.equals(obj);
    }
    ai.chalk.protos.chalk.common.v1.GenericSingleResponse other = (ai.chalk.protos.chalk.common.v1.GenericSingleResponse) obj;

    if (!getQueryCase().equals(other.getQueryCase())) return false;
    switch (queryCase_) {
      case 1:
        if (!getSingleResponse()
            .equals(other.getSingleResponse())) return false;
        break;
      case 2:
        if (!getBulkResponse()
            .equals(other.getBulkResponse())) return false;
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
    switch (queryCase_) {
      case 1:
        hash = (37 * hash) + SINGLE_RESPONSE_FIELD_NUMBER;
        hash = (53 * hash) + getSingleResponse().hashCode();
        break;
      case 2:
        hash = (37 * hash) + BULK_RESPONSE_FIELD_NUMBER;
        hash = (53 * hash) + getBulkResponse().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.chalk.protos.chalk.common.v1.GenericSingleResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.common.v1.GenericSingleResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.common.v1.GenericSingleResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.common.v1.GenericSingleResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.common.v1.GenericSingleResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.chalk.protos.chalk.common.v1.GenericSingleResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.common.v1.GenericSingleResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.common.v1.GenericSingleResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.chalk.protos.chalk.common.v1.GenericSingleResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.chalk.protos.chalk.common.v1.GenericSingleResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.chalk.protos.chalk.common.v1.GenericSingleResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.chalk.protos.chalk.common.v1.GenericSingleResponse parseFrom(
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
  public static Builder newBuilder(ai.chalk.protos.chalk.common.v1.GenericSingleResponse prototype) {
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
   * Protobuf type {@code chalk.common.v1.GenericSingleResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chalk.common.v1.GenericSingleResponse)
      ai.chalk.protos.chalk.common.v1.GenericSingleResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.chalk.protos.chalk.common.v1.OnlineQueryProto.internal_static_chalk_common_v1_GenericSingleResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.chalk.protos.chalk.common.v1.OnlineQueryProto.internal_static_chalk_common_v1_GenericSingleResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.chalk.protos.chalk.common.v1.GenericSingleResponse.class, ai.chalk.protos.chalk.common.v1.GenericSingleResponse.Builder.class);
    }

    // Construct using ai.chalk.protos.chalk.common.v1.GenericSingleResponse.newBuilder()
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
      if (singleResponseBuilder_ != null) {
        singleResponseBuilder_.clear();
      }
      if (bulkResponseBuilder_ != null) {
        bulkResponseBuilder_.clear();
      }
      queryCase_ = 0;
      query_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.chalk.protos.chalk.common.v1.OnlineQueryProto.internal_static_chalk_common_v1_GenericSingleResponse_descriptor;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.common.v1.GenericSingleResponse getDefaultInstanceForType() {
      return ai.chalk.protos.chalk.common.v1.GenericSingleResponse.getDefaultInstance();
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.common.v1.GenericSingleResponse build() {
      ai.chalk.protos.chalk.common.v1.GenericSingleResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.chalk.protos.chalk.common.v1.GenericSingleResponse buildPartial() {
      ai.chalk.protos.chalk.common.v1.GenericSingleResponse result = new ai.chalk.protos.chalk.common.v1.GenericSingleResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.chalk.protos.chalk.common.v1.GenericSingleResponse result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(ai.chalk.protos.chalk.common.v1.GenericSingleResponse result) {
      result.queryCase_ = queryCase_;
      result.query_ = this.query_;
      if (queryCase_ == 1 &&
          singleResponseBuilder_ != null) {
        result.query_ = singleResponseBuilder_.build();
      }
      if (queryCase_ == 2 &&
          bulkResponseBuilder_ != null) {
        result.query_ = bulkResponseBuilder_.build();
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
      if (other instanceof ai.chalk.protos.chalk.common.v1.GenericSingleResponse) {
        return mergeFrom((ai.chalk.protos.chalk.common.v1.GenericSingleResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.chalk.protos.chalk.common.v1.GenericSingleResponse other) {
      if (other == ai.chalk.protos.chalk.common.v1.GenericSingleResponse.getDefaultInstance()) return this;
      switch (other.getQueryCase()) {
        case SINGLE_RESPONSE: {
          mergeSingleResponse(other.getSingleResponse());
          break;
        }
        case BULK_RESPONSE: {
          mergeBulkResponse(other.getBulkResponse());
          break;
        }
        case QUERY_NOT_SET: {
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
                  getSingleResponseFieldBuilder().getBuilder(),
                  extensionRegistry);
              queryCase_ = 1;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getBulkResponseFieldBuilder().getBuilder(),
                  extensionRegistry);
              queryCase_ = 2;
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
    private int queryCase_ = 0;
    private java.lang.Object query_;
    public QueryCase
        getQueryCase() {
      return QueryCase.forNumber(
          queryCase_);
    }

    public Builder clearQuery() {
      queryCase_ = 0;
      query_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.common.v1.OnlineQueryResponse, ai.chalk.protos.chalk.common.v1.OnlineQueryResponse.Builder, ai.chalk.protos.chalk.common.v1.OnlineQueryResponseOrBuilder> singleResponseBuilder_;
    /**
     * <code>.chalk.common.v1.OnlineQueryResponse single_response = 1 [json_name = "singleResponse"];</code>
     * @return Whether the singleResponse field is set.
     */
    @java.lang.Override
    public boolean hasSingleResponse() {
      return queryCase_ == 1;
    }
    /**
     * <code>.chalk.common.v1.OnlineQueryResponse single_response = 1 [json_name = "singleResponse"];</code>
     * @return The singleResponse.
     */
    @java.lang.Override
    public ai.chalk.protos.chalk.common.v1.OnlineQueryResponse getSingleResponse() {
      if (singleResponseBuilder_ == null) {
        if (queryCase_ == 1) {
          return (ai.chalk.protos.chalk.common.v1.OnlineQueryResponse) query_;
        }
        return ai.chalk.protos.chalk.common.v1.OnlineQueryResponse.getDefaultInstance();
      } else {
        if (queryCase_ == 1) {
          return singleResponseBuilder_.getMessage();
        }
        return ai.chalk.protos.chalk.common.v1.OnlineQueryResponse.getDefaultInstance();
      }
    }
    /**
     * <code>.chalk.common.v1.OnlineQueryResponse single_response = 1 [json_name = "singleResponse"];</code>
     */
    public Builder setSingleResponse(ai.chalk.protos.chalk.common.v1.OnlineQueryResponse value) {
      if (singleResponseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        query_ = value;
        onChanged();
      } else {
        singleResponseBuilder_.setMessage(value);
      }
      queryCase_ = 1;
      return this;
    }
    /**
     * <code>.chalk.common.v1.OnlineQueryResponse single_response = 1 [json_name = "singleResponse"];</code>
     */
    public Builder setSingleResponse(
        ai.chalk.protos.chalk.common.v1.OnlineQueryResponse.Builder builderForValue) {
      if (singleResponseBuilder_ == null) {
        query_ = builderForValue.build();
        onChanged();
      } else {
        singleResponseBuilder_.setMessage(builderForValue.build());
      }
      queryCase_ = 1;
      return this;
    }
    /**
     * <code>.chalk.common.v1.OnlineQueryResponse single_response = 1 [json_name = "singleResponse"];</code>
     */
    public Builder mergeSingleResponse(ai.chalk.protos.chalk.common.v1.OnlineQueryResponse value) {
      if (singleResponseBuilder_ == null) {
        if (queryCase_ == 1 &&
            query_ != ai.chalk.protos.chalk.common.v1.OnlineQueryResponse.getDefaultInstance()) {
          query_ = ai.chalk.protos.chalk.common.v1.OnlineQueryResponse.newBuilder((ai.chalk.protos.chalk.common.v1.OnlineQueryResponse) query_)
              .mergeFrom(value).buildPartial();
        } else {
          query_ = value;
        }
        onChanged();
      } else {
        if (queryCase_ == 1) {
          singleResponseBuilder_.mergeFrom(value);
        } else {
          singleResponseBuilder_.setMessage(value);
        }
      }
      queryCase_ = 1;
      return this;
    }
    /**
     * <code>.chalk.common.v1.OnlineQueryResponse single_response = 1 [json_name = "singleResponse"];</code>
     */
    public Builder clearSingleResponse() {
      if (singleResponseBuilder_ == null) {
        if (queryCase_ == 1) {
          queryCase_ = 0;
          query_ = null;
          onChanged();
        }
      } else {
        if (queryCase_ == 1) {
          queryCase_ = 0;
          query_ = null;
        }
        singleResponseBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.chalk.common.v1.OnlineQueryResponse single_response = 1 [json_name = "singleResponse"];</code>
     */
    public ai.chalk.protos.chalk.common.v1.OnlineQueryResponse.Builder getSingleResponseBuilder() {
      return getSingleResponseFieldBuilder().getBuilder();
    }
    /**
     * <code>.chalk.common.v1.OnlineQueryResponse single_response = 1 [json_name = "singleResponse"];</code>
     */
    @java.lang.Override
    public ai.chalk.protos.chalk.common.v1.OnlineQueryResponseOrBuilder getSingleResponseOrBuilder() {
      if ((queryCase_ == 1) && (singleResponseBuilder_ != null)) {
        return singleResponseBuilder_.getMessageOrBuilder();
      } else {
        if (queryCase_ == 1) {
          return (ai.chalk.protos.chalk.common.v1.OnlineQueryResponse) query_;
        }
        return ai.chalk.protos.chalk.common.v1.OnlineQueryResponse.getDefaultInstance();
      }
    }
    /**
     * <code>.chalk.common.v1.OnlineQueryResponse single_response = 1 [json_name = "singleResponse"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.common.v1.OnlineQueryResponse, ai.chalk.protos.chalk.common.v1.OnlineQueryResponse.Builder, ai.chalk.protos.chalk.common.v1.OnlineQueryResponseOrBuilder> 
        getSingleResponseFieldBuilder() {
      if (singleResponseBuilder_ == null) {
        if (!(queryCase_ == 1)) {
          query_ = ai.chalk.protos.chalk.common.v1.OnlineQueryResponse.getDefaultInstance();
        }
        singleResponseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ai.chalk.protos.chalk.common.v1.OnlineQueryResponse, ai.chalk.protos.chalk.common.v1.OnlineQueryResponse.Builder, ai.chalk.protos.chalk.common.v1.OnlineQueryResponseOrBuilder>(
                (ai.chalk.protos.chalk.common.v1.OnlineQueryResponse) query_,
                getParentForChildren(),
                isClean());
        query_ = null;
      }
      queryCase_ = 1;
      onChanged();
      return singleResponseBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.common.v1.OnlineQueryBulkResponse, ai.chalk.protos.chalk.common.v1.OnlineQueryBulkResponse.Builder, ai.chalk.protos.chalk.common.v1.OnlineQueryBulkResponseOrBuilder> bulkResponseBuilder_;
    /**
     * <code>.chalk.common.v1.OnlineQueryBulkResponse bulk_response = 2 [json_name = "bulkResponse"];</code>
     * @return Whether the bulkResponse field is set.
     */
    @java.lang.Override
    public boolean hasBulkResponse() {
      return queryCase_ == 2;
    }
    /**
     * <code>.chalk.common.v1.OnlineQueryBulkResponse bulk_response = 2 [json_name = "bulkResponse"];</code>
     * @return The bulkResponse.
     */
    @java.lang.Override
    public ai.chalk.protos.chalk.common.v1.OnlineQueryBulkResponse getBulkResponse() {
      if (bulkResponseBuilder_ == null) {
        if (queryCase_ == 2) {
          return (ai.chalk.protos.chalk.common.v1.OnlineQueryBulkResponse) query_;
        }
        return ai.chalk.protos.chalk.common.v1.OnlineQueryBulkResponse.getDefaultInstance();
      } else {
        if (queryCase_ == 2) {
          return bulkResponseBuilder_.getMessage();
        }
        return ai.chalk.protos.chalk.common.v1.OnlineQueryBulkResponse.getDefaultInstance();
      }
    }
    /**
     * <code>.chalk.common.v1.OnlineQueryBulkResponse bulk_response = 2 [json_name = "bulkResponse"];</code>
     */
    public Builder setBulkResponse(ai.chalk.protos.chalk.common.v1.OnlineQueryBulkResponse value) {
      if (bulkResponseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        query_ = value;
        onChanged();
      } else {
        bulkResponseBuilder_.setMessage(value);
      }
      queryCase_ = 2;
      return this;
    }
    /**
     * <code>.chalk.common.v1.OnlineQueryBulkResponse bulk_response = 2 [json_name = "bulkResponse"];</code>
     */
    public Builder setBulkResponse(
        ai.chalk.protos.chalk.common.v1.OnlineQueryBulkResponse.Builder builderForValue) {
      if (bulkResponseBuilder_ == null) {
        query_ = builderForValue.build();
        onChanged();
      } else {
        bulkResponseBuilder_.setMessage(builderForValue.build());
      }
      queryCase_ = 2;
      return this;
    }
    /**
     * <code>.chalk.common.v1.OnlineQueryBulkResponse bulk_response = 2 [json_name = "bulkResponse"];</code>
     */
    public Builder mergeBulkResponse(ai.chalk.protos.chalk.common.v1.OnlineQueryBulkResponse value) {
      if (bulkResponseBuilder_ == null) {
        if (queryCase_ == 2 &&
            query_ != ai.chalk.protos.chalk.common.v1.OnlineQueryBulkResponse.getDefaultInstance()) {
          query_ = ai.chalk.protos.chalk.common.v1.OnlineQueryBulkResponse.newBuilder((ai.chalk.protos.chalk.common.v1.OnlineQueryBulkResponse) query_)
              .mergeFrom(value).buildPartial();
        } else {
          query_ = value;
        }
        onChanged();
      } else {
        if (queryCase_ == 2) {
          bulkResponseBuilder_.mergeFrom(value);
        } else {
          bulkResponseBuilder_.setMessage(value);
        }
      }
      queryCase_ = 2;
      return this;
    }
    /**
     * <code>.chalk.common.v1.OnlineQueryBulkResponse bulk_response = 2 [json_name = "bulkResponse"];</code>
     */
    public Builder clearBulkResponse() {
      if (bulkResponseBuilder_ == null) {
        if (queryCase_ == 2) {
          queryCase_ = 0;
          query_ = null;
          onChanged();
        }
      } else {
        if (queryCase_ == 2) {
          queryCase_ = 0;
          query_ = null;
        }
        bulkResponseBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.chalk.common.v1.OnlineQueryBulkResponse bulk_response = 2 [json_name = "bulkResponse"];</code>
     */
    public ai.chalk.protos.chalk.common.v1.OnlineQueryBulkResponse.Builder getBulkResponseBuilder() {
      return getBulkResponseFieldBuilder().getBuilder();
    }
    /**
     * <code>.chalk.common.v1.OnlineQueryBulkResponse bulk_response = 2 [json_name = "bulkResponse"];</code>
     */
    @java.lang.Override
    public ai.chalk.protos.chalk.common.v1.OnlineQueryBulkResponseOrBuilder getBulkResponseOrBuilder() {
      if ((queryCase_ == 2) && (bulkResponseBuilder_ != null)) {
        return bulkResponseBuilder_.getMessageOrBuilder();
      } else {
        if (queryCase_ == 2) {
          return (ai.chalk.protos.chalk.common.v1.OnlineQueryBulkResponse) query_;
        }
        return ai.chalk.protos.chalk.common.v1.OnlineQueryBulkResponse.getDefaultInstance();
      }
    }
    /**
     * <code>.chalk.common.v1.OnlineQueryBulkResponse bulk_response = 2 [json_name = "bulkResponse"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.chalk.protos.chalk.common.v1.OnlineQueryBulkResponse, ai.chalk.protos.chalk.common.v1.OnlineQueryBulkResponse.Builder, ai.chalk.protos.chalk.common.v1.OnlineQueryBulkResponseOrBuilder> 
        getBulkResponseFieldBuilder() {
      if (bulkResponseBuilder_ == null) {
        if (!(queryCase_ == 2)) {
          query_ = ai.chalk.protos.chalk.common.v1.OnlineQueryBulkResponse.getDefaultInstance();
        }
        bulkResponseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ai.chalk.protos.chalk.common.v1.OnlineQueryBulkResponse, ai.chalk.protos.chalk.common.v1.OnlineQueryBulkResponse.Builder, ai.chalk.protos.chalk.common.v1.OnlineQueryBulkResponseOrBuilder>(
                (ai.chalk.protos.chalk.common.v1.OnlineQueryBulkResponse) query_,
                getParentForChildren(),
                isClean());
        query_ = null;
      }
      queryCase_ = 2;
      onChanged();
      return bulkResponseBuilder_;
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


    // @@protoc_insertion_point(builder_scope:chalk.common.v1.GenericSingleResponse)
  }

  // @@protoc_insertion_point(class_scope:chalk.common.v1.GenericSingleResponse)
  private static final ai.chalk.protos.chalk.common.v1.GenericSingleResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.chalk.protos.chalk.common.v1.GenericSingleResponse();
  }

  public static ai.chalk.protos.chalk.common.v1.GenericSingleResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenericSingleResponse>
      PARSER = new com.google.protobuf.AbstractParser<GenericSingleResponse>() {
    @java.lang.Override
    public GenericSingleResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GenericSingleResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenericSingleResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.chalk.protos.chalk.common.v1.GenericSingleResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

