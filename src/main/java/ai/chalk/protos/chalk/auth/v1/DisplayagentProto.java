// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/auth/v1/displayagent.proto
// Protobuf Java Version: 4.26.1

package ai.chalk.protos.chalk.auth.v1;

public final class DisplayagentProto {
  private DisplayagentProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      DisplayagentProto.class.getName());
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
    internal_static_chalk_auth_v1_DisplayPermission_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chalk_auth_v1_DisplayPermission_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_auth_v1_DisplayEnvironmentPermissions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chalk_auth_v1_DisplayEnvironmentPermissions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_auth_v1_DisplayUserAgent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chalk_auth_v1_DisplayUserAgent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_auth_v1_DisplayCustomClaim_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chalk_auth_v1_DisplayCustomClaim_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_auth_v1_DisplayServiceTokenAgent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chalk_auth_v1_DisplayServiceTokenAgent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_auth_v1_DisplayEngineAgent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chalk_auth_v1_DisplayEngineAgent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_auth_v1_DisplayTenantAgent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chalk_auth_v1_DisplayTenantAgent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_auth_v1_DisplayAgent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chalk_auth_v1_DisplayAgent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n chalk/auth/v1/displayagent.proto\022\rchal" +
      "k.auth.v1\032\037chalk/auth/v1/permissions.pro" +
      "to\"b\n\021DisplayPermission\022\022\n\004name\030\001 \001(\tR\004n" +
      "ame\0229\n\npermission\030\002 \001(\0162\031.chalk.auth.v1." +
      "PermissionR\npermission\"\367\001\n\035DisplayEnviro" +
      "nmentPermissions\022%\n\016environment_id\030\001 \001(\t" +
      "R\renvironmentId\022)\n\020environment_name\030\002 \001(" +
      "\tR\017environmentName\022\035\n\nproject_id\030\003 \001(\tR\t" +
      "projectId\022!\n\014project_name\030\004 \001(\tR\013project" +
      "Name\022B\n\013permissions\030\005 \003(\0132 .chalk.auth.v" +
      "1.DisplayPermissionR\013permissions\"\274\002\n\020Dis" +
      "playUserAgent\022\037\n\tclient_id\030\001 \001(\tB\002\030\001R\010cl" +
      "ientId\022\027\n\007user_id\030\002 \001(\tR\006userId\022\027\n\007team_" +
      "id\030\003 \001(\tR\006teamId\022j\n\032permissions_by_envir" +
      "onment\030\004 \003(\0132,.chalk.auth.v1.DisplayEnvi" +
      "ronmentPermissionsR\030permissionsByEnviron" +
      "ment\022\"\n\014impersonated\030\005 \001(\010R\014impersonated" +
      "\022\022\n\004name\030\006 \001(\tR\004name\022\024\n\005email\030\007 \001(\tR\005ema" +
      "il\022\033\n\tteam_name\030\010 \001(\tR\010teamName\">\n\022Displ" +
      "ayCustomClaim\022\020\n\003key\030\001 \001(\tR\003key\022\026\n\006value" +
      "s\030\002 \003(\tR\006values\"\265\003\n\030DisplayServiceTokenA" +
      "gent\022\016\n\002id\030\001 \001(\tR\002id\022\033\n\tclient_id\030\002 \001(\tR" +
      "\010clientId\022\027\n\007team_id\030\003 \001(\tR\006teamId\022\035\n\npr" +
      "oject_id\030\004 \001(\tR\tprojectId\022%\n\016environment" +
      "_id\030\005 \001(\tR\renvironmentId\022B\n\013permissions\030" +
      "\006 \003(\0132 .chalk.auth.v1.DisplayPermissionR" +
      "\013permissions\022\022\n\004name\030\007 \001(\tR\004name\022\033\n\tteam" +
      "_name\030\010 \001(\tR\010teamName\022!\n\014project_name\030\t " +
      "\001(\tR\013projectName\022)\n\020environment_name\030\n \001" +
      "(\tR\017environmentName\022J\n\017customer_claims\030\013" +
      " \003(\0132!.chalk.auth.v1.DisplayCustomClaimR" +
      "\016customerClaims\"\222\002\n\022DisplayEngineAgent\022\016" +
      "\n\002id\030\001 \001(\tR\002id\022\027\n\007team_id\030\002 \001(\tR\006teamId\022" +
      "\035\n\nproject_id\030\003 \001(\tR\tprojectId\022%\n\016enviro" +
      "nment_id\030\004 \001(\tR\renvironmentId\022\"\n\014imperso" +
      "nated\030\005 \001(\010R\014impersonated\022\033\n\tteam_name\030\006" +
      " \001(\tR\010teamName\022!\n\014project_name\030\007 \001(\tR\013pr" +
      "ojectName\022)\n\020environment_name\030\010 \001(\tR\017env" +
      "ironmentName\"\024\n\022DisplayTenantAgent\"\304\002\n\014D" +
      "isplayAgent\022@\n\nuser_agent\030\001 \001(\0132\037.chalk." +
      "auth.v1.DisplayUserAgentH\000R\tuserAgent\022Y\n" +
      "\023service_token_agent\030\002 \001(\0132\'.chalk.auth." +
      "v1.DisplayServiceTokenAgentH\000R\021serviceTo" +
      "kenAgent\022F\n\014engine_agent\030\003 \001(\0132!.chalk.a" +
      "uth.v1.DisplayEngineAgentH\000R\013engineAgent" +
      "\022F\n\014tenant_agent\030\004 \001(\0132!.chalk.auth.v1.D" +
      "isplayTenantAgentH\000R\013tenantAgentB\007\n\005agen" +
      "tB\230\001\n\035ai.chalk.protos.chalk.auth.v1B\021Dis" +
      "playagentProtoP\001Z\016auth/v1;authv1\242\002\003CAX\252\002" +
      "\rChalk.Auth.V1\312\002\rChalk\\Auth\\V1\342\002\031Chalk\\A" +
      "uth\\V1\\GPBMetadata\352\002\017Chalk::Auth::V1b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          ai.chalk.protos.chalk.auth.v1.PermissionsProto.getDescriptor(),
        });
    internal_static_chalk_auth_v1_DisplayPermission_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_chalk_auth_v1_DisplayPermission_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chalk_auth_v1_DisplayPermission_descriptor,
        new java.lang.String[] { "Name", "Permission", });
    internal_static_chalk_auth_v1_DisplayEnvironmentPermissions_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_chalk_auth_v1_DisplayEnvironmentPermissions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chalk_auth_v1_DisplayEnvironmentPermissions_descriptor,
        new java.lang.String[] { "EnvironmentId", "EnvironmentName", "ProjectId", "ProjectName", "Permissions", });
    internal_static_chalk_auth_v1_DisplayUserAgent_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_chalk_auth_v1_DisplayUserAgent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chalk_auth_v1_DisplayUserAgent_descriptor,
        new java.lang.String[] { "ClientId", "UserId", "TeamId", "PermissionsByEnvironment", "Impersonated", "Name", "Email", "TeamName", });
    internal_static_chalk_auth_v1_DisplayCustomClaim_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_chalk_auth_v1_DisplayCustomClaim_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chalk_auth_v1_DisplayCustomClaim_descriptor,
        new java.lang.String[] { "Key", "Values", });
    internal_static_chalk_auth_v1_DisplayServiceTokenAgent_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_chalk_auth_v1_DisplayServiceTokenAgent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chalk_auth_v1_DisplayServiceTokenAgent_descriptor,
        new java.lang.String[] { "Id", "ClientId", "TeamId", "ProjectId", "EnvironmentId", "Permissions", "Name", "TeamName", "ProjectName", "EnvironmentName", "CustomerClaims", });
    internal_static_chalk_auth_v1_DisplayEngineAgent_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_chalk_auth_v1_DisplayEngineAgent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chalk_auth_v1_DisplayEngineAgent_descriptor,
        new java.lang.String[] { "Id", "TeamId", "ProjectId", "EnvironmentId", "Impersonated", "TeamName", "ProjectName", "EnvironmentName", });
    internal_static_chalk_auth_v1_DisplayTenantAgent_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_chalk_auth_v1_DisplayTenantAgent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chalk_auth_v1_DisplayTenantAgent_descriptor,
        new java.lang.String[] { });
    internal_static_chalk_auth_v1_DisplayAgent_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_chalk_auth_v1_DisplayAgent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chalk_auth_v1_DisplayAgent_descriptor,
        new java.lang.String[] { "UserAgent", "ServiceTokenAgent", "EngineAgent", "TenantAgent", "Agent", });
    descriptor.resolveAllFeaturesImmutable();
    ai.chalk.protos.chalk.auth.v1.PermissionsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}