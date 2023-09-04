package ai.chalk.internal.config.models;

import ai.chalk.internal.config.models.DeserializableLocalDateTime;

// JWT class
public class JWT {
    private String value;
    private DeserializableLocalDateTime validUntil;

    // getters and setters
    public String getValue() { return value; }
    public void setValue(String value) { this.value = value; }

    public DeserializableLocalDateTime getValidUntil() { return validUntil; }
    public void setValidUntil(DeserializableLocalDateTime validUntil) { this.validUntil = validUntil; }
}

