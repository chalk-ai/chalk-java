// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/billing.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

public interface GetNodesAndPodsUIRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.GetNodesAndPodsUIRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string namespace = 1 [json_name = "namespace"];</code>
   * @return Whether the namespace field is set.
   */
  boolean hasNamespace();
  /**
   * <code>optional string namespace = 1 [json_name = "namespace"];</code>
   * @return The namespace.
   */
  java.lang.String getNamespace();
  /**
   * <code>optional string namespace = 1 [json_name = "namespace"];</code>
   * @return The bytes for namespace.
   */
  com.google.protobuf.ByteString
      getNamespaceBytes();

  /**
   * <code>optional string pod_label_selector = 2 [json_name = "podLabelSelector"];</code>
   * @return Whether the podLabelSelector field is set.
   */
  boolean hasPodLabelSelector();
  /**
   * <code>optional string pod_label_selector = 2 [json_name = "podLabelSelector"];</code>
   * @return The podLabelSelector.
   */
  java.lang.String getPodLabelSelector();
  /**
   * <code>optional string pod_label_selector = 2 [json_name = "podLabelSelector"];</code>
   * @return The bytes for podLabelSelector.
   */
  com.google.protobuf.ByteString
      getPodLabelSelectorBytes();

  /**
   * <code>optional string environment_id = 3 [json_name = "environmentId"];</code>
   * @return Whether the environmentId field is set.
   */
  boolean hasEnvironmentId();
  /**
   * <code>optional string environment_id = 3 [json_name = "environmentId"];</code>
   * @return The environmentId.
   */
  java.lang.String getEnvironmentId();
  /**
   * <code>optional string environment_id = 3 [json_name = "environmentId"];</code>
   * @return The bytes for environmentId.
   */
  com.google.protobuf.ByteString
      getEnvironmentIdBytes();
}
