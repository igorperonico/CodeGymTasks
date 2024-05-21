package com.codegym.task.task14.task1408;

//5. Create an AfricanHen class that inherits Hen.
public class AfricanHen extends Hen implements Continent {

    @Override
    int getMonthlyEggCount() {
        return 0;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " I come from " + AFRICA
                + ". I lay " + getMonthlyEggCount() + " eggs a month.";
    }
}
