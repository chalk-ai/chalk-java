// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/kubernetes/v1/nodes.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.kubernetes.v1;

public final class NodesProto {
  private NodesProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_kubernetes_v1_KubernetesNodeData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_kubernetes_v1_KubernetesNodeData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_kubernetes_v1_KubernetesNodeData_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_kubernetes_v1_KubernetesNodeData_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_kubernetes_v1_KubernetesNodeData_AnnotationsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_kubernetes_v1_KubernetesNodeData_AnnotationsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037chalk/kubernetes/v1/nodes.proto\022\023chalk" +
      ".kubernetes.v1\"\300\007\n\022KubernetesNodeData\022\022\n" +
      "\004team\030\001 \001(\tR\004team\022\022\n\004name\030\002 \001(\tR\004name\022\020\n" +
      "\003uid\030\003 \001(\tR\003uid\022#\n\rinstance_type\030\004 \001(\tR\014" +
      "instanceType\022\026\n\006region\030\005 \001(\tR\006region\022\022\n\004" +
      "zone\030\006 \001(\tR\004zone\022-\n\022creation_timestamp\030\010" +
      " \001(\003R\021creationTimestamp\022-\n\022deletion_time" +
      "stamp\030\t \001(\003R\021deletionTimestamp\022-\n\022observ" +
      "ed_timestamp\030\n \001(\003R\021observedTimestamp\022K\n" +
      "\006labels\030\013 \003(\01323.chalk.kubernetes.v1.Kube" +
      "rnetesNodeData.LabelsEntryR\006labels\022Z\n\013an" +
      "notations\030\014 \003(\01328.chalk.kubernetes.v1.Ku" +
      "bernetesNodeData.AnnotationsEntryR\013annot" +
      "ations\022\035\n\nmachine_id\030\r \001(\tR\tmachineId\022\037\n" +
      "\013system_uuid\030\016 \001(\tR\nsystemUuid\022\027\n\007boot_i" +
      "d\030\017 \001(\tR\006bootId\022$\n\runschedulable\030\020 \001(\010R\r" +
      "unschedulable\022\034\n\tnamespace\030\021 \001(\tR\tnamesp" +
      "ace\022\037\n\013instance_id\030\022 \001(\tR\ninstanceId\022\030\n\007" +
      "cluster\030\023 \001(\tR\007cluster\022\033\n\ttotal_cpu\030\024 \001(" +
      "\tR\010totalCpu\022!\n\014total_memory\030\025 \001(\tR\013total" +
      "Memory\022\'\n\017allocatable_cpu\030\026 \001(\tR\016allocat" +
      "ableCpu\022-\n\022allocatable_memory\030\027 \001(\tR\021all" +
      "ocatableMemory\0329\n\013LabelsEntry\022\020\n\003key\030\001 \001" +
      "(\tR\003key\022\024\n\005value\030\002 \001(\tR\005value:\0028\001\032>\n\020Ann" +
      "otationsEntry\022\020\n\003key\030\001 \001(\tR\003key\022\024\n\005value" +
      "\030\002 \001(\tR\005value:\0028\001B\273\001\n#ai.chalk.protos.ch" +
      "alk.kubernetes.v1B\nNodesProtoP\001Z\032kuberne" +
      "tes/v1;kubernetesv1\242\002\003CKX\252\002\023Chalk.Kubern" +
      "etes.V1\312\002\023Chalk\\Kubernetes\\V1\342\002\037Chalk\\Ku" +
      "bernetes\\V1\\GPBMetadata\352\002\025Chalk::Kuberne" +
      "tes::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_chalk_kubernetes_v1_KubernetesNodeData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_chalk_kubernetes_v1_KubernetesNodeData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_kubernetes_v1_KubernetesNodeData_descriptor,
        new java.lang.String[] { "Team", "Name", "Uid", "InstanceType", "Region", "Zone", "CreationTimestamp", "DeletionTimestamp", "ObservedTimestamp", "Labels", "Annotations", "MachineId", "SystemUuid", "BootId", "Unschedulable", "Namespace", "InstanceId", "Cluster", "TotalCpu", "TotalMemory", "AllocatableCpu", "AllocatableMemory", });
    internal_static_chalk_kubernetes_v1_KubernetesNodeData_LabelsEntry_descriptor =
      internal_static_chalk_kubernetes_v1_KubernetesNodeData_descriptor.getNestedTypes().get(0);
    internal_static_chalk_kubernetes_v1_KubernetesNodeData_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_kubernetes_v1_KubernetesNodeData_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_chalk_kubernetes_v1_KubernetesNodeData_AnnotationsEntry_descriptor =
      internal_static_chalk_kubernetes_v1_KubernetesNodeData_descriptor.getNestedTypes().get(1);
    internal_static_chalk_kubernetes_v1_KubernetesNodeData_AnnotationsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_kubernetes_v1_KubernetesNodeData_AnnotationsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}