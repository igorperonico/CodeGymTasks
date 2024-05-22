package com.codegym.task.task18.task1809;

/*
Reversing a file

*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        /*Read 2 file names from the console: file1, file2.*/
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        /*Write all the bytes in file1 to file2, but in the reverse order.
        Close the streams.*/

        try (FileInputStream fileInputStream = new FileInputStream(file1);
             FileOutputStream fileOutputStream = new FileOutputStream(file2)) {

            List<Integer> inputBytes = new ArrayList<>();
            while (fileInputStream.available() > 0)
                inputBytes.add(fileInputStream.read());

            Collections.reverse(inputBytes);
            for (Integer aByte : inputBytes)
                fileOutputStream.write(aByte);

        }
    }
}
