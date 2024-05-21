package com.codegym.task.task16.task1611;

/*
Clocks

*/

public class Solution {
    public static volatile boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock();
        Thread.sleep(2000);
        isStopped = true;
        System.out.println("the clock has to be stopped");
        Thread.sleep(2000);
        System.out.println("Double-check");

    }

    public static class Clock extends Thread {
        public Clock() {
            setPriority(MAX_PRIORITY);
            start();
        }

        public void run() {
            try {
                while (!isStopped) {
                    printTickTock();
                }
            } catch (InterruptedException e) {
            }
        }

        private void printTickTock() throws InterruptedException {
            //2.1. In the first half of each second, the following phrase should be displayed: Tick
            Thread.sleep(500);
            System.out.println("Tick");
            //2.2. In the second half of each second, the following phrase should be displayed: Tock
            Thread.sleep(500);
            System.out.println("Tock");

        }
    }
}
