// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/expression/v1/expression.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.expression.v1;

public interface GroupingSetNodeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.expression.v1.GroupingSetNode)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .chalk.expression.v1.LogicalExprList expr = 1 [json_name = "expr"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.expression.v1.LogicalExprList> 
      getExprList();
  /**
   * <code>repeated .chalk.expression.v1.LogicalExprList expr = 1 [json_name = "expr"];</code>
   */
  ai.chalk.protos.chalk.expression.v1.LogicalExprList getExpr(int index);
  /**
   * <code>repeated .chalk.expression.v1.LogicalExprList expr = 1 [json_name = "expr"];</code>
   */
  int getExprCount();
  /**
   * <code>repeated .chalk.expression.v1.LogicalExprList expr = 1 [json_name = "expr"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.expression.v1.LogicalExprListOrBuilder> 
      getExprOrBuilderList();
  /**
   * <code>repeated .chalk.expression.v1.LogicalExprList expr = 1 [json_name = "expr"];</code>
   */
  ai.chalk.protos.chalk.expression.v1.LogicalExprListOrBuilder getExprOrBuilder(
      int index);
}
