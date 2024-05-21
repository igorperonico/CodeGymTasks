package com.codegym.task.task04.task0427;

/*
Describing numbers

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > 0 && number < 10) {
            if (number % 2 == 0) System.out.println("even single-digit number");
            else System.out.println("odd single-digit number");
        } else if (number >= 10 && number < 100) {
            if (number % 2 == 0) System.out.println("even two-digit number");
            else System.out.println("odd two-digit number");
        } else if (number >= 100 && number < 1000) {
            if (number % 2 == 0) System.out.println("even three-digit number");
            else System.out.println("odd three-digit number");
        }

    }
}

