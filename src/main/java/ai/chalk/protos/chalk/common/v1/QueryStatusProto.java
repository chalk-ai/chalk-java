// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/common/v1/query_status.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.common.v1;

public final class QueryStatusProto {
  private QueryStatusProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"chalk/common/v1/query_status.proto\022\017ch" +
      "alk.common.v1*\243\002\n\013QueryStatus\022\034\n\030QUERY_S" +
      "TATUS_UNSPECIFIED\020\000\022#\n\037QUERY_STATUS_PEND" +
      "ING_SUBMISSION\020\001\022\032\n\026QUERY_STATUS_SUBMITT" +
      "ED\020\002\022\030\n\024QUERY_STATUS_RUNNING\020\003\022\026\n\022QUERY_" +
      "STATUS_ERROR\020\004\022\030\n\024QUERY_STATUS_EXPIRED\020\005" +
      "\022\032\n\026QUERY_STATUS_CANCELLED\020\006\022\033\n\027QUERY_ST" +
      "ATUS_SUCCESSFUL\020\007\0220\n,QUERY_STATUS_SUCCES" +
      "SFUL_WITH_NONFATAL_ERRORS\020\010B\221\001\n\037ai.chalk" +
      ".protos.chalk.common.v1B\020QueryStatusProt" +
      "oP\001\242\002\003CCX\252\002\017Chalk.Common.V1\312\002\017Chalk\\Comm" +
      "on\\V1\342\002\033Chalk\\Common\\V1\\GPBMetadata\352\002\021Ch" +
      "alk::Common::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
