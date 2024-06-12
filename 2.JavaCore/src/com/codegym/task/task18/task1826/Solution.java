package com.codegym.task.task18.task1826;

/*
Encryption

*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {

        String fileName = args[1];
        String fileOutputName = args[2];

        try (FileInputStream inputStream = new FileInputStream(fileName);
             FileOutputStream outputStream = new FileOutputStream(fileOutputName)) {

            /*	In "-e" mode, the program should encrypt fileName and write the result to fileOutputName.*/
            if (args[0].equals("-e")) {
                while (inputStream.available() > 0) {
                    outputStream.write(inputStream.read() + 1);
                }
            }

            /*    In "-d" mode, the program should decrypt fileName and write the result to fileOutputName.*/
            if (args[0].equals("-d")) {
                while (inputStream.available() > 0) {
                    outputStream.write(inputStream.read() - 1);
                }
            }

        }

    }
}
