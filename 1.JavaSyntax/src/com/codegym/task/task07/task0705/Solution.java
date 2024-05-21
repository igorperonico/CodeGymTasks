package com.codegym.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
One large array and two small ones

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        int[] numbers = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < numbers.length; i++) numbers[i] = Integer.parseInt(reader.readLine());

        int[] array1 = new int[10];
        int[] array2 = new int[10];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = numbers[i];
            array2[i] = numbers[i + 10];
            System.out.println(array2[i]);
        }
    }
}
