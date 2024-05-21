package com.codegym.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Cat relations

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandfatherTiger = reader.readLine();
        Cat catGrandfather = new Cat(grandfatherTiger);

        String grandmotherPuss = reader.readLine();
        Cat catGrandmother = new Cat(grandmotherPuss);

        String fatherOscar = reader.readLine();
        Cat catFather = new Cat(catGrandfather, fatherOscar);

        String motherMissy = reader.readLine();
        Cat catMother = new Cat(motherMissy, catGrandmother);

        String sonSimba = reader.readLine();
        Cat catSonSimba = new Cat(sonSimba, catMother, catFather);

        String daughterCoco = reader.readLine();
        Cat catDaughter = new Cat(daughterCoco, catMother, catFather);

        System.out.println(catGrandfather);
        System.out.println(catGrandmother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSonSimba);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat mother) {
            this.name = name;
            this.mother = mother;
        }

        Cat(Cat father, String name) {
            this.name = name;
            this.father = father;
        }

        public Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString() {
            if (father == null) {
                if (mother == null) return "The cat's name is" + name + ", no mother, no father";
                else return "The cat's name is " + name + ", " + mother.name + " is the mother" + ", no father";
            } else if (mother == null) {
                if (father == null) return "The cat's name is " + name + ", no mother, no father";
                else return "The cat's name is " + name + ", no mother, " + father.name + " is the father";
            } else return "The cat's name is " + name + ", " + mother.name + " is the mother, "
                    + father.name + " is the father";
        }
    }

}
