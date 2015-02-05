package jp.co.jizai.sample;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by akira on 15/02/04.
 */
public class TaxPayerBailoutDbImpl implements TaxPayerBailoutDB {
    private final Map<String, TaxPayerRecord> db;

    public TaxPayerBailoutDbImpl(int size) {
        db = Collections.synchronizedMap(new HashMap<String, TaxPayerRecord>(size));
    }

    @Override
    public TaxPayerRecord get(String id) {
        return db.get(id);
    }

    @Override
    public TaxPayerRecord add(String id, TaxPayerRecord record) {
        TaxPayerRecord old = db.put(id, record);

        //TODO 意図不明
        if (old != null) {
            // restore old TaxPayerRecord
            old = db.put(id, old);
        }
        return old;
    }

    @Override
    public TaxPayerRecord remove(String id) {
        return db.remove(id);
    }

    @Override
    public int size() {
        return db.size();
    }
}
