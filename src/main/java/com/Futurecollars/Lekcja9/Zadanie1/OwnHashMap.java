package com.Futurecollars.Lekcja9.Zadanie1;

import java.util.ArrayList;
import java.util.List;

public class OwnHashMap implements OwnMap{

    private final List<MapElement> mapElements;
    public OwnHashMap()
    {
        this.mapElements =  new ArrayList<>();
    }

    @Override
    public boolean put(String key, Integer value) {
        for (MapElement mapElement : mapElements)
        {
            if(mapElement.key.equals(key))
            {
                mapElement.value=value;
                return true;
            }
        }
        mapElements.add(new MapElement(key, value));
        return true;
    }

    @Override
    public boolean containsKey(String key) {
        for (MapElement mapElement : mapElements)
        {
            if(mapElement.key.equals(key))
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        for (MapElement mapElement : mapElements)
        {
            if(mapElement.value.equals(value))
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public Integer remove(String key) {
        for (MapElement mapElement : mapElements)
        {
            if(mapElement.key.equals(key))
            {   Integer removedValue = mapElement.value;
                mapElements.remove(mapElement);
                return removedValue;
            }
        }
        return null;
    }

    @Override
    public Integer get(String key) {
        for (MapElement mapElement : mapElements) {
            if (mapElement.key.equals(key)) {
                return mapElement.value;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        OwnHashMap map = new OwnHashMap();

        map.put("key1", 1);
        map.put("key2", 2);

        System.out.println("Contains key 'key1': " + map.containsKey("key1"));
        System.out.println("Contains value 'value2': " + map.containsValue("value2"));

        System.out.println("Get value for 'key2': " + map.get("key2"));

        System.out.println("Remove 'key1', removed value: " + map.remove("key1"));

        System.out.println("Contains key 'key1' after removal: " + map.containsKey("key1"));
    }
}
