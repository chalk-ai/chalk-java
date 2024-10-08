package ai.chalk.client;

import ai.chalk.internal.arrow.FeatherProcessor;
import ai.chalk.internal.bytes.BytesProducer;
import ai.chalk.models.OnlineQueryParams;
import ai.chalk.client.features.InitFeaturesTestFeatures;
import ai.chalk.models.OnlineQueryParamsComplete;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.arrow.vector.types.pojo.ArrowType;
import org.junit.jupiter.api.Test;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class TestOnlineQueryParams extends AllocatorTest {
    public static boolean jsonCompare(String expected, String actual) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode tree1 = mapper.readTree(expected);
        JsonNode tree2 = mapper.readTree(actual);
        return tree1.equals(tree2);
    }
    @Test
    public void testInputSerializationLossless() throws Exception {
        ZoneId zoneIdUTC = ZoneId.of("UTC");

        LocalDateTime dateTime1 = LocalDateTime.of(2024, Month.APRIL, 25, 10, 0, 0, 123456789); // 10:00 AM
        LocalDateTime dateTime2 = LocalDateTime.of(2024, Month.APRIL, 25, 14, 0, 0, 333333333); // 2:00 PM
        LocalDateTime dateTime3 = LocalDateTime.of(2024, Month.APRIL, 25, 18, 0, 0, 987654321); // 6:00 PM

        ZonedDateTime utcTime1 = ZonedDateTime.of(dateTime1, zoneIdUTC);
        ZonedDateTime utcTime2 = ZonedDateTime.of(dateTime2, zoneIdUTC);
        ZonedDateTime utcTime3 = ZonedDateTime.of(dateTime3, zoneIdUTC);

        var params = OnlineQueryParams.builder()
                .withInput("user.float_feature", Arrays.asList(1.0, 2.0, 3.0))
                .withInput("user.string_feature", Arrays.asList("a", "b", "c"))
                .withInput("user.int_feature", Arrays.asList(1, 2, 3))
                .withInput("user.bool_feature", Arrays.asList(true, false, true))
                .withInput("user.local_datetime", Arrays.asList(dateTime1, dateTime2, dateTime3))
                .withInput("user.zoned_datetime", Arrays.asList(utcTime1, utcTime2, utcTime3))
                .withInput("user.struct_feature__via_hashmap__", Arrays.asList(
                        new HashMap<String, Object>() {{
                            put("name", "a");
                            put("amount", 1.0);
                            put("fluctuations", Arrays.asList(
                                    new HashMap<String, Object>() {{
                                        put("description", "a");
                                        put("amount", 1.0);
                                    }},
                                    new HashMap<String, Object>() {{
                                        put("description", "b");
                                        put("amount", 2.0);
                                    }}
                            ));
                        }},
                        new HashMap<String, Object>() {{
                            put("name", "b");
                            put("amount", 2.0);
                            put("fluctuations", Arrays.asList(
                                    new HashMap<String, Object>() {{
                                        put("description", "c");
                                        put("amount", 3.0);
                                    }},
                                    new HashMap<String, Object>() {{
                                        put("description", "d");
                                        put("amount", 4.0);
                                    }}
                            ));
                        }},
                        new HashMap<String, Object>() {{
                            put("name", "c");
                            put("amount", 3.0);
                            put("fluctuations", Arrays.asList(
                                    new HashMap<String, Object>() {{
                                        put("description", "e");
                                        put("amount", 5.0);
                                    }},
                                    new HashMap<String, Object>() {{
                                        put("description", "f");
                                        put("amount", 6.0);
                                    }}
                            ));
                        }}
                ))
                .withInput(
                        "user.struct_with_int_list",
                        Arrays.asList(
                                new TreeMap<String, Object>() {{
                                    put("name", "a");
                                    put("luckyNumbers", Arrays.asList(1, 2, 3));
                                }},
                                new TreeMap<String, Object>() {{
                                    put("name", "b");
                                    put("luckyNumbers", Arrays.asList(4, 5, 6));
                                }},
                                new TreeMap<String, Object>() {{
                                    put("name", "c");
                                    put("luckyNumbers", Arrays.asList(7, 8, 9));
                                }}
                        )
                )
                /* Couldn't call `.struct()` on a `NullableStructWriter` to obtain a faithful inner struct writer.
                .withInput("user.struct_with_struct", Arrays.asList(
                        new StructWithStruct("a", new InnerStruct("a", 1.0)),
                        new StructWithStruct("b", new InnerStruct("b", 2.0)),
                        new StructWithStruct("c", new InnerStruct("c", 3.0))
                ))
                */
                /* Supporting this makes error handling very terrible, but it was beautiful when it worked ;)
                .withInput("user.struct_feature__via_classes__", Arrays.asList(
                        new StructWithStructList("a", 1.0, Arrays.asList(new InnerStruct("a", 1.0), new InnerStruct("b", 2.0))),
                        new StructWithStructList("b", 2.0, Arrays.asList(new InnerStruct("c", 3.0), new InnerStruct("d", 4.0))),
                        new StructWithStructList("c", 3.0, Arrays.asList(new InnerStruct("e", 5.0), new InnerStruct("f", 6.0)))
                ))
                */
                .build();
        var serialized = FeatherProcessor.inputsToArrowBytes(params.getInputs(), allocator);
        try (var deserialized = FeatherProcessor.convertBytesToTable(serialized, allocator)) {
            var floatField = deserialized.getField("user.float_feature");
            assert floatField.getType().getTypeID().equals(ArrowType.ArrowTypeID.FloatingPoint);
            try (var vector = deserialized.getVectorCopy("user.float_feature")) {
                assert vector.getObject(0).equals(1.0);
                assert vector.getObject(1).equals(2.0);
                assert vector.getObject(2).equals(3.0);
            }

            var stringField = deserialized.getField("user.string_feature");
            assert stringField.getType().getTypeID().equals(ArrowType.ArrowTypeID.LargeUtf8);
            try (var vector = deserialized.getVectorCopy("user.string_feature")) {
                assert vector.getObject(0).toString().equals("a");
                assert vector.getObject(1).toString().equals("b");
                assert vector.getObject(2).toString().equals("c");
            }

            var intField = deserialized.getField("user.int_feature");
            assert intField.getType().getTypeID().equals(ArrowType.ArrowTypeID.Int);
            try (var vector = deserialized.getVectorCopy("user.int_feature")) {
                assert vector.getObject(0).equals(1L);
                assert vector.getObject(1).equals(2L);
                assert vector.getObject(2).equals(3L);
            }

            var boolField = deserialized.getField("user.bool_feature");
            assert boolField.getType().getTypeID().equals(ArrowType.ArrowTypeID.Bool);
            try (var vector = deserialized.getVectorCopy("user.bool_feature")) {
                assert vector.getObject(0).equals(true);
                assert vector.getObject(1).equals(false);
                assert vector.getObject(2).equals(true);
            }

            var structVal1 = "{\"name\":\"a\",\"amount\":1.0,\"fluctuations\":[{\"description\":\"a\",\"amount\":1.0},{\"description\":\"b\",\"amount\":2.0}]}";
            var structVal2 = "{\"name\":\"b\",\"amount\":2.0,\"fluctuations\":[{\"description\":\"c\",\"amount\":3.0},{\"description\":\"d\",\"amount\":4.0}]}";
            var structVal3 = "{\"name\":\"c\",\"amount\":3.0,\"fluctuations\":[{\"description\":\"e\",\"amount\":5.0},{\"description\":\"f\",\"amount\":6.0}]}";
            var structFieldViaHashMap = deserialized.getField("user.struct_feature__via_hashmap__");
            assert structFieldViaHashMap.getType().getTypeID().equals(ArrowType.ArrowTypeID.Struct);
            try (var vector = deserialized.getVectorCopy("user.struct_feature__via_hashmap__")) {
                assert jsonCompare(vector.getObject(0).toString(), structVal1);
                assert jsonCompare(vector.getObject(1).toString(), structVal2);
                assert jsonCompare(vector.getObject(2).toString(), structVal3);
            }

            var structWithIntListField = deserialized.getField("user.struct_with_int_list");
            assert structWithIntListField.getType().getTypeID().equals(ArrowType.ArrowTypeID.Struct);
            try (var vector = deserialized.getVectorCopy("user.struct_with_int_list")) {
                assert jsonCompare(vector.getObject(0).toString(), "{\"name\":\"a\",\"luckyNumbers\":[1,2,3]}");
                assert jsonCompare(vector.getObject(1).toString(), "{\"name\":\"b\",\"luckyNumbers\":[4,5,6]}");
                assert jsonCompare(vector.getObject(2).toString(), "{\"name\":\"c\",\"luckyNumbers\":[7,8,9]}");
            }

            var localDateTimeField = deserialized.getField("user.local_datetime");
            assert localDateTimeField.getType().getTypeID().equals(ArrowType.ArrowTypeID.Timestamp);
            try (var vector = deserialized.getVectorCopy("user.local_datetime")) {
                assert vector.getObject(0).equals(dateTime1.truncatedTo(ChronoUnit.MICROS));
                assert vector.getObject(1).equals(dateTime2.truncatedTo(ChronoUnit.MICROS));
                assert vector.getObject(2).equals(dateTime3.truncatedTo(ChronoUnit.MICROS));
            }

            var zonedDateTimeField = deserialized.getField("user.zoned_datetime");
            assert zonedDateTimeField.getType().getTypeID().equals(ArrowType.ArrowTypeID.Timestamp);
            // getObject just returns a Long that represents epoch microseconds instead of returning a ZonedDateTime.
            // This is expected and discussed here https://github.com/apache/arrow/issues/25947
            var epochMicros1 = utcTime1.toInstant().getEpochSecond() * 1000000 + utcTime1.toInstant().getNano() / 1000;
            var epochMicros2 = utcTime2.toInstant().getEpochSecond() * 1000000 + utcTime2.toInstant().getNano() / 1000;
            var epochMicros3 = utcTime3.toInstant().getEpochSecond() * 1000000 + utcTime3.toInstant().getNano() / 1000;
            try (var vector = deserialized.getVectorCopy("user.zoned_datetime")) {
                assert vector.getObject(0).equals(epochMicros1);
                assert vector.getObject(1).equals(epochMicros2);
                assert vector.getObject(2).equals(epochMicros3);
            }

            /* Supporting this makes error handling very terrible, but it was beautiful when it worked ;)
            var structFieldViaClasses = deserialized.getField("user.struct_feature__via_classes__");
            assert structFieldViaClasses.getType().getTypeID().equals(ArrowType.ArrowTypeID.Struct);
            assert deserialized.getVectorCopy("user.struct_feature__via_classes__").getObject(0).toString().equals(structVal1);
            assert deserialized.getVectorCopy("user.struct_feature__via_classes__").getObject(1).toString().equals(structVal2);
            assert deserialized.getVectorCopy("user.struct_feature__via_classes__").getObject(2).toString().equals(structVal3);
            */

            /* Couldn't call `.struct()` on a `NullableStructWriter` to obtain a faithful inner struct writer.
            var structWithStructField = deserialized.getField("user.struct_with_struct");
            assert structWithStructField.getType().getTypeID().equals(ArrowType.ArrowTypeID.Struct);
            assert deserialized.getVectorCopy("user.struct_with_struct").getObject(0).toString().equals("{\"title\":\"a\",\"flux\":{\"description\":\"a\",\"amount\":1.0}}");
            assert deserialized.getVectorCopy("user.struct_with_struct").getObject(1).toString().equals("{\"title\":\"b\",\"flux\":{\"description\":\"b\",\"amount\":2.0}}");
            assert deserialized.getVectorCopy("user.struct_with_struct").getObject(2).toString().equals("{\"title\":\"c\",\"flux\":{\"description\":\"c\",\"amount\":3.0}}");
            */
        }
    }

    @Test
    public void testWithInputs() throws Exception {
        Map<String, List<?>> inputs = new HashMap<>();
        var userIds = Arrays.asList(1, 2, 3);
        var emails = Arrays.asList("a", "b", "c");
        var socureScores = Arrays.asList(1.0, 2.0, 3.0);
        inputs.put("user.id", userIds);
        inputs.put("user.email", emails);
        inputs.put("user.socure_score", socureScores);

        var outputs = new String[]{"user.today", "user.socure_score"};

        OnlineQueryParamsComplete params = OnlineQueryParams.builder().withInputs(inputs).withOutputs(outputs).build();
        assert params.getInputs().get("user.id").equals(userIds);
        assert params.getInputs().get("user.email").equals(emails);
        assert params.getInputs().get("user.socure_score").equals(socureScores);
        assert params.getOutputs().get(0).equals("user.today");
        assert params.getOutputs().get(1).equals("user.socure_score");

        var params2 = OnlineQueryParams.builder().withOutputs(outputs).withInputs(inputs).build();
        assert params2.getInputs().get("user.id").equals(userIds);
        assert params2.getInputs().get("user.email").equals(emails);
        assert params2.getInputs().get("user.socure_score").equals(socureScores);
        assert params2.getOutputs().get(0).equals("user.today");
        assert params2.getOutputs().get(1).equals("user.socure_score");

        var abcs = Arrays.asList("a", "b", "c");
        var cbd = Arrays.asList("c", "b", "d");
        var params3 = OnlineQueryParams.builder().withOutputs(outputs).withInput("user.abc", abcs).withInputs(inputs).withInput("user.cbd", cbd).build();
        assert params3.getInputs().get("user.id").equals(userIds);
        assert params3.getInputs().get("user.email").equals(emails);
        assert params3.getInputs().get("user.socure_score").equals(socureScores);
        assert params3.getInputs().get("user.abc").equals(abcs);
        assert params3.getInputs().get("user.cbd").equals(cbd);
        assert params3.getOutputs().get(0).equals("user.today");
        assert params3.getOutputs().get(1).equals("user.socure_score");
    }

    @Test
    public void testWithOptionalParams() throws Exception {
        Map<String, List<?>> inputs = new HashMap<>();
        var userIds = Arrays.asList(1, 2, 3);
        var emails = Arrays.asList("a", "b", "c");
        var socureScores = Arrays.asList(1.0, 2.0, 3.0);
        inputs.put("user.id", userIds);
        inputs.put("user.email", emails);
        inputs.put("user.socure_score", socureScores);

        var outputs = new String[]{"user.today", "user.socure_score"};
        var now = Arrays.asList(ZonedDateTime.now(), ZonedDateTime.now().minusDays(1));
        var requiredResolverTags = List.of("prod1", "prod2");
        var queryNameVersion = "queryNameVersionAbc";

        // Test BuilderSeed with optional params
        OnlineQueryParams.BuilderSeed builderSeed = OnlineQueryParams.builder()
                .withStaleness(new HashMap<>() {{
                    put("user.id", Duration.ofSeconds(1000));
                }})
                .withMeta(new HashMap<>() {{
                    put("user.id", "abc");
                }})
                .withTags(Arrays.asList("user.id", "abc"))
                .withTags("def")
                .withIncludeMeta(true)
                .withStorePlanStages(true)
                .withExplain(true)
                .withEnvironmentId("abc")
                .withPreviewDeploymentId("abc")
                .withQueryName("abc")
                .withCorrelationId("abc")
                .withBranch("abc")
                .withNow(now)
                .withRequiredResolverTags(requiredResolverTags)
                .withQueryNameVersion(queryNameVersion);
        OnlineQueryParams paramsSeed = builderSeed.build();
        assert paramsSeed.getStaleness().get("user.id").equals(Duration.ofSeconds(1000));
        assert paramsSeed.getMeta().get("user.id").equals("abc");
        assert paramsSeed.getTags().get(0).equals("user.id");
        assert paramsSeed.getTags().get(1).equals("abc");
        assert paramsSeed.getTags().get(2).equals("def");
        assert paramsSeed.isIncludeMeta();
        assert paramsSeed.isStorePlanStages();
        assert paramsSeed.isExplain();
        assert paramsSeed.getEnvironmentId().equals("abc");
        assert paramsSeed.getPreviewDeploymentId().equals("abc");
        assert paramsSeed.getQueryName().equals("abc");
        assert paramsSeed.getCorrelationId().equals("abc");
        assert paramsSeed.getBranch().equals("abc");
        assert paramsSeed.getNow().equals(now);
        assert paramsSeed.getRequiredResolverTags().equals(requiredResolverTags);
        assert paramsSeed.getQueryNameVersion().equals(queryNameVersion);


        // Test BuilderWithInputs with optional params
        OnlineQueryParams.BuilderWithInputs builderWithInputs = OnlineQueryParams.builder()
                .withInputs(inputs)
                .withStaleness(new HashMap<>() {{
                    put("user.id", Duration.ofSeconds(1000));
                }})
                .withMeta(new HashMap<>() {{
                    put("user.id", "abc");
                }})
                .withTags(Arrays.asList("user.id", "abc"))
                .withTags("def")
                .withTag("ghi")
                .withIncludeMeta(true)
                .withStorePlanStages(true)
                .withExplain(true)
                .withEnvironmentId("abc")
                .withPreviewDeploymentId("abc")
                .withQueryName("abc")
                .withCorrelationId("abc")
                .withBranch("abc")
                .withNow(now)
                .withRequiredResolverTags(requiredResolverTags)
                .withQueryNameVersion(queryNameVersion);

        OnlineQueryParams paramsWithInputs = builderWithInputs.build();
        assert paramsWithInputs.getInputs().get("user.id").equals(userIds);
        assert paramsWithInputs.getInputs().get("user.email").equals(emails);
        assert paramsWithInputs.getInputs().get("user.socure_score").equals(socureScores);
        assert paramsWithInputs.getStaleness().get("user.id").equals(Duration.ofSeconds(1000));
        assert paramsWithInputs.getMeta().get("user.id").equals("abc");
        assert paramsWithInputs.getTags().get(0).equals("user.id");
        assert paramsWithInputs.getTags().get(1).equals("abc");
        assert paramsWithInputs.getTags().get(2).equals("def");
        assert paramsWithInputs.getTags().get(3).equals("ghi");
        assert paramsWithInputs.isIncludeMeta();
        assert paramsWithInputs.isStorePlanStages();
        assert paramsWithInputs.isExplain();
        assert paramsWithInputs.getEnvironmentId().equals("abc");
        assert paramsWithInputs.getPreviewDeploymentId().equals("abc");
        assert paramsWithInputs.getQueryName().equals("abc");
        assert paramsWithInputs.getCorrelationId().equals("abc");
        assert paramsWithInputs.getBranch().equals("abc");
        assert paramsWithInputs.getNow().equals(now);
        assert paramsWithInputs.getRequiredResolverTags().equals(requiredResolverTags);
        assert paramsWithInputs.getQueryNameVersion().equals(queryNameVersion);

        // Test BuilderWithOutputs with optional params
        OnlineQueryParams.BuilderWithOutputs builderWithOutputs = OnlineQueryParams.builder()
                .withOutputs(outputs)
                .withStaleness(new HashMap<>() {{
                    put("user.id", Duration.ofSeconds(1000));
                }})
                .withMeta(new HashMap<>() {{
                    put("user.id", "abc");
                }})
                .withTags(Arrays.asList("user.id", "abc"))
                .withTags("def")
                .withTag("ghi")
                .withIncludeMeta(true)
                .withStorePlanStages(true)
                .withExplain(true)
                .withEnvironmentId("abc")
                .withPreviewDeploymentId("abc")
                .withQueryName("abc")
                .withCorrelationId("abc")
                .withBranch("abc");

        OnlineQueryParams paramsWithOutputs = builderWithOutputs.build();
        assert paramsWithOutputs.getOutputs().get(0).equals("user.today");
        assert paramsWithOutputs.getOutputs().get(1).equals("user.socure_score");
        assert paramsWithOutputs.getStaleness().get("user.id").equals(Duration.ofSeconds(1000));
        assert paramsWithOutputs.getMeta().get("user.id").equals("abc");
        assert paramsWithOutputs.getTags().get(0).equals("user.id");
        assert paramsWithOutputs.getTags().get(1).equals("abc");
        assert paramsWithOutputs.getTags().get(2).equals("def");
        assert paramsWithOutputs.getTags().get(3).equals("ghi");
        assert paramsWithOutputs.isIncludeMeta();
        assert paramsWithOutputs.isStorePlanStages();
        assert paramsWithOutputs.isExplain();
        assert paramsWithOutputs.getEnvironmentId().equals("abc");
        assert paramsWithOutputs.getPreviewDeploymentId().equals("abc");
        assert paramsWithOutputs.getQueryName().equals("abc");
        assert paramsWithOutputs.getCorrelationId().equals("abc");

        // Test BuilderComplete with optional params
        OnlineQueryParams.BuilderComplete builderComplete = OnlineQueryParams.builder()
                .withInputs(inputs)
                .withOutputs(outputs)
                .withStaleness(new HashMap<>() {{
                    put("user.id", Duration.ofSeconds(1000));
                }})
                .withMeta(new HashMap<>() {{
                    put("user.id", "abc");
                }})
                .withTags(Arrays.asList("user.id", "abc"))
                .withTags("def")
                .withTag("ghi")
                .withIncludeMeta(true)
                .withStorePlanStages(true)
                .withExplain(true)
                .withEnvironmentId("abc")
                .withPreviewDeploymentId("abc")
                .withQueryName("abc")
                .withCorrelationId("abc")
                .withBranch("abc")
                .withNow(now)
                .withRequiredResolverTags(requiredResolverTags)
                .withQueryNameVersion(queryNameVersion);

        OnlineQueryParamsComplete paramsComplete = builderComplete.build();
        assert paramsComplete.getInputs().get("user.id").equals(userIds);
        assert paramsComplete.getInputs().get("user.email").equals(emails);
        assert paramsComplete.getInputs().get("user.socure_score").equals(socureScores);
        assert paramsComplete.getOutputs().get(0).equals("user.today");
        assert paramsComplete.getOutputs().get(1).equals("user.socure_score");
        assert paramsComplete.getStaleness().get("user.id").equals(Duration.ofSeconds(1000));
        assert paramsComplete.getMeta().get("user.id").equals("abc");
        assert paramsComplete.getTags().get(0).equals("user.id");
        assert paramsComplete.getTags().get(1).equals("abc");
        assert paramsComplete.getTags().get(2).equals("def");
        assert paramsComplete.getTags().get(3).equals("ghi");
        assert paramsComplete.isIncludeMeta();
        assert paramsComplete.isStorePlanStages();
        assert paramsComplete.isExplain();
        assert paramsComplete.getEnvironmentId().equals("abc");
        assert paramsComplete.getPreviewDeploymentId().equals("abc");
        assert paramsComplete.getQueryName().equals("abc");
        assert paramsComplete.getCorrelationId().equals("abc");
        assert paramsComplete.getBranch().equals("abc");
        assert paramsComplete.getNow().equals(now);
        assert paramsComplete.getRequiredResolverTags().equals(requiredResolverTags);
        assert paramsComplete.getQueryNameVersion().equals(queryNameVersion);

        // Test serialization
        BytesProducer.convertOnlineQueryParamsToBytes(paramsComplete, allocator);
    }

    @Test
    public void testLargeUtf8AsInput() throws Exception {
        var largeString = "a".repeat(100000);
        var params = OnlineQueryParams.builder().withInput("user.id", Arrays.asList(largeString, largeString)).withOutputs("user.today", "user.socure_score").build();
        var inputBytes = FeatherProcessor.inputsToArrowBytes(params.getInputs(), allocator);
        try (
            var reconstructedInput = FeatherProcessor.convertBytesToTable(inputBytes, allocator);
            var vector = reconstructedInput.getVectorCopy("user.id")
        ) {
            assert vector.getObject(0).toString().equals(largeString);
        }
    }

    @Test
    public void testLargeBinaryAsInput() throws Exception {
        var largeBinaryString = "acb".repeat(100000);
        var largeBinary = largeBinaryString.getBytes();
        var params = OnlineQueryParams.builder().withInput("user.binary_data", Arrays.asList(largeBinary, largeBinary)).withOutputs("user.today", "user.socure_score").build();
        var inputBytes = FeatherProcessor.inputsToArrowBytes(params.getInputs(), allocator);

        try (
            var reconstructedInput = FeatherProcessor.convertBytesToTable(inputBytes, allocator);
            var vector = reconstructedInput.getVectorCopy("user.binary_data")
        ) {
            assert new String((byte[]) vector.getObject(0)).equals(largeBinaryString);
        }
    }


    @Test
    public void testSerializationWithListAsInputValuesBatch() throws Exception {
        var inputs = new HashMap<String, List<?>>();
        var userIds = Arrays.asList("1", "2", "3");
        inputs.put("user.id", userIds);
        var outputs = new String[]{"user.today", "user.socure_score"};
        var params = OnlineQueryParams.builder().withInputs(inputs).withOutputs(outputs).build();
        BytesProducer.convertOnlineQueryParamsToBytes(params, allocator);
    }

    @Test
    public void testSerializationWithListAsInputValuesSingular() throws Exception {
        var userIds = Arrays.asList("1", "2", "3");
        var params = OnlineQueryParams.builder().withInput("user.id", userIds).withOutputs("user.today", "user.socure_score").build();
        assert params.getInputs().get("user.id").equals(userIds);
        BytesProducer.convertOnlineQueryParamsToBytes(params, allocator);
    }

    @Test
    public void testSerializationWithListAsOutputs() throws Exception {
        var outputs = Arrays.asList("user.today", "user.socure_score");
        var params = OnlineQueryParams.builder().withInput("user.id", Arrays.asList(1, 2, 3)).withOutputs(outputs).build();
        assert params.getOutputs().equals(outputs);
        BytesProducer.convertOnlineQueryParamsToBytes(params, allocator);
    }

    @Test
    public void testSerializationWithArrayAsOutputs() throws Exception {
        var outputs = new String[]{"user.today", "user.socure_score"};
        var params = OnlineQueryParams.builder().withInput("user.id", Arrays.asList(1, 2, 3)).withOutputs(outputs).build();
        assert Arrays.equals(params.getOutputs().toArray(), outputs);
        BytesProducer.convertOnlineQueryParamsToBytes(params, allocator);
    }

    /**
     * Aims to test all methods that take `Feature` as keys to the inputs map.
     */
    @Test
    public void testArrayInputsWithCodegenClass() throws Exception {
        String[] expectedInputs = new String[]{"1", "2", "3"};
        var p1 = OnlineQueryParams
                .builder()
                .withInput(InitFeaturesTestFeatures.user.id, expectedInputs)
                .withOutputs("user.today", "user.socure_score")
                .build();
        var p2 = OnlineQueryParams
                .builder()
                .withInput(InitFeaturesTestFeatures.user.burrys_membership.membership_id, "abc", "def", "ghiRR")
                .withInput(InitFeaturesTestFeatures.user.id, "1", "2", "3")
                .withOutputs("user.today", "user.socure_score")
                .build();
        var p3 = OnlineQueryParams
                .builder()
                .withOutputs("user.today", "user.socure_score")
                .withInput(InitFeaturesTestFeatures.user.id, expectedInputs)
                .build();
        var p4 = OnlineQueryParams
                .builder()
                .withOutputs("user.today")
                .withInput(InitFeaturesTestFeatures.user.id, expectedInputs)
                .build();


        var allParams = new OnlineQueryParamsComplete[]{p1, p2, p3, p4};
        for (OnlineQueryParamsComplete p : allParams) {
            assert Arrays.equals(p.getInputs().get("test_user.id").toArray(), expectedInputs);
            // Test serialization is OK.
            BytesProducer.convertOnlineQueryParamsToBytes(p, allocator);
        }
    }

    /**
     * Aims to test all methods that take `Feature` as keys to the inputs map.
     * This tests the case where the inputs passed in are lists instead of arrays.
     */
    @Test
    public void testListInputsWithCodegenClass() throws Exception {
        String[] arrInputs = new String[]{"1", "2", "3"};
        List<String> expectedInputs = Arrays.asList(arrInputs);
        var p1 = OnlineQueryParams
                .builder()
                .withInput(InitFeaturesTestFeatures.user.id, expectedInputs)
                .withOutputs("user.today", "user.socure_score")
                .build();
        var p2 = OnlineQueryParams
                .builder()
                .withInput(InitFeaturesTestFeatures.user.burrys_membership.membership_id, "abc", "def", "ghi")
                .withInput(InitFeaturesTestFeatures.user.id, expectedInputs)
                .withOutputs("user.today", "user.socure_score")
                .build();
        var p3 = OnlineQueryParams
                .builder()
                .withOutputs("user.today", "user.socure_score")
                .withInput(InitFeaturesTestFeatures.user.id, expectedInputs)
                .build();
        var p4 = OnlineQueryParams
                .builder()
                .withOutputs("user.today")
                .withInput(InitFeaturesTestFeatures.user.id, expectedInputs)
                .build();


        var allParams = new OnlineQueryParamsComplete[]{p1, p2, p3, p4};
        for (OnlineQueryParamsComplete p : allParams) {
            assert p.getInputs().get("test_user.id").equals(expectedInputs);
            // Test serialization is OK.
            BytesProducer.convertOnlineQueryParamsToBytes(p, allocator);
        }
    }



    /**
     * Aims to test all methods that take `Feature` as outputs.
     */
    @Test
    public void testOutputsWithCodegenClass() throws Exception {
        var p1 = OnlineQueryParams
                .builder()
                .withInput(InitFeaturesTestFeatures.user.id, "1", "2", "3")
                .withOutputs(InitFeaturesTestFeatures.user.id, InitFeaturesTestFeatures.user.burrys_membership.membership_id)
                .build();
        var p2 = OnlineQueryParams
                .builder()
                .withOutputs(InitFeaturesTestFeatures.user.id, InitFeaturesTestFeatures.user.burrys_membership.membership_id)
                .withInput(InitFeaturesTestFeatures.user.id, "1", "2", "3")
                .build();
        var p3 = OnlineQueryParams
                .builder()
                .withInput(InitFeaturesTestFeatures.user.id, "1", "2", "3")
                .withOutputs(InitFeaturesTestFeatures.user.id)
                .withOutputs(InitFeaturesTestFeatures.user.burrys_membership.membership_id)
                .build();
        var p4 = OnlineQueryParams
                .builder()
                .withOutputs(InitFeaturesTestFeatures.user.id)
                .withOutputs(InitFeaturesTestFeatures.user.burrys_membership.membership_id)
                .withInput(InitFeaturesTestFeatures.user.id, "1", "2", "3")
                .build();
        var p5 = OnlineQueryParams
                .builder()
                .withOutputs(InitFeaturesTestFeatures.user.id)
                .withInput(InitFeaturesTestFeatures.user.id, "1", "2", "3")
                .withOutputs(InitFeaturesTestFeatures.user.burrys_membership.membership_id)
                .build();

        var allParams = new OnlineQueryParamsComplete[]{p1, p2, p3, p4, p5};
        for (OnlineQueryParamsComplete p : allParams) {
            assert Arrays.equals(p.getOutputs().toArray(), new String[]{"test_user.id", "test_user.burrys_membership.membership_id"});
            // Test serialization is OK.
            BytesProducer.convertOnlineQueryParamsToBytes(p, allocator);
        }
    }

    /**
     * Test special output objects like `WindowedFeaturesClass` and `StructFeaturesClass`
     */
    @Test
    public void testSpecialOutputFeatures() throws Exception {
        var p = OnlineQueryParams
                .builder()
                .withInput(InitFeaturesTestFeatures.user.id, "1", "2", "3")
                .withOutputs(InitFeaturesTestFeatures.user.mean_attendance_count)        // WindowedFeaturesClass
                .withOutputs(InitFeaturesTestFeatures.user.burrys_membership.branch)     // StructFeaturesClass
                .withOutputs(InitFeaturesTestFeatures.user.burrys_membership)            // FeaturesClass
                .build();
        assert Arrays.equals(p.getOutputs().toArray(), new String[]{
                "test_user.mean_attendance_count",
                "test_user.burrys_membership.branch",
                "test_user.burrys_membership",
        });
        // Test serialization is OK.
        BytesProducer.convertOnlineQueryParamsToBytes(p, allocator);
    }


    /**
     * Tests that `initFeatures` correctly initialized FQNs for all features
     * under the `Features` class.
     */
    @Test
    public void testInitFeaturesFqn() throws Exception {
        assert InitFeaturesTestFeatures.user.id.getFqn().equals("test_user.id");
        assert InitFeaturesTestFeatures.user.injuries.getFqn().equals("test_user.injuries");
        assert InitFeaturesTestFeatures.user.burrys_membership.getFqn().equals("test_user.burrys_membership");
        assert InitFeaturesTestFeatures.user.burrys_membership.is_free_monthly_burryto_claimed.getFqn().equals("test_user.burrys_membership.is_free_monthly_burryto_claimed");

        // Test has ones
        assert InitFeaturesTestFeatures.user.burrys_membership.instructor.id.getFqn().equals("test_user.burrys_membership.instructor.id");
        assert InitFeaturesTestFeatures.user.burrys_membership.instructor.rating.getFqn().equals("test_user.burrys_membership.instructor.rating");

        // Test has many
        assert InitFeaturesTestFeatures.user.burrys_membership.injuries.getFqn().equals("test_user.burrys_membership.injuries");

        // Test dataclasses and nested dataclasses. They should have
        // their FQN truncated until the first feature is reached.
        assert InitFeaturesTestFeatures.user.burrys_membership.branch.averageInjuriesPerMonth.getFqn().equals("test_user.burrys_membership.branch");
        assert InitFeaturesTestFeatures.user.burrys_membership.branch.city.isItSanFrancisco.getFqn().equals("test_user.burrys_membership.branch");
        assert InitFeaturesTestFeatures.user.burrys_membership.branch.getFqn().equals("test_user.burrys_membership.branch");

        // Windowed feature classes
        assert InitFeaturesTestFeatures.user.mean_attendance_count.getFqn().equals("test_user.mean_attendance_count");
        assert InitFeaturesTestFeatures.user.mean_attendance_count.bucket_all.getFqn().equals("test_user.mean_attendance_count__all__");
        assert InitFeaturesTestFeatures.user.mean_attendance_count.bucket_1w.getFqn().equals("test_user.mean_attendance_count__604800__");

        // Normal feature classes
        assert InitFeaturesTestFeatures.user.getFqn().equals("test_user");
        assert InitFeaturesTestFeatures.user.burrys_membership.getFqn().equals("test_user.burrys_membership");
    }


    /**
     * Tests that when one of our feature values is a list containing nulls,
     * we correctly serialize the inputs
     */
    @Test
    public void testNullInInputList() throws Exception {
        // Serialize into bytes
        var inputs = new HashMap<String, List<?>>();
        var userIds = Arrays.asList("1", "2", null, "3");
        var wealth = Arrays.asList(1.0, 2.0, null, 3.0);
        inputs.put("user.id", userIds);
        inputs.put("user.wealth", wealth);
        var outputs = new String[]{"user.today", "user.socure_score"};
        OnlineQueryParamsComplete params = OnlineQueryParams.builder().withInputs(inputs).withOutputs(outputs).build();
        var inputBytes = BytesProducer.convertOnlineQueryParamsToBytes(params, allocator);

        // Deserialize back into a table and inspect values
        var inputTable = FeatherProcessor.convertBytesToTable(inputBytes, allocator);
        var userIdVector = inputTable.toVectorSchemaRoot().getVector("user.id");
        var wealthVector = inputTable.toVectorSchemaRoot().getVector("user.wealth");

        assert userIdVector.getObject(0).equals("1");
        assert userIdVector.getObject(1).equals("2");
        assert userIdVector.getObject(2) == null;
        assert userIdVector.getObject(3).equals("3");

        assert wealthVector.getObject(0).equals(1.0);
        assert wealthVector.getObject(1).equals(2.0);
        assert wealthVector.getObject(2) == null;
        assert wealthVector.getObject(3).equals(3.0);
    }
}
