// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/team.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.chalk.server.v1;

public interface PermissionDescriptionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.PermissionDescription)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.chalk.auth.v1.Permission id = 1 [json_name = "id"];</code>
   * @return The enum numeric value on the wire for id.
   */
  int getIdValue();
  /**
   * <code>.chalk.auth.v1.Permission id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  ai.chalk.protos.chalk.auth.v1.Permission getId();

  /**
   * <code>string slug = 2 [json_name = "slug"];</code>
   * @return The slug.
   */
  java.lang.String getSlug();
  /**
   * <code>string slug = 2 [json_name = "slug"];</code>
   * @return The bytes for slug.
   */
  com.google.protobuf.ByteString
      getSlugBytes();

  /**
   * <code>string namespace = 3 [json_name = "namespace"];</code>
   * @return The namespace.
   */
  java.lang.String getNamespace();
  /**
   * <code>string namespace = 3 [json_name = "namespace"];</code>
   * @return The bytes for namespace.
   */
  com.google.protobuf.ByteString
      getNamespaceBytes();

  /**
   * <code>string name = 4 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 4 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string description = 5 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 5 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();
}
