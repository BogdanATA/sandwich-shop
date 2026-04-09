package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //get user input
        System.out.println("Do you want a regular or large sandwich");
        String sandwichSize = scanner.nextLine();

        sandwichSize = sandwichSize.toLowerCase();


        //determine price of large and regular before discount
        double price = 0;

        if (sandwichSize.equals("regular")) {
            price = 5.45;
        } else if (sandwichSize.equals("large")) {
            price = 8.95;
        } else {
            System.out.println("Not an option");
        }



        //determine discount
        System.out.println("How old are you: ");
        int age = scanner.nextInt();

        double discount = 0;

        if (age <= 17) {
            discount = .1;
        } else if (age >= 65) {
            discount = .2;
        } else {
            discount = 0;
        }


        //find and print final price
        double finalPrice = price - (price * discount);

        System.out.printf("your final price is: $%.2f", finalPrice);

        scanner.close();


    }
}
