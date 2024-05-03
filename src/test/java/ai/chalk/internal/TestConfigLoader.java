package ai.chalk.internal;

import ai.chalk.internal.config.Loader;
import ai.chalk.internal.config.models.ProjectTokens;
import ai.chalk.internal.request.RequestHandler;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import static ai.chalk.internal.config.Loader.getProjectToken;


public class TestConfigLoader {

    public Path writeTempYAMLFile(String content) throws Exception {
        Path tempYamlFile = Files.createTempFile(".chalk", ".yml");
        Files.writeString(tempYamlFile, content);
        System.out.println("Temporary YAML file created at: " + tempYamlFile);
        return tempYamlFile;
    }

    @Test
    public void TestLoadAllTokens() throws Exception {
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
        var tempFile = writeTempYAMLFile(yamlContent);
        ProjectTokens config = Loader.loadAllTokens(tempFile);
        var token = getProjectToken(config, tempFile.toString(), "/Users/papan/dev/my_project");
        assert token.getClientId().equals("client-my-project");
        assert token.getClientSecret().equals("secret-my-project");
        assert token.getApiServer().equals("https://api.chalk.ai");
        assert token.getActiveEnvironment().equals("myprojectenvid");
        assert token.getValidUntil().equals(ZonedDateTime.of(LocalDateTime.of(2025, 5, 2, 17, 32, 46, 165_000_000), ZoneId.of("UTC")));

        var defaultToken = getProjectToken(config, tempFile.toString(), "/Users/papan/dev/project_that_doesnt_exist");
        assert defaultToken.getClientId().equals("client-default");
        assert defaultToken.getClientSecret().equals("secret-default");
        assert defaultToken.getActiveEnvironment().equals("defaultenvid");
        assert defaultToken.getValidUntil().equals(ZonedDateTime.of(LocalDateTime.of(2024, 9, 11, 15, 7, 50, 812_000_000), ZoneId.of("UTC")));
    }

    @Test
    public void TestParseAllValidUntilVariations() throws Exception {
        String yamlContent = """
            tokens:
              unzoned:
                name: bogus
                clientId: bogus
                clientSecret: bogus
                validUntil: 2025-03-06T19:38:04.372277
                apiServer: bogus
                activeEnvironment: bogus
              zoned:
                name: bogus
                clientId: bogus
                clientSecret: bogus
                validUntil: 2025-03-06 10:38:04.372277029 +0000 UTC
                apiServer: bogus
                activeEnvironment: bogus
            """;

        var tempFile = writeTempYAMLFile(yamlContent);
        ProjectTokens config = Loader.loadAllTokens(tempFile);
        var unzonedToken = getProjectToken(config, tempFile.toString(), "unzoned");
        assert unzonedToken.getValidUntil().equals(ZonedDateTime.of(LocalDateTime.of(2025, 3, 6, 19, 38, 4, 372_277_000), ZoneId.of("UTC")));

        var zonedToken = getProjectToken(config, tempFile.toString(), "zoned");
        assert zonedToken.getValidUntil().equals(ZonedDateTime.of(LocalDateTime.of(2025, 3, 6, 10, 38, 4, 372_277_029), ZoneId.of("UTC")));
    }

    @Test
    public void TestParseJWT() throws Exception {
        String content = """
            tokens:
              default:
                name: bogus
                clientId: bogus
                clientSecret: bogus
                validUntil: 2025-03-06 10:38:04.372277029 +0000 UTC
                apiServer: bogus
                activeEnvironment: bogus
                jwt:
                    value: bogus
                    validUntil: 2024-04-30T05:16:28.750539Z
            """;

        var tempFile = writeTempYAMLFile(content);
        ProjectTokens config = Loader.loadAllTokens(tempFile);
        var token = getProjectToken(config, tempFile.toString(), "/project_does_not_exist_use_default");
        assert token.getJwt().getValidUntil().equals(ZonedDateTime.of(LocalDateTime.of(2024, 4, 30, 5, 16, 28, 750_539_000), ZoneId.of("UTC")));
    }
}

