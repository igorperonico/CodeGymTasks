package com.codegym.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Changing functionality

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        for (int i = 0; i < list.size(); i++) {
            int lenght = list.get(i).length();
            String string = list.get(i);
            String newString = "";
            if (lenght % 2 == 0) {
                for (int j = 0; j < 2; j++) {
                    newString += string + " ";
                }
            } else {
                for (int j = 0; j < 3; j++) {
                    newString += string + " ";
                }
            }
            list.set(i, newString);
        }

        for (String string : list) {
            System.out.println(string);
        }

    }
}
