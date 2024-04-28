// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/graph.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.chalk.server.v1;

public interface UpdateGraphRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.UpdateGraphRequest)
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
   * <code>.chalk.graph.v1.Graph graph = 2 [json_name = "graph"];</code>
   * @return Whether the graph field is set.
   */
  boolean hasGraph();
  /**
   * <code>.chalk.graph.v1.Graph graph = 2 [json_name = "graph"];</code>
   * @return The graph.
   */
  ai.chalk.protos.chalk.graph.v1.Graph getGraph();
  /**
   * <code>.chalk.graph.v1.Graph graph = 2 [json_name = "graph"];</code>
   */
  ai.chalk.protos.chalk.graph.v1.GraphOrBuilder getGraphOrBuilder();

  /**
   * <code>string chalkpy_version = 3 [json_name = "chalkpyVersion"];</code>
   * @return The chalkpyVersion.
   */
  java.lang.String getChalkpyVersion();
  /**
   * <code>string chalkpy_version = 3 [json_name = "chalkpyVersion"];</code>
   * @return The bytes for chalkpyVersion.
   */
  com.google.protobuf.ByteString
      getChalkpyVersionBytes();

  /**
   * <code>optional string tag = 4 [json_name = "tag"];</code>
   * @return Whether the tag field is set.
   */
  boolean hasTag();
  /**
   * <code>optional string tag = 4 [json_name = "tag"];</code>
   * @return The tag.
   */
  java.lang.String getTag();
  /**
   * <code>optional string tag = 4 [json_name = "tag"];</code>
   * @return The bytes for tag.
   */
  com.google.protobuf.ByteString
      getTagBytes();
}
