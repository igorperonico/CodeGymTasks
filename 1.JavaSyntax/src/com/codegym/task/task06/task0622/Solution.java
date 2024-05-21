package com.codegym.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/*
Ascending numbers

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //write your code here
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            int number = Integer.parseInt(reader.readLine());
            numbers.add(number);
        }
        Collections.sort(numbers);

        for (int number : numbers) System.out.println(number);

    }
}
