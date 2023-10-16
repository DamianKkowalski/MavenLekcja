package com.Futurecollars.Lekcja4.Zadanie2;

public class ShapeCalculations
{
    public static void main(String[] args) {
        Square squre= new Square();
        Triangle triangle = new Triangle();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        squre.a=2;
        triangle.a=3;
        triangle.b=2;
        triangle.c=3;
        circle.r=3;
        rectangle.a=4;
        rectangle.b=5;

        System.out.println("Kwadrat Pole "+squre.getArea()+", obwód "+squre.getPerimeter());
        System.out.println("Trojkat Pole "+triangle.getArea()+", obwód "+triangle.getPerimeter());
        System.out.println("Kolo Pole "+circle.getArea()+", obwód "+circle.getPerimeter());
        System.out.println("Prostokat Pole "+rectangle.getArea()+", obwód "+rectangle.getPerimeter());

    }
}
