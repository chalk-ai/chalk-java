// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/kubernetes/v1/nodes.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.kubernetes.v1;

public interface KubernetesNodeDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.kubernetes.v1.KubernetesNodeData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The Chalk team name that incurred the usage.
   * </pre>
   *
   * <code>string team = 1 [json_name = "team"];</code>
   * @return The team.
   */
  java.lang.String getTeam();
  /**
   * <pre>
   * The Chalk team name that incurred the usage.
   * </pre>
   *
   * <code>string team = 1 [json_name = "team"];</code>
   * @return The bytes for team.
   */
  com.google.protobuf.ByteString
      getTeamBytes();

  /**
   * <pre>
   * node.Name
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * node.Name
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * node.UID
   * </pre>
   *
   * <code>string uid = 3 [json_name = "uid"];</code>
   * @return The uid.
   */
  java.lang.String getUid();
  /**
   * <pre>
   * node.UID
   * </pre>
   *
   * <code>string uid = 3 [json_name = "uid"];</code>
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString
      getUidBytes();

  /**
   * <pre>
   * node.kubernetes.io/instance-type
   * </pre>
   *
   * <code>string instance_type = 4 [json_name = "instanceType"];</code>
   * @return The instanceType.
   */
  java.lang.String getInstanceType();
  /**
   * <pre>
   * node.kubernetes.io/instance-type
   * </pre>
   *
   * <code>string instance_type = 4 [json_name = "instanceType"];</code>
   * @return The bytes for instanceType.
   */
  com.google.protobuf.ByteString
      getInstanceTypeBytes();

  /**
   * <pre>
   * topology.kubernetes.io/region
   * </pre>
   *
   * <code>string region = 5 [json_name = "region"];</code>
   * @return The region.
   */
  java.lang.String getRegion();
  /**
   * <pre>
   * topology.kubernetes.io/region
   * </pre>
   *
   * <code>string region = 5 [json_name = "region"];</code>
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString
      getRegionBytes();

  /**
   * <pre>
   * topology.kubernetes.io/zone
   * </pre>
   *
   * <code>string zone = 6 [json_name = "zone"];</code>
   * @return The zone.
   */
  java.lang.String getZone();
  /**
   * <pre>
   * topology.kubernetes.io/zone
   * </pre>
   *
   * <code>string zone = 6 [json_name = "zone"];</code>
   * @return The bytes for zone.
   */
  com.google.protobuf.ByteString
      getZoneBytes();

  /**
   * <pre>
   * The time that the instance was created.
   * node.CreationTimestamp.Unix()
   * </pre>
   *
   * <code>int64 creation_timestamp = 8 [json_name = "creationTimestamp"];</code>
   * @return The creationTimestamp.
   */
  long getCreationTimestamp();

  /**
   * <pre>
   * node.DeletionTimestamp.Unix()
   * The time that the instance was deleted. May be 0 if the instance is still running.
   * </pre>
   *
   * <code>int64 deletion_timestamp = 9 [json_name = "deletionTimestamp"];</code>
   * @return The deletionTimestamp.
   */
  long getDeletionTimestamp();

  /**
   * <pre>
   * The time that we polled the instance for usage.
   * </pre>
   *
   * <code>int64 observed_timestamp = 10 [json_name = "observedTimestamp"];</code>
   * @return The observedTimestamp.
   */
  long getObservedTimestamp();

  /**
   * <pre>
   * node.Labels
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11 [json_name = "labels"];</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * node.Labels
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11 [json_name = "labels"];</code>
   */
  boolean containsLabels(
      java.lang.String key);
  /**
   * Use {@link #getLabelsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getLabels();
  /**
   * <pre>
   * node.Labels
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11 [json_name = "labels"];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * node.Labels
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11 [json_name = "labels"];</code>
   */
  /* nullable */
java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * node.Labels
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11 [json_name = "labels"];</code>
   */
  java.lang.String getLabelsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * node.Annotations
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 12 [json_name = "annotations"];</code>
   */
  int getAnnotationsCount();
  /**
   * <pre>
   * node.Annotations
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 12 [json_name = "annotations"];</code>
   */
  boolean containsAnnotations(
      java.lang.String key);
  /**
   * Use {@link #getAnnotationsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getAnnotations();
  /**
   * <pre>
   * node.Annotations
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 12 [json_name = "annotations"];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getAnnotationsMap();
  /**
   * <pre>
   * node.Annotations
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 12 [json_name = "annotations"];</code>
   */
  /* nullable */
