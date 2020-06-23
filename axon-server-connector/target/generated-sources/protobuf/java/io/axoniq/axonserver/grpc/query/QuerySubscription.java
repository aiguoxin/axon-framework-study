// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: query.proto

package io.axoniq.axonserver.grpc.query;

/**
 * <pre>
 * Message containing details of a Registration of a Query Handler in a component
 * </pre>
 *
 * Protobuf type {@code io.axoniq.axonserver.grpc.query.QuerySubscription}
 */
public  final class QuerySubscription extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.axoniq.axonserver.grpc.query.QuerySubscription)
    QuerySubscriptionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QuerySubscription.newBuilder() to construct.
  private QuerySubscription(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QuerySubscription() {
    messageId_ = "";
    query_ = "";
    resultName_ = "";
    componentName_ = "";
    clientId_ = "";
    nrOfHandlers_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private QuerySubscription(
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

            messageId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            query_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            resultName_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            componentName_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            clientId_ = s;
            break;
          }
          case 48: {

            nrOfHandlers_ = input.readInt32();
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
    return io.axoniq.axonserver.grpc.query.Query.internal_static_io_axoniq_axonserver_grpc_query_QuerySubscription_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.axoniq.axonserver.grpc.query.Query.internal_static_io_axoniq_axonserver_grpc_query_QuerySubscription_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.axoniq.axonserver.grpc.query.QuerySubscription.class, io.axoniq.axonserver.grpc.query.QuerySubscription.Builder.class);
  }

  public static final int MESSAGE_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object messageId_;
  /**
   * <pre>
   * The unique identifier of this Message 
   * </pre>
   *
   * <code>string message_id = 1;</code>
   */
  public java.lang.String getMessageId() {
    java.lang.Object ref = messageId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      messageId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The unique identifier of this Message 
   * </pre>
   *
   * <code>string message_id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getMessageIdBytes() {
    java.lang.Object ref = messageId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      messageId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int QUERY_FIELD_NUMBER = 2;
  private volatile java.lang.Object query_;
  /**
   * <pre>
   * The name of the Query the Handler is subscribed to 
   * </pre>
   *
   * <code>string query = 2;</code>
   */
  public java.lang.String getQuery() {
    java.lang.Object ref = query_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      query_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The name of the Query the Handler is subscribed to 
   * </pre>
   *
   * <code>string query = 2;</code>
   */
  public com.google.protobuf.ByteString
      getQueryBytes() {
    java.lang.Object ref = query_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      query_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESULT_NAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object resultName_;
  /**
   * <pre>
   * The type of Result this Handler produces 
   * </pre>
   *
   * <code>string result_name = 3;</code>
   */
  public java.lang.String getResultName() {
    java.lang.Object ref = resultName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resultName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The type of Result this Handler produces 
   * </pre>
   *
   * <code>string result_name = 3;</code>
   */
  public com.google.protobuf.ByteString
      getResultNameBytes() {
    java.lang.Object ref = resultName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resultName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COMPONENT_NAME_FIELD_NUMBER = 4;
  private volatile java.lang.Object componentName_;
  /**
   * <pre>
   * The name of the Component containing the Query Handler 
   * </pre>
   *
   * <code>string component_name = 4;</code>
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
   * The name of the Component containing the Query Handler 
   * </pre>
   *
   * <code>string component_name = 4;</code>
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

  public static final int CLIENT_ID_FIELD_NUMBER = 5;
  private volatile java.lang.Object clientId_;
  /**
   * <pre>
   * The unique identifier of the Client Instance containing the Query Handler 
   * </pre>
   *
   * <code>string client_id = 5;</code>
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
   * The unique identifier of the Client Instance containing the Query Handler 
   * </pre>
   *
   * <code>string client_id = 5;</code>
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

  public static final int NR_OF_HANDLERS_FIELD_NUMBER = 6;
  private int nrOfHandlers_;
  /**
   * <pre>
   * The number of Query Handlers registered within this Component with the same details. This number is used to
   *calculate the number of candidates for Scatter-Gather Queries.
   * </pre>
   *
   * <code>int32 nr_of_handlers = 6;</code>
   */
  public int getNrOfHandlers() {
    return nrOfHandlers_;
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
    if (!getMessageIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, messageId_);
    }
    if (!getQueryBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, query_);
    }
    if (!getResultNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, resultName_);
    }
    if (!getComponentNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, componentName_);
    }
    if (!getClientIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, clientId_);
    }
    if (nrOfHandlers_ != 0) {
      output.writeInt32(6, nrOfHandlers_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getMessageIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, messageId_);
    }
    if (!getQueryBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, query_);
    }
    if (!getResultNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, resultName_);
    }
    if (!getComponentNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, componentName_);
    }
    if (!getClientIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, clientId_);
    }
    if (nrOfHandlers_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, nrOfHandlers_);
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
    if (!(obj instanceof io.axoniq.axonserver.grpc.query.QuerySubscription)) {
      return super.equals(obj);
    }
    io.axoniq.axonserver.grpc.query.QuerySubscription other = (io.axoniq.axonserver.grpc.query.QuerySubscription) obj;

    boolean result = true;
    result = result && getMessageId()
        .equals(other.getMessageId());
    result = result && getQuery()
        .equals(other.getQuery());
    result = result && getResultName()
        .equals(other.getResultName());
    result = result && getComponentName()
        .equals(other.getComponentName());
    result = result && getClientId()
        .equals(other.getClientId());
    result = result && (getNrOfHandlers()
        == other.getNrOfHandlers());
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
    hash = (37 * hash) + MESSAGE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getMessageId().hashCode();
    hash = (37 * hash) + QUERY_FIELD_NUMBER;
    hash = (53 * hash) + getQuery().hashCode();
    hash = (37 * hash) + RESULT_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getResultName().hashCode();
    hash = (37 * hash) + COMPONENT_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getComponentName().hashCode();
    hash = (37 * hash) + CLIENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getClientId().hashCode();
    hash = (37 * hash) + NR_OF_HANDLERS_FIELD_NUMBER;
    hash = (53 * hash) + getNrOfHandlers();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.axoniq.axonserver.grpc.query.QuerySubscription parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.axoniq.axonserver.grpc.query.QuerySubscription parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.axoniq.axonserver.grpc.query.QuerySubscription parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.axoniq.axonserver.grpc.query.QuerySubscription parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.axoniq.axonserver.grpc.query.QuerySubscription parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.axoniq.axonserver.grpc.query.QuerySubscription parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.axoniq.axonserver.grpc.query.QuerySubscription parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.axoniq.axonserver.grpc.query.QuerySubscription parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.axoniq.axonserver.grpc.query.QuerySubscription parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.axoniq.axonserver.grpc.query.QuerySubscription parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.axoniq.axonserver.grpc.query.QuerySubscription parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.axoniq.axonserver.grpc.query.QuerySubscription parseFrom(
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
  public static Builder newBuilder(io.axoniq.axonserver.grpc.query.QuerySubscription prototype) {
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
   * Message containing details of a Registration of a Query Handler in a component
   * </pre>
   *
   * Protobuf type {@code io.axoniq.axonserver.grpc.query.QuerySubscription}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.axoniq.axonserver.grpc.query.QuerySubscription)
      io.axoniq.axonserver.grpc.query.QuerySubscriptionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.axoniq.axonserver.grpc.query.Query.internal_static_io_axoniq_axonserver_grpc_query_QuerySubscription_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.axoniq.axonserver.grpc.query.Query.internal_static_io_axoniq_axonserver_grpc_query_QuerySubscription_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.axoniq.axonserver.grpc.query.QuerySubscription.class, io.axoniq.axonserver.grpc.query.QuerySubscription.Builder.class);
    }

    // Construct using io.axoniq.axonserver.grpc.query.QuerySubscription.newBuilder()
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
      messageId_ = "";

      query_ = "";

      resultName_ = "";

      componentName_ = "";

      clientId_ = "";

      nrOfHandlers_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.axoniq.axonserver.grpc.query.Query.internal_static_io_axoniq_axonserver_grpc_query_QuerySubscription_descriptor;
    }

    @java.lang.Override
    public io.axoniq.axonserver.grpc.query.QuerySubscription getDefaultInstanceForType() {
      return io.axoniq.axonserver.grpc.query.QuerySubscription.getDefaultInstance();
    }

    @java.lang.Override
    public io.axoniq.axonserver.grpc.query.QuerySubscription build() {
      io.axoniq.axonserver.grpc.query.QuerySubscription result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.axoniq.axonserver.grpc.query.QuerySubscription buildPartial() {
      io.axoniq.axonserver.grpc.query.QuerySubscription result = new io.axoniq.axonserver.grpc.query.QuerySubscription(this);
      result.messageId_ = messageId_;
      result.query_ = query_;
      result.resultName_ = resultName_;
      result.componentName_ = componentName_;
      result.clientId_ = clientId_;
      result.nrOfHandlers_ = nrOfHandlers_;
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
      if (other instanceof io.axoniq.axonserver.grpc.query.QuerySubscription) {
        return mergeFrom((io.axoniq.axonserver.grpc.query.QuerySubscription)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.axoniq.axonserver.grpc.query.QuerySubscription other) {
      if (other == io.axoniq.axonserver.grpc.query.QuerySubscription.getDefaultInstance()) return this;
      if (!other.getMessageId().isEmpty()) {
        messageId_ = other.messageId_;
        onChanged();
      }
      if (!other.getQuery().isEmpty()) {
        query_ = other.query_;
        onChanged();
      }
      if (!other.getResultName().isEmpty()) {
        resultName_ = other.resultName_;
        onChanged();
      }
      if (!other.getComponentName().isEmpty()) {
        componentName_ = other.componentName_;
        onChanged();
      }
      if (!other.getClientId().isEmpty()) {
        clientId_ = other.clientId_;
        onChanged();
      }
      if (other.getNrOfHandlers() != 0) {
        setNrOfHandlers(other.getNrOfHandlers());
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
      io.axoniq.axonserver.grpc.query.QuerySubscription parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.axoniq.axonserver.grpc.query.QuerySubscription) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object messageId_ = "";
    /**
     * <pre>
     * The unique identifier of this Message 
     * </pre>
     *
     * <code>string message_id = 1;</code>
     */
    public java.lang.String getMessageId() {
      java.lang.Object ref = messageId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        messageId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The unique identifier of this Message 
     * </pre>
     *
     * <code>string message_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMessageIdBytes() {
      java.lang.Object ref = messageId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        messageId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The unique identifier of this Message 
     * </pre>
     *
     * <code>string message_id = 1;</code>
     */
    public Builder setMessageId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      messageId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The unique identifier of this Message 
     * </pre>
     *
     * <code>string message_id = 1;</code>
     */
    public Builder clearMessageId() {
      
      messageId_ = getDefaultInstance().getMessageId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The unique identifier of this Message 
     * </pre>
     *
     * <code>string message_id = 1;</code>
     */
    public Builder setMessageIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      messageId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object query_ = "";
    /**
     * <pre>
     * The name of the Query the Handler is subscribed to 
     * </pre>
     *
     * <code>string query = 2;</code>
     */
    public java.lang.String getQuery() {
      java.lang.Object ref = query_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        query_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name of the Query the Handler is subscribed to 
     * </pre>
     *
     * <code>string query = 2;</code>
     */
    public com.google.protobuf.ByteString
        getQueryBytes() {
      java.lang.Object ref = query_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        query_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name of the Query the Handler is subscribed to 
     * </pre>
     *
     * <code>string query = 2;</code>
     */
    public Builder setQuery(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      query_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the Query the Handler is subscribed to 
     * </pre>
     *
     * <code>string query = 2;</code>
     */
    public Builder clearQuery() {
      
      query_ = getDefaultInstance().getQuery();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the Query the Handler is subscribed to 
     * </pre>
     *
     * <code>string query = 2;</code>
     */
    public Builder setQueryBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      query_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object resultName_ = "";
    /**
     * <pre>
     * The type of Result this Handler produces 
     * </pre>
     *
     * <code>string result_name = 3;</code>
     */
    public java.lang.String getResultName() {
      java.lang.Object ref = resultName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resultName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The type of Result this Handler produces 
     * </pre>
     *
     * <code>string result_name = 3;</code>
     */
    public com.google.protobuf.ByteString
        getResultNameBytes() {
      java.lang.Object ref = resultName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resultName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The type of Result this Handler produces 
     * </pre>
     *
     * <code>string result_name = 3;</code>
     */
    public Builder setResultName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      resultName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of Result this Handler produces 
     * </pre>
     *
     * <code>string result_name = 3;</code>
     */
    public Builder clearResultName() {
      
      resultName_ = getDefaultInstance().getResultName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of Result this Handler produces 
     * </pre>
     *
     * <code>string result_name = 3;</code>
     */
    public Builder setResultNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      resultName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object componentName_ = "";
    /**
     * <pre>
     * The name of the Component containing the Query Handler 
     * </pre>
     *
     * <code>string component_name = 4;</code>
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
     * The name of the Component containing the Query Handler 
     * </pre>
     *
     * <code>string component_name = 4;</code>
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
     * The name of the Component containing the Query Handler 
     * </pre>
     *
     * <code>string component_name = 4;</code>
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
     * The name of the Component containing the Query Handler 
     * </pre>
     *
     * <code>string component_name = 4;</code>
     */
    public Builder clearComponentName() {
      
      componentName_ = getDefaultInstance().getComponentName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the Component containing the Query Handler 
     * </pre>
     *
     * <code>string component_name = 4;</code>
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

    private java.lang.Object clientId_ = "";
    /**
     * <pre>
     * The unique identifier of the Client Instance containing the Query Handler 
     * </pre>
     *
     * <code>string client_id = 5;</code>
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
     * The unique identifier of the Client Instance containing the Query Handler 
     * </pre>
     *
     * <code>string client_id = 5;</code>
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
     * The unique identifier of the Client Instance containing the Query Handler 
     * </pre>
     *
     * <code>string client_id = 5;</code>
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
     * The unique identifier of the Client Instance containing the Query Handler 
     * </pre>
     *
     * <code>string client_id = 5;</code>
     */
    public Builder clearClientId() {
      
      clientId_ = getDefaultInstance().getClientId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The unique identifier of the Client Instance containing the Query Handler 
     * </pre>
     *
     * <code>string client_id = 5;</code>
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

    private int nrOfHandlers_ ;
    /**
     * <pre>
     * The number of Query Handlers registered within this Component with the same details. This number is used to
     *calculate the number of candidates for Scatter-Gather Queries.
     * </pre>
     *
     * <code>int32 nr_of_handlers = 6;</code>
     */
    public int getNrOfHandlers() {
      return nrOfHandlers_;
    }
    /**
     * <pre>
     * The number of Query Handlers registered within this Component with the same details. This number is used to
     *calculate the number of candidates for Scatter-Gather Queries.
     * </pre>
     *
     * <code>int32 nr_of_handlers = 6;</code>
     */
    public Builder setNrOfHandlers(int value) {
      
      nrOfHandlers_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of Query Handlers registered within this Component with the same details. This number is used to
     *calculate the number of candidates for Scatter-Gather Queries.
     * </pre>
     *
     * <code>int32 nr_of_handlers = 6;</code>
     */
    public Builder clearNrOfHandlers() {
      
      nrOfHandlers_ = 0;
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


    // @@protoc_insertion_point(builder_scope:io.axoniq.axonserver.grpc.query.QuerySubscription)
  }

  // @@protoc_insertion_point(class_scope:io.axoniq.axonserver.grpc.query.QuerySubscription)
  private static final io.axoniq.axonserver.grpc.query.QuerySubscription DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.axoniq.axonserver.grpc.query.QuerySubscription();
  }

  public static io.axoniq.axonserver.grpc.query.QuerySubscription getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QuerySubscription>
      PARSER = new com.google.protobuf.AbstractParser<QuerySubscription>() {
    @java.lang.Override
    public QuerySubscription parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new QuerySubscription(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QuerySubscription> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QuerySubscription> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.axoniq.axonserver.grpc.query.QuerySubscription getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

