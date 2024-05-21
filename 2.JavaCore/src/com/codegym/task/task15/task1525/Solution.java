package com.codegym.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
File in a static block

*/

public class Solution {
    public static List<String> lines = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(lines);
    }

    static {
        try {
            FileReader file = new FileReader(Statics.FILE_NAME);
            BufferedReader reader = new BufferedReader(file);

            String line;

            while((line = reader.readLine()) != null){
                lines.add(line);
            }
            file.close();
            reader.close();

        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