java.lang.String getAnnotationsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * node.Annotations
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 12 [json_name = "annotations"];</code>
   */
  java.lang.String getAnnotationsOrThrow(
      java.lang.String key);

  /**
   * <code>string machine_id = 13 [json_name = "machineId"];</code>
   * @return The machineId.
   */
  java.lang.String getMachineId();
  /**
   * <code>string machine_id = 13 [json_name = "machineId"];</code>
   * @return The bytes for machineId.
   */
  com.google.protobuf.ByteString
      getMachineIdBytes();

  /**
   * <code>string system_uuid = 14 [json_name = "systemUuid"];</code>
   * @return The systemUuid.
   */
  java.lang.String getSystemUuid();
  /**
   * <code>string system_uuid = 14 [json_name = "systemUuid"];</code>
   * @return The bytes for systemUuid.
   */
  com.google.protobuf.ByteString
      getSystemUuidBytes();

  /**
   * <code>string boot_id = 15 [json_name = "bootId"];</code>
   * @return The bootId.
   */
  java.lang.String getBootId();
  /**
   * <code>string boot_id = 15 [json_name = "bootId"];</code>
   * @return The bytes for bootId.
   */
  com.google.protobuf.ByteString
      getBootIdBytes();

  /**
   * <code>bool unschedulable = 16 [json_name = "unschedulable"];</code>
   * @return The unschedulable.
   */
  boolean getUnschedulable();

  /**
   * <code>string namespace = 17 [json_name = "namespace"];</code>
   * @return The namespace.
   */
  java.lang.String getNamespace();
  /**
   * <code>string namespace = 17 [json_name = "namespace"];</code>
   * @return The bytes for namespace.
   */
  com.google.protobuf.ByteString
      getNamespaceBytes();

  /**
   * <pre>
   * container.googleapis.com/instance_id
   * </pre>
   *
   * <code>string instance_id = 18 [json_name = "instanceId"];</code>
   * @return The instanceId.
   */
  java.lang.String getInstanceId();
  /**
   * <pre>
   * container.googleapis.com/instance_id
   * </pre>
   *
   * <code>string instance_id = 18 [json_name = "instanceId"];</code>
   * @return The bytes for instanceId.
   */
  com.google.protobuf.ByteString
      getInstanceIdBytes();

  /**
   * <code>string cluster = 19 [json_name = "cluster"];</code>
   * @return The cluster.
   */
  java.lang.String getCluster();
  /**
   * <code>string cluster = 19 [json_name = "cluster"];</code>
   * @return The bytes for cluster.
   */
  com.google.protobuf.ByteString
      getClusterBytes();

  /**
   * <code>string total_cpu = 20 [json_name = "totalCpu"];</code>
   * @return The totalCpu.
   */
  java.lang.String getTotalCpu();
  /**
   * <code>string total_cpu = 20 [json_name = "totalCpu"];</code>
   * @return The bytes for totalCpu.
   */
  com.google.protobuf.ByteString
      getTotalCpuBytes();

  /**
   * <code>string total_memory = 21 [json_name = "totalMemory"];</code>
   * @return The totalMemory.
   */
  java.lang.String getTotalMemory();
  /**
   * <code>string total_memory = 21 [json_name = "totalMemory"];</code>
   * @return The bytes for totalMemory.
   */
  com.google.protobuf.ByteString
      getTotalMemoryBytes();

  /**
   * <code>string allocatable_cpu = 22 [json_name = "allocatableCpu"];</code>
   * @return The allocatableCpu.
   */
  java.lang.String getAllocatableCpu();
  /**
   * <code>string allocatable_cpu = 22 [json_name = "allocatableCpu"];</code>
   * @return The bytes for allocatableCpu.
   */
  com.google.protobuf.ByteString
      getAllocatableCpuBytes();

  /**
   * <code>string allocatable_memory = 23 [json_name = "allocatableMemory"];</code>
   * @return The allocatableMemory.
   */
  java.lang.String getAllocatableMemory();
  /**
   * <code>string allocatable_memory = 23 [json_name = "allocatableMemory"];</code>
   * @return The bytes for allocatableMemory.
   */
  com.google.protobuf.ByteString
      getAllocatableMemoryBytes();
}
