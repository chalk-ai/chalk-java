package ai.chalk.models;

/**
 * Status of an aggregate backfill.
 */
public enum AggregateBackfillStatus {
    /** The backfill's jobs are being created. */
    INITIALIZING,
    /** The backfill's jobs could not be created. */
    INIT_FAILED,
    /** The backfill had no work to do. */
    SKIPPED,
    /** The backfill's jobs have been created and are waiting to run. */
    QUEUED,
    /** The backfill's jobs are running. */
    WORKING,
    /** Every job in the backfill finished successfully. */
    COMPLETED,
    /** At least one job in the backfill failed. */
    FAILED,
    /** The backfill was canceled before finishing. */
    CANCELED,
    /** The server reported a status this version of chalk-java does not recognize. */
    UNKNOWN
}
