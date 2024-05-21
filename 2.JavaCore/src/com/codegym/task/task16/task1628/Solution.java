package com.codegym.task.task16.task1628;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution {
    public static volatile AtomicInteger readStringCount = new AtomicInteger(0);
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        // Read string count
        int count = Integer.parseInt(reader.readLine());

        // Init threads
        ReaderThread consoleReader1 = new ReaderThread();
        ReaderThread consoleReader2 = new ReaderThread();
        ReaderThread consoleReader3 = new ReaderThread();

        consoleReader1.start();
        consoleReader2.start();
        consoleReader3.start();

        while (count > readStringCount.get()) {
        }

        consoleReader1.interrupt();
        consoleReader2.interrupt();
        consoleReader3.interrupt();
        System.out.println("#1:" + consoleReader1);
        System.out.println("#2:" + consoleReader2);
        System.out.println("#3:" + consoleReader3);

        reader.close();
    }

    public static class ReaderThread extends Thread {
        private List<String> result = new ArrayList<>();

        public void run() {
            /*Each thread should read lines from the console.
            Use the existing static BufferedReader reader.*/
            try {
                String string;
                while (!Thread.currentThread().isInterrupted()) {
                    if((string = reader.readLine()) != null){
                        result.add(string);
                    /*Use AtomicInteger readStringCount to calculate how many lines all the threads
                    have read from the console. Use AtomicInteger readStringCount to calculate how
                    many lines all the threads have read from the console.*/
                        readStringCount.incrementAndGet();
                    }

                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        @Override
        public String toString() {
            return result.toString();
        }
    }
}
