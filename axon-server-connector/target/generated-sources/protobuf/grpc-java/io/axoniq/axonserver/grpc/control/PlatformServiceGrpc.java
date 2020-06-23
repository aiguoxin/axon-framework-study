package io.axoniq.axonserver.grpc.control;

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
 * Service describing operations for connecting to the AxonServer platform.
 *Clients are expected to use this service on any of the Platform's Admin nodes to obtain connection information of the
 *node that it should set up the actual connection with. On that second node, the clients should open an instruction
 *stream (see OpenStream), so that AxonServer and the client application can exchange information and instructions.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.19.0)",
    comments = "Source: control.proto")
public final class PlatformServiceGrpc {

  private PlatformServiceGrpc() {}

  public static final String SERVICE_NAME = "io.axoniq.axonserver.grpc.control.PlatformService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.axoniq.axonserver.grpc.control.ClientIdentification,
      io.axoniq.axonserver.grpc.control.PlatformInfo> getGetPlatformServerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPlatformServer",
      requestType = io.axoniq.axonserver.grpc.control.ClientIdentification.class,
      responseType = io.axoniq.axonserver.grpc.control.PlatformInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.axoniq.axonserver.grpc.control.ClientIdentification,
      io.axoniq.axonserver.grpc.control.PlatformInfo> getGetPlatformServerMethod() {
    io.grpc.MethodDescriptor<io.axoniq.axonserver.grpc.control.ClientIdentification, io.axoniq.axonserver.grpc.control.PlatformInfo> getGetPlatformServerMethod;
    if ((getGetPlatformServerMethod = PlatformServiceGrpc.getGetPlatformServerMethod) == null) {
      synchronized (PlatformServiceGrpc.class) {
        if ((getGetPlatformServerMethod = PlatformServiceGrpc.getGetPlatformServerMethod) == null) {
          PlatformServiceGrpc.getGetPlatformServerMethod = getGetPlatformServerMethod = 
              io.grpc.MethodDescriptor.<io.axoniq.axonserver.grpc.control.ClientIdentification, io.axoniq.axonserver.grpc.control.PlatformInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "io.axoniq.axonserver.grpc.control.PlatformService", "GetPlatformServer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.axoniq.axonserver.grpc.control.ClientIdentification.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.axoniq.axonserver.grpc.control.PlatformInfo.getDefaultInstance()))
                  .setSchemaDescriptor(new PlatformServiceMethodDescriptorSupplier("GetPlatformServer"))
                  .build();
          }
        }
     }
     return getGetPlatformServerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.axoniq.axonserver.grpc.control.PlatformInboundInstruction,
      io.axoniq.axonserver.grpc.control.PlatformOutboundInstruction> getOpenStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OpenStream",
      requestType = io.axoniq.axonserver.grpc.control.PlatformInboundInstruction.class,
      responseType = io.axoniq.axonserver.grpc.control.PlatformOutboundInstruction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<io.axoniq.axonserver.grpc.control.PlatformInboundInstruction,
      io.axoniq.axonserver.grpc.control.PlatformOutboundInstruction> getOpenStreamMethod() {
    io.grpc.MethodDescriptor<io.axoniq.axonserver.grpc.control.PlatformInboundInstruction, io.axoniq.axonserver.grpc.control.PlatformOutboundInstruction> getOpenStreamMethod;
    if ((getOpenStreamMethod = PlatformServiceGrpc.getOpenStreamMethod) == null) {
      synchronized (PlatformServiceGrpc.class) {
        if ((getOpenStreamMethod = PlatformServiceGrpc.getOpenStreamMethod) == null) {
          PlatformServiceGrpc.getOpenStreamMethod = getOpenStreamMethod = 
              io.grpc.MethodDescriptor.<io.axoniq.axonserver.grpc.control.PlatformInboundInstruction, io.axoniq.axonserver.grpc.control.PlatformOutboundInstruction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "io.axoniq.axonserver.grpc.control.PlatformService", "OpenStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.axoniq.axonserver.grpc.control.PlatformInboundInstruction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.axoniq.axonserver.grpc.control.PlatformOutboundInstruction.getDefaultInstance()))
                  .setSchemaDescriptor(new PlatformServiceMethodDescriptorSupplier("OpenStream"))
                  .build();
          }
        }
     }
     return getOpenStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PlatformServiceStub newStub(io.grpc.Channel channel) {
    return new PlatformServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PlatformServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PlatformServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PlatformServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PlatformServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service describing operations for connecting to the AxonServer platform.
   *Clients are expected to use this service on any of the Platform's Admin nodes to obtain connection information of the
   *node that it should set up the actual connection with. On that second node, the clients should open an instruction
   *stream (see OpenStream), so that AxonServer and the client application can exchange information and instructions.
   * </pre>
   */
  public static abstract class PlatformServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Obtains connection information for the Server that a Client should use for its connections. 
     * </pre>
     */
    public void getPlatformServer(io.axoniq.axonserver.grpc.control.ClientIdentification request,
        io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.control.PlatformInfo> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPlatformServerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Opens an instruction stream to the Platform, allowing AxonServer to provide management instructions to the application 
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.control.PlatformInboundInstruction> openStream(
        io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.control.PlatformOutboundInstruction> responseObserver) {
      return asyncUnimplementedStreamingCall(getOpenStreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetPlatformServerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.axoniq.axonserver.grpc.control.ClientIdentification,
                io.axoniq.axonserver.grpc.control.PlatformInfo>(
                  this, METHODID_GET_PLATFORM_SERVER)))
          .addMethod(
            getOpenStreamMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                io.axoniq.axonserver.grpc.control.PlatformInboundInstruction,
                io.axoniq.axonserver.grpc.control.PlatformOutboundInstruction>(
                  this, METHODID_OPEN_STREAM)))
          .build();
    }
  }

  /**
   * <pre>
   * Service describing operations for connecting to the AxonServer platform.
   *Clients are expected to use this service on any of the Platform's Admin nodes to obtain connection information of the
   *node that it should set up the actual connection with. On that second node, the clients should open an instruction
   *stream (see OpenStream), so that AxonServer and the client application can exchange information and instructions.
   * </pre>
   */
  public static final class PlatformServiceStub extends io.grpc.stub.AbstractStub<PlatformServiceStub> {
    private PlatformServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PlatformServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlatformServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PlatformServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Obtains connection information for the Server that a Client should use for its connections. 
     * </pre>
     */
    public void getPlatformServer(io.axoniq.axonserver.grpc.control.ClientIdentification request,
        io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.control.PlatformInfo> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPlatformServerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Opens an instruction stream to the Platform, allowing AxonServer to provide management instructions to the application 
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.control.PlatformInboundInstruction> openStream(
        io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.control.PlatformOutboundInstruction> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getOpenStreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Service describing operations for connecting to the AxonServer platform.
   *Clients are expected to use this service on any of the Platform's Admin nodes to obtain connection information of the
   *node that it should set up the actual connection with. On that second node, the clients should open an instruction
   *stream (see OpenStream), so that AxonServer and the client application can exchange information and instructions.
   * </pre>
   */
  public static final class PlatformServiceBlockingStub extends io.grpc.stub.AbstractStub<PlatformServiceBlockingStub> {
    private PlatformServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PlatformServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlatformServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PlatformServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Obtains connection information for the Server that a Client should use for its connections. 
     * </pre>
     */
    public io.axoniq.axonserver.grpc.control.PlatformInfo getPlatformServer(io.axoniq.axonserver.grpc.control.ClientIdentification request) {
      return blockingUnaryCall(
          getChannel(), getGetPlatformServerMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service describing operations for connecting to the AxonServer platform.
   *Clients are expected to use this service on any of the Platform's Admin nodes to obtain connection information of the
   *node that it should set up the actual connection with. On that second node, the clients should open an instruction
   *stream (see OpenStream), so that AxonServer and the client application can exchange information and instructions.
   * </pre>
   */
  public static final class PlatformServiceFutureStub extends io.grpc.stub.AbstractStub<PlatformServiceFutureStub> {
    private PlatformServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PlatformServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlatformServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PlatformServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Obtains connection information for the Server that a Client should use for its connections. 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.axoniq.axonserver.grpc.control.PlatformInfo> getPlatformServer(
        io.axoniq.axonserver.grpc.control.ClientIdentification request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPlatformServerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PLATFORM_SERVER = 0;
  private static final int METHODID_OPEN_STREAM = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PlatformServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PlatformServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PLATFORM_SERVER:
          serviceImpl.getPlatformServer((io.axoniq.axonserver.grpc.control.ClientIdentification) request,
              (io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.control.PlatformInfo>) responseObserver);
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
              (io.grpc.stub.StreamObserver<io.axoniq.axonserver.grpc.control.PlatformOutboundInstruction>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PlatformServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PlatformServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.axoniq.axonserver.grpc.control.Control.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PlatformService");
    }
  }

  private static final class PlatformServiceFileDescriptorSupplier
      extends PlatformServiceBaseDescriptorSupplier {
    PlatformServiceFileDescriptorSupplier() {}
  }

  private static final class PlatformServiceMethodDescriptorSupplier
      extends PlatformServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PlatformServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PlatformServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PlatformServiceFileDescriptorSupplier())
              .addMethod(getGetPlatformServerMethod())
              .addMethod(getOpenStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
