// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/expression/v1/expression.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.expression.v1;

public interface ScalarUDFExprNodeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.expression.v1.ScalarUDFExprNode)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string fun_name = 1 [json_name = "funName"];</code>
   * @return The funName.
   */
  java.lang.String getFunName();
  /**
   * <code>string fun_name = 1 [json_name = "funName"];</code>
   * @return The bytes for funName.
   */
  com.google.protobuf.ByteString
      getFunNameBytes();

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
