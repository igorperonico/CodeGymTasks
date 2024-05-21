package com.codegym.task.task16.task1617;

/*
Countdown at the races

*/

public class Solution {
    public static volatile int numSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();

        Thread.sleep(3500);
        clock.interrupt();


    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            /*2. Implement the run method so that each second the count is displayed,
            separated by spaces and starting from numSeconds down to 1,
            and then "Go!" (see the examples).*/
            try {

                while (!isInterrupted() && numSeconds >= 0) {

                    if (numSeconds == 0) {
                        System.out.print("Go!");
                        break;
                    } else {
                        System.out.print(numSeconds + " ");
                        Thread.sleep(1000);
                    }
                    numSeconds--;
                }


            } catch (InterruptedException e) {
                if (numSeconds != -1){
                    System.out.print("Interrupted!");
                }
            }

        }
    }
}
