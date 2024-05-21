package com.codegym.task.task07.task0707;

import java.util.ArrayList;

/*
What sort of list is that?

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("How are you?");
        list.add("Do you want to go to the next page?");
        list.add("Do you want to go to the previous page?");
        list.add("Are you alive?");

        System.out.println(list.size());

        for (String s : list) System.out.println(s);
    }
}
