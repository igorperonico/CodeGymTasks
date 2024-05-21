package com.codegym.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/*
Maximum byte

*/

public class Solution {
    public static void main(String[] args) throws Exception {

        /*Enter a file name from the console.*/
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileInputStream inputStream = new FileInputStream(fileName);
        long max = 0;

        /*Find the maximum byte in the file. Display it on the screen.*/
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            if (data > max) max = data;

        }
        System.out.println(max);

        /*Close the IO stream.*/
        inputStream.close();
        reader.close();


    }
}
