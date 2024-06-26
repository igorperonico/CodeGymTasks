package com.codegym.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Longest string

*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        //write your code here

        strings = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) strings.add(reader.readLine());

        ArrayList<String> longest = new ArrayList<>();
        longest.add(strings.get(0));

        for (int i = 1; i < strings.size(); i++) {
            if (longest.get(0).length() < strings.get(i).length()) {
                longest.clear();
                longest.add(strings.get(i));
            } else if (longest.get(0).length() == strings.get(i).length()) {
                longest.add(strings.get(i));
            }
        }

        for (String string : longest) {
            System.out.println(string);
        }
    }
}
