// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/log.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

public final class LogProto {
  private LogProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_LogEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_LogEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031chalk/server/v1/log.proto\022\017chalk.serve" +
      "r.v1\032\037google/protobuf/timestamp.proto\"\234\001" +
      "\n\010LogEntry\022\016\n\002id\030\001 \001(\tR\002id\022\037\n\010severity\030\002" +
      " \001(\tH\000R\010severity\210\001\001\0228\n\ttimestamp\030\003 \001(\0132\032" +
      ".google.protobuf.TimestampR\ttimestamp\022\030\n" +
      "\007message\030\004 \001(\tR\007messageB\013\n\t_severityB\235\001\n" +
      "\037ai.chalk.protos.chalk.server.v1B\010LogPro" +
      "toP\001Z\022server/v1;serverv1\242\002\003CSX\252\002\017Chalk.S" +
      "erver.V1\312\002\017Chalk\\Server\\V1\342\002\033Chalk\\Serve" +
      "r\\V1\\GPBMetadata\352\002\021Chalk::Server::V1b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_chalk_server_v1_LogEntry_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_chalk_server_v1_LogEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_LogEntry_descriptor,
        new java.lang.String[] { "Id", "Severity", "Timestamp", "Message", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
