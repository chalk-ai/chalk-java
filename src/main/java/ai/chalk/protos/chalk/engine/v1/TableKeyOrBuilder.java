// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/engine/v1/plan.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.chalk.engine.v1;

public interface TableKeyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.engine.v1.TableKey)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.chalk.engine.v1.HasManyFeatureKey has_many = 1 [json_name = "hasMany"];</code>
   * @return Whether the hasMany field is set.
   */
  boolean hasHasMany();
  /**
   * <code>.chalk.engine.v1.HasManyFeatureKey has_many = 1 [json_name = "hasMany"];</code>
   * @return The hasMany.
   */
  ai.chalk.protos.chalk.engine.v1.HasManyFeatureKey getHasMany();
  /**
   * <code>.chalk.engine.v1.HasManyFeatureKey has_many = 1 [json_name = "hasMany"];</code>
   */
  ai.chalk.protos.chalk.engine.v1.HasManyFeatureKeyOrBuilder getHasManyOrBuilder();

  /**
   * <code>.chalk.engine.v1.DataFrameFeatureKey data_frame = 2 [json_name = "dataFrame"];</code>
   * @return Whether the dataFrame field is set.
   */
  boolean hasDataFrame();
  /**
   * <code>.chalk.engine.v1.DataFrameFeatureKey data_frame = 2 [json_name = "dataFrame"];</code>
   * @return The dataFrame.
   */
  ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKey getDataFrame();
  /**
   * <code>.chalk.engine.v1.DataFrameFeatureKey data_frame = 2 [json_name = "dataFrame"];</code>
   */
  ai.chalk.protos.chalk.engine.v1.DataFrameFeatureKeyOrBuilder getDataFrameOrBuilder();

  ai.chalk.protos.chalk.engine.v1.TableKey.KeyCase getKeyCase();
}
