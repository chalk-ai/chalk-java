// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/common/v1/online_query.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.chalk.common.v1;

public interface FeatureMetaOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.common.v1.FeatureMeta)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string chosen_resolver_fqn = 1 [json_name = "chosenResolverFqn"];</code>
   * @return The chosenResolverFqn.
   */
  java.lang.String getChosenResolverFqn();
  /**
   * <code>string chosen_resolver_fqn = 1 [json_name = "chosenResolverFqn"];</code>
   * @return The bytes for chosenResolverFqn.
   */
  com.google.protobuf.ByteString
      getChosenResolverFqnBytes();

  /**
   * <code>bool cache_hit = 2 [json_name = "cacheHit"];</code>
   * @return The cacheHit.
   */
  boolean getCacheHit();

  /**
   * <code>string primitive_type = 3 [json_name = "primitiveType"];</code>
   * @return The primitiveType.
   */
  java.lang.String getPrimitiveType();
  /**
   * <code>string primitive_type = 3 [json_name = "primitiveType"];</code>
   * @return The bytes for primitiveType.
   */
  com.google.protobuf.ByteString
      getPrimitiveTypeBytes();

  /**
   * <code>int64 version = 4 [json_name = "version"];</code>
   * @return The version.
   */
  long getVersion();
}