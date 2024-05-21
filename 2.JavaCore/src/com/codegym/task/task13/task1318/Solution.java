package com.codegym.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/*
Reading a file

*/

public class Solution {
    public static void main(String[] args) throws Exception {

        //1. Read a file name from the console.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        //2. Display the contents of the file in the console (on the screen).

        FileInputStream fileInputStream = new FileInputStream(fileName);
        Scanner scanner = new Scanner(fileInputStream);
        StringBuilder builder = new StringBuilder();

        while (scanner.hasNextLine()) {
            builder.append(scanner.nextLine()).append("\n");
        }

        System.out.println(builder.toString());

        //3. Don't forget to free up resources.
        // Close the streams for file input and keyboard input.
        scanner.close();
        reader.close();

    }
}
