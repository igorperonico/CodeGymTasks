package com.codegym.task.task05.task0514;

/*
A programmer creates a person

*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Person person = new Person();
        person.initialize("Igor", 29);
    }

    static class Person {
        //write your code here
        private String name;
        private int age;

        public void initialize(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
