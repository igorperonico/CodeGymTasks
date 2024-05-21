package com.codegym.task.task09.task0927;

import java.util.*;

/*
Ten cats

*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //write your code here
        Map<String, Cat> map = new HashMap<>();
        map.put("Rosbife", new Cat("Rosbife"));
        map.put("CNPJoto", new Cat("CNPJoto"));
        map.put("Calabreso", new Cat("Calabreso"));
        map.put("Gonorreio", new Cat("Gonorreio"));
        map.put("Bulmo", new Cat("Bulmo"));
        map.put("Javo", new Cat("Javo"));
        map.put("Gabrielo", new Cat("Gabrielo"));
        map.put("Mussarelo", new Cat("Mussarelo"));
        map.put("Rato Branco", new Cat("Rato Branco"));
        map.put("Feijoado", new Cat("Feijoado"));

        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //write your code here
        Set<Cat> set = new HashSet<>();
        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            Cat cat = pair.getValue();
            set.add(cat);
        }

        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
