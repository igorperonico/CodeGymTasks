package com.codegym.task.task18.task1810;

/*
DownloadException

*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {

        /*1 Read file names from the console.*/
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        /*2 If the file is less than 1000 bytes, then:*/
        /*2.1 Close the file stream.*/
        /*2.2. Throw a DownloadException.*/

        while (true) {
            String fileName = reader.readLine();

            try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
                if (fileInputStream.available() < 1000 ) throw new DownloadException();
            }
        }
    }

    public static class DownloadException extends Exception {

    }
}

