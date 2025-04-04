// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/builder.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

public interface UpdateEnvironmentVariablesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.UpdateEnvironmentVariablesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;string, string&gt; environment_variables = 1 [json_name = "environmentVariables"];</code>
   */
  int getEnvironmentVariablesCount();
  /**
   * <code>map&lt;string, string&gt; environment_variables = 1 [json_name = "environmentVariables"];</code>
   */
  boolean containsEnvironmentVariables(
      java.lang.String key);
  /**
   * Use {@link #getEnvironmentVariablesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getEnvironmentVariables();
  /**
   * <code>map&lt;string, string&gt; environment_variables = 1 [json_name = "environmentVariables"];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getEnvironmentVariablesMap();
  /**
   * <code>map&lt;string, string&gt; environment_variables = 1 [json_name = "environmentVariables"];</code>
   */
  /* nullable */
java.lang.String getEnvironmentVariablesOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; environment_variables = 1 [json_name = "environmentVariables"];</code>
   */
  java.lang.String getEnvironmentVariablesOrThrow(
      java.lang.String key);
}
