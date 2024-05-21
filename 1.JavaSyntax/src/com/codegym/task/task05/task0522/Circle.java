package com.codegym.task.task05.task0522;

/*
Max constructors

*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    //write your code here


    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(double x, double y) {
        this(x, y, 10);
    }

    public Circle(double x) {
        this(x, 5, 5);
    }

    public Circle() {
        this(10,5, 10);
    }



    public static void main(String[] args) {

    }
}
