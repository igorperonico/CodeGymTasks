package com.codegym.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/*
Software update

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Map of the city and family
        HashMap<String, String> map = new HashMap<>();
        while (true) {
            String city = reader.readLine();

            if (city.isEmpty()) {
                break;
            }
            String family = reader.readLine();

            map.put(city, family);
        }

        // Read the city
        String city = reader.readLine();

        if (map.containsKey(city)) {
            String family = map.get(city);
            System.out.println(family);
        }

    }
}
