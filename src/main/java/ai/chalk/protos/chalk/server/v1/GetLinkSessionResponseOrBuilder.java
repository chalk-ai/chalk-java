// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/link.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.chalk.server.v1;

public interface GetLinkSessionResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.GetLinkSessionResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.chalk.server.v1.LinkSessionStatus status = 1 [json_name = "status"];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.chalk.server.v1.LinkSessionStatus status = 1 [json_name = "status"];</code>
   * @return The status.
   */
  ai.chalk.protos.chalk.server.v1.LinkSessionStatus getStatus();

  /**
   * <code>string message = 2 [json_name = "message"];</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <code>string message = 2 [json_name = "message"];</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <code>optional .chalk.server.v1.LinkToken token = 3 [json_name = "token"];</code>
   * @return Whether the token field is set.
   */
  boolean hasToken();
  /**
   * <code>optional .chalk.server.v1.LinkToken token = 3 [json_name = "token"];</code>
   * @return The token.
   */
  ai.chalk.protos.chalk.server.v1.LinkToken getToken();
  /**
   * <code>optional .chalk.server.v1.LinkToken token = 3 [json_name = "token"];</code>
   */
  ai.chalk.protos.chalk.server.v1.LinkTokenOrBuilder getTokenOrBuilder();
}