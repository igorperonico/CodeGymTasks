package com.codegym.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/*
Only for the rich

*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //write your code here
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Sanchez", 20000);
        map.put("Smith", 2500);
        map.put("Peronico", 150);
        map.put("Monteiro", 450);
        map.put("Araújo", 7500);
        map.put("Ramos", 5500);
        map.put("Carla", 6000);
        map.put("Ercilia", 4000);
        map.put("Norris", 200);
        map.put("Marcos", 350);

        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //write your code here
        HashMap<String, Integer> copy = new HashMap<String, Integer>(map);
        for (HashMap.Entry<String, Integer> pair : copy.entrySet()) {
            String lastName = pair.getKey();
            Integer salary = pair.getValue();

            if (salary < 500) {
                map.remove(lastName);
            }
        }


    }

    public static void main(String[] args) {

    }
}
