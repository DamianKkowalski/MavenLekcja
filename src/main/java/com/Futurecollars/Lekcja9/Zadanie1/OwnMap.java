package com.Futurecollars.Lekcja9.Zadanie1;

public interface OwnMap {

    boolean put(String key, Integer value);
    boolean containsKey(String key);
    boolean containsValue(Object value);

    /**
     * @param key key for which (key, value) entry will be removed
     * @return value for given key
     */
    Integer remove(String key);

    /**
     * Return value for given key
     */
    Integer get(String key);
}