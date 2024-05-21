package com.codegym.task.task04.task0419;

/*
Maximum of four numbers

*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        List<Integer> numbers = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int number4 = scanner.nextInt();

        numbers.add(number);
        numbers.add(number2);
        numbers.add(number3);
        numbers.add(number4);

        System.out.println(Collections.max(numbers));
    }
}
