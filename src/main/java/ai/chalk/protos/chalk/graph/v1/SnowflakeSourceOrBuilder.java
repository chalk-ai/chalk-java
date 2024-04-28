// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/graph/v1/sources.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.chalk.graph.v1;

public interface SnowflakeSourceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.graph.v1.SnowflakeSource)
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
   * <code>string db = 2 [json_name = "db"];</code>
   * @return The db.
   */
  java.lang.String getDb();
  /**
   * <code>string db = 2 [json_name = "db"];</code>
   * @return The bytes for db.
   */
  com.google.protobuf.ByteString
      getDbBytes();

  /**
   * <code>string schema = 3 [json_name = "schema"];</code>
   * @return The schema.
   */
  java.lang.String getSchema();
  /**
   * <code>string schema = 3 [json_name = "schema"];</code>
   * @return The bytes for schema.
   */
  com.google.protobuf.ByteString
      getSchemaBytes();

  /**
   * <code>string role = 4 [json_name = "role"];</code>
   * @return The role.
   */
  java.lang.String getRole();
  /**
   * <code>string role = 4 [json_name = "role"];</code>
   * @return The bytes for role.
   */
  com.google.protobuf.ByteString
      getRoleBytes();

  /**
   * <code>string user = 5 [json_name = "user"];</code>
   * @return The user.
   */
  java.lang.String getUser();
  /**
   * <code>string user = 5 [json_name = "user"];</code>
   * @return The bytes for user.
   */
  com.google.protobuf.ByteString
      getUserBytes();

  /**
   * <code>string password = 6 [json_name = "password"];</code>
   * @return The password.
   */
  java.lang.String getPassword();
  /**
   * <code>string password = 6 [json_name = "password"];</code>
   * @return The bytes for password.
   */
  com.google.protobuf.ByteString
      getPasswordBytes();

  /**
   * <code>string account_identifier = 7 [json_name = "accountIdentifier"];</code>
   * @return The accountIdentifier.
   */
  java.lang.String getAccountIdentifier();
  /**
   * <code>string account_identifier = 7 [json_name = "accountIdentifier"];</code>
   * @return The bytes for accountIdentifier.
   */
  com.google.protobuf.ByteString
      getAccountIdentifierBytes();

  /**
   * <code>string warehouse = 8 [json_name = "warehouse"];</code>
   * @return The warehouse.
   */
  java.lang.String getWarehouse();
  /**
   * <code>string warehouse = 8 [json_name = "warehouse"];</code>
   * @return The bytes for warehouse.
   */
  com.google.protobuf.ByteString
      getWarehouseBytes();

  /**
   * <code>map&lt;string, .chalk.arrow.v1.ScalarValue&gt; engine_args = 9 [json_name = "engineArgs"];</code>
   */
  int getEngineArgsCount();
  /**
   * <code>map&lt;string, .chalk.arrow.v1.ScalarValue&gt; engine_args = 9 [json_name = "engineArgs"];</code>
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
   * <code>map&lt;string, .chalk.arrow.v1.ScalarValue&gt; engine_args = 9 [json_name = "engineArgs"];</code>
   */
  java.util.Map<java.lang.String, ai.chalk.protos.chalk.arrow.v1.ScalarValue>
  getEngineArgsMap();
  /**
   * <code>map&lt;string, .chalk.arrow.v1.ScalarValue&gt; engine_args = 9 [json_name = "engineArgs"];</code>
   */
  /* nullable */
ai.chalk.protos.chalk.arrow.v1.ScalarValue getEngineArgsOrDefault(
      java.lang.String key,
      /* nullable */
ai.chalk.protos.chalk.arrow.v1.ScalarValue defaultValue);
  /**
   * <code>map&lt;string, .chalk.arrow.v1.ScalarValue&gt; engine_args = 9 [json_name = "engineArgs"];</code>
   */
  ai.chalk.protos.chalk.arrow.v1.ScalarValue getEngineArgsOrThrow(
      java.lang.String key);

  /**
   * <code>map&lt;string, .chalk.arrow.v1.ScalarValue&gt; async_engine_args = 10 [json_name = "asyncEngineArgs"];</code>
   */
  int getAsyncEngineArgsCount();
  /**
   * <code>map&lt;string, .chalk.arrow.v1.ScalarValue&gt; async_engine_args = 10 [json_name = "asyncEngineArgs"];</code>
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
   * <code>map&lt;string, .chalk.arrow.v1.ScalarValue&gt; async_engine_args = 10 [json_name = "asyncEngineArgs"];</code>
   */
  java.util.Map<java.lang.String, ai.chalk.protos.chalk.arrow.v1.ScalarValue>
  getAsyncEngineArgsMap();
  /**
   * <code>map&lt;string, .chalk.arrow.v1.ScalarValue&gt; async_engine_args = 10 [json_name = "asyncEngineArgs"];</code>
   */
  /* nullable */
ai.chalk.protos.chalk.arrow.v1.ScalarValue getAsyncEngineArgsOrDefault(
      java.lang.String key,
      /* nullable */
ai.chalk.protos.chalk.arrow.v1.ScalarValue defaultValue);
  /**
   * <code>map&lt;string, .chalk.arrow.v1.ScalarValue&gt; async_engine_args = 10 [json_name = "asyncEngineArgs"];</code>
   */
  ai.chalk.protos.chalk.arrow.v1.ScalarValue getAsyncEngineArgsOrThrow(
      java.lang.String key);
}
