package com.codegym.task.task14.task1417;

import java.util.ArrayList;
import java.util.List;

/*
Currencies

*/

public class Solution {
    public static void main(String[] args) {
        Person paul = new Person("Paul");
        for (Money money : paul.getAllMoney()) {
            System.out.println(paul.name + " has a stash of " + money.getAmount() + " " + money.getCurrencyName());
        }
    }

    static class Person {
        public String name;

        Person(String name) {
            this.name = name;
            this.allMoney = new ArrayList<Money>();
            //write your code here

            allMoney.add(new Euro(90.56));
            allMoney.add(new Ruble(158.00));
            allMoney.add(new USD(892.32));

        }

        private List<Money> allMoney;

        public List<Money> getAllMoney() {
            return allMoney;
        }
    }
}
