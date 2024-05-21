package com.codegym.task.task04.task0425;
/*
Target locked!

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        if (a>0) {
            if (b>0) System.out.println(1);
            else if(b<0) System.out.println(4);
        } else if (a<0) {
            if (b>0) System.out.println(2);
            else if(b<0) System.out.println(3);
        }
    }
}
