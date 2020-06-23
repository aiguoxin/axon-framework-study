// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package io.axoniq.axonserver.grpc;

public interface FlowControlOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.axoniq.axonserver.grpc.FlowControl)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ClientID of the component providing additional permits 
   * </pre>
   *
   * <code>string client_id = 2;</code>
   */
  java.lang.String getClientId();
  /**
   * <pre>
   * The ClientID of the component providing additional permits 
   * </pre>
   *
   * <code>string client_id = 2;</code>
   */
  com.google.protobuf.ByteString
      getClientIdBytes();

  /**
   * <pre>
   * The number of permits to provide 
   * </pre>
   *
   * <code>int64 permits = 3;</code>
   */
  long getPermits();
}
