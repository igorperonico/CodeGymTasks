package com.codegym.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/*
We don't need repeats

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

    public static void removeFirstNameDuplicates(Map<String, String> map) {
        //write your code here
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (String copyName : copy.values()) {
            int count = 0;
            for (String name : map.values()) {
                if (name.equals(copyName)) {
                    count++;
                }
            }
            if (count > 1) {
                removeItemFromMapByValue(map, copyName);
            }
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
