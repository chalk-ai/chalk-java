package ai.chalk.internal.config;

import ai.chalk.internal.config.models.ProjectToken;
import ai.chalk.internal.config.models.ProjectTokens;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.ZonedDateTime;
import java.util.HashMap;

public class Loader {
    public static String loadProjectDirectory() throws Exception {
        Path currentDirectory = Paths.get(".").toAbsolutePath().normalize();
        String ogDirectory = currentDirectory.toString();
        boolean rootChecked = false;
        while (!currentDirectory.toString().equals("/") && !rootChecked) {
            for (String filename : new String[]{"chalk.yaml", "chalk.yml"}) {
                File file = new File(currentDirectory.resolve(filename).toString());
                if (file.exists()) {
                    return currentDirectory.toString();
                }
            }
            if (currentDirectory.toString().equals("/")) {
                rootChecked = true;
            } else {
                currentDirectory = currentDirectory.getParent();
            }
        }
        throw new Exception("Cannot determine project root directory: failed to find chalk.yml in the working directory '"
                + ogDirectory + "' or any of its parent directories");
    }

    public static Path getConfigPath() throws Exception {
        String configDir = System.getenv("XDG_CONFIG_HOME");
        if (configDir == null || configDir.isEmpty()) {
            configDir = System.getProperty("user.home");
            if (configDir == null || configDir.isEmpty()) {
                throw new Exception("error getting home directory");
            }
        }
        return Paths.get(configDir, ".chalk.yml");
    }

    public static ProjectToken getProjectToken(ProjectTokens config, String configPath, String projectRoot) throws Exception {
        if (config.getTokens() == null) {
            throw new Exception(String.format("'tokens' collection does not exist or is empty in the auth config file '%s' -- please try to 'chalk login' again", configPath));
        }

        ProjectToken returnToken = null;

        HashMap<String, ProjectToken> tokens = config.getTokens();
        if (tokens.containsKey(projectRoot)) {
            returnToken = tokens.get(projectRoot);
        }

        if (tokens.containsKey("default") && returnToken == null) {
            returnToken = tokens.get("default");
        }

        if (returnToken == null) {
            throw new Exception(String.format("project root '%s' does not exist as a key in the collection 'tokens' in the config file '%s', and the fallback key 'default' is also missing. Please try to 'chalk login' again", projectRoot, configPath));
        }

        return returnToken;
    }

    public static ProjectTokens loadAllTokens(Path path) throws IOException {
        byte[] data;
        try {
            data = Files.readAllBytes(path);
        } catch (IOException e) {
            throw new IOException(String.format("Error reading auth config file from path '%s': %s", path, e.getMessage()), e);
        }

        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        var timeModule = new JavaTimeModule();
        timeModule.addDeserializer(ZonedDateTime.class, new ChalkYamlDateTimeDeserializer());
        mapper.registerModule(timeModule);

        ProjectTokens config;
        try {
            config = mapper.readValue(new String(data), ProjectTokens.class);
        } catch (Exception e) {
            throw new IOException(String.format("Error parsing auth config file at path '%s'. Please make sure you have run 'chalk login' successfully. Error details: %s", path, e.getMessage()), e);
        }

        return config;
    }

    public static ProjectToken getChalkYamlConfig(String projectRoot) throws Exception {
        Path path;
        try {
            path = getConfigPath();
        } catch (Exception e) {
            throw new IOException("Error getting auth config path");
        }
        ProjectTokens config = loadAllTokens(path);
        return getProjectToken(config, path.toString(), projectRoot);
    }
}
