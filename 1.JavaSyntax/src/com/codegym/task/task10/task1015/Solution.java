package com.codegym.task.task10.task1015;

import java.util.ArrayList;

/*
Array of string lists

*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //write your code here
        ArrayList<String>[] result = (ArrayList<String>[]) new ArrayList[3];
        result[0] = new ArrayList<>();
        result[1] = new ArrayList<>();
        result[2] = new ArrayList<>();

        result[0].add("Igor");
        result[1].add("Monteiro");
        result[2].add("Peronico");

        return result;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}
