package com.codegym.task.task10.task1013;

/*
Human class constructors

*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Write your variables and constructors here
        private String name;
        private int age;
        private String country;
        private double height;
        private double weight;
        private String career;

        public Human() {
        }

        public Human(String name, int age, String country, double height, double weight, String career) {
            this.name = name;
            this.age = age;
            this.country = country;
            this.height = height;
            this.weight = weight;
            this.career = career;
        }

        public Human(String name, String country) {
            this.name = name;
            this.country = country;
        }

        public Human(String name, int age, String country) {
            this.name = name;
            this.age = age;
            this.country = country;
        }

        public Human(String name, int age, String country, String career) {
            this.name = name;
            this.age = age;
            this.country = country;
            this.career = career;
        }

        public Human(String name, String country, double height, double weight) {
            this.name = name;
            this.country = country;
            this.height = height;
            this.weight = weight;
        }

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name, int age, double height, double weight) {
            this.name = name;
            this.age = age;
            this.height = height;
            this.weight = weight;
        }

        public Human(String name, int age, double height, double weight, String career) {
            this.name = name;
            this.age = age;
            this.height = height;
            this.weight = weight;
            this.career = career;
        }
    }
}
