package ai.chalk.internal;

import ai.chalk.internal.config.Loader;
import ai.chalk.internal.config.models.ProjectTokens;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;

import static ai.chalk.internal.config.Loader.getProjectToken;


public class TestConfigLoader {

    public Path writeTempYAMLFile() throws Exception {
        String yamlContent = """
            tokens:
              /Users/papan/dev/my_project:
                name: my-project Token
                clientId: client-my-project
                clientSecret: secret-my-project
                validUntil: 2025-05-02T17:32:46.165000
                apiServer: https://api.chalk.ai
                activeEnvironment: myprojectenvid
              default:
                name: Default Token
                clientId: client-default
                clientSecret: secret-default
                validUntil: 2024-09-11T15:07:50.812000
                apiServer: http://api.chalk.ai
                activeEnvironment: defaultenvid
            """;
        Path tempYamlFile = Files.createTempFile(".chalk", ".yml");
        Files.writeString(tempYamlFile, yamlContent);
        System.out.println("Temporary YAML file created at: " + tempYamlFile);
        return tempYamlFile;
    }

    @Test
    public void TestLoadAllTokens() throws Exception {
        var tempFile = writeTempYAMLFile();
        ProjectTokens config = Loader.loadAllTokens(tempFile);
        var token = getProjectToken(config, tempFile.toString(), "/Users/papan/dev/my_project");
        assert token.getClientId().equals("client-my-project");
        assert token.getClientSecret().equals("secret-my-project");
        assert token.getApiServer().equals("https://api.chalk.ai");
        assert token.getActiveEnvironment().equals("myprojectenvid");
        assert token.getValidUntil().equals(LocalDateTime.of(2025, 5, 2, 17, 32, 46, 165_000_000));

        var defaultToken = getProjectToken(config, tempFile.toString(), "/Users/papan/dev/project_that_doesnt_exist");
        assert defaultToken.getClientId().equals("client-default");
        assert defaultToken.getClientSecret().equals("secret-default");
        assert defaultToken.getActiveEnvironment().equals("defaultenvid");
        assert defaultToken.getValidUntil().equals(LocalDateTime.of(2024, 9, 11, 15, 7, 50, 812_000_000));
    }
}

