// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/common/v1/online_query.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.common.v1;

public interface OnlineQueryMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.common.v1.OnlineQueryMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.google.protobuf.Duration execution_duration = 1 [json_name = "executionDuration"];</code>
   * @return Whether the executionDuration field is set.
   */
  boolean hasExecutionDuration();
  /**
   * <code>.google.protobuf.Duration execution_duration = 1 [json_name = "executionDuration"];</code>
   * @return The executionDuration.
   */
  com.google.protobuf.Duration getExecutionDuration();
  /**
   * <code>.google.protobuf.Duration execution_duration = 1 [json_name = "executionDuration"];</code>
   */
  com.google.protobuf.DurationOrBuilder getExecutionDurationOrBuilder();

  /**
   * <code>string deployment_id = 2 [json_name = "deploymentId"];</code>
   * @return The deploymentId.
   */
  java.lang.String getDeploymentId();
  /**
   * <code>string deployment_id = 2 [json_name = "deploymentId"];</code>
   * @return The bytes for deploymentId.
   */
  com.google.protobuf.ByteString
      getDeploymentIdBytes();

  /**
   * <code>string environment_id = 3 [json_name = "environmentId"];</code>
   * @return The environmentId.
   */
  java.lang.String getEnvironmentId();
  /**
   * <code>string environment_id = 3 [json_name = "environmentId"];</code>
   * @return The bytes for environmentId.
   */
  com.google.protobuf.ByteString
      getEnvironmentIdBytes();

  /**
   * <code>string environment_name = 4 [json_name = "environmentName"];</code>
   * @return The environmentName.
   */
  java.lang.String getEnvironmentName();
  /**
   * <code>string environment_name = 4 [json_name = "environmentName"];</code>
   * @return The bytes for environmentName.
   */
  com.google.protobuf.ByteString
      getEnvironmentNameBytes();

  /**
   * <code>string query_id = 5 [json_name = "queryId"];</code>
   * @return The queryId.
   */
  java.lang.String getQueryId();
  /**
   * <code>string query_id = 5 [json_name = "queryId"];</code>
   * @return The bytes for queryId.
   */
  com.google.protobuf.ByteString
      getQueryIdBytes();

  /**
   * <code>.google.protobuf.Timestamp query_timestamp = 6 [json_name = "queryTimestamp"];</code>
   * @return Whether the queryTimestamp field is set.
   */
  boolean hasQueryTimestamp();
  /**
   * <code>.google.protobuf.Timestamp query_timestamp = 6 [json_name = "queryTimestamp"];</code>
   * @return The queryTimestamp.
   */
  com.google.protobuf.Timestamp getQueryTimestamp();
  /**
   * <code>.google.protobuf.Timestamp query_timestamp = 6 [json_name = "queryTimestamp"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getQueryTimestampOrBuilder();

  /**
   * <code>string query_hash = 7 [json_name = "queryHash"];</code>
   * @return The queryHash.
   */
  java.lang.String getQueryHash();
  /**
   * <code>string query_hash = 7 [json_name = "queryHash"];</code>
   * @return The bytes for queryHash.
   */
  com.google.protobuf.ByteString
      getQueryHashBytes();

  /**
   * <code>.chalk.common.v1.QueryExplainInfo explain_output = 8 [json_name = "explainOutput"];</code>
   * @return Whether the explainOutput field is set.
   */
  boolean hasExplainOutput();
  /**
   * <code>.chalk.common.v1.QueryExplainInfo explain_output = 8 [json_name = "explainOutput"];</code>
   * @return The explainOutput.
   */
  ai.chalk.protos.chalk.common.v1.QueryExplainInfo getExplainOutput();
  /**
   * <code>.chalk.common.v1.QueryExplainInfo explain_output = 8 [json_name = "explainOutput"];</code>
   */
  ai.chalk.protos.chalk.common.v1.QueryExplainInfoOrBuilder getExplainOutputOrBuilder();

  /**
   * <pre>
   * Same customer-provided metadata that was provided in the request.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 9 [json_name = "metadata"];</code>
   */
  int getMetadataCount();
  /**
   * <pre>
   * Same customer-provided metadata that was provided in the request.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 9 [json_name = "metadata"];</code>
   */
  boolean containsMetadata(
      java.lang.String key);
  /**
   * Use {@link #getMetadataMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getMetadata();
  /**
   * <pre>
   * Same customer-provided metadata that was provided in the request.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 9 [json_name = "metadata"];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getMetadataMap();
  /**
   * <pre>
   * Same customer-provided metadata that was provided in the request.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 9 [json_name = "metadata"];</code>
   */
  /* nullable */
java.lang.String getMetadataOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Same customer-provided metadata that was provided in the request.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 9 [json_name = "metadata"];</code>
   */
  java.lang.String getMetadataOrThrow(
      java.lang.String key);

  /**
   * <code>map&lt;string, .google.protobuf.Value&gt; additional_metadata = 10 [json_name = "additionalMetadata"];</code>
   */
  int getAdditionalMetadataCount();
  /**
   * <code>map&lt;string, .google.protobuf.Value&gt; additional_metadata = 10 [json_name = "additionalMetadata"];</code>
   */
  boolean containsAdditionalMetadata(
      java.lang.String key);
  /**
   * Use {@link #getAdditionalMetadataMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.protobuf.Value>
  getAdditionalMetadata();
  /**
   * <code>map&lt;string, .google.protobuf.Value&gt; additional_metadata = 10 [json_name = "additionalMetadata"];</code>
   */
  java.util.Map<java.lang.String, com.google.protobuf.Value>
  getAdditionalMetadataMap();
  /**
   * <code>map&lt;string, .google.protobuf.Value&gt; additional_metadata = 10 [json_name = "additionalMetadata"];</code>
   */
  /* nullable */
com.google.protobuf.Value getAdditionalMetadataOrDefault(
      java.lang.String key,
      /* nullable */
com.google.protobuf.Value defaultValue);
  /**
   * <code>map&lt;string, .google.protobuf.Value&gt; additional_metadata = 10 [json_name = "additionalMetadata"];</code>
   */
  com.google.protobuf.Value getAdditionalMetadataOrThrow(
      java.lang.String key);
}
