// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/billing.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

public final class BillingProto {
  private BillingProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_GetUsageChartRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_GetUsageChartRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_GetUsageChartResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_GetUsageChartResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_GetUtilizationRatesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_GetUtilizationRatesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_GetUtilizationRatesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_GetUtilizationRatesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_GetNodesAndPodsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_GetNodesAndPodsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_GetNodesAndPodsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_GetNodesAndPodsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_GetNodesAndPodsUIRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_GetNodesAndPodsUIRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_GetNodesAndPodsUIResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_GetNodesAndPodsUIResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035chalk/server/v1/billing.proto\022\017chalk.s" +
      "erver.v1\032\037chalk/auth/v1/permissions.prot" +
      "o\032\037chalk/kubernetes/v1/nodes.proto\032\036chal" +
      "k/kubernetes/v1/pods.proto\032!chalk/pubsub" +
      "/v1/node_status.proto\032 chalk/pubsub/v1/p" +
      "od_status.proto\032\033chalk/server/v1/chart.p" +
      "roto\032!chalk/server/v1/pod_request.proto\032" +
      "\031chalk/usage/v1/rate.proto\"\210\002\n\024GetUsageC" +
      "hartRequest\022\036\n\010start_ms\030\001 \001(\003H\000R\007startMs" +
      "\210\001\001\022\032\n\006end_ms\030\002 \001(\003H\001R\005endMs\210\001\001\022>\n\006perio" +
      "d\030\003 \001(\0162!.chalk.server.v1.UsageChartPeri" +
      "odH\002R\006period\210\001\001\022D\n\010grouping\030\004 \001(\0162#.chal" +
      "k.server.v1.UsageChartGroupingH\003R\010groupi" +
      "ng\210\001\001B\013\n\t_start_msB\t\n\007_end_msB\t\n\007_period" +
      "B\013\n\t_grouping\"E\n\025GetUsageChartResponse\022," +
      "\n\005chart\030\001 \001(\0132\026.chalk.server.v1.ChartR\005c" +
      "hart\"\034\n\032GetUtilizationRatesRequest\"P\n\033Ge" +
      "tUtilizationRatesResponse\0221\n\005rates\030\001 \003(\013" +
      "2\033.chalk.usage.v1.MachineRateR\005rates\"\322\001\n" +
      "\026GetNodesAndPodsRequest\022!\n\tnamespace\030\001 \001" +
      "(\tH\000R\tnamespace\210\001\001\0221\n\022pod_label_selector" +
      "\030\002 \001(\tH\001R\020podLabelSelector\210\001\001\022*\n\016environ" +
      "ment_id\030\003 \001(\tH\002R\renvironmentId\210\001\001B\014\n\n_na" +
      "mespaceB\025\n\023_pod_label_selectorB\021\n\017_envir" +
      "onment_id\"\210\001\n\027GetNodesAndPodsResponse\0227\n" +
      "\005nodes\030\001 \003(\0132!.chalk.pubsub.v1.NodeStatu" +
      "sPubSubR\005nodes\0224\n\004pods\030\002 \003(\0132 .chalk.pub" +
      "sub.v1.PodStatusPubSubR\004pods\"\324\001\n\030GetNode" +
      "sAndPodsUIRequest\022!\n\tnamespace\030\001 \001(\tH\000R\t" +
      "namespace\210\001\001\0221\n\022pod_label_selector\030\002 \001(\t" +
      "H\001R\020podLabelSelector\210\001\001\022*\n\016environment_i" +
      "d\030\003 \001(\tH\002R\renvironmentId\210\001\001B\014\n\n_namespac" +
      "eB\025\n\023_pod_label_selectorB\021\n\017_environment" +
      "_id\"\226\001\n\031GetNodesAndPodsUIResponse\022=\n\005nod" +
      "es\030\001 \003(\0132\'.chalk.kubernetes.v1.Kubernete" +
      "sNodeDataR\005nodes\022:\n\004pods\030\002 \003(\0132&.chalk.k" +
      "ubernetes.v1.KubernetesPodDataR\004pods*t\n\020" +
      "UsageChartPeriod\022\"\n\036USAGE_CHART_PERIOD_U" +
      "NSPECIFIED\020\000\022\034\n\030USAGE_CHART_PERIOD_DAILY" +
      "\020\001\022\036\n\032USAGE_CHART_PERIOD_MONTHLY\020\002*\204\001\n\022U" +
      "sageChartGrouping\022$\n USAGE_CHART_GROUPIN" +
      "G_UNSPECIFIED\020\000\022&\n\"USAGE_CHART_GROUPING_" +
      "INSTANCE_TYPE\020\001\022 \n\034USAGE_CHART_GROUPING_" +
      "CLUSTER\020\0022\316\004\n\016BillingService\022r\n\021GetNodes" +
      "AndPodsUI\022).chalk.server.v1.GetNodesAndP" +
      "odsUIRequest\032*.chalk.server.v1.GetNodesA" +
      "ndPodsUIResponse\"\006\220\002\001\200}\013\022l\n\017GetNodesAndP" +
      "ods\022\'.chalk.server.v1.GetNodesAndPodsReq" +
      "uest\032(.chalk.server.v1.GetNodesAndPodsRe" +
      "sponse\"\006\220\002\001\200}\013\022f\n\rGetUsageChart\022%.chalk." +
      "server.v1.GetUsageChartRequest\032&.chalk.s" +
      "erver.v1.GetUsageChartResponse\"\006\220\002\001\200}\006\022x" +
      "\n\023GetUtilizationRates\022+.chalk.server.v1." +
      "GetUtilizationRatesRequest\032,.chalk.serve" +
      "r.v1.GetUtilizationRatesResponse\"\006\220\002\001\200}\001" +
      "\022x\n\023GetPodRequestCharts\022+.chalk.server.v" +
      "1.GetPodRequestChartsRequest\032,.chalk.ser" +
      "ver.v1.GetPodRequestChartsResponse\"\006\220\002\001\200" +
      "}\006B\241\001\n\037ai.chalk.protos.chalk.server.v1B\014" +
      "BillingProtoP\001Z\022server/v1;serverv1\242\002\003CSX" +
      "\252\002\017Chalk.Server.V1\312\002\017Chalk\\Server\\V1\342\002\033C" +
      "halk\\Server\\V1\\GPBMetadata\352\002\021Chalk::Serv" +
      "er::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          ai.chalk.protos.chalk.auth.v1.PermissionsProto.getDescriptor(),
          ai.chalk.protos.chalk.kubernetes.v1.NodesProto.getDescriptor(),
          ai.chalk.protos.chalk.kubernetes.v1.PodsProto.getDescriptor(),
          ai.chalk.protos.chalk.pubsub.v1.NodeStatusProto.getDescriptor(),
          ai.chalk.protos.chalk.pubsub.v1.PodStatusProto.getDescriptor(),
          ai.chalk.protos.chalk.server.v1.ChartProto.getDescriptor(),
          ai.chalk.protos.chalk.server.v1.PodRequestProto.getDescriptor(),
          ai.chalk.protos.chalk.usage.v1.RateProto.getDescriptor(),
        });
    internal_static_chalk_server_v1_GetUsageChartRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_chalk_server_v1_GetUsageChartRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_GetUsageChartRequest_descriptor,
        new java.lang.String[] { "StartMs", "EndMs", "Period", "Grouping", });
    internal_static_chalk_server_v1_GetUsageChartResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_chalk_server_v1_GetUsageChartResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_GetUsageChartResponse_descriptor,
        new java.lang.String[] { "Chart", });
    internal_static_chalk_server_v1_GetUtilizationRatesRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_chalk_server_v1_GetUtilizationRatesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_GetUtilizationRatesRequest_descriptor,
        new java.lang.String[] { });
    internal_static_chalk_server_v1_GetUtilizationRatesResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_chalk_server_v1_GetUtilizationRatesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_GetUtilizationRatesResponse_descriptor,
        new java.lang.String[] { "Rates", });
    internal_static_chalk_server_v1_GetNodesAndPodsRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_chalk_server_v1_GetNodesAndPodsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_GetNodesAndPodsRequest_descriptor,
        new java.lang.String[] { "Namespace", "PodLabelSelector", "EnvironmentId", });
    internal_static_chalk_server_v1_GetNodesAndPodsResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_chalk_server_v1_GetNodesAndPodsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_GetNodesAndPodsResponse_descriptor,
        new java.lang.String[] { "Nodes", "Pods", });
    internal_static_chalk_server_v1_GetNodesAndPodsUIRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_chalk_server_v1_GetNodesAndPodsUIRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_GetNodesAndPodsUIRequest_descriptor,
        new java.lang.String[] { "Namespace", "PodLabelSelector", "EnvironmentId", });
    internal_static_chalk_server_v1_GetNodesAndPodsUIResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_chalk_server_v1_GetNodesAndPodsUIResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_GetNodesAndPodsUIResponse_descriptor,
        new java.lang.String[] { "Nodes", "Pods", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(ai.chalk.protos.chalk.auth.v1.PermissionsProto.permission);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    ai.chalk.protos.chalk.auth.v1.PermissionsProto.getDescriptor();
    ai.chalk.protos.chalk.kubernetes.v1.NodesProto.getDescriptor();
    ai.chalk.protos.chalk.kubernetes.v1.PodsProto.getDescriptor();
    ai.chalk.protos.chalk.pubsub.v1.NodeStatusProto.getDescriptor();
    ai.chalk.protos.chalk.pubsub.v1.PodStatusProto.getDescriptor();
    ai.chalk.protos.chalk.server.v1.ChartProto.getDescriptor();
    ai.chalk.protos.chalk.server.v1.PodRequestProto.getDescriptor();
    ai.chalk.protos.chalk.usage.v1.RateProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
