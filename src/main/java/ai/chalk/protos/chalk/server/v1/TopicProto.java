// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/topic.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

public final class TopicProto {
  private TopicProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_SQSTopic_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_SQSTopic_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_PubSubTopic_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_PubSubTopic_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_Topic_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_Topic_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033chalk/server/v1/topic.proto\022\017chalk.ser" +
      "ver.v1\"\'\n\010SQSTopic\022\033\n\tqueue_url\030\001 \001(\tR\010q" +
      "ueueUrl\"G\n\013PubSubTopic\022\035\n\nproject_id\030\001 \001" +
      "(\tR\tprojectId\022\031\n\010topic_id\030\002 \001(\tR\007topicId" +
      "\"\215\001\n\005Topic\0228\n\tsqs_topic\030\001 \001(\0132\031.chalk.se" +
      "rver.v1.SQSTopicH\000R\010sqsTopic\022A\n\014pubsub_t" +
      "opic\030\002 \001(\0132\034.chalk.server.v1.PubSubTopic" +
      "H\000R\013pubsubTopicB\007\n\005topicB\237\001\n\037ai.chalk.pr" +
      "otos.chalk.server.v1B\nTopicProtoP\001Z\022serv" +
      "er/v1;serverv1\242\002\003CSX\252\002\017Chalk.Server.V1\312\002" +
      "\017Chalk\\Server\\V1\342\002\033Chalk\\Server\\V1\\GPBMe" +
      "tadata\352\002\021Chalk::Server::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_chalk_server_v1_SQSTopic_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_chalk_server_v1_SQSTopic_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_SQSTopic_descriptor,
        new java.lang.String[] { "QueueUrl", });
    internal_static_chalk_server_v1_PubSubTopic_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_chalk_server_v1_PubSubTopic_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_PubSubTopic_descriptor,
        new java.lang.String[] { "ProjectId", "TopicId", });
    internal_static_chalk_server_v1_Topic_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_chalk_server_v1_Topic_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_Topic_descriptor,
        new java.lang.String[] { "SqsTopic", "PubsubTopic", "Topic", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
