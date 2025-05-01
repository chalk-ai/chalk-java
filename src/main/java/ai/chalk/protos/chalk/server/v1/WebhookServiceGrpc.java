package ai.chalk.protos.chalk.server.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: chalk/server/v1/webhook.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class WebhookServiceGrpc {

  private WebhookServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "chalk.server.v1.WebhookService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.CreateWebhookRequest,
      ai.chalk.protos.chalk.server.v1.CreateWebhookResponse> getCreateWebhookMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateWebhook",
      requestType = ai.chalk.protos.chalk.server.v1.CreateWebhookRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.CreateWebhookResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.CreateWebhookRequest,
      ai.chalk.protos.chalk.server.v1.CreateWebhookResponse> getCreateWebhookMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.CreateWebhookRequest, ai.chalk.protos.chalk.server.v1.CreateWebhookResponse> getCreateWebhookMethod;
    if ((getCreateWebhookMethod = WebhookServiceGrpc.getCreateWebhookMethod) == null) {
      synchronized (WebhookServiceGrpc.class) {
        if ((getCreateWebhookMethod = WebhookServiceGrpc.getCreateWebhookMethod) == null) {
          WebhookServiceGrpc.getCreateWebhookMethod = getCreateWebhookMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.CreateWebhookRequest, ai.chalk.protos.chalk.server.v1.CreateWebhookResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateWebhook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.CreateWebhookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.CreateWebhookResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WebhookServiceMethodDescriptorSupplier("CreateWebhook"))
              .build();
        }
      }
    }
    return getCreateWebhookMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.UpdateWebhookRequest,
      ai.chalk.protos.chalk.server.v1.UpdateWebhookResponse> getUpdateWebhookMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateWebhook",
      requestType = ai.chalk.protos.chalk.server.v1.UpdateWebhookRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.UpdateWebhookResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.UpdateWebhookRequest,
      ai.chalk.protos.chalk.server.v1.UpdateWebhookResponse> getUpdateWebhookMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.UpdateWebhookRequest, ai.chalk.protos.chalk.server.v1.UpdateWebhookResponse> getUpdateWebhookMethod;
    if ((getUpdateWebhookMethod = WebhookServiceGrpc.getUpdateWebhookMethod) == null) {
      synchronized (WebhookServiceGrpc.class) {
        if ((getUpdateWebhookMethod = WebhookServiceGrpc.getUpdateWebhookMethod) == null) {
          WebhookServiceGrpc.getUpdateWebhookMethod = getUpdateWebhookMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.UpdateWebhookRequest, ai.chalk.protos.chalk.server.v1.UpdateWebhookResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateWebhook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.UpdateWebhookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.UpdateWebhookResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WebhookServiceMethodDescriptorSupplier("UpdateWebhook"))
              .build();
        }
      }
    }
    return getUpdateWebhookMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.DeleteWebhookRequest,
      ai.chalk.protos.chalk.server.v1.DeleteWebhookResponse> getDeleteWebhookMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteWebhook",
      requestType = ai.chalk.protos.chalk.server.v1.DeleteWebhookRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.DeleteWebhookResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.DeleteWebhookRequest,
      ai.chalk.protos.chalk.server.v1.DeleteWebhookResponse> getDeleteWebhookMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.DeleteWebhookRequest, ai.chalk.protos.chalk.server.v1.DeleteWebhookResponse> getDeleteWebhookMethod;
    if ((getDeleteWebhookMethod = WebhookServiceGrpc.getDeleteWebhookMethod) == null) {
      synchronized (WebhookServiceGrpc.class) {
        if ((getDeleteWebhookMethod = WebhookServiceGrpc.getDeleteWebhookMethod) == null) {
          WebhookServiceGrpc.getDeleteWebhookMethod = getDeleteWebhookMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.DeleteWebhookRequest, ai.chalk.protos.chalk.server.v1.DeleteWebhookResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteWebhook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.DeleteWebhookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.DeleteWebhookResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WebhookServiceMethodDescriptorSupplier("DeleteWebhook"))
              .build();
        }
      }
    }
    return getDeleteWebhookMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetWebhookRequest,
      ai.chalk.protos.chalk.server.v1.GetWebhookResponse> getGetWebhookMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWebhook",
      requestType = ai.chalk.protos.chalk.server.v1.GetWebhookRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.GetWebhookResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetWebhookRequest,
      ai.chalk.protos.chalk.server.v1.GetWebhookResponse> getGetWebhookMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetWebhookRequest, ai.chalk.protos.chalk.server.v1.GetWebhookResponse> getGetWebhookMethod;
    if ((getGetWebhookMethod = WebhookServiceGrpc.getGetWebhookMethod) == null) {
      synchronized (WebhookServiceGrpc.class) {
        if ((getGetWebhookMethod = WebhookServiceGrpc.getGetWebhookMethod) == null) {
          WebhookServiceGrpc.getGetWebhookMethod = getGetWebhookMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.GetWebhookRequest, ai.chalk.protos.chalk.server.v1.GetWebhookResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWebhook"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetWebhookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetWebhookResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WebhookServiceMethodDescriptorSupplier("GetWebhook"))
              .build();
        }
      }
    }
    return getGetWebhookMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.ListWebhooksRequest,
      ai.chalk.protos.chalk.server.v1.ListWebhooksResponse> getListWebhooksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListWebhooks",
      requestType = ai.chalk.protos.chalk.server.v1.ListWebhooksRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.ListWebhooksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.ListWebhooksRequest,
      ai.chalk.protos.chalk.server.v1.ListWebhooksResponse> getListWebhooksMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.ListWebhooksRequest, ai.chalk.protos.chalk.server.v1.ListWebhooksResponse> getListWebhooksMethod;
    if ((getListWebhooksMethod = WebhookServiceGrpc.getListWebhooksMethod) == null) {
      synchronized (WebhookServiceGrpc.class) {
        if ((getListWebhooksMethod = WebhookServiceGrpc.getListWebhooksMethod) == null) {
          WebhookServiceGrpc.getListWebhooksMethod = getListWebhooksMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.ListWebhooksRequest, ai.chalk.protos.chalk.server.v1.ListWebhooksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListWebhooks"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.ListWebhooksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.ListWebhooksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WebhookServiceMethodDescriptorSupplier("ListWebhooks"))
              .build();
        }
      }
    }
    return getListWebhooksMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WebhookServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WebhookServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WebhookServiceStub>() {
        @java.lang.Override
        public WebhookServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WebhookServiceStub(channel, callOptions);
        }
      };
    return WebhookServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WebhookServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WebhookServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WebhookServiceBlockingStub>() {
        @java.lang.Override
        public WebhookServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WebhookServiceBlockingStub(channel, callOptions);
        }
      };
    return WebhookServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WebhookServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WebhookServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WebhookServiceFutureStub>() {
        @java.lang.Override
        public WebhookServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WebhookServiceFutureStub(channel, callOptions);
        }
      };
    return WebhookServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createWebhook(ai.chalk.protos.chalk.server.v1.CreateWebhookRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.CreateWebhookResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateWebhookMethod(), responseObserver);
    }

    /**
     */
    default void updateWebhook(ai.chalk.protos.chalk.server.v1.UpdateWebhookRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.UpdateWebhookResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateWebhookMethod(), responseObserver);
    }

    /**
     */
    default void deleteWebhook(ai.chalk.protos.chalk.server.v1.DeleteWebhookRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.DeleteWebhookResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteWebhookMethod(), responseObserver);
    }

    /**
     */
    default void getWebhook(ai.chalk.protos.chalk.server.v1.GetWebhookRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetWebhookResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetWebhookMethod(), responseObserver);
    }

    /**
     */
    default void listWebhooks(ai.chalk.protos.chalk.server.v1.ListWebhooksRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.ListWebhooksResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListWebhooksMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service WebhookService.
   */
  public static abstract class WebhookServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return WebhookServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service WebhookService.
   */
  public static final class WebhookServiceStub
      extends io.grpc.stub.AbstractAsyncStub<WebhookServiceStub> {
    private WebhookServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WebhookServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WebhookServiceStub(channel, callOptions);
    }

    /**
     */
    public void createWebhook(ai.chalk.protos.chalk.server.v1.CreateWebhookRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.CreateWebhookResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateWebhookMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateWebhook(ai.chalk.protos.chalk.server.v1.UpdateWebhookRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.UpdateWebhookResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateWebhookMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteWebhook(ai.chalk.protos.chalk.server.v1.DeleteWebhookRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.DeleteWebhookResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteWebhookMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getWebhook(ai.chalk.protos.chalk.server.v1.GetWebhookRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetWebhookResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetWebhookMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listWebhooks(ai.chalk.protos.chalk.server.v1.ListWebhooksRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.ListWebhooksResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListWebhooksMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service WebhookService.
   */
  public static final class WebhookServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<WebhookServiceBlockingStub> {
    private WebhookServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WebhookServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WebhookServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.CreateWebhookResponse createWebhook(ai.chalk.protos.chalk.server.v1.CreateWebhookRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateWebhookMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.UpdateWebhookResponse updateWebhook(ai.chalk.protos.chalk.server.v1.UpdateWebhookRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateWebhookMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.DeleteWebhookResponse deleteWebhook(ai.chalk.protos.chalk.server.v1.DeleteWebhookRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteWebhookMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.GetWebhookResponse getWebhook(ai.chalk.protos.chalk.server.v1.GetWebhookRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetWebhookMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.ListWebhooksResponse listWebhooks(ai.chalk.protos.chalk.server.v1.ListWebhooksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListWebhooksMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service WebhookService.
   */
  public static final class WebhookServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<WebhookServiceFutureStub> {
    private WebhookServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WebhookServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WebhookServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.CreateWebhookResponse> createWebhook(
        ai.chalk.protos.chalk.server.v1.CreateWebhookRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateWebhookMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.UpdateWebhookResponse> updateWebhook(
        ai.chalk.protos.chalk.server.v1.UpdateWebhookRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateWebhookMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.DeleteWebhookResponse> deleteWebhook(
        ai.chalk.protos.chalk.server.v1.DeleteWebhookRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteWebhookMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.GetWebhookResponse> getWebhook(
        ai.chalk.protos.chalk.server.v1.GetWebhookRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetWebhookMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.ListWebhooksResponse> listWebhooks(
        ai.chalk.protos.chalk.server.v1.ListWebhooksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListWebhooksMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_WEBHOOK = 0;
  private static final int METHODID_UPDATE_WEBHOOK = 1;
  private static final int METHODID_DELETE_WEBHOOK = 2;
  private static final int METHODID_GET_WEBHOOK = 3;
  private static final int METHODID_LIST_WEBHOOKS = 4;

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
        case METHODID_CREATE_WEBHOOK:
          serviceImpl.createWebhook((ai.chalk.protos.chalk.server.v1.CreateWebhookRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.CreateWebhookResponse>) responseObserver);
          break;
        case METHODID_UPDATE_WEBHOOK:
          serviceImpl.updateWebhook((ai.chalk.protos.chalk.server.v1.UpdateWebhookRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.UpdateWebhookResponse>) responseObserver);
          break;
        case METHODID_DELETE_WEBHOOK:
          serviceImpl.deleteWebhook((ai.chalk.protos.chalk.server.v1.DeleteWebhookRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.DeleteWebhookResponse>) responseObserver);
          break;
        case METHODID_GET_WEBHOOK:
          serviceImpl.getWebhook((ai.chalk.protos.chalk.server.v1.GetWebhookRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetWebhookResponse>) responseObserver);
          break;
        case METHODID_LIST_WEBHOOKS:
          serviceImpl.listWebhooks((ai.chalk.protos.chalk.server.v1.ListWebhooksRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.ListWebhooksResponse>) responseObserver);
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
          getCreateWebhookMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.CreateWebhookRequest,
              ai.chalk.protos.chalk.server.v1.CreateWebhookResponse>(
                service, METHODID_CREATE_WEBHOOK)))
        .addMethod(
          getUpdateWebhookMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.UpdateWebhookRequest,
              ai.chalk.protos.chalk.server.v1.UpdateWebhookResponse>(
                service, METHODID_UPDATE_WEBHOOK)))
        .addMethod(
          getDeleteWebhookMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.DeleteWebhookRequest,
              ai.chalk.protos.chalk.server.v1.DeleteWebhookResponse>(
                service, METHODID_DELETE_WEBHOOK)))
        .addMethod(
          getGetWebhookMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.GetWebhookRequest,
              ai.chalk.protos.chalk.server.v1.GetWebhookResponse>(
                service, METHODID_GET_WEBHOOK)))
        .addMethod(
          getListWebhooksMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.ListWebhooksRequest,
              ai.chalk.protos.chalk.server.v1.ListWebhooksResponse>(
                service, METHODID_LIST_WEBHOOKS)))
        .build();
  }

  private static abstract class WebhookServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WebhookServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ai.chalk.protos.chalk.server.v1.WebhookProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WebhookService");
    }
  }

  private static final class WebhookServiceFileDescriptorSupplier
      extends WebhookServiceBaseDescriptorSupplier {
    WebhookServiceFileDescriptorSupplier() {}
  }

  private static final class WebhookServiceMethodDescriptorSupplier
      extends WebhookServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    WebhookServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (WebhookServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WebhookServiceFileDescriptorSupplier())
              .addMethod(getCreateWebhookMethod())
              .addMethod(getUpdateWebhookMethod())
              .addMethod(getDeleteWebhookMethod())
              .addMethod(getGetWebhookMethod())
              .addMethod(getListWebhooksMethod())
              .build();
        }
      }
    }
    return result;
  }
}
