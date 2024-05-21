package com.codegym.task.task04.task0429;

/*
Positive and negative numbers

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        int counterNegative = 0;
        int counterPositive = 0;

        if (number1 > 0) counterPositive++;
        else if (number1 < 0) counterNegative++;

        if (number2 > 0) counterPositive++;
        else if (number2 < 0) counterNegative++;

        if (number3 > 0) counterPositive++;
        else if (number3 < 0) counterNegative++;

        System.out.println("Number of negative numbers: " + counterNegative);
        System.out.println("Number of positive numbers: " + counterPositive);
    }
}
