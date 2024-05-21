package com.codegym.task.task05.task0504;

/*
The Three "Muscateers"

*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Cat brad = new Cat("Brad", 10, 10, 1000);
        Cat paloma = new Cat("Paloma", 8, 12, 100);
        Cat paris = new Cat("Paris", 5, 15, 150);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}
