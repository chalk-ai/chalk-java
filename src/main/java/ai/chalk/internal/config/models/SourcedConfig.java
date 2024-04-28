package ai.chalk.internal.config.models;

import ai.chalk.internal.config.Loader;
import lombok.Getter;

import java.util.Collections;
import java.util.Map;

@Getter
public record SourcedConfig(String source, String value) {
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
            if (config != null && config.value() != null && !config.value().isEmpty()) {
                return config;
            }
        }
        return new SourcedConfig("missing", "");
    }


    public static String getConfigTableStr(Map<String, SourcedConfig> configMap) {
        StringBuilder result = new StringBuilder();

        String configHeader = "Config";
        String sourceHeader = "Source";
        String valueHeader = "Value";
        int maxConfigNameWidth = configHeader.length();
        int maxSourceWidth = sourceHeader.length();
        int maxValueWidth = valueHeader.length();
        for (Map.Entry<String, SourcedConfig> entry : configMap.entrySet()) {
            maxConfigNameWidth = Math.max(maxConfigNameWidth, entry.getKey().length());
            maxSourceWidth = Math.max(maxSourceWidth, entry.getValue().source().length());
            maxValueWidth = Math.max(maxValueWidth, entry.getValue().value().length());
        }
        int buffer = 4;
        maxConfigNameWidth += buffer;
        maxSourceWidth += buffer;
        maxValueWidth += buffer;

        // Print separator
        result.append(String.join("", Collections.nCopies(maxConfigNameWidth + maxSourceWidth + maxValueWidth + 6, "-")));
        result.append("\n");

        // Print column header
        result.append(String.format(
                "%-" + maxConfigNameWidth + "s %-" + maxValueWidth + "s %-" + maxSourceWidth + "s%n",
                configHeader, valueHeader, sourceHeader
        ));
        // Print separator
        result.append(String.join("", Collections.nCopies(maxConfigNameWidth + maxSourceWidth + maxValueWidth + 6, "-")));
        result.append("\n");

        // Print each config
        for (Map.Entry<String, SourcedConfig> entry : configMap.entrySet()) {
            result.append(String.format(
                    "%-" + maxConfigNameWidth + "s %-" + maxValueWidth + "s %-" + maxSourceWidth + "s%n",
                    entry.getKey(), entry.getValue().value(), entry.getValue().source()
            ));
        }

        // Print separator
        result.append(String.join("", Collections.nCopies(maxConfigNameWidth + maxSourceWidth + maxValueWidth + 6, "-")));
        result.append("\n");

        return result.toString();
    }

}



