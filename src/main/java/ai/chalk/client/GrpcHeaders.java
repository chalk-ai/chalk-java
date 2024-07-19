package ai.chalk.client;


import io.grpc.Metadata;

public class GrpcHeaders {
    static final Metadata.Key<String> SERVER_TYPE_KEY = Metadata.Key.of(
            "x-chalk-server", Metadata.ASCII_STRING_MARSHALLER
    );

    static final Metadata.Key<String> ENVIRONMENT_ID_KEY = Metadata.Key.of(
            "x-chalk-env-id", Metadata.ASCII_STRING_MARSHALLER
    );

    static final Metadata.Key<String> AUTHORIZATION_KEY = Metadata.Key.of(
            "Authorization", Metadata.ASCII_STRING_MARSHALLER
    );

    static final Metadata.Key<String> DEPLOYMENT_TYPE = Metadata.Key.of(
            "x-chalk-deployment-type", Metadata.ASCII_STRING_MARSHALLER
    );
    static final Metadata.Key<String> DEPLOYMENT_TAG = Metadata.Key.of(
            "x-chalk-deployment-tag", Metadata.ASCII_STRING_MARSHALLER
    );
}
