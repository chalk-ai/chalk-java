package ai.chalk.models;

import ai.chalk.exceptions.ServerError;
import lombok.Getter;

import javax.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/**
 * OnlineQueryMultiResult holds the results of a multi-query, i.e. several
 * independent online queries executed in parallel by a single request.
 *
 * <p> Closing this object closes every sub-result and releases all Arrow
 * memory associated with the request. Callers should use try-with-resources
 * and should <b>not</b> close the individual {@link OnlineQueryResult}s
 * returned by {@link #getResults()}.
 */
public class OnlineQueryMultiResult implements AutoCloseable {

    /**
     * results holds one {@link OnlineQueryResult} per sub-query, in the same
     * order the queries were passed in. Errors that pertain to a specific
     * sub-query are found on that sub-query's result, via
     * {@link OnlineQueryResult#getErrors()}.
     *
     * <p> Each result owns its own Arrow allocator, which is released when
     * this object is closed.
     *
     * <p> This list is 1:1 with the queries that were submitted, with one
     * exception: if the request failed before any sub-query was dispatched,
     * this list is empty and {@link #getGlobalErrors()} explains why.
     */
    @Getter
    private final List<OnlineQueryResult> results;

    /**
     * globalErrors holds the errors that the engine did not attach to a specific
     * sub-query's result. A resolver that fails while computing a sub-query is
     * reported on that sub-query's own result instead, so most errors are not
     * global.
     *
     * <p> An error here is not necessarily unrelated to a particular sub-query.
     * When a sub-query fails to <i>execute</i> at all -- it was rate limited, or
     * the engine hit a transport or internal error running it -- the engine
     * records the failure here and names the sub-query by its 1-based position in
     * the message text, e.g. {@code "... while executing query 2/3: ..."}. That
     * sub-query still occupies its slot in {@link #getResults()}, but the result
     * is empty and reports no errors of its own. So an empty result is not proof
     * of success: check this list too before concluding that every sub-query ran.
     */
    @Getter
    private final ServerError[] globalErrors;

    /**
     * traceId is the trace ID of the single underlying request, and is
     * therefore shared by every sub-query.
     */
    @Getter
    private final String traceId;

    private boolean closed = false;

    public OnlineQueryMultiResult(
            List<OnlineQueryResult> results,
            ServerError[] globalErrors,
            @Nullable String traceId
    ) {
        this.results = Collections.unmodifiableList(results);
        this.globalErrors = globalErrors;
        this.traceId = traceId;
    }

    /**
     * close releases the resources associated with every sub-result. It is
     * idempotent. If closing a sub-result fails, the remaining sub-results
     * are still closed and the first failure is thrown with the rest
     * attached as suppressed exceptions.
     */
    @Override
    public void close() {
        if (this.closed) {
            return;
        }
        this.closed = true;

        RuntimeException failure = null;
        for (OnlineQueryResult result : this.results) {
            if (result == null) {
                continue;
            }
            try {
                result.close();
            } catch (RuntimeException e) {
                if (failure == null) {
                    failure = e;
                } else {
                    failure.addSuppressed(e);
                }
            }
        }
        if (failure != null) {
            throw failure;
        }
    }
}
