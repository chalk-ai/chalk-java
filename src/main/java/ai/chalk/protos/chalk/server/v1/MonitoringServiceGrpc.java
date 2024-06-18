package ai.chalk.protos.chalk.server.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: chalk/server/v1/monitoring.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MonitoringServiceGrpc {

  private MonitoringServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "chalk.server.v1.MonitoringService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.TestPagerDutyIntegrationRequest,
      ai.chalk.protos.chalk.server.v1.TestPagerDutyIntegrationResponse> getTestPagerDutyIntegrationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TestPagerDutyIntegration",
      requestType = ai.chalk.protos.chalk.server.v1.TestPagerDutyIntegrationRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.TestPagerDutyIntegrationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.TestPagerDutyIntegrationRequest,
      ai.chalk.protos.chalk.server.v1.TestPagerDutyIntegrationResponse> getTestPagerDutyIntegrationMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.TestPagerDutyIntegrationRequest, ai.chalk.protos.chalk.server.v1.TestPagerDutyIntegrationResponse> getTestPagerDutyIntegrationMethod;
    if ((getTestPagerDutyIntegrationMethod = MonitoringServiceGrpc.getTestPagerDutyIntegrationMethod) == null) {
      synchronized (MonitoringServiceGrpc.class) {
        if ((getTestPagerDutyIntegrationMethod = MonitoringServiceGrpc.getTestPagerDutyIntegrationMethod) == null) {
          MonitoringServiceGrpc.getTestPagerDutyIntegrationMethod = getTestPagerDutyIntegrationMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.TestPagerDutyIntegrationRequest, ai.chalk.protos.chalk.server.v1.TestPagerDutyIntegrationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TestPagerDutyIntegration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.TestPagerDutyIntegrationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.TestPagerDutyIntegrationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MonitoringServiceMethodDescriptorSupplier("TestPagerDutyIntegration"))
              .build();
        }
      }
    }
    return getTestPagerDutyIntegrationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.AddPagerDutyIntegrationRequest,
      ai.chalk.protos.chalk.server.v1.AddPagerDutyIntegrationResponse> getAddPagerDutyIntegrationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddPagerDutyIntegration",
      requestType = ai.chalk.protos.chalk.server.v1.AddPagerDutyIntegrationRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.AddPagerDutyIntegrationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.AddPagerDutyIntegrationRequest,
      ai.chalk.protos.chalk.server.v1.AddPagerDutyIntegrationResponse> getAddPagerDutyIntegrationMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.AddPagerDutyIntegrationRequest, ai.chalk.protos.chalk.server.v1.AddPagerDutyIntegrationResponse> getAddPagerDutyIntegrationMethod;
    if ((getAddPagerDutyIntegrationMethod = MonitoringServiceGrpc.getAddPagerDutyIntegrationMethod) == null) {
      synchronized (MonitoringServiceGrpc.class) {
        if ((getAddPagerDutyIntegrationMethod = MonitoringServiceGrpc.getAddPagerDutyIntegrationMethod) == null) {
          MonitoringServiceGrpc.getAddPagerDutyIntegrationMethod = getAddPagerDutyIntegrationMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.AddPagerDutyIntegrationRequest, ai.chalk.protos.chalk.server.v1.AddPagerDutyIntegrationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddPagerDutyIntegration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.AddPagerDutyIntegrationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.AddPagerDutyIntegrationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MonitoringServiceMethodDescriptorSupplier("AddPagerDutyIntegration"))
              .build();
        }
      }
    }
    return getAddPagerDutyIntegrationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.DeletePagerDutyIntegrationRequest,
      ai.chalk.protos.chalk.server.v1.DeletePagerDutyIntegrationResponse> getDeletePagerDutyIntegrationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePagerDutyIntegration",
      requestType = ai.chalk.protos.chalk.server.v1.DeletePagerDutyIntegrationRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.DeletePagerDutyIntegrationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.DeletePagerDutyIntegrationRequest,
      ai.chalk.protos.chalk.server.v1.DeletePagerDutyIntegrationResponse> getDeletePagerDutyIntegrationMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.DeletePagerDutyIntegrationRequest, ai.chalk.protos.chalk.server.v1.DeletePagerDutyIntegrationResponse> getDeletePagerDutyIntegrationMethod;
    if ((getDeletePagerDutyIntegrationMethod = MonitoringServiceGrpc.getDeletePagerDutyIntegrationMethod) == null) {
      synchronized (MonitoringServiceGrpc.class) {
        if ((getDeletePagerDutyIntegrationMethod = MonitoringServiceGrpc.getDeletePagerDutyIntegrationMethod) == null) {
          MonitoringServiceGrpc.getDeletePagerDutyIntegrationMethod = getDeletePagerDutyIntegrationMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.DeletePagerDutyIntegrationRequest, ai.chalk.protos.chalk.server.v1.DeletePagerDutyIntegrationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletePagerDutyIntegration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.DeletePagerDutyIntegrationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.DeletePagerDutyIntegrationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MonitoringServiceMethodDescriptorSupplier("DeletePagerDutyIntegration"))
              .build();
        }
      }
    }
    return getDeletePagerDutyIntegrationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.SetDefaultPagerDutyIntegrationRequest,
      ai.chalk.protos.chalk.server.v1.SetDefaultPagerDutyIntegrationResponse> getSetDefaultPagerDutyIntegrationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetDefaultPagerDutyIntegration",
      requestType = ai.chalk.protos.chalk.server.v1.SetDefaultPagerDutyIntegrationRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.SetDefaultPagerDutyIntegrationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.SetDefaultPagerDutyIntegrationRequest,
      ai.chalk.protos.chalk.server.v1.SetDefaultPagerDutyIntegrationResponse> getSetDefaultPagerDutyIntegrationMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.SetDefaultPagerDutyIntegrationRequest, ai.chalk.protos.chalk.server.v1.SetDefaultPagerDutyIntegrationResponse> getSetDefaultPagerDutyIntegrationMethod;
    if ((getSetDefaultPagerDutyIntegrationMethod = MonitoringServiceGrpc.getSetDefaultPagerDutyIntegrationMethod) == null) {
      synchronized (MonitoringServiceGrpc.class) {
        if ((getSetDefaultPagerDutyIntegrationMethod = MonitoringServiceGrpc.getSetDefaultPagerDutyIntegrationMethod) == null) {
          MonitoringServiceGrpc.getSetDefaultPagerDutyIntegrationMethod = getSetDefaultPagerDutyIntegrationMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.SetDefaultPagerDutyIntegrationRequest, ai.chalk.protos.chalk.server.v1.SetDefaultPagerDutyIntegrationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetDefaultPagerDutyIntegration"))
              .setIdempotent(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.SetDefaultPagerDutyIntegrationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.SetDefaultPagerDutyIntegrationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MonitoringServiceMethodDescriptorSupplier("SetDefaultPagerDutyIntegration"))
              .build();
        }
      }
    }
    return getSetDefaultPagerDutyIntegrationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.UpdatePagerDutyIntegrationRequest,
      ai.chalk.protos.chalk.server.v1.UpdatePagerDutyIntegrationResponse> getUpdatePagerDutyIntegrationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePagerDutyIntegration",
      requestType = ai.chalk.protos.chalk.server.v1.UpdatePagerDutyIntegrationRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.UpdatePagerDutyIntegrationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.UpdatePagerDutyIntegrationRequest,
      ai.chalk.protos.chalk.server.v1.UpdatePagerDutyIntegrationResponse> getUpdatePagerDutyIntegrationMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.UpdatePagerDutyIntegrationRequest, ai.chalk.protos.chalk.server.v1.UpdatePagerDutyIntegrationResponse> getUpdatePagerDutyIntegrationMethod;
    if ((getUpdatePagerDutyIntegrationMethod = MonitoringServiceGrpc.getUpdatePagerDutyIntegrationMethod) == null) {
      synchronized (MonitoringServiceGrpc.class) {
        if ((getUpdatePagerDutyIntegrationMethod = MonitoringServiceGrpc.getUpdatePagerDutyIntegrationMethod) == null) {
          MonitoringServiceGrpc.getUpdatePagerDutyIntegrationMethod = getUpdatePagerDutyIntegrationMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.UpdatePagerDutyIntegrationRequest, ai.chalk.protos.chalk.server.v1.UpdatePagerDutyIntegrationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePagerDutyIntegration"))
              .setIdempotent(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.UpdatePagerDutyIntegrationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.UpdatePagerDutyIntegrationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MonitoringServiceMethodDescriptorSupplier("UpdatePagerDutyIntegration"))
              .build();
        }
      }
    }
    return getUpdatePagerDutyIntegrationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetAllPagerDutyIntegrationsRequest,
      ai.chalk.protos.chalk.server.v1.GetAllPagerDutyIntegrationsResponse> getGetAllPagerDutyIntegrationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllPagerDutyIntegrations",
      requestType = ai.chalk.protos.chalk.server.v1.GetAllPagerDutyIntegrationsRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.GetAllPagerDutyIntegrationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetAllPagerDutyIntegrationsRequest,
      ai.chalk.protos.chalk.server.v1.GetAllPagerDutyIntegrationsResponse> getGetAllPagerDutyIntegrationsMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetAllPagerDutyIntegrationsRequest, ai.chalk.protos.chalk.server.v1.GetAllPagerDutyIntegrationsResponse> getGetAllPagerDutyIntegrationsMethod;
    if ((getGetAllPagerDutyIntegrationsMethod = MonitoringServiceGrpc.getGetAllPagerDutyIntegrationsMethod) == null) {
      synchronized (MonitoringServiceGrpc.class) {
        if ((getGetAllPagerDutyIntegrationsMethod = MonitoringServiceGrpc.getGetAllPagerDutyIntegrationsMethod) == null) {
          MonitoringServiceGrpc.getGetAllPagerDutyIntegrationsMethod = getGetAllPagerDutyIntegrationsMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.GetAllPagerDutyIntegrationsRequest, ai.chalk.protos.chalk.server.v1.GetAllPagerDutyIntegrationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllPagerDutyIntegrations"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetAllPagerDutyIntegrationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetAllPagerDutyIntegrationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MonitoringServiceMethodDescriptorSupplier("GetAllPagerDutyIntegrations"))
              .build();
        }
      }
    }
    return getGetAllPagerDutyIntegrationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationRequest,
      ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationResponse> getGetPagerDutyIntegrationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPagerDutyIntegration",
      requestType = ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationRequest,
      ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationResponse> getGetPagerDutyIntegrationMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationRequest, ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationResponse> getGetPagerDutyIntegrationMethod;
    if ((getGetPagerDutyIntegrationMethod = MonitoringServiceGrpc.getGetPagerDutyIntegrationMethod) == null) {
      synchronized (MonitoringServiceGrpc.class) {
        if ((getGetPagerDutyIntegrationMethod = MonitoringServiceGrpc.getGetPagerDutyIntegrationMethod) == null) {
          MonitoringServiceGrpc.getGetPagerDutyIntegrationMethod = getGetPagerDutyIntegrationMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationRequest, ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPagerDutyIntegration"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MonitoringServiceMethodDescriptorSupplier("GetPagerDutyIntegration"))
              .build();
        }
      }
    }
    return getGetPagerDutyIntegrationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MonitoringServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MonitoringServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MonitoringServiceStub>() {
        @java.lang.Override
        public MonitoringServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MonitoringServiceStub(channel, callOptions);
        }
      };
    return MonitoringServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MonitoringServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MonitoringServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MonitoringServiceBlockingStub>() {
        @java.lang.Override
        public MonitoringServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MonitoringServiceBlockingStub(channel, callOptions);
        }
      };
    return MonitoringServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MonitoringServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MonitoringServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MonitoringServiceFutureStub>() {
        @java.lang.Override
        public MonitoringServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MonitoringServiceFutureStub(channel, callOptions);
        }
      };
    return MonitoringServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void testPagerDutyIntegration(ai.chalk.protos.chalk.server.v1.TestPagerDutyIntegrationRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.TestPagerDutyIntegrationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTestPagerDutyIntegrationMethod(), responseObserver);
    }

    /**
     */
    default void addPagerDutyIntegration(ai.chalk.protos.chalk.server.v1.AddPagerDutyIntegrationRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.AddPagerDutyIntegrationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddPagerDutyIntegrationMethod(), responseObserver);
    }

    /**
     */
    default void deletePagerDutyIntegration(ai.chalk.protos.chalk.server.v1.DeletePagerDutyIntegrationRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.DeletePagerDutyIntegrationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletePagerDutyIntegrationMethod(), responseObserver);
    }

    /**
     */
    default void setDefaultPagerDutyIntegration(ai.chalk.protos.chalk.server.v1.SetDefaultPagerDutyIntegrationRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.SetDefaultPagerDutyIntegrationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetDefaultPagerDutyIntegrationMethod(), responseObserver);
    }

    /**
     */
    default void updatePagerDutyIntegration(ai.chalk.protos.chalk.server.v1.UpdatePagerDutyIntegrationRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.UpdatePagerDutyIntegrationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePagerDutyIntegrationMethod(), responseObserver);
    }

    /**
     */
    default void getAllPagerDutyIntegrations(ai.chalk.protos.chalk.server.v1.GetAllPagerDutyIntegrationsRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetAllPagerDutyIntegrationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllPagerDutyIntegrationsMethod(), responseObserver);
    }

    /**
     */
    default void getPagerDutyIntegration(ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPagerDutyIntegrationMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service MonitoringService.
   */
  public static abstract class MonitoringServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MonitoringServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MonitoringService.
   */
  public static final class MonitoringServiceStub
      extends io.grpc.stub.AbstractAsyncStub<MonitoringServiceStub> {
    private MonitoringServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MonitoringServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MonitoringServiceStub(channel, callOptions);
    }

    /**
     */
    public void testPagerDutyIntegration(ai.chalk.protos.chalk.server.v1.TestPagerDutyIntegrationRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.TestPagerDutyIntegrationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTestPagerDutyIntegrationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addPagerDutyIntegration(ai.chalk.protos.chalk.server.v1.AddPagerDutyIntegrationRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.AddPagerDutyIntegrationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddPagerDutyIntegrationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deletePagerDutyIntegration(ai.chalk.protos.chalk.server.v1.DeletePagerDutyIntegrationRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.DeletePagerDutyIntegrationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletePagerDutyIntegrationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setDefaultPagerDutyIntegration(ai.chalk.protos.chalk.server.v1.SetDefaultPagerDutyIntegrationRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.SetDefaultPagerDutyIntegrationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetDefaultPagerDutyIntegrationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePagerDutyIntegration(ai.chalk.protos.chalk.server.v1.UpdatePagerDutyIntegrationRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.UpdatePagerDutyIntegrationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatePagerDutyIntegrationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllPagerDutyIntegrations(ai.chalk.protos.chalk.server.v1.GetAllPagerDutyIntegrationsRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetAllPagerDutyIntegrationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllPagerDutyIntegrationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPagerDutyIntegration(ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPagerDutyIntegrationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service MonitoringService.
   */
  public static final class MonitoringServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MonitoringServiceBlockingStub> {
    private MonitoringServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MonitoringServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MonitoringServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.TestPagerDutyIntegrationResponse testPagerDutyIntegration(ai.chalk.protos.chalk.server.v1.TestPagerDutyIntegrationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTestPagerDutyIntegrationMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.AddPagerDutyIntegrationResponse addPagerDutyIntegration(ai.chalk.protos.chalk.server.v1.AddPagerDutyIntegrationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddPagerDutyIntegrationMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.DeletePagerDutyIntegrationResponse deletePagerDutyIntegration(ai.chalk.protos.chalk.server.v1.DeletePagerDutyIntegrationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePagerDutyIntegrationMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.SetDefaultPagerDutyIntegrationResponse setDefaultPagerDutyIntegration(ai.chalk.protos.chalk.server.v1.SetDefaultPagerDutyIntegrationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetDefaultPagerDutyIntegrationMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.UpdatePagerDutyIntegrationResponse updatePagerDutyIntegration(ai.chalk.protos.chalk.server.v1.UpdatePagerDutyIntegrationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePagerDutyIntegrationMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.GetAllPagerDutyIntegrationsResponse getAllPagerDutyIntegrations(ai.chalk.protos.chalk.server.v1.GetAllPagerDutyIntegrationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllPagerDutyIntegrationsMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationResponse getPagerDutyIntegration(ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPagerDutyIntegrationMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MonitoringService.
   */
  public static final class MonitoringServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<MonitoringServiceFutureStub> {
    private MonitoringServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MonitoringServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MonitoringServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.TestPagerDutyIntegrationResponse> testPagerDutyIntegration(
        ai.chalk.protos.chalk.server.v1.TestPagerDutyIntegrationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTestPagerDutyIntegrationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.AddPagerDutyIntegrationResponse> addPagerDutyIntegration(
        ai.chalk.protos.chalk.server.v1.AddPagerDutyIntegrationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddPagerDutyIntegrationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.DeletePagerDutyIntegrationResponse> deletePagerDutyIntegration(
        ai.chalk.protos.chalk.server.v1.DeletePagerDutyIntegrationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletePagerDutyIntegrationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.SetDefaultPagerDutyIntegrationResponse> setDefaultPagerDutyIntegration(
        ai.chalk.protos.chalk.server.v1.SetDefaultPagerDutyIntegrationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetDefaultPagerDutyIntegrationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.UpdatePagerDutyIntegrationResponse> updatePagerDutyIntegration(
        ai.chalk.protos.chalk.server.v1.UpdatePagerDutyIntegrationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdatePagerDutyIntegrationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.GetAllPagerDutyIntegrationsResponse> getAllPagerDutyIntegrations(
        ai.chalk.protos.chalk.server.v1.GetAllPagerDutyIntegrationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllPagerDutyIntegrationsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationResponse> getPagerDutyIntegration(
        ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPagerDutyIntegrationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TEST_PAGER_DUTY_INTEGRATION = 0;
  private static final int METHODID_ADD_PAGER_DUTY_INTEGRATION = 1;
  private static final int METHODID_DELETE_PAGER_DUTY_INTEGRATION = 2;
  private static final int METHODID_SET_DEFAULT_PAGER_DUTY_INTEGRATION = 3;
  private static final int METHODID_UPDATE_PAGER_DUTY_INTEGRATION = 4;
  private static final int METHODID_GET_ALL_PAGER_DUTY_INTEGRATIONS = 5;
  private static final int METHODID_GET_PAGER_DUTY_INTEGRATION = 6;

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
        case METHODID_TEST_PAGER_DUTY_INTEGRATION:
          serviceImpl.testPagerDutyIntegration((ai.chalk.protos.chalk.server.v1.TestPagerDutyIntegrationRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.TestPagerDutyIntegrationResponse>) responseObserver);
          break;
        case METHODID_ADD_PAGER_DUTY_INTEGRATION:
          serviceImpl.addPagerDutyIntegration((ai.chalk.protos.chalk.server.v1.AddPagerDutyIntegrationRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.AddPagerDutyIntegrationResponse>) responseObserver);
          break;
        case METHODID_DELETE_PAGER_DUTY_INTEGRATION:
          serviceImpl.deletePagerDutyIntegration((ai.chalk.protos.chalk.server.v1.DeletePagerDutyIntegrationRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.DeletePagerDutyIntegrationResponse>) responseObserver);
          break;
        case METHODID_SET_DEFAULT_PAGER_DUTY_INTEGRATION:
          serviceImpl.setDefaultPagerDutyIntegration((ai.chalk.protos.chalk.server.v1.SetDefaultPagerDutyIntegrationRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.SetDefaultPagerDutyIntegrationResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PAGER_DUTY_INTEGRATION:
          serviceImpl.updatePagerDutyIntegration((ai.chalk.protos.chalk.server.v1.UpdatePagerDutyIntegrationRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.UpdatePagerDutyIntegrationResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_PAGER_DUTY_INTEGRATIONS:
          serviceImpl.getAllPagerDutyIntegrations((ai.chalk.protos.chalk.server.v1.GetAllPagerDutyIntegrationsRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetAllPagerDutyIntegrationsResponse>) responseObserver);
          break;
        case METHODID_GET_PAGER_DUTY_INTEGRATION:
          serviceImpl.getPagerDutyIntegration((ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationResponse>) responseObserver);
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
          getTestPagerDutyIntegrationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.TestPagerDutyIntegrationRequest,
              ai.chalk.protos.chalk.server.v1.TestPagerDutyIntegrationResponse>(
                service, METHODID_TEST_PAGER_DUTY_INTEGRATION)))
        .addMethod(
          getAddPagerDutyIntegrationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.AddPagerDutyIntegrationRequest,
              ai.chalk.protos.chalk.server.v1.AddPagerDutyIntegrationResponse>(
                service, METHODID_ADD_PAGER_DUTY_INTEGRATION)))
        .addMethod(
          getDeletePagerDutyIntegrationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.DeletePagerDutyIntegrationRequest,
              ai.chalk.protos.chalk.server.v1.DeletePagerDutyIntegrationResponse>(
                service, METHODID_DELETE_PAGER_DUTY_INTEGRATION)))
        .addMethod(
          getSetDefaultPagerDutyIntegrationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.SetDefaultPagerDutyIntegrationRequest,
              ai.chalk.protos.chalk.server.v1.SetDefaultPagerDutyIntegrationResponse>(
                service, METHODID_SET_DEFAULT_PAGER_DUTY_INTEGRATION)))
        .addMethod(
          getUpdatePagerDutyIntegrationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.UpdatePagerDutyIntegrationRequest,
              ai.chalk.protos.chalk.server.v1.UpdatePagerDutyIntegrationResponse>(
                service, METHODID_UPDATE_PAGER_DUTY_INTEGRATION)))
        .addMethod(
          getGetAllPagerDutyIntegrationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.GetAllPagerDutyIntegrationsRequest,
              ai.chalk.protos.chalk.server.v1.GetAllPagerDutyIntegrationsResponse>(
                service, METHODID_GET_ALL_PAGER_DUTY_INTEGRATIONS)))
        .addMethod(
          getGetPagerDutyIntegrationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationRequest,
              ai.chalk.protos.chalk.server.v1.GetPagerDutyIntegrationResponse>(
                service, METHODID_GET_PAGER_DUTY_INTEGRATION)))
        .build();
  }

  private static abstract class MonitoringServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MonitoringServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ai.chalk.protos.chalk.server.v1.MonitoringProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MonitoringService");
    }
  }

  private static final class MonitoringServiceFileDescriptorSupplier
      extends MonitoringServiceBaseDescriptorSupplier {
    MonitoringServiceFileDescriptorSupplier() {}
  }

  private static final class MonitoringServiceMethodDescriptorSupplier
      extends MonitoringServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    MonitoringServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (MonitoringServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MonitoringServiceFileDescriptorSupplier())
              .addMethod(getTestPagerDutyIntegrationMethod())
              .addMethod(getAddPagerDutyIntegrationMethod())
              .addMethod(getDeletePagerDutyIntegrationMethod())
              .addMethod(getSetDefaultPagerDutyIntegrationMethod())
              .addMethod(getUpdatePagerDutyIntegrationMethod())
              .addMethod(getGetAllPagerDutyIntegrationsMethod())
              .addMethod(getGetPagerDutyIntegrationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
