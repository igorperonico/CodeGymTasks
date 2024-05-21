package com.codegym.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
The end

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //write your code here
        ArrayList<String> strings = new ArrayList<String>();
        /*String temporary = "";

        while (!(temporary.equals("end"))) {
            temporary = reader.readLine();
            strings.add(temporary);
        }
        strings.removeIf(string -> string.equals("end"));*/

        while(true) {
            String temp = reader.readLine();

            if(temp.equals("end")) break;

            strings.add(temp);
        }

        for (String string : strings) System.out.println(string);
    }
}
