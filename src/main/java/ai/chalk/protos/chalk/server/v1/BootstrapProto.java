// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/bootstrap.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

public final class BootstrapProto {
  private BootstrapProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_BootstrapExtraSettingsEnvironment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_BootstrapExtraSettingsEnvironment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_BootstrapExtraSettingsEnvironment_SettingsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_BootstrapExtraSettingsEnvironment_SettingsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_BootstrapExtraSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_BootstrapExtraSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_BootstrapExtraSettings_GlobalEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_BootstrapExtraSettings_GlobalEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_BootstrapExtraSettings_EnvironmentsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_BootstrapExtraSettings_EnvironmentsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chalk_server_v1_ParsedBootstrapConfigs_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chalk_server_v1_ParsedBootstrapConfigs_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037chalk/server/v1/bootstrap.proto\022\017chalk" +
      ".server.v1\032!chalk/server/v1/environment." +
      "proto\032\032chalk/server/v1/team.proto\"\276\001\n!Bo" +
      "otstrapExtraSettingsEnvironment\022\\\n\010setti" +
      "ngs\030\001 \003(\0132@.chalk.server.v1.BootstrapExt" +
      "raSettingsEnvironment.SettingsEntryR\010set" +
      "tings\032;\n\rSettingsEntry\022\020\n\003key\030\001 \001(\tR\003key" +
      "\022\024\n\005value\030\002 \001(\010R\005value:\0028\001\"\364\002\n\026Bootstrap" +
      "ExtraSettings\022K\n\006global\030\001 \003(\01323.chalk.se" +
      "rver.v1.BootstrapExtraSettings.GlobalEnt" +
      "ryR\006global\022]\n\014environments\030\002 \003(\01329.chalk" +
      ".server.v1.BootstrapExtraSettings.Enviro" +
      "nmentsEntryR\014environments\0329\n\013GlobalEntry" +
      "\022\020\n\003key\030\001 \001(\tR\003key\022\024\n\005value\030\002 \001(\010R\005value" +
      ":\0028\001\032s\n\021EnvironmentsEntry\022\020\n\003key\030\001 \001(\tR\003" +
      "key\022H\n\005value\030\002 \001(\01322.chalk.server.v1.Boo" +
      "tstrapExtraSettingsEnvironmentR\005value:\0028" +
      "\001\"\315\002\n\026ParsedBootstrapConfigs\022+\n\005teams\030\001 " +
      "\003(\0132\025.chalk.server.v1.TeamR\005teams\0224\n\010pro" +
      "jects\030\002 \003(\0132\030.chalk.server.v1.ProjectR\010p" +
      "rojects\022@\n\014environments\030\003 \003(\0132\034.chalk.se" +
      "rver.v1.EnvironmentR\014environments\022>\n\014tea" +
      "m_invites\030\004 \003(\0132\033.chalk.server.v1.TeamIn" +
      "viteR\013teamInvites\022N\n\016extra_settings\030\005 \001(" +
      "\0132\'.chalk.server.v1.BootstrapExtraSettin" +
      "gsR\rextraSettingsB\243\001\n\037ai.chalk.protos.ch" +
      "alk.server.v1B\016BootstrapProtoP\001Z\022server/" +
      "v1;serverv1\242\002\003CSX\252\002\017Chalk.Server.V1\312\002\017Ch" +
      "alk\\Server\\V1\342\002\033Chalk\\Server\\V1\\GPBMetad" +
      "ata\352\002\021Chalk::Server::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          ai.chalk.protos.chalk.server.v1.EnvironmentProto.getDescriptor(),
          ai.chalk.protos.chalk.server.v1.TeamProto.getDescriptor(),
        });
    internal_static_chalk_server_v1_BootstrapExtraSettingsEnvironment_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_chalk_server_v1_BootstrapExtraSettingsEnvironment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_BootstrapExtraSettingsEnvironment_descriptor,
        new java.lang.String[] { "Settings", });
    internal_static_chalk_server_v1_BootstrapExtraSettingsEnvironment_SettingsEntry_descriptor =
      internal_static_chalk_server_v1_BootstrapExtraSettingsEnvironment_descriptor.getNestedTypes().get(0);
    internal_static_chalk_server_v1_BootstrapExtraSettingsEnvironment_SettingsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_BootstrapExtraSettingsEnvironment_SettingsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_chalk_server_v1_BootstrapExtraSettings_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_chalk_server_v1_BootstrapExtraSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_BootstrapExtraSettings_descriptor,
        new java.lang.String[] { "Global", "Environments", });
    internal_static_chalk_server_v1_BootstrapExtraSettings_GlobalEntry_descriptor =
      internal_static_chalk_server_v1_BootstrapExtraSettings_descriptor.getNestedTypes().get(0);
    internal_static_chalk_server_v1_BootstrapExtraSettings_GlobalEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_BootstrapExtraSettings_GlobalEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_chalk_server_v1_BootstrapExtraSettings_EnvironmentsEntry_descriptor =
      internal_static_chalk_server_v1_BootstrapExtraSettings_descriptor.getNestedTypes().get(1);
    internal_static_chalk_server_v1_BootstrapExtraSettings_EnvironmentsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_BootstrapExtraSettings_EnvironmentsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_chalk_server_v1_ParsedBootstrapConfigs_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_chalk_server_v1_ParsedBootstrapConfigs_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chalk_server_v1_ParsedBootstrapConfigs_descriptor,
        new java.lang.String[] { "Teams", "Projects", "Environments", "TeamInvites", "ExtraSettings", });
    ai.chalk.protos.chalk.server.v1.EnvironmentProto.getDescriptor();
    ai.chalk.protos.chalk.server.v1.TeamProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
