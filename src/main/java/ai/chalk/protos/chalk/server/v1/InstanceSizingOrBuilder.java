// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/deployment.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

public interface InstanceSizingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.InstanceSizing)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional uint32 min_instances = 1 [json_name = "minInstances"];</code>
   * @return Whether the minInstances field is set.
   */
  boolean hasMinInstances();
  /**
   * <code>optional uint32 min_instances = 1 [json_name = "minInstances"];</code>
   * @return The minInstances.
   */
  int getMinInstances();

  /**
   * <code>optional uint32 max_instances = 2 [json_name = "maxInstances"];</code>
   * @return Whether the maxInstances field is set.
   */
  boolean hasMaxInstances();
  /**
   * <code>optional uint32 max_instances = 2 [json_name = "maxInstances"];</code>
   * @return The maxInstances.
   */
  int getMaxInstances();
}
