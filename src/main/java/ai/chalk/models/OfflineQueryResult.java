package ai.chalk.models;

import ai.chalk.exceptions.ServerError;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/** Dataset metadata returned by submission. Check errors before using revisions. */
@Data
@NoArgsConstructor
public class OfflineQueryResult {
    @JsonProperty("is_finished")
    private boolean finished;
    private int version;
    private String environmentId;
    private String datasetId;
    private String datasetName;
    private List<Revision> revisions = new ArrayList<>();
    @JsonSetter(nulls = Nulls.AS_EMPTY)
    private List<ServerError> errors = new ArrayList<>();

    /** Use revisionId as the jobId when polling for completion and download URLs. */
    @Data
    @NoArgsConstructor
    public static class Revision {
        private String revisionId;
        private String environmentId;
        private String branch;
        /** Numeric QueryStatus value returned by the server. */
        private int status;
        private List<String> outputs = new ArrayList<>();
        private Integer numPartitions;
        private Integer numComputers;
        private Long numRows;
        private Long numBytes;
        private String dashboardUrl;
        @JsonSetter(nulls = Nulls.AS_EMPTY)
        private List<ServerError> errors = new ArrayList<>();
    }
}
