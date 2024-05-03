package ai.chalk.internal.config;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ChalkYamlDateTimeDeserializer extends JsonDeserializer<ZonedDateTime> {
    private static final DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.nnnnnnnnn Z z");
    private static final LocalDateTimeDeserializer defaultDeserializer = new LocalDateTimeDeserializer(DateTimeFormatter.ISO_LOCAL_DATE_TIME);

    @Override
    public ZonedDateTime deserialize(JsonParser p, DeserializationContext ctx) throws IOException {
        String dateString = p.getText().trim();
        try {
            var parsed = ZonedDateTime.parse(dateString, customFormatter);
            return parsed.withZoneSameInstant(ZoneId.of("UTC")); // Convert 'Etc/UTC' to 'UTC'
        } catch (DateTimeParseException e) {
            // Fallback to the default deserializer if custom parsing fails
            LocalDateTime localDtInUtc = defaultDeserializer.deserialize(p, ctx);
            return ZonedDateTime.of(localDtInUtc, ZoneId.of("UTC"));
        }
    }
}
