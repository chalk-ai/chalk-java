// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/billing.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

public interface GetNodesAndPodsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.GetNodesAndPodsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .chalk.pubsub.v1.NodeStatusPubSub nodes = 1 [json_name = "nodes"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.pubsub.v1.NodeStatusPubSub> 
      getNodesList();
  /**
   * <code>repeated .chalk.pubsub.v1.NodeStatusPubSub nodes = 1 [json_name = "nodes"];</code>
   */
  ai.chalk.protos.chalk.pubsub.v1.NodeStatusPubSub getNodes(int index);
  /**
   * <code>repeated .chalk.pubsub.v1.NodeStatusPubSub nodes = 1 [json_name = "nodes"];</code>
   */
  int getNodesCount();
  /**
   * <code>repeated .chalk.pubsub.v1.NodeStatusPubSub nodes = 1 [json_name = "nodes"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.pubsub.v1.NodeStatusPubSubOrBuilder> 
      getNodesOrBuilderList();
  /**
   * <code>repeated .chalk.pubsub.v1.NodeStatusPubSub nodes = 1 [json_name = "nodes"];</code>
   */
  ai.chalk.protos.chalk.pubsub.v1.NodeStatusPubSubOrBuilder getNodesOrBuilder(
      int index);

  /**
   * <code>repeated .chalk.pubsub.v1.PodStatusPubSub pods = 2 [json_name = "pods"];</code>
   */
  java.util.List<ai.chalk.protos.chalk.pubsub.v1.PodStatusPubSub> 
      getPodsList();
  /**
   * <code>repeated .chalk.pubsub.v1.PodStatusPubSub pods = 2 [json_name = "pods"];</code>
   */
  ai.chalk.protos.chalk.pubsub.v1.PodStatusPubSub getPods(int index);
  /**
   * <code>repeated .chalk.pubsub.v1.PodStatusPubSub pods = 2 [json_name = "pods"];</code>
   */
  int getPodsCount();
  /**
   * <code>repeated .chalk.pubsub.v1.PodStatusPubSub pods = 2 [json_name = "pods"];</code>
   */
  java.util.List<? extends ai.chalk.protos.chalk.pubsub.v1.PodStatusPubSubOrBuilder> 
      getPodsOrBuilderList();
  /**
   * <code>repeated .chalk.pubsub.v1.PodStatusPubSub pods = 2 [json_name = "pods"];</code>
   */
  ai.chalk.protos.chalk.pubsub.v1.PodStatusPubSubOrBuilder getPodsOrBuilder(
      int index);
}