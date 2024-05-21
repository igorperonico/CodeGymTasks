package com.codegym.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Playing Javarella

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbers = new ArrayList<>();
        List<Integer> divisibleBy3 = new ArrayList<>();
        List<Integer> divisibleBy2 = new ArrayList<>();
        List<Integer> otherNumbers = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            int number = Integer.parseInt(reader.readLine());
            numbers.add(number);
            if (number % 3 == 0) divisibleBy3.add(number);
            if (number % 2 == 0) divisibleBy2.add(number);
            if (!(number % 3 == 0) && !(number % 2 == 0)) otherNumbers.add(number);
        }

        printList(divisibleBy3);
        printList(divisibleBy2);
        printList(otherNumbers);

    }

    public static void printList(List<Integer> list) {
        //write your code here
        for (Integer number : list) {
            System.out.println(number);
        }

    }
}
