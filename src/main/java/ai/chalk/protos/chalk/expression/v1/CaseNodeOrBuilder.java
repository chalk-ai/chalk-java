// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/expression/v1/expression.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.chalk.expression.v1;

public interface CaseNodeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.expression.v1.CaseNode)
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
   * <code>repeated .chalk.expression.v1.WhenThen when_then_expr = 2 [json_name = "whenThenExpr"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.expression.v1.WhenThen> 
      getWhenThenExprList();
  /**
   * <code>repeated .chalk.expression.v1.WhenThen when_then_expr = 2 [json_name = "whenThenExpr"];</code>
   */
  ai.chalk.protos.chalk.expression.v1.WhenThen getWhenThenExpr(int index);
  /**
   * <code>repeated .chalk.expression.v1.WhenThen when_then_expr = 2 [json_name = "whenThenExpr"];</code>
   */
  int getWhenThenExprCount();
  /**
   * <code>repeated .chalk.expression.v1.WhenThen when_then_expr = 2 [json_name = "whenThenExpr"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.expression.v1.WhenThenOrBuilder> 
      getWhenThenExprOrBuilderList();
  /**
   * <code>repeated .chalk.expression.v1.WhenThen when_then_expr = 2 [json_name = "whenThenExpr"];</code>
   */
  ai.chalk.protos.chalk.expression.v1.WhenThenOrBuilder getWhenThenExprOrBuilder(
      int index);

  /**
   * <code>.chalk.expression.v1.LogicalExprNode else_expr = 3 [json_name = "elseExpr"];</code>
   * @return Whether the elseExpr field is set.
   */
  boolean hasElseExpr();
  /**
   * <code>.chalk.expression.v1.LogicalExprNode else_expr = 3 [json_name = "elseExpr"];</code>
   * @return The elseExpr.
   */
  ai.chalk.protos.chalk.expression.v1.LogicalExprNode getElseExpr();
  /**
   * <code>.chalk.expression.v1.LogicalExprNode else_expr = 3 [json_name = "elseExpr"];</code>
   */
  ai.chalk.protos.chalk.expression.v1.LogicalExprNodeOrBuilder getElseExprOrBuilder();
}
