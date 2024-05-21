package com.codegym.task.task18.task1807;

/*
Counting commas

*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        /*Read a file name from the console.*/
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();


        /*Count the number of commas (',') in the file.*/
        int commaCount = 0;

        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            while (fileInputStream.available() > 0)
                if (fileInputStream.read() == 44) commaCount++;
        }

        /*Display the number.*/

        System.out.println(commaCount);

    }
}
