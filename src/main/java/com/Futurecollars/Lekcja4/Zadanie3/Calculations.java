package com.Futurecollars.Lekcja4.Zadanie3;

public class Calculations {

    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        circle.setR(3);
        System.out.println("Pole okregu "+circle.getArea()+" Obwod okregu "+circle.getParimeter());
        rectangle.setA(4);
        rectangle.setB(5);
        System.out.println("Pole prostokata "+rectangle.getArea()+" Obwod prostokata "+rectangle.getParimeter());
    }

}
