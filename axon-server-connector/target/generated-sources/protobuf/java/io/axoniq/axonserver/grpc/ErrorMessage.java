// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package io.axoniq.axonserver.grpc;

/**
 * <pre>
 * Message containing details of an error 
 * </pre>
 *
 * Protobuf type {@code io.axoniq.axonserver.grpc.ErrorMessage}
 */
public  final class ErrorMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.axoniq.axonserver.grpc.ErrorMessage)
    ErrorMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ErrorMessage.newBuilder() to construct.
  private ErrorMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ErrorMessage() {
    message_ = "";
    location_ = "";
    details_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    errorCode_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ErrorMessage(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            message_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            location_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              details_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000004;
            }
            details_.add(s);
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            errorCode_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        details_ = details_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.axoniq.axonserver.grpc.Common.internal_static_io_axoniq_axonserver_grpc_ErrorMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.axoniq.axonserver.grpc.Common.internal_static_io_axoniq_axonserver_grpc_ErrorMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.axoniq.axonserver.grpc.ErrorMessage.class, io.axoniq.axonserver.grpc.ErrorMessage.Builder.class);
  }

  private int bitField0_;
  public static final int MESSAGE_FIELD_NUMBER = 1;
  private volatile java.lang.Object message_;
  /**
   * <pre>
   * A human readable message explaining the error 
   * </pre>
   *
   * <code>string message = 1;</code>
   */
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A human readable message explaining the error 
   * </pre>
   *
   * <code>string message = 1;</code>
   */
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LOCATION_FIELD_NUMBER = 2;
  private volatile java.lang.Object location_;
  /**
   * <pre>
   * A description of the location (client component, server) where the error occurred 
   * </pre>
   *
   * <code>string location = 2;</code>
   */
  public java.lang.String getLocation() {
    java.lang.Object ref = location_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      location_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A description of the location (client component, server) where the error occurred 
   * </pre>
   *
   * <code>string location = 2;</code>
   */
  public com.google.protobuf.ByteString
      getLocationBytes() {
    java.lang.Object ref = location_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      location_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DETAILS_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList details_;
  /**
   * <pre>
   * A collection of messages providing more details about root causes of the error 
   * </pre>
   *
   * <code>repeated string details = 3;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getDetailsList() {
    return details_;
  }
  /**
   * <pre>
   * A collection of messages providing more details about root causes of the error 
   * </pre>
   *
   * <code>repeated string details = 3;</code>
   */
  public int getDetailsCount() {
    return details_.size();
  }
  /**
   * <pre>
   * A collection of messages providing more details about root causes of the error 
   * </pre>
   *
   * <code>repeated string details = 3;</code>
   */
  public java.lang.String getDetails(int index) {
    return details_.get(index);
  }
  /**
   * <pre>
   * A collection of messages providing more details about root causes of the error 
   * </pre>
   *
   * <code>repeated string details = 3;</code>
   */
  public com.google.protobuf.ByteString
      getDetailsBytes(int index) {
    return details_.getByteString(index);
  }

  public static final int ERROR_CODE_FIELD_NUMBER = 4;
  private volatile java.lang.Object errorCode_;
  /**
   * <pre>
   * An Error Code identifying the type of error 
   * </pre>
   *
   * <code>string error_code = 4;</code>
   */
  public java.lang.String getErrorCode() {
    java.lang.Object ref = errorCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      errorCode_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * An Error Code identifying the type of error 
   * </pre>
   *
   * <code>string error_code = 4;</code>
   */
  public com.google.protobuf.ByteString
      getErrorCodeBytes() {
    java.lang.Object ref = errorCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      errorCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, message_);
    }
    if (!getLocationBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, location_);
    }
    for (int i = 0; i < details_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, details_.getRaw(i));
    }
    if (!getErrorCodeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, errorCode_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, message_);
    }
    if (!getLocationBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, location_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < details_.size(); i++) {
        dataSize += computeStringSizeNoTag(details_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getDetailsList().size();
    }
    if (!getErrorCodeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, errorCode_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.axoniq.axonserver.grpc.ErrorMessage)) {
      return super.equals(obj);
    }
    io.axoniq.axonserver.grpc.ErrorMessage other = (io.axoniq.axonserver.grpc.ErrorMessage) obj;

    boolean result = true;
    result = result && getMessage()
        .equals(other.getMessage());
    result = result && getLocation()
        .equals(other.getLocation());
    result = result && getDetailsList()
        .equals(other.getDetailsList());
    result = result && getErrorCode()
        .equals(other.getErrorCode());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    hash = (37 * hash) + LOCATION_FIELD_NUMBER;
    hash = (53 * hash) + getLocation().hashCode();
    if (getDetailsCount() > 0) {
      hash = (37 * hash) + DETAILS_FIELD_NUMBER;
      hash = (53 * hash) + getDetailsList().hashCode();
    }
    hash = (37 * hash) + ERROR_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getErrorCode().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.axoniq.axonserver.grpc.ErrorMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.axoniq.axonserver.grpc.ErrorMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.axoniq.axonserver.grpc.ErrorMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.axoniq.axonserver.grpc.ErrorMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.axoniq.axonserver.grpc.ErrorMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.axoniq.axonserver.grpc.ErrorMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.axoniq.axonserver.grpc.ErrorMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.axoniq.axonserver.grpc.ErrorMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.axoniq.axonserver.grpc.ErrorMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.axoniq.axonserver.grpc.ErrorMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.axoniq.axonserver.grpc.ErrorMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.axoniq.axonserver.grpc.ErrorMessage parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.axoniq.axonserver.grpc.ErrorMessage prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Message containing details of an error 
   * </pre>
   *
   * Protobuf type {@code io.axoniq.axonserver.grpc.ErrorMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.axoniq.axonserver.grpc.ErrorMessage)
      io.axoniq.axonserver.grpc.ErrorMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.axoniq.axonserver.grpc.Common.internal_static_io_axoniq_axonserver_grpc_ErrorMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.axoniq.axonserver.grpc.Common.internal_static_io_axoniq_axonserver_grpc_ErrorMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.axoniq.axonserver.grpc.ErrorMessage.class, io.axoniq.axonserver.grpc.ErrorMessage.Builder.class);
    }

    // Construct using io.axoniq.axonserver.grpc.ErrorMessage.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      message_ = "";

      location_ = "";

      details_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      errorCode_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.axoniq.axonserver.grpc.Common.internal_static_io_axoniq_axonserver_grpc_ErrorMessage_descriptor;
    }

    @java.lang.Override
    public io.axoniq.axonserver.grpc.ErrorMessage getDefaultInstanceForType() {
      return io.axoniq.axonserver.grpc.ErrorMessage.getDefaultInstance();
    }

    @java.lang.Override
    public io.axoniq.axonserver.grpc.ErrorMessage build() {
      io.axoniq.axonserver.grpc.ErrorMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.axoniq.axonserver.grpc.ErrorMessage buildPartial() {
      io.axoniq.axonserver.grpc.ErrorMessage result = new io.axoniq.axonserver.grpc.ErrorMessage(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.message_ = message_;
      result.location_ = location_;
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        details_ = details_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000004);
      }
      result.details_ = details_;
      result.errorCode_ = errorCode_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.axoniq.axonserver.grpc.ErrorMessage) {
        return mergeFrom((io.axoniq.axonserver.grpc.ErrorMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.axoniq.axonserver.grpc.ErrorMessage other) {
      if (other == io.axoniq.axonserver.grpc.ErrorMessage.getDefaultInstance()) return this;
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        onChanged();
      }
      if (!other.getLocation().isEmpty()) {
        location_ = other.location_;
        onChanged();
      }
      if (!other.details_.isEmpty()) {
        if (details_.isEmpty()) {
          details_ = other.details_;
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          ensureDetailsIsMutable();
          details_.addAll(other.details_);
        }
        onChanged();
      }
      if (!other.getErrorCode().isEmpty()) {
        errorCode_ = other.errorCode_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.axoniq.axonserver.grpc.ErrorMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.axoniq.axonserver.grpc.ErrorMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object message_ = "";
    /**
     * <pre>
     * A human readable message explaining the error 
     * </pre>
     *
     * <code>string message = 1;</code>
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A human readable message explaining the error 
     * </pre>
     *
     * <code>string message = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A human readable message explaining the error 
     * </pre>
     *
     * <code>string message = 1;</code>
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A human readable message explaining the error 
     * </pre>
     *
     * <code>string message = 1;</code>
     */
    public Builder clearMessage() {
      
      message_ = getDefaultInstance().getMessage();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A human readable message explaining the error 
     * </pre>
     *
     * <code>string message = 1;</code>
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      message_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object location_ = "";
    /**
     * <pre>
     * A description of the location (client component, server) where the error occurred 
     * </pre>
     *
     * <code>string location = 2;</code>
     */
    public java.lang.String getLocation() {
      java.lang.Object ref = location_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        location_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A description of the location (client component, server) where the error occurred 
     * </pre>
     *
     * <code>string location = 2;</code>
     */
    public com.google.protobuf.ByteString
        getLocationBytes() {
      java.lang.Object ref = location_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        location_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A description of the location (client component, server) where the error occurred 
     * </pre>
     *
     * <code>string location = 2;</code>
     */
    public Builder setLocation(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      location_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A description of the location (client component, server) where the error occurred 
     * </pre>
     *
     * <code>string location = 2;</code>
     */
    public Builder clearLocation() {
      
      location_ = getDefaultInstance().getLocation();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A description of the location (client component, server) where the error occurred 
     * </pre>
     *
     * <code>string location = 2;</code>
     */
    public Builder setLocationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      location_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList details_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureDetailsIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        details_ = new com.google.protobuf.LazyStringArrayList(details_);
        bitField0_ |= 0x00000004;
       }
    }
    /**
     * <pre>
     * A collection of messages providing more details about root causes of the error 
     * </pre>
     *
     * <code>repeated string details = 3;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getDetailsList() {
      return details_.getUnmodifiableView();
    }
    /**
     * <pre>
     * A collection of messages providing more details about root causes of the error 
     * </pre>
     *
     * <code>repeated string details = 3;</code>
     */
    public int getDetailsCount() {
      return details_.size();
    }
    /**
     * <pre>
     * A collection of messages providing more details about root causes of the error 
     * </pre>
     *
     * <code>repeated string details = 3;</code>
     */
    public java.lang.String getDetails(int index) {
      return details_.get(index);
    }
    /**
     * <pre>
     * A collection of messages providing more details about root causes of the error 
     * </pre>
     *
     * <code>repeated string details = 3;</code>
     */
    public com.google.protobuf.ByteString
        getDetailsBytes(int index) {
      return details_.getByteString(index);
    }
    /**
     * <pre>
     * A collection of messages providing more details about root causes of the error 
     * </pre>
     *
     * <code>repeated string details = 3;</code>
     */
    public Builder setDetails(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureDetailsIsMutable();
      details_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A collection of messages providing more details about root causes of the error 
     * </pre>
     *
     * <code>repeated string details = 3;</code>
     */
    public Builder addDetails(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureDetailsIsMutable();
      details_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A collection of messages providing more details about root causes of the error 
     * </pre>
     *
     * <code>repeated string details = 3;</code>
     */
    public Builder addAllDetails(
        java.lang.Iterable<java.lang.String> values) {
      ensureDetailsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, details_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A collection of messages providing more details about root causes of the error 
     * </pre>
     *
     * <code>repeated string details = 3;</code>
     */
    public Builder clearDetails() {
      details_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A collection of messages providing more details about root causes of the error 
     * </pre>
     *
     * <code>repeated string details = 3;</code>
     */
    public Builder addDetailsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureDetailsIsMutable();
      details_.add(value);
      onChanged();
      return this;
    }

    private java.lang.Object errorCode_ = "";
    /**
     * <pre>
     * An Error Code identifying the type of error 
     * </pre>
     *
     * <code>string error_code = 4;</code>
     */
    public java.lang.String getErrorCode() {
      java.lang.Object ref = errorCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        errorCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * An Error Code identifying the type of error 
     * </pre>
     *
     * <code>string error_code = 4;</code>
     */
    public com.google.protobuf.ByteString
        getErrorCodeBytes() {
      java.lang.Object ref = errorCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        errorCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * An Error Code identifying the type of error 
     * </pre>
     *
     * <code>string error_code = 4;</code>
     */
    public Builder setErrorCode(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      errorCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An Error Code identifying the type of error 
     * </pre>
     *
     * <code>string error_code = 4;</code>
     */
    public Builder clearErrorCode() {
      
      errorCode_ = getDefaultInstance().getErrorCode();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An Error Code identifying the type of error 
     * </pre>
     *
     * <code>string error_code = 4;</code>
     */
    public Builder setErrorCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      errorCode_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:io.axoniq.axonserver.grpc.ErrorMessage)
  }

  // @@protoc_insertion_point(class_scope:io.axoniq.axonserver.grpc.ErrorMessage)
  private static final io.axoniq.axonserver.grpc.ErrorMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.axoniq.axonserver.grpc.ErrorMessage();
  }

  public static io.axoniq.axonserver.grpc.ErrorMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ErrorMessage>
      PARSER = new com.google.protobuf.AbstractParser<ErrorMessage>() {
    @java.lang.Override
    public ErrorMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ErrorMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ErrorMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ErrorMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.axoniq.axonserver.grpc.ErrorMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

