package com.codegym.task.task14.task1408;

//4. Create an AsianHen class that inherits Hen.
public class AsianHen extends Hen implements Continent {

    @Override
    int getMonthlyEggCount() {
        return 0;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " I come from " + ASIA
                + ". I lay " + getMonthlyEggCount() + " eggs a month.";
    }
}
