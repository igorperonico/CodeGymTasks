package com.codegym.task.task10.task1006;

/*
Task No. 6 about integer type conversions

*/

public class Solution {
    public static void main(String[] args) {
        double d =  (short) 2.50256e2d;
        char c = 'd';
        short s = (short) 2.22;
        int i = 150000;
        float f = 0.50f;
        double result = f + (i / c) - (d * s) - 500e-3;
        System.out.println("result: " + result);
    }
}
