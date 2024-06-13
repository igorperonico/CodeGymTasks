package com.codegym.task.task18.task1827;

/*
Prices

*/

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        /*	The program should read a file name for CrUD operations from the console.*/
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        /*When you run the program without arguments, the product list must remain unchanged.*/
        if (args.length == 0) return;

        List<Product> products = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new java.io.FileReader(fileName))) {

            while (bufferedReader.ready()) {
                Product product = Product.getProduct(bufferedReader.readLine());
                products.add(product);
            }
        }

        /*When the program is run with the arguments "-c productName price quantity",
          a new line with the corresponding product should be added to the end of the file.*/
        switch (args[0]) {
            case "-c":
                int id = 0;
                for (Product product : products) {
                    if (product.getId() > id) id = product.getId();
                }
                String name = "";
                for (int i = 1; i < args.length - 2; i++) {
                    name += args[i] + " ";
                }
                if (name.length() > 30) {
                    name = name.substring(0, 30);
                }
                String price = args[args.length - 2];
                if (price.length() > 8) {
                    price = price.substring(0, 8);
                }
                String quantity = args[args.length - 1];
                if (quantity.length() > 4) {
                    quantity = quantity.substring(0, 4);
                }
                Product newProduct = new Product(id + 1, name, price, quantity);
                products.add(newProduct);

        }

        try(FileWriter fileWriter = new FileWriter(fileName)) {
            for (Product product : products) {
                fileWriter.write(product.toString() + "\n");
            }
        }

    }
}
