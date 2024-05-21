package com.codegym.task.task05.task0507;

/*
Arithmetic mean

*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        Double sum = 0.0;
        int count = 0;
        Double result = 0.0;
        while (true) {
            int number = scanner.nextInt();
            if (number == -1) {
                result = sum / count;
                System.out.println(result);
                break;
            }
            sum += number;
            count++;
        }
    }
}
