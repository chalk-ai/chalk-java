// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/graph/v1/sources.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.chalk.graph.v1;

public interface KafkaSourceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.graph.v1.KafkaSource)
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
   * <code>repeated string bootstrap_servers = 2 [json_name = "bootstrapServers"];</code>
   * @return A list containing the bootstrapServers.
   */
  java.util.List<java.lang.String>
      getBootstrapServersList();
  /**
   * <code>repeated string bootstrap_servers = 2 [json_name = "bootstrapServers"];</code>
   * @return The count of bootstrapServers.
   */
  int getBootstrapServersCount();
  /**
   * <code>repeated string bootstrap_servers = 2 [json_name = "bootstrapServers"];</code>
   * @param index The index of the element to return.
   * @return The bootstrapServers at the given index.
   */
  java.lang.String getBootstrapServers(int index);
  /**
   * <code>repeated string bootstrap_servers = 2 [json_name = "bootstrapServers"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the bootstrapServers at the given index.
   */
  com.google.protobuf.ByteString
      getBootstrapServersBytes(int index);

  /**
   * <code>string topic = 3 [json_name = "topic"];</code>
   * @return The topic.
   */
  java.lang.String getTopic();
  /**
   * <code>string topic = 3 [json_name = "topic"];</code>
   * @return The bytes for topic.
   */
  com.google.protobuf.ByteString
      getTopicBytes();

  /**
   * <code>string ssl_keystore_location = 4 [json_name = "sslKeystoreLocation"];</code>
   * @return The sslKeystoreLocation.
   */
  java.lang.String getSslKeystoreLocation();
  /**
   * <code>string ssl_keystore_location = 4 [json_name = "sslKeystoreLocation"];</code>
   * @return The bytes for sslKeystoreLocation.
   */
  com.google.protobuf.ByteString
      getSslKeystoreLocationBytes();

  /**
   * <code>string ssl_ca_file = 5 [json_name = "sslCaFile"];</code>
   * @return The sslCaFile.
   */
  java.lang.String getSslCaFile();
  /**
   * <code>string ssl_ca_file = 5 [json_name = "sslCaFile"];</code>
   * @return The bytes for sslCaFile.
   */
  com.google.protobuf.ByteString
      getSslCaFileBytes();

  /**
   * <code>string client_id_prefix = 6 [json_name = "clientIdPrefix"];</code>
   * @return The clientIdPrefix.
   */
  java.lang.String getClientIdPrefix();
  /**
   * <code>string client_id_prefix = 6 [json_name = "clientIdPrefix"];</code>
   * @return The bytes for clientIdPrefix.
   */
  com.google.protobuf.ByteString
      getClientIdPrefixBytes();

  /**
   * <code>string group_id_prefix = 7 [json_name = "groupIdPrefix"];</code>
   * @return The groupIdPrefix.
   */
  java.lang.String getGroupIdPrefix();
  /**
   * <code>string group_id_prefix = 7 [json_name = "groupIdPrefix"];</code>
   * @return The bytes for groupIdPrefix.
   */
  com.google.protobuf.ByteString
      getGroupIdPrefixBytes();

  /**
   * <code>string security_protocol = 8 [json_name = "securityProtocol"];</code>
   * @return The securityProtocol.
   */
  java.lang.String getSecurityProtocol();
  /**
   * <code>string security_protocol = 8 [json_name = "securityProtocol"];</code>
   * @return The bytes for securityProtocol.
   */
  com.google.protobuf.ByteString
      getSecurityProtocolBytes();

  /**
   * <code>string sasl_mechanism = 9 [json_name = "saslMechanism"];</code>
   * @return The saslMechanism.
   */
  java.lang.String getSaslMechanism();
  /**
   * <code>string sasl_mechanism = 9 [json_name = "saslMechanism"];</code>
   * @return The bytes for saslMechanism.
   */
  com.google.protobuf.ByteString
      getSaslMechanismBytes();

  /**
   * <code>string sasl_username = 10 [json_name = "saslUsername"];</code>
   * @return The saslUsername.
   */
  java.lang.String getSaslUsername();
  /**
   * <code>string sasl_username = 10 [json_name = "saslUsername"];</code>
   * @return The bytes for saslUsername.
   */
  com.google.protobuf.ByteString
      getSaslUsernameBytes();

  /**
   * <code>string sasl_password = 11 [json_name = "saslPassword"];</code>
   * @return The saslPassword.
   */
  java.lang.String getSaslPassword();
  /**
   * <code>string sasl_password = 11 [json_name = "saslPassword"];</code>
   * @return The bytes for saslPassword.
   */
  com.google.protobuf.ByteString
      getSaslPasswordBytes();

  /**
   * <code>.google.protobuf.Duration late_arrival_deadline = 12 [json_name = "lateArrivalDeadline"];</code>
   * @return Whether the lateArrivalDeadline field is set.
   */
  boolean hasLateArrivalDeadline();
  /**
   * <code>.google.protobuf.Duration late_arrival_deadline = 12 [json_name = "lateArrivalDeadline"];</code>
   * @return The lateArrivalDeadline.
   */
  com.google.protobuf.Duration getLateArrivalDeadline();
  /**
   * <code>.google.protobuf.Duration late_arrival_deadline = 12 [json_name = "lateArrivalDeadline"];</code>
   */
  com.google.protobuf.DurationOrBuilder getLateArrivalDeadlineOrBuilder();

  /**
   * <code>string dead_letter_queue_topic = 13 [json_name = "deadLetterQueueTopic"];</code>
   * @return The deadLetterQueueTopic.
   */
  java.lang.String getDeadLetterQueueTopic();
  /**
   * <code>string dead_letter_queue_topic = 13 [json_name = "deadLetterQueueTopic"];</code>
   * @return The bytes for deadLetterQueueTopic.
   */
  com.google.protobuf.ByteString
      getDeadLetterQueueTopicBytes();
}