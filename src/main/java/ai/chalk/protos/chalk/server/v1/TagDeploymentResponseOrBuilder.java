// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/deploy.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

public interface TagDeploymentResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.TagDeploymentResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.chalk.server.v1.Deployment deployment = 1 [json_name = "deployment"];</code>
   * @return Whether the deployment field is set.
   */
  boolean hasDeployment();
  /**
   * <code>.chalk.server.v1.Deployment deployment = 1 [json_name = "deployment"];</code>
   * @return The deployment.
   */
  ai.chalk.protos.chalk.server.v1.Deployment getDeployment();
  /**
   * <code>.chalk.server.v1.Deployment deployment = 1 [json_name = "deployment"];</code>
   */
  ai.chalk.protos.chalk.server.v1.DeploymentOrBuilder getDeploymentOrBuilder();

  /**
   * <code>optional string untagged_deployment_id = 2 [json_name = "untaggedDeploymentId"];</code>
   * @return Whether the untaggedDeploymentId field is set.
   */
  boolean hasUntaggedDeploymentId();
  /**
   * <code>optional string untagged_deployment_id = 2 [json_name = "untaggedDeploymentId"];</code>
   * @return The untaggedDeploymentId.
   */
  java.lang.String getUntaggedDeploymentId();
  /**
   * <code>optional string untagged_deployment_id = 2 [json_name = "untaggedDeploymentId"];</code>
   * @return The bytes for untaggedDeploymentId.
   */
  com.google.protobuf.ByteString
      getUntaggedDeploymentIdBytes();
}
