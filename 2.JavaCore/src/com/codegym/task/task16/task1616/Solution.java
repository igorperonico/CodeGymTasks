package com.codegym.task.task16.task1616;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Counting seconds

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);
        // Create and run thread
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();
        // Read a string
        reader.readLine();
        stopwatch.interrupt();
        // Close streams
        reader.close();
        in.close();
    }

    public static class Stopwatch extends Thread {
        private int seconds;

        public void run() {
            try {
                /*2. The Stopwatch class must count the number of seconds that have passed from
                 the creation of the thread until a string is entered.*/
                Thread current = Thread.currentThread();

                while (!current.isInterrupted()) {
                    seconds++;
                    Thread.sleep(1000);
                }


            } catch (InterruptedException e) {
                System.out.println(seconds);
            }
        }
    }
}
