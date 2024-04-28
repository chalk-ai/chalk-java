package ai.chalk.client;

public enum ServerType {
    ENGINE,
    SERVER;

    public String headerName() {
        return switch (this) {
            case ENGINE -> "engine";
            case SERVER -> "go-api";
        };
    }
}