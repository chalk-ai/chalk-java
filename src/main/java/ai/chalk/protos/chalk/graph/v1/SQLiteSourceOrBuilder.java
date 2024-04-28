// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/graph/v1/sources.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.chalk.graph.v1;

public interface SQLiteSourceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.graph.v1.SQLiteSource)
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
   * <code>string file_name = 2 [json_name = "fileName"];</code>
   * @return The fileName.
   */
  java.lang.String getFileName();
  /**
   * <code>string file_name = 2 [json_name = "fileName"];</code>
   * @return The bytes for fileName.
   */
  com.google.protobuf.ByteString
      getFileNameBytes();

  /**
   * <code>map&lt;string, .chalk.arrow.v1.ScalarValue&gt; engine_args = 3 [json_name = "engineArgs"];</code>
   */
  int getEngineArgsCount();
  /**
   * <code>map&lt;string, .chalk.arrow.v1.ScalarValue&gt; engine_args = 3 [json_name = "engineArgs"];</code>
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
   * <code>map&lt;string, .chalk.arrow.v1.ScalarValue&gt; engine_args = 3 [json_name = "engineArgs"];</code>
   */
  java.util.Map<java.lang.String, ai.chalk.protos.chalk.arrow.v1.ScalarValue>
  getEngineArgsMap();
  /**
   * <code>map&lt;string, .chalk.arrow.v1.ScalarValue&gt; engine_args = 3 [json_name = "engineArgs"];</code>
   */
  /* nullable */
ai.chalk.protos.chalk.arrow.v1.ScalarValue getEngineArgsOrDefault(
      java.lang.String key,
      /* nullable */
ai.chalk.protos.chalk.arrow.v1.ScalarValue defaultValue);
  /**
   * <code>map&lt;string, .chalk.arrow.v1.ScalarValue&gt; engine_args = 3 [json_name = "engineArgs"];</code>
   */
  ai.chalk.protos.chalk.arrow.v1.ScalarValue getEngineArgsOrThrow(
      java.lang.String key);

  /**
   * <code>map&lt;string, .chalk.arrow.v1.ScalarValue&gt; async_engine_args = 4 [json_name = "asyncEngineArgs"];</code>
   */
  int getAsyncEngineArgsCount();
  /**
   * <code>map&lt;string, .chalk.arrow.v1.ScalarValue&gt; async_engine_args = 4 [json_name = "asyncEngineArgs"];</code>
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
   * <code>map&lt;string, .chalk.arrow.v1.ScalarValue&gt; async_engine_args = 4 [json_name = "asyncEngineArgs"];</code>
   */
  java.util.Map<java.lang.String, ai.chalk.protos.chalk.arrow.v1.ScalarValue>
  getAsyncEngineArgsMap();
  /**
   * <code>map&lt;string, .chalk.arrow.v1.ScalarValue&gt; async_engine_args = 4 [json_name = "asyncEngineArgs"];</code>
   */
  /* nullable */
ai.chalk.protos.chalk.arrow.v1.ScalarValue getAsyncEngineArgsOrDefault(
      java.lang.String key,
      /* nullable */
ai.chalk.protos.chalk.arrow.v1.ScalarValue defaultValue);
  /**
   * <code>map&lt;string, .chalk.arrow.v1.ScalarValue&gt; async_engine_args = 4 [json_name = "asyncEngineArgs"];</code>
   */
  ai.chalk.protos.chalk.arrow.v1.ScalarValue getAsyncEngineArgsOrThrow(
      java.lang.String key);
}