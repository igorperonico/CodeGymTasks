package com.codegym.task.task04.task0412;

/*
Positive and negative numbers

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = 0;

        if(number > 0)
            result = 2 * number;
        else if(number < 0)
            result = number + 1;
        else
            result = 0;

        System.out.println(result);



    }

}
