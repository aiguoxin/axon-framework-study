package io.axoniq.axonserver.grpc.event;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Service providing operations against the EventStore functionality of Axon Server 
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.19.0)",
    comments = "Source: event.proto")
public final class EventStoreGrpc {

  private EventStoreGrpc() {}

  public static final String SERVICE_NAME = "io.axoniq.axonserver.grpc.event.EventStore";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.axoniq.axonserver.grpc.event.Event,
      io.axoniq.axonserver.grpc.event.Confirmation> getAppendEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AppendEvent",
      requestType = io.axoniq.axonserver.grpc.event.Event.class,
      responseType = io.axoniq.axonserver.grpc.event.Confirmation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<io.axoniq.axonserver.grpc.event.Event,
      io.axoniq.axonserver.grpc.event.Confirmation> getAppendEventMethod() {
    io.grpc.MethodDescriptor<io.axoniq.axonserver.grpc.event.Event, io.axoniq.axonserver.grpc.event.Confirmation> getAppendEventMethod;
    if ((getAppendEventMethod = EventStoreGrpc.getAppendEventMethod) == null) {
      synchronized (EventStoreGrpc.class) {
        if ((getAppendEventMethod = EventStoreGrpc.getAppendEventMethod) == null) {
          EventStoreGrpc.getAppendEventMethod = getAppendEventMethod = 
              io.grpc.MethodDescriptor.<io.axoniq.axonserver.grpc.event.Event, io.axoniq.axonserver.grpc.event.Confirmation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "io.axoniq.axonserver.grpc.event.EventStore", "AppendEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.axoniq.axonserver.grpc.event.Event.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.axoniq.axonserver.grpc.event.Confirmation.getDefaultInstance()))
                  .setSchemaDescriptor(new EventStoreMethodDescriptorSupplier("AppendEvent"))
                  .build();
          }
        }
     }
     return getAppendEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.axoniq.axonserver.grpc.event.Event,
      io.axoniq.axonserver.grpc.event.Confirmation> getAppendSnapshotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AppendSnapshot",
      requestType = io.axoniq.axonserver.grpc.event.Event.class,
      responseType = io.axoniq.axonserver.grpc.event.Confirmation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.axoniq.axonserver.grpc.event.Event,
      io.axoniq.axonserver.grpc.event.Confirmation> getAppendSnapshotMethod() {
    io.grpc.MethodDescriptor<io.axoniq.axonserver.grpc.event.Event, io.axoniq.axonserver.grpc.event.Confirmation> getAppendSnapshotMethod;
    if ((getAppendSnapshotMethod = EventStoreGrpc.getAppendSnapshotMethod) == null) {
      synchronized (EventStoreGrpc.class) {
        if ((getAppendSnapshotMethod = EventStoreGrpc.getAppendSnapshotMethod) == null) {
          EventStoreGrpc.getAppendSnapshotMethod = getAppendSnapshotMethod = 
              io.grpc.MethodDescriptor.<io.axoniq.axonserver.grpc.event.Event, io.axoniq.axonserver.grpc.event.Confirmation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "io.axoniq.axonserver.grpc.event.EventStore", "AppendSnapshot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.axoniq.axonserver.grpc.event.Event.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.axoniq.axonserver.grpc.event.Confirmation.getDefaultInstance()))
                  .setSchemaDescriptor(new EventStoreMethodDescriptorSupplier("AppendSnapshot"))
                  .build();
          }
        }
     }
     return getAppendSnapshotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.axoniq.axonserver.grpc.event.GetAggregateEventsRequest,
      io.axoniq.axonserver.grpc.event.Event> getListAggregateEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAggregateEvents",
      requestType = io.axoniq.axonserver.grpc.event.GetAggregateEventsRequest.class,
      responseType = io.axoniq.axonserver.grpc.event.Event.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.axoniq.axonserver.grpc.event.GetAggregateEventsRequest,
      io.axoniq.axonserver.grpc.event.Event> getListAggregateEventsMethod() {
    io.grpc.MethodDescriptor<io.axoniq.axonserver.grpc.event.GetAggregateEventsRequest, io.axoniq.axonserver.grpc.event.Event> getListAggregateEventsMethod;
    if ((getListAggregateEventsMethod = EventStoreGrpc.getListAggregateEventsMethod) == null) {
      synchronized (EventStoreGrpc.class) {
        if ((getListAggregateEventsMethod = EventStoreGrpc.getListAggregateEventsMethod) == null) {
          EventStoreGrpc.getListAggregateEventsMethod = getListAggregateEventsMethod = 
              io.grpc.MethodDescriptor.<io.axoniq.axonserver.grpc.event.GetAggregateEventsRequest, io.axoniq.axonserver.grpc.event.Event>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "io.axoniq.axonserver.grpc.event.EventStore", "ListAggregateEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.axoniq.axonserver.grpc.event.GetAggregateEventsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.axoniq.axonserver.grpc.event.Event.getDefaultInstance()))
                  .setSchemaDescriptor(new EventStoreMethodDescriptorSupplier("ListAggregateEvents"))
                  .build();
          }
        }
     }
     return getListAggregateEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.axoniq.axonserver.grpc.event.GetAggregateSnapshotsRequest,
      io.axoniq.axonserver.grpc.event.Event> getListAggregateSnapshotsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAggregateSnapshots",
      requestType = io.axoniq.axonserver.grpc.event.GetAggregateSnapshotsRequest.class,
      responseType = io.axoniq.axonserver.grpc.event.Event.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.axoniq.axonserver.grpc.event.GetAggregateSnapshotsRequest,
      io.axoniq.axonserver.grpc.event.Event> getListAggregateSnapshotsMethod() {
    io.grpc.MethodDescriptor<io.axoniq.axonserver.grpc.event.GetAggregateSnapshotsRequest, io.axoniq.axonserver.grpc.event.Event> getListAggregateSnapshotsMethod;
    if ((getListAggregateSnapshotsMethod = EventStoreGrpc.getListAggregateSnapshotsMethod) == null) {
      synchronized (EventStoreGrpc.class) {
        if ((getListAggregateSnapshotsMethod = EventStoreGrpc.getListAggregateSnapshotsMethod) == null) {
          EventStoreGrpc.getListAggregateSnapshotsMethod = getListAggregateSnapshotsMethod = 
              io.grpc.MethodDescriptor.<io.axoniq.axonserver.grpc.event.GetAggregateSnapshotsRequest, io.axoniq.axonserver.grpc.event.Event>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "io.axoniq.axonserver.grpc.event.EventStore", "ListAggregateSnapshots"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.axoniq.axonserver.grpc.event.GetAggregateSnapshotsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.axoniq.axonserver.grpc.event.Event.getDefaultInstance()))
                  .setSchemaDescriptor(new EventStoreMethodDescriptorSupplier("ListAggregateSnapshots"))
                  .build();
          }
        }
     }
     return getListAggregateSnapshotsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.axoniq.axonserver.grpc.event.GetEventsRequest,
      io.axoniq.axonserver.grpc.event.EventWithToken> getListEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListEvents",
      requestType = io.axoniq.axonserver.grpc.event.GetEventsRequest.class,
      responseType = io.axoniq.axonserver.grpc.event.EventWithToken.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<io.axoniq.axonserver.grpc.event.GetEventsRequest,
      io.axoniq.axonserver.grpc.event.EventWithToken> getListEventsMethod() {
    io.grpc.MethodDescriptor<io.axoniq.axonserver.grpc.event.GetEventsRequest, io.axoniq.axonserver.grpc.event.EventWithToken> getListEventsMethod;
    if ((getListEventsMethod = EventStoreGrpc.getListEventsMethod) == null) {
      synchronized (EventStoreGrpc.class) {
        if ((getListEventsMethod = EventStoreGrpc.getListEventsMethod) == null) {
          EventStoreGrpc.getListEventsMethod = getListEventsMethod = 
              io.grpc.MethodDescriptor.<io.axoniq.axonserver.grpc.event.GetEventsRequest, io.axoniq.axonserver.grpc.event.EventWithToken>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "io.axoniq.axonserver.grpc.event.EventStore", "ListEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.axoniq.axonserver.grpc.event.GetEventsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.axoniq.axonserver.grpc.event.EventWithToken.getDefaultInstance()))
                  .setSchemaDescriptor(new EventStoreMethodDescriptorSupplier("ListEvents"))
                  .build();
          }
        }
     }
     return getListEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.axoniq.axonserver.grpc.event.ReadHighestSequenceNrRequest,
      io.axoniq.axonserver.grpc.event.ReadHighestSequenceNrResponse> getReadHighestSequenceNrMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadHighestSequenceNr",
      requestType = io.axoniq.axonserver.grpc.event.ReadHighestSequenceNrRequest.class,
      responseType = io.axoniq.axonserver.grpc.event.ReadHighestSequenceNrResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.axoniq.axonserver.grpc.event.ReadHighestSequenceNrRequest,
      io.axoniq.axonserver.grpc.event.ReadHighestSequenceNrResponse> getReadHighestSequenceNrMethod() {
    io.grpc.MethodDescriptor<io.axoniq.axonserver.grpc.event.ReadHighestSequenceNrRequest, io.axoniq.axonserver.grpc.event.ReadHighestSequenceNrResponse> getReadHighestSequenceNrMethod;
    if ((getReadHighestSequenceNrMethod = EventStoreGrpc.getReadHighestSequenceNrMethod) == null) {
      synchronized (EventStoreGrpc.class) {
        if ((getReadHighestSequenceNrMethod = EventStoreGrpc.getReadHighestSequenceNrMethod) == null) {
          EventStoreGrpc.getReadHighestSequenceNrMethod = getReadHighestSequenceNrMethod = 
              io.grpc.MethodDescriptor.<io.axoniq.axonserver.grpc.event.ReadHighestSequenceNrRequest, io.axoniq.axonserver.grpc.event.ReadHighestSequenceNrResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "io.axoniq.axonserver.grpc.event.EventStore", "ReadHighestSequenceNr"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.axoniq.axonserver.grpc.event.ReadHighestSequenceNrRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.axoniq.axonserver.grpc.event.ReadHighestSequenceNrResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EventStoreMethodDescriptorSupplier("ReadHighestSequenceNr"))
                  .build();
          }
        }
     }
     return getReadHighestSequenceNrMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.axoniq.axonserver.grpc.event.QueryEventsRequest,
      io.axoniq.axonserver.grpc.event.QueryEventsResponse> getQueryEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryEvents",
      requestType = io.axoniq.axonserver.grpc.event.QueryEventsRequest.class,
      responseType = io.axoniq.axonserver.grpc.event.QueryEventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<io.axoniq.axonserver.grpc.event.QueryEventsRequest,
      io.axoniq.axonserver.grpc.event.QueryEventsResponse> getQueryEventsMethod() {
    io.grpc.MethodDescriptor<io.axoniq.axonserver.grpc.event.QueryEventsRequest, io.axoniq.axonserver.grpc.event.QueryEventsResponse> getQueryEventsMethod;
    if ((getQueryEventsMethod = EventStoreGrpc.getQueryEventsMethod) == null) {
      synchronized (EventStoreGrpc.class) {
        if ((getQueryEventsMethod = EventStoreGrpc.getQueryEventsMethod) == null) {
          EventStoreGrpc.getQueryEventsMethod = getQueryEventsMethod = 
              io.grpc.MethodDescriptor.<io.axoniq.axonserver.grpc.event.QueryEventsRequest, io.axoniq.axonserver.grpc.event.QueryEventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "io.axoniq.axonserver.grpc.event.EventStore", "QueryEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.axoniq.axonserver.grpc.event.QueryEventsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.axoniq.axonserver.grpc.event.QueryEventsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EventStoreMethodDescriptorSupplier("QueryEvents"))
                  .build();
          }
        }
     }
     return getQueryEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.axoniq.axonserver.grpc.event.GetFirstTokenRequest,
      io.axoniq.axonserver.grpc.event.TrackingToken> getGetFirstTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFirstToken",
      requestType = io.axoniq.axonserver.grpc.event.GetFirstTokenRequest.class,
      responseType = io.axoniq.axonserver.grpc.event.TrackingToken.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.axoniq.axonserver.grpc.event.GetFirstTokenRequest,
      io.axoniq.axonserver.grpc.event.TrackingToken> getGetFirstTokenMethod() {
    io.grpc.MethodDescriptor<io.axoniq.axonserver.grpc.event.GetFirstTokenRequest, io.axoniq.axonserver.grpc.event.TrackingToken> getGetFirstTokenMethod;
    if ((getGetFirstTokenMethod = EventStoreGrpc.getGetFirstTokenMethod) == null) {
      synchronized (EventStoreGrpc.class) {
        if ((getGetFirstTokenMethod = EventStoreGrpc.getGetFirstTokenMethod) == null) {
          EventStoreGrpc.getGetFirstTokenMethod = getGetFirstTokenMethod = 
              io.grpc.MethodDescriptor.<io.axoniq.axonserver.grpc.event.GetFirstTokenRequest, io.axoniq.axonserver.grpc.event.TrackingToken>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "io.axoniq.axonserver.grpc.event.EventStore", "GetFirstToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.axoniq.axonserver.grpc.event.GetFirstTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.axoniq.axonserver.grpc.event.TrackingToken.getDefaultInstance()))
                  .setSchemaDescriptor(new EventStoreMethodDescriptorSupplier("GetFirstToken"))
                  .build();
          }
        }
     }
     return getGetFirstTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.axoniq.axonserver.grpc.event.GetLastTokenRequest,
      io.axoniq.axonserver.grpc.event.TrackingToken> getGetLastTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLastToken",
      requestType = io.axoniq.axonserver.grpc.event.GetLastTokenRequest.class,
      responseType = io.axoniq.axonserver.grpc.event.TrackingToken.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.axoniq.axonserver.grpc.event.GetLastTokenRequest,
      io.axoniq.axonserver.grpc.event.TrackingToken> getGetLastTokenMethod() {
    io.grpc.MethodDescriptor<io.axoniq.axonserver.grpc.event.GetLastTokenRequest, io.axoniq.axonserver.grpc.event.TrackingToken> getGetLastTokenMethod;
    if ((getGetLastTokenMethod = EventStoreGrpc.getGetLastTokenMethod) == null) {
      synchronized (EventStoreGrpc.class) {
        if ((getGetLastTokenMethod = EventStoreGrpc.getGetLastTokenMethod) == null) {
          EventStoreGrpc.getGetLastTokenMethod = getGetLastTokenMethod = 
              io.grpc.MethodDescriptor.<io.axoniq.axonserver.grpc.event.GetLastTokenRequest, io.axoniq.axonserver.grpc.event.TrackingToken>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "io.axoniq.axonserver.grpc.event.EventStore", "GetLastToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.axoniq.axonserver.grpc.event.GetLastTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.axoniq.axonserver.grpc.event.TrackingToken.getDefaultInstance()))
                  .setSchemaDescriptor(new EventStoreMethodDescriptorSupplier("GetLastToken"))
                  .build();
          }
        }
     }
     return getGetLastTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.axoniq.axonserver.grpc.event.GetTokenAtRequest,
      io.axoniq.axonserver.grpc.event.TrackingToken> getGetTokenAtMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTokenAt",
      requestType = io.axoniq.axonserver.grpc.event.GetTokenAtRequest.class,
      responseType = io.axoniq.axonserver.grpc.event.TrackingToken.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.axoniq.axonserver.grpc.event.GetTokenAtRequest,
      io.axoniq.axonserver.grpc.event.TrackingToken> getGetTokenAtMethod() {
    io.grpc.MethodDescriptor<io.axoniq.axonserver.grpc.event.GetTokenAtRequest, io.axoniq.axonserver.grpc.event.TrackingToken> getGetTokenAtMethod;
    if ((getGetTokenAtMethod = EventStoreGrpc.getGetTokenAtMethod) == null) {
      synchronized (EventStoreGrpc.class) {
        if ((getGetTokenAtMethod = EventStoreGrpc.getGetTokenAtMethod) == null) {
          EventStoreGrpc.getGetTokenAtMethod = getGetTokenAtMethod = 
              io.grpc.MethodDescriptor.<io.axoniq.axonserver.grpc.event.GetTokenAtRequest, io.axoniq.axonserver.grpc.event.TrackingToken>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "io.axoniq.axonserver.grpc.event.EventStore", "GetTokenAt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.axoniq.axonserver.grpc.event.GetTokenAtRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.axoniq.axonserver.grpc.event.TrackingToken.getDefaultInstance()))
                  .setSchemaDescriptor(new EventStoreMethodDescriptorSupplier("GetTokenAt"))
                  .build();
          }
        }
     }
     return getGetTokenAtMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EventStoreStub newStub(io.grpc.Channel channel) {
    return new EventStoreStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EventStoreBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EventStoreBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EventStoreFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EventStoreFutureStub(channel);
  }

  /**
   * <pre>
   * Service providing operations against the EventStore functionality of Axon Server 
   * </pre>
   */
  public static abstract class EventStoreImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Accepts a stream of Events returning a Confirmation when completed.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.event.Event> appendEvent(
        io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.event.Confirmation> responseObserver) {
      return asyncUnimplementedStreamingCall(getAppendEventMethod(), responseObserver);
    }

    /**
     * <pre>
     * Accepts a Snapshot event returning a Confirmation when completed.
     * </pre>
     */
    public void appendSnapshot(io.axoniq.axonserver.grpc.event.Event request,
        io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.event.Confirmation> responseObserver) {
      asyncUnimplementedUnaryCall(getAppendSnapshotMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the Events for a given aggregate. Results are streamed rather than returned at once.
     * </pre>
     */
    public void listAggregateEvents(io.axoniq.axonserver.grpc.event.GetAggregateEventsRequest request,
        io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.event.Event> responseObserver) {
      asyncUnimplementedUnaryCall(getListAggregateEventsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the Snapshots for a given aggregate. Results are streamed rather than returned at once.
     * </pre>
     */
    public void listAggregateSnapshots(io.axoniq.axonserver.grpc.event.GetAggregateSnapshotsRequest request,
        io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.event.Event> responseObserver) {
      asyncUnimplementedUnaryCall(getListAggregateSnapshotsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the Events from a given tracking token. Results are streamed rather than returned at once.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.event.GetEventsRequest> listEvents(
        io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.event.EventWithToken> responseObserver) {
      return asyncUnimplementedStreamingCall(getListEventsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets the highest sequence number for a specific aggregate.
     * </pre>
     */
    public void readHighestSequenceNr(io.axoniq.axonserver.grpc.event.ReadHighestSequenceNrRequest request,
        io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.event.ReadHighestSequenceNrResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReadHighestSequenceNrMethod(), responseObserver);
    }

    /**
     * <pre>
     * Performs a query on the event store, returns a stream of results. Input is a stream to allow flow control from the
     * client
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.event.QueryEventsRequest> queryEvents(
        io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.event.QueryEventsResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getQueryEventsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the first token available in event store (typically 0). Returns 0 when no events in store.
     * </pre>
     */
    public void getFirstToken(io.axoniq.axonserver.grpc.event.GetFirstTokenRequest request,
        io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.event.TrackingToken> responseObserver) {
      asyncUnimplementedUnaryCall(getGetFirstTokenMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the last committed token in event store. Returns -1 when no events in store.
     * </pre>
     */
    public void getLastToken(io.axoniq.axonserver.grpc.event.GetLastTokenRequest request,
        io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.event.TrackingToken> responseObserver) {
      asyncUnimplementedUnaryCall(getGetLastTokenMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the token of the first token of an event from specified time in event store. Returns -1 when no events in store.
     * </pre>
     */
    public void getTokenAt(io.axoniq.axonserver.grpc.event.GetTokenAtRequest request,
        io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.event.TrackingToken> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTokenAtMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAppendEventMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                io.axoniq.axonserver.grpc.event.Event,
                io.axoniq.axonserver.grpc.event.Confirmation>(
                  this, METHODID_APPEND_EVENT)))
          .addMethod(
            getAppendSnapshotMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.axoniq.axonserver.grpc.event.Event,
                io.axoniq.axonserver.grpc.event.Confirmation>(
                  this, METHODID_APPEND_SNAPSHOT)))
          .addMethod(
            getListAggregateEventsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                io.axoniq.axonserver.grpc.event.GetAggregateEventsRequest,
                io.axoniq.axonserver.grpc.event.Event>(
                  this, METHODID_LIST_AGGREGATE_EVENTS)))
          .addMethod(
            getListAggregateSnapshotsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                io.axoniq.axonserver.grpc.event.GetAggregateSnapshotsRequest,
                io.axoniq.axonserver.grpc.event.Event>(
                  this, METHODID_LIST_AGGREGATE_SNAPSHOTS)))
          .addMethod(
            getListEventsMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                io.axoniq.axonserver.grpc.event.GetEventsRequest,
                io.axoniq.axonserver.grpc.event.EventWithToken>(
                  this, METHODID_LIST_EVENTS)))
          .addMethod(
            getReadHighestSequenceNrMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.axoniq.axonserver.grpc.event.ReadHighestSequenceNrRequest,
                io.axoniq.axonserver.grpc.event.ReadHighestSequenceNrResponse>(
                  this, METHODID_READ_HIGHEST_SEQUENCE_NR)))
          .addMethod(
            getQueryEventsMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                io.axoniq.axonserver.grpc.event.QueryEventsRequest,
                io.axoniq.axonserver.grpc.event.QueryEventsResponse>(
                  this, METHODID_QUERY_EVENTS)))
          .addMethod(
            getGetFirstTokenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.axoniq.axonserver.grpc.event.GetFirstTokenRequest,
                io.axoniq.axonserver.grpc.event.TrackingToken>(
                  this, METHODID_GET_FIRST_TOKEN)))
          .addMethod(
            getGetLastTokenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.axoniq.axonserver.grpc.event.GetLastTokenRequest,
                io.axoniq.axonserver.grpc.event.TrackingToken>(
                  this, METHODID_GET_LAST_TOKEN)))
          .addMethod(
            getGetTokenAtMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.axoniq.axonserver.grpc.event.GetTokenAtRequest,
                io.axoniq.axonserver.grpc.event.TrackingToken>(
                  this, METHODID_GET_TOKEN_AT)))
          .build();
    }
  }

  /**
   * <pre>
   * Service providing operations against the EventStore functionality of Axon Server 
   * </pre>
   */
  public static final class EventStoreStub extends io.grpc.stub.AbstractStub<EventStoreStub> {
    private EventStoreStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EventStoreStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventStoreStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EventStoreStub(channel, callOptions);
    }

    /**
     * <pre>
     * Accepts a stream of Events returning a Confirmation when completed.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.event.Event> appendEvent(
        io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.event.Confirmation> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getAppendEventMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Accepts a Snapshot event returning a Confirmation when completed.
     * </pre>
     */
    public void appendSnapshot(io.axoniq.axonserver.grpc.event.Event request,
        io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.event.Confirmation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAppendSnapshotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the Events for a given aggregate. Results are streamed rather than returned at once.
     * </pre>
     */
    public void listAggregateEvents(io.axoniq.axonserver.grpc.event.GetAggregateEventsRequest request,
        io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.event.Event> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListAggregateEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the Snapshots for a given aggregate. Results are streamed rather than returned at once.
     * </pre>
     */
    public void listAggregateSnapshots(io.axoniq.axonserver.grpc.event.GetAggregateSnapshotsRequest request,
        io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.event.Event> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListAggregateSnapshotsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the Events from a given tracking token. Results are streamed rather than returned at once.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.event.GetEventsRequest> listEvents(
        io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.event.EventWithToken> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getListEventsMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Gets the highest sequence number for a specific aggregate.
     * </pre>
     */
    public void readHighestSequenceNr(io.axoniq.axonserver.grpc.event.ReadHighestSequenceNrRequest request,
        io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.event.ReadHighestSequenceNrResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReadHighestSequenceNrMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Performs a query on the event store, returns a stream of results. Input is a stream to allow flow control from the
     * client
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.event.QueryEventsRequest> queryEvents(
        io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.event.QueryEventsResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getQueryEventsMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the first token available in event store (typically 0). Returns 0 when no events in store.
     * </pre>
     */
    public void getFirstToken(io.axoniq.axonserver.grpc.event.GetFirstTokenRequest request,
        io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.event.TrackingToken> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetFirstTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the last committed token in event store. Returns -1 when no events in store.
     * </pre>
     */
    public void getLastToken(io.axoniq.axonserver.grpc.event.GetLastTokenRequest request,
        io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.event.TrackingToken> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetLastTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the token of the first token of an event from specified time in event store. Returns -1 when no events in store.
     * </pre>
     */
    public void getTokenAt(io.axoniq.axonserver.grpc.event.GetTokenAtRequest request,
        io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.event.TrackingToken> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTokenAtMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service providing operations against the EventStore functionality of Axon Server 
   * </pre>
   */
  public static final class EventStoreBlockingStub extends io.grpc.stub.AbstractStub<EventStoreBlockingStub> {
    private EventStoreBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EventStoreBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventStoreBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EventStoreBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Accepts a Snapshot event returning a Confirmation when completed.
     * </pre>
     */
    public io.axoniq.axonserver.grpc.event.Confirmation appendSnapshot(io.axoniq.axonserver.grpc.event.Event request) {
      return blockingUnaryCall(
          getChannel(), getAppendSnapshotMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the Events for a given aggregate. Results are streamed rather than returned at once.
     * </pre>
     */
    public java.util.Iterator<io.axoniq.axonserver.grpc.event.Event> listAggregateEvents(
        io.axoniq.axonserver.grpc.event.GetAggregateEventsRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getListAggregateEventsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the Snapshots for a given aggregate. Results are streamed rather than returned at once.
     * </pre>
     */
    public java.util.Iterator<io.axoniq.axonserver.grpc.event.Event> listAggregateSnapshots(
        io.axoniq.axonserver.grpc.event.GetAggregateSnapshotsRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getListAggregateSnapshotsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the highest sequence number for a specific aggregate.
     * </pre>
     */
    public io.axoniq.axonserver.grpc.event.ReadHighestSequenceNrResponse readHighestSequenceNr(io.axoniq.axonserver.grpc.event.ReadHighestSequenceNrRequest request) {
      return blockingUnaryCall(
          getChannel(), getReadHighestSequenceNrMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the first token available in event store (typically 0). Returns 0 when no events in store.
     * </pre>
     */
    public io.axoniq.axonserver.grpc.event.TrackingToken getFirstToken(io.axoniq.axonserver.grpc.event.GetFirstTokenRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetFirstTokenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the last committed token in event store. Returns -1 when no events in store.
     * </pre>
     */
    public io.axoniq.axonserver.grpc.event.TrackingToken getLastToken(io.axoniq.axonserver.grpc.event.GetLastTokenRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetLastTokenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the token of the first token of an event from specified time in event store. Returns -1 when no events in store.
     * </pre>
     */
    public io.axoniq.axonserver.grpc.event.TrackingToken getTokenAt(io.axoniq.axonserver.grpc.event.GetTokenAtRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTokenAtMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service providing operations against the EventStore functionality of Axon Server 
   * </pre>
   */
  public static final class EventStoreFutureStub extends io.grpc.stub.AbstractStub<EventStoreFutureStub> {
    private EventStoreFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EventStoreFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventStoreFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EventStoreFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Accepts a Snapshot event returning a Confirmation when completed.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.axoniq.axonserver.grpc.event.Confirmation> appendSnapshot(
        io.axoniq.axonserver.grpc.event.Event request) {
      return futureUnaryCall(
          getChannel().newCall(getAppendSnapshotMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets the highest sequence number for a specific aggregate.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.axoniq.axonserver.grpc.event.ReadHighestSequenceNrResponse> readHighestSequenceNr(
        io.axoniq.axonserver.grpc.event.ReadHighestSequenceNrRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReadHighestSequenceNrMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the first token available in event store (typically 0). Returns 0 when no events in store.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.axoniq.axonserver.grpc.event.TrackingToken> getFirstToken(
        io.axoniq.axonserver.grpc.event.GetFirstTokenRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetFirstTokenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the last committed token in event store. Returns -1 when no events in store.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.axoniq.axonserver.grpc.event.TrackingToken> getLastToken(
        io.axoniq.axonserver.grpc.event.GetLastTokenRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetLastTokenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the token of the first token of an event from specified time in event store. Returns -1 when no events in store.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.axoniq.axonserver.grpc.event.TrackingToken> getTokenAt(
        io.axoniq.axonserver.grpc.event.GetTokenAtRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTokenAtMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_APPEND_SNAPSHOT = 0;
  private static final int METHODID_LIST_AGGREGATE_EVENTS = 1;
  private static final int METHODID_LIST_AGGREGATE_SNAPSHOTS = 2;
  private static final int METHODID_READ_HIGHEST_SEQUENCE_NR = 3;
  private static final int METHODID_GET_FIRST_TOKEN = 4;
  private static final int METHODID_GET_LAST_TOKEN = 5;
  private static final int METHODID_GET_TOKEN_AT = 6;
  private static final int METHODID_APPEND_EVENT = 7;
  private static final int METHODID_LIST_EVENTS = 8;
  private static final int METHODID_QUERY_EVENTS = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EventStoreImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EventStoreImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_APPEND_SNAPSHOT:
          serviceImpl.appendSnapshot((io.axoniq.axonserver.grpc.event.Event) request,
              (io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.event.Confirmation>) responseObserver);
          break;
        case METHODID_LIST_AGGREGATE_EVENTS:
          serviceImpl.listAggregateEvents((io.axoniq.axonserver.grpc.event.GetAggregateEventsRequest) request,
              (io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.event.Event>) responseObserver);
          break;
        case METHODID_LIST_AGGREGATE_SNAPSHOTS:
          serviceImpl.listAggregateSnapshots((io.axoniq.axonserver.grpc.event.GetAggregateSnapshotsRequest) request,
              (io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.event.Event>) responseObserver);
          break;
        case METHODID_READ_HIGHEST_SEQUENCE_NR:
          serviceImpl.readHighestSequenceNr((io.axoniq.axonserver.grpc.event.ReadHighestSequenceNrRequest) request,
              (io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.event.ReadHighestSequenceNrResponse>) responseObserver);
          break;
        case METHODID_GET_FIRST_TOKEN:
          serviceImpl.getFirstToken((io.axoniq.axonserver.grpc.event.GetFirstTokenRequest) request,
              (io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.event.TrackingToken>) responseObserver);
          break;
        case METHODID_GET_LAST_TOKEN:
          serviceImpl.getLastToken((io.axoniq.axonserver.grpc.event.GetLastTokenRequest) request,
              (io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.event.TrackingToken>) responseObserver);
          break;
        case METHODID_GET_TOKEN_AT:
          serviceImpl.getTokenAt((io.axoniq.axonserver.grpc.event.GetTokenAtRequest) request,
              (io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.event.TrackingToken>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_APPEND_EVENT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.appendEvent(
              (io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.event.Confirmation>) responseObserver);
        case METHODID_LIST_EVENTS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.listEvents(
              (io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.event.EventWithToken>) responseObserver);
        case METHODID_QUERY_EVENTS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.queryEvents(
              (io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.event.QueryEventsResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class EventStoreBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EventStoreBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.axoniq.axonserver.grpc.event.EventOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EventStore");
    }
  }

  private static final class EventStoreFileDescriptorSupplier
      extends EventStoreBaseDescriptorSupplier {
    EventStoreFileDescriptorSupplier() {}
  }

  private static final class EventStoreMethodDescriptorSupplier
      extends EventStoreBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EventStoreMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (EventStoreGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EventStoreFileDescriptorSupplier())
              .addMethod(getAppendEventMethod())
              .addMethod(getAppendSnapshotMethod())
              .addMethod(getListAggregateEventsMethod())
              .addMethod(getListAggregateSnapshotsMethod())
              .addMethod(getListEventsMethod())
              .addMethod(getReadHighestSequenceNrMethod())
              .addMethod(getQueryEventsMethod())
              .addMethod(getGetFirstTokenMethod())
              .addMethod(getGetLastTokenMethod())
              .addMethod(getGetTokenAtMethod())
              .build();
        }
      }
    }
    return result;
  }
}
