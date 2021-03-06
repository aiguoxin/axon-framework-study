// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: query.proto

package io.axoniq.axonserver.grpc.query;

public interface SubscriptionQueryRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.axoniq.axonserver.grpc.query.SubscriptionQueryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Start a Subscription Query with the given details. 
   * </pre>
   *
   * <code>.io.axoniq.axonserver.grpc.query.SubscriptionQuery subscribe = 1;</code>
   */
  boolean hasSubscribe();
  /**
   * <pre>
   * Start a Subscription Query with the given details. 
   * </pre>
   *
   * <code>.io.axoniq.axonserver.grpc.query.SubscriptionQuery subscribe = 1;</code>
   */
  io.axoniq.axonserver.grpc.query.SubscriptionQuery getSubscribe();
  /**
   * <pre>
   * Start a Subscription Query with the given details. 
   * </pre>
   *
   * <code>.io.axoniq.axonserver.grpc.query.SubscriptionQuery subscribe = 1;</code>
   */
  io.axoniq.axonserver.grpc.query.SubscriptionQueryOrBuilder getSubscribeOrBuilder();

  /**
   * <pre>
   * Ends a previously started Subscription Query with the given details 
   * </pre>
   *
   * <code>.io.axoniq.axonserver.grpc.query.SubscriptionQuery unsubscribe = 2;</code>
   */
  boolean hasUnsubscribe();
  /**
   * <pre>
   * Ends a previously started Subscription Query with the given details 
   * </pre>
   *
   * <code>.io.axoniq.axonserver.grpc.query.SubscriptionQuery unsubscribe = 2;</code>
   */
  io.axoniq.axonserver.grpc.query.SubscriptionQuery getUnsubscribe();
  /**
   * <pre>
   * Ends a previously started Subscription Query with the given details 
   * </pre>
   *
   * <code>.io.axoniq.axonserver.grpc.query.SubscriptionQuery unsubscribe = 2;</code>
   */
  io.axoniq.axonserver.grpc.query.SubscriptionQueryOrBuilder getUnsubscribeOrBuilder();

  /**
   * <pre>
   * Requests the initial result of a subscription query to be sent. This should always be done after opening the
   *subscription query itself, to remove concurrency conflicts with Update messages.
   * </pre>
   *
   * <code>.io.axoniq.axonserver.grpc.query.SubscriptionQuery get_initial_result = 3;</code>
   */
  boolean hasGetInitialResult();
  /**
   * <pre>
   * Requests the initial result of a subscription query to be sent. This should always be done after opening the
   *subscription query itself, to remove concurrency conflicts with Update messages.
   * </pre>
   *
   * <code>.io.axoniq.axonserver.grpc.query.SubscriptionQuery get_initial_result = 3;</code>
   */
  io.axoniq.axonserver.grpc.query.SubscriptionQuery getGetInitialResult();
  /**
   * <pre>
   * Requests the initial result of a subscription query to be sent. This should always be done after opening the
   *subscription query itself, to remove concurrency conflicts with Update messages.
   * </pre>
   *
   * <code>.io.axoniq.axonserver.grpc.query.SubscriptionQuery get_initial_result = 3;</code>
   */
  io.axoniq.axonserver.grpc.query.SubscriptionQueryOrBuilder getGetInitialResultOrBuilder();

  /**
   * <pre>
   * Allows the Server to provide additional Updates to be sent. Only the `number_of_permits` field needs to be
   *set on this message.
   * </pre>
   *
   * <code>.io.axoniq.axonserver.grpc.query.SubscriptionQuery flow_control = 4;</code>
   */
  boolean hasFlowControl();
  /**
   * <pre>
   * Allows the Server to provide additional Updates to be sent. Only the `number_of_permits` field needs to be
   *set on this message.
   * </pre>
   *
   * <code>.io.axoniq.axonserver.grpc.query.SubscriptionQuery flow_control = 4;</code>
   */
  io.axoniq.axonserver.grpc.query.SubscriptionQuery getFlowControl();
  /**
   * <pre>
   * Allows the Server to provide additional Updates to be sent. Only the `number_of_permits` field needs to be
   *set on this message.
   * </pre>
   *
   * <code>.io.axoniq.axonserver.grpc.query.SubscriptionQuery flow_control = 4;</code>
   */
  io.axoniq.axonserver.grpc.query.SubscriptionQueryOrBuilder getFlowControlOrBuilder();

  public io.axoniq.axonserver.grpc.query.SubscriptionQueryRequest.RequestCase getRequestCase();
}
