package com.codegym.task.task04.task0418;

/*
Minimum of two numbers

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if (number1 == number2) {
            System.out.println(number1);
        } else if (number1 < number2) {
            System.out.println(number1);
        } else {
            System.out.println(number2);
        }
    }
}
