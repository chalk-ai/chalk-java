// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/expression/v1/expression.proto

// Protobuf Java Version: 3.25.3
package ai.chalk.protos.chalk.expression.v1;

public interface WhenThenOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.expression.v1.WhenThen)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.chalk.expression.v1.LogicalExprNode when_expr = 1 [json_name = "whenExpr"];</code>
   * @return Whether the whenExpr field is set.
   */
  boolean hasWhenExpr();
  /**
   * <code>.chalk.expression.v1.LogicalExprNode when_expr = 1 [json_name = "whenExpr"];</code>
   * @return The whenExpr.
   */
  ai.chalk.protos.chalk.expression.v1.LogicalExprNode getWhenExpr();
  /**
   * <code>.chalk.expression.v1.LogicalExprNode when_expr = 1 [json_name = "whenExpr"];</code>
   */
  ai.chalk.protos.chalk.expression.v1.LogicalExprNodeOrBuilder getWhenExprOrBuilder();

  /**
   * <code>.chalk.expression.v1.LogicalExprNode then_expr = 2 [json_name = "thenExpr"];</code>
   * @return Whether the thenExpr field is set.
   */
  boolean hasThenExpr();
  /**
   * <code>.chalk.expression.v1.LogicalExprNode then_expr = 2 [json_name = "thenExpr"];</code>
   * @return The thenExpr.
   */
  ai.chalk.protos.chalk.expression.v1.LogicalExprNode getThenExpr();
  /**
   * <code>.chalk.expression.v1.LogicalExprNode then_expr = 2 [json_name = "thenExpr"];</code>
   */
  ai.chalk.protos.chalk.expression.v1.LogicalExprNodeOrBuilder getThenExprOrBuilder();
}
