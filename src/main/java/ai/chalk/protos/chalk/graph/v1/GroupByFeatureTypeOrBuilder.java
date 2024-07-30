// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/graph/v1/graph.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.graph.v1;

public interface GroupByFeatureTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.graph.v1.GroupByFeatureType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string namespace = 2 [json_name = "namespace"];</code>
   * @return The namespace.
   */
  java.lang.String getNamespace();
  /**
   * <code>string namespace = 2 [json_name = "namespace"];</code>
   * @return The bytes for namespace.
   */
  com.google.protobuf.ByteString
      getNamespaceBytes();

  /**
   * <code>bool is_nullable = 3 [json_name = "isNullable"];</code>
   * @return The isNullable.
   */
  boolean getIsNullable();

  /**
   * <code>optional uint64 internal_version = 4 [json_name = "internalVersion"];</code>
   * @return Whether the internalVersion field is set.
   */
  boolean hasInternalVersion();
  /**
   * <code>optional uint64 internal_version = 4 [json_name = "internalVersion"];</code>
   * @return The internalVersion.
   */
  long getInternalVersion();

  /**
   * <code>.chalk.arrow.v1.ArrowType arrow_type = 5 [json_name = "arrowType"];</code>
   * @return Whether the arrowType field is set.
   */
  boolean hasArrowType();
  /**
   * <code>.chalk.arrow.v1.ArrowType arrow_type = 5 [json_name = "arrowType"];</code>
   * @return The arrowType.
   */
  ai.chalk.protos.chalk.arrow.v1.ArrowType getArrowType();
  /**
   * <code>.chalk.arrow.v1.ArrowType arrow_type = 5 [json_name = "arrowType"];</code>
   */
  ai.chalk.protos.chalk.arrow.v1.ArrowTypeOrBuilder getArrowTypeOrBuilder();

  /**
   * <code>.chalk.graph.v1.WindowAggregation aggregation = 6 [json_name = "aggregation"];</code>
   * @return Whether the aggregation field is set.
   */
  boolean hasAggregation();
  /**
   * <code>.chalk.graph.v1.WindowAggregation aggregation = 6 [json_name = "aggregation"];</code>
   * @return The aggregation.
   */
  ai.chalk.protos.chalk.graph.v1.WindowAggregation getAggregation();
  /**
   * <code>.chalk.graph.v1.WindowAggregation aggregation = 6 [json_name = "aggregation"];</code>
   */
  ai.chalk.protos.chalk.graph.v1.WindowAggregationOrBuilder getAggregationOrBuilder();

  /**
   * <code>repeated .google.protobuf.Duration window_durations = 7 [json_name = "windowDurations"];</code>
   */
  java.util.List<com.google.protobuf.Duration> 
      getWindowDurationsList();
  /**
   * <code>repeated .google.protobuf.Duration window_durations = 7 [json_name = "windowDurations"];</code>
   */
  com.google.protobuf.Duration getWindowDurations(int index);
  /**
   * <code>repeated .google.protobuf.Duration window_durations = 7 [json_name = "windowDurations"];</code>
   */
  int getWindowDurationsCount();
  /**
   * <code>repeated .google.protobuf.Duration window_durations = 7 [json_name = "windowDurations"];</code>
   */
  java.util.List<? extends com.google.protobuf.DurationOrBuilder> 
      getWindowDurationsOrBuilderList();
  /**
   * <code>repeated .google.protobuf.Duration window_durations = 7 [json_name = "windowDurations"];</code>
   */
  com.google.protobuf.DurationOrBuilder getWindowDurationsOrBuilder(
      int index);

  /**
   * <code>.chalk.expression.v1.LogicalExprNode expression = 8 [json_name = "expression"];</code>
   * @return Whether the expression field is set.
   */
  boolean hasExpression();
  /**
   * <code>.chalk.expression.v1.LogicalExprNode expression = 8 [json_name = "expression"];</code>
   * @return The expression.
   */
  ai.chalk.protos.chalk.expression.v1.LogicalExprNode getExpression();
  /**
   * <code>.chalk.expression.v1.LogicalExprNode expression = 8 [json_name = "expression"];</code>
   */
  ai.chalk.protos.chalk.expression.v1.LogicalExprNodeOrBuilder getExpressionOrBuilder();

  /**
   * <code>.chalk.arrow.v1.ScalarValue default_value = 9 [json_name = "defaultValue"];</code>
   * @return Whether the defaultValue field is set.
   */
  boolean hasDefaultValue();
  /**
   * <code>.chalk.arrow.v1.ScalarValue default_value = 9 [json_name = "defaultValue"];</code>
   * @return The defaultValue.
   */
  ai.chalk.protos.chalk.arrow.v1.ScalarValue getDefaultValue();
  /**
   * <code>.chalk.arrow.v1.ScalarValue default_value = 9 [json_name = "defaultValue"];</code>
   */
  ai.chalk.protos.chalk.arrow.v1.ScalarValueOrBuilder getDefaultValueOrBuilder();

  /**
   * <code>repeated string tags = 10 [json_name = "tags"];</code>
   * @return A list containing the tags.
   */
  java.util.List<java.lang.String>
      getTagsList();
  /**
   * <code>repeated string tags = 10 [json_name = "tags"];</code>
   * @return The count of tags.
   */
  int getTagsCount();
  /**
   * <code>repeated string tags = 10 [json_name = "tags"];</code>
   * @param index The index of the element to return.
   * @return The tags at the given index.
   */
  java.lang.String getTags(int index);
  /**
   * <code>repeated string tags = 10 [json_name = "tags"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the tags at the given index.
   */
  com.google.protobuf.ByteString
      getTagsBytes(int index);

  /**
   * <code>optional string description = 11 [json_name = "description"];</code>
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   * <code>optional string description = 11 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>optional string description = 11 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>optional string owner = 12 [json_name = "owner"];</code>
   * @return Whether the owner field is set.
   */
  boolean hasOwner();
  /**
   * <code>optional string owner = 12 [json_name = "owner"];</code>
   * @return The owner.
   */
  java.lang.String getOwner();
  /**
   * <code>optional string owner = 12 [json_name = "owner"];</code>
   * @return The bytes for owner.
   */
  com.google.protobuf.ByteString
      getOwnerBytes();

  /**
   * <code>repeated .chalk.graph.v1.FeatureValidation validations = 13 [json_name = "validations"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.graph.v1.FeatureValidation> 
      getValidationsList();
  /**
   * <code>repeated .chalk.graph.v1.FeatureValidation validations = 13 [json_name = "validations"];</code>
   */
  ai.chalk.protos.chalk.graph.v1.FeatureValidation getValidations(int index);
  /**
   * <code>repeated .chalk.graph.v1.FeatureValidation validations = 13 [json_name = "validations"];</code>
   */
  int getValidationsCount();
  /**
   * <code>repeated .chalk.graph.v1.FeatureValidation validations = 13 [json_name = "validations"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.graph.v1.FeatureValidationOrBuilder> 
      getValidationsOrBuilderList();
  /**
   * <code>repeated .chalk.graph.v1.FeatureValidation validations = 13 [json_name = "validations"];</code>
   */
  ai.chalk.protos.chalk.graph.v1.FeatureValidationOrBuilder getValidationsOrBuilder(
      int index);

  /**
   * <code>string attribute_name = 14 [json_name = "attributeName"];</code>
   * @return The attributeName.
   */
  java.lang.String getAttributeName();
  /**
   * <code>string attribute_name = 14 [json_name = "attributeName"];</code>
   * @return The bytes for attributeName.
   */
  com.google.protobuf.ByteString
      getAttributeNameBytes();
}