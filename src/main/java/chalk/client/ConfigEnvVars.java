package chalk.client;

public class ConfigEnvVars {
    /**
     * Specifies the URL that all requests from ChalkClient will be sent to.
     */
    public static String apiServerKey = "CHALK_API_SERVER";

    /**
     * Used for authentication (obtaining an access token).
     */
    public static String clientIdKey = "CHALK_CLIENT_ID";

    /**
     * Used for authentication (obtaining an access token).
     */
    public static String clientSecretKey = "CHALK_CLIENT_SECRET";

    /**
     * This is the identifier that distinguishes between different
     * environments in your Chalk project.
     */
    public static String environmentIdKey = "CHALK_ACTIVE_ENVIRONMENT";
}
