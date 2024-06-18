// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/graph/v1/graph.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.graph.v1;

public interface StreamResolverOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.graph.v1.StreamResolver)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string fqn = 1 [json_name = "fqn"];</code>
   * @return The fqn.
   */
  java.lang.String getFqn();
  /**
   * <code>string fqn = 1 [json_name = "fqn"];</code>
   * @return The bytes for fqn.
   */
  com.google.protobuf.ByteString
      getFqnBytes();

  /**
   * <code>repeated .chalk.graph.v1.StreamResolverParam params = 2 [json_name = "params"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.graph.v1.StreamResolverParam> 
      getParamsList();
  /**
   * <code>repeated .chalk.graph.v1.StreamResolverParam params = 2 [json_name = "params"];</code>
   */
  ai.chalk.protos.chalk.graph.v1.StreamResolverParam getParams(int index);
  /**
   * <code>repeated .chalk.graph.v1.StreamResolverParam params = 2 [json_name = "params"];</code>
   */
  int getParamsCount();
  /**
   * <code>repeated .chalk.graph.v1.StreamResolverParam params = 2 [json_name = "params"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.graph.v1.StreamResolverParamOrBuilder> 
      getParamsOrBuilderList();
  /**
   * <code>repeated .chalk.graph.v1.StreamResolverParam params = 2 [json_name = "params"];</code>
   */
  ai.chalk.protos.chalk.graph.v1.StreamResolverParamOrBuilder getParamsOrBuilder(
      int index);

  /**
   * <code>repeated .chalk.graph.v1.ResolverOutput outputs = 3 [json_name = "outputs"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.graph.v1.ResolverOutput> 
      getOutputsList();
  /**
   * <code>repeated .chalk.graph.v1.ResolverOutput outputs = 3 [json_name = "outputs"];</code>
   */
  ai.chalk.protos.chalk.graph.v1.ResolverOutput getOutputs(int index);
  /**
   * <code>repeated .chalk.graph.v1.ResolverOutput outputs = 3 [json_name = "outputs"];</code>
   */
  int getOutputsCount();
  /**
   * <code>repeated .chalk.graph.v1.ResolverOutput outputs = 3 [json_name = "outputs"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.graph.v1.ResolverOutputOrBuilder> 
      getOutputsOrBuilderList();
  /**
   * <code>repeated .chalk.graph.v1.ResolverOutput outputs = 3 [json_name = "outputs"];</code>
   */
  ai.chalk.protos.chalk.graph.v1.ResolverOutputOrBuilder getOutputsOrBuilder(
      int index);

  /**
   * <code>.chalk.arrow.v1.ArrowType explicit_schema = 4 [json_name = "explicitSchema"];</code>
   * @return Whether the explicitSchema field is set.
   */
  boolean hasExplicitSchema();
  /**
   * <code>.chalk.arrow.v1.ArrowType explicit_schema = 4 [json_name = "explicitSchema"];</code>
   * @return The explicitSchema.
   */
  ai.chalk.protos.chalk.arrow.v1.ArrowType getExplicitSchema();
  /**
   * <code>.chalk.arrow.v1.ArrowType explicit_schema = 4 [json_name = "explicitSchema"];</code>
   */
  ai.chalk.protos.chalk.arrow.v1.ArrowTypeOrBuilder getExplicitSchemaOrBuilder();

  /**
   * <code>repeated .chalk.graph.v1.StreamKey keys = 5 [json_name = "keys"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.graph.v1.StreamKey> 
      getKeysList();
  /**
   * <code>repeated .chalk.graph.v1.StreamKey keys = 5 [json_name = "keys"];</code>
   */
  ai.chalk.protos.chalk.graph.v1.StreamKey getKeys(int index);
  /**
   * <code>repeated .chalk.graph.v1.StreamKey keys = 5 [json_name = "keys"];</code>
   */
  int getKeysCount();
  /**
   * <code>repeated .chalk.graph.v1.StreamKey keys = 5 [json_name = "keys"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.graph.v1.StreamKeyOrBuilder> 
      getKeysOrBuilderList();
  /**
   * <code>repeated .chalk.graph.v1.StreamKey keys = 5 [json_name = "keys"];</code>
   */
  ai.chalk.protos.chalk.graph.v1.StreamKeyOrBuilder getKeysOrBuilder(
      int index);

  /**
   * <code>.chalk.graph.v1.StreamSourceReference source = 6 [json_name = "source"];</code>
   * @return Whether the source field is set.
   */
  boolean hasSource();
  /**
   * <code>.chalk.graph.v1.StreamSourceReference source = 6 [json_name = "source"];</code>
   * @return The source.
   */
  ai.chalk.protos.chalk.graph.v1.StreamSourceReference getSource();
  /**
   * <code>.chalk.graph.v1.StreamSourceReference source = 6 [json_name = "source"];</code>
   */
  ai.chalk.protos.chalk.graph.v1.StreamSourceReferenceOrBuilder getSourceOrBuilder();

  /**
   * <code>.chalk.graph.v1.ParseInfo parse_info = 7 [json_name = "parseInfo"];</code>
   * @return Whether the parseInfo field is set.
   */
  boolean hasParseInfo();
  /**
   * <code>.chalk.graph.v1.ParseInfo parse_info = 7 [json_name = "parseInfo"];</code>
   * @return The parseInfo.
   */
  ai.chalk.protos.chalk.graph.v1.ParseInfo getParseInfo();
  /**
   * <code>.chalk.graph.v1.ParseInfo parse_info = 7 [json_name = "parseInfo"];</code>
   */
  ai.chalk.protos.chalk.graph.v1.ParseInfoOrBuilder getParseInfoOrBuilder();

  /**
   * <code>.chalk.graph.v1.WindowMode mode = 8 [json_name = "mode"];</code>
   * @return The enum numeric value on the wire for mode.
   */
  int getModeValue();
  /**
   * <code>.chalk.graph.v1.WindowMode mode = 8 [json_name = "mode"];</code>
   * @return The mode.
   */
  ai.chalk.protos.chalk.graph.v1.WindowMode getMode();

  /**
   * <code>repeated string environments = 9 [json_name = "environments"];</code>
   * @return A list containing the environments.
   */
  java.util.List<java.lang.String>
      getEnvironmentsList();
  /**
   * <code>repeated string environments = 9 [json_name = "environments"];</code>
   * @return The count of environments.
   */
  int getEnvironmentsCount();
  /**
   * <code>repeated string environments = 9 [json_name = "environments"];</code>
   * @param index The index of the element to return.
   * @return The environments at the given index.
   */
  java.lang.String getEnvironments(int index);
  /**
   * <code>repeated string environments = 9 [json_name = "environments"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the environments at the given index.
   */
  com.google.protobuf.ByteString
      getEnvironmentsBytes(int index);

  /**
   * <code>.google.protobuf.Duration timeout_duration = 10 [json_name = "timeoutDuration"];</code>
   * @return Whether the timeoutDuration field is set.
   */
  boolean hasTimeoutDuration();
  /**
   * <code>.google.protobuf.Duration timeout_duration = 10 [json_name = "timeoutDuration"];</code>
   * @return The timeoutDuration.
   */
  com.google.protobuf.Duration getTimeoutDuration();
  /**
   * <code>.google.protobuf.Duration timeout_duration = 10 [json_name = "timeoutDuration"];</code>
   */
  com.google.protobuf.DurationOrBuilder getTimeoutDurationOrBuilder();

  /**
   * <code>optional string timestamp_attribute_name = 11 [json_name = "timestampAttributeName"];</code>
   * @return Whether the timestampAttributeName field is set.
   */
  boolean hasTimestampAttributeName();
  /**
   * <code>optional string timestamp_attribute_name = 11 [json_name = "timestampAttributeName"];</code>
   * @return The timestampAttributeName.
   */
  java.lang.String getTimestampAttributeName();
  /**
   * <code>optional string timestamp_attribute_name = 11 [json_name = "timestampAttributeName"];</code>
   * @return The bytes for timestampAttributeName.
   */
  com.google.protobuf.ByteString
      getTimestampAttributeNameBytes();

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
   * <code>optional string doc = 13 [json_name = "doc"];</code>
   * @return Whether the doc field is set.
   */
  boolean hasDoc();
  /**
   * <code>optional string doc = 13 [json_name = "doc"];</code>
   * @return The doc.
   */
  java.lang.String getDoc();
  /**
   * <code>optional string doc = 13 [json_name = "doc"];</code>
   * @return The bytes for doc.
   */
  com.google.protobuf.ByteString
      getDocBytes();

  /**
   * <code>optional string machine_type = 14 [json_name = "machineType"];</code>
   * @return Whether the machineType field is set.
   */
  boolean hasMachineType();
  /**
   * <code>optional string machine_type = 14 [json_name = "machineType"];</code>
   * @return The machineType.
   */
  java.lang.String getMachineType();
  /**
   * <code>optional string machine_type = 14 [json_name = "machineType"];</code>
   * @return The bytes for machineType.
   */
  com.google.protobuf.ByteString
      getMachineTypeBytes();

  /**
   * <code>.chalk.graph.v1.FunctionReference function = 15 [json_name = "function"];</code>
   * @return Whether the function field is set.
   */
  boolean hasFunction();
  /**
   * <code>.chalk.graph.v1.FunctionReference function = 15 [json_name = "function"];</code>
   * @return The function.
   */
  ai.chalk.protos.chalk.graph.v1.FunctionReference getFunction();
  /**
   * <code>.chalk.graph.v1.FunctionReference function = 15 [json_name = "function"];</code>
   */
  ai.chalk.protos.chalk.graph.v1.FunctionReferenceOrBuilder getFunctionOrBuilder();
}
