# chalk-flink-sink

A custom Apache Flink sink that writes feature values into Chalk by calling the
`upload_features` API directly from your Flink job — no Kafka topic or intermediate hop.

It is a thin, batching layer on top of the maintained [`ai.chalk:chalk-java`](https://central.sonatype.com/artifact/ai.chalk/chalk-java)
client: `chalk-java` owns credential/token exchange, gRPC channel + engine routing, auth headers,
and Arrow encoding; this module owns buffering, batching, retry, and the Flink lifecycle.

## Architecture

```
DataStream<IN>
     │  ChalkRowConverter<IN>: element ─▶ Map<feature_fqn, value>   (must include the primary key)
     ▼
Flink sink adapter                          ┌─ ChalkRichSinkFunction  (RichSinkFunction, Flink 1.x — default)
 (one per parallel subtask)                 └─ ChalkSink              (Sink2 API, Flink 1.15+/2.0)
     │
     ▼
ChalkFeatureUploader        buffer rows ─▶ flush on {batchSize │ interval │ checkpoint │ close}
 (Flink-free core)                 │
     │                             ▼  pivot to columnar Map<String,List<?>>, null-pad missing cells
     ▼
ai.chalk.client.ChalkClient.uploadFeatures(...)   ── auth · gRPC · Arrow (all handled here)
     │
     ▼
Chalk engine  ─▶  online store
```

The engine-facing logic (`ai.chalk.flink.core`) has **zero Flink imports**. The Flink API only
appears in the two tiny adapter classes, so moving between Flink versions touches one file.

### Delivery semantics — at-least-once

The buffer is flushed on every checkpoint barrier (`snapshotState` / `flush(endOfInput)`), so all
rows observed before a checkpoint are acknowledged by Chalk before that checkpoint completes. On
failure Flink restores the last checkpoint and replays; re-sends are safe because `upload_features`
is a **primary-key upsert** (idempotent). There is no Flink-managed operator state — the in-flight
buffer is transient and simply rebuilt from replayed records. Worst-case upload latency is bounded
by `min(flushInterval, checkpointInterval)`.

## Build

Requires JDK 17 (matches `chalk-java`). Produces a shaded uber-jar suitable for `flink run`.

```bash
# with a local Gradle:
gradle build          # -> build/libs/chalk-flink-sink-0.1.0.jar (shaded)
gradle test           # runs the Flink-free core unit tests (no network)

# or generate a wrapper once, then use it:
gradle wrapper --gradle-version 8.10.2
./gradlew build
```

Flink is a `compileOnly` dependency (Maven "provided"): it is compiled against `1.18.1` but **not**
bundled — the cluster supplies it at runtime. `chalk-java` (and its gRPC/protobuf/Arrow transitive
deps) **is** bundled into the shaded jar.

## Usage

```java
ChalkSinkConfig config = ChalkSinkConfig.builder()
        .clientId(System.getenv("CHALK_CLIENT_ID"))
        .clientSecret(System.getenv("CHALK_CLIENT_SECRET"))
        .environmentId(System.getenv("CHALK_ENVIRONMENT_ID")) // optional
        .batchSize(500)
        .flushInterval(Duration.ofSeconds(5))
        .build();

ChalkRowConverter<UserScoreEvent> converter = event -> Map.of(
        "user.id", event.userId,            // primary key — REQUIRED
        "user.fraud_score", event.fraudScore);

// Flink 1.x (default, most portable):
stream.addSink(new ChalkRichSinkFunction<>(config, converter)).name("chalk-upload-features");

// Flink 1.15+/2.0 (modern Sink2 API):
stream.sinkTo(new ChalkSink<>(config, converter)).name("chalk-upload-features");
```

See `ai.chalk.flink.examples.ChalkUploadFeaturesJob` for a complete, runnable job.

### The converter contract

Each element maps to `Map<feature_fqn, value>`. Rules:

- **Must include the primary-key feature** (e.g. `user.id`) — Chalk keys the upsert on it.
- Keep a **consistent runtime type per feature** across the stream; Chalk validates types on ingest.
  Supported: `Long`, `Integer`, `Double`, `Float`, `Boolean`, `String`, `byte[]`, `java.time.Instant`,
  and lists/maps thereof (whatever the `chalk-java` Arrow encoder accepts).
- Return `null` to drop an element. A `null` *value* uploads a null cell.
- Rows in a batch may have different key sets; the uploader pivots to a rectangular columnar table,
  null-padding any feature a given row omits.

## Configuration reference

| Option | Default | Meaning |
| --- | --- | --- |
| `clientId` / `clientSecret` | — (required) | Chalk credentials for token exchange. |
| `apiServer` | `https://api.chalk.ai` | Token-exchange endpoint. |
| `environmentId` | token primary env | Target environment. |
| `queryServer` | resolved from token | Override the gRPC engine URL. |
| `branch` | none | Target a branch deployment. |
| `resourceGroup` | none | Send uploads to a named resource group's engines (`x-chalk-resource-group`) instead of the environment's default engines. |
| `batchSize` | `1000` | Flush when this many rows are buffered. |
| `flushInterval` | `5s` | Flush a non-empty buffer at least this often. |
| `uploadTimeout` | `30s` | Per-call deadline. |
| `maxRetries` | `3` | Retries per batch on transient failure (exponential backoff). |
| `retryBackoff` | `500ms` | Base backoff, doubled per attempt (capped 30s). |
| `failOnUploadErrors` | `true` | `true`: fail the sink on engine data-level errors (replay). `false`: log a WARN and **drop** the rejected rows, continuing. |

> **Poison-pill note:** engine *data-level* errors (e.g. a bad feature type) are deterministic — with `failOnUploadErrors=true`, replaying the same batch after a checkpoint restart hits the same error, wedging the pipeline in a restart loop. Fix such rows upstream, or set `failOnUploadErrors=false` to drop them. (Transient transport errors are handled separately by retry + Flink restart and do make progress.)

## Write targets

`ChalkSinkConfig` exposes `writeOnline` (default `true`), `writeOffline`, and `updateMataggs`
toggles. The pinned `chalk-java:1.2.8` writes to the **online store only** — its public
`UploadFeaturesParams` surfaces only `inputs` / `environmentId` / `timeout`, so the underlying
`write_online` / `write_offline` / `update_mataggs` proto options can't be set yet. Because of that,
setting `writeOffline(true)`, `updateMataggs(true)`, or `writeOnline(false)` **fails fast at sink
startup** with a clear error rather than silently no-op'ing.

A ready-to-apply patch that threads those options through `UploadFeaturesParams` lives in
[`chalk-java-pr/`](chalk-java-pr/) (`upload-features-write-targets.patch` + `PR_DESCRIPTION.md`).
Once it lands and `chalk-java` is released:

1. Bump the dependency in `build.gradle.kts`.
2. Remove the unsupported-write-target guard in `ChalkSinkConfig.build()`, and uncomment the three
   `.withWrite*/.withUpdateMataggs` lines in `ChalkClientUploadClient` (the config values are already
   captured on fields).

After that, `.writeOffline(true)` / `.updateMataggs(true)` on the sink config take effect.

## Layout

```
build.gradle.kts / settings.gradle.kts
src/main/java/ai/chalk/flink/
  core/            ── Flink-free: ChalkSinkConfig, ChalkRowConverter, ChalkFeatureUploader,
                       ChalkUploadClient (+ default ChalkClient-backed impl), UploadOutcome
  sink/            ── ChalkRichSinkFunction (Flink 1.x), ChalkSink + ChalkSinkWriter (Sink2)
  examples/        ── ChalkUploadFeaturesJob
src/test/java/ai/chalk/flink/core/ChalkFeatureUploaderTest  ── core unit tests, no network
```
