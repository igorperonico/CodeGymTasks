package com.codegym.task.task04.task0420;

/*
Sorting three numbers

*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        List<Integer> numbers = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        int number1 = in.nextInt();
        int number2 = in.nextInt();
        int number3 = in.nextInt();

        numbers.add(number1);
        numbers.add(number2);
        numbers.add(number3);

        Collections.sort(numbers);

        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.print(numbers.get(i) + " ");
        }


    }
}
