// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/expression/v1/expression.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.expression.v1;

public interface CastNodeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.expression.v1.CastNode)
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
   * <code>.chalk.arrow.v1.ArrowType arrow_type = 2 [json_name = "arrowType"];</code>
   * @return Whether the arrowType field is set.
   */
  boolean hasArrowType();
  /**
   * <code>.chalk.arrow.v1.ArrowType arrow_type = 2 [json_name = "arrowType"];</code>
   * @return The arrowType.
   */
  ai.chalk.protos.chalk.arrow.v1.ArrowType getArrowType();
  /**
   * <code>.chalk.arrow.v1.ArrowType arrow_type = 2 [json_name = "arrowType"];</code>
   */
  ai.chalk.protos.chalk.arrow.v1.ArrowTypeOrBuilder getArrowTypeOrBuilder();
}
