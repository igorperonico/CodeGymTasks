package com.codegym.task.task14.task1408;

//    3. Create an EuropeanHen class that inherits Hen.
public class EuropeanHen extends Hen implements Continent {


    @Override
    int getMonthlyEggCount() {
        return 0;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " I come from " + EUROPE
                + ". I lay " + getMonthlyEggCount() + " eggs a month.";
    }
}
