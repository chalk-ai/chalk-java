// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/expression/v1/expression.proto

// Protobuf Java Version: 3.25.3
package ai.chalk.protos.chalk.expression.v1;

public interface ColumnOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.expression.v1.Column)
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
   * <code>.chalk.expression.v1.ColumnRelation relation = 2 [json_name = "relation"];</code>
   * @return Whether the relation field is set.
   */
  boolean hasRelation();
  /**
   * <code>.chalk.expression.v1.ColumnRelation relation = 2 [json_name = "relation"];</code>
   * @return The relation.
   */
  ai.chalk.protos.chalk.expression.v1.ColumnRelation getRelation();
  /**
   * <code>.chalk.expression.v1.ColumnRelation relation = 2 [json_name = "relation"];</code>
   */
  ai.chalk.protos.chalk.expression.v1.ColumnRelationOrBuilder getRelationOrBuilder();
}
