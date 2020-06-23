// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package io.axoniq.axonserver.grpc;

public interface ProcessingInstructionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.axoniq.axonserver.grpc.ProcessingInstruction)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The type of processing message. 
   * </pre>
   *
   * <code>.io.axoniq.axonserver.grpc.ProcessingKey key = 1;</code>
   */
  int getKeyValue();
  /**
   * <pre>
   * The type of processing message. 
   * </pre>
   *
   * <code>.io.axoniq.axonserver.grpc.ProcessingKey key = 1;</code>
   */
  io.axoniq.axonserver.grpc.ProcessingKey getKey();

  /**
   * <pre>
   * The value associated with the processing key.  
   * </pre>
   *
   * <code>.io.axoniq.axonserver.grpc.MetaDataValue value = 2;</code>
   */
  boolean hasValue();
  /**
   * <pre>
   * The value associated with the processing key.  
   * </pre>
   *
   * <code>.io.axoniq.axonserver.grpc.MetaDataValue value = 2;</code>
   */
  io.axoniq.axonserver.grpc.MetaDataValue getValue();
  /**
   * <pre>
   * The value associated with the processing key.  
   * </pre>
   *
   * <code>.io.axoniq.axonserver.grpc.MetaDataValue value = 2;</code>
   */
  io.axoniq.axonserver.grpc.MetaDataValueOrBuilder getValueOrBuilder();
}
