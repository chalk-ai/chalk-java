// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/engine/v1/plan.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.chalk.engine.v1;

public interface PlanOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.engine.v1.Plan)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .chalk.engine.v1.Node nodes = 1 [json_name = "nodes"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.engine.v1.Node> 
      getNodesList();
  /**
   * <code>repeated .chalk.engine.v1.Node nodes = 1 [json_name = "nodes"];</code>
   */
  ai.chalk.protos.chalk.engine.v1.Node getNodes(int index);
  /**
   * <code>repeated .chalk.engine.v1.Node nodes = 1 [json_name = "nodes"];</code>
   */
  int getNodesCount();
  /**
   * <code>repeated .chalk.engine.v1.Node nodes = 1 [json_name = "nodes"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.engine.v1.NodeOrBuilder> 
      getNodesOrBuilderList();
  /**
   * <code>repeated .chalk.engine.v1.Node nodes = 1 [json_name = "nodes"];</code>
   */
  ai.chalk.protos.chalk.engine.v1.NodeOrBuilder getNodesOrBuilder(
      int index);

  /**
   * <code>uint32 root_node_idx = 2 [json_name = "rootNodeIdx"];</code>
   * @return The rootNodeIdx.
   */
  int getRootNodeIdx();

  /**
   * <code>.chalk.engine.v1.PyArrowSchema pyarrow_schema = 3 [json_name = "pyarrowSchema"];</code>
   * @return Whether the pyarrowSchema field is set.
   */
  boolean hasPyarrowSchema();
  /**
   * <code>.chalk.engine.v1.PyArrowSchema pyarrow_schema = 3 [json_name = "pyarrowSchema"];</code>
   * @return The pyarrowSchema.
   */
  ai.chalk.protos.chalk.engine.v1.PyArrowSchema getPyarrowSchema();
  /**
   * <code>.chalk.engine.v1.PyArrowSchema pyarrow_schema = 3 [json_name = "pyarrowSchema"];</code>
   */
  ai.chalk.protos.chalk.engine.v1.PyArrowSchemaOrBuilder getPyarrowSchemaOrBuilder();
}
