package com.codegym.task.task09.task0926;

import java.util.ArrayList;

/*
List of number arrays

*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //write your code here
        ArrayList<int[]> list = new ArrayList<>();

        list.add(new int[5]);
        list.add(new int[2]);
        list.add(new int[4]);
        list.add(new int[7]);
        list.add(new int[0]);

        /*ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[]{1, 2, 3, 4, 5});
        list.add(new int[]{1, 2});
        list.add(new int[]{1, 2, 3, 4});
        list.add(new int[]{1, 2, 3, 4, 5, 6, 7});
        list.add(new int[]{});
        return list;
*/
        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
