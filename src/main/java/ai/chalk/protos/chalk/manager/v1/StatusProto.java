// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/manager/v1/status.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.manager.v1;

public final class StatusProto {
  private StatusProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_manager_v1_GetClusterMetricsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_manager_v1_GetClusterMetricsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_manager_v1_GetClusterMetricsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_manager_v1_GetClusterMetricsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035chalk/manager/v1/status.proto\022\020chalk.m" +
      "anager.v1\032\037chalk/auth/v1/permissions.pro" +
      "to\032 google/protobuf/field_mask.proto\"Q\n\030" +
      "GetClusterMetricsRequest\0225\n\010get_mask\030\001 \001" +
      "(\0132\032.google.protobuf.FieldMaskR\007getMask\"" +
      "\360\001\n\031GetClusterMetricsResponse\022\034\n\007metrics" +
      "\030\001 \001(\tB\002\030\001R\007metrics\022&\n\014cnpg_metrics\030\002 \001(" +
      "\tH\000R\013cnpgMetrics\210\001\001\022(\n\renvoy_metrics\030\003 \001" +
      "(\tH\001R\014envoyMetrics\210\001\001\022,\n\017kubelet_metrics" +
      "\030\004 \001(\tH\002R\016kubeletMetrics\210\001\001B\017\n\r_cnpg_met" +
      "ricsB\020\n\016_envoy_metricsB\022\n\020_kubelet_metri" +
      "cs2\205\001\n\rStatusService\022t\n\021GetClusterMetric" +
      "s\022*.chalk.manager.v1.GetClusterMetricsRe" +
      "quest\032+.chalk.manager.v1.GetClusterMetri" +
      "csResponse\"\006\220\002\001\200}\nB\247\001\n ai.chalk.protos.c" +
      "halk.manager.v1B\013StatusProtoP\001Z\024manager/" +
      "v1;managerv1\242\002\003CMX\252\002\020Chalk.Manager.V1\312\002\020" +
      "Chalk\\Manager\\V1\342\002\034Chalk\\Manager\\V1\\GPBM" +
      "etadata\352\002\022Chalk::Manager::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          ai.chalk.protos.chalk.auth.v1.PermissionsProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        });
    internal_static_chalk_manager_v1_GetClusterMetricsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_chalk_manager_v1_GetClusterMetricsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_manager_v1_GetClusterMetricsRequest_descriptor,
        new java.lang.String[] { "GetMask", });
    internal_static_chalk_manager_v1_GetClusterMetricsResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_chalk_manager_v1_GetClusterMetricsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_manager_v1_GetClusterMetricsResponse_descriptor,
        new java.lang.String[] { "Metrics", "CnpgMetrics", "EnvoyMetrics", "KubeletMetrics", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(ai.chalk.protos.chalk.auth.v1.PermissionsProto.permission);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    ai.chalk.protos.chalk.auth.v1.PermissionsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
