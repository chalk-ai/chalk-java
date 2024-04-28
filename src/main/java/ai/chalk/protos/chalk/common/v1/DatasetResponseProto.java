// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/common/v1/dataset_response.proto
// Protobuf Java Version: 4.26.1

package ai.chalk.protos.chalk.common.v1;

public final class DatasetResponseProto {
  private DatasetResponseProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      DatasetResponseProto.class.getName());
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
    internal_static_chalk_common_v1_DatasetSampleFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chalk_common_v1_DatasetSampleFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_common_v1_DatasetFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chalk_common_v1_DatasetFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_common_v1_DatasetRevisionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chalk_common_v1_DatasetRevisionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_common_v1_DatasetResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chalk_common_v1_DatasetResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&chalk/common/v1/dataset_response.proto" +
      "\022\017chalk.common.v1\032!chalk/common/v1/chalk" +
      "_error.proto\032\037google/protobuf/timestamp." +
      "proto\"\357\001\n\023DatasetSampleFilter\022@\n\013lower_b" +
      "ound\030\001 \001(\0132\032.google.protobuf.TimestampH\000" +
      "R\nlowerBound\210\001\001\022@\n\013upper_bound\030\002 \001(\0132\032.g" +
      "oogle.protobuf.TimestampH\001R\nupperBound\210\001" +
      "\001\022$\n\013max_samples\030\003 \001(\005H\002R\nmaxSamples\210\001\001B" +
      "\016\n\014_lower_boundB\016\n\014_upper_boundB\016\n\014_max_" +
      "samples\"\245\001\n\rDatasetFilter\022K\n\016sample_filt" +
      "ers\030\001 \001(\0132$.chalk.common.v1.DatasetSampl" +
      "eFilterR\rsampleFilters\0220\n\022max_cache_age_" +
      "secs\030\002 \001(\002H\000R\017maxCacheAgeSecs\210\001\001B\025\n\023_max" +
      "_cache_age_secs\"\317\007\n\027DatasetRevisionRespo" +
      "nse\022&\n\014dataset_name\030\001 \001(\tH\000R\013datasetName" +
      "\210\001\001\022\"\n\ndataset_id\030\002 \001(\tH\001R\tdatasetId\210\001\001\022" +
      "*\n\016environment_id\030\003 \001(\tH\002R\renvironmentId" +
      "\210\001\001\022$\n\013revision_id\030\004 \001(\tH\003R\nrevisionId\210\001" +
      "\001\022\035\n\ncreator_id\030\005 \001(\tR\tcreatorId\022\030\n\007outp" +
      "uts\030\006 \003(\tR\007outputs\022\"\n\ngivens_uri\030\007 \001(\tH\004" +
      "R\tgivensUri\210\001\001\0224\n\006status\030\010 \001(\0162\034.chalk.c" +
      "ommon.v1.QueryStatusR\006status\0228\n\007filters\030" +
      "\t \001(\0132\036.chalk.common.v1.DatasetFilterR\007f" +
      "ilters\022%\n\016num_partitions\030\n \001(\005R\rnumParti" +
      "tions\022 \n\tnum_bytes\030\013 \001(\005H\005R\010numBytes\210\001\001\022" +
      "\037\n\013output_uris\030\014 \001(\tR\noutputUris\022%\n\016outp" +
      "ut_version\030\r \001(\005R\routputVersion\022\033\n\006branc" +
      "h\030\016 \001(\tH\006R\006branch\210\001\001\022(\n\rdashboard_url\030\017 " +
      "\001(\tH\007R\014dashboardUrl\210\001\001\022>\n\ncreated_at\030e \001" +
      "(\0132\032.google.protobuf.TimestampH\010R\tcreate" +
      "dAt\210\001\001\022>\n\nstarted_at\030f \001(\0132\032.google.prot" +
      "obuf.TimestampH\tR\tstartedAt\210\001\001\022D\n\rtermin" +
      "ated_at\030g \001(\0132\032.google.protobuf.Timestam" +
      "pH\nR\014terminatedAt\210\001\001B\017\n\r_dataset_nameB\r\n" +
      "\013_dataset_idB\021\n\017_environment_idB\016\n\014_revi" +
      "sion_idB\r\n\013_givens_uriB\014\n\n_num_bytesB\t\n\007" +
      "_branchB\020\n\016_dashboard_urlB\r\n\013_created_at" +
      "B\r\n\013_started_atB\020\n\016_terminated_at\"\262\002\n\017Da" +
      "tasetResponse\022\037\n\013is_finished\030\001 \001(\010R\nisFi" +
      "nished\022\030\n\007version\030\002 \001(\005R\007version\022%\n\016envi" +
      "ronment_id\030\003 \001(\tR\renvironmentId\022\035\n\ndatas" +
      "et_id\030\004 \001(\tR\tdatasetId\022!\n\014dataset_name\030\005" +
      " \001(\tR\013datasetName\0223\n\006errors\030e \003(\0132\033.chal" +
      "k.common.v1.ChalkErrorR\006errors\022F\n\trevisi" +
      "ons\030f \003(\0132(.chalk.common.v1.DatasetRevis" +
      "ionResponseR\trevisions*\376\001\n\013QueryStatus\022\034" +
      "\n\030QUERY_STATUS_UNSPECIFIED\020\000\022#\n\037QUERY_ST" +
      "ATUS_PENDING_SUBMISSION\020\001\022\032\n\026QUERY_STATU" +
      "S_SUBMITTED\020\002\022\030\n\024QUERY_STATUS_RUNNING\020\003\022" +
      "\026\n\022QUERY_STATUS_ERROR\020\004\022\030\n\024QUERY_STATUS_" +
      "EXPIRED\020\005\022\'\n#QUERY_STATUS_QUERY_STATUS_C" +
      "ANCELLED\020\006\022\033\n\027QUERY_STATUS_SUCCESSFUL\020\007B" +
      "\225\001\n\037ai.chalk.protos.chalk.common.v1B\024Dat" +
      "asetResponseProtoP\001\242\002\003CCX\252\002\017Chalk.Common" +
      ".V1\312\002\017Chalk\\Common\\V1\342\002\033Chalk\\Common\\V1\\" +
      "GPBMetadata\352\002\021Chalk::Common::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          ai.chalk.protos.chalk.common.v1.ChalkErrorProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_chalk_common_v1_DatasetSampleFilter_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_chalk_common_v1_DatasetSampleFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chalk_common_v1_DatasetSampleFilter_descriptor,
        new java.lang.String[] { "LowerBound", "UpperBound", "MaxSamples", });
    internal_static_chalk_common_v1_DatasetFilter_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_chalk_common_v1_DatasetFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chalk_common_v1_DatasetFilter_descriptor,
        new java.lang.String[] { "SampleFilters", "MaxCacheAgeSecs", });
    internal_static_chalk_common_v1_DatasetRevisionResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_chalk_common_v1_DatasetRevisionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chalk_common_v1_DatasetRevisionResponse_descriptor,
        new java.lang.String[] { "DatasetName", "DatasetId", "EnvironmentId", "RevisionId", "CreatorId", "Outputs", "GivensUri", "Status", "Filters", "NumPartitions", "NumBytes", "OutputUris", "OutputVersion", "Branch", "DashboardUrl", "CreatedAt", "StartedAt", "TerminatedAt", });
    internal_static_chalk_common_v1_DatasetResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_chalk_common_v1_DatasetResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chalk_common_v1_DatasetResponse_descriptor,
        new java.lang.String[] { "IsFinished", "Version", "EnvironmentId", "DatasetId", "DatasetName", "Errors", "Revisions", });
    descriptor.resolveAllFeaturesImmutable();
    ai.chalk.protos.chalk.common.v1.ChalkErrorProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}