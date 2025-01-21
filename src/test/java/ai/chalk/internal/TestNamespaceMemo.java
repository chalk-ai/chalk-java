package ai.chalk.internal;

import ai.chalk.internal.test_features.Transaction;
import ai.chalk.internal.test_features.User;
import ai.chalk.internal.test_features._WindowedFeatures_1d_30d;
import org.junit.jupiter.api.Test;
import ai.chalk.internal.codegen.Initializer;

import java.util.HashMap;
import java.util.HashSet;

public class TestNamespaceMemo {
    private void assertIsScalarFeature(FieldMeta meta) {
        assert meta.isFeature();
        assert !meta.isList();
        assert !meta.isStruct();
        assert !meta.isWindowed();
        assert !meta.isFeaturesClass();
    }

    private void assertIsListFeature(FieldMeta meta) {
        assert meta.isFeature();
        assert meta.isList();
        assert !meta.isStruct();
        assert !meta.isWindowed();
        assert !meta.isFeaturesClass();
    }

    private void assertIsWindowedFeature(FieldMeta meta) {
        assert !meta.isFeature();
        assert !meta.isList();
        assert !meta.isStruct();
        assert meta.isWindowed();
        assert !meta.isFeaturesClass();
    }

    private void assertIsStructFeature(FieldMeta meta) {
        assert !meta.isFeature();
        assert !meta.isList();
        assert meta.isStruct();
        assert !meta.isWindowed();
        assert !meta.isFeaturesClass();
    }

    private void assertIsFeaturesClassFeature(FieldMeta meta) {
        assert !meta.isFeature();
        assert !meta.isList();
        assert !meta.isStruct();
        assert !meta.isWindowed();
        assert meta.isFeaturesClass();
    }


    @Test
    public void TestBuildNamespaceMemo() throws Exception {
        var memo = new HashMap<Class<?>, NamespaceMemoItem>();
        Initializer.buildNamespaceMemo(User.class, memo, new HashSet<>());

        // User
        assert memo.containsKey(User.class);
        var userMemo = memo.get(User.class);
        FieldMeta idMeta = userMemo.resolvedNameToFieldMeta.get("id").get(0);
        assert idMeta.field().equals(User.class.getField("id"));
        assertIsScalarFeature(idMeta);

        FieldMeta nameMeta = userMemo.resolvedNameToFieldMeta.get("name").get(0);
        assert nameMeta.field().equals(User.class.getField("name"));
        assertIsScalarFeature(nameMeta);

        FieldMeta transactionsMeta = userMemo.resolvedNameToFieldMeta.get("transactions").get(0);
        assert transactionsMeta.field().equals(User.class.getField("transactions"));
        assertIsListFeature(transactionsMeta);
        assert transactionsMeta.listUnderlyingClass().equals(Transaction.class);

        FieldMeta accountMeta = userMemo.resolvedNameToFieldMeta.get("account").get(0);
        assert accountMeta.field().equals(User.class.getField("account"));
        assertIsFeaturesClassFeature(accountMeta);

        FieldMeta addressMeta = userMemo.resolvedNameToFieldMeta.get("address").get(0);
        assert addressMeta.field().equals(User.class.getField("address"));
        assertIsStructFeature(addressMeta);

        // Transaction
        assert memo.containsKey(Transaction.class);
        var transactionMemo = memo.get(Transaction.class);
        FieldMeta txnId = transactionMemo.resolvedNameToFieldMeta.get("id").get(0);
        assert txnId.field().equals(Transaction.class.getField("id"));
        assertIsScalarFeature(txnId);

        FieldMeta txnAmount = transactionMemo.resolvedNameToFieldMeta.get("amount").get(0);
        assert txnAmount.field().equals(Transaction.class.getField("amount"));
        assertIsScalarFeature(txnAmount);

        FieldMeta txnName = transactionMemo.resolvedNameToFieldMeta.get("name@2").get(0);
        assert txnName.field().equals(Transaction.class.getField("name"));
        assertIsScalarFeature(txnName);

        FieldMeta txnName2 = transactionMemo.resolvedNameToFieldMeta.get("name@2").get(1);
        assert txnName2.field().equals(Transaction.class.getField("nameV2"));
        assertIsScalarFeature(txnName2);

        FieldMeta txnName3 = transactionMemo.resolvedNameToFieldMeta.get("name@3").get(0);
        assert txnName3.field().equals(Transaction.class.getField("nameV3"));
        assertIsScalarFeature(txnName3);

        FieldMeta txnAvgAmount = transactionMemo.resolvedNameToFieldMeta.get("avg_amount").get(0);
        assert txnAvgAmount.field().equals(Transaction.class.getField("avgAmount"));
        assertIsWindowedFeature(txnAvgAmount);

        // _WindowedFeatures_1d_30d
        assert memo.containsKey(_WindowedFeatures_1d_30d.class);
        var windowedMemo = memo.get(_WindowedFeatures_1d_30d.class);
        FieldMeta windowed1d = windowedMemo.resolvedNameToFieldMeta.get("__86400__").get(0);
        assert windowed1d.field().equals(_WindowedFeatures_1d_30d.class.getField("bucket1d"));
        assertIsScalarFeature(windowed1d);

        FieldMeta windowed30d = windowedMemo.resolvedNameToFieldMeta.get("__2592000__").get(0);
        assert windowed30d.field().equals(_WindowedFeatures_1d_30d.class.getField("bucket30d"));
        assertIsScalarFeature(windowed30d);
    }
}


