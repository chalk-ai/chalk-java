package ai.chalk.internal;

import ai.chalk.features.WindowedFeaturesClass;
import ai.chalk.internal.test_features.Transaction;
import ai.chalk.internal.test_features.User;
import ai.chalk.internal.test_features._WindowedFeatures_1d_30d;
import org.junit.jupiter.api.Test;
import ai.chalk.internal.codegen.Initializer;

import java.util.HashMap;
import java.util.HashSet;

public class TestNamespaceMemo {

    @Test
    public void TestBuildNamespaceMemo() throws Exception {
        var memo = new HashMap<Class<?>, NamespaceMemoItem>();
        Initializer.buildNamespaceMemo(User.class, memo, new HashSet<>());

        // User
        assert memo.containsKey(User.class);
        var userMemo = memo.get(User.class);
        FieldMeta idMeta = userMemo.resolvedNameToFieldMetas.get("id").get(0);
        assert idMeta.field().equals(User.class.getField("id"));

        FieldMeta nameMeta = userMemo.resolvedNameToFieldMetas.get("name").get(0);
        assert nameMeta.field().equals(User.class.getField("name"));

        FieldMeta transactionsMeta = userMemo.resolvedNameToFieldMetas.get("transactions").get(0);
        assert transactionsMeta.field().equals(User.class.getField("transactions"));
        assert transactionsMeta.listUnderlyingClass().equals(Transaction.class);
        assert transactionsMeta.isList();

        FieldMeta accountMeta = userMemo.resolvedNameToFieldMetas.get("account").get(0);
        assert accountMeta.field().equals(User.class.getField("account"));

        FieldMeta addressMeta = userMemo.resolvedNameToFieldMetas.get("address").get(0);
        assert addressMeta.field().equals(User.class.getField("address"));

        // Transaction
        assert memo.containsKey(Transaction.class);
        var transactionMemo = memo.get(Transaction.class);
        FieldMeta txnId = transactionMemo.resolvedNameToFieldMetas.get("id").get(0);
        assert txnId.field().equals(Transaction.class.getField("id"));

        FieldMeta txnAmount = transactionMemo.resolvedNameToFieldMetas.get("amount").get(0);
        assert txnAmount.field().equals(Transaction.class.getField("amount"));

        FieldMeta txnName = transactionMemo.resolvedNameToFieldMetas.get("name@2").get(0);
        assert txnName.field().equals(Transaction.class.getField("name"));

        FieldMeta txnName2 = transactionMemo.resolvedNameToFieldMetas.get("name@2").get(1);
        assert txnName2.field().equals(Transaction.class.getField("nameV2"));

        FieldMeta txnName3 = transactionMemo.resolvedNameToFieldMetas.get("name@3").get(0);
        assert txnName3.field().equals(Transaction.class.getField("nameV3"));

        FieldMeta txnAvgAmount = transactionMemo.resolvedNameToFieldMetas.get("avg_amount").get(0);
        assert txnAvgAmount.field().equals(Transaction.class.getField("avgAmount"));

        // _WindowedFeatures_1d_30d
        assert memo.containsKey(_WindowedFeatures_1d_30d.class);
        var windowedMemo = memo.get(_WindowedFeatures_1d_30d.class);
        FieldMeta windowed1d = windowedMemo.resolvedNameToFieldMetas.get("__86400__").get(0);
        assert windowed1d.field().equals(_WindowedFeatures_1d_30d.class.getField("bucket1d"));

        FieldMeta windowed30d = windowedMemo.resolvedNameToFieldMetas.get("__2592000__").get(0);
        assert windowed30d.field().equals(_WindowedFeatures_1d_30d.class.getField("bucket30d"));
    }
}


