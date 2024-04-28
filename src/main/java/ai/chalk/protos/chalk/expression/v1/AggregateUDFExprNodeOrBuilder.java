// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/expression/v1/expression.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.chalk.expression.v1;

public interface AggregateUDFExprNodeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.expression.v1.AggregateUDFExprNode)
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

  /**
   * <code>.chalk.expression.v1.LogicalExprNode filter = 3 [json_name = "filter"];</code>
   * @return Whether the filter field is set.
   */
  boolean hasFilter();
  /**
   * <code>.chalk.expression.v1.LogicalExprNode filter = 3 [json_name = "filter"];</code>
   * @return The filter.
   */
  ai.chalk.protos.chalk.expression.v1.LogicalExprNode getFilter();
  /**
   * <code>.chalk.expression.v1.LogicalExprNode filter = 3 [json_name = "filter"];</code>
   */
  ai.chalk.protos.chalk.expression.v1.LogicalExprNodeOrBuilder getFilterOrBuilder();

  /**
   * <code>repeated .chalk.expression.v1.LogicalExprNode order_by = 4 [json_name = "orderBy"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.expression.v1.LogicalExprNode> 
      getOrderByList();
  /**
   * <code>repeated .chalk.expression.v1.LogicalExprNode order_by = 4 [json_name = "orderBy"];</code>
   */
  ai.chalk.protos.chalk.expression.v1.LogicalExprNode getOrderBy(int index);
  /**
   * <code>repeated .chalk.expression.v1.LogicalExprNode order_by = 4 [json_name = "orderBy"];</code>
   */
  int getOrderByCount();
  /**
   * <code>repeated .chalk.expression.v1.LogicalExprNode order_by = 4 [json_name = "orderBy"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.expression.v1.LogicalExprNodeOrBuilder> 
      getOrderByOrBuilderList();
  /**
   * <code>repeated .chalk.expression.v1.LogicalExprNode order_by = 4 [json_name = "orderBy"];</code>
   */
  ai.chalk.protos.chalk.expression.v1.LogicalExprNodeOrBuilder getOrderByOrBuilder(
      int index);
}