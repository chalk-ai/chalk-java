// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/expression/v1/expression.proto

// Protobuf Java Version: 3.25.3
package ai.chalk.protos.chalk.expression.v1;

public interface LikeNodeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.expression.v1.LikeNode)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool negated = 1 [json_name = "negated"];</code>
   * @return The negated.
   */
  boolean getNegated();

  /**
   * <code>.chalk.expression.v1.LogicalExprNode expr = 2 [json_name = "expr"];</code>
   * @return Whether the expr field is set.
   */
  boolean hasExpr();
  /**
   * <code>.chalk.expression.v1.LogicalExprNode expr = 2 [json_name = "expr"];</code>
   * @return The expr.
   */
  ai.chalk.protos.chalk.expression.v1.LogicalExprNode getExpr();
  /**
   * <code>.chalk.expression.v1.LogicalExprNode expr = 2 [json_name = "expr"];</code>
   */
  ai.chalk.protos.chalk.expression.v1.LogicalExprNodeOrBuilder getExprOrBuilder();

  /**
   * <code>.chalk.expression.v1.LogicalExprNode pattern = 3 [json_name = "pattern"];</code>
   * @return Whether the pattern field is set.
   */
  boolean hasPattern();
  /**
   * <code>.chalk.expression.v1.LogicalExprNode pattern = 3 [json_name = "pattern"];</code>
   * @return The pattern.
   */
  ai.chalk.protos.chalk.expression.v1.LogicalExprNode getPattern();
  /**
   * <code>.chalk.expression.v1.LogicalExprNode pattern = 3 [json_name = "pattern"];</code>
   */
  ai.chalk.protos.chalk.expression.v1.LogicalExprNodeOrBuilder getPatternOrBuilder();

  /**
   * <code>string escape_char = 4 [json_name = "escapeChar"];</code>
   * @return The escapeChar.
   */
  java.lang.String getEscapeChar();
  /**
   * <code>string escape_char = 4 [json_name = "escapeChar"];</code>
   * @return The bytes for escapeChar.
   */
  com.google.protobuf.ByteString
      getEscapeCharBytes();
}
