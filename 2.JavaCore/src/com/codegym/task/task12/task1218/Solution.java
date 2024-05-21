package com.codegym.task.task12.task1218;

/*
Eat, fly, and move

*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public class Dog implements CanMove, CanEat {
        @Override
        public void move() {
            System.out.println("The dog moved!");
        }

        @Override
        public void eat() {
            System.out.println("The dog ate!");
        }
    }

    public class Duck implements CanMove, CanFly, CanEat {
        @Override
        public void fly() {
            System.out.println("The duck flew!");
        }

        @Override
        public void move() {
            System.out.println("The duck moved!");
        }

        @Override
        public void eat() {
            System.out.println("The duck ate!");
        }
    }

    public class Car implements CanMove {
        @Override
        public void move() {
            System.out.println("The car moved!");
        }
    }

    public class Airplane implements CanMove, CanFly {
        @Override
        public void fly() {
            System.out.println("The plane flew!");
        }

        @Override
        public void move() {
            System.out.println("The plane moved!");
        }
    }
}
