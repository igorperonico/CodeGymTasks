package com.codegym.task.task06.task0609;

/*
Distance between two points

*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        //write your code here
        int b = x1 - x2;
        int c = y1 - y2;

        return Math.sqrt(b * b + c * c);
    }

    public static void main(String[] args) {

    }
}
