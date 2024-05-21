package com.codegym.task.task14.task1407;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Player and Dancer

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Person person = null;
        String key;
        while (!(key = reader.readLine()).equals("exit")) {
            if ("player".equals(key)) {
                person = new Player();
            } else if ("dancer".equals(key)) {
                person = new Dancer();
            }
            haveFun(person);
        }
    }

    public static void haveFun(Person person) {
        //2. Change the haveFun method so that it calls:
        //- the play method if the person is a Player.
        //- the dance method if the person is a Dancer.

        if (person instanceof Player) {
            ((Player) person).play();
        } else if (person instanceof Dancer) {
            ((Dancer) person).dance();
        }

    }

    interface Person {
    }

    static class Player implements Person {
        void play() {
            System.out.println("playing");
        }
    }

    static class Dancer implements Person {
        void dance() {
            System.out.println("dancing");
        }
    }
}
