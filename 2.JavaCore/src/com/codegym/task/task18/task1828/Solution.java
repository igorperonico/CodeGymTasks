package com.codegym.task.task18.task1828;

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
                break;
        /*When the program is started with the arguments "-u id productName price quantity",
          the product information in the file should be updated.*/
            case "-u":
                id = Integer.parseInt(args[1]);
                name = "";
                for (int i = 2; i < args.length - 2; i++) {
                    name += args[i] + " ";
                }
                if (name.length() > 30) {
                    name = name.substring(0, 30);
                }
                price = args[args.length - 2];
                if (price.length() > 8) {
                    price = price.substring(0, 8);
                }
                quantity = args[args.length - 1];
                if (quantity.length() > 4) {
                    quantity = quantity.substring(0, 4);
                }

                Product toUpdate = null;
                for (Product product : products) {
                    if (product.getId() == id) toUpdate = product;
                }
                if (toUpdate != null) {
                    toUpdate.setName(name);
                    toUpdate.setPrice(price);
                    toUpdate.setQuantity(quantity);
                }
                break;
        /*When the program is started with the arguments "-d id",
         the line for the product with the specified id should be removed from the file.*/
            case "-d":
                id = Integer.parseInt(args[1]);
                for (Product product : products) {
                    if (product.getId() == id) {
                        products.remove(product);
                    }
                }
                break;

        }

        try (FileWriter fileWriter = new FileWriter(fileName)) {
            for (Product product : products) {
                fileWriter.write(product.toString() + "\n");
            }
        }

    }
}
