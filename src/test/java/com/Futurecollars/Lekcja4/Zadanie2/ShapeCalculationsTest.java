package com.Futurecollars.Lekcja4.Zadanie2;

import com.Futurecollars.Lekcja4.Zadanie2.Circle;
import com.Futurecollars.Lekcja4.Zadanie2.Rectangle;
import com.Futurecollars.Lekcja4.Zadanie2.Square;
import com.Futurecollars.Lekcja4.Zadanie2.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShapeCalculationsTest {
    Square square= new Square();
    @Test
    void SquareNormal() {

    //given
        int a=3;
        // when
        square.a=a;
        // then
        Assertions.assertEquals(9,square.getArea());
    }
    @Test
    void SquareZeroOrMinus()
    {
        int a=-1;
        square.a=a;
        Assertions.assertFalse(square.getArea()<0,"liczba jest rowna 0");

    }

    @Test
    void SquareNormalP() {

        //given
        int a=3;
        // when
        square.a=a;
        // then
        Assertions.assertEquals(12,square.getPerimeter());
    }
    @Test
    void SquareZeroOrMinusP()
    {
        int a=-1;
        square.a=a;
        Assertions.assertFalse(square.getPerimeter()<0,"liczba jest rowna 0");

    }


    Rectangle rectangle = new Rectangle();
    @Test
    void RectangleNormal() {

        //given
        int a=3;
        int b=4;
        // when
        rectangle.a=a;
        rectangle.b=b;

        // then
        Assertions.assertEquals(12,rectangle.getArea());
    }
    @Test
    void RectangleMinusOrZero() {

        //given
        int a=3;
        int b=4;
        // when
        rectangle.a=a;
        rectangle.b=b;

        // then
        Assertions.assertFalse(rectangle.getArea()<=0,"liczba ujemna lub zerowa");
    }

    @Test
    void RectangleNormalP() {

        //given
        int a=3;
        int b=4;
        // when
        rectangle.a=a;
        rectangle.b=b;

        // then
        Assertions.assertEquals(14,rectangle.getPerimeter());
    }
    @Test
    void RectangleMinusOrZeroP() {

        //given
        int a=3;
        int b=4;
        // when
        rectangle.a=a;
        rectangle.b=b;

        // then
        Assertions.assertFalse(rectangle.getPerimeter()<=0,"liczba ujemna lub zerowa");
    }

    Circle circle= new Circle();
    @Test
    void CircleNormal() {

        //given
        int r=3;
        double exp;
        exp=Math.PI*r*r;
        // when
        circle.r=r;
        // then
        Assertions.assertEquals(exp,circle.getArea());
    }
    @Test
    void CircleZeroOrMinus()
    {
        int r=-1;
        circle.r=r;
        Assertions.assertFalse(circle.getArea()<0,"liczba jest rowna 0");

    }

    @Test
    void CircleNormalP() {

        //given
        int r=3;
        double exp;
        exp=Math.PI*2*r;

        // when
        circle.r=r;
        // then
        Assertions.assertEquals(exp,circle.getPerimeter());
    }
    @Test
    void CircleZeroOrMinusP()
    {
        int r=-1;
        circle.r=r;
        Assertions.assertFalse(circle.getPerimeter()<0,"liczba jest rowna 0");

    }

    Triangle triangle = new Triangle();
    @Test
    void TriangleNormal() {

        //given
        int a=3;
        int b=4;
        int c=5;
        // when
        triangle.a=a;
        triangle.b=b;
        triangle.c=c;
        // then
        Assertions.assertEquals(6,triangle.getArea());
    }
    @Test
    void TriangleZeroOrMinus()
    {
        //given
        int a=3;
        int b=4;
        int c=5;
        // when
        triangle.a=a;
        triangle.b=b;
        triangle.c=c;
        // then
        Assertions.assertFalse(triangle.getArea()<0,"liczba jest rowna 0");

    }
    @Test
    void TriangleNormalP() {

        //given
        int a=3;
        int b=4;
        int c=5;
        // when
        triangle.a=a;
        triangle.b=b;
        triangle.c=c;
        // then
        Assertions.assertEquals(12,triangle.getPerimeter());
    }
    @Test
    void TriangleZeroOrMinusP()
    {
        //given
        int a=3;
        int b=4;
        int c=5;
        // when
        triangle.a=a;
        triangle.b=b;
        triangle.c=c;
        // then
        Assertions.assertFalse(triangle.getPerimeter()<0,"liczba jest rowna 0");

    }





}
