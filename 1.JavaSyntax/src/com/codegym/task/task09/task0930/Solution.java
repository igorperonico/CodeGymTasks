package com.codegym.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/*
Task about algorithms

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        // write your code here
        /*boolean[] isNumberBoolean = new boolean[array.length];
        ArrayList<String> numbers = new ArrayList<String>();
        ArrayList<String> words = new ArrayList<String>();


        for (int i = 0; i < array.length; i++) {
            isNumberBoolean[i] = isNumber(array[i]);
            if (isNumberBoolean[i]) {
                numbers.add(array[i]);
            } else {
                words.add(array[i]);
            }
        }


        String[] arrayNumbers = numbers.toArray(new String[numbers.size()]);
        String[] arrayWords = words.toArray(new String[words.size()]);

        String aux;

        for (int i = 0; i < arrayNumbers.length - 1; i++) {
            for (int j = 0; j < arrayNumbers.length - 1 - i; j++) {
                if (!(Integer.parseInt(arrayNumbers[j]) > Integer.parseInt(arrayNumbers[j + 1]))) {
                    aux = arrayNumbers[j];
                    arrayNumbers[j] = arrayNumbers[j + 1];
                    arrayNumbers[j + 1] = aux;
                }
            }
        }

        for (int i = 0; i < arrayWords.length - 1; i++) {
            for (int j = 0; j < arrayWords.length - 1 - i; j++) {
                if (isGreaterThan(arrayWords[j], arrayWords[j + 1])) {
                    aux = arrayWords[j];
                    arrayWords[j] = arrayWords[j + 1];
                    arrayWords[j + 1] = aux;
                }
            }
        }

        int j = 0;
        int k = 0;

        for (int i = 0; i < array.length; i++) {

            if (isNumberBoolean[i]) {
                array[i] = arrayNumbers[j];
                j++;

            } else {
                array[i] = arrayWords[k];
                k++;
            }
        }*/

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (isNumber(array[i]) && isNumber(array[j])) {
                    if (Integer.parseInt(array[i]) < Integer.parseInt(array[j])) {
                        String temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                } else if (!isNumber(array[i]) && !isNumber(array[j])) {
                    if (isGreaterThan(array[i], array[j])) {
                        String temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }

    }

    // String comparison method: 'a' is greater than 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Is the passed string a number?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // The string contains a hyphen
                    || (!Character.isDigit(c) && c != '-') // or is not a number and doesn't start with a hyphen
                    || (i == 0 && c == '-' && chars.length == 1)) // or is a single hyphen
            {
                return false;
            }
        }
        return true;
    }
}
