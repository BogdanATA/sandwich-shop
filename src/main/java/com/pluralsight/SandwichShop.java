package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //get user input
        System.out.print("Do you want a regular (1) or large (2) sandwich: ");
        int sandwichSize = scanner.nextInt();




        //determine price of large and regular before discount
        double price = 0;

        if (sandwichSize == 1) {
            price = 5.45;
        } else if (sandwichSize == 2) {
            price = 8.95;
        } else {
            System.out.println("Not an option");
        }



        //determine discount
        System.out.print("How old are you: ");
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

        System.out.printf("%nyour final price is: $%.2f%n", finalPrice);

        scanner.close();


    }
}
