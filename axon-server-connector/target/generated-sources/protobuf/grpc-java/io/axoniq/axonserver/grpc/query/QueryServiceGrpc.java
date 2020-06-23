package io.axoniq.axonserver.grpc.query;

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
 * Service providing operations for the Query Messaging component of AxonServer 
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.19.0)",
    comments = "Source: query.proto")
public final class QueryServiceGrpc {

  private QueryServiceGrpc() {}

  public static final String SERVICE_NAME = "io.axoniq.axonserver.grpc.query.QueryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.axoniq.axonserver.grpc.query.QueryProviderOutbound,
      io.axoniq.axonserver.grpc.query.QueryProviderInbound> getOpenStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OpenStream",
      requestType = io.axoniq.axonserver.grpc.query.QueryProviderOutbound.class,
      responseType = io.axoniq.axonserver.grpc.query.QueryProviderInbound.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<io.axoniq.axonserver.grpc.query.QueryProviderOutbound,
      io.axoniq.axonserver.grpc.query.QueryProviderInbound> getOpenStreamMethod() {
    io.grpc.MethodDescriptor<io.axoniq.axonserver.grpc.query.QueryProviderOutbound, io.axoniq.axonserver.grpc.query.QueryProviderInbound> getOpenStreamMethod;
    if ((getOpenStreamMethod = QueryServiceGrpc.getOpenStreamMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getOpenStreamMethod = QueryServiceGrpc.getOpenStreamMethod) == null) {
          QueryServiceGrpc.getOpenStreamMethod = getOpenStreamMethod = 
              io.grpc.MethodDescriptor.<io.axoniq.axonserver.grpc.query.QueryProviderOutbound, io.axoniq.axonserver.grpc.query.QueryProviderInbound>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "io.axoniq.axonserver.grpc.query.QueryService", "OpenStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.axoniq.axonserver.grpc.query.QueryProviderOutbound.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.axoniq.axonserver.grpc.query.QueryProviderInbound.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("OpenStream"))
                  .build();
          }
        }
     }
     return getOpenStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.axoniq.axonserver.grpc.query.QueryRequest,
      io.axoniq.axonserver.grpc.query.QueryResponse> getQueryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Query",
      requestType = io.axoniq.axonserver.grpc.query.QueryRequest.class,
      responseType = io.axoniq.axonserver.grpc.query.QueryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.axoniq.axonserver.grpc.query.QueryRequest,
      io.axoniq.axonserver.grpc.query.QueryResponse> getQueryMethod() {
    io.grpc.MethodDescriptor<io.axoniq.axonserver.grpc.query.QueryRequest, io.axoniq.axonserver.grpc.query.QueryResponse> getQueryMethod;
    if ((getQueryMethod = QueryServiceGrpc.getQueryMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getQueryMethod = QueryServiceGrpc.getQueryMethod) == null) {
          QueryServiceGrpc.getQueryMethod = getQueryMethod = 
              io.grpc.MethodDescriptor.<io.axoniq.axonserver.grpc.query.QueryRequest, io.axoniq.axonserver.grpc.query.QueryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "io.axoniq.axonserver.grpc.query.QueryService", "Query"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.axoniq.axonserver.grpc.query.QueryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.axoniq.axonserver.grpc.query.QueryResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("Query"))
                  .build();
          }
        }
     }
     return getQueryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.axoniq.axonserver.grpc.query.SubscriptionQueryRequest,
      io.axoniq.axonserver.grpc.query.SubscriptionQueryResponse> getSubscriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Subscription",
      requestType = io.axoniq.axonserver.grpc.query.SubscriptionQueryRequest.class,
      responseType = io.axoniq.axonserver.grpc.query.SubscriptionQueryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<io.axoniq.axonserver.grpc.query.SubscriptionQueryRequest,
      io.axoniq.axonserver.grpc.query.SubscriptionQueryResponse> getSubscriptionMethod() {
    io.grpc.MethodDescriptor<io.axoniq.axonserver.grpc.query.SubscriptionQueryRequest, io.axoniq.axonserver.grpc.query.SubscriptionQueryResponse> getSubscriptionMethod;
    if ((getSubscriptionMethod = QueryServiceGrpc.getSubscriptionMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getSubscriptionMethod = QueryServiceGrpc.getSubscriptionMethod) == null) {
          QueryServiceGrpc.getSubscriptionMethod = getSubscriptionMethod = 
              io.grpc.MethodDescriptor.<io.axoniq.axonserver.grpc.query.SubscriptionQueryRequest, io.axoniq.axonserver.grpc.query.SubscriptionQueryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "io.axoniq.axonserver.grpc.query.QueryService", "Subscription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.axoniq.axonserver.grpc.query.SubscriptionQueryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.axoniq.axonserver.grpc.query.SubscriptionQueryResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("Subscription"))
                  .build();
          }
        }
     }
     return getSubscriptionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QueryServiceStub newStub(io.grpc.Channel channel) {
    return new QueryServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new QueryServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new QueryServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service providing operations for the Query Messaging component of AxonServer 
   * </pre>
   */
  public static abstract class QueryServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Opens a Query- and Instruction stream to AxonServer. 
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.query.QueryProviderOutbound> openStream(
        io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.query.QueryProviderInbound> responseObserver) {
      return asyncUnimplementedStreamingCall(getOpenStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sends a point-to-point or scatter-gather Query 
     * </pre>
     */
    public void query(io.axoniq.axonserver.grpc.query.QueryRequest request,
        io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.query.QueryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Opens a Subscription Query 
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.query.SubscriptionQueryRequest> subscription(
        io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.query.SubscriptionQueryResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getSubscriptionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getOpenStreamMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                io.axoniq.axonserver.grpc.query.QueryProviderOutbound,
                io.axoniq.axonserver.grpc.query.QueryProviderInbound>(
                  this, METHODID_OPEN_STREAM)))
          .addMethod(
            getQueryMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                io.axoniq.axonserver.grpc.query.QueryRequest,
                io.axoniq.axonserver.grpc.query.QueryResponse>(
                  this, METHODID_QUERY)))
          .addMethod(
            getSubscriptionMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                io.axoniq.axonserver.grpc.query.SubscriptionQueryRequest,
                io.axoniq.axonserver.grpc.query.SubscriptionQueryResponse>(
                  this, METHODID_SUBSCRIPTION)))
          .build();
    }
  }

  /**
   * <pre>
   * Service providing operations for the Query Messaging component of AxonServer 
   * </pre>
   */
  public static final class QueryServiceStub extends io.grpc.stub.AbstractStub<QueryServiceStub> {
    private QueryServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QueryServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QueryServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Opens a Query- and Instruction stream to AxonServer. 
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.query.QueryProviderOutbound> openStream(
        io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.query.QueryProviderInbound> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getOpenStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Sends a point-to-point or scatter-gather Query 
     * </pre>
     */
    public void query(io.axoniq.axonserver.grpc.query.QueryRequest request,
        io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.query.QueryResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getQueryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Opens a Subscription Query 
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.query.SubscriptionQueryRequest> subscription(
        io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.query.SubscriptionQueryResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getSubscriptionMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Service providing operations for the Query Messaging component of AxonServer 
   * </pre>
   */
  public static final class QueryServiceBlockingStub extends io.grpc.stub.AbstractStub<QueryServiceBlockingStub> {
    private QueryServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QueryServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QueryServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a point-to-point or scatter-gather Query 
     * </pre>
     */
    public java.util.Iterator<io.axoniq.axonserver.grpc.query.QueryResponse> query(
        io.axoniq.axonserver.grpc.query.QueryRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getQueryMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service providing operations for the Query Messaging component of AxonServer 
   * </pre>
   */
  public static final class QueryServiceFutureStub extends io.grpc.stub.AbstractStub<QueryServiceFutureStub> {
    private QueryServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QueryServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QueryServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_QUERY = 0;
  private static final int METHODID_OPEN_STREAM = 1;
  private static final int METHODID_SUBSCRIPTION = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final QueryServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(QueryServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_QUERY:
          serviceImpl.query((io.axoniq.axonserver.grpc.query.QueryRequest) request,
              (io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.query.QueryResponse>) responseObserver);
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
        case METHODID_OPEN_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.openStream(
              (io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.query.QueryProviderInbound>) responseObserver);
        case METHODID_SUBSCRIPTION:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.subscription(
              (io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.query.SubscriptionQueryResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class QueryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.axoniq.axonserver.grpc.query.Query.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("QueryService");
    }
  }

  private static final class QueryServiceFileDescriptorSupplier
      extends QueryServiceBaseDescriptorSupplier {
    QueryServiceFileDescriptorSupplier() {}
  }

  private static final class QueryServiceMethodDescriptorSupplier
      extends QueryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QueryServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (QueryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QueryServiceFileDescriptorSupplier())
              .addMethod(getOpenStreamMethod())
              .addMethod(getQueryMethod())
              .addMethod(getSubscriptionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
