package com.codegym.task.task04.task0426;

/*
Labels and numbers

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > 0) {
            if (number % 2 == 0) System.out.println("Positive even number");
            else System.out.println("Positive odd number");
        } else if (number < 0) {
            if (number % 2 == 0) System.out.println("Negative even number");
            else System.out.println("Negative odd number");
        } else System.out.println("Zero");

    }
}
