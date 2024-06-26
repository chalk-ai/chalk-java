// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/expression/v1/expression.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.expression.v1;

public interface ScalarFunctionNodeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.expression.v1.ScalarFunctionNode)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.chalk.expression.v1.ScalarFunction fun = 1 [json_name = "fun"];</code>
   * @return The enum numeric value on the wire for fun.
   */
  int getFunValue();
  /**
   * <code>.chalk.expression.v1.ScalarFunction fun = 1 [json_name = "fun"];</code>
   * @return The fun.
   */
  ai.chalk.protos.chalk.expression.v1.ScalarFunction getFun();

  /**
   * <code>repeated .chalk.expression.v1.LogicalExprNode args = 2 [json_name = "args"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.expression.v1.LogicalExprNode> 
      getArgsList();
  /**
   * <code>repeated .chalk.expression.v1.LogicalExprNode args = 2 [json_name = "args"];</code>
   */
  ai.chalk.protos.chalk.expression.v1.LogicalExprNode getArgs(int index);
  /**
   * <code>repeated .chalk.expression.v1.LogicalExprNode args = 2 [json_name = "args"];</code>
   */
  int getArgsCount();
  /**
   * <code>repeated .chalk.expression.v1.LogicalExprNode args = 2 [json_name = "args"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.expression.v1.LogicalExprNodeOrBuilder> 
      getArgsOrBuilderList();
  /**
   * <code>repeated .chalk.expression.v1.LogicalExprNode args = 2 [json_name = "args"];</code>
   */
  ai.chalk.protos.chalk.expression.v1.LogicalExprNodeOrBuilder getArgsOrBuilder(
      int index);
}
