package com.codegym.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
Month number

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> months = new ArrayList<String>(Arrays.asList("January",
                "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December"));

        String month = reader.readLine();
        int index = 0;
        if (months.contains(month)) {
            index = months.indexOf(month) + 1;
            System.out.println(month + " is month " + index);
        } else {
            System.out.println(month + " is not a month!");
        }

    }
}
