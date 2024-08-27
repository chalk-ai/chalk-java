// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/common/v1/offline_query.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.common.v1;

public final class OfflineQueryProto {
  private OfflineQueryProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_common_v1_OfflineQueryRecomputeFeatures_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_common_v1_OfflineQueryRecomputeFeatures_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_common_v1_OfflineQueryRecomputeFeatures_FeatureList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_common_v1_OfflineQueryRecomputeFeatures_FeatureList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_common_v1_OfflineQueryExplain_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_common_v1_OfflineQueryExplain_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_common_v1_OfflineQueryExplain_Only_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_common_v1_OfflineQueryExplain_Only_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_common_v1_OfflineQueryInputs_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_common_v1_OfflineQueryInputs_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_common_v1_OfflineQueryInputs_NoInputs_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_common_v1_OfflineQueryInputs_NoInputs_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_common_v1_OfflineQueryRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_common_v1_OfflineQueryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_common_v1_ColumnMetadataList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_common_v1_ColumnMetadataList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_common_v1_ColumnMetadataList_ColumnMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_common_v1_ColumnMetadataList_ColumnMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_common_v1_GetOfflineQueryJobResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_common_v1_GetOfflineQueryJobResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#chalk/common/v1/offline_query.proto\022\017c" +
      "halk.common.v1\032!chalk/common/v1/chalk_er" +
      "ror.proto\032\"chalk/common/v1/online_query." +
      "proto\032$chalk/expression/v1/expression.pr" +
      "oto\"\334\001\n\035OfflineQueryRecomputeFeatures\022 \n" +
      "\013all_or_none\030\001 \001(\010H\000R\tallOrNone\022_\n\014featu" +
      "re_list\030\002 \001(\0132:.chalk.common.v1.OfflineQ" +
      "ueryRecomputeFeatures.FeatureListH\000R\013fea" +
      "tureList\0320\n\013FeatureList\022!\n\014feature_list\030" +
      "\001 \003(\tR\013featureListB\006\n\004impl\"\200\001\n\023OfflineQu" +
      "eryExplain\022\030\n\006truthy\030\001 \001(\010H\000R\006truthy\022?\n\004" +
      "only\030\002 \001(\0132).chalk.common.v1.OfflineQuer" +
      "yExplain.OnlyH\000R\004only\032\006\n\004OnlyB\006\n\004impl\"\236\001" +
      "\n\022OfflineQueryInputs\022\'\n\016feather_inputs\030\001" +
      " \001(\014H\000R\rfeatherInputs\022K\n\tno_inputs\030\002 \001(\013" +
      "2,.chalk.common.v1.OfflineQueryInputs.No" +
      "InputsH\000R\010noInputs\032\n\n\010NoInputsB\006\n\004impl\"\367" +
      "\007\n\023OfflineQueryRequest\022;\n\006inputs\030\001 \001(\0132#" +
      ".chalk.common.v1.OfflineQueryInputsR\006inp" +
      "uts\022\030\n\007outputs\030\002 \003(\tR\007outputs\022)\n\020require" +
      "d_outputs\030\003 \003(\tR\017requiredOutputs\022-\n\022dest" +
      "ination_format\030\004 \001(\tR\021destinationFormat\022" +
      "\033\n\006branch\030\005 \001(\tH\000R\006branch\210\001\001\022&\n\014dataset_" +
      "name\030\006 \001(\tH\001R\013datasetName\210\001\001\022]\n\022recomput" +
      "e_features\030\007 \001(\0132..chalk.common.v1.Offli" +
      "neQueryRecomputeFeaturesR\021recomputeFeatu" +
      "res\022*\n\021store_plan_stages\030\010 \001(\010R\017storePla" +
      "nStages\022>\n\007filters\030\013 \003(\0132$.chalk.express" +
      "ion.v1.LogicalExprNodeR\007filters\022$\n\013max_s" +
      "amples\030e \001(\005H\002R\nmaxSamples\210\001\001\0220\n\022max_cac" +
      "he_age_secs\030f \001(\005H\003R\017maxCacheAgeSecs\210\001\001\022" +
      "B\n\007explain\030g \001(\0132$.chalk.common.v1.Offli" +
      "neQueryExplainB\002\030\001R\007explain\022;\n\010explain2\030" +
      "j \001(\0132\037.chalk.common.v1.ExplainOptionsR\010" +
      "explain2\022\022\n\004tags\030h \003(\tR\004tags\022*\n\016correlat" +
      "ion_id\030i \001(\tH\004R\rcorrelationId\210\001\001\022;\n\027obse" +
      "rved_at_lower_bound\030\311\001 \001(\tH\005R\024observedAt" +
      "LowerBound\210\001\001\022;\n\027observed_at_upper_bound" +
      "\030\312\001 \001(\tH\006R\024observedAtUpperBound\210\001\001B\t\n\007_b" +
      "ranchB\017\n\r_dataset_nameB\016\n\014_max_samplesB\025" +
      "\n\023_max_cache_age_secsB\021\n\017_correlation_id" +
      "B\032\n\030_observed_at_lower_boundB\032\n\030_observe" +
      "d_at_upper_bound\"\316\001\n\022ColumnMetadataList\022" +
      "N\n\010metadata\030\001 \003(\01322.chalk.common.v1.Colu" +
      "mnMetadataList.ColumnMetadataR\010metadata\032" +
      "h\n\016ColumnMetadata\022\037\n\013feature_fqn\030\001 \001(\tR\n" +
      "featureFqn\022\037\n\013column_name\030\002 \001(\tR\ncolumnN" +
      "ame\022\024\n\005dtype\030\003 \001(\tR\005dtype\"\360\001\n\032GetOffline" +
      "QueryJobResponse\022\037\n\013is_finished\030\001 \001(\010R\ni" +
      "sFinished\022\030\n\007version\030\002 \001(\005R\007version\022\022\n\004u" +
      "rls\030\003 \003(\tR\004urls\0223\n\006errors\030\004 \003(\0132\033.chalk." +
      "common.v1.ChalkErrorR\006errors\022B\n\007columns\030" +
      "\005 \001(\0132#.chalk.common.v1.ColumnMetadataLi" +
      "stH\000R\007columns\210\001\001B\n\n\010_columnsB\222\001\n\037ai.chal" +
      "k.protos.chalk.common.v1B\021OfflineQueryPr" +
      "otoP\001\242\002\003CCX\252\002\017Chalk.Common.V1\312\002\017Chalk\\Co" +
      "mmon\\V1\342\002\033Chalk\\Common\\V1\\GPBMetadata\352\002\021" +
      "Chalk::Common::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          ai.chalk.protos.chalk.common.v1.ChalkErrorProto.getDescriptor(),
          ai.chalk.protos.chalk.common.v1.OnlineQueryProto.getDescriptor(),
          ai.chalk.protos.chalk.expression.v1.ExpressionProto.getDescriptor(),
        });
    internal_static_chalk_common_v1_OfflineQueryRecomputeFeatures_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_chalk_common_v1_OfflineQueryRecomputeFeatures_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_common_v1_OfflineQueryRecomputeFeatures_descriptor,
        new java.lang.String[] { "AllOrNone", "FeatureList", "Impl", });
    internal_static_chalk_common_v1_OfflineQueryRecomputeFeatures_FeatureList_descriptor =
      internal_static_chalk_common_v1_OfflineQueryRecomputeFeatures_descriptor.getNestedTypes().get(0);
    internal_static_chalk_common_v1_OfflineQueryRecomputeFeatures_FeatureList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_common_v1_OfflineQueryRecomputeFeatures_FeatureList_descriptor,
        new java.lang.String[] { "FeatureList", });
    internal_static_chalk_common_v1_OfflineQueryExplain_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_chalk_common_v1_OfflineQueryExplain_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_common_v1_OfflineQueryExplain_descriptor,
        new java.lang.String[] { "Truthy", "Only", "Impl", });
    internal_static_chalk_common_v1_OfflineQueryExplain_Only_descriptor =
      internal_static_chalk_common_v1_OfflineQueryExplain_descriptor.getNestedTypes().get(0);
    internal_static_chalk_common_v1_OfflineQueryExplain_Only_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_common_v1_OfflineQueryExplain_Only_descriptor,
        new java.lang.String[] { });
    internal_static_chalk_common_v1_OfflineQueryInputs_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_chalk_common_v1_OfflineQueryInputs_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_common_v1_OfflineQueryInputs_descriptor,
        new java.lang.String[] { "FeatherInputs", "NoInputs", "Impl", });
    internal_static_chalk_common_v1_OfflineQueryInputs_NoInputs_descriptor =
      internal_static_chalk_common_v1_OfflineQueryInputs_descriptor.getNestedTypes().get(0);
    internal_static_chalk_common_v1_OfflineQueryInputs_NoInputs_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_common_v1_OfflineQueryInputs_NoInputs_descriptor,
        new java.lang.String[] { });
    internal_static_chalk_common_v1_OfflineQueryRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_chalk_common_v1_OfflineQueryRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_common_v1_OfflineQueryRequest_descriptor,
        new java.lang.String[] { "Inputs", "Outputs", "RequiredOutputs", "DestinationFormat", "Branch", "DatasetName", "RecomputeFeatures", "StorePlanStages", "Filters", "MaxSamples", "MaxCacheAgeSecs", "Explain", "Explain2", "Tags", "CorrelationId", "ObservedAtLowerBound", "ObservedAtUpperBound", });
    internal_static_chalk_common_v1_ColumnMetadataList_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_chalk_common_v1_ColumnMetadataList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_common_v1_ColumnMetadataList_descriptor,
        new java.lang.String[] { "Metadata", });
    internal_static_chalk_common_v1_ColumnMetadataList_ColumnMetadata_descriptor =
      internal_static_chalk_common_v1_ColumnMetadataList_descriptor.getNestedTypes().get(0);
    internal_static_chalk_common_v1_ColumnMetadataList_ColumnMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_common_v1_ColumnMetadataList_ColumnMetadata_descriptor,
        new java.lang.String[] { "FeatureFqn", "ColumnName", "Dtype", });
    internal_static_chalk_common_v1_GetOfflineQueryJobResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_chalk_common_v1_GetOfflineQueryJobResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_common_v1_GetOfflineQueryJobResponse_descriptor,
        new java.lang.String[] { "IsFinished", "Version", "Urls", "Errors", "Columns", });
    ai.chalk.protos.chalk.common.v1.ChalkErrorProto.getDescriptor();
    ai.chalk.protos.chalk.common.v1.OnlineQueryProto.getDescriptor();
    ai.chalk.protos.chalk.expression.v1.ExpressionProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
