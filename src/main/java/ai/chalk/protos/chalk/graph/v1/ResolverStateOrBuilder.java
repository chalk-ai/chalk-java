// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/graph/v1/graph.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.chalk.graph.v1;

public interface ResolverStateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.graph.v1.ResolverState)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.chalk.arrow.v1.ScalarValue initial = 1 [json_name = "initial"];</code>
   * @return Whether the initial field is set.
   */
  boolean hasInitial();
  /**
   * <code>.chalk.arrow.v1.ScalarValue initial = 1 [json_name = "initial"];</code>
   * @return The initial.
   */
  ai.chalk.protos.chalk.arrow.v1.ScalarValue getInitial();
  /**
   * <code>.chalk.arrow.v1.ScalarValue initial = 1 [json_name = "initial"];</code>
   */
  ai.chalk.protos.chalk.arrow.v1.ScalarValueOrBuilder getInitialOrBuilder();

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
