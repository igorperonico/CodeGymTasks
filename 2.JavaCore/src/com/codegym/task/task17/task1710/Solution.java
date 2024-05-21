package com.codegym.task.task17.task1710;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/*
CRUD

*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<>();

    static {
        allPeople.add(Person.createMale("Donald Chump", new Date()));  // id=0
        allPeople.add(Person.createMale("Larry Gates", new Date()));  // id=1
    }

    private static SimpleDateFormat format1 = new SimpleDateFormat("MM dd yyyy", Locale.ENGLISH);
    private static SimpleDateFormat format2 = new SimpleDateFormat("MMM dd yyyy", Locale.ENGLISH);

    public static void main(String[] args) throws Exception {

        if (args == null || args.length < 1) throw new RuntimeException();

        Date birthdayDate;
        Person person;

        switch (args[0]) {
            case "-c":
                birthdayDate = format1.parse(args[3]);
                if (args[2].equals("m")) {
                    person = Person.createMale(args[1], birthdayDate);
                } else {
                    person = Person.createFemale(args[1], birthdayDate);
                }

                allPeople.add(person);
                System.out.println(allPeople.size() - 1);
                break;
            case "-u":
                birthdayDate = format1.parse(args[4]);
                int id = Integer.parseInt(args[1]);
                person = allPeople.get(id);

                if (person == null) throw new IllegalArgumentException();

                person.setSex(getSex(args[3]));
                person.setBirthDate(birthdayDate);
                person.setName(args[2]);

                allPeople.set(id, person);
                break;

            case "-d":
                Person currentPerson = allPeople.get(Integer.parseInt(args[1]));

                currentPerson.setName(null);
                currentPerson.setSex(null);
                currentPerson.setBirthDate(null);

                break;

            case "-i":

                person = allPeople.get(Integer.parseInt(args[1]));
                if (person != null)
                    System.out.println(person.getName() + " " + (person.getSex() == Sex.MALE ? "m" : "f") + " " + format2.format(person.getBirthDate()));

                break;

        }

    }

    private static Sex getSex(String sexParam) {
        return sexParam.equals("m") ? Sex.MALE : Sex.FEMALE;
    }
}
