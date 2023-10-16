package com.Futurecollars.Lekcja4.Zadanie8;

public class PersonPrinting {
    public static void main(String[] args) {
        Person person = new Person("Jacek", "Kowalski");
        Person person1= new Person("Marian","Kiepski");
        Person person2= new Person("Jacek", "Kowalski");
        System.out.println(person.equals(person1));
        System.out.println(person.equals(person2));
    }
}
