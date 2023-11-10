package com.Futurecollars.Lekcja9.Zadanie4;

public class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
    public static void main(String[] args) {
        // Przykład użycia
        Pair<String, Integer> pair = new Pair<>("klucz", 42);
        System.out.println("Key: " + pair.getKey());
        System.out.println("Value: " + pair.getValue());
    }
}
