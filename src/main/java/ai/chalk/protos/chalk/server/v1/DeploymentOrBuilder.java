// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/deployment.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

public interface DeploymentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.Deployment)
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
   * <code>string environment_id = 2 [json_name = "environmentId"];</code>
   * @return The environmentId.
   */
  java.lang.String getEnvironmentId();
  /**
   * <code>string environment_id = 2 [json_name = "environmentId"];</code>
   * @return The bytes for environmentId.
   */
  com.google.protobuf.ByteString
      getEnvironmentIdBytes();

  /**
   * <code>.chalk.server.v1.DeploymentStatus status = 3 [json_name = "status"];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.chalk.server.v1.DeploymentStatus status = 3 [json_name = "status"];</code>
   * @return The status.
   */
  ai.chalk.protos.chalk.server.v1.DeploymentStatus getStatus();
}
