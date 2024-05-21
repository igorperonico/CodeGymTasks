package com.codegym.task.task04.task0436;

/*
Drawing a rectangle

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(8);
            }
            System.out.print("\n");
        }
    }
}
