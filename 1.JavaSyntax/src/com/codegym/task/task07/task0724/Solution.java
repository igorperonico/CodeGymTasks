package com.codegym.task.task07.task0724;

/*
Family census

*/

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        // write your code here
        ArrayList<Human> humans = new ArrayList<>();

        Human human1 = new Human("Joelma", false, 35);
        humans.add(human1);
        Human human2 = new Human("Kleiton", true, 22);
        humans.add(human2);
        Human human3 = new Human("Caterine", false, 21);
        humans.add(human3);
        Human human4 = new Human("Joel", true, 34);
        humans.add(human4);
        Human human5 = new Human("Igor", true, 12, human4, human1);
        humans.add(human5);
        Human human6 = new Human("Claudio", true, 6, human4, human1);
        humans.add(human6);
        Human human7 = new Human("Lorena", false, 3, human4, human1);
        humans.add(human7);
        Human human8 = new Human("Fred", true, 2, human2, human3);
        humans.add(human8);
        Human human9 = new Human("Leticia", false, 1, human2, human3);
        humans.add(human9);

        for (Human human: humans) {
            System.out.println(human.toString());
        }
    }

    public static class Human {
        // write your code here
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            if (this.father != null) {
                text += ", father: " + this.father.name;
            }
            if (this.mother != null) {
                text += ", mother: " + this.mother.name;
            }
            return text;
        }
    }
}
