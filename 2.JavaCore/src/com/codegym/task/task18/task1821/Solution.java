package com.codegym.task.task18.task1821;

/*
Symbol frequency

*/

import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        /*The program is started with one argument: the name of a file that contains text.*/
        int[] countSymbolsASCII = new int[128];
        try (FileReader reader = new FileReader(args[0])) {
        /*Calculate how often each symbol is encountered.
          Sort the results by increasing ASCII code*/
            while (reader.ready()) {
                int currByte = reader.read();
                countSymbolsASCII[currByte]++;
            }
        }
        /*Display the results.*/
        for (int i = 0; i < countSymbolsASCII.length; i++) {

            if (countSymbolsASCII[i] != 0)
                System.out.println((char) i + " " + countSymbolsASCII[i]);
        }
    }
}
