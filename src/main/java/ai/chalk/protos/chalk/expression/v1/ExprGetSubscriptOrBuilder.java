// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/expression/v1/expression.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.expression.v1;

public interface ExprGetSubscriptOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.expression.v1.ExprGetSubscript)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.chalk.expression.v1.LogicalExprNode parent = 1 [json_name = "parent"];</code>
   * @return Whether the parent field is set.
   */
  boolean hasParent();
  /**
   * <code>.chalk.expression.v1.LogicalExprNode parent = 1 [json_name = "parent"];</code>
   * @return The parent.
   */
  ai.chalk.protos.chalk.expression.v1.LogicalExprNode getParent();
  /**
   * <code>.chalk.expression.v1.LogicalExprNode parent = 1 [json_name = "parent"];</code>
   */
  ai.chalk.protos.chalk.expression.v1.LogicalExprNodeOrBuilder getParentOrBuilder();

  /**
   * <code>repeated .chalk.expression.v1.LogicalExprNode subscript = 2 [json_name = "subscript"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.expression.v1.LogicalExprNode> 
      getSubscriptList();
  /**
   * <code>repeated .chalk.expression.v1.LogicalExprNode subscript = 2 [json_name = "subscript"];</code>
   */
  ai.chalk.protos.chalk.expression.v1.LogicalExprNode getSubscript(int index);
  /**
   * <code>repeated .chalk.expression.v1.LogicalExprNode subscript = 2 [json_name = "subscript"];</code>
   */
  int getSubscriptCount();
  /**
   * <code>repeated .chalk.expression.v1.LogicalExprNode subscript = 2 [json_name = "subscript"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.expression.v1.LogicalExprNodeOrBuilder> 
      getSubscriptOrBuilderList();
  /**
   * <code>repeated .chalk.expression.v1.LogicalExprNode subscript = 2 [json_name = "subscript"];</code>
   */
  ai.chalk.protos.chalk.expression.v1.LogicalExprNodeOrBuilder getSubscriptOrBuilder(
      int index);
}