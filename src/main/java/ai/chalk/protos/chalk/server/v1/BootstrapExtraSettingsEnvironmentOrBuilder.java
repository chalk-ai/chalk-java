// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/server/v1/bootstrap.proto

// Protobuf Java Version: 3.25.1
package ai.chalk.protos.chalk.server.v1;

public interface BootstrapExtraSettingsEnvironmentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chalk.server.v1.BootstrapExtraSettingsEnvironment)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;string, bool&gt; settings = 1 [json_name = "settings"];</code>
   */
  int getSettingsCount();
  /**
   * <code>map&lt;string, bool&gt; settings = 1 [json_name = "settings"];</code>
   */
  boolean containsSettings(
      java.lang.String key);
  /**
   * Use {@link #getSettingsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.Boolean>
  getSettings();
  /**
   * <code>map&lt;string, bool&gt; settings = 1 [json_name = "settings"];</code>
   */
  java.util.Map<java.lang.String, java.lang.Boolean>
  getSettingsMap();
  /**
   * <code>map&lt;string, bool&gt; settings = 1 [json_name = "settings"];</code>
   */
  boolean getSettingsOrDefault(
      java.lang.String key,
      boolean defaultValue);
  /**
   * <code>map&lt;string, bool&gt; settings = 1 [json_name = "settings"];</code>
   */
  boolean getSettingsOrThrow(
      java.lang.String key);
}