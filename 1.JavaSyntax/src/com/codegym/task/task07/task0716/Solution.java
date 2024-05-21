package com.codegym.task.task07.task0716;

import java.util.ArrayList;
import java.util.List;

/*
R or L

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("rose"); // 0
        list.add("love"); // 1
        list.add("lyre"); // 2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        // write your code here
        List<String> wordsToRemove = new ArrayList<String>();
        List<String> wordsToAdd = new ArrayList<String>();

        for (String word : list) {
            if (word.contains("r") && word.contains("l")) {

            } else if (word.contains("r")) wordsToRemove.add(word);
            else if (word.contains("l")) wordsToAdd.add(word);
        }

        list.removeAll(wordsToRemove);
        list.addAll(wordsToAdd);

        return list;
    }
}
