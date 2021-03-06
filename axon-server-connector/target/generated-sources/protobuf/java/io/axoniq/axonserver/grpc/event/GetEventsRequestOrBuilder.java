// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: event.proto

package io.axoniq.axonserver.grpc.event;

public interface GetEventsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.axoniq.axonserver.grpc.event.GetEventsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The token to start streaming from 
   * </pre>
   *
   * <code>int64 tracking_token = 1;</code>
   */
  long getTrackingToken();

  /**
   * <pre>
   * The number of messages the server may send before it needs to wait for more permits 
   * </pre>
   *
   * <code>int64 number_of_permits = 2;</code>
   */
  long getNumberOfPermits();

  /**
   * <pre>
   * The unique identifier of this client instance. Used for monitoring. 
   * </pre>
   *
   * <code>string client_id = 3;</code>
   */
  java.lang.String getClientId();
  /**
   * <pre>
   * The unique identifier of this client instance. Used for monitoring. 
   * </pre>
   *
   * <code>string client_id = 3;</code>
   */
  com.google.protobuf.ByteString
      getClientIdBytes();

  /**
   * <pre>
   * The component name of this client instance. Used for monitoring. 
   * </pre>
   *
   * <code>string component_name = 4;</code>
   */
  java.lang.String getComponentName();
  /**
   * <pre>
   * The component name of this client instance. Used for monitoring. 
   * </pre>
   *
   * <code>string component_name = 4;</code>
   */
  com.google.protobuf.ByteString
      getComponentNameBytes();

  /**
   * <pre>
   * The name of the processor requesting this stream. Used for monitoring. 
   * </pre>
   *
   * <code>string processor = 5;</code>
   */
  java.lang.String getProcessor();
  /**
   * <pre>
   * The name of the processor requesting this stream. Used for monitoring. 
   * </pre>
   *
   * <code>string processor = 5;</code>
   */
  com.google.protobuf.ByteString
      getProcessorBytes();

  /**
   * <pre>
   * An enumeration of payload types that need to be blacklisted. The Server will stop sending messages of these
   *types in order to reduce I/O. Note that the Server may occasionally send a blacklisted message to prevent
   *time-outs and stale tokens on clients.
   * </pre>
   *
   * <code>repeated .io.axoniq.axonserver.grpc.event.PayloadDescription blacklist = 6;</code>
   */
  java.util.List<io.axoniq.axonserver.grpc.event.PayloadDescription> 
      getBlacklistList();
  /**
   * <pre>
   * An enumeration of payload types that need to be blacklisted. The Server will stop sending messages of these
   *types in order to reduce I/O. Note that the Server may occasionally send a blacklisted message to prevent
   *time-outs and stale tokens on clients.
   * </pre>
   *
   * <code>repeated .io.axoniq.axonserver.grpc.event.PayloadDescription blacklist = 6;</code>
   */
  io.axoniq.axonserver.grpc.event.PayloadDescription getBlacklist(int index);
  /**
   * <pre>
   * An enumeration of payload types that need to be blacklisted. The Server will stop sending messages of these
   *types in order to reduce I/O. Note that the Server may occasionally send a blacklisted message to prevent
   *time-outs and stale tokens on clients.
   * </pre>
   *
   * <code>repeated .io.axoniq.axonserver.grpc.event.PayloadDescription blacklist = 6;</code>
   */
  int getBlacklistCount();
  /**
   * <pre>
   * An enumeration of payload types that need to be blacklisted. The Server will stop sending messages of these
   *types in order to reduce I/O. Note that the Server may occasionally send a blacklisted message to prevent
   *time-outs and stale tokens on clients.
   * </pre>
   *
   * <code>repeated .io.axoniq.axonserver.grpc.event.PayloadDescription blacklist = 6;</code>
   */
  java.util.List<? extends io.axoniq.axonserver.grpc.event.PayloadDescriptionOrBuilder> 
      getBlacklistOrBuilderList();
  /**
   * <pre>
   * An enumeration of payload types that need to be blacklisted. The Server will stop sending messages of these
   *types in order to reduce I/O. Note that the Server may occasionally send a blacklisted message to prevent
   *time-outs and stale tokens on clients.
   * </pre>
   *
   * <code>repeated .io.axoniq.axonserver.grpc.event.PayloadDescription blacklist = 6;</code>
   */
  io.axoniq.axonserver.grpc.event.PayloadDescriptionOrBuilder getBlacklistOrBuilder(
      int index);
}
