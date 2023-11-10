package com.Futurecollars.Lekcja9.Zadanie1;

import java.util.ArrayList;
import java.util.List;

public class OwnHashMap implements OwnMap{

    private final List<Basic> basics;
    public OwnHashMap()
    {
        this.basics =  new ArrayList<>();
    }

    @Override
    public boolean put(String key, String value) {
        for (Basic basic : basics)
        {
            if(basic.key.equals(key))
            {
                basic.value=value;
                return true;
            }
        }
        basics.add(new Basic(key, value));
        return true;
    }

    @Override
    public boolean containsKey(String key) {
        for (Basic basic : basics)
        {
            if(basic.key.equals(key))
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        for (Basic basic : basics)
        {
            if(basic.value.equals(value))
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public String remove(String key) {
        for (Basic basic : basics)
        {
            if(basic.key.equals(key))
            {   String removedValue = basic.value;
                basics.remove(basic);
                return removedValue;
            }
        }
        return null;
    }

    @Override
    public String get(String key) {
        for (Basic basic : basics) {
            if (basic.key.equals(key)) {
                return basic.value;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        OwnHashMap map = new OwnHashMap();

        map.put("key1", "value1");
        map.put("key2", "value2");

        System.out.println("Contains key 'key1': " + map.containsKey("key1"));
        System.out.println("Contains value 'value2': " + map.containsValue("value2"));

        System.out.println("Get value for 'key2': " + map.get("key2"));

        System.out.println("Remove 'key1', removed value: " + map.remove("key1"));

        System.out.println("Contains key 'key1' after removal: " + map.containsKey("key1"));
    }
}
