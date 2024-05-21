package com.codegym.task.task10.task1011;

/*
Big salary

*/

public class Solution {
    public static void main(String[] args) {
        String s = "I do not want to learn Java. I want a big salary";

        //write your code here

        /*StringBuilder string = new StringBuilder(s);
        for (int i = 0; i < 43; i++){
            System.out.println(string);
            string = string.deleteCharAt(0);
        }*/


        for (int i = 0; i < 43; i++) {
            System.out.println(s);
            s = s.substring(1);
        }
    }

}
