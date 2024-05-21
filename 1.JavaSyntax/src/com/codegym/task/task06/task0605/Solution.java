package com.codegym.task.task06.task0605;

import java.io.*;
import java.util.Scanner;

/*
Even and odd digits

*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        char[] numbers = number.toCharArray();

        for (int i = 0; i < numbers.length; i++) {
            if (Character.getNumericValue(numbers[i]) % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
