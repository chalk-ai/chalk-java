package ai.chalk.models;

import lombok.Builder;
import lombok.Value;

import java.time.Duration;

/** The job id is the revision id returned by {@link OfflineQueryResult}. */
@Value
@Builder(setterPrefix = "with")
public class GetOfflineQueryStatusParams {
    String jobId;
    String environmentId;
    String branch;
    Duration timeout;
}
