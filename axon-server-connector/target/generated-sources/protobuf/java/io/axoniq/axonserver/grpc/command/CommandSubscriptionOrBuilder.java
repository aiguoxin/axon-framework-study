// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: command.proto

package io.axoniq.axonserver.grpc.command;

public interface CommandSubscriptionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.axoniq.axonserver.grpc.command.CommandSubscription)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A unique identifier for this subscription. This identifier is returned in Acknowledgements to allow
   *pipelining of subscription messages 
   * </pre>
   *
   * <code>string message_id = 1;</code>
   */
  java.lang.String getMessageId();
  /**
   * <pre>
   * A unique identifier for this subscription. This identifier is returned in Acknowledgements to allow
   *pipelining of subscription messages 
   * </pre>
   *
   * <code>string message_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getMessageIdBytes();

  /**
   * <pre>
   * The name of the command the component can handle 
   * </pre>
   *
   * <code>string command = 2;</code>
   */
  java.lang.String getCommand();
  /**
   * <pre>
   * The name of the command the component can handle 
   * </pre>
   *
   * <code>string command = 2;</code>
   */
  com.google.protobuf.ByteString
      getCommandBytes();

  /**
   * <pre>
   * The name/type of the component handling the command 
   * </pre>
   *
   * <code>string component_name = 3;</code>
   */
  java.lang.String getComponentName();
  /**
   * <pre>
   * The name/type of the component handling the command 
   * </pre>
   *
   * <code>string component_name = 3;</code>
   */
  com.google.protobuf.ByteString
      getComponentNameBytes();

  /**
   * <pre>
   * The unique identifier of the component instance subscribing 
   * </pre>
   *
   * <code>string client_id = 4;</code>
   */
  java.lang.String getClientId();
  /**
   * <pre>
   * The unique identifier of the component instance subscribing 
   * </pre>
   *
   * <code>string client_id = 4;</code>
   */
  com.google.protobuf.ByteString
      getClientIdBytes();

  /**
   * <pre>
   * A number that represents the client's relative load capacity compared to other clients.
   *This information is interpreted by Axon Server in relation to the other connected nodes' values.
   *Used to balance the dispatching of commands. If set to 0, Axon Server consider 100 as default value.
   * </pre>
   *
   * <code>int32 load_factor = 5;</code>
   */
  int getLoadFactor();
}
