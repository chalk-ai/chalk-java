// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/aggregate/v1/service.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.aggregate.v1;

public interface GetAggregateBackfillJobsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.aggregate.v1.GetAggregateBackfillJobsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 limit = 1 [json_name = "limit"];</code>
   * @return The limit.
   */
  int getLimit();

  /**
   * <code>string cursor = 2 [json_name = "cursor"];</code>
   * @return The cursor.
   */
  java.lang.String getCursor();
  /**
   * <code>string cursor = 2 [json_name = "cursor"];</code>
   * @return The bytes for cursor.
   */
  com.google.protobuf.ByteString
      getCursorBytes();
}
