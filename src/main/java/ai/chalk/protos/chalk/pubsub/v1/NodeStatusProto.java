// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/pubsub/v1/node_status.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.pubsub.v1;

public final class NodeStatusProto {
  private NodeStatusProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_pubsub_v1_NodeStatusPubSub_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_pubsub_v1_NodeStatusPubSub_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_pubsub_v1_NodeStatusPubSub_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_pubsub_v1_NodeStatusPubSub_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_pubsub_v1_NodeStatusPubSub_AnnotationsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_pubsub_v1_NodeStatusPubSub_AnnotationsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!chalk/pubsub/v1/node_status.proto\022\017cha" +
      "lk.pubsub.v1\032\034gen_bq_schema/bq_field.pro" +
      "to\032\034gen_bq_schema/bq_table.proto\"\231\010\n\020Nod" +
      "eStatusPubSub\022\022\n\004team\030\001 \001(\tR\004team\022\022\n\004nam" +
      "e\030\002 \001(\tR\004name\022\020\n\003uid\030\003 \001(\tR\003uid\022#\n\rinsta" +
      "nce_type\030\004 \001(\tR\014instanceType\022\026\n\006region\030\005" +
      " \001(\tR\006region\022\022\n\004zone\030\006 \001(\tR\004zone\022=\n\022crea" +
      "tion_timestamp\030\010 \001(\003B\016\352?\013\022\tTIMESTAMPR\021cr" +
      "eationTimestamp\022=\n\022deletion_timestamp\030\t " +
      "\001(\003B\016\352?\013\022\tTIMESTAMPR\021deletionTimestamp\022=" +
      "\n\022observed_timestamp\030\n \001(\003B\016\352?\013\022\tTIMESTA" +
      "MPR\021observedTimestamp\022E\n\006labels\030\013 \003(\0132-." +
      "chalk.pubsub.v1.NodeStatusPubSub.LabelsE" +
      "ntryR\006labels\022T\n\013annotations\030\014 \003(\01322.chal" +
      "k.pubsub.v1.NodeStatusPubSub.Annotations" +
      "EntryR\013annotations\022\035\n\nmachine_id\030\r \001(\tR\t" +
      "machineId\022\037\n\013system_uuid\030\016 \001(\tR\nsystemUu" +
      "id\022\027\n\007boot_id\030\017 \001(\tR\006bootId\022$\n\runschedul" +
      "able\030\020 \001(\010R\runschedulable\022\034\n\tnamespace\030\021" +
      " \001(\tR\tnamespace\022\037\n\013instance_id\030\022 \001(\tR\nin" +
      "stanceId\022\030\n\007cluster\030\023 \001(\tR\007cluster\022\033\n\tto" +
      "tal_cpu\030\024 \001(\tR\010totalCpu\022!\n\014total_memory\030" +
      "\025 \001(\tR\013totalMemory\022\'\n\017allocatable_cpu\030\026 " +
      "\001(\tR\016allocatableCpu\022-\n\022allocatable_memor" +
      "y\030\027 \001(\tR\021allocatableMemory\022#\n\rchalk_mana" +
      "ged\030\030 \001(\010R\014chalkManaged\0329\n\013LabelsEntry\022\020" +
      "\n\003key\030\001 \001(\tR\003key\022\024\n\005value\030\002 \001(\tR\005value:\002" +
      "8\001\032>\n\020AnnotationsEntry\022\020\n\003key\030\001 \001(\tR\003key" +
      "\022\024\n\005value\030\002 \001(\tR\005value:\0028\001:\020\352?\r\n\013node_st" +
      "atusB\244\001\n\037ai.chalk.protos.chalk.pubsub.v1" +
      "B\017NodeStatusProtoP\001Z\022pubsub/v1;pubsubv1\242" +
      "\002\003CPX\252\002\017Chalk.Pubsub.V1\312\002\017Chalk\\Pubsub\\V" +
      "1\342\002\033Chalk\\Pubsub\\V1\\GPBMetadata\352\002\021Chalk:" +
      ":Pubsub::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          ai.chalk.protos.gen_bq_schema.BqFieldProto.getDescriptor(),
          ai.chalk.protos.gen_bq_schema.BqTableProto.getDescriptor(),
        });
    internal_static_chalk_pubsub_v1_NodeStatusPubSub_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_chalk_pubsub_v1_NodeStatusPubSub_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_pubsub_v1_NodeStatusPubSub_descriptor,
        new java.lang.String[] { "Team", "Name", "Uid", "InstanceType", "Region", "Zone", "CreationTimestamp", "DeletionTimestamp", "ObservedTimestamp", "Labels", "Annotations", "MachineId", "SystemUuid", "BootId", "Unschedulable", "Namespace", "InstanceId", "Cluster", "TotalCpu", "TotalMemory", "AllocatableCpu", "AllocatableMemory", "ChalkManaged", });
    internal_static_chalk_pubsub_v1_NodeStatusPubSub_LabelsEntry_descriptor =
      internal_static_chalk_pubsub_v1_NodeStatusPubSub_descriptor.getNestedTypes().get(0);
    internal_static_chalk_pubsub_v1_NodeStatusPubSub_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_pubsub_v1_NodeStatusPubSub_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_chalk_pubsub_v1_NodeStatusPubSub_AnnotationsEntry_descriptor =
      internal_static_chalk_pubsub_v1_NodeStatusPubSub_descriptor.getNestedTypes().get(1);
    internal_static_chalk_pubsub_v1_NodeStatusPubSub_AnnotationsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_pubsub_v1_NodeStatusPubSub_AnnotationsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(ai.chalk.protos.gen_bq_schema.BqFieldProto.bigquery);
    registry.add(ai.chalk.protos.gen_bq_schema.BqTableProto.bigqueryOpts);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    ai.chalk.protos.gen_bq_schema.BqFieldProto.getDescriptor();
    ai.chalk.protos.gen_bq_schema.BqTableProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
