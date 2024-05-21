package com.codegym.task.task04.task0442;

/*
Adding

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int number = in.nextInt();
            if (number == -1) {
                System.out.println(sum);
                break;
            }
            sum += number;
        }
    }
}
