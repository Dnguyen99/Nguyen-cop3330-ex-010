package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

        System.out.println("Enter the price of item 1: ");
        double item1 = input.nextInt();
        System.out.println("Enter the quantity of item 1: ");
        int quantity1 = input.nextInt();
        System.out.println("Enter the price of item 2: ");
        double item2 = input.nextInt();
        System.out.println("Enter the quantity of item 2: ");
        int quantity2 = input.nextInt();
        System.out.println("Enter the price of item 3: ");
        double item3 = input.nextInt();
        System.out.println("Enter the quantity of item 3: ");
        int quantity3 = input.nextInt();

        double subtotal = (item1 * quantity1) + (item2 * quantity2) + (item3 * quantity3);
        System.out.println("Subtotal: $" +String.format("%.2f", subtotal));
        double tax = (subtotal * 0.055);
        System.out.println("Tax: $" +String.format("%.2f", tax));
        double total = subtotal + tax;
        System.out.println("Total: $" +String.format("%.2f", total));
    }
}
