// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/team.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.chalk.server.v1;

public interface CreateEnvironmentRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.CreateEnvironmentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string project_id = 1 [json_name = "projectId"];</code>
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   * <code>string project_id = 1 [json_name = "projectId"];</code>
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();

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
   * <pre>
   * service_url,
   * worker_url,
   * branch_url,
   * source_bundle_bucket,
   * offline_store_secret
   * </pre>
   *
   * <code>bool is_default = 3 [json_name = "isDefault"];</code>
   * @return The isDefault.
   */
  boolean getIsDefault();
}
