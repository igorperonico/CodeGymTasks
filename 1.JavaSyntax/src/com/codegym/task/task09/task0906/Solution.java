package com.codegym.task.task09.task0906;

/*
Logging stack traces

*/


public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        //write your code here
        StackTraceElement[] stackTraces = Thread.currentThread().getStackTrace();

        System.out.println(stackTraces[2].getClassName() + ": " + stackTraces[2].getMethodName() + ": " + s);
    }
}
