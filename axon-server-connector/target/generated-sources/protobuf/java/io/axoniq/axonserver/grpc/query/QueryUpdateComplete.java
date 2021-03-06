// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: query.proto

package io.axoniq.axonserver.grpc.query;

/**
 * <pre>
 * Message indicating that all relevant Updates have been sent for a Subscription Query, and that no further Updates are available 
 * </pre>
 *
 * Protobuf type {@code io.axoniq.axonserver.grpc.query.QueryUpdateComplete}
 */
public  final class QueryUpdateComplete extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.axoniq.axonserver.grpc.query.QueryUpdateComplete)
    QueryUpdateCompleteOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryUpdateComplete.newBuilder() to construct.
  private QueryUpdateComplete(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryUpdateComplete() {
    clientId_ = "";
    componentName_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private QueryUpdateComplete(
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
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            clientId_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            componentName_ = s;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.axoniq.axonserver.grpc.query.Query.internal_static_io_axoniq_axonserver_grpc_query_QueryUpdateComplete_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.axoniq.axonserver.grpc.query.Query.internal_static_io_axoniq_axonserver_grpc_query_QueryUpdateComplete_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.axoniq.axonserver.grpc.query.QueryUpdateComplete.class, io.axoniq.axonserver.grpc.query.QueryUpdateComplete.Builder.class);
  }

  public static final int CLIENT_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object clientId_;
  /**
   * <pre>
   * The identifier of the Client instance providing the Update 
   * </pre>
   *
   * <code>string client_id = 2;</code>
   */
  public java.lang.String getClientId() {
    java.lang.Object ref = clientId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      clientId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The identifier of the Client instance providing the Update 
   * </pre>
   *
   * <code>string client_id = 2;</code>
   */
  public com.google.protobuf.ByteString
      getClientIdBytes() {
    java.lang.Object ref = clientId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      clientId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COMPONENT_NAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object componentName_;
  /**
   * <pre>
   * The Component Name of the Client providing the Update 
   * </pre>
   *
   * <code>string component_name = 3;</code>
   */
  public java.lang.String getComponentName() {
    java.lang.Object ref = componentName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      componentName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The Component Name of the Client providing the Update 
   * </pre>
   *
   * <code>string component_name = 3;</code>
   */
  public com.google.protobuf.ByteString
      getComponentNameBytes() {
    java.lang.Object ref = componentName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      componentName_ = b;
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
    if (!getClientIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, clientId_);
    }
    if (!getComponentNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, componentName_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getClientIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, clientId_);
    }
    if (!getComponentNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, componentName_);
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
    if (!(obj instanceof io.axoniq.axonserver.grpc.query.QueryUpdateComplete)) {
      return super.equals(obj);
    }
    io.axoniq.axonserver.grpc.query.QueryUpdateComplete other = (io.axoniq.axonserver.grpc.query.QueryUpdateComplete) obj;

    boolean result = true;
    result = result && getClientId()
        .equals(other.getClientId());
    result = result && getComponentName()
        .equals(other.getComponentName());
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
    hash = (37 * hash) + CLIENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getClientId().hashCode();
    hash = (37 * hash) + COMPONENT_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getComponentName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.axoniq.axonserver.grpc.query.QueryUpdateComplete parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.axoniq.axonserver.grpc.query.QueryUpdateComplete parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.axoniq.axonserver.grpc.query.QueryUpdateComplete parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.axoniq.axonserver.grpc.query.QueryUpdateComplete parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.axoniq.axonserver.grpc.query.QueryUpdateComplete parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.axoniq.axonserver.grpc.query.QueryUpdateComplete parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.axoniq.axonserver.grpc.query.QueryUpdateComplete parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.axoniq.axonserver.grpc.query.QueryUpdateComplete parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.axoniq.axonserver.grpc.query.QueryUpdateComplete parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.axoniq.axonserver.grpc.query.QueryUpdateComplete parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.axoniq.axonserver.grpc.query.QueryUpdateComplete parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.axoniq.axonserver.grpc.query.QueryUpdateComplete parseFrom(
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
  public static Builder newBuilder(io.axoniq.axonserver.grpc.query.QueryUpdateComplete prototype) {
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
   * Message indicating that all relevant Updates have been sent for a Subscription Query, and that no further Updates are available 
   * </pre>
   *
   * Protobuf type {@code io.axoniq.axonserver.grpc.query.QueryUpdateComplete}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.axoniq.axonserver.grpc.query.QueryUpdateComplete)
      io.axoniq.axonserver.grpc.query.QueryUpdateCompleteOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.axoniq.axonserver.grpc.query.Query.internal_static_io_axoniq_axonserver_grpc_query_QueryUpdateComplete_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.axoniq.axonserver.grpc.query.Query.internal_static_io_axoniq_axonserver_grpc_query_QueryUpdateComplete_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.axoniq.axonserver.grpc.query.QueryUpdateComplete.class, io.axoniq.axonserver.grpc.query.QueryUpdateComplete.Builder.class);
    }

    // Construct using io.axoniq.axonserver.grpc.query.QueryUpdateComplete.newBuilder()
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
      clientId_ = "";

      componentName_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.axoniq.axonserver.grpc.query.Query.internal_static_io_axoniq_axonserver_grpc_query_QueryUpdateComplete_descriptor;
    }

    @java.lang.Override
    public io.axoniq.axonserver.grpc.query.QueryUpdateComplete getDefaultInstanceForType() {
      return io.axoniq.axonserver.grpc.query.QueryUpdateComplete.getDefaultInstance();
    }

    @java.lang.Override
    public io.axoniq.axonserver.grpc.query.QueryUpdateComplete build() {
      io.axoniq.axonserver.grpc.query.QueryUpdateComplete result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.axoniq.axonserver.grpc.query.QueryUpdateComplete buildPartial() {
      io.axoniq.axonserver.grpc.query.QueryUpdateComplete result = new io.axoniq.axonserver.grpc.query.QueryUpdateComplete(this);
      result.clientId_ = clientId_;
      result.componentName_ = componentName_;
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
      if (other instanceof io.axoniq.axonserver.grpc.query.QueryUpdateComplete) {
        return mergeFrom((io.axoniq.axonserver.grpc.query.QueryUpdateComplete)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.axoniq.axonserver.grpc.query.QueryUpdateComplete other) {
      if (other == io.axoniq.axonserver.grpc.query.QueryUpdateComplete.getDefaultInstance()) return this;
      if (!other.getClientId().isEmpty()) {
        clientId_ = other.clientId_;
        onChanged();
      }
      if (!other.getComponentName().isEmpty()) {
        componentName_ = other.componentName_;
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
      io.axoniq.axonserver.grpc.query.QueryUpdateComplete parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.axoniq.axonserver.grpc.query.QueryUpdateComplete) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object clientId_ = "";
    /**
     * <pre>
     * The identifier of the Client instance providing the Update 
     * </pre>
     *
     * <code>string client_id = 2;</code>
     */
    public java.lang.String getClientId() {
      java.lang.Object ref = clientId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clientId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The identifier of the Client instance providing the Update 
     * </pre>
     *
     * <code>string client_id = 2;</code>
     */
    public com.google.protobuf.ByteString
        getClientIdBytes() {
      java.lang.Object ref = clientId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clientId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The identifier of the Client instance providing the Update 
     * </pre>
     *
     * <code>string client_id = 2;</code>
     */
    public Builder setClientId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      clientId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The identifier of the Client instance providing the Update 
     * </pre>
     *
     * <code>string client_id = 2;</code>
     */
    public Builder clearClientId() {
      
      clientId_ = getDefaultInstance().getClientId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The identifier of the Client instance providing the Update 
     * </pre>
     *
     * <code>string client_id = 2;</code>
     */
    public Builder setClientIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      clientId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object componentName_ = "";
    /**
     * <pre>
     * The Component Name of the Client providing the Update 
     * </pre>
     *
     * <code>string component_name = 3;</code>
     */
    public java.lang.String getComponentName() {
      java.lang.Object ref = componentName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        componentName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The Component Name of the Client providing the Update 
     * </pre>
     *
     * <code>string component_name = 3;</code>
     */
    public com.google.protobuf.ByteString
        getComponentNameBytes() {
      java.lang.Object ref = componentName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        componentName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The Component Name of the Client providing the Update 
     * </pre>
     *
     * <code>string component_name = 3;</code>
     */
    public Builder setComponentName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      componentName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Component Name of the Client providing the Update 
     * </pre>
     *
     * <code>string component_name = 3;</code>
     */
    public Builder clearComponentName() {
      
      componentName_ = getDefaultInstance().getComponentName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Component Name of the Client providing the Update 
     * </pre>
     *
     * <code>string component_name = 3;</code>
     */
    public Builder setComponentNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      componentName_ = value;
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


    // @@protoc_insertion_point(builder_scope:io.axoniq.axonserver.grpc.query.QueryUpdateComplete)
  }

  // @@protoc_insertion_point(class_scope:io.axoniq.axonserver.grpc.query.QueryUpdateComplete)
  private static final io.axoniq.axonserver.grpc.query.QueryUpdateComplete DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.axoniq.axonserver.grpc.query.QueryUpdateComplete();
  }

  public static io.axoniq.axonserver.grpc.query.QueryUpdateComplete getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryUpdateComplete>
      PARSER = new com.google.protobuf.AbstractParser<QueryUpdateComplete>() {
    @java.lang.Override
    public QueryUpdateComplete parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new QueryUpdateComplete(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QueryUpdateComplete> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryUpdateComplete> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.axoniq.axonserver.grpc.query.QueryUpdateComplete getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

