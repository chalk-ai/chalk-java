// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/engine/v1/plan.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.engine.v1;

public interface ChalkProjectOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.engine.v1.ChalkProject)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .chalk.engine.v1.Key fields = 1 [json_name = "fields"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.engine.v1.Key> 
      getFieldsList();
  /**
   * <code>repeated .chalk.engine.v1.Key fields = 1 [json_name = "fields"];</code>
   */
  ai.chalk.protos.chalk.engine.v1.Key getFields(int index);
  /**
   * <code>repeated .chalk.engine.v1.Key fields = 1 [json_name = "fields"];</code>
   */
  int getFieldsCount();
  /**
   * <code>repeated .chalk.engine.v1.Key fields = 1 [json_name = "fields"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.engine.v1.KeyOrBuilder> 
      getFieldsOrBuilderList();
  /**
   * <code>repeated .chalk.engine.v1.Key fields = 1 [json_name = "fields"];</code>
   */
  ai.chalk.protos.chalk.engine.v1.KeyOrBuilder getFieldsOrBuilder(
      int index);

  /**
   * <code>bool promote_ts_to_feature_time = 2 [json_name = "promoteTsToFeatureTime"];</code>
   * @return The promoteTsToFeatureTime.
   */
  boolean getPromoteTsToFeatureTime();
}
