package ai.chalk.protos.chalk.server.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: chalk/server/v1/team.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TeamServiceGrpc {

  private TeamServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "chalk.server.v1.TeamService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetEnvRequest,
      ai.chalk.protos.chalk.server.v1.GetEnvResponse> getGetEnvMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEnv",
      requestType = ai.chalk.protos.chalk.server.v1.GetEnvRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.GetEnvResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetEnvRequest,
      ai.chalk.protos.chalk.server.v1.GetEnvResponse> getGetEnvMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetEnvRequest, ai.chalk.protos.chalk.server.v1.GetEnvResponse> getGetEnvMethod;
    if ((getGetEnvMethod = TeamServiceGrpc.getGetEnvMethod) == null) {
      synchronized (TeamServiceGrpc.class) {
        if ((getGetEnvMethod = TeamServiceGrpc.getGetEnvMethod) == null) {
          TeamServiceGrpc.getGetEnvMethod = getGetEnvMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.GetEnvRequest, ai.chalk.protos.chalk.server.v1.GetEnvResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEnv"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetEnvRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetEnvResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TeamServiceMethodDescriptorSupplier("GetEnv"))
              .build();
        }
      }
    }
    return getGetEnvMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetEnvironmentsRequest,
      ai.chalk.protos.chalk.server.v1.GetEnvironmentsResponse> getGetEnvironmentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEnvironments",
      requestType = ai.chalk.protos.chalk.server.v1.GetEnvironmentsRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.GetEnvironmentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetEnvironmentsRequest,
      ai.chalk.protos.chalk.server.v1.GetEnvironmentsResponse> getGetEnvironmentsMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetEnvironmentsRequest, ai.chalk.protos.chalk.server.v1.GetEnvironmentsResponse> getGetEnvironmentsMethod;
    if ((getGetEnvironmentsMethod = TeamServiceGrpc.getGetEnvironmentsMethod) == null) {
      synchronized (TeamServiceGrpc.class) {
        if ((getGetEnvironmentsMethod = TeamServiceGrpc.getGetEnvironmentsMethod) == null) {
          TeamServiceGrpc.getGetEnvironmentsMethod = getGetEnvironmentsMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.GetEnvironmentsRequest, ai.chalk.protos.chalk.server.v1.GetEnvironmentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEnvironments"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetEnvironmentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetEnvironmentsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TeamServiceMethodDescriptorSupplier("GetEnvironments"))
              .build();
        }
      }
    }
    return getGetEnvironmentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetAgentRequest,
      ai.chalk.protos.chalk.server.v1.GetAgentResponse> getGetAgentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAgent",
      requestType = ai.chalk.protos.chalk.server.v1.GetAgentRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.GetAgentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetAgentRequest,
      ai.chalk.protos.chalk.server.v1.GetAgentResponse> getGetAgentMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetAgentRequest, ai.chalk.protos.chalk.server.v1.GetAgentResponse> getGetAgentMethod;
    if ((getGetAgentMethod = TeamServiceGrpc.getGetAgentMethod) == null) {
      synchronized (TeamServiceGrpc.class) {
        if ((getGetAgentMethod = TeamServiceGrpc.getGetAgentMethod) == null) {
          TeamServiceGrpc.getGetAgentMethod = getGetAgentMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.GetAgentRequest, ai.chalk.protos.chalk.server.v1.GetAgentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAgent"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetAgentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetAgentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TeamServiceMethodDescriptorSupplier("GetAgent"))
              .build();
        }
      }
    }
    return getGetAgentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetDisplayAgentRequest,
      ai.chalk.protos.chalk.server.v1.GetDisplayAgentResponse> getGetDisplayAgentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDisplayAgent",
      requestType = ai.chalk.protos.chalk.server.v1.GetDisplayAgentRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.GetDisplayAgentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetDisplayAgentRequest,
      ai.chalk.protos.chalk.server.v1.GetDisplayAgentResponse> getGetDisplayAgentMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetDisplayAgentRequest, ai.chalk.protos.chalk.server.v1.GetDisplayAgentResponse> getGetDisplayAgentMethod;
    if ((getGetDisplayAgentMethod = TeamServiceGrpc.getGetDisplayAgentMethod) == null) {
      synchronized (TeamServiceGrpc.class) {
        if ((getGetDisplayAgentMethod = TeamServiceGrpc.getGetDisplayAgentMethod) == null) {
          TeamServiceGrpc.getGetDisplayAgentMethod = getGetDisplayAgentMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.GetDisplayAgentRequest, ai.chalk.protos.chalk.server.v1.GetDisplayAgentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDisplayAgent"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetDisplayAgentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetDisplayAgentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TeamServiceMethodDescriptorSupplier("GetDisplayAgent"))
              .build();
        }
      }
    }
    return getGetDisplayAgentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetTeamRequest,
      ai.chalk.protos.chalk.server.v1.GetTeamResponse> getGetTeamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTeam",
      requestType = ai.chalk.protos.chalk.server.v1.GetTeamRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.GetTeamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetTeamRequest,
      ai.chalk.protos.chalk.server.v1.GetTeamResponse> getGetTeamMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetTeamRequest, ai.chalk.protos.chalk.server.v1.GetTeamResponse> getGetTeamMethod;
    if ((getGetTeamMethod = TeamServiceGrpc.getGetTeamMethod) == null) {
      synchronized (TeamServiceGrpc.class) {
        if ((getGetTeamMethod = TeamServiceGrpc.getGetTeamMethod) == null) {
          TeamServiceGrpc.getGetTeamMethod = getGetTeamMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.GetTeamRequest, ai.chalk.protos.chalk.server.v1.GetTeamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTeam"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetTeamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetTeamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TeamServiceMethodDescriptorSupplier("GetTeam"))
              .build();
        }
      }
    }
    return getGetTeamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.CreateTeamRequest,
      ai.chalk.protos.chalk.server.v1.CreateTeamResponse> getCreateTeamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTeam",
      requestType = ai.chalk.protos.chalk.server.v1.CreateTeamRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.CreateTeamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.CreateTeamRequest,
      ai.chalk.protos.chalk.server.v1.CreateTeamResponse> getCreateTeamMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.CreateTeamRequest, ai.chalk.protos.chalk.server.v1.CreateTeamResponse> getCreateTeamMethod;
    if ((getCreateTeamMethod = TeamServiceGrpc.getCreateTeamMethod) == null) {
      synchronized (TeamServiceGrpc.class) {
        if ((getCreateTeamMethod = TeamServiceGrpc.getCreateTeamMethod) == null) {
          TeamServiceGrpc.getCreateTeamMethod = getCreateTeamMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.CreateTeamRequest, ai.chalk.protos.chalk.server.v1.CreateTeamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTeam"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.CreateTeamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.CreateTeamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TeamServiceMethodDescriptorSupplier("CreateTeam"))
              .build();
        }
      }
    }
    return getCreateTeamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.CreateProjectRequest,
      ai.chalk.protos.chalk.server.v1.CreateProjectResponse> getCreateProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateProject",
      requestType = ai.chalk.protos.chalk.server.v1.CreateProjectRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.CreateProjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.CreateProjectRequest,
      ai.chalk.protos.chalk.server.v1.CreateProjectResponse> getCreateProjectMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.CreateProjectRequest, ai.chalk.protos.chalk.server.v1.CreateProjectResponse> getCreateProjectMethod;
    if ((getCreateProjectMethod = TeamServiceGrpc.getCreateProjectMethod) == null) {
      synchronized (TeamServiceGrpc.class) {
        if ((getCreateProjectMethod = TeamServiceGrpc.getCreateProjectMethod) == null) {
          TeamServiceGrpc.getCreateProjectMethod = getCreateProjectMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.CreateProjectRequest, ai.chalk.protos.chalk.server.v1.CreateProjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.CreateProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.CreateProjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TeamServiceMethodDescriptorSupplier("CreateProject"))
              .build();
        }
      }
    }
    return getCreateProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.CreateEnvironmentRequest,
      ai.chalk.protos.chalk.server.v1.CreateEnvironmentResponse> getCreateEnvironmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateEnvironment",
      requestType = ai.chalk.protos.chalk.server.v1.CreateEnvironmentRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.CreateEnvironmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.CreateEnvironmentRequest,
      ai.chalk.protos.chalk.server.v1.CreateEnvironmentResponse> getCreateEnvironmentMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.CreateEnvironmentRequest, ai.chalk.protos.chalk.server.v1.CreateEnvironmentResponse> getCreateEnvironmentMethod;
    if ((getCreateEnvironmentMethod = TeamServiceGrpc.getCreateEnvironmentMethod) == null) {
      synchronized (TeamServiceGrpc.class) {
        if ((getCreateEnvironmentMethod = TeamServiceGrpc.getCreateEnvironmentMethod) == null) {
          TeamServiceGrpc.getCreateEnvironmentMethod = getCreateEnvironmentMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.CreateEnvironmentRequest, ai.chalk.protos.chalk.server.v1.CreateEnvironmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateEnvironment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.CreateEnvironmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.CreateEnvironmentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TeamServiceMethodDescriptorSupplier("CreateEnvironment"))
              .build();
        }
      }
    }
    return getCreateEnvironmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetAvailablePermissionsRequest,
      ai.chalk.protos.chalk.server.v1.GetAvailablePermissionsResponse> getGetAvailablePermissionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAvailablePermissions",
      requestType = ai.chalk.protos.chalk.server.v1.GetAvailablePermissionsRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.GetAvailablePermissionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetAvailablePermissionsRequest,
      ai.chalk.protos.chalk.server.v1.GetAvailablePermissionsResponse> getGetAvailablePermissionsMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.GetAvailablePermissionsRequest, ai.chalk.protos.chalk.server.v1.GetAvailablePermissionsResponse> getGetAvailablePermissionsMethod;
    if ((getGetAvailablePermissionsMethod = TeamServiceGrpc.getGetAvailablePermissionsMethod) == null) {
      synchronized (TeamServiceGrpc.class) {
        if ((getGetAvailablePermissionsMethod = TeamServiceGrpc.getGetAvailablePermissionsMethod) == null) {
          TeamServiceGrpc.getGetAvailablePermissionsMethod = getGetAvailablePermissionsMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.GetAvailablePermissionsRequest, ai.chalk.protos.chalk.server.v1.GetAvailablePermissionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAvailablePermissions"))
              .setSafe(true)
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetAvailablePermissionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.GetAvailablePermissionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TeamServiceMethodDescriptorSupplier("GetAvailablePermissions"))
              .build();
        }
      }
    }
    return getGetAvailablePermissionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.CreateServiceTokenRequest,
      ai.chalk.protos.chalk.server.v1.CreateServiceTokenResponse> getCreateServiceTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateServiceToken",
      requestType = ai.chalk.protos.chalk.server.v1.CreateServiceTokenRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.CreateServiceTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.CreateServiceTokenRequest,
      ai.chalk.protos.chalk.server.v1.CreateServiceTokenResponse> getCreateServiceTokenMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.CreateServiceTokenRequest, ai.chalk.protos.chalk.server.v1.CreateServiceTokenResponse> getCreateServiceTokenMethod;
    if ((getCreateServiceTokenMethod = TeamServiceGrpc.getCreateServiceTokenMethod) == null) {
      synchronized (TeamServiceGrpc.class) {
        if ((getCreateServiceTokenMethod = TeamServiceGrpc.getCreateServiceTokenMethod) == null) {
          TeamServiceGrpc.getCreateServiceTokenMethod = getCreateServiceTokenMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.CreateServiceTokenRequest, ai.chalk.protos.chalk.server.v1.CreateServiceTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateServiceToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.CreateServiceTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.CreateServiceTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TeamServiceMethodDescriptorSupplier("CreateServiceToken"))
              .build();
        }
      }
    }
    return getCreateServiceTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.DeleteServiceTokenRequest,
      ai.chalk.protos.chalk.server.v1.DeleteServiceTokenResponse> getDeleteServiceTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteServiceToken",
      requestType = ai.chalk.protos.chalk.server.v1.DeleteServiceTokenRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.DeleteServiceTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.DeleteServiceTokenRequest,
      ai.chalk.protos.chalk.server.v1.DeleteServiceTokenResponse> getDeleteServiceTokenMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.DeleteServiceTokenRequest, ai.chalk.protos.chalk.server.v1.DeleteServiceTokenResponse> getDeleteServiceTokenMethod;
    if ((getDeleteServiceTokenMethod = TeamServiceGrpc.getDeleteServiceTokenMethod) == null) {
      synchronized (TeamServiceGrpc.class) {
        if ((getDeleteServiceTokenMethod = TeamServiceGrpc.getDeleteServiceTokenMethod) == null) {
          TeamServiceGrpc.getDeleteServiceTokenMethod = getDeleteServiceTokenMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.DeleteServiceTokenRequest, ai.chalk.protos.chalk.server.v1.DeleteServiceTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteServiceToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.DeleteServiceTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.DeleteServiceTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TeamServiceMethodDescriptorSupplier("DeleteServiceToken"))
              .build();
        }
      }
    }
    return getDeleteServiceTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.ListServiceTokensRequest,
      ai.chalk.protos.chalk.server.v1.ListServiceTokensResponse> getListServiceTokensMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListServiceTokens",
      requestType = ai.chalk.protos.chalk.server.v1.ListServiceTokensRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.ListServiceTokensResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.ListServiceTokensRequest,
      ai.chalk.protos.chalk.server.v1.ListServiceTokensResponse> getListServiceTokensMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.ListServiceTokensRequest, ai.chalk.protos.chalk.server.v1.ListServiceTokensResponse> getListServiceTokensMethod;
    if ((getListServiceTokensMethod = TeamServiceGrpc.getListServiceTokensMethod) == null) {
      synchronized (TeamServiceGrpc.class) {
        if ((getListServiceTokensMethod = TeamServiceGrpc.getListServiceTokensMethod) == null) {
          TeamServiceGrpc.getListServiceTokensMethod = getListServiceTokensMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.ListServiceTokensRequest, ai.chalk.protos.chalk.server.v1.ListServiceTokensResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListServiceTokens"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.ListServiceTokensRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.ListServiceTokensResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TeamServiceMethodDescriptorSupplier("ListServiceTokens"))
              .build();
        }
      }
    }
    return getListServiceTokensMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.UpdateServiceTokenRequest,
      ai.chalk.protos.chalk.server.v1.UpdateServiceTokenResponse> getUpdateServiceTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateServiceToken",
      requestType = ai.chalk.protos.chalk.server.v1.UpdateServiceTokenRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.UpdateServiceTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.UpdateServiceTokenRequest,
      ai.chalk.protos.chalk.server.v1.UpdateServiceTokenResponse> getUpdateServiceTokenMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.UpdateServiceTokenRequest, ai.chalk.protos.chalk.server.v1.UpdateServiceTokenResponse> getUpdateServiceTokenMethod;
    if ((getUpdateServiceTokenMethod = TeamServiceGrpc.getUpdateServiceTokenMethod) == null) {
      synchronized (TeamServiceGrpc.class) {
        if ((getUpdateServiceTokenMethod = TeamServiceGrpc.getUpdateServiceTokenMethod) == null) {
          TeamServiceGrpc.getUpdateServiceTokenMethod = getUpdateServiceTokenMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.UpdateServiceTokenRequest, ai.chalk.protos.chalk.server.v1.UpdateServiceTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateServiceToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.UpdateServiceTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.UpdateServiceTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TeamServiceMethodDescriptorSupplier("UpdateServiceToken"))
              .build();
        }
      }
    }
    return getUpdateServiceTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.InviteTeamMemberRequest,
      ai.chalk.protos.chalk.server.v1.InviteTeamMemberResponse> getInviteTeamMemberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InviteTeamMember",
      requestType = ai.chalk.protos.chalk.server.v1.InviteTeamMemberRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.InviteTeamMemberResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.InviteTeamMemberRequest,
      ai.chalk.protos.chalk.server.v1.InviteTeamMemberResponse> getInviteTeamMemberMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.InviteTeamMemberRequest, ai.chalk.protos.chalk.server.v1.InviteTeamMemberResponse> getInviteTeamMemberMethod;
    if ((getInviteTeamMemberMethod = TeamServiceGrpc.getInviteTeamMemberMethod) == null) {
      synchronized (TeamServiceGrpc.class) {
        if ((getInviteTeamMemberMethod = TeamServiceGrpc.getInviteTeamMemberMethod) == null) {
          TeamServiceGrpc.getInviteTeamMemberMethod = getInviteTeamMemberMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.InviteTeamMemberRequest, ai.chalk.protos.chalk.server.v1.InviteTeamMemberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InviteTeamMember"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.InviteTeamMemberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.InviteTeamMemberResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TeamServiceMethodDescriptorSupplier("InviteTeamMember"))
              .build();
        }
      }
    }
    return getInviteTeamMemberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsRequest,
      ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsResponse> getUpsertFeaturePermissionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpsertFeaturePermissions",
      requestType = ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsRequest,
      ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsResponse> getUpsertFeaturePermissionsMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsRequest, ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsResponse> getUpsertFeaturePermissionsMethod;
    if ((getUpsertFeaturePermissionsMethod = TeamServiceGrpc.getUpsertFeaturePermissionsMethod) == null) {
      synchronized (TeamServiceGrpc.class) {
        if ((getUpsertFeaturePermissionsMethod = TeamServiceGrpc.getUpsertFeaturePermissionsMethod) == null) {
          TeamServiceGrpc.getUpsertFeaturePermissionsMethod = getUpsertFeaturePermissionsMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsRequest, ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpsertFeaturePermissions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TeamServiceMethodDescriptorSupplier("UpsertFeaturePermissions"))
              .build();
        }
      }
    }
    return getUpsertFeaturePermissionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.UpdateScimGroupSettingsRequest,
      ai.chalk.protos.chalk.server.v1.UpdateScimGroupSettingsResponse> getUpdateScimGroupSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateScimGroupSettings",
      requestType = ai.chalk.protos.chalk.server.v1.UpdateScimGroupSettingsRequest.class,
      responseType = ai.chalk.protos.chalk.server.v1.UpdateScimGroupSettingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.UpdateScimGroupSettingsRequest,
      ai.chalk.protos.chalk.server.v1.UpdateScimGroupSettingsResponse> getUpdateScimGroupSettingsMethod() {
    io.grpc.MethodDescriptor<ai.chalk.protos.chalk.server.v1.UpdateScimGroupSettingsRequest, ai.chalk.protos.chalk.server.v1.UpdateScimGroupSettingsResponse> getUpdateScimGroupSettingsMethod;
    if ((getUpdateScimGroupSettingsMethod = TeamServiceGrpc.getUpdateScimGroupSettingsMethod) == null) {
      synchronized (TeamServiceGrpc.class) {
        if ((getUpdateScimGroupSettingsMethod = TeamServiceGrpc.getUpdateScimGroupSettingsMethod) == null) {
          TeamServiceGrpc.getUpdateScimGroupSettingsMethod = getUpdateScimGroupSettingsMethod =
              io.grpc.MethodDescriptor.<ai.chalk.protos.chalk.server.v1.UpdateScimGroupSettingsRequest, ai.chalk.protos.chalk.server.v1.UpdateScimGroupSettingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateScimGroupSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.UpdateScimGroupSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.chalk.protos.chalk.server.v1.UpdateScimGroupSettingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TeamServiceMethodDescriptorSupplier("UpdateScimGroupSettings"))
              .build();
        }
      }
    }
    return getUpdateScimGroupSettingsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TeamServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TeamServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TeamServiceStub>() {
        @java.lang.Override
        public TeamServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TeamServiceStub(channel, callOptions);
        }
      };
    return TeamServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TeamServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TeamServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TeamServiceBlockingStub>() {
        @java.lang.Override
        public TeamServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TeamServiceBlockingStub(channel, callOptions);
        }
      };
    return TeamServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TeamServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TeamServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TeamServiceFutureStub>() {
        @java.lang.Override
        public TeamServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TeamServiceFutureStub(channel, callOptions);
        }
      };
    return TeamServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getEnv(ai.chalk.protos.chalk.server.v1.GetEnvRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetEnvResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEnvMethod(), responseObserver);
    }

    /**
     */
    default void getEnvironments(ai.chalk.protos.chalk.server.v1.GetEnvironmentsRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetEnvironmentsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEnvironmentsMethod(), responseObserver);
    }

    /**
     */
    default void getAgent(ai.chalk.protos.chalk.server.v1.GetAgentRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetAgentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAgentMethod(), responseObserver);
    }

    /**
     */
    default void getDisplayAgent(ai.chalk.protos.chalk.server.v1.GetDisplayAgentRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetDisplayAgentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDisplayAgentMethod(), responseObserver);
    }

    /**
     */
    default void getTeam(ai.chalk.protos.chalk.server.v1.GetTeamRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetTeamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTeamMethod(), responseObserver);
    }

    /**
     */
    default void createTeam(ai.chalk.protos.chalk.server.v1.CreateTeamRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.CreateTeamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTeamMethod(), responseObserver);
    }

    /**
     */
    default void createProject(ai.chalk.protos.chalk.server.v1.CreateProjectRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.CreateProjectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateProjectMethod(), responseObserver);
    }

    /**
     */
    default void createEnvironment(ai.chalk.protos.chalk.server.v1.CreateEnvironmentRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.CreateEnvironmentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateEnvironmentMethod(), responseObserver);
    }

    /**
     */
    default void getAvailablePermissions(ai.chalk.protos.chalk.server.v1.GetAvailablePermissionsRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetAvailablePermissionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAvailablePermissionsMethod(), responseObserver);
    }

    /**
     */
    default void createServiceToken(ai.chalk.protos.chalk.server.v1.CreateServiceTokenRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.CreateServiceTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateServiceTokenMethod(), responseObserver);
    }

    /**
     */
    default void deleteServiceToken(ai.chalk.protos.chalk.server.v1.DeleteServiceTokenRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.DeleteServiceTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteServiceTokenMethod(), responseObserver);
    }

    /**
     */
    default void listServiceTokens(ai.chalk.protos.chalk.server.v1.ListServiceTokensRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.ListServiceTokensResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListServiceTokensMethod(), responseObserver);
    }

    /**
     */
    default void updateServiceToken(ai.chalk.protos.chalk.server.v1.UpdateServiceTokenRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.UpdateServiceTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateServiceTokenMethod(), responseObserver);
    }

    /**
     */
    default void inviteTeamMember(ai.chalk.protos.chalk.server.v1.InviteTeamMemberRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.InviteTeamMemberResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInviteTeamMemberMethod(), responseObserver);
    }

    /**
     */
    default void upsertFeaturePermissions(ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpsertFeaturePermissionsMethod(), responseObserver);
    }

    /**
     */
    default void updateScimGroupSettings(ai.chalk.protos.chalk.server.v1.UpdateScimGroupSettingsRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.UpdateScimGroupSettingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateScimGroupSettingsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TeamService.
   */
  public static abstract class TeamServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TeamServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service TeamService.
   */
  public static final class TeamServiceStub
      extends io.grpc.stub.AbstractAsyncStub<TeamServiceStub> {
    private TeamServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TeamServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TeamServiceStub(channel, callOptions);
    }

    /**
     */
    public void getEnv(ai.chalk.protos.chalk.server.v1.GetEnvRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetEnvResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEnvMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEnvironments(ai.chalk.protos.chalk.server.v1.GetEnvironmentsRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetEnvironmentsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEnvironmentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAgent(ai.chalk.protos.chalk.server.v1.GetAgentRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetAgentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAgentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDisplayAgent(ai.chalk.protos.chalk.server.v1.GetDisplayAgentRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetDisplayAgentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDisplayAgentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTeam(ai.chalk.protos.chalk.server.v1.GetTeamRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetTeamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTeamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createTeam(ai.chalk.protos.chalk.server.v1.CreateTeamRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.CreateTeamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTeamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createProject(ai.chalk.protos.chalk.server.v1.CreateProjectRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.CreateProjectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createEnvironment(ai.chalk.protos.chalk.server.v1.CreateEnvironmentRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.CreateEnvironmentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateEnvironmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAvailablePermissions(ai.chalk.protos.chalk.server.v1.GetAvailablePermissionsRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetAvailablePermissionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAvailablePermissionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createServiceToken(ai.chalk.protos.chalk.server.v1.CreateServiceTokenRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.CreateServiceTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateServiceTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteServiceToken(ai.chalk.protos.chalk.server.v1.DeleteServiceTokenRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.DeleteServiceTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteServiceTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listServiceTokens(ai.chalk.protos.chalk.server.v1.ListServiceTokensRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.ListServiceTokensResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListServiceTokensMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateServiceToken(ai.chalk.protos.chalk.server.v1.UpdateServiceTokenRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.UpdateServiceTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateServiceTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void inviteTeamMember(ai.chalk.protos.chalk.server.v1.InviteTeamMemberRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.InviteTeamMemberResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInviteTeamMemberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void upsertFeaturePermissions(ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpsertFeaturePermissionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateScimGroupSettings(ai.chalk.protos.chalk.server.v1.UpdateScimGroupSettingsRequest request,
        io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.UpdateScimGroupSettingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateScimGroupSettingsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TeamService.
   */
  public static final class TeamServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TeamServiceBlockingStub> {
    private TeamServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TeamServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TeamServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.GetEnvResponse getEnv(ai.chalk.protos.chalk.server.v1.GetEnvRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEnvMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.GetEnvironmentsResponse getEnvironments(ai.chalk.protos.chalk.server.v1.GetEnvironmentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEnvironmentsMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.GetAgentResponse getAgent(ai.chalk.protos.chalk.server.v1.GetAgentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAgentMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.GetDisplayAgentResponse getDisplayAgent(ai.chalk.protos.chalk.server.v1.GetDisplayAgentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDisplayAgentMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.GetTeamResponse getTeam(ai.chalk.protos.chalk.server.v1.GetTeamRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTeamMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.CreateTeamResponse createTeam(ai.chalk.protos.chalk.server.v1.CreateTeamRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTeamMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.CreateProjectResponse createProject(ai.chalk.protos.chalk.server.v1.CreateProjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateProjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.CreateEnvironmentResponse createEnvironment(ai.chalk.protos.chalk.server.v1.CreateEnvironmentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateEnvironmentMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.GetAvailablePermissionsResponse getAvailablePermissions(ai.chalk.protos.chalk.server.v1.GetAvailablePermissionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAvailablePermissionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.CreateServiceTokenResponse createServiceToken(ai.chalk.protos.chalk.server.v1.CreateServiceTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateServiceTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.DeleteServiceTokenResponse deleteServiceToken(ai.chalk.protos.chalk.server.v1.DeleteServiceTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteServiceTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.ListServiceTokensResponse listServiceTokens(ai.chalk.protos.chalk.server.v1.ListServiceTokensRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListServiceTokensMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.UpdateServiceTokenResponse updateServiceToken(ai.chalk.protos.chalk.server.v1.UpdateServiceTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateServiceTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.InviteTeamMemberResponse inviteTeamMember(ai.chalk.protos.chalk.server.v1.InviteTeamMemberRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInviteTeamMemberMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsResponse upsertFeaturePermissions(ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpsertFeaturePermissionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.chalk.protos.chalk.server.v1.UpdateScimGroupSettingsResponse updateScimGroupSettings(ai.chalk.protos.chalk.server.v1.UpdateScimGroupSettingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateScimGroupSettingsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TeamService.
   */
  public static final class TeamServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<TeamServiceFutureStub> {
    private TeamServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TeamServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TeamServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.GetEnvResponse> getEnv(
        ai.chalk.protos.chalk.server.v1.GetEnvRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEnvMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.GetEnvironmentsResponse> getEnvironments(
        ai.chalk.protos.chalk.server.v1.GetEnvironmentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEnvironmentsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.GetAgentResponse> getAgent(
        ai.chalk.protos.chalk.server.v1.GetAgentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAgentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.GetDisplayAgentResponse> getDisplayAgent(
        ai.chalk.protos.chalk.server.v1.GetDisplayAgentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDisplayAgentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.GetTeamResponse> getTeam(
        ai.chalk.protos.chalk.server.v1.GetTeamRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTeamMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.CreateTeamResponse> createTeam(
        ai.chalk.protos.chalk.server.v1.CreateTeamRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTeamMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.CreateProjectResponse> createProject(
        ai.chalk.protos.chalk.server.v1.CreateProjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateProjectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.CreateEnvironmentResponse> createEnvironment(
        ai.chalk.protos.chalk.server.v1.CreateEnvironmentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateEnvironmentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.GetAvailablePermissionsResponse> getAvailablePermissions(
        ai.chalk.protos.chalk.server.v1.GetAvailablePermissionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAvailablePermissionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.CreateServiceTokenResponse> createServiceToken(
        ai.chalk.protos.chalk.server.v1.CreateServiceTokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateServiceTokenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.DeleteServiceTokenResponse> deleteServiceToken(
        ai.chalk.protos.chalk.server.v1.DeleteServiceTokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteServiceTokenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.ListServiceTokensResponse> listServiceTokens(
        ai.chalk.protos.chalk.server.v1.ListServiceTokensRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListServiceTokensMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.UpdateServiceTokenResponse> updateServiceToken(
        ai.chalk.protos.chalk.server.v1.UpdateServiceTokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateServiceTokenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.InviteTeamMemberResponse> inviteTeamMember(
        ai.chalk.protos.chalk.server.v1.InviteTeamMemberRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInviteTeamMemberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsResponse> upsertFeaturePermissions(
        ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpsertFeaturePermissionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.chalk.protos.chalk.server.v1.UpdateScimGroupSettingsResponse> updateScimGroupSettings(
        ai.chalk.protos.chalk.server.v1.UpdateScimGroupSettingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateScimGroupSettingsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ENV = 0;
  private static final int METHODID_GET_ENVIRONMENTS = 1;
  private static final int METHODID_GET_AGENT = 2;
  private static final int METHODID_GET_DISPLAY_AGENT = 3;
  private static final int METHODID_GET_TEAM = 4;
  private static final int METHODID_CREATE_TEAM = 5;
  private static final int METHODID_CREATE_PROJECT = 6;
  private static final int METHODID_CREATE_ENVIRONMENT = 7;
  private static final int METHODID_GET_AVAILABLE_PERMISSIONS = 8;
  private static final int METHODID_CREATE_SERVICE_TOKEN = 9;
  private static final int METHODID_DELETE_SERVICE_TOKEN = 10;
  private static final int METHODID_LIST_SERVICE_TOKENS = 11;
  private static final int METHODID_UPDATE_SERVICE_TOKEN = 12;
  private static final int METHODID_INVITE_TEAM_MEMBER = 13;
  private static final int METHODID_UPSERT_FEATURE_PERMISSIONS = 14;
  private static final int METHODID_UPDATE_SCIM_GROUP_SETTINGS = 15;

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
        case METHODID_GET_ENV:
          serviceImpl.getEnv((ai.chalk.protos.chalk.server.v1.GetEnvRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetEnvResponse>) responseObserver);
          break;
        case METHODID_GET_ENVIRONMENTS:
          serviceImpl.getEnvironments((ai.chalk.protos.chalk.server.v1.GetEnvironmentsRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetEnvironmentsResponse>) responseObserver);
          break;
        case METHODID_GET_AGENT:
          serviceImpl.getAgent((ai.chalk.protos.chalk.server.v1.GetAgentRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetAgentResponse>) responseObserver);
          break;
        case METHODID_GET_DISPLAY_AGENT:
          serviceImpl.getDisplayAgent((ai.chalk.protos.chalk.server.v1.GetDisplayAgentRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetDisplayAgentResponse>) responseObserver);
          break;
        case METHODID_GET_TEAM:
          serviceImpl.getTeam((ai.chalk.protos.chalk.server.v1.GetTeamRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetTeamResponse>) responseObserver);
          break;
        case METHODID_CREATE_TEAM:
          serviceImpl.createTeam((ai.chalk.protos.chalk.server.v1.CreateTeamRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.CreateTeamResponse>) responseObserver);
          break;
        case METHODID_CREATE_PROJECT:
          serviceImpl.createProject((ai.chalk.protos.chalk.server.v1.CreateProjectRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.CreateProjectResponse>) responseObserver);
          break;
        case METHODID_CREATE_ENVIRONMENT:
          serviceImpl.createEnvironment((ai.chalk.protos.chalk.server.v1.CreateEnvironmentRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.CreateEnvironmentResponse>) responseObserver);
          break;
        case METHODID_GET_AVAILABLE_PERMISSIONS:
          serviceImpl.getAvailablePermissions((ai.chalk.protos.chalk.server.v1.GetAvailablePermissionsRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.GetAvailablePermissionsResponse>) responseObserver);
          break;
        case METHODID_CREATE_SERVICE_TOKEN:
          serviceImpl.createServiceToken((ai.chalk.protos.chalk.server.v1.CreateServiceTokenRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.CreateServiceTokenResponse>) responseObserver);
          break;
        case METHODID_DELETE_SERVICE_TOKEN:
          serviceImpl.deleteServiceToken((ai.chalk.protos.chalk.server.v1.DeleteServiceTokenRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.DeleteServiceTokenResponse>) responseObserver);
          break;
        case METHODID_LIST_SERVICE_TOKENS:
          serviceImpl.listServiceTokens((ai.chalk.protos.chalk.server.v1.ListServiceTokensRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.ListServiceTokensResponse>) responseObserver);
          break;
        case METHODID_UPDATE_SERVICE_TOKEN:
          serviceImpl.updateServiceToken((ai.chalk.protos.chalk.server.v1.UpdateServiceTokenRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.UpdateServiceTokenResponse>) responseObserver);
          break;
        case METHODID_INVITE_TEAM_MEMBER:
          serviceImpl.inviteTeamMember((ai.chalk.protos.chalk.server.v1.InviteTeamMemberRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.InviteTeamMemberResponse>) responseObserver);
          break;
        case METHODID_UPSERT_FEATURE_PERMISSIONS:
          serviceImpl.upsertFeaturePermissions((ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_SCIM_GROUP_SETTINGS:
          serviceImpl.updateScimGroupSettings((ai.chalk.protos.chalk.server.v1.UpdateScimGroupSettingsRequest) request,
              (io.grpc.stub.StreamObserver<ai.chalk.protos.chalk.server.v1.UpdateScimGroupSettingsResponse>) responseObserver);
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
          getGetEnvMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.GetEnvRequest,
              ai.chalk.protos.chalk.server.v1.GetEnvResponse>(
                service, METHODID_GET_ENV)))
        .addMethod(
          getGetEnvironmentsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.GetEnvironmentsRequest,
              ai.chalk.protos.chalk.server.v1.GetEnvironmentsResponse>(
                service, METHODID_GET_ENVIRONMENTS)))
        .addMethod(
          getGetAgentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.GetAgentRequest,
              ai.chalk.protos.chalk.server.v1.GetAgentResponse>(
                service, METHODID_GET_AGENT)))
        .addMethod(
          getGetDisplayAgentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.GetDisplayAgentRequest,
              ai.chalk.protos.chalk.server.v1.GetDisplayAgentResponse>(
                service, METHODID_GET_DISPLAY_AGENT)))
        .addMethod(
          getGetTeamMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.GetTeamRequest,
              ai.chalk.protos.chalk.server.v1.GetTeamResponse>(
                service, METHODID_GET_TEAM)))
        .addMethod(
          getCreateTeamMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.CreateTeamRequest,
              ai.chalk.protos.chalk.server.v1.CreateTeamResponse>(
                service, METHODID_CREATE_TEAM)))
        .addMethod(
          getCreateProjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.CreateProjectRequest,
              ai.chalk.protos.chalk.server.v1.CreateProjectResponse>(
                service, METHODID_CREATE_PROJECT)))
        .addMethod(
          getCreateEnvironmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.CreateEnvironmentRequest,
              ai.chalk.protos.chalk.server.v1.CreateEnvironmentResponse>(
                service, METHODID_CREATE_ENVIRONMENT)))
        .addMethod(
          getGetAvailablePermissionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.GetAvailablePermissionsRequest,
              ai.chalk.protos.chalk.server.v1.GetAvailablePermissionsResponse>(
                service, METHODID_GET_AVAILABLE_PERMISSIONS)))
        .addMethod(
          getCreateServiceTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.CreateServiceTokenRequest,
              ai.chalk.protos.chalk.server.v1.CreateServiceTokenResponse>(
                service, METHODID_CREATE_SERVICE_TOKEN)))
        .addMethod(
          getDeleteServiceTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.DeleteServiceTokenRequest,
              ai.chalk.protos.chalk.server.v1.DeleteServiceTokenResponse>(
                service, METHODID_DELETE_SERVICE_TOKEN)))
        .addMethod(
          getListServiceTokensMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.ListServiceTokensRequest,
              ai.chalk.protos.chalk.server.v1.ListServiceTokensResponse>(
                service, METHODID_LIST_SERVICE_TOKENS)))
        .addMethod(
          getUpdateServiceTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.UpdateServiceTokenRequest,
              ai.chalk.protos.chalk.server.v1.UpdateServiceTokenResponse>(
                service, METHODID_UPDATE_SERVICE_TOKEN)))
        .addMethod(
          getInviteTeamMemberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.InviteTeamMemberRequest,
              ai.chalk.protos.chalk.server.v1.InviteTeamMemberResponse>(
                service, METHODID_INVITE_TEAM_MEMBER)))
        .addMethod(
          getUpsertFeaturePermissionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsRequest,
              ai.chalk.protos.chalk.server.v1.UpsertFeaturePermissionsResponse>(
                service, METHODID_UPSERT_FEATURE_PERMISSIONS)))
        .addMethod(
          getUpdateScimGroupSettingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.chalk.protos.chalk.server.v1.UpdateScimGroupSettingsRequest,
              ai.chalk.protos.chalk.server.v1.UpdateScimGroupSettingsResponse>(
                service, METHODID_UPDATE_SCIM_GROUP_SETTINGS)))
        .build();
  }

  private static abstract class TeamServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TeamServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ai.chalk.protos.chalk.server.v1.TeamProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TeamService");
    }
  }

  private static final class TeamServiceFileDescriptorSupplier
      extends TeamServiceBaseDescriptorSupplier {
    TeamServiceFileDescriptorSupplier() {}
  }

  private static final class TeamServiceMethodDescriptorSupplier
      extends TeamServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TeamServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (TeamServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TeamServiceFileDescriptorSupplier())
              .addMethod(getGetEnvMethod())
              .addMethod(getGetEnvironmentsMethod())
              .addMethod(getGetAgentMethod())
              .addMethod(getGetDisplayAgentMethod())
              .addMethod(getGetTeamMethod())
              .addMethod(getCreateTeamMethod())
              .addMethod(getCreateProjectMethod())
              .addMethod(getCreateEnvironmentMethod())
              .addMethod(getGetAvailablePermissionsMethod())
              .addMethod(getCreateServiceTokenMethod())
              .addMethod(getDeleteServiceTokenMethod())
              .addMethod(getListServiceTokensMethod())
              .addMethod(getUpdateServiceTokenMethod())
              .addMethod(getInviteTeamMemberMethod())
              .addMethod(getUpsertFeaturePermissionsMethod())
              .addMethod(getUpdateScimGroupSettingsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
