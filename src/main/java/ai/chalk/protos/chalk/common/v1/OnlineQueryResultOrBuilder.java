// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/common/v1/online_query.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.chalk.common.v1;

public interface OnlineQueryResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.common.v1.OnlineQueryResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .chalk.common.v1.FeatureResult results = 1 [json_name = "results"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.common.v1.FeatureResult> 
      getResultsList();
  /**
   * <code>repeated .chalk.common.v1.FeatureResult results = 1 [json_name = "results"];</code>
   */
  ai.chalk.protos.chalk.common.v1.FeatureResult getResults(int index);
  /**
   * <code>repeated .chalk.common.v1.FeatureResult results = 1 [json_name = "results"];</code>
   */
  int getResultsCount();
  /**
   * <code>repeated .chalk.common.v1.FeatureResult results = 1 [json_name = "results"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.common.v1.FeatureResultOrBuilder> 
      getResultsOrBuilderList();
  /**
   * <code>repeated .chalk.common.v1.FeatureResult results = 1 [json_name = "results"];</code>
   */
  ai.chalk.protos.chalk.common.v1.FeatureResultOrBuilder getResultsOrBuilder(
      int index);
}