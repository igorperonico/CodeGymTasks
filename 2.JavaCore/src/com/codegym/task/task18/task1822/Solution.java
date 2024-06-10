package com.codegym.task.task18.task1822;

/*
Finding data inside a file

*/

import java.io.*;


public class Solution {
    public static void main(String[] args) throws IOException {
        /*Read a file name from the console.*/
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        /*Search the file for information related to the specified id. Display it in the format used in the file.
          The program is started with one argument: id (an int).*/
        int id = Integer.parseInt(args[0]);

        try(BufferedReader bufferedFileReader = new BufferedReader(new FileReader(fileName))){
            while(bufferedFileReader.ready()) {
                String line = bufferedFileReader.readLine();
                if(line.contains(id + " ")) {

                    System.out.println(line);
                }
            }
        }
    }
}
