// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/auth/v1/displayagent.proto

// Protobuf Java Version: 3.25.3
package ai.chalk.protos.chalk.auth.v1;

public interface DisplayPermissionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.auth.v1.DisplayPermission)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.chalk.auth.v1.Permission permission = 2 [json_name = "permission"];</code>
   * @return The enum numeric value on the wire for permission.
   */
  int getPermissionValue();
  /**
   * <code>.chalk.auth.v1.Permission permission = 2 [json_name = "permission"];</code>
   * @return The permission.
   */
  ai.chalk.protos.chalk.auth.v1.Permission getPermission();
}
