package com.codegym.task.task05.task0526;

/*
Man and woman

*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Man igor = new Man("Igor", 29, "R. Felipe Camarao");
        System.out.println(igor);
        Woman marcilia = new Woman("Marcilia", 24, "R. Felipe Camarao");
        System.out.println(marcilia);
    }

    //write your code here
    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            return name + " " + age + " " + address;
        }
    }

    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            return name + " " + age + " " + address;
        }
    }
}
