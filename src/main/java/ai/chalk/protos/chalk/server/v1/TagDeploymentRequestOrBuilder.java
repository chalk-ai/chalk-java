// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/deploy.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

public interface TagDeploymentRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.TagDeploymentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string deployment_id = 1 [json_name = "deploymentId"];</code>
   * @return The deploymentId.
   */
  java.lang.String getDeploymentId();
  /**
   * <code>string deployment_id = 1 [json_name = "deploymentId"];</code>
   * @return The bytes for deploymentId.
   */
  com.google.protobuf.ByteString
      getDeploymentIdBytes();

  /**
   * <code>string tag = 2 [json_name = "tag"];</code>
   * @return The tag.
   */
  java.lang.String getTag();
  /**
   * <code>string tag = 2 [json_name = "tag"];</code>
   * @return The bytes for tag.
   */
  com.google.protobuf.ByteString
      getTagBytes();
}
