// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/pubsub/v1/pod_status.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.chalk.pubsub.v1;

public interface PodStatusPubSubOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.pubsub.v1.PodStatusPubSub)
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
   * <code>string app = 2 [json_name = "app"];</code>
   * @return The app.
   */
  java.lang.String getApp();
  /**
   * <code>string app = 2 [json_name = "app"];</code>
   * @return The bytes for app.
   */
  com.google.protobuf.ByteString
      getAppBytes();

  /**
   * <code>string component = 3 [json_name = "component"];</code>
   * @return The component.
   */
  java.lang.String getComponent();
  /**
   * <code>string component = 3 [json_name = "component"];</code>
   * @return The bytes for component.
   */
  com.google.protobuf.ByteString
      getComponentBytes();

  /**
   * <code>string datadog_service = 4 [json_name = "datadogService"];</code>
   * @return The datadogService.
   */
  java.lang.String getDatadogService();
  /**
   * <code>string datadog_service = 4 [json_name = "datadogService"];</code>
   * @return The bytes for datadogService.
   */
  com.google.protobuf.ByteString
      getDatadogServiceBytes();

  /**
   * <code>string datadog_version = 5 [json_name = "datadogVersion"];</code>
   * @return The datadogVersion.
   */
  java.lang.String getDatadogVersion();
  /**
   * <code>string datadog_version = 5 [json_name = "datadogVersion"];</code>
   * @return The bytes for datadogVersion.
   */
  com.google.protobuf.ByteString
      getDatadogVersionBytes();

  /**
   * <code>string pod_template_hash = 6 [json_name = "podTemplateHash"];</code>
   * @return The podTemplateHash.
   */
  java.lang.String getPodTemplateHash();
  /**
   * <code>string pod_template_hash = 6 [json_name = "podTemplateHash"];</code>
   * @return The bytes for podTemplateHash.
   */
  com.google.protobuf.ByteString
      getPodTemplateHashBytes();

  /**
   * <pre>
   * string status = 7;
   * </pre>
   *
   * <code>.chalk.pubsub.v1.PodStatusPubSub.PodStatus status = 7 [json_name = "status"];</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <pre>
   * string status = 7;
   * </pre>
   *
   * <code>.chalk.pubsub.v1.PodStatusPubSub.PodStatus status = 7 [json_name = "status"];</code>
   * @return The status.
   */
  ai.chalk.protos.chalk.pubsub.v1.PodStatusPubSub.PodStatus getStatus();
  /**
   * <pre>
   * string status = 7;
   * </pre>
   *
   * <code>.chalk.pubsub.v1.PodStatusPubSub.PodStatus status = 7 [json_name = "status"];</code>
   */
  ai.chalk.protos.chalk.pubsub.v1.PodStatusPubSub.PodStatusOrBuilder getStatusOrBuilder();

  /**
   * <code>.chalk.pubsub.v1.PodStatusPubSub.PodSpec spec = 8 [json_name = "spec"];</code>
   * @return Whether the spec field is set.
   */
  boolean hasSpec();
  /**
   * <code>.chalk.pubsub.v1.PodStatusPubSub.PodSpec spec = 8 [json_name = "spec"];</code>
   * @return The spec.
   */
  ai.chalk.protos.chalk.pubsub.v1.PodStatusPubSub.PodSpec getSpec();
  /**
   * <code>.chalk.pubsub.v1.PodStatusPubSub.PodSpec spec = 8 [json_name = "spec"];</code>
   */
  ai.chalk.protos.chalk.pubsub.v1.PodStatusPubSub.PodSpecOrBuilder getSpecOrBuilder();

  /**
   * <pre>
   * The time that the instance was created.
   * pod.CreationTimestamp.Unix()
   * </pre>
   *
   * <code>int64 creation_timestamp = 18 [json_name = "creationTimestamp", (.gen_bq_schema.bigquery) = { ... }</code>
   * @return The creationTimestamp.
   */
  long getCreationTimestamp();

  /**
   * <pre>
   * pod.DeletionTimestamp.Unix()
   * The time that the instance was deleted. May be 0 if the instance is still running.
   * </pre>
   *
   * <code>int64 deletion_timestamp = 19 [json_name = "deletionTimestamp", (.gen_bq_schema.bigquery) = { ... }</code>
   * @return The deletionTimestamp.
   */
  long getDeletionTimestamp();

  /**
   * <pre>
   * The time that we polled the instance for usage.
   * </pre>
   *
   * <code>int64 observed_timestamp = 20 [json_name = "observedTimestamp", (.gen_bq_schema.bigquery) = { ... }</code>
   * @return The observedTimestamp.
   */
  long getObservedTimestamp();

  /**
   * <pre>
   * pod.Labels
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 21 [json_name = "labels"];</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * pod.Labels
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 21 [json_name = "labels"];</code>
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
   * pod.Labels
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 21 [json_name = "labels"];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * pod.Labels
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 21 [json_name = "labels"];</code>
   */
  /* nullable */
java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * pod.Labels
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 21 [json_name = "labels"];</code>
   */
  java.lang.String getLabelsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * pod.Annotations
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 22 [json_name = "annotations"];</code>
   */
  int getAnnotationsCount();
  /**
   * <pre>
   * pod.Annotations
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 22 [json_name = "annotations"];</code>
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
   * pod.Annotations
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 22 [json_name = "annotations"];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getAnnotationsMap();
  /**
   * <pre>
   * pod.Annotations
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 22 [json_name = "annotations"];</code>
   */
  /* nullable */
java.lang.String getAnnotationsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * pod.Annotations
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 22 [json_name = "annotations"];</code>
   */
  java.lang.String getAnnotationsOrThrow(
      java.lang.String key);

  /**
   * <code>string cluster = 23 [json_name = "cluster"];</code>
   * @return The cluster.
   */
  java.lang.String getCluster();
  /**
   * <code>string cluster = 23 [json_name = "cluster"];</code>
   * @return The bytes for cluster.
   */
  com.google.protobuf.ByteString
      getClusterBytes();
}
