// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/expression/v1/expression.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.expression.v1;

public interface AliasNodeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.expression.v1.AliasNode)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.chalk.expression.v1.LogicalExprNode expr = 1 [json_name = "expr"];</code>
   * @return Whether the expr field is set.
   */
  boolean hasExpr();
  /**
   * <code>.chalk.expression.v1.LogicalExprNode expr = 1 [json_name = "expr"];</code>
   * @return The expr.
   */
  ai.chalk.protos.chalk.expression.v1.LogicalExprNode getExpr();
  /**
   * <code>.chalk.expression.v1.LogicalExprNode expr = 1 [json_name = "expr"];</code>
   */
  ai.chalk.protos.chalk.expression.v1.LogicalExprNodeOrBuilder getExprOrBuilder();

  /**
   * <code>string alias = 2 [json_name = "alias"];</code>
   * @return The alias.
   */
  java.lang.String getAlias();
  /**
   * <code>string alias = 2 [json_name = "alias"];</code>
   * @return The bytes for alias.
   */
  com.google.protobuf.ByteString
      getAliasBytes();

  /**
   * <code>repeated .chalk.expression.v1.OwnedTableReference relation = 3 [json_name = "relation"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.expression.v1.OwnedTableReference> 
      getRelationList();
  /**
   * <code>repeated .chalk.expression.v1.OwnedTableReference relation = 3 [json_name = "relation"];</code>
   */
  ai.chalk.protos.chalk.expression.v1.OwnedTableReference getRelation(int index);
  /**
   * <code>repeated .chalk.expression.v1.OwnedTableReference relation = 3 [json_name = "relation"];</code>
   */
  int getRelationCount();
  /**
   * <code>repeated .chalk.expression.v1.OwnedTableReference relation = 3 [json_name = "relation"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.expression.v1.OwnedTableReferenceOrBuilder> 
      getRelationOrBuilderList();
  /**
   * <code>repeated .chalk.expression.v1.OwnedTableReference relation = 3 [json_name = "relation"];</code>
   */
  ai.chalk.protos.chalk.expression.v1.OwnedTableReferenceOrBuilder getRelationOrBuilder(
      int index);
}
