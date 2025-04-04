// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/deploy.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

public interface ListDeploymentsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.ListDeploymentsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string cursor = 1 [json_name = "cursor"];</code>
   * @return Whether the cursor field is set.
   */
  boolean hasCursor();
  /**
   * <code>optional string cursor = 1 [json_name = "cursor"];</code>
   * @return The cursor.
   */
  java.lang.String getCursor();
  /**
   * <code>optional string cursor = 1 [json_name = "cursor"];</code>
   * @return The bytes for cursor.
   */
  com.google.protobuf.ByteString
      getCursorBytes();

  /**
   * <code>optional int32 limit = 2 [json_name = "limit"];</code>
   * @return Whether the limit field is set.
   */
  boolean hasLimit();
  /**
   * <code>optional int32 limit = 2 [json_name = "limit"];</code>
   * @return The limit.
   */
  int getLimit();

  /**
   * <code>optional bool include_branch = 3 [json_name = "includeBranch"];</code>
   * @return Whether the includeBranch field is set.
   */
  boolean hasIncludeBranch();
  /**
   * <code>optional bool include_branch = 3 [json_name = "includeBranch"];</code>
   * @return The includeBranch.
   */
  boolean getIncludeBranch();

  /**
   * <code>optional string branch_name = 4 [json_name = "branchName"];</code>
   * @return Whether the branchName field is set.
   */
  boolean hasBranchName();
  /**
   * <code>optional string branch_name = 4 [json_name = "branchName"];</code>
   * @return The branchName.
   */
  java.lang.String getBranchName();
  /**
   * <code>optional string branch_name = 4 [json_name = "branchName"];</code>
   * @return The bytes for branchName.
   */
  com.google.protobuf.ByteString
      getBranchNameBytes();
}
