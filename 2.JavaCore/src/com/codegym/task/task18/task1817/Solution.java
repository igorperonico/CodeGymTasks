package com.codegym.task.task18.task1817;

/*
Spaces

*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {

        //The first parameter of the main method is a file name.
        String fileName = args[0];

        //Display the ratio of the number of spaces to the number of all characters.
        int characters = 0;
        int spaces = 0;

        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            while (fileInputStream.available() > 0) {

                //1. Count all the characters (n1).
                characters++;
                if (Character.isSpaceChar(fileInputStream.read())) {
                    //2. Count the number of spaces (n2).
                    spaces++;
                }
            }
        }

        //3. Display n2/n1*100, rounding to 2 decimal places.

        if (characters != 0) {
            double ratio = (double) spaces / characters * 100;
            System.out.printf("%.2f", ratio);
        }

    }
}
