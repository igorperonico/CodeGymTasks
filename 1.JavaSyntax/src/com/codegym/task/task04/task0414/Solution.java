package com.codegym.task.task04.task0414;

/*
Number of days in the year

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();
        int x = 365;

        if (year % 4 == 0) {
            x = 366;
            if (year % 100 == 0 && !(year % 400 == 0)) {
                x = 365;
            }
        }

        System.out.println("Number of days in the year: " + x);
    }
}