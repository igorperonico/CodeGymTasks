package com.codegym.task.task09.task0905;

/*
In the blue depths of the stack trace…

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int deep = getStackTraceDepth();
    }

    public static int getStackTraceDepth() {
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        System.out.println(stack.length);
        return stack.length;
    }
}

