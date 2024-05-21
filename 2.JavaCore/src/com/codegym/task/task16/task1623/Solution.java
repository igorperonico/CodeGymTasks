package com.codegym.task.task16.task1623;

/*
Creating threads recursively

*/

public class Solution {
    static int count = 15;
    static volatile int createdThreadCount;

    public static void main(String[] args) {
        System.out.println(new GenerateThread());
    }

    /*1. Change the GenerateThread class to make it a thread.*/
    public static class GenerateThread extends Thread {


        /*2. Create a GenerateThread constructor, which must:*/
        public GenerateThread() {
            /*2.1. Call the superclass's constructor,
            passing the created thread's number as a String. Use createdThreadCount.*/
            super(Integer.toString(++createdThreadCount));


            /*2.2. Start the current thread.*/
            this.start();

            /*2.3. The thread numbers must start with 1.*/
        }

        /*3. Override the toString method: inside GenerateThread,
        use Alt+Insert -> Override Methods. Start typing "toString".*/

        @Override
        public String toString() {
            /*3.1. The toString method must return the current thread
            number and the word "created". Use getName().*/
            return getName() + " created";
        }

        public void run() {

            /*4. If the number of created threads is less than Solution.count, the run method must:*/
            if (createdThreadCount < count) {
                /*4.1. Create a new GenerateThread.
                  4.2. Display the thread created in Item 4.1.*/
                System.out.println(new GenerateThread());

            }
        }
    }
}
