package com.codegym.task.task13.task1319;

import java.io.*;

/*
Writing to a file from the console

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // 1. Read a file name from the console
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();


        // 2. Read lines from the console until the user enters the "exit".
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        StringBuilder builder = new StringBuilder();

        String line = "";
        while(!line.equals("exit")) {
            line = reader.readLine();
            builder.append(line).append("\n");
        }

        //3. Write all the entered lines to the file, each on a new line
        writer.write(builder.toString());

        reader.close();
        writer.close();

    }
}
