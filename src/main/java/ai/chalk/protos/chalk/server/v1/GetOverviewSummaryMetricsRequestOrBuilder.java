// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/metrics.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

public interface GetOverviewSummaryMetricsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.GetOverviewSummaryMetricsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string range_start = 1 [json_name = "rangeStart"];</code>
   * @return Whether the rangeStart field is set.
   */
  boolean hasRangeStart();
  /**
   * <code>optional string range_start = 1 [json_name = "rangeStart"];</code>
   * @return The rangeStart.
   */
  java.lang.String getRangeStart();
  /**
   * <code>optional string range_start = 1 [json_name = "rangeStart"];</code>
   * @return The bytes for rangeStart.
   */
  com.google.protobuf.ByteString
      getRangeStartBytes();

  /**
   * <code>optional string range_end = 2 [json_name = "rangeEnd"];</code>
   * @return Whether the rangeEnd field is set.
   */
  boolean hasRangeEnd();
  /**
   * <code>optional string range_end = 2 [json_name = "rangeEnd"];</code>
   * @return The rangeEnd.
   */
  java.lang.String getRangeEnd();
  /**
   * <code>optional string range_end = 2 [json_name = "rangeEnd"];</code>
   * @return The bytes for rangeEnd.
   */
  com.google.protobuf.ByteString
      getRangeEndBytes();
}
