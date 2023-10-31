package com.Futurecollars.Lekcja8.Zadanie1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Names {
    public static void main(String[] args) {
        List<String> listNames = new ArrayList<>();
        listNames.add("Anna");
        listNames.add("Katarzyna");
        listNames.add("Tymon");
        listNames.add("Tadeusz");
        listNames.add("Anna");
        listNames.add("Karolina");
        listNames.add("Dorota");
        listNames.add("Piotr");

        List<String> uniqueNames = listNames.stream().distinct().collect(Collectors.toList());
        System.out.println("Lista bez duplitkatow: "+uniqueNames );
        Collections.reverse(listNames);
        System.out.println("Lista imion w odwrotnej kolejnosci "+ listNames);
        changeNames(listNames,"Anna","Joanna");
        System.out.println("Elementy po zmianie : Anna -> Joanna:\n"+listNames);
    }
    public static void changeNames(List<String> listNames, String oldName, String newName)
    {
        for(int i = 0; i < listNames.size(); i++)
        {
            if (listNames.get(i).equals(oldName))
            {
                listNames.set(i,newName);
            }
        }
    }
}
