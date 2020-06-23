// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: event.proto

package io.axoniq.axonserver.grpc.event;

/**
 * <pre>
 * Request message to retrieve Snapshot Events for a specific Aggregate instance 
 * </pre>
 *
 * Protobuf type {@code io.axoniq.axonserver.grpc.event.GetAggregateSnapshotsRequest}
 */
public  final class GetAggregateSnapshotsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.axoniq.axonserver.grpc.event.GetAggregateSnapshotsRequest)
    GetAggregateSnapshotsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetAggregateSnapshotsRequest.newBuilder() to construct.
  private GetAggregateSnapshotsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetAggregateSnapshotsRequest() {
    aggregateId_ = "";
    initialSequence_ = 0L;
    maxSequence_ = 0L;
    maxResults_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetAggregateSnapshotsRequest(
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

            aggregateId_ = s;
            break;
          }
          case 16: {

            initialSequence_ = input.readInt64();
            break;
          }
          case 24: {

            maxSequence_ = input.readInt64();
            break;
          }
          case 32: {

            maxResults_ = input.readInt32();
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
    return io.axoniq.axonserver.grpc.event.EventOuterClass.internal_static_io_axoniq_axonserver_grpc_event_GetAggregateSnapshotsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.axoniq.axonserver.grpc.event.EventOuterClass.internal_static_io_axoniq_axonserver_grpc_event_GetAggregateSnapshotsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.axoniq.axonserver.grpc.event.GetAggregateSnapshotsRequest.class, io.axoniq.axonserver.grpc.event.GetAggregateSnapshotsRequest.Builder.class);
  }

  public static final int AGGREGATE_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object aggregateId_;
  /**
   * <pre>
   * The identifier to fetch the snapshots for 
   * </pre>
   *
   * <code>string aggregate_id = 1;</code>
   */
  public java.lang.String getAggregateId() {
    java.lang.Object ref = aggregateId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      aggregateId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The identifier to fetch the snapshots for 
   * </pre>
   *
   * <code>string aggregate_id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getAggregateIdBytes() {
    java.lang.Object ref = aggregateId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      aggregateId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INITIAL_SEQUENCE_FIELD_NUMBER = 2;
  private long initialSequence_;
  /**
   * <pre>
   * The minimal sequence number of the snapshots to retrieve 
   * </pre>
   *
   * <code>int64 initial_sequence = 2;</code>
   */
  public long getInitialSequence() {
    return initialSequence_;
  }

  public static final int MAX_SEQUENCE_FIELD_NUMBER = 3;
  private long maxSequence_;
  /**
   * <pre>
   * The maximum sequence number of the snapshots to retrieve 
   * </pre>
   *
   * <code>int64 max_sequence = 3;</code>
   */
  public long getMaxSequence() {
    return maxSequence_;
  }

  public static final int MAX_RESULTS_FIELD_NUMBER = 4;
  private int maxResults_;
  /**
   * <pre>
   * The maximum number of results to stream 
   * </pre>
   *
   * <code>int32 max_results = 4;</code>
   */
  public int getMaxResults() {
    return maxResults_;
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
    if (!getAggregateIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, aggregateId_);
    }
    if (initialSequence_ != 0L) {
      output.writeInt64(2, initialSequence_);
    }
    if (maxSequence_ != 0L) {
      output.writeInt64(3, maxSequence_);
    }
    if (maxResults_ != 0) {
      output.writeInt32(4, maxResults_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getAggregateIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, aggregateId_);
    }
    if (initialSequence_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, initialSequence_);
    }
    if (maxSequence_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, maxSequence_);
    }
    if (maxResults_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, maxResults_);
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
    if (!(obj instanceof io.axoniq.axonserver.grpc.event.GetAggregateSnapshotsRequest)) {
      return super.equals(obj);
    }
    io.axoniq.axonserver.grpc.event.GetAggregateSnapshotsRequest other = (io.axoniq.axonserver.grpc.event.GetAggregateSnapshotsRequest) obj;

    boolean result = true;
    result = result && getAggregateId()
        .equals(other.getAggregateId());
    result = result && (getInitialSequence()
        == other.getInitialSequence());
    result = result && (getMaxSequence()
        == other.getMaxSequence());
    result = result && (getMaxResults()
        == other.getMaxResults());
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
    hash = (37 * hash) + AGGREGATE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getAggregateId().hashCode();
    hash = (37 * hash) + INITIAL_SEQUENCE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getInitialSequence());
    hash = (37 * hash) + MAX_SEQUENCE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMaxSequence());
    hash = (37 * hash) + MAX_RESULTS_FIELD_NUMBER;
    hash = (53 * hash) + getMaxResults();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.axoniq.axonserver.grpc.event.GetAggregateSnapshotsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.axoniq.axonserver.grpc.event.GetAggregateSnapshotsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.axoniq.axonserver.grpc.event.GetAggregateSnapshotsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.axoniq.axonserver.grpc.event.GetAggregateSnapshotsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.axoniq.axonserver.grpc.event.GetAggregateSnapshotsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.axoniq.axonserver.grpc.event.GetAggregateSnapshotsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.axoniq.axonserver.grpc.event.GetAggregateSnapshotsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.axoniq.axonserver.grpc.event.GetAggregateSnapshotsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.axoniq.axonserver.grpc.event.GetAggregateSnapshotsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.axoniq.axonserver.grpc.event.GetAggregateSnapshotsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.axoniq.axonserver.grpc.event.GetAggregateSnapshotsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.axoniq.axonserver.grpc.event.GetAggregateSnapshotsRequest parseFrom(
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
  public static Builder newBuilder(io.axoniq.axonserver.grpc.event.GetAggregateSnapshotsRequest prototype) {
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
   * Request message to retrieve Snapshot Events for a specific Aggregate instance 
   * </pre>
   *
   * Protobuf type {@code io.axoniq.axonserver.grpc.event.GetAggregateSnapshotsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.axoniq.axonserver.grpc.event.GetAggregateSnapshotsRequest)
      io.axoniq.axonserver.grpc.event.GetAggregateSnapshotsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.axoniq.axonserver.grpc.event.EventOuterClass.internal_static_io_axoniq_axonserver_grpc_event_GetAggregateSnapshotsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.axoniq.axonserver.grpc.event.EventOuterClass.internal_static_io_axoniq_axonserver_grpc_event_GetAggregateSnapshotsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.axoniq.axonserver.grpc.event.GetAggregateSnapshotsRequest.class, io.axoniq.axonserver.grpc.event.GetAggregateSnapshotsRequest.Builder.class);
    }

    // Construct using io.axoniq.axonserver.grpc.event.GetAggregateSnapshotsRequest.newBuilder()
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
      aggregateId_ = "";

      initialSequence_ = 0L;

      maxSequence_ = 0L;

      maxResults_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.axoniq.axonserver.grpc.event.EventOuterClass.internal_static_io_axoniq_axonserver_grpc_event_GetAggregateSnapshotsRequest_descriptor;
    }

    @java.lang.Override
    public io.axoniq.axonserver.grpc.event.GetAggregateSnapshotsRequest getDefaultInstanceForType() {
      return io.axoniq.axonserver.grpc.event.GetAggregateSnapshotsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public io.axoniq.axonserver.grpc.event.GetAggregateSnapshotsRequest build() {
      io.axoniq.axonserver.grpc.event.GetAggregateSnapshotsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.axoniq.axonserver.grpc.event.GetAggregateSnapshotsRequest buildPartial() {
      io.axoniq.axonserver.grpc.event.GetAggregateSnapshotsRequest result = new io.axoniq.axonserver.grpc.event.GetAggregateSnapshotsRequest(this);
      result.aggregateId_ = aggregateId_;
      result.initialSequence_ = initialSequence_;
      result.maxSequence_ = maxSequence_;
      result.maxResults_ = maxResults_;
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
      if (other instanceof io.axoniq.axonserver.grpc.event.GetAggregateSnapshotsRequest) {
        return mergeFrom((io.axoniq.axonserver.grpc.event.GetAggregateSnapshotsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.axoniq.axonserver.grpc.event.GetAggregateSnapshotsRequest other) {
      if (other == io.axoniq.axonserver.grpc.event.GetAggregateSnapshotsRequest.getDefaultInstance()) return this;
      if (!other.getAggregateId().isEmpty()) {
        aggregateId_ = other.aggregateId_;
        onChanged();
      }
      if (other.getInitialSequence() != 0L) {
        setInitialSequence(other.getInitialSequence());
      }
      if (other.getMaxSequence() != 0L) {
        setMaxSequence(other.getMaxSequence());
      }
      if (other.getMaxResults() != 0) {
        setMaxResults(other.getMaxResults());
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
      io.axoniq.axonserver.grpc.event.GetAggregateSnapshotsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.axoniq.axonserver.grpc.event.GetAggregateSnapshotsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object aggregateId_ = "";
    /**
     * <pre>
     * The identifier to fetch the snapshots for 
     * </pre>
     *
     * <code>string aggregate_id = 1;</code>
     */
    public java.lang.String getAggregateId() {
      java.lang.Object ref = aggregateId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        aggregateId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The identifier to fetch the snapshots for 
     * </pre>
     *
     * <code>string aggregate_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getAggregateIdBytes() {
      java.lang.Object ref = aggregateId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        aggregateId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The identifier to fetch the snapshots for 
     * </pre>
     *
     * <code>string aggregate_id = 1;</code>
     */
    public Builder setAggregateId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      aggregateId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The identifier to fetch the snapshots for 
     * </pre>
     *
     * <code>string aggregate_id = 1;</code>
     */
    public Builder clearAggregateId() {
      
      aggregateId_ = getDefaultInstance().getAggregateId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The identifier to fetch the snapshots for 
     * </pre>
     *
     * <code>string aggregate_id = 1;</code>
     */
    public Builder setAggregateIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      aggregateId_ = value;
      onChanged();
      return this;
    }

    private long initialSequence_ ;
    /**
     * <pre>
     * The minimal sequence number of the snapshots to retrieve 
     * </pre>
     *
     * <code>int64 initial_sequence = 2;</code>
     */
    public long getInitialSequence() {
      return initialSequence_;
    }
    /**
     * <pre>
     * The minimal sequence number of the snapshots to retrieve 
     * </pre>
     *
     * <code>int64 initial_sequence = 2;</code>
     */
    public Builder setInitialSequence(long value) {
      
      initialSequence_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The minimal sequence number of the snapshots to retrieve 
     * </pre>
     *
     * <code>int64 initial_sequence = 2;</code>
     */
    public Builder clearInitialSequence() {
      
      initialSequence_ = 0L;
      onChanged();
      return this;
    }

    private long maxSequence_ ;
    /**
     * <pre>
     * The maximum sequence number of the snapshots to retrieve 
     * </pre>
     *
     * <code>int64 max_sequence = 3;</code>
     */
    public long getMaxSequence() {
      return maxSequence_;
    }
    /**
     * <pre>
     * The maximum sequence number of the snapshots to retrieve 
     * </pre>
     *
     * <code>int64 max_sequence = 3;</code>
     */
    public Builder setMaxSequence(long value) {
      
      maxSequence_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The maximum sequence number of the snapshots to retrieve 
     * </pre>
     *
     * <code>int64 max_sequence = 3;</code>
     */
    public Builder clearMaxSequence() {
      
      maxSequence_ = 0L;
      onChanged();
      return this;
    }

    private int maxResults_ ;
    /**
     * <pre>
     * The maximum number of results to stream 
     * </pre>
     *
     * <code>int32 max_results = 4;</code>
     */
    public int getMaxResults() {
      return maxResults_;
    }
    /**
     * <pre>
     * The maximum number of results to stream 
     * </pre>
     *
     * <code>int32 max_results = 4;</code>
     */
    public Builder setMaxResults(int value) {
      
      maxResults_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The maximum number of results to stream 
     * </pre>
     *
     * <code>int32 max_results = 4;</code>
     */
    public Builder clearMaxResults() {
      
      maxResults_ = 0;
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


    // @@protoc_insertion_point(builder_scope:io.axoniq.axonserver.grpc.event.GetAggregateSnapshotsRequest)
  }

  // @@protoc_insertion_point(class_scope:io.axoniq.axonserver.grpc.event.GetAggregateSnapshotsRequest)
  private static final io.axoniq.axonserver.grpc.event.GetAggregateSnapshotsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.axoniq.axonserver.grpc.event.GetAggregateSnapshotsRequest();
  }

  public static io.axoniq.axonserver.grpc.event.GetAggregateSnapshotsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetAggregateSnapshotsRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetAggregateSnapshotsRequest>() {
    @java.lang.Override
    public GetAggregateSnapshotsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetAggregateSnapshotsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetAggregateSnapshotsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetAggregateSnapshotsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.axoniq.axonserver.grpc.event.GetAggregateSnapshotsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

