// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gen_bq_schema/bq_field.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.gen_bq_schema;

public interface BigQueryFieldOptionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:gen_bq_schema.BigQueryFieldOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Flag to specify that a field should be marked as 'REQUIRED' when
   * used to generate schema for BigQuery.
   * </pre>
   *
   * <code>bool require = 1 [json_name = "require"];</code>
   * @return The require.
   */
  boolean getRequire();

  /**
   * <pre>
   * Optionally override whatever type is resolved by the schema
   * generator. This is useful, for example, to store epoch timestamps
   * with the underlying 'TIMESTAMP' type, when normally, they would
   * be structured as 'INTEGER' fields.
   * </pre>
   *
   * <code>string type_override = 2 [json_name = "typeOverride"];</code>
   * @return The typeOverride.
   */
  java.lang.String getTypeOverride();
  /**
   * <pre>
   * Optionally override whatever type is resolved by the schema
   * generator. This is useful, for example, to store epoch timestamps
   * with the underlying 'TIMESTAMP' type, when normally, they would
   * be structured as 'INTEGER' fields.
   * </pre>
   *
   * <code>string type_override = 2 [json_name = "typeOverride"];</code>
   * @return The bytes for typeOverride.
   */
  com.google.protobuf.ByteString
      getTypeOverrideBytes();

  /**
   * <pre>
   * Optionally omit a field from BigQuery schema.
   * </pre>
   *
   * <code>bool ignore = 3 [json_name = "ignore"];</code>
   * @return The ignore.
   */
  boolean getIgnore();

  /**
   * <pre>
   * Set the description for a field in BigQuery schema.
   * </pre>
   *
   * <code>string description = 4 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Set the description for a field in BigQuery schema.
   * </pre>
   *
   * <code>string description = 4 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Customize the name of the field in the BigQuery schema.
   * </pre>
   *
   * <code>string name = 5 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Customize the name of the field in the BigQuery schema.
   * </pre>
   *
   * <code>string name = 5 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Optionally add PolicyTag for a field in BigQuery schema.
   * </pre>
   *
   * <code>string policy_tags = 6 [json_name = "policyTags"];</code>
   * @return The policyTags.
   */
  java.lang.String getPolicyTags();
  /**
   * <pre>
   * Optionally add PolicyTag for a field in BigQuery schema.
   * </pre>
   *
   * <code>string policy_tags = 6 [json_name = "policyTags"];</code>
   * @return The bytes for policyTags.
   */
  com.google.protobuf.ByteString
      getPolicyTagsBytes();
}
