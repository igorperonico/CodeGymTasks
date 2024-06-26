package com.codegym.task.task04.task0409;

/*
Closest to 10

*/

public class Solution {
    public static void main(String[] args) {
        displayClosestToTen(8, 11);
        displayClosestToTen(7, 14);
        displayClosestToTen(9,11);
    }

    public static void displayClosestToTen(int a, int b) {
        // write your code here
        if (abs(a - 10) < abs(b - 10))
            System.out.println(a);
        else if (abs(a - 10) > abs(b - 10))
            System.out.println(b);
        else
            System.out.println(a);
    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}
