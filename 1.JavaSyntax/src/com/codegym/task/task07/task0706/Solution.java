package com.codegym.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Streets and houses

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        int[] numbers = new int[15];
        int odd = 0;
        int even = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
            if (i % 2 == 0) even += numbers[i];
            else odd += numbers[i];
        }

        if (odd > even) System.out.println("Odd-numbered houses have more residents.");
        else if (even > odd) System.out.println("Even-numbered houses have more residents.");
    }
}
