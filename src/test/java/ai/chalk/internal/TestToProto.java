package ai.chalk.internal;

import com.google.protobuf.Struct;
import com.google.protobuf.Value;
import com.google.protobuf.ListValue;
import com.google.protobuf.NullValue;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class TestToProto {
    @Test
    void testNestedMap() {
        Map<String, Object> nestedMap = new HashMap<>(Map.of(
                "key1", "value1",
                "key2", 42,
                "key3", true,
                "key5", List.of("item1", 123, false),
                "key6", Map.of("nestedKey", "nestedValue")
        ));
        nestedMap.put("key4", null);

        Value result = Utils.toProto(nestedMap);

        assertNotNull(result);
        assertTrue(result.hasStructValue());
        Struct struct = result.getStructValue();
        assertEquals("value1", struct.getFieldsOrThrow("key1").getStringValue());
        assertEquals(42, struct.getFieldsOrThrow("key2").getNumberValue());
        assertTrue(struct.getFieldsOrThrow("key3").getBoolValue());
        assertEquals(NullValue.NULL_VALUE, struct.getFieldsOrThrow("key4").getNullValue());
    }

    @Test
    void testMixedTypes() {
        Map<String, Object> mixedTypes = new HashMap<>(Map.of(
                "stringKey", "hello",
                "intKey", 10,
                "doubleKey", 20.5,
                "boolKey", false
        ));
        mixedTypes.put("nullKey", null);

        Value result = Utils.toProto(mixedTypes);

        assertNotNull(result);
        assertTrue(result.hasStructValue());
        Struct struct = result.getStructValue();
        assertEquals("hello", struct.getFieldsOrThrow("stringKey").getStringValue());
        assertEquals(10, struct.getFieldsOrThrow("intKey").getNumberValue());
        assertEquals(20.5, struct.getFieldsOrThrow("doubleKey").getNumberValue());
        assertFalse(struct.getFieldsOrThrow("boolKey").getBoolValue());
        assertEquals(NullValue.NULL_VALUE, struct.getFieldsOrThrow("nullKey").getNullValue());
    }

    @Test
    void testComplexList() {
        List<Object> complexList = new ArrayList<>(List.of(
                "stringValue",
                123.456,
                true,
                List.of("nestedString", 99),
                Map.of("nestedMapKey", "nestedMapValue")
        ));
        complexList.add(null);

        Value result = Utils.toProto(complexList);

        assertNotNull(result);
        assertTrue(result.hasListValue());
        ListValue list = result.getListValue();
        assertEquals("stringValue", list.getValues(0).getStringValue());
        assertEquals(123.456, list.getValues(1).getNumberValue());
        assertTrue(list.getValues(2).getBoolValue());
        assertTrue(list.getValues(3).hasListValue());
        assertEquals("nestedString", list.getValues(3).getListValue().getValues(0).getStringValue());
        assertTrue(list.getValues(4).hasStructValue());
        assertEquals("nestedMapValue", list.getValues(4).getStructValue().getFieldsOrThrow("nestedMapKey").getStringValue());
        assertEquals(NullValue.NULL_VALUE, list.getValues(5).getNullValue());
    }

    @Test
    void testNullValue() {
        Value result = Utils.toProto(null);

        assertNotNull(result);
        assertEquals(NullValue.NULL_VALUE, result.getNullValue());
    }

    @Test
    void testEmptyList() {
        Value result = Utils.toProto(List.of());

        assertNotNull(result);
        assertTrue(result.hasListValue());
        assertTrue(result.getListValue().getValuesList().isEmpty());
    }

    @Test
    void testEmptyMap() {
        Value result = Utils.toProto(Map.of());

        assertNotNull(result);
        assertTrue(result.hasStructValue());
        assertTrue(result.getStructValue().getFieldsMap().isEmpty());
    }
    @Test
    void testThreeLevelNestedMap() {
        Map<String, Object> threeLevelNestedMap = Map.of(
                "level1", Map.of(
                        "level2", Map.of(
                                "level3", "deepValue"
                        )
                )
        );

        Value result = Utils.toProto(threeLevelNestedMap);

        assertNotNull(result);
        assertTrue(result.hasStructValue());
        Struct struct = result.getStructValue()
                .getFieldsOrThrow("level1")
                .getStructValue()
                .getFieldsOrThrow("level2")
                .getStructValue();
        assertEquals("deepValue", struct.getFieldsOrThrow("level3").getStringValue());
    }

    @Test
    void testThreeLevelNestedLists() {
        List<Object> nestedLists = List.of(
                List.of(
                        List.of("deepListValue")
                )
        );

        Value result = Utils.toProto(nestedLists);

        assertNotNull(result);
        assertTrue(result.hasListValue());
        Value deepListValue = result.getListValue()
                .getValues(0)
                .getListValue()
                .getValues(0)
                .getListValue()
                .getValues(0);
        assertEquals("deepListValue", deepListValue.getStringValue());
    }
}
