package com.codegym.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Flip the array

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        int[] numbers = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < numbers.length; i++) numbers[i] = Integer.parseInt(reader.readLine());
        for (int i = numbers.length - 1; i >= 0; i--) System.out.println(numbers[i]);

    }
}
