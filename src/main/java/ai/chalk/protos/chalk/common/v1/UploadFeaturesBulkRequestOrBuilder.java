// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/common/v1/online_query.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.common.v1;

public interface UploadFeaturesBulkRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.common.v1.UploadFeaturesBulkRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes inputs_feather = 1 [json_name = "inputsFeather"];</code>
   * @return The inputsFeather.
   */
  com.google.protobuf.ByteString getInputsFeather();

  /**
   * <code>.chalk.common.v1.FeatherBodyType body_type = 7 [json_name = "bodyType"];</code>
   * @return The enum numeric value on the wire for bodyType.
   */
  int getBodyTypeValue();
  /**
   * <code>.chalk.common.v1.FeatherBodyType body_type = 7 [json_name = "bodyType"];</code>
   * @return The bodyType.
   */
  ai.chalk.protos.chalk.common.v1.FeatherBodyType getBodyType();
}
