package com.codegym.task.task07.task0702;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

/*
String array in reverse order

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        String[] array = new String[10];
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < array.length; i++) {
            array[i] = in.readLine();
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println(array[i]);
        }

    }
}
