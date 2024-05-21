package com.codegym.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Mastering the static block

*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        //initialize the CanFly field result by calling the reset method.
        try {
            reset();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static CanFly result;

    public static void reset() throws IOException {
        //3.1. Read a String from the console.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

        if (input.equals("helicopter")) result = new Helicopter();
        if (input.equals("plane")) {
            int passengers = Integer.parseInt(reader.readLine());

            result = new Plane(passengers);
        }

        reader.close();

    }
}
