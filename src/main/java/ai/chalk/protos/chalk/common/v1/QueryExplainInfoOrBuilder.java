// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/common/v1/online_query.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.chalk.common.v1;

public interface QueryExplainInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.common.v1.QueryExplainInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Unstructured string representation of the plan
   * </pre>
   *
   * <code>optional string plan_string = 1 [json_name = "planString"];</code>
   * @return Whether the planString field is set.
   */
  boolean hasPlanString();
  /**
   * <pre>
   * Unstructured string representation of the plan
   * </pre>
   *
   * <code>optional string plan_string = 1 [json_name = "planString"];</code>
   * @return The planString.
   */
  java.lang.String getPlanString();
  /**
   * <pre>
   * Unstructured string representation of the plan
   * </pre>
   *
   * <code>optional string plan_string = 1 [json_name = "planString"];</code>
   * @return The bytes for planString.
   */
  com.google.protobuf.ByteString
      getPlanStringBytes();
}
