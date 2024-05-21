package com.codegym.task.task05.task0528;

/*
Display today's date

*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Solution {
    public static void main(String[] args) {
        //write your code here
        LocalDate date = LocalDate.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MM dd yyyy");

        String formattedDate = date.format(myFormatObj);
        System.out.println(formattedDate);

    }
}
