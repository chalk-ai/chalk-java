// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/graph.proto

// Protobuf Java Version: 3.25.3
package ai.chalk.protos.chalk.server.v1;

public interface GetGraphResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.GetGraphResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.chalk.graph.v1.Graph graph = 1 [json_name = "graph"];</code>
   * @return Whether the graph field is set.
   */
  boolean hasGraph();
  /**
   * <code>.chalk.graph.v1.Graph graph = 1 [json_name = "graph"];</code>
   * @return The graph.
   */
  ai.chalk.protos.chalk.graph.v1.Graph getGraph();
  /**
   * <code>.chalk.graph.v1.Graph graph = 1 [json_name = "graph"];</code>
   */
  ai.chalk.protos.chalk.graph.v1.GraphOrBuilder getGraphOrBuilder();

  /**
   * <code>string chalkpy_version = 2 [json_name = "chalkpyVersion"];</code>
   * @return The chalkpyVersion.
   */
  java.lang.String getChalkpyVersion();
  /**
   * <code>string chalkpy_version = 2 [json_name = "chalkpyVersion"];</code>
   * @return The bytes for chalkpyVersion.
   */
  com.google.protobuf.ByteString
      getChalkpyVersionBytes();

  /**
   * <code>optional string tag = 3 [json_name = "tag"];</code>
   * @return Whether the tag field is set.
   */
  boolean hasTag();
  /**
   * <code>optional string tag = 3 [json_name = "tag"];</code>
   * @return The tag.
   */
  java.lang.String getTag();
  /**
   * <code>optional string tag = 3 [json_name = "tag"];</code>
   * @return The bytes for tag.
   */
  com.google.protobuf.ByteString
      getTagBytes();
}
