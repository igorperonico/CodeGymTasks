package com.codegym.task.task18.task1824;

/*
Files and exceptions

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        /*Read file names from the console.*/
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        /*If the file does not exist (i.e. an invalid file name is given), then catch the FileNotFoundException,
          display the invalid file name, and exit the program.*/
        while (true) {
            String fileName = reader.readLine();
            try(BufferedReader bufferedFileReader = new BufferedReader(new FileReader(fileName))) {

            } catch (FileNotFoundException e) {
                System.out.println(fileName);
                break;
            }
        }
    }
}
