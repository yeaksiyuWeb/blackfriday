package com.indev.blackfriday.presentation;

import com.indev.blackfriday.Company;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        // Initialize the company
        Company company = new Company();
        Scanner scanner = new Scanner(System.in);

        // Print application header
        printHeader();

        // Get user input for stocking products
        System.out.println("Enter the number of products you want to stock (or 'e' to exit):");
        String numProductsInput = scanner.nextLine();
        if (numProductsInput.equalsIgnoreCase("e")) {
            System.exit(0);
        }
        int numProducts = Integer.parseInt(numProductsInput);

        for (int i = 0; i < numProducts; i++) {
            System.out.println("Enter product ID:");
            String id = scanner.nextLine();
            if (id.equalsIgnoreCase("e")) {
                System.exit(0);
            }
            
            System.out.println("Enter quantity:");
            String quantityInput = scanner.nextLine();
            if (quantityInput.equalsIgnoreCase("e")) {
                System.exit(0);
            }
            int quantity = Integer.parseInt(quantityInput);
            
            System.out.println("Enter price per unit:");
            String priceInput = scanner.nextLine();
            if (priceInput.equalsIgnoreCase("e")) {
                System.exit(0);
            }
            int price = Integer.parseInt(priceInput);

            // Stock the product
            company.stock(quantity, id, price);
        }

        // Sell some products
        System.out.println("Enter the product ID to sell:");
        String sellId = scanner.nextLine();
        if (sellId.equalsIgnoreCase("e")) {
            System.exit(0);
        }
        float sellPrice = company.sells(sellId);
        System.out.println("Sold '" + sellId + "' for: " + sellPrice);

        // Compute total assets
        int totalAssets = company.totalAssets();
        System.out.println("Total assets: " + totalAssets);

        // Print sales history
        String salesHistory = company.salesHistory();
        System.out.println("Sales history: " + salesHistory);

        // Apply Black Friday discounts (if any logic is added later)
        company.blackFriday();

        // Compute the benefit (currently returns 0)
        float benefit = company.computeBenefit();
        System.out.println("Computed benefit: " + benefit);
    }

    public static void printHeader(){
        System.out.print("========================================================")
        System.out.print("        WELCOME TO BLACKFRIDAY SALES APPLICATION        ")
        System.out.print("========================================================")
    }
}
