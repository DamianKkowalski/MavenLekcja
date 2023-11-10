package com.Futurecollars.Lekcja9.Zadanie5;

public class BubbleSort<T extends Comparable<T>> {

    public void sort(T[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    // Zamiana miejscami
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Przykład użycia
        Integer[] arrayToSort = {15, 44, 111, 1123, 1, 767, 123, -1};

        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        bubbleSort.sort(arrayToSort);

        // Wyświetlenie posortowanej tablicy
        System.out.print("Posortowana tablica: ");
        for (int num : arrayToSort) {
            System.out.print(num + " ");
        }
    }
}