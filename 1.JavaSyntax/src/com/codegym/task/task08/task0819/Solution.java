package com.codegym.task.task08.task0819;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
Set of cats

*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //write your code here. step 3
        cats.remove(cats.toArray()[0]);

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //write your code here. step 2

        return new HashSet<>(Arrays.asList(new Cat(), new Cat(), new Cat()));
    }

    public static void printCats(Set<Cat> cats) {
        // step 4
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }

    // step 1

    public static class Cat {

    }
}

