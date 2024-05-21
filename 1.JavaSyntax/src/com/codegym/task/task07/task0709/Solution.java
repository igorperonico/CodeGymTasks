package com.codegym.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Expressing ourselves more concisely

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        List<String> strings = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }

        List<String> shortest = new ArrayList<>();
        shortest.add(strings.get(0));

        for (int i = 1; i < strings.size(); i++) {
            if (shortest.get(0).length() > strings.get(i).length()) {
                shortest.clear();
                shortest.add(strings.get(i));
            } else if (shortest.get(0).length() == strings.get(i).length()) {
                shortest.add(strings.get(i));
            }
        }

        for (String string : shortest) {
            System.out.println(string);
        }
    }
}
