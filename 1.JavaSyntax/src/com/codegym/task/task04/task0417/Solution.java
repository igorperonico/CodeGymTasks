package com.codegym.task.task04.task0417;

/*
Do we have a pair?

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


        if (number1 == number2) {
            System.out.print(number1 + " " + number2);
            if (number1 == number3) {
                System.out.print(" " + number3);
            }
        } else if (number1 == number3) {
            System.out.print(number1 + " " + number3);
        } else if (number2 == number3) {
            System.out.print(number2 + " " + number3);
        }
    }
}
