package com.codegym.task.task18.task1818;

/*
Two in one

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        /*Read 3 file names from the console.*/
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();

        /*Write the contents of the second file to the first file,
        and then append the contents of the third file to the first file.*/
        try (FileInputStream fileInputStream2 = new FileInputStream(file2);
             FileInputStream fileInputStream3 = new FileInputStream(file3);
             FileOutputStream fileOutputStream1 = new FileOutputStream(file1, true)) {
            while (fileInputStream2.available() > 0)
                fileOutputStream1.write(fileInputStream2.read());
            while (fileInputStream3.available() > 0)
                fileOutputStream1.write(fileInputStream3.read());
        }
    }
}
