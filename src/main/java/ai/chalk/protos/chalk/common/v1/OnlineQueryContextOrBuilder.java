// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/common/v1/online_query.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.common.v1;

public interface OnlineQueryContextOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.common.v1.OnlineQueryContext)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * environment id is set in the header. This field is not set anymore
   * </pre>
   *
   * <code>string environment = 1 [json_name = "environment", deprecated = true];</code>
   * @deprecated chalk.common.v1.OnlineQueryContext.environment is deprecated.
   *     See chalk/common/v1/online_query.proto;l=57
   * @return The environment.
   */
  @java.lang.Deprecated java.lang.String getEnvironment();
  /**
   * <pre>
   * environment id is set in the header. This field is not set anymore
   * </pre>
   *
   * <code>string environment = 1 [json_name = "environment", deprecated = true];</code>
   * @deprecated chalk.common.v1.OnlineQueryContext.environment is deprecated.
   *     See chalk/common/v1/online_query.proto;l=57
   * @return The bytes for environment.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getEnvironmentBytes();

  /**
   * <code>repeated string tags = 2 [json_name = "tags"];</code>
   * @return A list containing the tags.
   */
  java.util.List<java.lang.String>
      getTagsList();
  /**
   * <code>repeated string tags = 2 [json_name = "tags"];</code>
   * @return The count of tags.
   */
  int getTagsCount();
  /**
   * <code>repeated string tags = 2 [json_name = "tags"];</code>
   * @param index The index of the element to return.
   * @return The tags at the given index.
   */
  java.lang.String getTags(int index);
  /**
   * <code>repeated string tags = 2 [json_name = "tags"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the tags at the given index.
   */
  com.google.protobuf.ByteString
      getTagsBytes(int index);

  /**
   * <code>repeated string required_resolver_tags = 3 [json_name = "requiredResolverTags"];</code>
   * @return A list containing the requiredResolverTags.
   */
  java.util.List<java.lang.String>
      getRequiredResolverTagsList();
  /**
   * <code>repeated string required_resolver_tags = 3 [json_name = "requiredResolverTags"];</code>
   * @return The count of requiredResolverTags.
   */
  int getRequiredResolverTagsCount();
  /**
   * <code>repeated string required_resolver_tags = 3 [json_name = "requiredResolverTags"];</code>
   * @param index The index of the element to return.
   * @return The requiredResolverTags at the given index.
   */
  java.lang.String getRequiredResolverTags(int index);
  /**
   * <code>repeated string required_resolver_tags = 3 [json_name = "requiredResolverTags"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the requiredResolverTags at the given index.
   */
  com.google.protobuf.ByteString
      getRequiredResolverTagsBytes(int index);

  /**
   * <pre>
   * deployment id is set in the header. This field is not set anymore
   * </pre>
   *
   * <code>optional string deployment_id = 4 [json_name = "deploymentId", deprecated = true];</code>
   * @deprecated chalk.common.v1.OnlineQueryContext.deployment_id is deprecated.
   *     See chalk/common/v1/online_query.proto;l=60
   * @return Whether the deploymentId field is set.
   */
  @java.lang.Deprecated boolean hasDeploymentId();
  /**
   * <pre>
   * deployment id is set in the header. This field is not set anymore
   * </pre>
   *
   * <code>optional string deployment_id = 4 [json_name = "deploymentId", deprecated = true];</code>
   * @deprecated chalk.common.v1.OnlineQueryContext.deployment_id is deprecated.
   *     See chalk/common/v1/online_query.proto;l=60
   * @return The deploymentId.
   */
  @java.lang.Deprecated java.lang.String getDeploymentId();
  /**
   * <pre>
   * deployment id is set in the header. This field is not set anymore
   * </pre>
   *
   * <code>optional string deployment_id = 4 [json_name = "deploymentId", deprecated = true];</code>
   * @deprecated chalk.common.v1.OnlineQueryContext.deployment_id is deprecated.
   *     See chalk/common/v1/online_query.proto;l=60
   * @return The bytes for deploymentId.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getDeploymentIdBytes();

  /**
   * <pre>
   * branch_id is set in the header. This field is not set anymore
   * </pre>
   *
   * <code>optional string branch_id = 5 [json_name = "branchId", deprecated = true];</code>
   * @deprecated chalk.common.v1.OnlineQueryContext.branch_id is deprecated.
   *     See chalk/common/v1/online_query.proto;l=61
   * @return Whether the branchId field is set.
   */
  @java.lang.Deprecated boolean hasBranchId();
  /**
   * <pre>
   * branch_id is set in the header. This field is not set anymore
   * </pre>
   *
   * <code>optional string branch_id = 5 [json_name = "branchId", deprecated = true];</code>
   * @deprecated chalk.common.v1.OnlineQueryContext.branch_id is deprecated.
   *     See chalk/common/v1/online_query.proto;l=61
   * @return The branchId.
   */
  @java.lang.Deprecated java.lang.String getBranchId();
  /**
   * <pre>
   * branch_id is set in the header. This field is not set anymore
   * </pre>
   *
   * <code>optional string branch_id = 5 [json_name = "branchId", deprecated = true];</code>
   * @deprecated chalk.common.v1.OnlineQueryContext.branch_id is deprecated.
   *     See chalk/common/v1/online_query.proto;l=61
   * @return The bytes for branchId.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getBranchIdBytes();

  /**
   * <code>optional string correlation_id = 6 [json_name = "correlationId"];</code>
   * @return Whether the correlationId field is set.
   */
  boolean hasCorrelationId();
  /**
   * <code>optional string correlation_id = 6 [json_name = "correlationId"];</code>
   * @return The correlationId.
   */
  java.lang.String getCorrelationId();
  /**
   * <code>optional string correlation_id = 6 [json_name = "correlationId"];</code>
   * @return The bytes for correlationId.
   */
  com.google.protobuf.ByteString
      getCorrelationIdBytes();

  /**
   * <code>optional string query_name = 7 [json_name = "queryName"];</code>
   * @return Whether the queryName field is set.
   */
  boolean hasQueryName();
  /**
   * <code>optional string query_name = 7 [json_name = "queryName"];</code>
   * @return The queryName.
   */
  java.lang.String getQueryName();
  /**
   * <code>optional string query_name = 7 [json_name = "queryName"];</code>
   * @return The bytes for queryName.
   */
  com.google.protobuf.ByteString
      getQueryNameBytes();

  /**
   * <code>optional string query_name_version = 8 [json_name = "queryNameVersion"];</code>
   * @return Whether the queryNameVersion field is set.
   */
  boolean hasQueryNameVersion();
  /**
   * <code>optional string query_name_version = 8 [json_name = "queryNameVersion"];</code>
   * @return The queryNameVersion.
   */
  java.lang.String getQueryNameVersion();
  /**
   * <code>optional string query_name_version = 8 [json_name = "queryNameVersion"];</code>
   * @return The bytes for queryNameVersion.
   */
  com.google.protobuf.ByteString
      getQueryNameVersionBytes();

  /**
   * <pre>
   * Arbitrary flags for the query such as store_plan_stages
   * If a flag because consistently used it should be moved into an actual field.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; options = 9 [json_name = "options"];</code>
   */
  int getOptionsCount();
  /**
   * <pre>
   * Arbitrary flags for the query such as store_plan_stages
   * If a flag because consistently used it should be moved into an actual field.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; options = 9 [json_name = "options"];</code>
   */
  boolean containsOptions(
      java.lang.String key);
  /**
   * Use {@link #getOptionsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.protobuf.Value>
  getOptions();
  /**
   * <pre>
   * Arbitrary flags for the query such as store_plan_stages
   * If a flag because consistently used it should be moved into an actual field.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; options = 9 [json_name = "options"];</code>
   */
  java.util.Map<java.lang.String, com.google.protobuf.Value>
  getOptionsMap();
  /**
   * <pre>
   * Arbitrary flags for the query such as store_plan_stages
   * If a flag because consistently used it should be moved into an actual field.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; options = 9 [json_name = "options"];</code>
   */
  /* nullable */
