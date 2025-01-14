package ai.chalk.internal;

import ai.chalk.internal.test_features.Transaction;
import ai.chalk.internal.test_features.User;
import ai.chalk.internal.test_features._WindowedFeatures_1d_30d;
import org.junit.jupiter.api.Test;
import ai.chalk.internal.codegen.Initializer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class TestNamespaceMemo {
    @Test
    public void TestBuildNamespaceMemo() throws Exception {
        var memo = new HashMap<Class<?>, NamespaceMemoItem>();
        Initializer.buildNamespaceMemo(User.class, memo, new HashSet<>());
        assert memo.containsKey(User.class);
        var userMemo = memo.get(User.class);
        assert userMemo.resolvedFieldNameToIndices.get("id").equals(List.of(0));
        assert userMemo.resolvedFieldNameToIndices.get("name").equals(List.of(1));
        assert userMemo.resolvedFieldNameToIndices.get("transactions").equals(List.of(2));
        assert userMemo.isFieldFeaturesBaseSubclass.equals(List.of(false, false, false, false));

        assert memo.containsKey(Transaction.class);
        var transactionMemo = memo.get(Transaction.class);
        assert transactionMemo.resolvedFieldNameToIndices.get("id").equals(List.of(0));
        assert transactionMemo.resolvedFieldNameToIndices.get("amount").equals(List.of(1));
        assert transactionMemo.resolvedFieldNameToIndices.get("name@2").equals(List.of(3, 4));
        assert transactionMemo.resolvedFieldNameToIndices.get("name@3").equals(List.of(5));
        assert transactionMemo.isFieldFeaturesBaseSubclass.equals(List.of(false, false, true, false, false, false, false));

        assert memo.containsKey(_WindowedFeatures_1d_30d.class);
        var windowedMemo = memo.get(_WindowedFeatures_1d_30d.class);
        assert windowedMemo.resolvedFieldNameToIndices.get("__86400__").equals(List.of(0));
        assert windowedMemo.resolvedFieldNameToIndices.get("__2592000__").equals(List.of(1));
    }
}


