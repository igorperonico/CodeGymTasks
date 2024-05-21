package com.codegym.task.task14.task1405;

/*
Food

*/

public class Solution {
    public static void main(String[] args) {
        Food food = new Food();
        Selectable selectable = new Food();
        Food newFood = (Food) selectable;

        foodMethods(food);
        selectableMethods(selectable);
    }

    public static void foodMethods(Food food) {
        //4. In the foodMethods method, call the onSelect and onEat methods, if possible.

        food.onSelect();
        food.onEat();

    }

    public static void selectableMethods(Selectable selectable) {
        //5. In the selectableMethods method, call the onSelect and onEat methods,
        // if possible.

        selectable.onSelect();

    }

    interface Selectable {
        void onSelect();
    }

    //1. Implement the Selectable interface in the Food class.
    static class Food implements Selectable {
        public void onEat() {
            System.out.println("The food was eaten");
        }

    //2. The onSelect() method should display "The food was selected"
        @Override
        public void onSelect() {
            System.out.println("The food was selected");
        }
    }
}
