package com.codegym.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/*
What's today's date?

*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String  entryDate = reader.readLine();

        Date date = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).parse(entryDate);

        SimpleDateFormat dateft = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);

        System.out.println(dateft.format(date).toUpperCase());

    }
}
