// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/expression/v1/expression.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.expression.v1;

public interface BinaryExprNodeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.expression.v1.BinaryExprNode)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Represents the operands from the left inner most expression
   * to the right outer most expression where each of them are chained
   * with the operator 'op'.
   * </pre>
   *
   * <code>repeated .chalk.expression.v1.LogicalExprNode operands = 1 [json_name = "operands"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.expression.v1.LogicalExprNode> 
      getOperandsList();
  /**
   * <pre>
   * Represents the operands from the left inner most expression
   * to the right outer most expression where each of them are chained
   * with the operator 'op'.
   * </pre>
   *
   * <code>repeated .chalk.expression.v1.LogicalExprNode operands = 1 [json_name = "operands"];</code>
   */
  ai.chalk.protos.chalk.expression.v1.LogicalExprNode getOperands(int index);
  /**
   * <pre>
   * Represents the operands from the left inner most expression
   * to the right outer most expression where each of them are chained
   * with the operator 'op'.
   * </pre>
   *
   * <code>repeated .chalk.expression.v1.LogicalExprNode operands = 1 [json_name = "operands"];</code>
   */
  int getOperandsCount();
  /**
   * <pre>
   * Represents the operands from the left inner most expression
   * to the right outer most expression where each of them are chained
   * with the operator 'op'.
   * </pre>
   *
   * <code>repeated .chalk.expression.v1.LogicalExprNode operands = 1 [json_name = "operands"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.expression.v1.LogicalExprNodeOrBuilder> 
      getOperandsOrBuilderList();
  /**
   * <pre>
   * Represents the operands from the left inner most expression
   * to the right outer most expression where each of them are chained
   * with the operator 'op'.
   * </pre>
   *
   * <code>repeated .chalk.expression.v1.LogicalExprNode operands = 1 [json_name = "operands"];</code>
   */
  ai.chalk.protos.chalk.expression.v1.LogicalExprNodeOrBuilder getOperandsOrBuilder(
      int index);

  /**
   * <code>string op = 3 [json_name = "op"];</code>
   * @return The op.
   */
  java.lang.String getOp();
  /**
   * <code>string op = 3 [json_name = "op"];</code>
   * @return The bytes for op.
   */
  com.google.protobuf.ByteString
      getOpBytes();
}
