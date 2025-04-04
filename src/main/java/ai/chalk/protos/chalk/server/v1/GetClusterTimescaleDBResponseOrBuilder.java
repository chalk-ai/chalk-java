// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/builder.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

public interface GetClusterTimescaleDBResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.GetClusterTimescaleDBResponse)
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
   * <pre>
   * use specs instead
   * </pre>
   *
   * <code>string specs_string = 2 [json_name = "specsString", deprecated = true];</code>
   * @deprecated chalk.server.v1.GetClusterTimescaleDBResponse.specs_string is deprecated.
   *     See chalk/server/v1/builder.proto;l=130
   * @return The specsString.
   */
  @java.lang.Deprecated java.lang.String getSpecsString();
  /**
   * <pre>
   * use specs instead
   * </pre>
   *
   * <code>string specs_string = 2 [json_name = "specsString", deprecated = true];</code>
   * @deprecated chalk.server.v1.GetClusterTimescaleDBResponse.specs_string is deprecated.
   *     See chalk/server/v1/builder.proto;l=130
   * @return The bytes for specsString.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getSpecsStringBytes();

  /**
   * <code>.google.protobuf.Timestamp created_at = 3 [json_name = "createdAt"];</code>
   * @return Whether the createdAt field is set.
   */
  boolean hasCreatedAt();
  /**
   * <code>.google.protobuf.Timestamp created_at = 3 [json_name = "createdAt"];</code>
   * @return The createdAt.
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <code>.google.protobuf.Timestamp created_at = 3 [json_name = "createdAt"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp updated_at = 4 [json_name = "updatedAt"];</code>
   * @return Whether the updatedAt field is set.
   */
  boolean hasUpdatedAt();
  /**
   * <code>.google.protobuf.Timestamp updated_at = 4 [json_name = "updatedAt"];</code>
   * @return The updatedAt.
   */
  com.google.protobuf.Timestamp getUpdatedAt();
  /**
   * <code>.google.protobuf.Timestamp updated_at = 4 [json_name = "updatedAt"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdatedAtOrBuilder();

  /**
   * <code>.chalk.server.v1.ClusterTimescaleSpecs specs = 5 [json_name = "specs"];</code>
   * @return Whether the specs field is set.
   */
  boolean hasSpecs();
  /**
   * <code>.chalk.server.v1.ClusterTimescaleSpecs specs = 5 [json_name = "specs"];</code>
   * @return The specs.
   */
  ai.chalk.protos.chalk.server.v1.ClusterTimescaleSpecs getSpecs();
  /**
   * <code>.chalk.server.v1.ClusterTimescaleSpecs specs = 5 [json_name = "specs"];</code>
   */
  ai.chalk.protos.chalk.server.v1.ClusterTimescaleSpecsOrBuilder getSpecsOrBuilder();
}
