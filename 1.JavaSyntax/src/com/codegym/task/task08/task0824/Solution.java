package com.codegym.task.task08.task0824;

/*
Make a family

*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Human child1 = new Human("Deyverson", 9, true);
        Human child2 = new Human("Clementina", 5, false);
        Human child3 = new Human("Florenzo", 3, true);
        Human father = new Human("Igor", 29, true, child1, child2, child3);
        Human mother = new Human("Marcilia", 24, false, child1, child2, child3);
        Human grandfather = new Human("Antonio", 68, true, father);
        Human grandmother = new Human("Elizete", 62, false, father);
        Human grandfather1 = new Human("Marcilio Camundongo", 50, true, mother);
        Human grandmother2 = new Human("Marcleide Dona Benta", 48, false, mother);

        ArrayList<Human> family = new ArrayList<>(Arrays.asList(child1, child2, child3, father, mother, grandfather,
                grandmother, grandfather1, grandmother2));


        for (Human object : family) {
            System.out.println(object);
        }

    }

    public static class Human {
        //write your code here
        String name;
        int age;
        Boolean sex;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, int age, Boolean sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, int age, Boolean sex, Human... children) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            Collections.addAll(this.children, children);
        }

        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", children: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
