// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/engine/v1/offline_store_service.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.engine.v1;

public final class OfflineStoreServiceProto {
  private OfflineStoreServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_engine_v1_OfflineStoreServiceDummy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_engine_v1_OfflineStoreServiceDummy_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+chalk/engine/v1/offline_store_service." +
      "proto\022\017chalk.engine.v1\032\037chalk/auth/v1/pe" +
      "rmissions.proto\032\037chalk/common/v1/query_l" +
      "og.proto\032\"chalk/common/v1/query_values.p" +
      "roto\"\032\n\030OfflineStoreServiceDummy2\361\001\n\023Off" +
      "lineStoreService\022r\n\022GetQueryLogEntries\022*" +
      ".chalk.common.v1.GetQueryLogEntriesReque" +
      "st\032+.chalk.common.v1.GetQueryLogEntriesR" +
      "esponse\"\003\200}\004\022f\n\016GetQueryValues\022&.chalk.c" +
      "ommon.v1.GetQueryValuesRequest\032\'.chalk.c" +
      "ommon.v1.GetQueryValuesResponse\"\003\200}\004B\231\001\n" +
      "\037ai.chalk.protos.chalk.engine.v1B\030Offlin" +
      "eStoreServiceProtoP\001\242\002\003CEX\252\002\017Chalk.Engin" +
      "e.V1\312\002\017Chalk\\Engine\\V1\342\002\033Chalk\\Engine\\V1" +
      "\\GPBMetadata\352\002\021Chalk::Engine::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          ai.chalk.protos.chalk.auth.v1.PermissionsProto.getDescriptor(),
          ai.chalk.protos.chalk.common.v1.QueryLogProto.getDescriptor(),
          ai.chalk.protos.chalk.common.v1.QueryValuesProto.getDescriptor(),
        });
    internal_static_chalk_engine_v1_OfflineStoreServiceDummy_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_chalk_engine_v1_OfflineStoreServiceDummy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_engine_v1_OfflineStoreServiceDummy_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(ai.chalk.protos.chalk.auth.v1.PermissionsProto.permission);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    ai.chalk.protos.chalk.auth.v1.PermissionsProto.getDescriptor();
    ai.chalk.protos.chalk.common.v1.QueryLogProto.getDescriptor();
    ai.chalk.protos.chalk.common.v1.QueryValuesProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
