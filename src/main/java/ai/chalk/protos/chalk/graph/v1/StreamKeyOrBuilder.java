// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/graph/v1/graph.proto

// Protobuf Java Version: 3.25.3
package ai.chalk.protos.chalk.graph.v1;

public interface StreamKeyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.graph.v1.StreamKey)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string key = 1 [json_name = "key"];</code>
   * @return The key.
   */
  java.lang.String getKey();
  /**
   * <code>string key = 1 [json_name = "key"];</code>
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString
      getKeyBytes();

  /**
   * <code>.chalk.graph.v1.FeatureReference feature = 2 [json_name = "feature"];</code>
   * @return Whether the feature field is set.
   */
  boolean hasFeature();
  /**
   * <code>.chalk.graph.v1.FeatureReference feature = 2 [json_name = "feature"];</code>
   * @return The feature.
   */
  ai.chalk.protos.chalk.graph.v1.FeatureReference getFeature();
  /**
   * <code>.chalk.graph.v1.FeatureReference feature = 2 [json_name = "feature"];</code>
   */
  ai.chalk.protos.chalk.graph.v1.FeatureReferenceOrBuilder getFeatureOrBuilder();
}
