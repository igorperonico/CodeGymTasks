package com.codegym.task.task05.task0513;

/*
Let's put together a rectangle

*/

public class Rectangle {
    //write your code here
    private int top;
    private int left;
    private int width;
    private int height;

    public void initialize(int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public void initialize(int top, int left) {
        this.top = top;
        this.left = left;
        this.width = 0;
        this.height = 0;
    }

    public void initialize(int top, int left, int width) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }

    public void initialize(Rectangle otherRectangle) {
        this.top = otherRectangle.top;
        this.left = otherRectangle.left;
        this.width = otherRectangle.width;
        this.height = otherRectangle.height;
    }


    public static void main(String[] args) {

    }
}
