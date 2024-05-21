package com.codegym.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Number of letters

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Alphabet
        String abc = "abcdefghijklmnopqrstuvwxyz";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<>();
        for (char letter : abcArray) {
            alphabet.add(letter);
        }

        // Read in strings
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        // write your code here
        for (int i = 0; i < alphabet.size(); i++){
            int sum = 0;
            for (String string: list) {
                char[] letter = string.toCharArray();
                for (int j = 0; j < letter.length; j++) {
                    if (alphabet.get(i) == letter[j]) sum++;
                }
            }
            System.out.println(alphabet.get(i) + " " + sum);
        }

    }

}
