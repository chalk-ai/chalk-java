// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/engine/v2/query_log.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.engine.v2;

public interface GetQueryLogEntriesPageTokenOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.engine.v2.GetQueryLogEntriesPageToken)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string operation_id_hwm = 1 [json_name = "operationIdHwm"];</code>
   * @return The operationIdHwm.
   */
  java.lang.String getOperationIdHwm();
  /**
   * <code>string operation_id_hwm = 1 [json_name = "operationIdHwm"];</code>
   * @return The bytes for operationIdHwm.
   */
  com.google.protobuf.ByteString
      getOperationIdHwmBytes();

  /**
   * <code>.google.protobuf.Timestamp query_timestamp_hwm = 2 [json_name = "queryTimestampHwm"];</code>
   * @return Whether the queryTimestampHwm field is set.
   */
  boolean hasQueryTimestampHwm();
  /**
   * <code>.google.protobuf.Timestamp query_timestamp_hwm = 2 [json_name = "queryTimestampHwm"];</code>
   * @return The queryTimestampHwm.
   */
  com.google.protobuf.Timestamp getQueryTimestampHwm();
  /**
   * <code>.google.protobuf.Timestamp query_timestamp_hwm = 2 [json_name = "queryTimestampHwm"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getQueryTimestampHwmOrBuilder();
}