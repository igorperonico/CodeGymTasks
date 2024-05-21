package com.codegym.task.task16.task1630;

import java.io.*;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;


    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();

        System.out.println(f.getFileContents());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContents();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {

        private String fileName;
        private String content = "";

        @Override
        public void setFileName(String fullFileName) {
            this.fileName = fullFileName;
        }

        @Override
        public String getFileContents() {
            return content;
        }

        @Override
        public void run() {
            try {
                FileReader fileReader = new FileReader(fileName);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                String line;

                while ((line = bufferedReader.readLine()) != null)
                    content += line + " ";

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
