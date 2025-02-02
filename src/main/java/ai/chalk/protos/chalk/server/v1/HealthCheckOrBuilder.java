// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/status.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

public interface HealthCheckOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.HealthCheck)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.chalk.server.v1.HealthCheckStatus status = 2 [json_name = "status"];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.chalk.server.v1.HealthCheckStatus status = 2 [json_name = "status"];</code>
   * @return The status.
   */
  ai.chalk.protos.chalk.server.v1.HealthCheckStatus getStatus();

  /**
   * <code>optional string message = 3 [json_name = "message"];</code>
   * @return Whether the message field is set.
   */
  boolean hasMessage();
  /**
   * <code>optional string message = 3 [json_name = "message"];</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <code>optional string message = 3 [json_name = "message"];</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <code>optional .google.protobuf.Duration latency = 4 [json_name = "latency"];</code>
   * @return Whether the latency field is set.
   */
  boolean hasLatency();
  /**
   * <code>optional .google.protobuf.Duration latency = 4 [json_name = "latency"];</code>
   * @return The latency.
   */
  com.google.protobuf.Duration getLatency();
  /**
   * <code>optional .google.protobuf.Duration latency = 4 [json_name = "latency"];</code>
   */
  com.google.protobuf.DurationOrBuilder getLatencyOrBuilder();

  /**
   * <code>optional .google.protobuf.Struct kube_data = 5 [json_name = "kubeData"];</code>
   * @return Whether the kubeData field is set.
   */
  boolean hasKubeData();
  /**
   * <code>optional .google.protobuf.Struct kube_data = 5 [json_name = "kubeData"];</code>
   * @return The kubeData.
   */
  com.google.protobuf.Struct getKubeData();
  /**
   * <code>optional .google.protobuf.Struct kube_data = 5 [json_name = "kubeData"];</code>
   */
  com.google.protobuf.StructOrBuilder getKubeDataOrBuilder();

  /**
   * <code>map&lt;string, string&gt; metadata = 6 [json_name = "metadata"];</code>
   */
  int getMetadataCount();
  /**
   * <code>map&lt;string, string&gt; metadata = 6 [json_name = "metadata"];</code>
   */
  boolean containsMetadata(
      java.lang.String key);
  /**
   * Use {@link #getMetadataMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getMetadata();
  /**
   * <code>map&lt;string, string&gt; metadata = 6 [json_name = "metadata"];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getMetadataMap();
  /**
   * <code>map&lt;string, string&gt; metadata = 6 [json_name = "metadata"];</code>
   */
  /* nullable */
java.lang.String getMetadataOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; metadata = 6 [json_name = "metadata"];</code>
   */
  java.lang.String getMetadataOrThrow(
      java.lang.String key);
}
