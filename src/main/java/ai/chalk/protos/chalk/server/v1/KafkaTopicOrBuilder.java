// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/builder.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

public interface KafkaTopicOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.KafkaTopic)
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
   * <code>int32 partitions = 2 [json_name = "partitions"];</code>
   * @return The partitions.
   */
  int getPartitions();

  /**
   * <code>optional int32 replication = 3 [json_name = "replication"];</code>
   * @return Whether the replication field is set.
   */
  boolean hasReplication();
  /**
   * <code>optional int32 replication = 3 [json_name = "replication"];</code>
   * @return The replication.
   */
  int getReplication();

  /**
   * <code>int32 retention_ms = 4 [json_name = "retentionMs"];</code>
   * @return The retentionMs.
   */
  int getRetentionMs();
}
