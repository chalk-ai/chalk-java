// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/engine/v1/plan.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.chalk.engine.v1;

public interface DataFrameFeatureKeyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.engine.v1.DataFrameFeatureKey)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string root_namespace = 1 [json_name = "rootNamespace"];</code>
   * @return The rootNamespace.
   */
  java.lang.String getRootNamespace();
  /**
   * <code>string root_namespace = 1 [json_name = "rootNamespace"];</code>
   * @return The bytes for rootNamespace.
   */
  com.google.protobuf.ByteString
      getRootNamespaceBytes();

  /**
   * <code>.chalk.engine.v1.DataFrame df = 2 [json_name = "df"];</code>
   * @return Whether the df field is set.
   */
  boolean hasDf();
  /**
   * <code>.chalk.engine.v1.DataFrame df = 2 [json_name = "df"];</code>
   * @return The df.
   */
  ai.chalk.protos.chalk.engine.v1.DataFrame getDf();
  /**
   * <code>.chalk.engine.v1.DataFrame df = 2 [json_name = "df"];</code>
   */
  ai.chalk.protos.chalk.engine.v1.DataFrameOrBuilder getDfOrBuilder();
}