// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/expression/v1/expression.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.expression.v1;

public interface WindowExprNodeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.expression.v1.WindowExprNode)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.chalk.expression.v1.AggregateFunction aggr_function = 1 [json_name = "aggrFunction"];</code>
   * @return Whether the aggrFunction field is set.
   */
  boolean hasAggrFunction();
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
   * <code>.chalk.expression.v1.BuiltInWindowFunction built_in_function = 2 [json_name = "builtInFunction"];</code>
   * @return Whether the builtInFunction field is set.
   */
  boolean hasBuiltInFunction();
  /**
   * <code>.chalk.expression.v1.BuiltInWindowFunction built_in_function = 2 [json_name = "builtInFunction"];</code>
   * @return The enum numeric value on the wire for builtInFunction.
   */
  int getBuiltInFunctionValue();
  /**
   * <code>.chalk.expression.v1.BuiltInWindowFunction built_in_function = 2 [json_name = "builtInFunction"];</code>
   * @return The builtInFunction.
   */
  ai.chalk.protos.chalk.expression.v1.BuiltInWindowFunction getBuiltInFunction();

  /**
   * <code>string udaf = 3 [json_name = "udaf"];</code>
   * @return Whether the udaf field is set.
   */
  boolean hasUdaf();
  /**
   * <code>string udaf = 3 [json_name = "udaf"];</code>
   * @return The udaf.
   */
  java.lang.String getUdaf();
  /**
   * <code>string udaf = 3 [json_name = "udaf"];</code>
   * @return The bytes for udaf.
   */
  com.google.protobuf.ByteString
      getUdafBytes();

  /**
   * <code>string udwf = 9 [json_name = "udwf"];</code>
   * @return Whether the udwf field is set.
   */
  boolean hasUdwf();
  /**
   * <code>string udwf = 9 [json_name = "udwf"];</code>
   * @return The udwf.
   */
  java.lang.String getUdwf();
  /**
   * <code>string udwf = 9 [json_name = "udwf"];</code>
   * @return The bytes for udwf.
   */
  com.google.protobuf.ByteString
      getUdwfBytes();

  /**
   * <code>.chalk.expression.v1.LogicalExprNode expr = 4 [json_name = "expr"];</code>
   * @return Whether the expr field is set.
   */
  boolean hasExpr();
  /**
   * <code>.chalk.expression.v1.LogicalExprNode expr = 4 [json_name = "expr"];</code>
   * @return The expr.
   */
  ai.chalk.protos.chalk.expression.v1.LogicalExprNode getExpr();
  /**
   * <code>.chalk.expression.v1.LogicalExprNode expr = 4 [json_name = "expr"];</code>
   */
  ai.chalk.protos.chalk.expression.v1.LogicalExprNodeOrBuilder getExprOrBuilder();

  /**
   * <code>repeated .chalk.expression.v1.LogicalExprNode partition_by = 5 [json_name = "partitionBy"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.expression.v1.LogicalExprNode> 
      getPartitionByList();
  /**
   * <code>repeated .chalk.expression.v1.LogicalExprNode partition_by = 5 [json_name = "partitionBy"];</code>
   */
  ai.chalk.protos.chalk.expression.v1.LogicalExprNode getPartitionBy(int index);
  /**
   * <code>repeated .chalk.expression.v1.LogicalExprNode partition_by = 5 [json_name = "partitionBy"];</code>
   */
  int getPartitionByCount();
  /**
   * <code>repeated .chalk.expression.v1.LogicalExprNode partition_by = 5 [json_name = "partitionBy"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.expression.v1.LogicalExprNodeOrBuilder> 
      getPartitionByOrBuilderList();
  /**
   * <code>repeated .chalk.expression.v1.LogicalExprNode partition_by = 5 [json_name = "partitionBy"];</code>
   */
  ai.chalk.protos.chalk.expression.v1.LogicalExprNodeOrBuilder getPartitionByOrBuilder(
      int index);

  /**
   * <code>repeated .chalk.expression.v1.LogicalExprNode order_by = 6 [json_name = "orderBy"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.expression.v1.LogicalExprNode> 
      getOrderByList();
  /**
   * <code>repeated .chalk.expression.v1.LogicalExprNode order_by = 6 [json_name = "orderBy"];</code>
   */
  ai.chalk.protos.chalk.expression.v1.LogicalExprNode getOrderBy(int index);
  /**
   * <code>repeated .chalk.expression.v1.LogicalExprNode order_by = 6 [json_name = "orderBy"];</code>
   */
  int getOrderByCount();
  /**
   * <code>repeated .chalk.expression.v1.LogicalExprNode order_by = 6 [json_name = "orderBy"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.expression.v1.LogicalExprNodeOrBuilder> 
      getOrderByOrBuilderList();
  /**
   * <code>repeated .chalk.expression.v1.LogicalExprNode order_by = 6 [json_name = "orderBy"];</code>
   */
  ai.chalk.protos.chalk.expression.v1.LogicalExprNodeOrBuilder getOrderByOrBuilder(
      int index);

  /**
   * <pre>
   * repeated LogicalExprNode filter = 7;
   * </pre>
   *
   * <code>.chalk.expression.v1.WindowFrame window_frame = 8 [json_name = "windowFrame"];</code>
   * @return Whether the windowFrame field is set.
   */
  boolean hasWindowFrame();
  /**
   * <pre>
   * repeated LogicalExprNode filter = 7;
   * </pre>
   *
   * <code>.chalk.expression.v1.WindowFrame window_frame = 8 [json_name = "windowFrame"];</code>
   * @return The windowFrame.
   */
  ai.chalk.protos.chalk.expression.v1.WindowFrame getWindowFrame();
  /**
   * <pre>
   * repeated LogicalExprNode filter = 7;
   * </pre>
   *
   * <code>.chalk.expression.v1.WindowFrame window_frame = 8 [json_name = "windowFrame"];</code>
   */
  ai.chalk.protos.chalk.expression.v1.WindowFrameOrBuilder getWindowFrameOrBuilder();

  ai.chalk.protos.chalk.expression.v1.WindowExprNode.WindowFunctionCase getWindowFunctionCase();
}
