// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package io.axoniq.axonserver.grpc;

public final class Common {
  private Common() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_axoniq_axonserver_grpc_SerializedObject_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_axoniq_axonserver_grpc_SerializedObject_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_axoniq_axonserver_grpc_MetaDataValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_axoniq_axonserver_grpc_MetaDataValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_axoniq_axonserver_grpc_ProcessingInstruction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_axoniq_axonserver_grpc_ProcessingInstruction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_axoniq_axonserver_grpc_ErrorMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_axoniq_axonserver_grpc_ErrorMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_axoniq_axonserver_grpc_FlowControl_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_axoniq_axonserver_grpc_FlowControl_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_axoniq_axonserver_grpc_InstructionAck_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_axoniq_axonserver_grpc_InstructionAck_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014common.proto\022\031io.axoniq.axonserver.grp" +
      "c\032\031google/protobuf/any.proto\"@\n\020Serializ" +
      "edObject\022\014\n\004type\030\001 \001(\t\022\020\n\010revision\030\002 \001(\t" +
      "\022\014\n\004data\030\003 \001(\014\"\272\001\n\rMetaDataValue\022\024\n\ntext" +
      "_value\030\001 \001(\tH\000\022\026\n\014number_value\030\002 \001(\022H\000\022\027" +
      "\n\rboolean_value\030\003 \001(\010H\000\022\026\n\014double_value\030" +
      "\004 \001(\001H\000\022B\n\013bytes_value\030\005 \001(\0132+.io.axoniq" +
      ".axonserver.grpc.SerializedObjectH\000B\006\n\004d" +
      "ata\"\207\001\n\025ProcessingInstruction\0225\n\003key\030\001 \001" +
      "(\0162(.io.axoniq.axonserver.grpc.Processin" +
      "gKey\0227\n\005value\030\002 \001(\0132(.io.axoniq.axonserv" +
      "er.grpc.MetaDataValue\"V\n\014ErrorMessage\022\017\n" +
      "\007message\030\001 \001(\t\022\020\n\010location\030\002 \001(\t\022\017\n\007deta" +
      "ils\030\003 \003(\t\022\022\n\nerror_code\030\004 \001(\t\"7\n\013FlowCon" +
      "trol\022\021\n\tclient_id\030\002 \001(\t\022\017\n\007permits\030\003 \001(\003" +
      "J\004\010\001\020\002\"q\n\016InstructionAck\022\026\n\016instruction_" +
      "id\030\001 \001(\t\022\017\n\007success\030\002 \001(\010\0226\n\005error\030\003 \001(\013" +
      "2\'.io.axoniq.axonserver.grpc.ErrorMessag" +
      "e*`\n\rProcessingKey\022\017\n\013ROUTING_KEY\020\000\022\014\n\010P" +
      "RIORITY\020\001\022\013\n\007TIMEOUT\020\002\022\021\n\rNR_OF_RESULTS\020" +
      "\003\"\004\010\004\020\004\"\004\010\005\020\005\"\004\010\006\020\006B\002P\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.AnyProto.getDescriptor(),
        }, assigner);
    internal_static_io_axoniq_axonserver_grpc_SerializedObject_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_io_axoniq_axonserver_grpc_SerializedObject_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_axoniq_axonserver_grpc_SerializedObject_descriptor,
        new java.lang.String[] { "Type", "Revision", "Data", });
    internal_static_io_axoniq_axonserver_grpc_MetaDataValue_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_io_axoniq_axonserver_grpc_MetaDataValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_axoniq_axonserver_grpc_MetaDataValue_descriptor,
        new java.lang.String[] { "TextValue", "NumberValue", "BooleanValue", "DoubleValue", "BytesValue", "Data", });
    internal_static_io_axoniq_axonserver_grpc_ProcessingInstruction_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_io_axoniq_axonserver_grpc_ProcessingInstruction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_axoniq_axonserver_grpc_ProcessingInstruction_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_io_axoniq_axonserver_grpc_ErrorMessage_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_io_axoniq_axonserver_grpc_ErrorMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_axoniq_axonserver_grpc_ErrorMessage_descriptor,
        new java.lang.String[] { "Message", "Location", "Details", "ErrorCode", });
    internal_static_io_axoniq_axonserver_grpc_FlowControl_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_io_axoniq_axonserver_grpc_FlowControl_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_axoniq_axonserver_grpc_FlowControl_descriptor,
        new java.lang.String[] { "ClientId", "Permits", });
    internal_static_io_axoniq_axonserver_grpc_InstructionAck_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_io_axoniq_axonserver_grpc_InstructionAck_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_axoniq_axonserver_grpc_InstructionAck_descriptor,
        new java.lang.String[] { "InstructionId", "Success", "Error", });
    com.google.protobuf.AnyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}