// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/auth.proto
// Protobuf Java Version: 4.26.1

package ai.chalk.protos.chalk.server.v1;

public final class AuthProto {
  private AuthProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      AuthProto.class.getName());
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
    internal_static_chalk_server_v1_GetTokenRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chalk_server_v1_GetTokenRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_GetTokenResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chalk_server_v1_GetTokenResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_GetTokenResponse_EnginesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chalk_server_v1_GetTokenResponse_EnginesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_GetTokenResponse_GrpcEnginesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chalk_server_v1_GetTokenResponse_GrpcEnginesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_GetTokenResponse_EnvironmentIdToNameEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chalk_server_v1_GetTokenResponse_EnvironmentIdToNameEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_UpdateLinkSessionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chalk_server_v1_UpdateLinkSessionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_UpdateLinkSessionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chalk_server_v1_UpdateLinkSessionResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032chalk/server/v1/auth.proto\022\017chalk.serv" +
      "er.v1\032\037chalk/auth/v1/permissions.proto\032\032" +
      "chalk/server/v1/link.proto\032\037google/proto" +
      "buf/timestamp.proto\"\227\001\n\017GetTokenRequest\022" +
      "\033\n\tclient_id\030\001 \001(\tR\010clientId\022#\n\rclient_s" +
      "ecret\030\002 \001(\tR\014clientSecret\022\035\n\ngrant_type\030" +
      "\003 \001(\tR\tgrantType\022\031\n\005scope\030\004 \001(\tH\000R\005scope" +
      "\210\001\001B\010\n\006_scope\"\361\005\n\020GetTokenResponse\022!\n\014ac" +
      "cess_token\030\001 \001(\tR\013accessToken\022\035\n\ntoken_t" +
      "ype\030\002 \001(\tR\ttokenType\022\035\n\nexpires_in\030\003 \001(\005" +
      "R\texpiresIn\0229\n\nexpires_at\030\004 \001(\0132\032.google" +
      ".protobuf.TimestampR\texpiresAt\022\035\n\napi_se" +
      "rver\030\005 \001(\tR\tapiServer\0224\n\023primary_environ" +
      "ment\030\006 \001(\tH\000R\022primaryEnvironment\210\001\001\022H\n\007e" +
      "ngines\030\007 \003(\0132..chalk.server.v1.GetTokenR" +
      "esponse.EnginesEntryR\007engines\022U\n\014grpc_en" +
      "gines\030\010 \003(\01322.chalk.server.v1.GetTokenRe" +
      "sponse.GrpcEnginesEntryR\013grpcEngines\022o\n\026" +
      "environment_id_to_name\030\t \003(\0132:.chalk.ser" +
      "ver.v1.GetTokenResponse.EnvironmentIdToN" +
      "ameEntryR\023environmentIdToName\032:\n\014Engines" +
      "Entry\022\020\n\003key\030\001 \001(\tR\003key\022\024\n\005value\030\002 \001(\tR\005" +
      "value:\0028\001\032>\n\020GrpcEnginesEntry\022\020\n\003key\030\001 \001" +
      "(\tR\003key\022\024\n\005value\030\002 \001(\tR\005value:\0028\001\032F\n\030Env" +
      "ironmentIdToNameEntry\022\020\n\003key\030\001 \001(\tR\003key\022" +
      "\024\n\005value\030\002 \001(\tR\005value:\0028\001B\026\n\024_primary_en" +
      "vironment\"j\n\030UpdateLinkSessionRequest\022\026\n" +
      "\006status\030\001 \001(\tR\006status\022\027\n\007user_id\030\002 \001(\tR\006" +
      "userId\022\035\n\nsession_id\030\003 \001(\tR\tsessionId\"+\n" +
      "\031UpdateLinkSessionResponse\022\016\n\002id\030\001 \001(\tR\002" +
      "id2\255\003\n\013AuthService\022T\n\010GetToken\022 .chalk.s" +
      "erver.v1.GetTokenRequest\032!.chalk.server." +
      "v1.GetTokenResponse\"\003\200}\001\022o\n\021CreateLinkSe" +
      "ssion\022).chalk.server.v1.CreateLinkSessio" +
      "nRequest\032*.chalk.server.v1.CreateLinkSes" +
      "sionResponse\"\003\200}\001\022f\n\016GetLinkSession\022&.ch" +
      "alk.server.v1.GetLinkSessionRequest\032\'.ch" +
      "alk.server.v1.GetLinkSessionResponse\"\003\200}" +
      "\001\022o\n\021UpdateLinkSession\022).chalk.server.v1" +
      ".UpdateLinkSessionRequest\032*.chalk.server" +
      ".v1.UpdateLinkSessionResponse\"\003\200}\001B\236\001\n\037a" +
      "i.chalk.protos.chalk.server.v1B\tAuthProt" +
      "oP\001Z\022server/v1;serverv1\242\002\003CSX\252\002\017Chalk.Se" +
      "rver.V1\312\002\017Chalk\\Server\\V1\342\002\033Chalk\\Server" +
      "\\V1\\GPBMetadata\352\002\021Chalk::Server::V1b\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          ai.chalk.protos.chalk.auth.v1.PermissionsProto.getDescriptor(),
          ai.chalk.protos.chalk.server.v1.LinkProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_chalk_server_v1_GetTokenRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_chalk_server_v1_GetTokenRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chalk_server_v1_GetTokenRequest_descriptor,
        new java.lang.String[] { "ClientId", "ClientSecret", "GrantType", "Scope", });
    internal_static_chalk_server_v1_GetTokenResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_chalk_server_v1_GetTokenResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chalk_server_v1_GetTokenResponse_descriptor,
        new java.lang.String[] { "AccessToken", "TokenType", "ExpiresIn", "ExpiresAt", "ApiServer", "PrimaryEnvironment", "Engines", "GrpcEngines", "EnvironmentIdToName", });
    internal_static_chalk_server_v1_GetTokenResponse_EnginesEntry_descriptor =
      internal_static_chalk_server_v1_GetTokenResponse_descriptor.getNestedTypes().get(0);
    internal_static_chalk_server_v1_GetTokenResponse_EnginesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chalk_server_v1_GetTokenResponse_EnginesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_chalk_server_v1_GetTokenResponse_GrpcEnginesEntry_descriptor =
      internal_static_chalk_server_v1_GetTokenResponse_descriptor.getNestedTypes().get(1);
    internal_static_chalk_server_v1_GetTokenResponse_GrpcEnginesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chalk_server_v1_GetTokenResponse_GrpcEnginesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_chalk_server_v1_GetTokenResponse_EnvironmentIdToNameEntry_descriptor =
      internal_static_chalk_server_v1_GetTokenResponse_descriptor.getNestedTypes().get(2);
    internal_static_chalk_server_v1_GetTokenResponse_EnvironmentIdToNameEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chalk_server_v1_GetTokenResponse_EnvironmentIdToNameEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_chalk_server_v1_UpdateLinkSessionRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_chalk_server_v1_UpdateLinkSessionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chalk_server_v1_UpdateLinkSessionRequest_descriptor,
        new java.lang.String[] { "Status", "UserId", "SessionId", });
    internal_static_chalk_server_v1_UpdateLinkSessionResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_chalk_server_v1_UpdateLinkSessionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chalk_server_v1_UpdateLinkSessionResponse_descriptor,
        new java.lang.String[] { "Id", });
    descriptor.resolveAllFeaturesImmutable();
    ai.chalk.protos.chalk.auth.v1.PermissionsProto.getDescriptor();
    ai.chalk.protos.chalk.server.v1.LinkProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(ai.chalk.protos.chalk.auth.v1.PermissionsProto.permission);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
  }

  // @@protoc_insertion_point(outer_class_scope)
}