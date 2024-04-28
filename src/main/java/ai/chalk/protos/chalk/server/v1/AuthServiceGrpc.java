package ai.chalk.protos.chalk.server.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.63.0)",
    comments = "Source: chalk/server/v1/auth.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AuthServiceGrpc {

  private AuthServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "chalk.server.v1.AuthService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetTokenRequest,
      ai.chalk.protos.chalk.server.v1.GetTokenResponse> getGetTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetToken",
      requestType = ai.chalk.protos.chalk.server.v1.GetTokenRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.GetTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetTokenRequest,
      ai.chalk.protos.chalk.server.v1.GetTokenResponse> getGetTokenMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetTokenRequest, ai.chalk.protos.chalk.server.v1.GetTokenResponse> getGetTokenMethod;
    if ((getGetTokenMethod = AuthServiceGrpc.getGetTokenMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getGetTokenMethod = AuthServiceGrpc.getGetTokenMethod) == null) {
          AuthServiceGrpc.getGetTokenMethod = getGetTokenMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.GetTokenRequest, ai.chalk.protos.chalk.server.v1.GetTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("GetToken"))
              .build();
        }
      }
    }
    return getGetTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.CreateLinkSessionRequest,
      ai.chalk.protos.chalk.server.v1.CreateLinkSessionResponse> getCreateLinkSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateLinkSession",
      requestType = ai.chalk.protos.chalk.server.v1.CreateLinkSessionRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.CreateLinkSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.CreateLinkSessionRequest,
      ai.chalk.protos.chalk.server.v1.CreateLinkSessionResponse> getCreateLinkSessionMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.CreateLinkSessionRequest, ai.chalk.protos.chalk.server.v1.CreateLinkSessionResponse> getCreateLinkSessionMethod;
    if ((getCreateLinkSessionMethod = AuthServiceGrpc.getCreateLinkSessionMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getCreateLinkSessionMethod = AuthServiceGrpc.getCreateLinkSessionMethod) == null) {
          AuthServiceGrpc.getCreateLinkSessionMethod = getCreateLinkSessionMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.CreateLinkSessionRequest, ai.chalk.protos.chalk.server.v1.CreateLinkSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateLinkSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.CreateLinkSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.CreateLinkSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("CreateLinkSession"))
              .build();
        }
      }
    }
    return getCreateLinkSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetLinkSessionRequest,
      ai.chalk.protos.chalk.server.v1.GetLinkSessionResponse> getGetLinkSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLinkSession",
      requestType = ai.chalk.protos.chalk.server.v1.GetLinkSessionRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.GetLinkSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetLinkSessionRequest,
      ai.chalk.protos.chalk.server.v1.GetLinkSessionResponse> getGetLinkSessionMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetLinkSessionRequest, ai.chalk.protos.chalk.server.v1.GetLinkSessionResponse> getGetLinkSessionMethod;
    if ((getGetLinkSessionMethod = AuthServiceGrpc.getGetLinkSessionMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getGetLinkSessionMethod = AuthServiceGrpc.getGetLinkSessionMethod) == null) {
          AuthServiceGrpc.getGetLinkSessionMethod = getGetLinkSessionMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.GetLinkSessionRequest, ai.chalk.protos.chalk.server.v1.GetLinkSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLinkSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetLinkSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetLinkSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("GetLinkSession"))
              .build();
        }
      }
    }
    return getGetLinkSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.UpdateLinkSessionRequest,
      ai.chalk.protos.chalk.server.v1.UpdateLinkSessionResponse> getUpdateLinkSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateLinkSession",
      requestType = ai.chalk.protos.chalk.server.v1.UpdateLinkSessionRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.UpdateLinkSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.UpdateLinkSessionRequest,
      ai.chalk.protos.chalk.server.v1.UpdateLinkSessionResponse> getUpdateLinkSessionMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.UpdateLinkSessionRequest, ai.chalk.protos.chalk.server.v1.UpdateLinkSessionResponse> getUpdateLinkSessionMethod;
    if ((getUpdateLinkSessionMethod = AuthServiceGrpc.getUpdateLinkSessionMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getUpdateLinkSessionMethod = AuthServiceGrpc.getUpdateLinkSessionMethod) == null) {
          AuthServiceGrpc.getUpdateLinkSessionMethod = getUpdateLinkSessionMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.UpdateLinkSessionRequest, ai.chalk.protos.chalk.server.v1.UpdateLinkSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateLinkSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.UpdateLinkSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.UpdateLinkSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("UpdateLinkSession"))
              .build();
        }
      }
    }
    return getUpdateLinkSessionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthServiceStub>() {
        @java.lang.Override
        public AuthServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthServiceStub(channel, callOptions);
        }
      };
    return AuthServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthServiceBlockingStub>() {
        @java.lang.Override
        public AuthServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthServiceBlockingStub(channel, callOptions);
        }
      };
    return AuthServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthServiceFutureStub>() {
        @java.lang.Override
        public AuthServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthServiceFutureStub(channel, callOptions);
        }
      };
    return AuthServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getToken(ai.chalk.protos.chalk.server.v1.GetTokenRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTokenMethod(), responseObserver);
    }

    /**
     */
    default void createLinkSession(ai.chalk.protos.chalk.server.v1.CreateLinkSessionRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.CreateLinkSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateLinkSessionMethod(), responseObserver);
    }

    /**
     */
    default void getLinkSession(ai.chalk.protos.chalk.server.v1.GetLinkSessionRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetLinkSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLinkSessionMethod(), responseObserver);
    }

    /**
     */
    default void updateLinkSession(ai.chalk.protos.chalk.server.v1.UpdateLinkSessionRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.UpdateLinkSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateLinkSessionMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AuthService.
   */
  public static abstract class AuthServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AuthServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AuthService.
   */
  public static final class AuthServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AuthServiceStub> {
    private AuthServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthServiceStub(channel, callOptions);
    }

    /**
     */
    public void getToken(ai.chalk.protos.chalk.server.v1.GetTokenRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createLinkSession(ai.chalk.protos.chalk.server.v1.CreateLinkSessionRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.CreateLinkSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateLinkSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getLinkSession(ai.chalk.protos.chalk.server.v1.GetLinkSessionRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetLinkSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLinkSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateLinkSession(ai.chalk.protos.chalk.server.v1.UpdateLinkSessionRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.UpdateLinkSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateLinkSessionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AuthService.
   */
  public static final class AuthServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AuthServiceBlockingStub> {
    private AuthServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.GetTokenResponse getToken(ai.chalk.protos.chalk.server.v1.GetTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.CreateLinkSessionResponse createLinkSession(ai.chalk.protos.chalk.server.v1.CreateLinkSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateLinkSessionMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.GetLinkSessionResponse getLinkSession(ai.chalk.protos.chalk.server.v1.GetLinkSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLinkSessionMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.UpdateLinkSessionResponse updateLinkSession(ai.chalk.protos.chalk.server.v1.UpdateLinkSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateLinkSessionMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AuthService.
   */
  public static final class AuthServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AuthServiceFutureStub> {
    private AuthServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.GetTokenResponse> getToken(
        ai.chalk.protos.chalk.server.v1.GetTokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTokenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.CreateLinkSessionResponse> createLinkSession(
        ai.chalk.protos.chalk.server.v1.CreateLinkSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateLinkSessionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.GetLinkSessionResponse> getLinkSession(
        ai.chalk.protos.chalk.server.v1.GetLinkSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLinkSessionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.UpdateLinkSessionResponse> updateLinkSession(
        ai.chalk.protos.chalk.server.v1.UpdateLinkSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateLinkSessionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TOKEN = 0;
  private static final int METHODID_CREATE_LINK_SESSION = 1;
  private static final int METHODID_GET_LINK_SESSION = 2;
  private static final int METHODID_UPDATE_LINK_SESSION = 3;

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
        case METHODID_GET_TOKEN:
          serviceImpl.getToken((ai.chalk.protos.chalk.server.v1.GetTokenRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetTokenResponse>) responseObserver);
          break;
        case METHODID_CREATE_LINK_SESSION:
          serviceImpl.createLinkSession((ai.chalk.protos.chalk.server.v1.CreateLinkSessionRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.CreateLinkSessionResponse>) responseObserver);
          break;
        case METHODID_GET_LINK_SESSION:
          serviceImpl.getLinkSession((ai.chalk.protos.chalk.server.v1.GetLinkSessionRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetLinkSessionResponse>) responseObserver);
          break;
        case METHODID_UPDATE_LINK_SESSION:
          serviceImpl.updateLinkSession((ai.chalk.protos.chalk.server.v1.UpdateLinkSessionRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.UpdateLinkSessionResponse>) responseObserver);
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
          getGetTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.GetTokenRequest,
              ai.chalk.protos.chalk.server.v1.GetTokenResponse>(
                service, METHODID_GET_TOKEN)))
        .addMethod(
          getCreateLinkSessionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.CreateLinkSessionRequest,
              ai.chalk.protos.chalk.server.v1.CreateLinkSessionResponse>(
                service, METHODID_CREATE_LINK_SESSION)))
        .addMethod(
          getGetLinkSessionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.GetLinkSessionRequest,
              ai.chalk.protos.chalk.server.v1.GetLinkSessionResponse>(
                service, METHODID_GET_LINK_SESSION)))
        .addMethod(
          getUpdateLinkSessionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.UpdateLinkSessionRequest,
              ai.chalk.protos.chalk.server.v1.UpdateLinkSessionResponse>(
                service, METHODID_UPDATE_LINK_SESSION)))
        .build();
  }

  private static abstract class AuthServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuthServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ai.chalk.protos.chalk.server.v1.AuthProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AuthService");
    }
  }

  private static final class AuthServiceFileDescriptorSupplier
      extends AuthServiceBaseDescriptorSupplier {
    AuthServiceFileDescriptorSupplier() {}
  }

  private static final class AuthServiceMethodDescriptorSupplier
      extends AuthServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AuthServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AuthServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthServiceFileDescriptorSupplier())
              .addMethod(getGetTokenMethod())
              .addMethod(getCreateLinkSessionMethod())
              .addMethod(getGetLinkSessionMethod())
              .addMethod(getUpdateLinkSessionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
