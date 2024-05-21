package com.codegym.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/*
Longest sequence

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) numbers.add(Integer.parseInt(reader.readLine()));

        int longestSequence = 1;
        int currentSequence = 1;

        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i - 1).equals(numbers.get(i))) {
                currentSequence++;
            } else if (currentSequence > longestSequence) {
                longestSequence = currentSequence;
                currentSequence = 1;
            } else {
                currentSequence = 1;
            }
        }

        if (currentSequence > longestSequence) {
            longestSequence = currentSequence;
        }

        System.out.println(longestSequence);
    }
}
