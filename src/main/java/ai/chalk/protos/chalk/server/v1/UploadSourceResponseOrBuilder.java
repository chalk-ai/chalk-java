// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/builder.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

public interface UploadSourceResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.UploadSourceResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string status = 1 [json_name = "status"];</code>
   * @return The status.
   */
  java.lang.String getStatus();
  /**
   * <code>string status = 1 [json_name = "status"];</code>
   * @return The bytes for status.
   */
  com.google.protobuf.ByteString
      getStatusBytes();

  /**
   * <code>string progress_url = 2 [json_name = "progressUrl"];</code>
   * @return The progressUrl.
   */
  java.lang.String getProgressUrl();
  /**
   * <code>string progress_url = 2 [json_name = "progressUrl"];</code>
   * @return The bytes for progressUrl.
   */
  com.google.protobuf.ByteString
      getProgressUrlBytes();
}