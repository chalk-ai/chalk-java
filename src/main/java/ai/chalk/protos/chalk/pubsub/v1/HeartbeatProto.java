// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/pubsub/v1/heartbeat.proto
// Protobuf Java Version: 4.26.1

package ai.chalk.protos.chalk.pubsub.v1;

public final class HeartbeatProto {
  private HeartbeatProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      HeartbeatProto.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_pubsub_v1_HeartbeatPubSub_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chalk_pubsub_v1_HeartbeatPubSub_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037chalk/pubsub/v1/heartbeat.proto\022\017chalk" +
      ".pubsub.v1\032\037google/protobuf/timestamp.pr" +
      "oto\"\263\002\n\017HeartbeatPubSub\022!\n\014operation_id\030" +
      "\001 \001(\tR\013operationId\022\035\n\nproject_id\030\002 \001(\tR\t" +
      "projectId\022%\n\016environment_id\030\003 \001(\tR\renvir" +
      "onmentId\022\027\n\007team_id\030\004 \001(\tR\006teamId\022#\n\rdep" +
      "loyment_id\030\005 \001(\tR\014deploymentId\022=\n\014genera" +
      "ted_at\030\006 \001(\0132\032.google.protobuf.Timestamp" +
      "R\013generatedAt\022\037\n\013computer_id\030\007 \001(\rR\ncomp" +
      "uterId\022\031\n\010shard_id\030\010 \001(\rR\007shardIdB\243\001\n\037ai" +
      ".chalk.protos.chalk.pubsub.v1B\016Heartbeat" +
      "ProtoP\001Z\022pubsub/v1;pubsubv1\242\002\003CPX\252\002\017Chal" +
      "k.Pubsub.V1\312\002\017Chalk\\Pubsub\\V1\342\002\033Chalk\\Pu" +
      "bsub\\V1\\GPBMetadata\352\002\021Chalk::Pubsub::V1b" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_chalk_pubsub_v1_HeartbeatPubSub_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_chalk_pubsub_v1_HeartbeatPubSub_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chalk_pubsub_v1_HeartbeatPubSub_descriptor,
        new java.lang.String[] { "OperationId", "ProjectId", "EnvironmentId", "TeamId", "DeploymentId", "GeneratedAt", "ComputerId", "ShardId", });
    descriptor.resolveAllFeaturesImmutable();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
