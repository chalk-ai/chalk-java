// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/builder.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

public interface RedeployDeploymentRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.RedeployDeploymentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string existing_deployment_id = 1 [json_name = "existingDeploymentId"];</code>
   * @return The existingDeploymentId.
   */
  java.lang.String getExistingDeploymentId();
  /**
   * <code>string existing_deployment_id = 1 [json_name = "existingDeploymentId"];</code>
   * @return The bytes for existingDeploymentId.
   */
  com.google.protobuf.ByteString
      getExistingDeploymentIdBytes();

  /**
   * <code>bool enable_profiling = 2 [json_name = "enableProfiling"];</code>
   * @return The enableProfiling.
   */
  boolean getEnableProfiling();
}
