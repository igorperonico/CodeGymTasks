package com.codegym.task.task14.task1404;

/*
Cats

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //1. Read strings (parameters) from the console
        // until the user enters an empty string (Enter).
        //2. Each parameter corresponds to the name of a cat.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while (!(line= reader.readLine()).isEmpty()) {

            //3. Create a Cat object equal to the cat from
            // getCatByKey(String parameter).
            //4. Display the result of cat.toString().

            Cat cat = CatFactory.getCatByKey(line);
            System.out.println(cat.toString());

        }

    }

    static class CatFactory {
        static Cat getCatByKey(String key) {
            Cat cat;
            switch (key) {
                case "feral":
                    cat = new MeanCat("Claws");
                    break;
                case "miss":
                    cat = new NiceCat("Missy");
                    break;
                case "smudge":
                    cat = new NiceCat("Smudgey");
                    break;
                default:
                    cat = new Cat(key);
                    break;
            }
            return cat;
        }
    }

    static class Cat {
        private String name;

        protected Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public String toString() {
            return "I'm " + getName() + ", an alley cat";
        }
    }

    static class MeanCat extends Cat {
        MeanCat(String name) {
            super(name);
        }

        public String toString() {
            return "I'm " + getName() + ", and I'm going to claw your eyes out";
        }
    }

    static class NiceCat extends Cat {
        NiceCat(String name) {
            super(name);
        }

        public String toString() {
            return "I'm a nice kitten named " + getName();
        }
    }
}
