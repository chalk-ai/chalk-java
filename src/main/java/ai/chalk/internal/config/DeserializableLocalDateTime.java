package ai.chalk.internal.config;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DeserializableLocalDateTime {
    private LocalDateTime underlying;

    public DeserializableLocalDateTime(String dateTimeStr) {
        DateTimeFormatter formatterWithZone = DateTimeFormatter.ISO_ZONED_DATE_TIME;
        DateTimeFormatter formatterWithoutZone = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

        try {
            ZonedDateTime zonedDateTime = ZonedDateTime.parse(dateTimeStr, formatterWithZone);
            this.underlying = zonedDateTime.toLocalDateTime();
        } catch (DateTimeParseException e) {
            this.underlying = LocalDateTime.parse(dateTimeStr, formatterWithoutZone);
        }
    }

    public DeserializableLocalDateTime(LocalDateTime dateTime) {
        this.underlying = dateTime;
    }

    public LocalDateTime getDateTime() {
        return underlying;
    }
}
