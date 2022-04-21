package com.company;
import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {
        double fahrenheit = 0;
        double celsius = 0;
        Scanner in = new Scanner(System.in);
        String trash = "";
        boolean valid = false;

        while (!valid)
        {
            System.out.print("Please enter the temperature in celsius, ");
            if (in.hasNextInt())
            {
                celsius = in.nextInt();
                break;
            }
            else
            {
                trash = in.nextLine();
                System.out.print("You must enter a valid number for the temperature. ");
            }
        }
        fahrenheit = (celsius * 1.8) + 32;
        if (fahrenheit == 32)
        {
            System.out.println("The temperature in fahrenheit is " + fahrenheit + " degrees. That is freezing.");
            //break;
        }
        else if (fahrenheit == 212)
        {
            System.out.println("The temperature in fahrenheit is " + fahrenheit + " degrees. That is boiling.");
            //break;
        }
        else
        {
            System.out.println("The temperature in fahrenheit is " + fahrenheit + " degrees.");
            //break;
        }

    }
}

