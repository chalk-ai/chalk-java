package ai.chalk.protos.chalk.server.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: chalk/server/v1/named_query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class NamedQueryServiceGrpc {

  private NamedQueryServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "chalk.server.v1.NamedQueryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetAllNamedQueriesRequest,
      ai.chalk.protos.chalk.server.v1.GetAllNamedQueriesResponse> getGetAllNamedQueriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllNamedQueries",
      requestType = ai.chalk.protos.chalk.server.v1.GetAllNamedQueriesRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.GetAllNamedQueriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetAllNamedQueriesRequest,
      ai.chalk.protos.chalk.server.v1.GetAllNamedQueriesResponse> getGetAllNamedQueriesMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetAllNamedQueriesRequest, ai.chalk.protos.chalk.server.v1.GetAllNamedQueriesResponse> getGetAllNamedQueriesMethod;
    if ((getGetAllNamedQueriesMethod = NamedQueryServiceGrpc.getGetAllNamedQueriesMethod) == null) {
      synchronized (NamedQueryServiceGrpc.class) {
        if ((getGetAllNamedQueriesMethod = NamedQueryServiceGrpc.getGetAllNamedQueriesMethod) == null) {
          NamedQueryServiceGrpc.getGetAllNamedQueriesMethod = getGetAllNamedQueriesMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.GetAllNamedQueriesRequest, ai.chalk.protos.chalk.server.v1.GetAllNamedQueriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllNamedQueries"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetAllNamedQueriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetAllNamedQueriesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NamedQueryServiceMethodDescriptorSupplier("GetAllNamedQueries"))
              .build();
        }
      }
    }
    return getGetAllNamedQueriesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetAllNamedQueriesActiveDeploymentRequest,
      ai.chalk.protos.chalk.server.v1.GetAllNamedQueriesActiveDeploymentResponse> getGetAllNamedQueriesActiveDeploymentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllNamedQueriesActiveDeployment",
      requestType = ai.chalk.protos.chalk.server.v1.GetAllNamedQueriesActiveDeploymentRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.GetAllNamedQueriesActiveDeploymentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetAllNamedQueriesActiveDeploymentRequest,
      ai.chalk.protos.chalk.server.v1.GetAllNamedQueriesActiveDeploymentResponse> getGetAllNamedQueriesActiveDeploymentMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetAllNamedQueriesActiveDeploymentRequest, ai.chalk.protos.chalk.server.v1.GetAllNamedQueriesActiveDeploymentResponse> getGetAllNamedQueriesActiveDeploymentMethod;
    if ((getGetAllNamedQueriesActiveDeploymentMethod = NamedQueryServiceGrpc.getGetAllNamedQueriesActiveDeploymentMethod) == null) {
      synchronized (NamedQueryServiceGrpc.class) {
        if ((getGetAllNamedQueriesActiveDeploymentMethod = NamedQueryServiceGrpc.getGetAllNamedQueriesActiveDeploymentMethod) == null) {
          NamedQueryServiceGrpc.getGetAllNamedQueriesActiveDeploymentMethod = getGetAllNamedQueriesActiveDeploymentMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.GetAllNamedQueriesActiveDeploymentRequest, ai.chalk.protos.chalk.server.v1.GetAllNamedQueriesActiveDeploymentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllNamedQueriesActiveDeployment"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetAllNamedQueriesActiveDeploymentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetAllNamedQueriesActiveDeploymentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NamedQueryServiceMethodDescriptorSupplier("GetAllNamedQueriesActiveDeployment"))
              .build();
        }
      }
    }
    return getGetAllNamedQueriesActiveDeploymentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetNamedQueryByNameRequest,
      ai.chalk.protos.chalk.server.v1.GetNamedQueryByNameResponse> getGetNamedQueryByNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNamedQueryByName",
      requestType = ai.chalk.protos.chalk.server.v1.GetNamedQueryByNameRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.GetNamedQueryByNameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetNamedQueryByNameRequest,
      ai.chalk.protos.chalk.server.v1.GetNamedQueryByNameResponse> getGetNamedQueryByNameMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetNamedQueryByNameRequest, ai.chalk.protos.chalk.server.v1.GetNamedQueryByNameResponse> getGetNamedQueryByNameMethod;
    if ((getGetNamedQueryByNameMethod = NamedQueryServiceGrpc.getGetNamedQueryByNameMethod) == null) {
      synchronized (NamedQueryServiceGrpc.class) {
        if ((getGetNamedQueryByNameMethod = NamedQueryServiceGrpc.getGetNamedQueryByNameMethod) == null) {
          NamedQueryServiceGrpc.getGetNamedQueryByNameMethod = getGetNamedQueryByNameMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.GetNamedQueryByNameRequest, ai.chalk.protos.chalk.server.v1.GetNamedQueryByNameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNamedQueryByName"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetNamedQueryByNameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetNamedQueryByNameResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NamedQueryServiceMethodDescriptorSupplier("GetNamedQueryByName"))
              .build();
        }
      }
    }
    return getGetNamedQueryByNameMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NamedQueryServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NamedQueryServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NamedQueryServiceStub>() {
        @java.lang.Override
        public NamedQueryServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NamedQueryServiceStub(channel, callOptions);
        }
      };
    return NamedQueryServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NamedQueryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NamedQueryServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NamedQueryServiceBlockingStub>() {
        @java.lang.Override
        public NamedQueryServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NamedQueryServiceBlockingStub(channel, callOptions);
        }
      };
    return NamedQueryServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NamedQueryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NamedQueryServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NamedQueryServiceFutureStub>() {
        @java.lang.Override
        public NamedQueryServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NamedQueryServiceFutureStub(channel, callOptions);
        }
      };
    return NamedQueryServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getAllNamedQueries(ai.chalk.protos.chalk.server.v1.GetAllNamedQueriesRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetAllNamedQueriesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllNamedQueriesMethod(), responseObserver);
    }

    /**
     */
    default void getAllNamedQueriesActiveDeployment(ai.chalk.protos.chalk.server.v1.GetAllNamedQueriesActiveDeploymentRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetAllNamedQueriesActiveDeploymentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllNamedQueriesActiveDeploymentMethod(), responseObserver);
    }

    /**
     */
    default void getNamedQueryByName(ai.chalk.protos.chalk.server.v1.GetNamedQueryByNameRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetNamedQueryByNameResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNamedQueryByNameMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service NamedQueryService.
   */
  public static abstract class NamedQueryServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return NamedQueryServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service NamedQueryService.
   */
  public static final class NamedQueryServiceStub
      extends io.grpc.stub.AbstractAsyncStub<NamedQueryServiceStub> {
    private NamedQueryServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NamedQueryServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NamedQueryServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAllNamedQueries(ai.chalk.protos.chalk.server.v1.GetAllNamedQueriesRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetAllNamedQueriesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllNamedQueriesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllNamedQueriesActiveDeployment(ai.chalk.protos.chalk.server.v1.GetAllNamedQueriesActiveDeploymentRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetAllNamedQueriesActiveDeploymentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllNamedQueriesActiveDeploymentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNamedQueryByName(ai.chalk.protos.chalk.server.v1.GetNamedQueryByNameRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetNamedQueryByNameResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNamedQueryByNameMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service NamedQueryService.
   */
  public static final class NamedQueryServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<NamedQueryServiceBlockingStub> {
    private NamedQueryServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NamedQueryServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NamedQueryServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.GetAllNamedQueriesResponse getAllNamedQueries(ai.chalk.protos.chalk.server.v1.GetAllNamedQueriesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllNamedQueriesMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.GetAllNamedQueriesActiveDeploymentResponse getAllNamedQueriesActiveDeployment(ai.chalk.protos.chalk.server.v1.GetAllNamedQueriesActiveDeploymentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllNamedQueriesActiveDeploymentMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.GetNamedQueryByNameResponse getNamedQueryByName(ai.chalk.protos.chalk.server.v1.GetNamedQueryByNameRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNamedQueryByNameMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service NamedQueryService.
   */
  public static final class NamedQueryServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<NamedQueryServiceFutureStub> {
    private NamedQueryServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NamedQueryServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NamedQueryServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.GetAllNamedQueriesResponse> getAllNamedQueries(
        ai.chalk.protos.chalk.server.v1.GetAllNamedQueriesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllNamedQueriesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.GetAllNamedQueriesActiveDeploymentResponse> getAllNamedQueriesActiveDeployment(
        ai.chalk.protos.chalk.server.v1.GetAllNamedQueriesActiveDeploymentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllNamedQueriesActiveDeploymentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.GetNamedQueryByNameResponse> getNamedQueryByName(
        ai.chalk.protos.chalk.server.v1.GetNamedQueryByNameRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNamedQueryByNameMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_NAMED_QUERIES = 0;
  private static final int METHODID_GET_ALL_NAMED_QUERIES_ACTIVE_DEPLOYMENT = 1;
  private static final int METHODID_GET_NAMED_QUERY_BY_NAME = 2;

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
        case METHODID_GET_ALL_NAMED_QUERIES:
          serviceImpl.getAllNamedQueries((ai.chalk.protos.chalk.server.v1.GetAllNamedQueriesRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetAllNamedQueriesResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_NAMED_QUERIES_ACTIVE_DEPLOYMENT:
          serviceImpl.getAllNamedQueriesActiveDeployment((ai.chalk.protos.chalk.server.v1.GetAllNamedQueriesActiveDeploymentRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetAllNamedQueriesActiveDeploymentResponse>) responseObserver);
          break;
        case METHODID_GET_NAMED_QUERY_BY_NAME:
          serviceImpl.getNamedQueryByName((ai.chalk.protos.chalk.server.v1.GetNamedQueryByNameRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetNamedQueryByNameResponse>) responseObserver);
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
          getGetAllNamedQueriesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.GetAllNamedQueriesRequest,
              ai.chalk.protos.chalk.server.v1.GetAllNamedQueriesResponse>(
                service, METHODID_GET_ALL_NAMED_QUERIES)))
        .addMethod(
          getGetAllNamedQueriesActiveDeploymentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.GetAllNamedQueriesActiveDeploymentRequest,
              ai.chalk.protos.chalk.server.v1.GetAllNamedQueriesActiveDeploymentResponse>(
                service, METHODID_GET_ALL_NAMED_QUERIES_ACTIVE_DEPLOYMENT)))
        .addMethod(
          getGetNamedQueryByNameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.GetNamedQueryByNameRequest,
              ai.chalk.protos.chalk.server.v1.GetNamedQueryByNameResponse>(
                service, METHODID_GET_NAMED_QUERY_BY_NAME)))
        .build();
  }

  private static abstract class NamedQueryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NamedQueryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ai.chalk.protos.chalk.server.v1.NamedQueryProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NamedQueryService");
    }
  }

  private static final class NamedQueryServiceFileDescriptorSupplier
      extends NamedQueryServiceBaseDescriptorSupplier {
    NamedQueryServiceFileDescriptorSupplier() {}
  }

  private static final class NamedQueryServiceMethodDescriptorSupplier
      extends NamedQueryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    NamedQueryServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (NamedQueryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NamedQueryServiceFileDescriptorSupplier())
              .addMethod(getGetAllNamedQueriesMethod())
              .addMethod(getGetAllNamedQueriesActiveDeploymentMethod())
              .addMethod(getGetNamedQueryByNameMethod())
              .build();
        }
      }
    }
    return result;
  }
}
