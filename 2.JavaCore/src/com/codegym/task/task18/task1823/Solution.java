package com.codegym.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/*
Threads and bytes

*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        /*Read file names from the console until the word "exit" is entered.*/
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        while (true) {

            fileName = reader.readLine();
            if (fileName.equals("exit")) {
                break;
            }
            /*Pass the file name to the ReadThread thread.*/
            ReadThread readThread = new ReadThread(fileName);
            readThread.start();
        }

    }

    public static class ReadThread extends Thread {
        private String fileName;

        public ReadThread(String fileName) {
            // Implement constructor body
            this.fileName = fileName;
        }
        // Implement file reading here
        /*Each thread must find the most frequently occurring byte in its file and add it to resultMap*/

        @Override
        public void run() {
            int[] byteCountArray = new int[256];
            try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
                while (fileInputStream.available() > 0) {
                    int currentByte = fileInputStream.read();
                    byteCountArray[currentByte]++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            int maxCount = 0;
            for (int byteCount : byteCountArray) {
                if (byteCount > maxCount) maxCount = byteCount;
            }
            /* Add it to resultMap, where the String parameter is the file name and the
               Integer parameter is the relevant byte.*/
            for (int i = 0; i < byteCountArray.length; i++) {
                if (byteCountArray[i] == maxCount) {
                    resultMap.put(fileName, i);
                    break;
                }
            }

        }
    }
}
