// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gen_bq_schema/bq_field.proto

// Protobuf Java Version: 3.25.3
package ai.chalk.protos.gen_bq_schema;

public final class BqFieldProto {
  private BqFieldProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(ai.chalk.protos.gen_bq_schema.BqFieldProto.bigquery);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public static final int BIGQUERY_FIELD_NUMBER = 1021;
  /**
   * <pre>
   * BigQuery field schema generation options.
   * </pre>
   *
   * <code>extend .google.protobuf.FieldOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.FieldOptions,
      ai.chalk.protos.gen_bq_schema.BigQueryFieldOptions> bigquery = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        ai.chalk.protos.gen_bq_schema.BigQueryFieldOptions.class,
        ai.chalk.protos.gen_bq_schema.BigQueryFieldOptions.getDefaultInstance());
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gen_bq_schema_BigQueryFieldOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_gen_bq_schema_BigQueryFieldOptions_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034gen_bq_schema/bq_field.proto\022\rgen_bq_s" +
      "chema\032 google/protobuf/descriptor.proto\"" +
      "\304\001\n\024BigQueryFieldOptions\022\030\n\007require\030\001 \001(" +
      "\010R\007require\022#\n\rtype_override\030\002 \001(\tR\014typeO" +
      "verride\022\026\n\006ignore\030\003 \001(\010R\006ignore\022 \n\013descr" +
      "iption\030\004 \001(\tR\013description\022\022\n\004name\030\005 \001(\tR" +
      "\004name\022\037\n\013policy_tags\030\006 \001(\tR\npolicyTags:_" +
      "\n\010bigquery\022\035.google.protobuf.FieldOption" +
      "s\030\375\007 \001(\0132#.gen_bq_schema.BigQueryFieldOp" +
      "tionsR\010bigqueryB\265\001\n\035ai.chalk.protos.gen_" +
      "bq_schemaB\014BqFieldProtoP\001Z:github.com/Go" +
      "ogleCloudPlatform/protoc-gen-bq-schema/p" +
      "rotos\242\002\003GXX\252\002\013GenBqSchema\312\002\013GenBqSchema\342" +
      "\002\027GenBqSchema\\GPBMetadata\352\002\013GenBqSchemab" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.DescriptorProtos.getDescriptor(),
        });
    internal_static_gen_bq_schema_BigQueryFieldOptions_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_gen_bq_schema_BigQueryFieldOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_gen_bq_schema_BigQueryFieldOptions_descriptor,
        new java.lang.String[] { "Require", "TypeOverride", "Ignore", "Description", "Name", "PolicyTags", });
    bigquery.internalInit(descriptor.getExtensions().get(0));
    com.google.protobuf.DescriptorProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
