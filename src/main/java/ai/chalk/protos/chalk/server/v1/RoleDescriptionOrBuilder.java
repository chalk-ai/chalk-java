// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/team.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

public interface RoleDescriptionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.RoleDescription)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>repeated .chalk.auth.v1.Permission permissions = 4 [json_name = "permissions"];</code>
   * @return A list containing the permissions.
   */
  java.util.List<ai.chalk.protos.chalk.auth.v1.Permission> getPermissionsList();
  /**
   * <code>repeated .chalk.auth.v1.Permission permissions = 4 [json_name = "permissions"];</code>
   * @return The count of permissions.
   */
  int getPermissionsCount();
  /**
   * <code>repeated .chalk.auth.v1.Permission permissions = 4 [json_name = "permissions"];</code>
   * @param index The index of the element to return.
   * @return The permissions at the given index.
   */
  ai.chalk.protos.chalk.auth.v1.Permission getPermissions(int index);
  /**
   * <code>repeated .chalk.auth.v1.Permission permissions = 4 [json_name = "permissions"];</code>
   * @return A list containing the enum numeric values on the wire for permissions.
   */
  java.util.List<java.lang.Integer>
  getPermissionsValueList();
  /**
   * <code>repeated .chalk.auth.v1.Permission permissions = 4 [json_name = "permissions"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of permissions at the given index.
   */
  int getPermissionsValue(int index);

  /**
   * <code>.chalk.auth.v1.FeaturePermissions feature_permissions = 5 [json_name = "featurePermissions"];</code>
   * @return Whether the featurePermissions field is set.
   */
  boolean hasFeaturePermissions();
  /**
   * <code>.chalk.auth.v1.FeaturePermissions feature_permissions = 5 [json_name = "featurePermissions"];</code>
   * @return The featurePermissions.
   */
  ai.chalk.protos.chalk.auth.v1.FeaturePermissions getFeaturePermissions();
  /**
   * <code>.chalk.auth.v1.FeaturePermissions feature_permissions = 5 [json_name = "featurePermissions"];</code>
   */
  ai.chalk.protos.chalk.auth.v1.FeaturePermissionsOrBuilder getFeaturePermissionsOrBuilder();

  /**
   * <code>bool is_default = 6 [json_name = "isDefault"];</code>
   * @return The isDefault.
   */
  boolean getIsDefault();
}
