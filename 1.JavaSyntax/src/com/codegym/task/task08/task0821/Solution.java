package com.codegym.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/*
Shared last names and first names

*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        //write your code here
        Map<String, String> result = new HashMap<String, String>();
        result.put("Sanchez", "Igor");
        result.put("Monteiro", "Daniel");
        result.put("Peronico", "Caio");
        result.put("Monteiro", "Elizete");
        result.put("Araújo", "Antônio");
        result.put("Ramos", "Marcília");
        result.put("Carla", "Marcília");
        result.put("Ercilia", "Maria");
        result.put("Norris", "Lando");
        result.put("Marcos", "São");

        return result;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
