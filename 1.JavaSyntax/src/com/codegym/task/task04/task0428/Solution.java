package com.codegym.task.task04.task0428;

/*
Positive number

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

        int counter = 0;

        if (number1 > 0) counter++;
        if (number2 > 0) counter++;
        if (number3 > 0) counter++;

        System.out.println(counter);

    }
}
