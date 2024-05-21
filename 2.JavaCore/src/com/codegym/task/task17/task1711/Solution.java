package com.codegym.task.task17.task1711;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/*
CRUD 2

*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<>();

    static {
        allPeople.add(Person.createMale("Donald Chump", new Date()));  // id=0
        allPeople.add(Person.createMale("Larry Gates", new Date()));  // id=1
    }

    private static SimpleDateFormat inputFormat = new SimpleDateFormat("MM dd yyyy", Locale.ENGLISH);
    private static SimpleDateFormat outputFormat = new SimpleDateFormat("MMM dd yyyy", Locale.ENGLISH);

    public static void main(String[] args) {

        try {
            switch (args[0]) {
                case "-c":
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i += 3) {
                            String name = args[i];
                            String sex = args[i + 1];
                            Date birthdayDate = inputFormat.parse(args[i + 2]);
                            Person person = sex.equals("m") ? Person.createMale(name, birthdayDate) : Person.createFemale(name, birthdayDate);

                            allPeople.add(person);
                            System.out.println(allPeople.size() - 1);
                        }
                    }
                    break;

                case "-u":
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i += 4) {
                            int id = Integer.parseInt(args[i]);
                            String name = args[i + 1];
                            Sex sex = getSex(args[i + 2]);
                            Date birthdayDate = inputFormat.parse(args[i + 3]);

                            allPeople.get(id).setName(name);
                            allPeople.get(id).setSex(sex);
                            allPeople.get(id).setBirthDate(birthdayDate);
                        }
                    }
                    break;

                case "-d":
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i++) {
                            Person currentPerson = allPeople.get(Integer.parseInt(args[i]));

                            currentPerson.setName(null);
                            currentPerson.setSex(null);
                            currentPerson.setBirthDate(null);
                        }
                    }
                    break;

                case "-i":
                    synchronized (allPeople) {
                        for(int i = 1; i < args.length; i++) {
                            Person person = allPeople.get(Integer.parseInt(args[i]));
                            if (person != null)
                                System.out.println(person.getName() + " " + (person.getSex() == Sex.MALE ? "m" : "f") + " " + outputFormat.format(person.getBirthDate()));

                        }
                    }
                    break;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static Sex getSex(String sexParam) {
        return sexParam.equals("m") ? Sex.MALE : Sex.FEMALE;
    }
}
