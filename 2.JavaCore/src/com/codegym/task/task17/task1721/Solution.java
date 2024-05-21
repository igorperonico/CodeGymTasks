package com.codegym.task.task17.task1721;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Transactionality

*/

public class Solution {
    public static List<String> allLines = new ArrayList<>();
    public static List<String> linesForRemoval = new ArrayList<>();

    public static void main(String[] args) {
        /*1. Read 2 file names from the console.*/
        Scanner scanner = new Scanner(System.in);
        String fileName1 = null;
        String fileName2 = null;

        try{
            fileName1 = scanner.nextLine();
            fileName2 = scanner.nextLine();

            /*2. Read from the files line by line. Read from the first file into allLines,
                    from the second file — into linesForRemoval.*/
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName1))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    allLines.add(line);
                }
            }

            try (BufferedReader reader = new BufferedReader(new FileReader(fileName2))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    linesForRemoval.add(line);
                }
            }

            /*The joinData method should be called in main.*/

            new Solution().joinData();


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }


    }

    public void joinData() throws CorruptedDataException {

        /*3. If the allLines list contains all the lines from linesForRemoval,
        then remove from the allLines list all the lines that are in linesForRemoval.*/

        if(allLines.containsAll(linesForRemoval))
            allLines.removeAll(linesForRemoval);

        /*4. If the condition in Item 3 is not satisfied, then:
        4.1. clear the data in allLines
        4.2. throw a CorruptedDataException*/

        else {
            allLines.clear();
            throw new CorruptedDataException();
        }


    }
}
