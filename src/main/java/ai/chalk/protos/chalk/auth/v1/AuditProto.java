// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/auth/v1/audit.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.auth.v1;

public final class AuditProto {
  private AuditProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(ai.chalk.protos.chalk.auth.v1.AuditProto.audit);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public static final int AUDIT_FIELD_NUMBER = 30001;
  /**
   * <code>extend .google.protobuf.MethodOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.MethodOptions,
      ai.chalk.protos.chalk.auth.v1.AuditOptions> audit = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        ai.chalk.protos.chalk.auth.v1.AuditOptions.class,
        ai.chalk.protos.chalk.auth.v1.AuditOptions.getDefaultInstance());
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_auth_v1_AuditOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_auth_v1_AuditOptions_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031chalk/auth/v1/audit.proto\022\rchalk.auth." +
      "v1\032 google/protobuf/descriptor.proto\"a\n\014" +
      "AuditOptions\022/\n\005level\030\001 \001(\0162\031.chalk.auth" +
      ".v1.AuditLevelR\005level\022 \n\013description\030\002 \001" +
      "(\tR\013description*V\n\nAuditLevel\022\033\n\027AUDIT_L" +
      "EVEL_UNSPECIFIED\020\000\022\026\n\022AUDIT_LEVEL_ERRORS" +
      "\020\001\022\023\n\017AUDIT_LEVEL_ALL\020\002:V\n\005audit\022\036.googl" +
      "e.protobuf.MethodOptions\030\261\352\001 \001(\0132\033.chalk" +
      ".auth.v1.AuditOptionsR\005audit\210\001\001B\221\001\n\035ai.c" +
      "halk.protos.chalk.auth.v1B\nAuditProtoP\001Z" +
      "\016auth/v1;authv1\242\002\003CAX\252\002\rChalk.Auth.V1\312\002\r" +
      "Chalk\\Auth\\V1\342\002\031Chalk\\Auth\\V1\\GPBMetadat" +
      "a\352\002\017Chalk::Auth::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.DescriptorProtos.getDescriptor(),
        });
    internal_static_chalk_auth_v1_AuditOptions_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_chalk_auth_v1_AuditOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_auth_v1_AuditOptions_descriptor,
        new java.lang.String[] { "Level", "Description", });
    audit.internalInit(descriptor.getExtensions().get(0));
    com.google.protobuf.DescriptorProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
