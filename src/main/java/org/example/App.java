package org.example;
import java.util.Scanner;

/**
 *
 * UCF COP3330 Fall 2021 Assignment 10 Solution
 * Copyright 2021 Reese Spector
 *
 */

public class App 
{
    static double TAX = 0.055;

    public static void main( String[] args )
    {
        // scanner
        Scanner input = new Scanner(System.in);

        // get item1 info
        System.out.print("Enter the price of item 1: ");
        String strOnePrice = input.nextLine();
        System.out.print("Enter the quantity of item 1: ");
        String strOneQuant = input.nextLine();

            //convert item1 strings
            int onePrice = Integer.parseInt(strOnePrice);
            int oneQuant = Integer.parseInt(strOneQuant);

        // get item2 info
        System.out.print("Enter the price of item 2: ");
        String strTwoPrice = input.nextLine();
        System.out.print("Enter the quantity of item 2: ");
        String strTwoQuant = input.nextLine();

            //convert item1 strings
            int twoPrice = Integer.parseInt(strTwoPrice);
            int twoQuant = Integer.parseInt(strTwoQuant);

        // get item3 info
        System.out.print("Enter the price of item 3: ");
        String strThreePrice = input.nextLine();
        System.out.print("Enter the quantity of item 3: ");
        String strThreeQuant = input.nextLine();

            //convert item1 strings
            int threePrice = Integer.parseInt(strThreePrice);
            int threeQuant = Integer.parseInt(strThreeQuant);

        //item math
        int itemOne = onePrice * oneQuant;
        int itemTwo = twoPrice * twoQuant;
        int itemThree = threePrice * threeQuant;
        double subTotal = (itemOne + itemTwo + itemThree);
        double tax = TAX * subTotal;
        double total = subTotal + tax;

        //print summary
        System.out.print("Subtotal: $" + subTotal);
        System.out.print("\nTax: $" + tax);
        System.out.print("\nTotal: $" + total);

    }
}