com.google.protobuf.Value getOptionsOrDefault(
      java.lang.String key,
      /* nullable */
com.google.protobuf.Value defaultValue);
  /**
   * <pre>
   * Arbitrary flags for the query such as store_plan_stages
   * If a flag because consistently used it should be moved into an actual field.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; options = 9 [json_name = "options"];</code>
   */
  com.google.protobuf.Value getOptionsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Value metrics will be tagged by the output of the given features
   * </pre>
   *
   * <code>repeated .chalk.common.v1.OutputExpr value_metrics_tag_by_features = 10 [json_name = "valueMetricsTagByFeatures"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.common.v1.OutputExpr> 
      getValueMetricsTagByFeaturesList();
  /**
   * <pre>
   * Value metrics will be tagged by the output of the given features
   * </pre>
   *
   * <code>repeated .chalk.common.v1.OutputExpr value_metrics_tag_by_features = 10 [json_name = "valueMetricsTagByFeatures"];</code>
   */
  ai.chalk.protos.chalk.common.v1.OutputExpr getValueMetricsTagByFeatures(int index);
  /**
   * <pre>
   * Value metrics will be tagged by the output of the given features
   * </pre>
   *
   * <code>repeated .chalk.common.v1.OutputExpr value_metrics_tag_by_features = 10 [json_name = "valueMetricsTagByFeatures"];</code>
   */
  int getValueMetricsTagByFeaturesCount();
  /**
   * <pre>
   * Value metrics will be tagged by the output of the given features
   * </pre>
   *
   * <code>repeated .chalk.common.v1.OutputExpr value_metrics_tag_by_features = 10 [json_name = "valueMetricsTagByFeatures"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.common.v1.OutputExprOrBuilder> 
      getValueMetricsTagByFeaturesOrBuilderList();
  /**
   * <pre>
   * Value metrics will be tagged by the output of the given features
   * </pre>
   *
   * <code>repeated .chalk.common.v1.OutputExpr value_metrics_tag_by_features = 10 [json_name = "valueMetricsTagByFeatures"];</code>
   */
  ai.chalk.protos.chalk.common.v1.OutputExprOrBuilder getValueMetricsTagByFeaturesOrBuilder(
      int index);
}
