package com.codegym.task.task08.task0820;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
Animal set

*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        System.out.println();

        printPets(pets);
    }

    public static Set<Cat> createCats() {
        //write your code here

        return new HashSet<Cat>(Arrays.asList(new Cat(), new Cat(), new Cat(), new Cat()));
    }

    public static Set<Dog> createDogs() {
        //write your code here
        return new HashSet<Dog>(Arrays.asList(new Dog(), new Dog(), new Dog()));
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //write your code here
        HashSet<Object> result = new HashSet<>();
        result.addAll(cats);
        result.addAll(dogs);

        return result;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //write your code here
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {
        //write your code here
        for (Object pet : pets) {
            System.out.println(pet);
        }
    }

    //write your code here
    public static class Cat {

    }

    public static class Dog {

    }
}
