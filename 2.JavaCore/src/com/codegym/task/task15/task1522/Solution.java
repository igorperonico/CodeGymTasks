package com.codegym.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Reinforce the singleton pattern

*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    // Add static block here
    static {
        try {
            readKeyFromConsoleAndInitPlanet();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readKeyFromConsoleAndInitPlanet() throws IOException {
        // Read one String value from the console.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

        //  If the value is equal to one of the Planet interface's constants, create a corresponding object
        //  and assign it to Planet thePlanet, otherwise set the Planet thePlanet to null.

        switch (input) {
            case Planet.EARTH -> thePlanet = Earth.getInstance();
            case Planet.MOON -> thePlanet = Moon.getInstance();
            case Planet.SUN -> thePlanet = Sun.getInstance();
            default -> thePlanet = null;
        }

    }
}
