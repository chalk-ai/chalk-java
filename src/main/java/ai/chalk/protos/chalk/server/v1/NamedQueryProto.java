// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/named_query.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

public final class NamedQueryProto {
  private NamedQueryProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_GetAllNamedQueriesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_GetAllNamedQueriesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_GetNamedQueryByNameRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_GetNamedQueryByNameRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_GetNamedQueryByNameResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_GetNamedQueryByNameResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_GetAllNamedQueriesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_GetAllNamedQueriesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_GetAllNamedQueriesActiveDeploymentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_GetAllNamedQueriesActiveDeploymentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_GetAllNamedQueriesActiveDeploymentResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_GetAllNamedQueriesActiveDeploymentResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!chalk/server/v1/named_query.proto\022\017cha" +
      "lk.server.v1\032\037chalk/auth/v1/permissions." +
      "proto\032\032chalk/graph/v1/graph.proto\"@\n\031Get" +
      "AllNamedQueriesRequest\022#\n\rdeployment_id\030" +
      "\001 \001(\tR\014deploymentId\"0\n\032GetNamedQueryByNa" +
      "meRequest\022\022\n\004name\030\001 \001(\tR\004name\"^\n\033GetName" +
      "dQueryByNameResponse\022?\n\rnamed_queries\030\001 " +
      "\003(\0132\032.chalk.graph.v1.NamedQueryR\014namedQu" +
      "eries\"]\n\032GetAllNamedQueriesResponse\022?\n\rn" +
      "amed_queries\030\001 \003(\0132\032.chalk.graph.v1.Name" +
      "dQueryR\014namedQueries\"+\n)GetAllNamedQueri" +
      "esActiveDeploymentRequest\"m\n*GetAllNamed" +
      "QueriesActiveDeploymentResponse\022?\n\rnamed" +
      "_queries\030\001 \003(\0132\032.chalk.graph.v1.NamedQue" +
      "ryR\014namedQueries2\254\003\n\021NamedQueryService\022u" +
      "\n\022GetAllNamedQueries\022*.chalk.server.v1.G" +
      "etAllNamedQueriesRequest\032+.chalk.server." +
      "v1.GetAllNamedQueriesResponse\"\006\220\002\001\200}\013\022\245\001" +
      "\n\"GetAllNamedQueriesActiveDeployment\022:.c" +
      "halk.server.v1.GetAllNamedQueriesActiveD" +
      "eploymentRequest\032;.chalk.server.v1.GetAl" +
      "lNamedQueriesActiveDeploymentResponse\"\006\220" +
      "\002\001\200}\013\022x\n\023GetNamedQueryByName\022+.chalk.ser" +
      "ver.v1.GetNamedQueryByNameRequest\032,.chal" +
      "k.server.v1.GetNamedQueryByNameResponse\"" +
      "\006\220\002\001\200}\013B\244\001\n\037ai.chalk.protos.chalk.server" +
      ".v1B\017NamedQueryProtoP\001Z\022server/v1;server" +
      "v1\242\002\003CSX\252\002\017Chalk.Server.V1\312\002\017Chalk\\Serve" +
      "r\\V1\342\002\033Chalk\\Server\\V1\\GPBMetadata\352\002\021Cha" +
      "lk::Server::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          ai.chalk.protos.chalk.auth.v1.PermissionsProto.getDescriptor(),
          ai.chalk.protos.chalk.graph.v1.GraphProto.getDescriptor(),
        });
    internal_static_chalk_server_v1_GetAllNamedQueriesRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_chalk_server_v1_GetAllNamedQueriesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_GetAllNamedQueriesRequest_descriptor,
        new java.lang.String[] { "DeploymentId", });
    internal_static_chalk_server_v1_GetNamedQueryByNameRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_chalk_server_v1_GetNamedQueryByNameRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_GetNamedQueryByNameRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_chalk_server_v1_GetNamedQueryByNameResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_chalk_server_v1_GetNamedQueryByNameResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_GetNamedQueryByNameResponse_descriptor,
        new java.lang.String[] { "NamedQueries", });
    internal_static_chalk_server_v1_GetAllNamedQueriesResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_chalk_server_v1_GetAllNamedQueriesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_GetAllNamedQueriesResponse_descriptor,
        new java.lang.String[] { "NamedQueries", });
    internal_static_chalk_server_v1_GetAllNamedQueriesActiveDeploymentRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_chalk_server_v1_GetAllNamedQueriesActiveDeploymentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_GetAllNamedQueriesActiveDeploymentRequest_descriptor,
        new java.lang.String[] { });
    internal_static_chalk_server_v1_GetAllNamedQueriesActiveDeploymentResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_chalk_server_v1_GetAllNamedQueriesActiveDeploymentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_GetAllNamedQueriesActiveDeploymentResponse_descriptor,
        new java.lang.String[] { "NamedQueries", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(ai.chalk.protos.chalk.auth.v1.PermissionsProto.permission);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    ai.chalk.protos.chalk.auth.v1.PermissionsProto.getDescriptor();
    ai.chalk.protos.chalk.graph.v1.GraphProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
