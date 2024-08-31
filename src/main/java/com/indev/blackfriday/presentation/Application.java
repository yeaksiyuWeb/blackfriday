package com.indev.blackfriday.presentation;

import com.indev.blackfriday.Company;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        // Initialize the company
        Company company = new Company();
        Scanner scanner = new Scanner(System.in);

        // Get user input for stocking products
        System.out.println("Enter the number of products you want to stock:");
        int numProducts = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < numProducts; i++) {
            System.out.println("Enter product ID:");
            String id = scanner.nextLine();
            
            System.out.println("Enter quantity:");
            int quantity = scanner.nextInt();
            
            System.out.println("Enter price per unit:");
            int price = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            // Stock the product
            company.stock(quantity, id, price);
        }

        // Sell some products
        System.out.println("Enter the product ID to sell:");
        String sellId = scanner.nextLine();
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
}
