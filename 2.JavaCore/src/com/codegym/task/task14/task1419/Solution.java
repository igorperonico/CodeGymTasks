package com.codegym.task.task14.task1419;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;

/*
Exception invasion

*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   // The first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //write your code here
        exceptions.add(new ArrayIndexOutOfBoundsException());
        exceptions.add(new IllegalArgumentException());
        exceptions.add(new IllegalAccessException());
        exceptions.add(new NumberFormatException());
        exceptions.add(new ClassCastException());
        exceptions.add(new IOException());
        exceptions.add(new InterruptedIOException());
        exceptions.add(new InterruptedException());
        exceptions.add(new SecurityException());

    }
}
