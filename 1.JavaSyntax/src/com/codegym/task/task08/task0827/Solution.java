package com.codegym.task.task08.task0827;

import java.util.Date;

/*
Working with dates

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date date1 = new Date(date);
        Date yearStart = new Date(date);
        yearStart.setDate(1);
        yearStart.setMonth(0);

        long msTimeDifference = date1.getTime() - yearStart.getTime();
        long msDay = 24 * 60 * 60 * 1000 ;

        int dayCount = (int) (msTimeDifference / msDay) + 1;

        return dayCount % 2 != 0;
    }
}
