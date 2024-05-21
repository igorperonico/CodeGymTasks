package com.codegym.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


/*
Shortest or longest

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        ArrayList<String> strings = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
        }
        ArrayList<String> longest = new ArrayList<>();
        longest.add(strings.get(0));
        int longestIndex = 0;

        for (int i = 1; i < strings.size(); i++) {
            if (longest.get(0).length() < strings.get(i).length()) {
                longest.clear();
                longest.add(strings.get(i));
                longestIndex = i;
            } else if (longest.get(0).length() == strings.get(i).length()) {
                longest.add(strings.get(i));
            }
        }

        ArrayList<String> shortest = new ArrayList<>();
        shortest.add(strings.get(0));
        int shortestIndex = 0;

        for (int i = 1; i < strings.size(); i++) {
            if (shortest.get(0).length() > strings.get(i).length()) {
                shortest.clear();
                shortest.add(strings.get(i));
                shortestIndex = i;
            } else if (shortest.get(0).length() == strings.get(i).length()) {
                shortest.add(strings.get(i));
            }
        }


        System.out.println("Shortest: " + shortest.get(0) + " Index: " + shortestIndex);
        System.out.println("Longest: " + longest.get(0) + " Index: " + longestIndex);

        if (shortestIndex < longestIndex) System.out.println(shortest.get(0));
        else System.out.println(longest.get(0));
    }
}
