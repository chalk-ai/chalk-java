// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/lsp/v1/lsp.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.lsp.v1;

public interface RangeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.lsp.v1.Range)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.chalk.lsp.v1.Position start = 1 [json_name = "start"];</code>
   * @return Whether the start field is set.
   */
  boolean hasStart();
  /**
   * <code>.chalk.lsp.v1.Position start = 1 [json_name = "start"];</code>
   * @return The start.
   */
  ai.chalk.protos.chalk.lsp.v1.Position getStart();
  /**
   * <code>.chalk.lsp.v1.Position start = 1 [json_name = "start"];</code>
   */
  ai.chalk.protos.chalk.lsp.v1.PositionOrBuilder getStartOrBuilder();

  /**
   * <code>.chalk.lsp.v1.Position end = 2 [json_name = "end"];</code>
   * @return Whether the end field is set.
   */
  boolean hasEnd();
  /**
   * <code>.chalk.lsp.v1.Position end = 2 [json_name = "end"];</code>
   * @return The end.
   */
  ai.chalk.protos.chalk.lsp.v1.Position getEnd();
  /**
   * <code>.chalk.lsp.v1.Position end = 2 [json_name = "end"];</code>
   */
  ai.chalk.protos.chalk.lsp.v1.PositionOrBuilder getEndOrBuilder();
}
