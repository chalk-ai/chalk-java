// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/topic.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

public interface TopicOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.Topic)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.chalk.server.v1.SQSTopic sqs_topic = 1 [json_name = "sqsTopic"];</code>
   * @return Whether the sqsTopic field is set.
   */
  boolean hasSqsTopic();
  /**
   * <code>.chalk.server.v1.SQSTopic sqs_topic = 1 [json_name = "sqsTopic"];</code>
   * @return The sqsTopic.
   */
  ai.chalk.protos.chalk.server.v1.SQSTopic getSqsTopic();
  /**
   * <code>.chalk.server.v1.SQSTopic sqs_topic = 1 [json_name = "sqsTopic"];</code>
   */
  ai.chalk.protos.chalk.server.v1.SQSTopicOrBuilder getSqsTopicOrBuilder();

  /**
   * <code>.chalk.server.v1.PubSubTopic pubsub_topic = 2 [json_name = "pubsubTopic"];</code>
   * @return Whether the pubsubTopic field is set.
   */
  boolean hasPubsubTopic();
  /**
   * <code>.chalk.server.v1.PubSubTopic pubsub_topic = 2 [json_name = "pubsubTopic"];</code>
   * @return The pubsubTopic.
   */
  ai.chalk.protos.chalk.server.v1.PubSubTopic getPubsubTopic();
  /**
   * <code>.chalk.server.v1.PubSubTopic pubsub_topic = 2 [json_name = "pubsubTopic"];</code>
   */
  ai.chalk.protos.chalk.server.v1.PubSubTopicOrBuilder getPubsubTopicOrBuilder();

  ai.chalk.protos.chalk.server.v1.Topic.TopicCase getTopicCase();
}
