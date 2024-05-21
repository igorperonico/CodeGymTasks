package com.codegym.task.task13.task1326;

/*
Sorting even numbers from a file

*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        //1. Read a file name from the console.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);

        //2. Read a set of numbers from the file.
        Scanner scanner = new Scanner(fileInputStream);
        List<Integer> data = new ArrayList<>();

        while (scanner.hasNext()) {
            int value = scanner.nextInt();
            if (value % 2 == 0) {
                data.add(value);
            }

        }

        //3. Display only the even numbers, sorted in ascending order.

        Collections.sort(data);
        for (int value : data) {
            System.out.println(value);
        }

        //Close the input stream used to read the file
        reader.close();
        fileInputStream.close();
        scanner.close();
    }
}
