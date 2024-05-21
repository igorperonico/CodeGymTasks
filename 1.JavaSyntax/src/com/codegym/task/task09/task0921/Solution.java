package com.codegym.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Method in a try-catch

*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> numbers = new ArrayList<>();
         try {
             while (true) {
                 numbers.add(Integer.parseInt(reader.readLine()));
             }
         } catch (Exception e) {
             for (Integer number :numbers) {
                 System.out.println(number);
             }
         }
    }
}