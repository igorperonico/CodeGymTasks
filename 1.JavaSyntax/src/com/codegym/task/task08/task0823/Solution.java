package com.codegym.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Going national

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //write your code here

        StringBuilder result = new StringBuilder();
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            char upperCase = (i == 0 || array[i - 1] == ' ') ? Character.toUpperCase(array[i]) : array[i];

            result.append(upperCase);
        }

        System.out.println(result);

    }
}

