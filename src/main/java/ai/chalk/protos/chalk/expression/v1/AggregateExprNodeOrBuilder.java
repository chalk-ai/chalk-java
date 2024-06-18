// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/expression/v1/expression.proto

// Protobuf Java Version: 3.25.3
package ai.chalk.protos.chalk.expression.v1;

public interface AggregateExprNodeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.expression.v1.AggregateExprNode)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.chalk.expression.v1.AggregateFunction aggr_function = 1 [json_name = "aggrFunction"];</code>
   * @return The enum numeric value on the wire for aggrFunction.
   */
  int getAggrFunctionValue();
  /**
   * <code>.chalk.expression.v1.AggregateFunction aggr_function = 1 [json_name = "aggrFunction"];</code>
   * @return The aggrFunction.
   */
  ai.chalk.protos.chalk.expression.v1.AggregateFunction getAggrFunction();

  /**
   * <code>repeated .chalk.expression.v1.LogicalExprNode expr = 2 [json_name = "expr"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.expression.v1.LogicalExprNode> 
      getExprList();
  /**
   * <code>repeated .chalk.expression.v1.LogicalExprNode expr = 2 [json_name = "expr"];</code>
   */
  ai.chalk.protos.chalk.expression.v1.LogicalExprNode getExpr(int index);
  /**
   * <code>repeated .chalk.expression.v1.LogicalExprNode expr = 2 [json_name = "expr"];</code>
   */
  int getExprCount();
  /**
   * <code>repeated .chalk.expression.v1.LogicalExprNode expr = 2 [json_name = "expr"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.expression.v1.LogicalExprNodeOrBuilder> 
      getExprOrBuilderList();
  /**
   * <code>repeated .chalk.expression.v1.LogicalExprNode expr = 2 [json_name = "expr"];</code>
   */
  ai.chalk.protos.chalk.expression.v1.LogicalExprNodeOrBuilder getExprOrBuilder(
      int index);

  /**
   * <code>bool distinct = 3 [json_name = "distinct"];</code>
   * @return The distinct.
   */
  boolean getDistinct();

  /**
   * <code>.chalk.expression.v1.LogicalExprNode filter = 4 [json_name = "filter"];</code>
   * @return Whether the filter field is set.
   */
  boolean hasFilter();
  /**
   * <code>.chalk.expression.v1.LogicalExprNode filter = 4 [json_name = "filter"];</code>
   * @return The filter.
   */
  ai.chalk.protos.chalk.expression.v1.LogicalExprNode getFilter();
  /**
   * <code>.chalk.expression.v1.LogicalExprNode filter = 4 [json_name = "filter"];</code>
   */
  ai.chalk.protos.chalk.expression.v1.LogicalExprNodeOrBuilder getFilterOrBuilder();

  /**
   * <code>repeated .chalk.expression.v1.LogicalExprNode order_by = 5 [json_name = "orderBy"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.expression.v1.LogicalExprNode> 
      getOrderByList();
  /**
   * <code>repeated .chalk.expression.v1.LogicalExprNode order_by = 5 [json_name = "orderBy"];</code>
   */
  ai.chalk.protos.chalk.expression.v1.LogicalExprNode getOrderBy(int index);
  /**
   * <code>repeated .chalk.expression.v1.LogicalExprNode order_by = 5 [json_name = "orderBy"];</code>
   */
  int getOrderByCount();
  /**
   * <code>repeated .chalk.expression.v1.LogicalExprNode order_by = 5 [json_name = "orderBy"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.expression.v1.LogicalExprNodeOrBuilder> 
      getOrderByOrBuilderList();
  /**
   * <code>repeated .chalk.expression.v1.LogicalExprNode order_by = 5 [json_name = "orderBy"];</code>
   */
  ai.chalk.protos.chalk.expression.v1.LogicalExprNodeOrBuilder getOrderByOrBuilder(
      int index);
}
