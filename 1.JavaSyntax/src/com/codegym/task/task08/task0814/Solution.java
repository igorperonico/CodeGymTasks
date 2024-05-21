package com.codegym.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;

/*
Greater than 10? You're not a good fit for us

*/

public class Solution {
    public static HashSet<Integer> createSet() {
        // write your code here
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 1; i <= 20; i++) {
            set.add(i);
        }

        return set;
    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        // write your code here
        HashSet<Integer> numbersToRemove = new HashSet<Integer>();
        for (int number : set) {
            if (number > 10) {
                numbersToRemove.add(number);
            }
        }
        set.removeAll(numbersToRemove);

        return set;
    }

    public static void main(String[] args) {

    }
}
