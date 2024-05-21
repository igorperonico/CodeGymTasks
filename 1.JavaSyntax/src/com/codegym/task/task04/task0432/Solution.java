package com.codegym.task.task04.task0432;

/*
You can't have too much of a good thing

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int index = scanner.nextInt();
        int i = 1;

        while (i <= index) {
            System.out.println(line);
            i++;
        }
    }
}
