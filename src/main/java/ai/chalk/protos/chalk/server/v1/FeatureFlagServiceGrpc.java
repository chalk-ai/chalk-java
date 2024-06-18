package ai.chalk.protos.chalk.server.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: chalk/server/v1/flag.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FeatureFlagServiceGrpc {

  private FeatureFlagServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "chalk.server.v1.FeatureFlagService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetFeatureFlagsRequest,
      ai.chalk.protos.chalk.server.v1.GetFeatureFlagsResponse> getGetFeatureFlagsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFeatureFlags",
      requestType = ai.chalk.protos.chalk.server.v1.GetFeatureFlagsRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.GetFeatureFlagsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetFeatureFlagsRequest,
      ai.chalk.protos.chalk.server.v1.GetFeatureFlagsResponse> getGetFeatureFlagsMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetFeatureFlagsRequest, ai.chalk.protos.chalk.server.v1.GetFeatureFlagsResponse> getGetFeatureFlagsMethod;
    if ((getGetFeatureFlagsMethod = FeatureFlagServiceGrpc.getGetFeatureFlagsMethod) == null) {
      synchronized (FeatureFlagServiceGrpc.class) {
        if ((getGetFeatureFlagsMethod = FeatureFlagServiceGrpc.getGetFeatureFlagsMethod) == null) {
          FeatureFlagServiceGrpc.getGetFeatureFlagsMethod = getGetFeatureFlagsMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.GetFeatureFlagsRequest, ai.chalk.protos.chalk.server.v1.GetFeatureFlagsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFeatureFlags"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetFeatureFlagsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetFeatureFlagsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FeatureFlagServiceMethodDescriptorSupplier("GetFeatureFlags"))
              .build();
        }
      }
    }
    return getGetFeatureFlagsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.SetFeatureFlagRequest,
      ai.chalk.protos.chalk.server.v1.SetFeatureFlagResponse> getSetFeatureFlagMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetFeatureFlag",
      requestType = ai.chalk.protos.chalk.server.v1.SetFeatureFlagRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.SetFeatureFlagResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.SetFeatureFlagRequest,
      ai.chalk.protos.chalk.server.v1.SetFeatureFlagResponse> getSetFeatureFlagMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.SetFeatureFlagRequest, ai.chalk.protos.chalk.server.v1.SetFeatureFlagResponse> getSetFeatureFlagMethod;
    if ((getSetFeatureFlagMethod = FeatureFlagServiceGrpc.getSetFeatureFlagMethod) == null) {
      synchronized (FeatureFlagServiceGrpc.class) {
        if ((getSetFeatureFlagMethod = FeatureFlagServiceGrpc.getSetFeatureFlagMethod) == null) {
          FeatureFlagServiceGrpc.getSetFeatureFlagMethod = getSetFeatureFlagMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.SetFeatureFlagRequest, ai.chalk.protos.chalk.server.v1.SetFeatureFlagResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetFeatureFlag"))
              .setIdempotent(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.SetFeatureFlagRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.SetFeatureFlagResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FeatureFlagServiceMethodDescriptorSupplier("SetFeatureFlag"))
              .build();
        }
      }
    }
    return getSetFeatureFlagMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FeatureFlagServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FeatureFlagServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FeatureFlagServiceStub>() {
        @java.lang.Override
        public FeatureFlagServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FeatureFlagServiceStub(channel, callOptions);
        }
      };
    return FeatureFlagServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FeatureFlagServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FeatureFlagServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FeatureFlagServiceBlockingStub>() {
        @java.lang.Override
        public FeatureFlagServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FeatureFlagServiceBlockingStub(channel, callOptions);
        }
      };
    return FeatureFlagServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FeatureFlagServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FeatureFlagServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FeatureFlagServiceFutureStub>() {
        @java.lang.Override
        public FeatureFlagServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FeatureFlagServiceFutureStub(channel, callOptions);
        }
      };
    return FeatureFlagServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getFeatureFlags(ai.chalk.protos.chalk.server.v1.GetFeatureFlagsRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetFeatureFlagsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFeatureFlagsMethod(), responseObserver);
    }

    /**
     */
    default void setFeatureFlag(ai.chalk.protos.chalk.server.v1.SetFeatureFlagRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.SetFeatureFlagResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetFeatureFlagMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service FeatureFlagService.
   */
  public static abstract class FeatureFlagServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return FeatureFlagServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service FeatureFlagService.
   */
  public static final class FeatureFlagServiceStub
      extends io.grpc.stub.AbstractAsyncStub<FeatureFlagServiceStub> {
    private FeatureFlagServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeatureFlagServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FeatureFlagServiceStub(channel, callOptions);
    }

    /**
     */
    public void getFeatureFlags(ai.chalk.protos.chalk.server.v1.GetFeatureFlagsRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetFeatureFlagsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFeatureFlagsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setFeatureFlag(ai.chalk.protos.chalk.server.v1.SetFeatureFlagRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.SetFeatureFlagResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetFeatureFlagMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service FeatureFlagService.
   */
  public static final class FeatureFlagServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<FeatureFlagServiceBlockingStub> {
    private FeatureFlagServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeatureFlagServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FeatureFlagServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.GetFeatureFlagsResponse getFeatureFlags(ai.chalk.protos.chalk.server.v1.GetFeatureFlagsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFeatureFlagsMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.SetFeatureFlagResponse setFeatureFlag(ai.chalk.protos.chalk.server.v1.SetFeatureFlagRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetFeatureFlagMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service FeatureFlagService.
   */
  public static final class FeatureFlagServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<FeatureFlagServiceFutureStub> {
    private FeatureFlagServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeatureFlagServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FeatureFlagServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.GetFeatureFlagsResponse> getFeatureFlags(
        ai.chalk.protos.chalk.server.v1.GetFeatureFlagsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFeatureFlagsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.SetFeatureFlagResponse> setFeatureFlag(
        ai.chalk.protos.chalk.server.v1.SetFeatureFlagRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetFeatureFlagMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_FEATURE_FLAGS = 0;
  private static final int METHODID_SET_FEATURE_FLAG = 1;

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
        case METHODID_GET_FEATURE_FLAGS:
          serviceImpl.getFeatureFlags((ai.chalk.protos.chalk.server.v1.GetFeatureFlagsRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetFeatureFlagsResponse>) responseObserver);
          break;
        case METHODID_SET_FEATURE_FLAG:
          serviceImpl.setFeatureFlag((ai.chalk.protos.chalk.server.v1.SetFeatureFlagRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.SetFeatureFlagResponse>) responseObserver);
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
          getGetFeatureFlagsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.GetFeatureFlagsRequest,
              ai.chalk.protos.chalk.server.v1.GetFeatureFlagsResponse>(
                service, METHODID_GET_FEATURE_FLAGS)))
        .addMethod(
          getSetFeatureFlagMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.SetFeatureFlagRequest,
              ai.chalk.protos.chalk.server.v1.SetFeatureFlagResponse>(
                service, METHODID_SET_FEATURE_FLAG)))
        .build();
  }

  private static abstract class FeatureFlagServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FeatureFlagServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ai.chalk.protos.chalk.server.v1.FlagProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FeatureFlagService");
    }
  }

  private static final class FeatureFlagServiceFileDescriptorSupplier
      extends FeatureFlagServiceBaseDescriptorSupplier {
    FeatureFlagServiceFileDescriptorSupplier() {}
  }

  private static final class FeatureFlagServiceMethodDescriptorSupplier
      extends FeatureFlagServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    FeatureFlagServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (FeatureFlagServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FeatureFlagServiceFileDescriptorSupplier())
              .addMethod(getGetFeatureFlagsMethod())
              .addMethod(getSetFeatureFlagMethod())
              .build();
        }
      }
    }
    return result;
  }
}
