// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/link.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.chalk.server.v1;

public interface GetLinkSessionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.GetLinkSessionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string link_code = 1 [json_name = "linkCode"];</code>
   * @return The linkCode.
   */
  java.lang.String getLinkCode();
  /**
   * <code>string link_code = 1 [json_name = "linkCode"];</code>
   * @return The bytes for linkCode.
   */
  com.google.protobuf.ByteString
      getLinkCodeBytes();

  /**
   * <code>string project_name = 2 [json_name = "projectName"];</code>
   * @return The projectName.
   */
  java.lang.String getProjectName();
  /**
   * <code>string project_name = 2 [json_name = "projectName"];</code>
   * @return The bytes for projectName.
   */
  com.google.protobuf.ByteString
      getProjectNameBytes();
}
