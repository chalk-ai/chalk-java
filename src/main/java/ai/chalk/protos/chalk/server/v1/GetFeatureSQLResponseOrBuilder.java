// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/graph.proto

// Protobuf Java Version: 3.25.3
package ai.chalk.protos.chalk.server.v1;

public interface GetFeatureSQLResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.GetFeatureSQLResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .chalk.server.v1.FeatureSQL features = 1 [json_name = "features"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.server.v1.FeatureSQL> 
      getFeaturesList();
  /**
   * <code>repeated .chalk.server.v1.FeatureSQL features = 1 [json_name = "features"];</code>
   */
  ai.chalk.protos.chalk.server.v1.FeatureSQL getFeatures(int index);
  /**
   * <code>repeated .chalk.server.v1.FeatureSQL features = 1 [json_name = "features"];</code>
   */
  int getFeaturesCount();
  /**
   * <code>repeated .chalk.server.v1.FeatureSQL features = 1 [json_name = "features"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.server.v1.FeatureSQLOrBuilder> 
      getFeaturesOrBuilderList();
  /**
   * <code>repeated .chalk.server.v1.FeatureSQL features = 1 [json_name = "features"];</code>
   */
  ai.chalk.protos.chalk.server.v1.FeatureSQLOrBuilder getFeaturesOrBuilder(
      int index);
}
