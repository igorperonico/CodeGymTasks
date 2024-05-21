package com.codegym.task.task14.task1408;

/*
Chicken factory

*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Continent.AFRICA);
        System.out.println(hen.getMonthlyEggCount());
        System.out.println(hen.getDescription());
    }

    static class HenFactory {

        static Hen getHen(String continent) {
            Hen hen = switch (continent) {
            /*8. In the HenFactory class, implement the getHen method.
             It should return a chicken breed corresponding to the
             continent that the chicken came from.*/
                case "Europe" -> new EuropeanHen();
                case "North America" -> new NorthAmericanHen();
                case "Asia" -> new AsianHen();
                case "Africa" -> new AfricanHen();
                default -> null;

            };

            return hen;
        }
    }
}
