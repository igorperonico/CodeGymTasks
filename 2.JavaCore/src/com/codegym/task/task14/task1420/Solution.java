package com.codegym.task.task14.task1420;

/*
GCD

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Solution {
    public static void main(String[] args) throws Exception {

        /*Enter 2 positive integers from the keyboard.*/
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        Integer number1 = Integer.parseInt(reader.readLine());
        Integer number2 = Integer.parseInt(reader.readLine());

        /*Display the greatest common divisor.*/
        System.out.println(greatestCommonDivisor(number1, number2));


    }

    private static int greatestCommonDivisor(Integer number1, Integer number2) {
        if (number1 < 1 || number2 < 1) throw new IllegalArgumentException();

        int greatest = number1;

        if (number1 < number2) {
            for (int i = number1; i > 0; i--) {
                if (number1 % i == 0 && number2 % i == 0) {
                    greatest = i;
                    break;
                }
            }
        } else {
            for (int i = number2; i > 0; i--) {
                if (number2 % i == 0 && number1 % i == 0) {
                    greatest = i;
                    break;
                }
            }
        }

        return greatest;
    }
}
