package com.codegym.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Checking the order

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < 10; i++) list.add(reader.readLine());

        int wordLength = list.get(0).length();

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).length() <= wordLength) {
                System.out.println(i);
                break;
            }
            else wordLength = list.get(i).length();
        }

    }
}
