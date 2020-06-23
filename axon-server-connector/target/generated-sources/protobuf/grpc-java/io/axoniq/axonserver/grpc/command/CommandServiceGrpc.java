package io.axoniq.axonserver.grpc.command;

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
 * The CommandService defines the gRPC requests necessary for subscribing command handlers, and dispatching commands. 
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.19.0)",
    comments = "Source: command.proto")
public final class CommandServiceGrpc {

  private CommandServiceGrpc() {}

  public static final String SERVICE_NAME = "io.axoniq.axonserver.grpc.command.CommandService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.axoniq.axonserver.grpc.command.CommandProviderOutbound,
      io.axoniq.axonserver.grpc.command.CommandProviderInbound> getOpenStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OpenStream",
      requestType = io.axoniq.axonserver.grpc.command.CommandProviderOutbound.class,
      responseType = io.axoniq.axonserver.grpc.command.CommandProviderInbound.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<io.axoniq.axonserver.grpc.command.CommandProviderOutbound,
      io.axoniq.axonserver.grpc.command.CommandProviderInbound> getOpenStreamMethod() {
    io.grpc.MethodDescriptor<io.axoniq.axonserver.grpc.command.CommandProviderOutbound, io.axoniq.axonserver.grpc.command.CommandProviderInbound> getOpenStreamMethod;
    if ((getOpenStreamMethod = CommandServiceGrpc.getOpenStreamMethod) == null) {
      synchronized (CommandServiceGrpc.class) {
        if ((getOpenStreamMethod = CommandServiceGrpc.getOpenStreamMethod) == null) {
          CommandServiceGrpc.getOpenStreamMethod = getOpenStreamMethod = 
              io.grpc.MethodDescriptor.<io.axoniq.axonserver.grpc.command.CommandProviderOutbound, io.axoniq.axonserver.grpc.command.CommandProviderInbound>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "io.axoniq.axonserver.grpc.command.CommandService", "OpenStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.axoniq.axonserver.grpc.command.CommandProviderOutbound.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.axoniq.axonserver.grpc.command.CommandProviderInbound.getDefaultInstance()))
                  .setSchemaDescriptor(new CommandServiceMethodDescriptorSupplier("OpenStream"))
                  .build();
          }
        }
     }
     return getOpenStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.axoniq.axonserver.grpc.command.Command,
      io.axoniq.axonserver.grpc.command.CommandResponse> getDispatchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Dispatch",
      requestType = io.axoniq.axonserver.grpc.command.Command.class,
      responseType = io.axoniq.axonserver.grpc.command.CommandResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.axoniq.axonserver.grpc.command.Command,
      io.axoniq.axonserver.grpc.command.CommandResponse> getDispatchMethod() {
    io.grpc.MethodDescriptor<io.axoniq.axonserver.grpc.command.Command, io.axoniq.axonserver.grpc.command.CommandResponse> getDispatchMethod;
    if ((getDispatchMethod = CommandServiceGrpc.getDispatchMethod) == null) {
      synchronized (CommandServiceGrpc.class) {
        if ((getDispatchMethod = CommandServiceGrpc.getDispatchMethod) == null) {
          CommandServiceGrpc.getDispatchMethod = getDispatchMethod = 
              io.grpc.MethodDescriptor.<io.axoniq.axonserver.grpc.command.Command, io.axoniq.axonserver.grpc.command.CommandResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "io.axoniq.axonserver.grpc.command.CommandService", "Dispatch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.axoniq.axonserver.grpc.command.Command.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.axoniq.axonserver.grpc.command.CommandResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CommandServiceMethodDescriptorSupplier("Dispatch"))
                  .build();
          }
        }
     }
     return getDispatchMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CommandServiceStub newStub(io.grpc.Channel channel) {
    return new CommandServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CommandServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CommandServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CommandServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CommandServiceFutureStub(channel);
  }

  /**
   * <pre>
   * The CommandService defines the gRPC requests necessary for subscribing command handlers, and dispatching commands. 
   * </pre>
   */
  public static abstract class CommandServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Opens a stream allowing clients to register command handlers and receive commands. 
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.command.CommandProviderOutbound> openStream(
        io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.command.CommandProviderInbound> responseObserver) {
      return asyncUnimplementedStreamingCall(getOpenStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     * Dispatches the given command, returning the result of command execution 
     * </pre>
     */
    public void dispatch(io.axoniq.axonserver.grpc.command.Command request,
        io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.command.CommandResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDispatchMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getOpenStreamMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                io.axoniq.axonserver.grpc.command.CommandProviderOutbound,
                io.axoniq.axonserver.grpc.command.CommandProviderInbound>(
                  this, METHODID_OPEN_STREAM)))
          .addMethod(
            getDispatchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.axoniq.axonserver.grpc.command.Command,
                io.axoniq.axonserver.grpc.command.CommandResponse>(
                  this, METHODID_DISPATCH)))
          .build();
    }
  }

  /**
   * <pre>
   * The CommandService defines the gRPC requests necessary for subscribing command handlers, and dispatching commands. 
   * </pre>
   */
  public static final class CommandServiceStub extends io.grpc.stub.AbstractStub<CommandServiceStub> {
    private CommandServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CommandServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommandServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CommandServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Opens a stream allowing clients to register command handlers and receive commands. 
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.command.CommandProviderOutbound> openStream(
        io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.command.CommandProviderInbound> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getOpenStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Dispatches the given command, returning the result of command execution 
     * </pre>
     */
    public void dispatch(io.axoniq.axonserver.grpc.command.Command request,
        io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.command.CommandResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDispatchMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The CommandService defines the gRPC requests necessary for subscribing command handlers, and dispatching commands. 
   * </pre>
   */
  public static final class CommandServiceBlockingStub extends io.grpc.stub.AbstractStub<CommandServiceBlockingStub> {
    private CommandServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CommandServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommandServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CommandServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Dispatches the given command, returning the result of command execution 
     * </pre>
     */
    public io.axoniq.axonserver.grpc.command.CommandResponse dispatch(io.axoniq.axonserver.grpc.command.Command request) {
      return blockingUnaryCall(
          getChannel(), getDispatchMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The CommandService defines the gRPC requests necessary for subscribing command handlers, and dispatching commands. 
   * </pre>
   */
  public static final class CommandServiceFutureStub extends io.grpc.stub.AbstractStub<CommandServiceFutureStub> {
    private CommandServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CommandServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommandServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CommandServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Dispatches the given command, returning the result of command execution 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.axoniq.axonserver.grpc.command.CommandResponse> dispatch(
        io.axoniq.axonserver.grpc.command.Command request) {
      return futureUnaryCall(
          getChannel().newCall(getDispatchMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DISPATCH = 0;
  private static final int METHODID_OPEN_STREAM = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CommandServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CommandServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DISPATCH:
          serviceImpl.dispatch((io.axoniq.axonserver.grpc.command.Command) request,
              (io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.command.CommandResponse>) responseObserver);
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
              (io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.command.CommandProviderInbound>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CommandServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CommandServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.axoniq.axonserver.grpc.command.CommandOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CommandService");
    }
  }

  private static final class CommandServiceFileDescriptorSupplier
      extends CommandServiceBaseDescriptorSupplier {
    CommandServiceFileDescriptorSupplier() {}
  }

  private static final class CommandServiceMethodDescriptorSupplier
      extends CommandServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CommandServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CommandServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CommandServiceFileDescriptorSupplier())
              .addMethod(getOpenStreamMethod())
              .addMethod(getDispatchMethod())
              .build();
        }
      }
    }
    return result;
  }
}
