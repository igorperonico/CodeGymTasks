package com.codegym.task.task06.task0612;

/*
Calculator

*/

import java.text.DecimalFormat;

public class Calculator {
    public static int plus(int a, int b) {
        //write your code here
        return a + b;
    }

    public static int minus(int a, int b) {
        //write your code here
        return a - b;
    }

    public static int multiply(int a, int b) {
        //write your code here
        return a * b;
    }

    public static double divide(int a, int b) {
        //write your code here
        DecimalFormat df = new DecimalFormat("#.0");
        return (double) a / b;
    }

    public static double percent(int a, int b) {
        //write your code here
        return  a * ((double) b/100);
    }

    public static void main(String[] args) {
        System.out.println(divide(100,3));
    }
}
