package com.codegym.task.task14.task1412;

/*
Implement the printMainInfo method

*/

public class Solution {
    public static void main(String[] args) {
        Object obj = new Circle();
        Movable movable = (Movable) obj;
        Drawable drawable = new Rectangle();

        printMainInfo(drawable);
        printMainInfo(movable);
    }

    public static void printMainInfo(Object object) {
        /*1.1. If a Drawable object is passed to the method, call the draw method on the object.
        1.2. If a Movable object is passed to the method, call the move method on the object.*/
        if (object instanceof Movable) {
            ((Movable) object).move();
        } else if (object instanceof Drawable) {
            ((Drawable) object).draw();
        }

    }

    static interface Movable {

        void move();
    }

    static class Circle implements Movable {

        public void draw() {
            System.out.println("Can be drawn");
        }

        public void move() {
            System.out.println("Can be moved");
        }

    }

    static interface Drawable {
        void draw();
    }

    static class Rectangle implements Drawable {
        public void draw() {
            System.out.println("Can be drawn");
        }

        public void move() {
            System.out.println("Can be moved");
        }
    }
}
