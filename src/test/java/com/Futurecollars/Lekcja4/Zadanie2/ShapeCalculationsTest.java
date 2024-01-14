package com.Futurecollars.Lekcja4.Zadanie2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShapeCalculationsTest {

    @Test
    void rectangleNormal() {
        RectangleAndSquare rectangle = new RectangleAndSquare();
        //given
        int a = 3;
        int b = 4;
        // when
        rectangle.a = a;
        rectangle.b = b;

        // then
        Assertions.assertEquals(12, rectangle.getArea());
    }

    @Test
    void rectangleMinusOrZero() {
        RectangleAndSquare rectangle = new RectangleAndSquare();
        //given
        int a = 3;
        int b = 4;
        // when
        rectangle.a = a;
        rectangle.b = b;

        // then
        Assertions.assertFalse(rectangle.getArea() <= 0, "liczba ujemna lub zerowa");
    }

    @Test
    void rectangleNormalP() {
        RectangleAndSquare rectangle = new RectangleAndSquare();
        //given
        int a = 3;
        int b = 4;
        // when
        rectangle.a = a;
        rectangle.b = b;

        // then
        Assertions.assertEquals(14, rectangle.getPerimeter());
    }

    @Test
    void rectangleMinusOrZeroP() {
        RectangleAndSquare rectangle = new RectangleAndSquare();
        //given
        int a = 3;
        int b = 4;
        // when
        rectangle.a = a;
        rectangle.b = b;

        // then
        Assertions.assertFalse(rectangle.getPerimeter() <= 0, "liczba ujemna lub zerowa");
    }


    @Test
    void circleNormal() {
        Circle circle = new Circle();
        //given
        int r = 3;
        double exp;
        exp = Math.PI * r * r;
        // when
        circle.r = r;
        // then
        Assertions.assertEquals(exp, circle.getArea());
    }

    @Test
    void circleZeroOrMinus() {
        Circle circle = new Circle();
        int r = -1;
        circle.r = r;
        Assertions.assertFalse(circle.getArea() < 0, "liczba jest rowna 0");

    }

    @Test
    void circleNormalP() {
        Circle circle = new Circle();
        //given
        int r = 3;
        double exp;
        exp = Math.PI * 2 * r;

        // when
        circle.r = r;
        // then
        Assertions.assertEquals(exp, circle.getPerimeter());
    }

    @Test
    void circleZeroOrMinusP() {
        Circle circle = new Circle();
        int r = -1;
        circle.r = r;
        Assertions.assertFalse(circle.getPerimeter() == 0, "liczba jest rowna 0");

    }


    @Test
    void triangleNormal() {
        Triangle triangle = new Triangle();
        //given
        int a = 3;
        int b = 4;
        int c = 5;
        // when
        triangle.a = a;
        triangle.b = b;
        triangle.c = c;
        // then
        Assertions.assertEquals(6, triangle.getArea());
    }

    @Test
    void triangleZeroOrMinus() {
        Triangle triangle = new Triangle();
        //given
        int a = 3;
        int b = 4;
        int c = 5;
        // when
        triangle.a = a;
        triangle.b = b;
        triangle.c = c;
        // then
        Assertions.assertFalse(triangle.getArea() < 0, "liczba jest rowna 0");

    }

    @Test
    void triangleNormalP() {
        Triangle triangle = new Triangle();
        //given
        int a = 3;
        int b = 4;
        int c = 5;
        // when
        triangle.a = a;
        triangle.b = b;
        triangle.c = c;
        // then
        Assertions.assertEquals(12, triangle.getPerimeter());
    }

    @Test
    void triangleZeroOrMinusP() {
        Triangle triangle = new Triangle();
        //given
        int a = 3;
        int b = 4;
        int c = 5;
        // when
        triangle.a = a;
        triangle.b = b;
        triangle.c = c;
        // then
        Assertions.assertFalse(triangle.getPerimeter() < 0, "liczba jest rowna 0");

    }


}
