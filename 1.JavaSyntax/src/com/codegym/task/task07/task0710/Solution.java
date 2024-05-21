package com.codegym.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
To the top of the list

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        List<String> strings = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            strings.add(0, reader.readLine());
        }

        for (String string : strings) {
            System.out.println(string);
        }

    }
}
