package com.codegym.task.task09.task0919;

/*
Dividing by zero

*/

public class Solution {

    public static void main(String[] args) {
        try {
            divideByZero();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void divideByZero() throws Exception {

        System.out.println(2 / 0);
    }
}
