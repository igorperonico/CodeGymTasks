package com.codegym.task.task18.task1820;

/*
Rounding numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        /*Read 2 file names from the console.*/
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        /*Create an input stream for the first file.
          Create an output stream for the second file*/

        try (BufferedReader bufferedFileReader = new BufferedReader(new FileReader(file1));
             FileOutputStream fileOutputStream = new FileOutputStream(file2, true)) {
            /*Read the numbers from the first file,
            round them, and write them to the second file, separated by spaces.*/
            while(bufferedFileReader.ready()) {
                String[] input = bufferedFileReader.readLine().split(" ");
                for(String numberInString: input) {
                    double number = Double.parseDouble(numberInString);
                    fileOutputStream.write(((int) Math.round(number) + " ").getBytes());
                }

            }

        }

    }
}
