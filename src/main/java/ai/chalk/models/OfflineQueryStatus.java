package ai.chalk.models;

import ai.chalk.exceptions.ServerError;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * Completion and result URLs for an offline query. A finished job may have failed:
 * check errors before consuming urls. URLs are signed and short-lived; poll again
 * to obtain fresh URLs. Download files without attaching Chalk credentials.
 */
@Data
@NoArgsConstructor
public class OfflineQueryStatus {
    @JsonProperty("is_finished")
    private boolean finished;
    private int version;
    private List<String> urls = new ArrayList<>();
    @JsonSetter(nulls = Nulls.AS_EMPTY)
    private List<ServerError> errors = new ArrayList<>();
}
