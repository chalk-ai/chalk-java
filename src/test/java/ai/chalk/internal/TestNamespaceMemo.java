package ai.chalk.internal;

import ai.chalk.internal.test_features.User;
import org.junit.jupiter.api.Test;
import ai.chalk.internal.codegen.Initializer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class TestNamespaceMemo {
    @Test
    public void TestBuildNamespaceMemo() throws Exception {
        var memo = new HashMap<String, NamespaceMemoItem>();
        Initializer.buildNamespaceMemo(User.class, memo, new HashSet<>());
        assert memo.containsKey("user");
        var userMemo = memo.get("user");
        assert userMemo.resolvedFieldNameToIndices.get("id").equals(List.of(0));
        assert userMemo.resolvedFieldNameToIndices.get("name").equals(List.of(1));
        assert userMemo.resolvedFieldNameToIndices.get("transactions").equals(List.of(2));
        assert userMemo.resolvedFieldNameToIndices.get("user.id").equals(List.of(0));
        assert userMemo.resolvedFieldNameToIndices.get("user.name").equals(List.of(1));
        assert userMemo.resolvedFieldNameToIndices.get("user.transactions").equals(List.of(2));

        assert memo.containsKey("transaction");
        var transactionMemo = memo.get("transaction");
        assert transactionMemo.resolvedFieldNameToIndices.get("id").equals(List.of(0));
        assert transactionMemo.resolvedFieldNameToIndices.get("amount").equals(List.of(1));
        assert transactionMemo.resolvedFieldNameToIndices.get("avgAmount__86400__").equals(List.of(2));
        assert transactionMemo.resolvedFieldNameToIndices.get("avgAmount__2592000__").equals(List.of(2));
        assert transactionMemo.resolvedFieldNameToIndices.get("name@2").equals(List.of(3, 4));
        assert transactionMemo.resolvedFieldNameToIndices.get("name@3").equals(List.of(5));
    }
}


