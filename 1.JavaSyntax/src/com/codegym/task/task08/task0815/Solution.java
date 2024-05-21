package com.codegym.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*
Census

*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //write your code here
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Sanchez", "Igor");
        map.put("Smith", "Daniel");
        map.put("Peronico", "Caio");
        map.put("Monteiro", "Elizete");
        map.put("Araújo", "Antônio");
        map.put("Ramos", "Marcília");
        map.put("Carla", "Marcília");
        map.put("Ercilia", "Maria");
        map.put("Norris", "Lando");
        map.put("Marcos", "São");

        return map;
    }

    public static int getSameFirstNameCount(HashMap<String, String> map, String name) {
        //write your code here
        int count = 0;

        for (HashMap.Entry<String, String> pair : map.entrySet()) {
            String value = pair.getValue();

            if (value.equals(name)) {
                count++;
            }
        }

        return count;
    }

    public static int getSameLastNameCount(HashMap<String, String> map, String lastName) {
        //write your code here
        int count = 0;

        for (HashMap.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey();

            if (key.equals(lastName)) {
                count++;
            }
        }

        return count;

    }

    public static void main(String[] args) {

    }
}
