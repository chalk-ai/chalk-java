// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/engine/v1/plan.proto
// Protobuf Java Version: 4.26.1

package ai.chalk.protos.chalk.engine.v1;

public final class PlanProto {
  private PlanProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      PlanProto.class.getName());
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
    internal_static_chalk_engine_v1_RawColumnKey_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chalk_engine_v1_RawColumnKey_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_engine_v1_FeatureColumnKey_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chalk_engine_v1_FeatureColumnKey_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_engine_v1_HasManyFeatureKey_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chalk_engine_v1_HasManyFeatureKey_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_engine_v1_DataFrameFeatureKey_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chalk_engine_v1_DataFrameFeatureKey_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_engine_v1_DataFrame_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chalk_engine_v1_DataFrame_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_engine_v1_ColumnKey_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chalk_engine_v1_ColumnKey_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_engine_v1_TableKey_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chalk_engine_v1_TableKey_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_engine_v1_Key_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chalk_engine_v1_Key_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_engine_v1_PyArrowSchema_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chalk_engine_v1_PyArrowSchema_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_engine_v1_PyArrowSchema_TableSchema_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chalk_engine_v1_PyArrowSchema_TableSchema_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_engine_v1_PyArrowSchema_TableSchema_SchemaEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chalk_engine_v1_PyArrowSchema_TableSchema_SchemaEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_engine_v1_PyArrowSchema_ColumnSchema_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chalk_engine_v1_PyArrowSchema_ColumnSchema_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_engine_v1_Plan_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chalk_engine_v1_Plan_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_engine_v1_Node_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chalk_engine_v1_Node_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_engine_v1_NodeImpl_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chalk_engine_v1_NodeImpl_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_engine_v1_UnknownNode_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chalk_engine_v1_UnknownNode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_engine_v1_GivensScan_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chalk_engine_v1_GivensScan_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_engine_v1_ChalkProject_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chalk_engine_v1_ChalkProject_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_engine_v1_Project_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chalk_engine_v1_Project_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_engine_v1_DefaultInjector_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chalk_engine_v1_DefaultInjector_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032chalk/engine/v1/plan.proto\022\017chalk.engi" +
      "ne.v1\032\032chalk/arrow/v1/arrow.proto\"\"\n\014Raw" +
      "ColumnKey\022\022\n\004name\030\001 \001(\tR\004name\"-\n\020Feature" +
      "ColumnKey\022\031\n\010root_fqn\030\001 \001(\tR\007rootFqn\"Z\n\021" +
      "HasManyFeatureKey\022\031\n\010root_fqn\030\001 \001(\tR\007roo" +
      "tFqn\022*\n\002df\030\002 \001(\0132\032.chalk.engine.v1.DataF" +
      "rameR\002df\"h\n\023DataFrameFeatureKey\022%\n\016root_" +
      "namespace\030\001 \001(\tR\rrootNamespace\022*\n\002df\030\002 \001" +
      "(\0132\032.chalk.engine.v1.DataFrameR\002df\"\314\001\n\tD" +
      "ataFrame\022L\n\020optional_columns\030\001 \003(\0132!.cha" +
      "lk.engine.v1.FeatureColumnKeyR\017optionalC" +
      "olumns\022L\n\020required_columns\030\002 \003(\0132!.chalk" +
      ".engine.v1.FeatureColumnKeyR\017requiredCol" +
      "umns\022\031\n\005limit\030\003 \001(\004H\000R\005limit\210\001\001B\010\n\006_limi" +
      "t\"\204\001\n\tColumnKey\022=\n\007feature\030\001 \001(\0132!.chalk" +
      ".engine.v1.FeatureColumnKeyH\000R\007feature\0221" +
      "\n\003raw\030\002 \001(\0132\035.chalk.engine.v1.RawColumnK" +
      "eyH\000R\003rawB\005\n\003key\"\231\001\n\010TableKey\022?\n\010has_man" +
      "y\030\001 \001(\0132\".chalk.engine.v1.HasManyFeature" +
      "KeyH\000R\007hasMany\022E\n\ndata_frame\030\002 \001(\0132$.cha" +
      "lk.engine.v1.DataFrameFeatureKeyH\000R\tdata" +
      "FrameB\005\n\003key\"\221\002\n\003Key\022>\n\nraw_column\030\001 \001(\013" +
      "2\035.chalk.engine.v1.RawColumnKeyH\000R\trawCo" +
      "lumn\022;\n\006scalar\030\002 \001(\0132!.chalk.engine.v1.F" +
      "eatureColumnKeyH\000R\006scalar\022?\n\010has_many\030\003 " +
      "\001(\0132\".chalk.engine.v1.HasManyFeatureKeyH" +
      "\000R\007hasMany\022D\n\tdataframe\030\004 \001(\0132$.chalk.en" +
      "gine.v1.DataFrameFeatureKeyH\000R\tdataframe" +
      "B\006\n\004impl\"\356\003\n\rPyArrowSchema\022E\n\007scalars\030\001 " +
      "\003(\0132+.chalk.engine.v1.PyArrowSchema.Colu" +
      "mnSchemaR\007scalars\022B\n\006groups\030\002 \003(\0132*.chal" +
      "k.engine.v1.PyArrowSchema.TableSchemaR\006g" +
      "roups\032\340\001\n\013TableSchema\022+\n\003key\030\001 \001(\0132\031.cha" +
      "lk.engine.v1.TableKeyR\003key\022N\n\006schema\030\002 \003" +
      "(\01326.chalk.engine.v1.PyArrowSchema.Table" +
      "Schema.SchemaEntryR\006schema\032T\n\013SchemaEntr" +
      "y\022\020\n\003key\030\001 \001(\tR\003key\022/\n\005value\030\002 \001(\0132\031.cha" +
      "lk.arrow.v1.ArrowTypeR\005value:\0028\001\032o\n\014Colu" +
      "mnSchema\022,\n\003key\030\001 \001(\0132\032.chalk.engine.v1." +
      "ColumnKeyR\003key\0221\n\006schema\030\002 \001(\0132\031.chalk.a" +
      "rrow.v1.ArrowTypeR\006schema\"\236\001\n\004Plan\022+\n\005no" +
      "des\030\001 \003(\0132\025.chalk.engine.v1.NodeR\005nodes\022" +
      "\"\n\rroot_node_idx\030\002 \001(\rR\013rootNodeIdx\022E\n\016p" +
      "yarrow_schema\030\003 \001(\0132\036.chalk.engine.v1.Py" +
      "ArrowSchemaR\rpyarrowSchema\"`\n\004Node\022)\n\020ch" +
      "ildren_indices\030\001 \003(\rR\017childrenIndices\022-\n" +
      "\004impl\030\002 \001(\0132\031.chalk.engine.v1.NodeImplR\004" +
      "impl\"\327\002\n\010NodeImpl\0228\n\007unknown\030\001 \001(\0132\034.cha" +
      "lk.engine.v1.UnknownNodeH\000R\007unknown\022>\n\013g" +
      "ivens_scan\030\002 \001(\0132\033.chalk.engine.v1.Given" +
      "sScanH\000R\ngivensScan\0224\n\007project\030\003 \001(\0132\030.c" +
      "halk.engine.v1.ProjectH\000R\007project\022D\n\rcha" +
      "lk_project\030\004 \001(\0132\035.chalk.engine.v1.Chalk" +
      "ProjectH\000R\014chalkProject\022M\n\020default_injec" +
      "tor\030\005 \001(\0132 .chalk.engine.v1.DefaultInjec" +
      "torH\000R\017defaultInjectorB\006\n\004impl\"*\n\013Unknow" +
      "nNode\022\033\n\ttype_name\030\001 \001(\tR\010typeName\":\n\nGi" +
      "vensScan\022,\n\006fields\030\001 \003(\0132\024.chalk.engine." +
      "v1.KeyR\006fields\"x\n\014ChalkProject\022,\n\006fields" +
      "\030\001 \003(\0132\024.chalk.engine.v1.KeyR\006fields\022:\n\032" +
      "promote_ts_to_feature_time\030\002 \001(\010R\026promot" +
      "eTsToFeatureTime\"7\n\007Project\022,\n\006fields\030\001 " +
      "\003(\0132\024.chalk.engine.v1.KeyR\006fields\"X\n\017Def" +
      "aultInjector\022E\n\023defaulting_features\030\001 \003(" +
      "\0132\024.chalk.engine.v1.KeyR\022defaultingFeatu" +
      "resB\212\001\n\037ai.chalk.protos.chalk.engine.v1B" +
      "\tPlanProtoP\001\242\002\003CEX\252\002\017Chalk.Engine.V1\312\002\017C" +
      "halk\\Engine\\V1\342\002\033Chalk\\Engine\\V1\\GPBMeta" +
      "data\352\002\021Chalk::Engine::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          ai.chalk.protos.chalk.arrow.v1.ArrowProto.getDescriptor(),
        });
    internal_static_chalk_engine_v1_RawColumnKey_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_chalk_engine_v1_RawColumnKey_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chalk_engine_v1_RawColumnKey_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_chalk_engine_v1_FeatureColumnKey_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_chalk_engine_v1_FeatureColumnKey_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chalk_engine_v1_FeatureColumnKey_descriptor,
        new java.lang.String[] { "RootFqn", });
    internal_static_chalk_engine_v1_HasManyFeatureKey_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_chalk_engine_v1_HasManyFeatureKey_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chalk_engine_v1_HasManyFeatureKey_descriptor,
        new java.lang.String[] { "RootFqn", "Df", });
    internal_static_chalk_engine_v1_DataFrameFeatureKey_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_chalk_engine_v1_DataFrameFeatureKey_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chalk_engine_v1_DataFrameFeatureKey_descriptor,
        new java.lang.String[] { "RootNamespace", "Df", });
    internal_static_chalk_engine_v1_DataFrame_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_chalk_engine_v1_DataFrame_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chalk_engine_v1_DataFrame_descriptor,
        new java.lang.String[] { "OptionalColumns", "RequiredColumns", "Limit", });
    internal_static_chalk_engine_v1_ColumnKey_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_chalk_engine_v1_ColumnKey_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chalk_engine_v1_ColumnKey_descriptor,
        new java.lang.String[] { "Feature", "Raw", "Key", });
    internal_static_chalk_engine_v1_TableKey_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_chalk_engine_v1_TableKey_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chalk_engine_v1_TableKey_descriptor,
        new java.lang.String[] { "HasMany", "DataFrame", "Key", });
    internal_static_chalk_engine_v1_Key_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_chalk_engine_v1_Key_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chalk_engine_v1_Key_descriptor,
        new java.lang.String[] { "RawColumn", "Scalar", "HasMany", "Dataframe", "Impl", });
    internal_static_chalk_engine_v1_PyArrowSchema_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_chalk_engine_v1_PyArrowSchema_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chalk_engine_v1_PyArrowSchema_descriptor,
        new java.lang.String[] { "Scalars", "Groups", });
    internal_static_chalk_engine_v1_PyArrowSchema_TableSchema_descriptor =
      internal_static_chalk_engine_v1_PyArrowSchema_descriptor.getNestedTypes().get(0);
    internal_static_chalk_engine_v1_PyArrowSchema_TableSchema_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chalk_engine_v1_PyArrowSchema_TableSchema_descriptor,
        new java.lang.String[] { "Key", "Schema", });
    internal_static_chalk_engine_v1_PyArrowSchema_TableSchema_SchemaEntry_descriptor =
      internal_static_chalk_engine_v1_PyArrowSchema_TableSchema_descriptor.getNestedTypes().get(0);
    internal_static_chalk_engine_v1_PyArrowSchema_TableSchema_SchemaEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chalk_engine_v1_PyArrowSchema_TableSchema_SchemaEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_chalk_engine_v1_PyArrowSchema_ColumnSchema_descriptor =
      internal_static_chalk_engine_v1_PyArrowSchema_descriptor.getNestedTypes().get(1);
    internal_static_chalk_engine_v1_PyArrowSchema_ColumnSchema_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chalk_engine_v1_PyArrowSchema_ColumnSchema_descriptor,
        new java.lang.String[] { "Key", "Schema", });
    internal_static_chalk_engine_v1_Plan_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_chalk_engine_v1_Plan_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chalk_engine_v1_Plan_descriptor,
        new java.lang.String[] { "Nodes", "RootNodeIdx", "PyarrowSchema", });
    internal_static_chalk_engine_v1_Node_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_chalk_engine_v1_Node_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chalk_engine_v1_Node_descriptor,
        new java.lang.String[] { "ChildrenIndices", "Impl", });
    internal_static_chalk_engine_v1_NodeImpl_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_chalk_engine_v1_NodeImpl_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chalk_engine_v1_NodeImpl_descriptor,
        new java.lang.String[] { "Unknown", "GivensScan", "Project", "ChalkProject", "DefaultInjector", "Impl", });
    internal_static_chalk_engine_v1_UnknownNode_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_chalk_engine_v1_UnknownNode_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chalk_engine_v1_UnknownNode_descriptor,
        new java.lang.String[] { "TypeName", });
    internal_static_chalk_engine_v1_GivensScan_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_chalk_engine_v1_GivensScan_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chalk_engine_v1_GivensScan_descriptor,
        new java.lang.String[] { "Fields", });
    internal_static_chalk_engine_v1_ChalkProject_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_chalk_engine_v1_ChalkProject_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chalk_engine_v1_ChalkProject_descriptor,
        new java.lang.String[] { "Fields", "PromoteTsToFeatureTime", });
    internal_static_chalk_engine_v1_Project_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_chalk_engine_v1_Project_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chalk_engine_v1_Project_descriptor,
        new java.lang.String[] { "Fields", });
    internal_static_chalk_engine_v1_DefaultInjector_descriptor =
      getDescriptor().getMessageTypes().get(16);
    internal_static_chalk_engine_v1_DefaultInjector_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chalk_engine_v1_DefaultInjector_descriptor,
        new java.lang.String[] { "DefaultingFeatures", });
    descriptor.resolveAllFeaturesImmutable();
    ai.chalk.protos.chalk.arrow.v1.ArrowProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
