// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/common/v1/offline_query.proto

// Protobuf Java Version: 3.25.3
package ai.chalk.protos.chalk.common.v1;

public interface OfflineQueryRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.common.v1.OfflineQueryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.chalk.common.v1.OfflineQueryInputs inputs = 1 [json_name = "inputs"];</code>
   * @return Whether the inputs field is set.
   */
  boolean hasInputs();
  /**
   * <code>.chalk.common.v1.OfflineQueryInputs inputs = 1 [json_name = "inputs"];</code>
   * @return The inputs.
   */
  ai.chalk.protos.chalk.common.v1.OfflineQueryInputs getInputs();
  /**
   * <code>.chalk.common.v1.OfflineQueryInputs inputs = 1 [json_name = "inputs"];</code>
   */
  ai.chalk.protos.chalk.common.v1.OfflineQueryInputsOrBuilder getInputsOrBuilder();

  /**
   * <pre>
   * A list of output feature root fqns to query
   * </pre>
   *
   * <code>repeated string outputs = 2 [json_name = "outputs"];</code>
   * @return A list containing the outputs.
   */
  java.util.List<java.lang.String>
      getOutputsList();
  /**
   * <pre>
   * A list of output feature root fqns to query
   * </pre>
   *
   * <code>repeated string outputs = 2 [json_name = "outputs"];</code>
   * @return The count of outputs.
   */
  int getOutputsCount();
  /**
   * <pre>
   * A list of output feature root fqns to query
   * </pre>
   *
   * <code>repeated string outputs = 2 [json_name = "outputs"];</code>
   * @param index The index of the element to return.
   * @return The outputs at the given index.
   */
  java.lang.String getOutputs(int index);
  /**
   * <pre>
   * A list of output feature root fqns to query
   * </pre>
   *
   * <code>repeated string outputs = 2 [json_name = "outputs"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the outputs at the given index.
   */
  com.google.protobuf.ByteString
      getOutputsBytes(int index);

  /**
   * <pre>
   * A list of required output feature root fqns
   * </pre>
   *
   * <code>repeated string required_outputs = 3 [json_name = "requiredOutputs"];</code>
   * @return A list containing the requiredOutputs.
   */
  java.util.List<java.lang.String>
      getRequiredOutputsList();
  /**
   * <pre>
   * A list of required output feature root fqns
   * </pre>
   *
   * <code>repeated string required_outputs = 3 [json_name = "requiredOutputs"];</code>
   * @return The count of requiredOutputs.
   */
  int getRequiredOutputsCount();
  /**
   * <pre>
   * A list of required output feature root fqns
   * </pre>
   *
   * <code>repeated string required_outputs = 3 [json_name = "requiredOutputs"];</code>
   * @param index The index of the element to return.
   * @return The requiredOutputs at the given index.
   */
  java.lang.String getRequiredOutputs(int index);
  /**
   * <pre>
   * A list of required output feature root fqns
   * </pre>
   *
   * <code>repeated string required_outputs = 3 [json_name = "requiredOutputs"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the requiredOutputs at the given index.
   */
  com.google.protobuf.ByteString
      getRequiredOutputsBytes(int index);

  /**
   * <pre>
   * The desired output format. Should be 'CSV' or 'PARQUET
   * </pre>
   *
   * <code>string destination_format = 4 [json_name = "destinationFormat"];</code>
   * @return The destinationFormat.
   */
  java.lang.String getDestinationFormat();
  /**
   * <pre>
   * The desired output format. Should be 'CSV' or 'PARQUET
   * </pre>
   *
   * <code>string destination_format = 4 [json_name = "destinationFormat"];</code>
   * @return The bytes for destinationFormat.
   */
  com.google.protobuf.ByteString
      getDestinationFormatBytes();

  /**
   * <code>optional string branch = 5 [json_name = "branch"];</code>
   * @return Whether the branch field is set.
   */
  boolean hasBranch();
  /**
   * <code>optional string branch = 5 [json_name = "branch"];</code>
   * @return The branch.
   */
  java.lang.String getBranch();
  /**
   * <code>optional string branch = 5 [json_name = "branch"];</code>
   * @return The bytes for branch.
   */
  com.google.protobuf.ByteString
      getBranchBytes();

  /**
   * <code>optional string dataset_name = 6 [json_name = "datasetName"];</code>
   * @return Whether the datasetName field is set.
   */
  boolean hasDatasetName();
  /**
   * <code>optional string dataset_name = 6 [json_name = "datasetName"];</code>
   * @return The datasetName.
   */
  java.lang.String getDatasetName();
  /**
   * <code>optional string dataset_name = 6 [json_name = "datasetName"];</code>
   * @return The bytes for datasetName.
   */
  com.google.protobuf.ByteString
      getDatasetNameBytes();

  /**
   * <code>.chalk.common.v1.OfflineQueryRecomputeFeatures recompute_features = 7 [json_name = "recomputeFeatures"];</code>
   * @return Whether the recomputeFeatures field is set.
   */
  boolean hasRecomputeFeatures();
  /**
   * <code>.chalk.common.v1.OfflineQueryRecomputeFeatures recompute_features = 7 [json_name = "recomputeFeatures"];</code>
   * @return The recomputeFeatures.
   */
  ai.chalk.protos.chalk.common.v1.OfflineQueryRecomputeFeatures getRecomputeFeatures();
  /**
   * <code>.chalk.common.v1.OfflineQueryRecomputeFeatures recompute_features = 7 [json_name = "recomputeFeatures"];</code>
   */
  ai.chalk.protos.chalk.common.v1.OfflineQueryRecomputeFeaturesOrBuilder getRecomputeFeaturesOrBuilder();

  /**
   * <code>bool store_plan_stages = 8 [json_name = "storePlanStages"];</code>
   * @return The storePlanStages.
   */
  boolean getStorePlanStages();

  /**
   * <pre>
   * "Where" clause
   * </pre>
   *
   * <code>repeated .chalk.expression.v1.LogicalExprNode filters = 11 [json_name = "filters"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.expression.v1.LogicalExprNode> 
      getFiltersList();
  /**
   * <pre>
   * "Where" clause
   * </pre>
   *
   * <code>repeated .chalk.expression.v1.LogicalExprNode filters = 11 [json_name = "filters"];</code>
   */
  ai.chalk.protos.chalk.expression.v1.LogicalExprNode getFilters(int index);
  /**
   * <pre>
   * "Where" clause
   * </pre>
   *
   * <code>repeated .chalk.expression.v1.LogicalExprNode filters = 11 [json_name = "filters"];</code>
   */
  int getFiltersCount();
  /**
   * <pre>
   * "Where" clause
   * </pre>
   *
   * <code>repeated .chalk.expression.v1.LogicalExprNode filters = 11 [json_name = "filters"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.expression.v1.LogicalExprNodeOrBuilder> 
      getFiltersOrBuilderList();
  /**
   * <pre>
   * "Where" clause
   * </pre>
   *
   * <code>repeated .chalk.expression.v1.LogicalExprNode filters = 11 [json_name = "filters"];</code>
   */
  ai.chalk.protos.chalk.expression.v1.LogicalExprNodeOrBuilder getFiltersOrBuilder(
      int index);

  /**
   * <pre>
   * The maximum number of samples. If None, no limit
   * </pre>
   *
   * <code>optional int32 max_samples = 101 [json_name = "maxSamples"];</code>
   * @return Whether the maxSamples field is set.
   */
  boolean hasMaxSamples();
  /**
   * <pre>
   * The maximum number of samples. If None, no limit
   * </pre>
   *
   * <code>optional int32 max_samples = 101 [json_name = "maxSamples"];</code>
   * @return The maxSamples.
   */
  int getMaxSamples();

  /**
   * <pre>
   *
   *The maximum staleness, in seconds, for how old the view on the offline store can be. That is,
   *data ingested within this interval will not be reflected in this offline query.
   *Set to ``0`` to ignore the cache. If not specified, it defaults to OFFLINE_QUERY_MAX_CACHE_AGE_SECS
   *in chalk engine config.
   * </pre>
   *
   * <code>optional int32 max_cache_age_secs = 102 [json_name = "maxCacheAgeSecs"];</code>
   * @return Whether the maxCacheAgeSecs field is set.
   */
  boolean hasMaxCacheAgeSecs();
  /**
   * <pre>
   *
   *The maximum staleness, in seconds, for how old the view on the offline store can be. That is,
   *data ingested within this interval will not be reflected in this offline query.
   *Set to ``0`` to ignore the cache. If not specified, it defaults to OFFLINE_QUERY_MAX_CACHE_AGE_SECS
   *in chalk engine config.
   * </pre>
   *
   * <code>optional int32 max_cache_age_secs = 102 [json_name = "maxCacheAgeSecs"];</code>
   * @return The maxCacheAgeSecs.
   */
  int getMaxCacheAgeSecs();

  /**
   * <code>.chalk.common.v1.OfflineQueryExplain explain = 103 [json_name = "explain"];</code>
   * @return Whether the explain field is set.
   */
  boolean hasExplain();
  /**
   * <code>.chalk.common.v1.OfflineQueryExplain explain = 103 [json_name = "explain"];</code>
   * @return The explain.
   */
  ai.chalk.protos.chalk.common.v1.OfflineQueryExplain getExplain();
  /**
   * <code>.chalk.common.v1.OfflineQueryExplain explain = 103 [json_name = "explain"];</code>
   */
  ai.chalk.protos.chalk.common.v1.OfflineQueryExplainOrBuilder getExplainOrBuilder();

  /**
   * <code>repeated string tags = 104 [json_name = "tags"];</code>
   * @return A list containing the tags.
   */
  java.util.List<java.lang.String>
      getTagsList();
  /**
   * <code>repeated string tags = 104 [json_name = "tags"];</code>
   * @return The count of tags.
   */
  int getTagsCount();
  /**
   * <code>repeated string tags = 104 [json_name = "tags"];</code>
   * @param index The index of the element to return.
   * @return The tags at the given index.
   */
  java.lang.String getTags(int index);
  /**
   * <code>repeated string tags = 104 [json_name = "tags"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the tags at the given index.
   */
  com.google.protobuf.ByteString
      getTagsBytes(int index);

  /**
   * <code>optional string correlation_id = 105 [json_name = "correlationId"];</code>
   * @return Whether the correlationId field is set.
   */
  boolean hasCorrelationId();
  /**
   * <code>optional string correlation_id = 105 [json_name = "correlationId"];</code>
   * @return The correlationId.
   */
  java.lang.String getCorrelationId();
  /**
   * <code>optional string correlation_id = 105 [json_name = "correlationId"];</code>
   * @return The bytes for correlationId.
   */
  com.google.protobuf.ByteString
      getCorrelationIdBytes();

  /**
   * <pre>
   * The lower bound for the observed at timestamp (inclusive). If not specified, defaults to the beginning of time
   * </pre>
   *
   * <code>optional string observed_at_lower_bound = 201 [json_name = "observedAtLowerBound"];</code>
   * @return Whether the observedAtLowerBound field is set.
   */
  boolean hasObservedAtLowerBound();
  /**
   * <pre>
   * The lower bound for the observed at timestamp (inclusive). If not specified, defaults to the beginning of time
   * </pre>
   *
   * <code>optional string observed_at_lower_bound = 201 [json_name = "observedAtLowerBound"];</code>
   * @return The observedAtLowerBound.
   */
  java.lang.String getObservedAtLowerBound();
  /**
   * <pre>
   * The lower bound for the observed at timestamp (inclusive). If not specified, defaults to the beginning of time
   * </pre>
   *
   * <code>optional string observed_at_lower_bound = 201 [json_name = "observedAtLowerBound"];</code>
   * @return The bytes for observedAtLowerBound.
   */
  com.google.protobuf.ByteString
      getObservedAtLowerBoundBytes();

  /**
   * <pre>
   * The upper bound for the observed at timestamp (inclusive). If not specified, defaults to the end of time
   * </pre>
   *
   * <code>optional string observed_at_upper_bound = 202 [json_name = "observedAtUpperBound"];</code>
   * @return Whether the observedAtUpperBound field is set.
   */
  boolean hasObservedAtUpperBound();
  /**
   * <pre>
   * The upper bound for the observed at timestamp (inclusive). If not specified, defaults to the end of time
   * </pre>
   *
   * <code>optional string observed_at_upper_bound = 202 [json_name = "observedAtUpperBound"];</code>
   * @return The observedAtUpperBound.
   */
  java.lang.String getObservedAtUpperBound();
  /**
   * <pre>
   * The upper bound for the observed at timestamp (inclusive). If not specified, defaults to the end of time
   * </pre>
   *
   * <code>optional string observed_at_upper_bound = 202 [json_name = "observedAtUpperBound"];</code>
   * @return The bytes for observedAtUpperBound.
   */
  com.google.protobuf.ByteString
      getObservedAtUpperBoundBytes();
}
