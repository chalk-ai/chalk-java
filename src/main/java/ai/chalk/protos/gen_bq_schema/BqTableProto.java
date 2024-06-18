// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gen_bq_schema/bq_table.proto

// Protobuf Java Version: 3.25.3
package ai.chalk.protos.gen_bq_schema;

public final class BqTableProto {
  private BqTableProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(ai.chalk.protos.gen_bq_schema.BqTableProto.bigqueryOpts);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public static final int BIGQUERY_OPTS_FIELD_NUMBER = 1021;
  /**
   * <pre>
   * BigQuery message schema generation options.
   *
   * The field number is a globally unique id for this option, assigned by
   * protobuf-global-extension-registry&#64;google.com
   * </pre>
   *
   * <code>extend .google.protobuf.MessageOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.MessageOptions,
      ai.chalk.protos.gen_bq_schema.BigQueryMessageOptions> bigqueryOpts = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        ai.chalk.protos.gen_bq_schema.BigQueryMessageOptions.class,
        ai.chalk.protos.gen_bq_schema.BigQueryMessageOptions.getDefaultInstance());
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gen_bq_schema_BigQueryMessageOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_gen_bq_schema_BigQueryMessageOptions_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034gen_bq_schema/bq_table.proto\022\rgen_bq_s" +
      "chema\032 google/protobuf/descriptor.proto\"" +
      "\200\001\n\026BigQueryMessageOptions\022\035\n\ntable_name" +
      "\030\001 \001(\tR\ttableName\022$\n\016use_json_names\030\002 \001(" +
      "\010R\014useJsonNames\022!\n\014extra_fields\030\003 \003(\tR\013e" +
      "xtraFields:l\n\rbigquery_opts\022\037.google.pro" +
      "tobuf.MessageOptions\030\375\007 \001(\0132%.gen_bq_sch" +
      "ema.BigQueryMessageOptionsR\014bigqueryOpts" +
      "B\265\001\n\035ai.chalk.protos.gen_bq_schemaB\014BqTa" +
      "bleProtoP\001Z:github.com/GoogleCloudPlatfo" +
      "rm/protoc-gen-bq-schema/protos\242\002\003GXX\252\002\013G" +
      "enBqSchema\312\002\013GenBqSchema\342\002\027GenBqSchema\\G" +
      "PBMetadata\352\002\013GenBqSchemab\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.DescriptorProtos.getDescriptor(),
        });
    internal_static_gen_bq_schema_BigQueryMessageOptions_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_gen_bq_schema_BigQueryMessageOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_gen_bq_schema_BigQueryMessageOptions_descriptor,
        new java.lang.String[] { "TableName", "UseJsonNames", "ExtraFields", });
    bigqueryOpts.internalInit(descriptor.getExtensions().get(0));
    com.google.protobuf.DescriptorProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
