package com.codegym.task.task05.task0510;

/*
Initializing cats

*/

public class Cat {
    //write your code here
    private String name;
    private int weight;
    private int age;
    private String color;
    private String address;

    public void initialize(String name) {
        this.name = name;
        this.age = 0;
        this.color = "unknown";
        this.weight = 0;
    }
    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.color = "unknown";
        this.weight = weight;
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        this.color = "unknown";
        this.weight = 10;
    }

    public void initialize(int weight,String color) {
        this.age = 0;
        this.color = color;
        this.weight = weight;
    }

    public void initialize(int weight,String color, String address) {
        this.age = 0;
        this.color = color;
        this.weight = weight;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
