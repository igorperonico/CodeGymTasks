package com.codegym.task.task04.task0424;

/*
Three numbers

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner in = new Scanner(System.in);

        int number1 = in.nextInt();
        int number2 = in.nextInt();
        int number3 = in.nextInt();

        if (number1 == number2) {
            System.out.println(3);
        } else if(number1 == number3){
            System.out.println(2);
        } else if(number2 == number3) {
            System.out.println(1);
        }
    }
}
