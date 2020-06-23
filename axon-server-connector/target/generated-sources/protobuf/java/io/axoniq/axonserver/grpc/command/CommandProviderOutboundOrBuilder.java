// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: command.proto

package io.axoniq.axonserver.grpc.command;

public interface CommandProviderOutboundOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.axoniq.axonserver.grpc.command.CommandProviderOutbound)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Instruction to subscribe this component as handler of a specific type of command 
   * </pre>
   *
   * <code>.io.axoniq.axonserver.grpc.command.CommandSubscription subscribe = 1;</code>
   */
  boolean hasSubscribe();
  /**
   * <pre>
   * Instruction to subscribe this component as handler of a specific type of command 
   * </pre>
   *
   * <code>.io.axoniq.axonserver.grpc.command.CommandSubscription subscribe = 1;</code>
   */
  io.axoniq.axonserver.grpc.command.CommandSubscription getSubscribe();
  /**
   * <pre>
   * Instruction to subscribe this component as handler of a specific type of command 
   * </pre>
   *
   * <code>.io.axoniq.axonserver.grpc.command.CommandSubscription subscribe = 1;</code>
   */
  io.axoniq.axonserver.grpc.command.CommandSubscriptionOrBuilder getSubscribeOrBuilder();

  /**
   * <pre>
   * Instruction to unsubscribe this component as handler of a specific type of command 
   * </pre>
   *
   * <code>.io.axoniq.axonserver.grpc.command.CommandSubscription unsubscribe = 2;</code>
   */
  boolean hasUnsubscribe();
  /**
   * <pre>
   * Instruction to unsubscribe this component as handler of a specific type of command 
   * </pre>
   *
   * <code>.io.axoniq.axonserver.grpc.command.CommandSubscription unsubscribe = 2;</code>
   */
  io.axoniq.axonserver.grpc.command.CommandSubscription getUnsubscribe();
  /**
   * <pre>
   * Instruction to unsubscribe this component as handler of a specific type of command 
   * </pre>
   *
   * <code>.io.axoniq.axonserver.grpc.command.CommandSubscription unsubscribe = 2;</code>
   */
  io.axoniq.axonserver.grpc.command.CommandSubscriptionOrBuilder getUnsubscribeOrBuilder();

  /**
   * <pre>
   * Instruction to increase the number of instructions AxonServer may send to this component 
   * </pre>
   *
   * <code>.io.axoniq.axonserver.grpc.FlowControl flow_control = 3;</code>
   */
  boolean hasFlowControl();
  /**
   * <pre>
   * Instruction to increase the number of instructions AxonServer may send to this component 
   * </pre>
   *
   * <code>.io.axoniq.axonserver.grpc.FlowControl flow_control = 3;</code>
   */
  io.axoniq.axonserver.grpc.FlowControl getFlowControl();
  /**
   * <pre>
   * Instruction to increase the number of instructions AxonServer may send to this component 
   * </pre>
   *
   * <code>.io.axoniq.axonserver.grpc.FlowControl flow_control = 3;</code>
   */
  io.axoniq.axonserver.grpc.FlowControlOrBuilder getFlowControlOrBuilder();

  /**
   * <pre>
   * Sends a result of Command processing 
   * </pre>
   *
   * <code>.io.axoniq.axonserver.grpc.command.CommandResponse command_response = 4;</code>
   */
  boolean hasCommandResponse();
  /**
   * <pre>
   * Sends a result of Command processing 
   * </pre>
   *
   * <code>.io.axoniq.axonserver.grpc.command.CommandResponse command_response = 4;</code>
   */
  io.axoniq.axonserver.grpc.command.CommandResponse getCommandResponse();
  /**
   * <pre>
   * Sends a result of Command processing 
   * </pre>
   *
   * <code>.io.axoniq.axonserver.grpc.command.CommandResponse command_response = 4;</code>
   */
  io.axoniq.axonserver.grpc.command.CommandResponseOrBuilder getCommandResponseOrBuilder();

  /**
   * <pre>
   * Acknowledgement of previously sent instruction via inbound stream 
   * </pre>
   *
   * <code>.io.axoniq.axonserver.grpc.InstructionAck ack = 5;</code>
   */
  boolean hasAck();
  /**
   * <pre>
   * Acknowledgement of previously sent instruction via inbound stream 
   * </pre>
   *
   * <code>.io.axoniq.axonserver.grpc.InstructionAck ack = 5;</code>
   */
  io.axoniq.axonserver.grpc.InstructionAck getAck();
  /**
   * <pre>
   * Acknowledgement of previously sent instruction via inbound stream 
   * </pre>
   *
   * <code>.io.axoniq.axonserver.grpc.InstructionAck ack = 5;</code>
   */
  io.axoniq.axonserver.grpc.InstructionAckOrBuilder getAckOrBuilder();

  /**
   * <pre>
   * Instruction identifier. If this identifier is set, this instruction will be acknowledged via inbound stream 
   * </pre>
   *
   * <code>string instruction_id = 6;</code>
   */
  java.lang.String getInstructionId();
  /**
   * <pre>
   * Instruction identifier. If this identifier is set, this instruction will be acknowledged via inbound stream 
   * </pre>
   *
   * <code>string instruction_id = 6;</code>
   */
  com.google.protobuf.ByteString
      getInstructionIdBytes();

  public io.axoniq.axonserver.grpc.command.CommandProviderOutbound.RequestCase getRequestCase();
}