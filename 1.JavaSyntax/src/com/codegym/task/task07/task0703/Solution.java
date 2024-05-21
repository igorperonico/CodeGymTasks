package com.codegym.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Lonely arrays interact

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        String[] strings = new String[10];
        int[] numbers = new int[10];

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < strings.length; i++) strings[i] = in.readLine();
        for (int i = 0; i < numbers.length; i++) {
            char[] stringsLength = strings[i].toCharArray();
            numbers[i] = stringsLength.length;
            System.out.println(numbers[i]);
        }

    }
}
