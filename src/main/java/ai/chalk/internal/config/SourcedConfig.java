package ai.chalk.internal.config;

import java.util.Collections;
import java.util.Map;

public class SourcedConfig {
    private final String source;
    private final String value;

    public SourcedConfig(String source, String value) {
        this.source = source;
        this.value = value;
    }

    public static SourcedConfig fromEnvVar(String envVarName) {
        return new SourcedConfig(String.format("environment variable '%s'", envVarName), System.getenv(envVarName));
    }

    public static SourcedConfig fromBuilder(String value) {
        return new SourcedConfig("ChalkClient builder argument", value);
    }

    public static SourcedConfig fromConfigFile(String value) {
        String pathStr = "of unknown path";
        try {
            pathStr = Loader.getConfigPath().toString();
        } catch (Exception e) {
            // ignore
        }

        return new SourcedConfig(String.format("config file %s", pathStr), value);
    }

    public static SourcedConfig firstNonEmpty(SourcedConfig... configs) {
        for (SourcedConfig config : configs) {
            if (config != null && config.getValue() != null && !config.getValue().isEmpty()) {
                return config;
            }
        }
        return new SourcedConfig("missing", "");
    }


    public static void displayConfigs(Map<String, SourcedConfig> configMap) {
        String configHeader = "Config";
        String sourceHeader = "Source";
        String valueHeader = "Value";
        int maxConfigNameWidth = configHeader.length();
        int maxSourceWidth = sourceHeader.length();
        int maxValueWidth = valueHeader.length();
        for (Map.Entry<String, SourcedConfig> entry : configMap.entrySet()) {
            maxConfigNameWidth = Math.max(maxConfigNameWidth, entry.getKey().length());
            maxSourceWidth = Math.max(maxSourceWidth, entry.getValue().getSource().length());
            maxValueWidth = Math.max(maxValueWidth, entry.getValue().getValue().length());
        }
        int buffer = 4;
        maxConfigNameWidth += buffer;
        maxSourceWidth += buffer;
        maxValueWidth += buffer;

        // Print separator
        System.err.println(String.join("", Collections.nCopies(maxConfigNameWidth + maxSourceWidth + maxValueWidth + 6, "-")));

        // Print column header
        System.err.printf(
                "%-" + maxConfigNameWidth + "s %-" + maxSourceWidth + "s %-" + maxValueWidth + "s%n",
                configHeader, sourceHeader, valueHeader
        );
        // Print separator
        System.err.println(String.join("", Collections.nCopies(maxConfigNameWidth + maxSourceWidth + maxValueWidth + 6, "-")));

        // Print each config
        for (Map.Entry<String, SourcedConfig> entry : configMap.entrySet()) {
            System.err.printf(
                    "%-" + maxConfigNameWidth + "s %-" + maxSourceWidth + "s %-" + maxValueWidth + "s%n",
                    entry.getKey(), entry.getValue().getSource(), entry.getValue().getValue()
            );
        }

        // Print separator
        System.err.println(String.join("", Collections.nCopies(maxConfigNameWidth + maxSourceWidth + maxValueWidth + 6, "-")));

    }

    public String getSource() {
        return source;
    }

    public String getValue() {
        return value;
    }
}



