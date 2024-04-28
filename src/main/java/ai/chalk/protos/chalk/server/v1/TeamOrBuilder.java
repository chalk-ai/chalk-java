// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/team.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.chalk.server.v1;

public interface TeamOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.Team)
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
   * <code>string slug = 3 [json_name = "slug"];</code>
   * @return The slug.
   */
  java.lang.String getSlug();
  /**
   * <code>string slug = 3 [json_name = "slug"];</code>
   * @return The bytes for slug.
   */
  com.google.protobuf.ByteString
      getSlugBytes();

  /**
   * <code>optional string logo = 4 [json_name = "logo"];</code>
   * @return Whether the logo field is set.
   */
  boolean hasLogo();
  /**
   * <code>optional string logo = 4 [json_name = "logo"];</code>
   * @return The logo.
   */
  java.lang.String getLogo();
  /**
   * <code>optional string logo = 4 [json_name = "logo"];</code>
   * @return The bytes for logo.
   */
  com.google.protobuf.ByteString
      getLogoBytes();

  /**
   * <code>repeated .chalk.server.v1.Project projects = 5 [json_name = "projects"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.server.v1.Project> 
      getProjectsList();
  /**
   * <code>repeated .chalk.server.v1.Project projects = 5 [json_name = "projects"];</code>
   */
  ai.chalk.protos.chalk.server.v1.Project getProjects(int index);
  /**
   * <code>repeated .chalk.server.v1.Project projects = 5 [json_name = "projects"];</code>
   */
  int getProjectsCount();
  /**
   * <code>repeated .chalk.server.v1.Project projects = 5 [json_name = "projects"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.server.v1.ProjectOrBuilder> 
      getProjectsOrBuilderList();
  /**
   * <code>repeated .chalk.server.v1.Project projects = 5 [json_name = "projects"];</code>
   */
  ai.chalk.protos.chalk.server.v1.ProjectOrBuilder getProjectsOrBuilder(
      int index);
}
