package com.codegym.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

/*
Kind Emma and the summer holidays

*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));

        //write your code here
        map.put("Peronico", df.parse("APRIL 5 1993"));
        map.put("Araújo", df.parse("APRIL 10 1954"));
        map.put("Monteiro", df.parse("DECEMBER 5 1960"));
        map.put("Ramos", df.parse("JUNE 27 1998"));
        map.put("Barcelos", df.parse("AUGUST 27 1982"));
        map.put("Massafera", df.parse("JUNE 28 1982"));
        map.put("Grohl", df.parse("JANUARY 14 1969"));
        map.put("Jovi", df.parse("MARCH 2 1962"));
        map.put("Badauí", df.parse("MARCH 12 1976"));


        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) throws ParseException {
        //write your code here
        HashMap<String, Date> copy = new HashMap<>(map);
        for (HashMap.Entry<String, Date> pair: copy.entrySet()) {
                String key = pair.getKey();
                Date date = pair.getValue();
                int month = date.getMonth() + 1;
            if (month == 6 || month == 7 || month == 8) {
                map.remove(key);
            }
        }
    }

    public static void main(String[] args) {

    }
}
