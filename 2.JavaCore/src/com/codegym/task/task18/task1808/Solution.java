package com.codegym.task.task18.task1808;

/*
Splitting a file

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        /*Read 3 file names from the console: file1, file2, file3.*/
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();


        /*Split file1 as follows:
        Write the first half of its bytes to file2,and write the second half of its bytes to file3.
        If the number of bytes in file1 is odd, then file2 should contain the larger half.
        Close the streams.*/
        try (FileInputStream fileInputStream = new FileInputStream(file1);
             FileOutputStream fileOutputStream1 = new FileOutputStream(file2);
             FileOutputStream fileOutputStream2 = new FileOutputStream(file3)) {

            int halfOfFile = (fileInputStream.available() + 1) / 2;
            int numberOfByte = 0;

            while (fileInputStream.available() > 0) {
                if (numberOfByte < halfOfFile) {
                    fileOutputStream1.write(fileInputStream.read());
                    numberOfByte++;
                } else fileOutputStream2.write(fileInputStream.read());

            }

        }
    }
}
