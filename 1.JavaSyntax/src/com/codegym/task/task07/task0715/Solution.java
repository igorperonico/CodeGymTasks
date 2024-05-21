package com.codegym.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/*
More Sam-I-Am

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        ArrayList<String> words = new ArrayList<>();
        Collections.addAll(words, "Sam", "I", "Am");

        for (int i = 1; i <= words.size(); i += 2) words.add(i, "Ham");

        for (String word : words) System.out.println(word);
    }
}
