package com.codegym.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Request parser

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //Read a URL from the console.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String URL = reader.readLine();

        //Display a space-delimited list of all the parameters (The parameters follow the
        // "?" and are separated by "&", e.g. "lvl=15").

        String[] parts = URL.split("\\?");

        String parameters = parts[1];
        //Splitting parameters using "&" as separator
        String[] parametersPairs = parameters.split("&");
        List<String> alerts = new ArrayList<>();


        for (String pair : parametersPairs) {
            String[] keyValue = pair.split("=");
            System.out.print(keyValue[0] + " ");
            if (keyValue[0].equals("obj")) {
                alerts.add(keyValue[1]);
            }
        }
        System.out.print("\n");

        for (String alert : alerts) {
            try {
                alert(Double.parseDouble(alert));
            } catch (NumberFormatException e) {
                alert(alert);
            }
        }

    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
