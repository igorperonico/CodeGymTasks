package com.codegym.task.task14.task1414;

/*
MovieFactory

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Read several keys (strings) from the console. Item 7
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String key;
        /*
            7.1. Stop reading in strings as soon as a string is entered that
            does not match one of the following: "cartoon", "thriller", "soapOpera".
        */
        while (true) {
            key = reader.readLine();
            boolean isKey = key.equals("cartoon") || key.equals("thriller") || key.equals("soapOpera");


        /*
            8. Create a variable movie in the Movie class, and for each entered string (key):
            8.1. Get an object using MovieFactory.getMovie and assign it to the variable movie.
            8.2. Display the result of calling movie.getClass().getSimpleName().
        */

            Movie movie = MovieFactory.getMovie(key);
            if(!isKey) break;
            System.out.println(movie.getClass().getSimpleName());


        }


    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            // Create a SoapOpera, Cartoon or Thriller object
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            } else if ("cartoon".equals(key)) {
                movie = new Cartoon();
            } else if ("thriller".equals(key)) {
                movie = new Thriller();
            }


            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    // Write your classes here. Item 3
    /*3. Add Cartoon and Thriller classes.*/

    static class Cartoon extends Movie {
    }

    static class Thriller extends Movie {
    }

}
