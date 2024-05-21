package com.codegym.task.task14.task1408;

//2. Create an NorthAmericanHen class that inherits Hen.
public class NorthAmericanHen extends Hen implements Continent {

    @Override
    int getMonthlyEggCount() {
        return 0;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " I come from " + NORTHAMERICA
                + ". I lay " + getMonthlyEggCount() + " eggs a month.";
    }
}
