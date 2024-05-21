package com.codegym.task.task05.task0532;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Task about algorithms

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbers = new ArrayList<Integer>();
        int n = Integer.parseInt(reader.readLine());

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int number = Integer.parseInt(reader.readLine());
                numbers.add(number);
            }
            int maximum = Collections.max(numbers);

            System.out.println(maximum);
        }

    }
}
