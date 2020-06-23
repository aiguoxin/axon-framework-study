// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: event.proto

package io.axoniq.axonserver.grpc.event;

public interface EventWithTokenOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.axoniq.axonserver.grpc.event.EventWithToken)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The Token representing the position of this Event in the Stream 
   * </pre>
   *
   * <code>int64 token = 1;</code>
   */
  long getToken();

  /**
   * <pre>
   * The actual Event Message 
   * </pre>
   *
   * <code>.io.axoniq.axonserver.grpc.event.Event event = 2;</code>
   */
  boolean hasEvent();
  /**
   * <pre>
   * The actual Event Message 
   * </pre>
   *
   * <code>.io.axoniq.axonserver.grpc.event.Event event = 2;</code>
   */
  io.axoniq.axonserver.grpc.event.Event getEvent();
  /**
   * <pre>
   * The actual Event Message 
   * </pre>
   *
   * <code>.io.axoniq.axonserver.grpc.event.Event event = 2;</code>
   */
  io.axoniq.axonserver.grpc.event.EventOrBuilder getEventOrBuilder();
}