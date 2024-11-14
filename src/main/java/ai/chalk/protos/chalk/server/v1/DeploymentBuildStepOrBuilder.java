// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/builder.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

public interface DeploymentBuildStepOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.DeploymentBuildStep)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string display_name = 2 [json_name = "displayName"];</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <code>string display_name = 2 [json_name = "displayName"];</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <code>.chalk.server.v1.DeploymentBuildStatus status = 3 [json_name = "status"];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.chalk.server.v1.DeploymentBuildStatus status = 3 [json_name = "status"];</code>
   * @return The status.
   */
  ai.chalk.protos.chalk.server.v1.DeploymentBuildStatus getStatus();

  /**
   * <code>.google.protobuf.Timestamp start_time = 4 [json_name = "startTime"];</code>
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   * <code>.google.protobuf.Timestamp start_time = 4 [json_name = "startTime"];</code>
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   * <code>.google.protobuf.Timestamp start_time = 4 [json_name = "startTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp end_time = 5 [json_name = "endTime"];</code>
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   * <code>.google.protobuf.Timestamp end_time = 5 [json_name = "endTime"];</code>
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   * <code>.google.protobuf.Timestamp end_time = 5 [json_name = "endTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();
}