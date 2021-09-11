package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 David Bradford
 */

import java.util.Scanner;

public class TempConv
{
    public static void main( String[] args )
    {
        double c, f, cf, ff;
        String choice;

        Scanner input = new Scanner(System.in);

        System.out.print( "Press C to convert from Fahrenheit to Celsius.\n" + "Press F to convert from Celsius to Fahrenheit.\nEnter letter: " );
        choice = input.nextLine();
        System.out.println("Your choice: "+choice);


        if (choice.equalsIgnoreCase("C"))
        {
           System.out.print("Please enter the temperature in Fahrenheit: ");
           f = input.nextDouble();
           cf = (f-32) * 5 / 9;
           System.out.println("The temperature is "+String.format("%.0f", cf));

        }

        if (choice.equalsIgnoreCase("F"))
        {
            System.out.print("Please enter the temperature in Celsius: ");
            c = input.nextDouble();
            ff = (c*9/5)+32;
            System.out.println("The temperature is "+String.format("%.0f", ff));
        }


    }
}
