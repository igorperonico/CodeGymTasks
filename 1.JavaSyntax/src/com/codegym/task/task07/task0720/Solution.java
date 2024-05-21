package com.codegym.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Shuffled just in time

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //write your code here
        ArrayList<String> strings = new ArrayList<String>();

        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());

        for (int i = 0; i < N; i++) strings.add(reader.readLine());

        for (int i = 0; i < M; i++) {
            String temporary = strings.get(0);
            strings.remove(0);
            strings.add(temporary);
        }

        for (String string : strings) System.out.println(string);

    }
}
