package kr.seoul.ftseoul.swingy.view.store;

import java.util.HashMap;

public class StoreImpl implements Store {
    private HashMap<String, Object> store = new HashMap<>();

    private StoreImpl() {
    }

    static final class Holder {
        static final StoreImpl INSTANCE = new StoreImpl();
    }

    public static StoreImpl getInstance() {
        return Holder.INSTANCE;
    }

    @Override
    public void set(String propertyName, Object value) {
        store.put(propertyName, value);
    }

    @Override
    public Object get(String propertyName) {
        return store.get(propertyName);
    }
}
