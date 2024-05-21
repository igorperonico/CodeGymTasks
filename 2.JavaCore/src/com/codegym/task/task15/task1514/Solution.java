package com.codegym.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/*
Static modifiers: part 1

*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<>();

    static {
        labels.put(58.20, "Colgate Total White");
        labels.put(3.50, "Bohemia Lata 350ml");
        labels.put(7.30, "Doritos 90g");
        labels.put(113.27, "Picanha Bovina kg");
        labels.put(89.25, "Old Parr 750ml");
    }

    public static void main(String[] args) {

        System.out.println(labels);
    }
}
