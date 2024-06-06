package com.codegym.task.task18.task1816;

/*
ABCs

*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {

        //The first parameter of the main method is a file name.
        String fileName = args[0];
        //Count the letters of the English alphabet in the file.
        int countLetters = 0;

        try(FileInputStream fileInputStream = new FileInputStream(fileName)) {
            while(fileInputStream.available() > 0) {
                if(Character.isLetter(fileInputStream.read())) {
                    countLetters++;
                }
            }
        }

        //Display the number of letters.
        System.out.println(countLetters);

        //Close the streams.



    }
}
