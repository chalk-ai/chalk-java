// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/common/v1/offline_query.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.chalk.common.v1;

public interface OfflineQueryInputsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.common.v1.OfflineQueryInputs)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * *
   * Should be a feather-compressed table, complete with schema
   * </pre>
   *
   * <code>bytes feather_inputs = 1 [json_name = "featherInputs"];</code>
   * @return Whether the featherInputs field is set.
   */
  boolean hasFeatherInputs();
  /**
   * <pre>
   * *
   * Should be a feather-compressed table, complete with schema
   * </pre>
   *
   * <code>bytes feather_inputs = 1 [json_name = "featherInputs"];</code>
   * @return The featherInputs.
   */
  com.google.protobuf.ByteString getFeatherInputs();

  /**
   * <code>.chalk.common.v1.OfflineQueryInputs.NoInputs no_inputs = 2 [json_name = "noInputs"];</code>
   * @return Whether the noInputs field is set.
   */
  boolean hasNoInputs();
  /**
   * <code>.chalk.common.v1.OfflineQueryInputs.NoInputs no_inputs = 2 [json_name = "noInputs"];</code>
   * @return The noInputs.
   */
  ai.chalk.protos.chalk.common.v1.OfflineQueryInputs.NoInputs getNoInputs();
  /**
   * <code>.chalk.common.v1.OfflineQueryInputs.NoInputs no_inputs = 2 [json_name = "noInputs"];</code>
   */
  ai.chalk.protos.chalk.common.v1.OfflineQueryInputs.NoInputsOrBuilder getNoInputsOrBuilder();

  ai.chalk.protos.chalk.common.v1.OfflineQueryInputs.ImplCase getImplCase();
}
