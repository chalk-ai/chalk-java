// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/engine/v1/plan.proto

// Protobuf Java Version: 3.25.3
package ai.chalk.protos.chalk.engine.v1;

public interface HasManyFeatureKeyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.engine.v1.HasManyFeatureKey)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string root_fqn = 1 [json_name = "rootFqn"];</code>
   * @return The rootFqn.
   */
  java.lang.String getRootFqn();
  /**
   * <code>string root_fqn = 1 [json_name = "rootFqn"];</code>
   * @return The bytes for rootFqn.
   */
  com.google.protobuf.ByteString
      getRootFqnBytes();

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
