// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/graph/v1/graph.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.graph.v1;

public interface SQLResolverSettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.graph.v1.SQLResolverSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.chalk.graph.v1.Finalizer finalizer = 1 [json_name = "finalizer"];</code>
   * @return The enum numeric value on the wire for finalizer.
   */
  int getFinalizerValue();
  /**
   * <code>.chalk.graph.v1.Finalizer finalizer = 1 [json_name = "finalizer"];</code>
   * @return The finalizer.
   */
  ai.chalk.protos.chalk.graph.v1.Finalizer getFinalizer();

  /**
   * <code>optional .chalk.graph.v1.IncrementalSettings incremental_settings = 2 [json_name = "incrementalSettings"];</code>
   * @return Whether the incrementalSettings field is set.
   */
  boolean hasIncrementalSettings();
  /**
   * <code>optional .chalk.graph.v1.IncrementalSettings incremental_settings = 2 [json_name = "incrementalSettings"];</code>
   * @return The incrementalSettings.
   */
  ai.chalk.protos.chalk.graph.v1.IncrementalSettings getIncrementalSettings();
  /**
   * <code>optional .chalk.graph.v1.IncrementalSettings incremental_settings = 2 [json_name = "incrementalSettings"];</code>
   */
  ai.chalk.protos.chalk.graph.v1.IncrementalSettingsOrBuilder getIncrementalSettingsOrBuilder();

  /**
   * <code>map&lt;string, string&gt; fields_root_fqn = 3 [json_name = "fieldsRootFqn"];</code>
   */
  int getFieldsRootFqnCount();
  /**
   * <code>map&lt;string, string&gt; fields_root_fqn = 3 [json_name = "fieldsRootFqn"];</code>
   */
  boolean containsFieldsRootFqn(
      java.lang.String key);
  /**
   * Use {@link #getFieldsRootFqnMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getFieldsRootFqn();
  /**
   * <code>map&lt;string, string&gt; fields_root_fqn = 3 [json_name = "fieldsRootFqn"];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getFieldsRootFqnMap();
  /**
   * <code>map&lt;string, string&gt; fields_root_fqn = 3 [json_name = "fieldsRootFqn"];</code>
   */
  /* nullable */
java.lang.String getFieldsRootFqnOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; fields_root_fqn = 3 [json_name = "fieldsRootFqn"];</code>
   */
  java.lang.String getFieldsRootFqnOrThrow(
      java.lang.String key);
}
