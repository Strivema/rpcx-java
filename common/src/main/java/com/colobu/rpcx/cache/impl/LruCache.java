package com.colobu.rpcx.cache.impl;


import com.colobu.rpcx.cache.Cache;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LruCache implements Cache {
    
    private final Map<Object, Object> store;

    public LruCache() {
        final int max = 1000;
        this.store = new LinkedHashMap<Object, Object>() {
            private static final long serialVersionUID = -3834209229668463829L;
            @Override
            protected boolean removeEldestEntry(Entry<Object, Object> eldest) {
                return size() > max;
            }
        };
    }

    public void put(Object key, Object value) {
        synchronized (store) {
            store.put(key, value);
        }
    }

    public Object get(Object key) {
        synchronized (store) {
            return store.get(key);
        }
    }

}