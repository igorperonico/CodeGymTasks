package com.codegym.task.task04.task0441;

/*
Somehow average

*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        List<Integer> numbers = new ArrayList<>();
        numbers.add(number1);
        numbers.add(number2);
        numbers.add(number3);

        Collections.sort(numbers);

        System.out.println(numbers.get(1));
    }
}
