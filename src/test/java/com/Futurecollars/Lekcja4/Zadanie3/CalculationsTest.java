package com.Futurecollars.Lekcja4.Zadanie3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculationsTest {

    @Test
    void CircleNormal() {
        Circle circle = new Circle();
        //given
        int r = 3;
        double exp;
        exp = Math.PI * r * r;
        // when
        circle.setR(r);
        // then
        Assertions.assertEquals(exp, circle.getArea());
    }

    @Test
    void CircleZeroOrMinus() {
        Circle circle = new Circle();
        int r = -1;
        circle.setR(r);
        Assertions.assertFalse(circle.getArea() < 0, "liczba jest rowna 0");

    }

    @Test
    void CircleNormalP() {
        Circle circle = new Circle();
        //given
        int r = 3;
        double exp;
        exp = Math.PI * 2 * r;

        // when
        circle.setR(r);
        // then
        Assertions.assertEquals(exp, circle.getParimeter());
    }

    @Test
    void CircleZeroOrMinusP() {
        Circle circle = new Circle();
        int r = -1;
        circle.setR(r);
        Assertions.assertFalse(circle.getParimeter() < 0, "liczba jest rowna 0");

    }


    @Test
    void RectangleNormal() {
        Rectangle rectangle = new Rectangle();
        //given
        int a = 3;
        int b = 4;
        // when
        rectangle.setA(a);
        rectangle.setB(b);

        // then
        Assertions.assertEquals(12, rectangle.getArea());
    }

    @Test
    void RectangleMinusOrZero() {
        Rectangle rectangle = new Rectangle();
        //given
        int a = 3;
        int b = 4;
        // when
        rectangle.setA(a);
        rectangle.setB(b);
        // then
        Assertions.assertFalse(rectangle.getArea() <= 0, "liczba ujemna lub zerowa");
    }

    @Test
    void RectangleNormalP() {
        Rectangle rectangle = new Rectangle();
        //given
        int a = 3;
        int b = 4;
        // when
        rectangle.setA(a);
        rectangle.setB(b);

        // then
        Assertions.assertEquals(14, rectangle.getParimeter());
    }

    @Test
    void RectangleMinusOrZeroP() {
        Rectangle rectangle = new Rectangle();
        //given
        int a = 3;
        int b = 4;
        // when
        rectangle.setA(a);
        rectangle.setB(b);

        // then
        Assertions.assertFalse(rectangle.getParimeter() <= 0, "liczba ujemna lub zerowa");
    }
}
