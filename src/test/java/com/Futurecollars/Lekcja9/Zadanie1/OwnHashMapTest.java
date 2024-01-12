package com.Futurecollars.Lekcja9.Zadanie1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class OwnHashMapTest {

    @Test
    void putAndGetElement() {
        OwnHashMap hashMap = new OwnHashMap();
        hashMap.put("one", 1);

        assertEquals(1, hashMap.get("one"));
    }
    @Test
    void overrideExistingElement() {
        OwnHashMap hashMap = new OwnHashMap();
        hashMap.put("one", 1);
        hashMap.put("key", 1);
        hashMap.put("key", 2);

        assertEquals(2, hashMap.get("key"));
    }
    @Test
    void getElementNotFound() {
        OwnHashMap hashMap = new OwnHashMap();
        assertNull(hashMap.get("nonexistent"));
    }
    @Test
    void removeElement() {
        OwnHashMap hashMap = new OwnHashMap();
        hashMap.put("key", 1);
        hashMap.remove("key");

        assertNull(hashMap.get("key"));
    }
}
