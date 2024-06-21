package ai.chalk.protos.chalk.server.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: chalk/server/v1/audit.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AuditServiceGrpc {

  private AuditServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "chalk.server.v1.AuditService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetAuditLogsRequest,
      ai.chalk.protos.chalk.server.v1.GetAuditLogsResponse> getGetAuditLogsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAuditLogs",
      requestType = ai.chalk.protos.chalk.server.v1.GetAuditLogsRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.GetAuditLogsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetAuditLogsRequest,
      ai.chalk.protos.chalk.server.v1.GetAuditLogsResponse> getGetAuditLogsMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetAuditLogsRequest, ai.chalk.protos.chalk.server.v1.GetAuditLogsResponse> getGetAuditLogsMethod;
    if ((getGetAuditLogsMethod = AuditServiceGrpc.getGetAuditLogsMethod) == null) {
      synchronized (AuditServiceGrpc.class) {
        if ((getGetAuditLogsMethod = AuditServiceGrpc.getGetAuditLogsMethod) == null) {
          AuditServiceGrpc.getGetAuditLogsMethod = getGetAuditLogsMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.GetAuditLogsRequest, ai.chalk.protos.chalk.server.v1.GetAuditLogsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAuditLogs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetAuditLogsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetAuditLogsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuditServiceMethodDescriptorSupplier("GetAuditLogs"))
              .build();
        }
      }
    }
    return getGetAuditLogsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuditServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuditServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuditServiceStub>() {
        @java.lang.Override
        public AuditServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuditServiceStub(channel, callOptions);
        }
      };
    return AuditServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuditServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuditServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuditServiceBlockingStub>() {
        @java.lang.Override
        public AuditServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuditServiceBlockingStub(channel, callOptions);
        }
      };
    return AuditServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuditServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuditServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuditServiceFutureStub>() {
        @java.lang.Override
        public AuditServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuditServiceFutureStub(channel, callOptions);
        }
      };
    return AuditServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getAuditLogs(ai.chalk.protos.chalk.server.v1.GetAuditLogsRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetAuditLogsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAuditLogsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AuditService.
   */
  public static abstract class AuditServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AuditServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AuditService.
   */
  public static final class AuditServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AuditServiceStub> {
    private AuditServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuditServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuditServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAuditLogs(ai.chalk.protos.chalk.server.v1.GetAuditLogsRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetAuditLogsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAuditLogsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AuditService.
   */
  public static final class AuditServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AuditServiceBlockingStub> {
    private AuditServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuditServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuditServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.GetAuditLogsResponse getAuditLogs(ai.chalk.protos.chalk.server.v1.GetAuditLogsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAuditLogsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AuditService.
   */
  public static final class AuditServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AuditServiceFutureStub> {
    private AuditServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuditServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuditServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.GetAuditLogsResponse> getAuditLogs(
        ai.chalk.protos.chalk.server.v1.GetAuditLogsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAuditLogsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_AUDIT_LOGS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_AUDIT_LOGS:
          serviceImpl.getAuditLogs((ai.chalk.protos.chalk.server.v1.GetAuditLogsRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetAuditLogsResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetAuditLogsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.GetAuditLogsRequest,
              ai.chalk.protos.chalk.server.v1.GetAuditLogsResponse>(
                service, METHODID_GET_AUDIT_LOGS)))
        .build();
  }

  private static abstract class AuditServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuditServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ai.chalk.protos.chalk.server.v1.AuditProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AuditService");
    }
  }

  private static final class AuditServiceFileDescriptorSupplier
      extends AuditServiceBaseDescriptorSupplier {
    AuditServiceFileDescriptorSupplier() {}
  }

  private static final class AuditServiceMethodDescriptorSupplier
      extends AuditServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AuditServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AuditServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuditServiceFileDescriptorSupplier())
              .addMethod(getGetAuditLogsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
