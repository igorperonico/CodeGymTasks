package com.codegym.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
Different methods for different types

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //1. Read data from the console until the word "exit" is entered.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String data;
        while (true) {

            data = reader.readLine();
            //	The program should stop reading data from the keyboard after "exit" is entered.
            if (data.equals("exit")) break;

            /*2.1. contains a period ("."), then call the print method for Double;*/
            if (data.contains(".")) {
                try {
                    Double doubleData = Double.parseDouble(data);
                    print(doubleData);

                } catch (NumberFormatException ex) {
                   /*2.4. otherwise, call the print method for String.*/
                    print(data);
                }
            } else {
                try {
                    int intData = Integer.parseInt(data);
                    /*2.2. is greater than zero, but less than 128, then call the print method for short;*/
                    if (intData > 0 && intData < 128) print((short) intData);
                    /*2.3. less than or equal to zero or greater than or equal to 128, then call the print method for Integer;*/
                    else print(intData);

                } catch (NumberFormatException ex) {
                    /*2.4. otherwise, call the print method for String.*/
                    print(data);
                }
            }

        }

        reader.close();
    }

    public static void print(Double value) {
        System.out.println("This is a Double. Value: " + value);
    }

    public static void print(String value) {
        System.out.println("This is a String. Value: " + value);
    }

    public static void print(short value) {
        System.out.println("This is a short. Value: " + value);
    }

    public static void print(Integer value) {
        System.out.println("This is an Integer. Value: " + value);
    }
}
