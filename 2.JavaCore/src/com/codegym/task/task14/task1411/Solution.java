package com.codegym.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Objects;

/*
User, loser, coder and programmer

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = reader.readLine();

        // Here's the loop for reading the keys. Item 1
        while (Objects.equals(key, "user") || Objects.equals(key, "loser")
                || Objects.equals(key, "coder") || Objects.equals(key, "programmer")) {
            // Create an object. Item 2
            switch (key) {
                case "user":
                    person = new Person.User();
                    break;
                case "loser":
                    person = new Person.Loser();
                    break;
                case "coder":
                    person = new Person.Coder();
                    break;
                case "programmer":
                    person = new Person.Programmer();
                    break;
            }

            doWork(person); // Call doWork

            key = reader.readLine();
        }
    }

    public static void doWork(Person person) {
        // Item 3
        if ((person instanceof Person.User)) {
            ((Person.User) person).live();
        } else if ((person instanceof Person.Loser)) {
            ((Person.Loser) person).doNothing();
        } else if (person instanceof Person.Coder) {
            ((Person.Coder) person).writeCode();
        } else if (person instanceof Person.Programmer) {
            ((Person.Programmer) person).enjoy();
        }

    }
}
