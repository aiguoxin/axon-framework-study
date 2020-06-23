// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: control.proto

package io.axoniq.axonserver.grpc.control;

public interface ClientIdentificationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.axoniq.axonserver.grpc.control.ClientIdentification)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A unique identifier for this client instance. Is used to distinguish different instances of the same component 
   * </pre>
   *
   * <code>string client_id = 1;</code>
   */
  java.lang.String getClientId();
  /**
   * <pre>
   * A unique identifier for this client instance. Is used to distinguish different instances of the same component 
   * </pre>
   *
   * <code>string client_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getClientIdBytes();

  /**
   * <pre>
   * The name of the component. Several instances of the same component should share this name 
   * </pre>
   *
   * <code>string component_name = 2;</code>
   */
  java.lang.String getComponentName();
  /**
   * <pre>
   * The name of the component. Several instances of the same component should share this name 
   * </pre>
   *
   * <code>string component_name = 2;</code>
   */
  com.google.protobuf.ByteString
      getComponentNameBytes();

  /**
   * <pre>
   * Any tags associated with the client, which may provide hints and preferences for setting up connections 
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 3;</code>
   */
  int getTagsCount();
  /**
   * <pre>
   * Any tags associated with the client, which may provide hints and preferences for setting up connections 
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 3;</code>
   */
  boolean containsTags(
      java.lang.String key);
  /**
   * Use {@link #getTagsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getTags();
  /**
   * <pre>
   * Any tags associated with the client, which may provide hints and preferences for setting up connections 
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 3;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getTagsMap();
  /**
   * <pre>
   * Any tags associated with the client, which may provide hints and preferences for setting up connections 
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 3;</code>
   */

  java.lang.String getTagsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <pre>
   * Any tags associated with the client, which may provide hints and preferences for setting up connections 
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 3;</code>
   */

  java.lang.String getTagsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Axon framework version used by the client application instance
   * </pre>
   *
   * <code>string version = 4;</code>
   */
  java.lang.String getVersion();
  /**
   * <pre>
   * Axon framework version used by the client application instance
   * </pre>
   *
   * <code>string version = 4;</code>
   */
  com.google.protobuf.ByteString
      getVersionBytes();
}
