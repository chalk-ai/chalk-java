// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/expression/v1/expression.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.expression.v1;

public interface WindowFrameOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.expression.v1.WindowFrame)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.chalk.expression.v1.WindowFrameUnits window_frame_units = 1 [json_name = "windowFrameUnits"];</code>
   * @return The enum numeric value on the wire for windowFrameUnits.
   */
  int getWindowFrameUnitsValue();
  /**
   * <code>.chalk.expression.v1.WindowFrameUnits window_frame_units = 1 [json_name = "windowFrameUnits"];</code>
   * @return The windowFrameUnits.
   */
  ai.chalk.protos.chalk.expression.v1.WindowFrameUnits getWindowFrameUnits();

  /**
   * <code>.chalk.expression.v1.WindowFrameBound start_bound = 2 [json_name = "startBound"];</code>
   * @return Whether the startBound field is set.
   */
  boolean hasStartBound();
  /**
   * <code>.chalk.expression.v1.WindowFrameBound start_bound = 2 [json_name = "startBound"];</code>
   * @return The startBound.
   */
  ai.chalk.protos.chalk.expression.v1.WindowFrameBound getStartBound();
  /**
   * <code>.chalk.expression.v1.WindowFrameBound start_bound = 2 [json_name = "startBound"];</code>
   */
  ai.chalk.protos.chalk.expression.v1.WindowFrameBoundOrBuilder getStartBoundOrBuilder();

  /**
   * <code>optional .chalk.expression.v1.WindowFrameBound bound = 3 [json_name = "bound"];</code>
   * @return Whether the bound field is set.
   */
  boolean hasBound();
  /**
   * <code>optional .chalk.expression.v1.WindowFrameBound bound = 3 [json_name = "bound"];</code>
   * @return The bound.
   */
  ai.chalk.protos.chalk.expression.v1.WindowFrameBound getBound();
  /**
   * <code>optional .chalk.expression.v1.WindowFrameBound bound = 3 [json_name = "bound"];</code>
   */
  ai.chalk.protos.chalk.expression.v1.WindowFrameBoundOrBuilder getBoundOrBuilder();
}
