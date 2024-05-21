package com.codegym.task.task09.task;

public class voltz {
    public static void main(String[] args) {
        System.out.println(calcular(6));
    }

    public static int calcular(int x) {
        if (x > 1) {
            int a = x -1;
            return x * calcular(a);
        } else {
            return 1;
        }
    }
}
