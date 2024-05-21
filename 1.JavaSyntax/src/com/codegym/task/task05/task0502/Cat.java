package com.codegym.task.task05.task0502;
/*
Implement the fight method

*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //write your code here
        if (this.strength > anotherCat.strength) return true;
        else if (this.weight > anotherCat.weight) return true;
        else return this.age > anotherCat.age;
    }

    public static void main(String[] args) {

    }
}

