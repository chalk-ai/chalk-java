package ai.chalk.protos.chalk.server.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: chalk/server/v1/authtesting.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AuthTestingServiceGrpc {

  private AuthTestingServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "chalk.server.v1.AuthTestingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetUnauthedTestEndpointRequest,
      ai.chalk.protos.chalk.server.v1.GetUnauthedTestEndpointResponse> getGetUnauthedTestEndpointMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUnauthedTestEndpoint",
      requestType = ai.chalk.protos.chalk.server.v1.GetUnauthedTestEndpointRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.GetUnauthedTestEndpointResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetUnauthedTestEndpointRequest,
      ai.chalk.protos.chalk.server.v1.GetUnauthedTestEndpointResponse> getGetUnauthedTestEndpointMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetUnauthedTestEndpointRequest, ai.chalk.protos.chalk.server.v1.GetUnauthedTestEndpointResponse> getGetUnauthedTestEndpointMethod;
    if ((getGetUnauthedTestEndpointMethod = AuthTestingServiceGrpc.getGetUnauthedTestEndpointMethod) == null) {
      synchronized (AuthTestingServiceGrpc.class) {
        if ((getGetUnauthedTestEndpointMethod = AuthTestingServiceGrpc.getGetUnauthedTestEndpointMethod) == null) {
          AuthTestingServiceGrpc.getGetUnauthedTestEndpointMethod = getGetUnauthedTestEndpointMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.GetUnauthedTestEndpointRequest, ai.chalk.protos.chalk.server.v1.GetUnauthedTestEndpointResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUnauthedTestEndpoint"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetUnauthedTestEndpointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetUnauthedTestEndpointResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthTestingServiceMethodDescriptorSupplier("GetUnauthedTestEndpoint"))
              .build();
        }
      }
    }
    return getGetUnauthedTestEndpointMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetAuthedTestEndpointRequest,
      ai.chalk.protos.chalk.server.v1.GetAuthedTestEndpointResponse> getGetAuthedTestEndpointMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAuthedTestEndpoint",
      requestType = ai.chalk.protos.chalk.server.v1.GetAuthedTestEndpointRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.GetAuthedTestEndpointResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetAuthedTestEndpointRequest,
      ai.chalk.protos.chalk.server.v1.GetAuthedTestEndpointResponse> getGetAuthedTestEndpointMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetAuthedTestEndpointRequest, ai.chalk.protos.chalk.server.v1.GetAuthedTestEndpointResponse> getGetAuthedTestEndpointMethod;
    if ((getGetAuthedTestEndpointMethod = AuthTestingServiceGrpc.getGetAuthedTestEndpointMethod) == null) {
      synchronized (AuthTestingServiceGrpc.class) {
        if ((getGetAuthedTestEndpointMethod = AuthTestingServiceGrpc.getGetAuthedTestEndpointMethod) == null) {
          AuthTestingServiceGrpc.getGetAuthedTestEndpointMethod = getGetAuthedTestEndpointMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.GetAuthedTestEndpointRequest, ai.chalk.protos.chalk.server.v1.GetAuthedTestEndpointResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAuthedTestEndpoint"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetAuthedTestEndpointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetAuthedTestEndpointResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthTestingServiceMethodDescriptorSupplier("GetAuthedTestEndpoint"))
              .build();
        }
      }
    }
    return getGetAuthedTestEndpointMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetViewerTestEndpointRequest,
      ai.chalk.protos.chalk.server.v1.GetViewerTestEndpointResponse> getGetViewerTestEndpointMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetViewerTestEndpoint",
      requestType = ai.chalk.protos.chalk.server.v1.GetViewerTestEndpointRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.GetViewerTestEndpointResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetViewerTestEndpointRequest,
      ai.chalk.protos.chalk.server.v1.GetViewerTestEndpointResponse> getGetViewerTestEndpointMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetViewerTestEndpointRequest, ai.chalk.protos.chalk.server.v1.GetViewerTestEndpointResponse> getGetViewerTestEndpointMethod;
    if ((getGetViewerTestEndpointMethod = AuthTestingServiceGrpc.getGetViewerTestEndpointMethod) == null) {
      synchronized (AuthTestingServiceGrpc.class) {
        if ((getGetViewerTestEndpointMethod = AuthTestingServiceGrpc.getGetViewerTestEndpointMethod) == null) {
          AuthTestingServiceGrpc.getGetViewerTestEndpointMethod = getGetViewerTestEndpointMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.GetViewerTestEndpointRequest, ai.chalk.protos.chalk.server.v1.GetViewerTestEndpointResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetViewerTestEndpoint"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetViewerTestEndpointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetViewerTestEndpointResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthTestingServiceMethodDescriptorSupplier("GetViewerTestEndpoint"))
              .build();
        }
      }
    }
    return getGetViewerTestEndpointMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetDataScientistTestEndpointRequest,
      ai.chalk.protos.chalk.server.v1.GetDataScientistTestEndpointResponse> getGetDataScientistTestEndpointMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDataScientistTestEndpoint",
      requestType = ai.chalk.protos.chalk.server.v1.GetDataScientistTestEndpointRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.GetDataScientistTestEndpointResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetDataScientistTestEndpointRequest,
      ai.chalk.protos.chalk.server.v1.GetDataScientistTestEndpointResponse> getGetDataScientistTestEndpointMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetDataScientistTestEndpointRequest, ai.chalk.protos.chalk.server.v1.GetDataScientistTestEndpointResponse> getGetDataScientistTestEndpointMethod;
    if ((getGetDataScientistTestEndpointMethod = AuthTestingServiceGrpc.getGetDataScientistTestEndpointMethod) == null) {
      synchronized (AuthTestingServiceGrpc.class) {
        if ((getGetDataScientistTestEndpointMethod = AuthTestingServiceGrpc.getGetDataScientistTestEndpointMethod) == null) {
          AuthTestingServiceGrpc.getGetDataScientistTestEndpointMethod = getGetDataScientistTestEndpointMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.GetDataScientistTestEndpointRequest, ai.chalk.protos.chalk.server.v1.GetDataScientistTestEndpointResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDataScientistTestEndpoint"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetDataScientistTestEndpointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetDataScientistTestEndpointResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthTestingServiceMethodDescriptorSupplier("GetDataScientistTestEndpoint"))
              .build();
        }
      }
    }
    return getGetDataScientistTestEndpointMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetDeveloperTestEndpointRequest,
      ai.chalk.protos.chalk.server.v1.GetDeveloperTestEndpointResponse> getGetDeveloperTestEndpointMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDeveloperTestEndpoint",
      requestType = ai.chalk.protos.chalk.server.v1.GetDeveloperTestEndpointRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.GetDeveloperTestEndpointResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetDeveloperTestEndpointRequest,
      ai.chalk.protos.chalk.server.v1.GetDeveloperTestEndpointResponse> getGetDeveloperTestEndpointMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetDeveloperTestEndpointRequest, ai.chalk.protos.chalk.server.v1.GetDeveloperTestEndpointResponse> getGetDeveloperTestEndpointMethod;
    if ((getGetDeveloperTestEndpointMethod = AuthTestingServiceGrpc.getGetDeveloperTestEndpointMethod) == null) {
      synchronized (AuthTestingServiceGrpc.class) {
        if ((getGetDeveloperTestEndpointMethod = AuthTestingServiceGrpc.getGetDeveloperTestEndpointMethod) == null) {
          AuthTestingServiceGrpc.getGetDeveloperTestEndpointMethod = getGetDeveloperTestEndpointMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.GetDeveloperTestEndpointRequest, ai.chalk.protos.chalk.server.v1.GetDeveloperTestEndpointResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDeveloperTestEndpoint"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetDeveloperTestEndpointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetDeveloperTestEndpointResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthTestingServiceMethodDescriptorSupplier("GetDeveloperTestEndpoint"))
              .build();
        }
      }
    }
    return getGetDeveloperTestEndpointMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetAdminTestEndpointRequest,
      ai.chalk.protos.chalk.server.v1.GetAdminTestEndpointResponse> getGetAdminTestEndpointMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAdminTestEndpoint",
      requestType = ai.chalk.protos.chalk.server.v1.GetAdminTestEndpointRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.GetAdminTestEndpointResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetAdminTestEndpointRequest,
      ai.chalk.protos.chalk.server.v1.GetAdminTestEndpointResponse> getGetAdminTestEndpointMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetAdminTestEndpointRequest, ai.chalk.protos.chalk.server.v1.GetAdminTestEndpointResponse> getGetAdminTestEndpointMethod;
    if ((getGetAdminTestEndpointMethod = AuthTestingServiceGrpc.getGetAdminTestEndpointMethod) == null) {
      synchronized (AuthTestingServiceGrpc.class) {
        if ((getGetAdminTestEndpointMethod = AuthTestingServiceGrpc.getGetAdminTestEndpointMethod) == null) {
          AuthTestingServiceGrpc.getGetAdminTestEndpointMethod = getGetAdminTestEndpointMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.GetAdminTestEndpointRequest, ai.chalk.protos.chalk.server.v1.GetAdminTestEndpointResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAdminTestEndpoint"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetAdminTestEndpointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetAdminTestEndpointResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthTestingServiceMethodDescriptorSupplier("GetAdminTestEndpoint"))
              .build();
        }
      }
    }
    return getGetAdminTestEndpointMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetOwnerTestEndpointRequest,
      ai.chalk.protos.chalk.server.v1.GetOwnerTestEndpointResponse> getGetOwnerTestEndpointMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOwnerTestEndpoint",
      requestType = ai.chalk.protos.chalk.server.v1.GetOwnerTestEndpointRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.GetOwnerTestEndpointResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetOwnerTestEndpointRequest,
      ai.chalk.protos.chalk.server.v1.GetOwnerTestEndpointResponse> getGetOwnerTestEndpointMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetOwnerTestEndpointRequest, ai.chalk.protos.chalk.server.v1.GetOwnerTestEndpointResponse> getGetOwnerTestEndpointMethod;
    if ((getGetOwnerTestEndpointMethod = AuthTestingServiceGrpc.getGetOwnerTestEndpointMethod) == null) {
      synchronized (AuthTestingServiceGrpc.class) {
        if ((getGetOwnerTestEndpointMethod = AuthTestingServiceGrpc.getGetOwnerTestEndpointMethod) == null) {
          AuthTestingServiceGrpc.getGetOwnerTestEndpointMethod = getGetOwnerTestEndpointMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.GetOwnerTestEndpointRequest, ai.chalk.protos.chalk.server.v1.GetOwnerTestEndpointResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOwnerTestEndpoint"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetOwnerTestEndpointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetOwnerTestEndpointResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthTestingServiceMethodDescriptorSupplier("GetOwnerTestEndpoint"))
              .build();
        }
      }
    }
    return getGetOwnerTestEndpointMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthTestingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthTestingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthTestingServiceStub>() {
        @java.lang.Override
        public AuthTestingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthTestingServiceStub(channel, callOptions);
        }
      };
    return AuthTestingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthTestingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthTestingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthTestingServiceBlockingStub>() {
        @java.lang.Override
        public AuthTestingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthTestingServiceBlockingStub(channel, callOptions);
        }
      };
    return AuthTestingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthTestingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthTestingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthTestingServiceFutureStub>() {
        @java.lang.Override
        public AuthTestingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthTestingServiceFutureStub(channel, callOptions);
        }
      };
    return AuthTestingServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getUnauthedTestEndpoint(ai.chalk.protos.chalk.server.v1.GetUnauthedTestEndpointRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetUnauthedTestEndpointResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUnauthedTestEndpointMethod(), responseObserver);
    }

    /**
     */
    default void getAuthedTestEndpoint(ai.chalk.protos.chalk.server.v1.GetAuthedTestEndpointRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetAuthedTestEndpointResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAuthedTestEndpointMethod(), responseObserver);
    }

    /**
     */
    default void getViewerTestEndpoint(ai.chalk.protos.chalk.server.v1.GetViewerTestEndpointRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetViewerTestEndpointResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetViewerTestEndpointMethod(), responseObserver);
    }

    /**
     */
    default void getDataScientistTestEndpoint(ai.chalk.protos.chalk.server.v1.GetDataScientistTestEndpointRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetDataScientistTestEndpointResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDataScientistTestEndpointMethod(), responseObserver);
    }

    /**
     */
    default void getDeveloperTestEndpoint(ai.chalk.protos.chalk.server.v1.GetDeveloperTestEndpointRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetDeveloperTestEndpointResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDeveloperTestEndpointMethod(), responseObserver);
    }

    /**
     */
    default void getAdminTestEndpoint(ai.chalk.protos.chalk.server.v1.GetAdminTestEndpointRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetAdminTestEndpointResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAdminTestEndpointMethod(), responseObserver);
    }

    /**
     */
    default void getOwnerTestEndpoint(ai.chalk.protos.chalk.server.v1.GetOwnerTestEndpointRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetOwnerTestEndpointResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOwnerTestEndpointMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AuthTestingService.
   */
  public static abstract class AuthTestingServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AuthTestingServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AuthTestingService.
   */
  public static final class AuthTestingServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AuthTestingServiceStub> {
    private AuthTestingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthTestingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthTestingServiceStub(channel, callOptions);
    }

    /**
     */
    public void getUnauthedTestEndpoint(ai.chalk.protos.chalk.server.v1.GetUnauthedTestEndpointRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetUnauthedTestEndpointResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUnauthedTestEndpointMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAuthedTestEndpoint(ai.chalk.protos.chalk.server.v1.GetAuthedTestEndpointRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetAuthedTestEndpointResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAuthedTestEndpointMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getViewerTestEndpoint(ai.chalk.protos.chalk.server.v1.GetViewerTestEndpointRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetViewerTestEndpointResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetViewerTestEndpointMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDataScientistTestEndpoint(ai.chalk.protos.chalk.server.v1.GetDataScientistTestEndpointRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetDataScientistTestEndpointResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDataScientistTestEndpointMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDeveloperTestEndpoint(ai.chalk.protos.chalk.server.v1.GetDeveloperTestEndpointRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetDeveloperTestEndpointResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDeveloperTestEndpointMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAdminTestEndpoint(ai.chalk.protos.chalk.server.v1.GetAdminTestEndpointRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetAdminTestEndpointResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAdminTestEndpointMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOwnerTestEndpoint(ai.chalk.protos.chalk.server.v1.GetOwnerTestEndpointRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetOwnerTestEndpointResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOwnerTestEndpointMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AuthTestingService.
   */
  public static final class AuthTestingServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AuthTestingServiceBlockingStub> {
    private AuthTestingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthTestingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthTestingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.GetUnauthedTestEndpointResponse getUnauthedTestEndpoint(ai.chalk.protos.chalk.server.v1.GetUnauthedTestEndpointRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUnauthedTestEndpointMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.GetAuthedTestEndpointResponse getAuthedTestEndpoint(ai.chalk.protos.chalk.server.v1.GetAuthedTestEndpointRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAuthedTestEndpointMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.GetViewerTestEndpointResponse getViewerTestEndpoint(ai.chalk.protos.chalk.server.v1.GetViewerTestEndpointRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetViewerTestEndpointMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.GetDataScientistTestEndpointResponse getDataScientistTestEndpoint(ai.chalk.protos.chalk.server.v1.GetDataScientistTestEndpointRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDataScientistTestEndpointMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.GetDeveloperTestEndpointResponse getDeveloperTestEndpoint(ai.chalk.protos.chalk.server.v1.GetDeveloperTestEndpointRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDeveloperTestEndpointMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.GetAdminTestEndpointResponse getAdminTestEndpoint(ai.chalk.protos.chalk.server.v1.GetAdminTestEndpointRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAdminTestEndpointMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.GetOwnerTestEndpointResponse getOwnerTestEndpoint(ai.chalk.protos.chalk.server.v1.GetOwnerTestEndpointRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOwnerTestEndpointMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AuthTestingService.
   */
  public static final class AuthTestingServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AuthTestingServiceFutureStub> {
    private AuthTestingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthTestingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthTestingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.GetUnauthedTestEndpointResponse> getUnauthedTestEndpoint(
        ai.chalk.protos.chalk.server.v1.GetUnauthedTestEndpointRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUnauthedTestEndpointMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.GetAuthedTestEndpointResponse> getAuthedTestEndpoint(
        ai.chalk.protos.chalk.server.v1.GetAuthedTestEndpointRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAuthedTestEndpointMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.GetViewerTestEndpointResponse> getViewerTestEndpoint(
        ai.chalk.protos.chalk.server.v1.GetViewerTestEndpointRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetViewerTestEndpointMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.GetDataScientistTestEndpointResponse> getDataScientistTestEndpoint(
        ai.chalk.protos.chalk.server.v1.GetDataScientistTestEndpointRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDataScientistTestEndpointMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.GetDeveloperTestEndpointResponse> getDeveloperTestEndpoint(
        ai.chalk.protos.chalk.server.v1.GetDeveloperTestEndpointRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDeveloperTestEndpointMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.GetAdminTestEndpointResponse> getAdminTestEndpoint(
        ai.chalk.protos.chalk.server.v1.GetAdminTestEndpointRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAdminTestEndpointMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.GetOwnerTestEndpointResponse> getOwnerTestEndpoint(
        ai.chalk.protos.chalk.server.v1.GetOwnerTestEndpointRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOwnerTestEndpointMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_UNAUTHED_TEST_ENDPOINT = 0;
  private static final int METHODID_GET_AUTHED_TEST_ENDPOINT = 1;
  private static final int METHODID_GET_VIEWER_TEST_ENDPOINT = 2;
  private static final int METHODID_GET_DATA_SCIENTIST_TEST_ENDPOINT = 3;
  private static final int METHODID_GET_DEVELOPER_TEST_ENDPOINT = 4;
  private static final int METHODID_GET_ADMIN_TEST_ENDPOINT = 5;
  private static final int METHODID_GET_OWNER_TEST_ENDPOINT = 6;

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
        case METHODID_GET_UNAUTHED_TEST_ENDPOINT:
          serviceImpl.getUnauthedTestEndpoint((ai.chalk.protos.chalk.server.v1.GetUnauthedTestEndpointRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetUnauthedTestEndpointResponse>) responseObserver);
          break;
        case METHODID_GET_AUTHED_TEST_ENDPOINT:
          serviceImpl.getAuthedTestEndpoint((ai.chalk.protos.chalk.server.v1.GetAuthedTestEndpointRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetAuthedTestEndpointResponse>) responseObserver);
          break;
        case METHODID_GET_VIEWER_TEST_ENDPOINT:
          serviceImpl.getViewerTestEndpoint((ai.chalk.protos.chalk.server.v1.GetViewerTestEndpointRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetViewerTestEndpointResponse>) responseObserver);
          break;
        case METHODID_GET_DATA_SCIENTIST_TEST_ENDPOINT:
          serviceImpl.getDataScientistTestEndpoint((ai.chalk.protos.chalk.server.v1.GetDataScientistTestEndpointRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetDataScientistTestEndpointResponse>) responseObserver);
          break;
        case METHODID_GET_DEVELOPER_TEST_ENDPOINT:
          serviceImpl.getDeveloperTestEndpoint((ai.chalk.protos.chalk.server.v1.GetDeveloperTestEndpointRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetDeveloperTestEndpointResponse>) responseObserver);
          break;
        case METHODID_GET_ADMIN_TEST_ENDPOINT:
          serviceImpl.getAdminTestEndpoint((ai.chalk.protos.chalk.server.v1.GetAdminTestEndpointRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetAdminTestEndpointResponse>) responseObserver);
          break;
        case METHODID_GET_OWNER_TEST_ENDPOINT:
          serviceImpl.getOwnerTestEndpoint((ai.chalk.protos.chalk.server.v1.GetOwnerTestEndpointRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetOwnerTestEndpointResponse>) responseObserver);
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
          getGetUnauthedTestEndpointMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.GetUnauthedTestEndpointRequest,
              ai.chalk.protos.chalk.server.v1.GetUnauthedTestEndpointResponse>(
                service, METHODID_GET_UNAUTHED_TEST_ENDPOINT)))
        .addMethod(
          getGetAuthedTestEndpointMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.GetAuthedTestEndpointRequest,
              ai.chalk.protos.chalk.server.v1.GetAuthedTestEndpointResponse>(
                service, METHODID_GET_AUTHED_TEST_ENDPOINT)))
        .addMethod(
          getGetViewerTestEndpointMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.GetViewerTestEndpointRequest,
              ai.chalk.protos.chalk.server.v1.GetViewerTestEndpointResponse>(
                service, METHODID_GET_VIEWER_TEST_ENDPOINT)))
        .addMethod(
          getGetDataScientistTestEndpointMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.GetDataScientistTestEndpointRequest,
              ai.chalk.protos.chalk.server.v1.GetDataScientistTestEndpointResponse>(
                service, METHODID_GET_DATA_SCIENTIST_TEST_ENDPOINT)))
        .addMethod(
          getGetDeveloperTestEndpointMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.GetDeveloperTestEndpointRequest,
              ai.chalk.protos.chalk.server.v1.GetDeveloperTestEndpointResponse>(
                service, METHODID_GET_DEVELOPER_TEST_ENDPOINT)))
        .addMethod(
          getGetAdminTestEndpointMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.GetAdminTestEndpointRequest,
              ai.chalk.protos.chalk.server.v1.GetAdminTestEndpointResponse>(
                service, METHODID_GET_ADMIN_TEST_ENDPOINT)))
        .addMethod(
          getGetOwnerTestEndpointMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.GetOwnerTestEndpointRequest,
              ai.chalk.protos.chalk.server.v1.GetOwnerTestEndpointResponse>(
                service, METHODID_GET_OWNER_TEST_ENDPOINT)))
        .build();
  }

  private static abstract class AuthTestingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuthTestingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ai.chalk.protos.chalk.server.v1.AuthtestingProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AuthTestingService");
    }
  }

  private static final class AuthTestingServiceFileDescriptorSupplier
      extends AuthTestingServiceBaseDescriptorSupplier {
    AuthTestingServiceFileDescriptorSupplier() {}
  }

  private static final class AuthTestingServiceMethodDescriptorSupplier
      extends AuthTestingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AuthTestingServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AuthTestingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthTestingServiceFileDescriptorSupplier())
              .addMethod(getGetUnauthedTestEndpointMethod())
              .addMethod(getGetAuthedTestEndpointMethod())
              .addMethod(getGetViewerTestEndpointMethod())
              .addMethod(getGetDataScientistTestEndpointMethod())
              .addMethod(getGetDeveloperTestEndpointMethod())
              .addMethod(getGetAdminTestEndpointMethod())
              .addMethod(getGetOwnerTestEndpointMethod())
              .build();
        }
      }
    }
    return result;
  }
}
