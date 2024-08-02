// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/graph/v1/sources.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.graph.v1;

public interface DynamoDBSourceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.graph.v1.DynamoDBSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>optional string aws_client_id_override = 2 [json_name = "awsClientIdOverride"];</code>
   * @return Whether the awsClientIdOverride field is set.
   */
  boolean hasAwsClientIdOverride();
  /**
   * <code>optional string aws_client_id_override = 2 [json_name = "awsClientIdOverride"];</code>
   * @return The awsClientIdOverride.
   */
  java.lang.String getAwsClientIdOverride();
  /**
   * <code>optional string aws_client_id_override = 2 [json_name = "awsClientIdOverride"];</code>
   * @return The bytes for awsClientIdOverride.
   */
  com.google.protobuf.ByteString
      getAwsClientIdOverrideBytes();

  /**
   * <code>optional string aws_client_secret_override = 3 [json_name = "awsClientSecretOverride"];</code>
   * @return Whether the awsClientSecretOverride field is set.
   */
  boolean hasAwsClientSecretOverride();
  /**
   * <code>optional string aws_client_secret_override = 3 [json_name = "awsClientSecretOverride"];</code>
   * @return The awsClientSecretOverride.
   */
  java.lang.String getAwsClientSecretOverride();
  /**
   * <code>optional string aws_client_secret_override = 3 [json_name = "awsClientSecretOverride"];</code>
   * @return The bytes for awsClientSecretOverride.
   */
  com.google.protobuf.ByteString
      getAwsClientSecretOverrideBytes();

  /**
   * <code>optional string aws_region_override = 4 [json_name = "awsRegionOverride"];</code>
   * @return Whether the awsRegionOverride field is set.
   */
  boolean hasAwsRegionOverride();
  /**
   * <code>optional string aws_region_override = 4 [json_name = "awsRegionOverride"];</code>
   * @return The awsRegionOverride.
   */
  java.lang.String getAwsRegionOverride();
  /**
   * <code>optional string aws_region_override = 4 [json_name = "awsRegionOverride"];</code>
   * @return The bytes for awsRegionOverride.
   */
  com.google.protobuf.ByteString
      getAwsRegionOverrideBytes();

  /**
   * <code>optional string endpoint_override = 5 [json_name = "endpointOverride"];</code>
   * @return Whether the endpointOverride field is set.
   */
  boolean hasEndpointOverride();
  /**
   * <code>optional string endpoint_override = 5 [json_name = "endpointOverride"];</code>
   * @return The endpointOverride.
   */
  java.lang.String getEndpointOverride();
  /**
   * <code>optional string endpoint_override = 5 [json_name = "endpointOverride"];</code>
   * @return The bytes for endpointOverride.
   */
  com.google.protobuf.ByteString
      getEndpointOverrideBytes();

  /**
   * <code>map&lt;string, .chalk.arrow.v1.ScalarValue&gt; engine_args = 6 [json_name = "engineArgs"];</code>
   */
  int getEngineArgsCount();
  /**
   * <code>map&lt;string, .chalk.arrow.v1.ScalarValue&gt; engine_args = 6 [json_name = "engineArgs"];</code>
   */
  boolean containsEngineArgs(
      java.lang.String key);
  /**
   * Use {@link #getEngineArgsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, ai.chalk.protos.chalk.arrow.v1.ScalarValue>
  getEngineArgs();
  /**
   * <code>map&lt;string, .chalk.arrow.v1.ScalarValue&gt; engine_args = 6 [json_name = "engineArgs"];</code>
   */
  java.util.Map<java.lang.String, ai.chalk.protos.chalk.arrow.v1.ScalarValue>
  getEngineArgsMap();
  /**
   * <code>map&lt;string, .chalk.arrow.v1.ScalarValue&gt; engine_args = 6 [json_name = "engineArgs"];</code>
   */
  /* nullable */
ai.chalk.protos.chalk.arrow.v1.ScalarValue getEngineArgsOrDefault(
      java.lang.String key,
      /* nullable */
ai.chalk.protos.chalk.arrow.v1.ScalarValue defaultValue);
  /**
   * <code>map&lt;string, .chalk.arrow.v1.ScalarValue&gt; engine_args = 6 [json_name = "engineArgs"];</code>
   */
  ai.chalk.protos.chalk.arrow.v1.ScalarValue getEngineArgsOrThrow(
      java.lang.String key);

  /**
   * <code>map&lt;string, .chalk.arrow.v1.ScalarValue&gt; async_engine_args = 7 [json_name = "asyncEngineArgs"];</code>
   */
  int getAsyncEngineArgsCount();
  /**
   * <code>map&lt;string, .chalk.arrow.v1.ScalarValue&gt; async_engine_args = 7 [json_name = "asyncEngineArgs"];</code>
   */
  boolean containsAsyncEngineArgs(
      java.lang.String key);
  /**
   * Use {@link #getAsyncEngineArgsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, ai.chalk.protos.chalk.arrow.v1.ScalarValue>
  getAsyncEngineArgs();
  /**
   * <code>map&lt;string, .chalk.arrow.v1.ScalarValue&gt; async_engine_args = 7 [json_name = "asyncEngineArgs"];</code>
   */
  java.util.Map<java.lang.String, ai.chalk.protos.chalk.arrow.v1.ScalarValue>
  getAsyncEngineArgsMap();
  /**
   * <code>map&lt;string, .chalk.arrow.v1.ScalarValue&gt; async_engine_args = 7 [json_name = "asyncEngineArgs"];</code>
   */
  /* nullable */
ai.chalk.protos.chalk.arrow.v1.ScalarValue getAsyncEngineArgsOrDefault(
      java.lang.String key,
      /* nullable */
ai.chalk.protos.chalk.arrow.v1.ScalarValue defaultValue);
  /**
   * <code>map&lt;string, .chalk.arrow.v1.ScalarValue&gt; async_engine_args = 7 [json_name = "asyncEngineArgs"];</code>
   */
  ai.chalk.protos.chalk.arrow.v1.ScalarValue getAsyncEngineArgsOrThrow(
      java.lang.String key);
}
