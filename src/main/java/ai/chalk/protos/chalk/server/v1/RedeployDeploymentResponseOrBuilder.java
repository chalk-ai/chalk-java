// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/builder.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

public interface RedeployDeploymentResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.RedeployDeploymentResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * don't care about this
   * </pre>
   *
   * <code>string build_id = 1 [json_name = "buildId", deprecated = true];</code>
   * @deprecated chalk.server.v1.RedeployDeploymentResponse.build_id is deprecated.
   *     See chalk/server/v1/builder.proto;l=43
   * @return The buildId.
   */
  @java.lang.Deprecated java.lang.String getBuildId();
  /**
   * <pre>
   * don't care about this
   * </pre>
   *
   * <code>string build_id = 1 [json_name = "buildId", deprecated = true];</code>
   * @deprecated chalk.server.v1.RedeployDeploymentResponse.build_id is deprecated.
   *     See chalk/server/v1/builder.proto;l=43
   * @return The bytes for buildId.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getBuildIdBytes();

  /**
   * <code>string deployment_id = 2 [json_name = "deploymentId"];</code>
   * @return The deploymentId.
   */
  java.lang.String getDeploymentId();
  /**
   * <code>string deployment_id = 2 [json_name = "deploymentId"];</code>
   * @return The bytes for deploymentId.
   */
  com.google.protobuf.ByteString
      getDeploymentIdBytes();
}
