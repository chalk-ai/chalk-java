// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/nodepools/v1/karpenter.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.nodepools.v1;

public interface KarpenterNodepoolStatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.nodepools.v1.KarpenterNodepoolStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;string, string&gt; resources = 1 [json_name = "resources"];</code>
   */
  int getResourcesCount();
  /**
   * <code>map&lt;string, string&gt; resources = 1 [json_name = "resources"];</code>
   */
  boolean containsResources(
      java.lang.String key);
  /**
   * Use {@link #getResourcesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getResources();
  /**
   * <code>map&lt;string, string&gt; resources = 1 [json_name = "resources"];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getResourcesMap();
  /**
   * <code>map&lt;string, string&gt; resources = 1 [json_name = "resources"];</code>
   */
  /* nullable */
java.lang.String getResourcesOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; resources = 1 [json_name = "resources"];</code>
   */
  java.lang.String getResourcesOrThrow(
      java.lang.String key);

  /**
   * <code>repeated .chalk.nodepools.v1.KarpenterNodepoolCondition conditions = 2 [json_name = "conditions"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolCondition> 
      getConditionsList();
  /**
   * <code>repeated .chalk.nodepools.v1.KarpenterNodepoolCondition conditions = 2 [json_name = "conditions"];</code>
   */
  ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolCondition getConditions(int index);
  /**
   * <code>repeated .chalk.nodepools.v1.KarpenterNodepoolCondition conditions = 2 [json_name = "conditions"];</code>
   */
  int getConditionsCount();
  /**
   * <code>repeated .chalk.nodepools.v1.KarpenterNodepoolCondition conditions = 2 [json_name = "conditions"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolConditionOrBuilder> 
      getConditionsOrBuilderList();
  /**
   * <code>repeated .chalk.nodepools.v1.KarpenterNodepoolCondition conditions = 2 [json_name = "conditions"];</code>
   */
  ai.chalk.protos.chalk.nodepools.v1.KarpenterNodepoolConditionOrBuilder getConditionsOrBuilder(
      int index);
}
