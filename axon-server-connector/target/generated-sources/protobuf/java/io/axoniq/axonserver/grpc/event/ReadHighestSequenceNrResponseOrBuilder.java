// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: event.proto

package io.axoniq.axonserver.grpc.event;

public interface ReadHighestSequenceNrResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.axoniq.axonserver.grpc.event.ReadHighestSequenceNrResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The sequence number of the latest event 
   * </pre>
   *
   * <code>int64 to_sequence_nr = 1;</code>
   */
  long getToSequenceNr();
}
