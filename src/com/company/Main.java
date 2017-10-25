package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {


        int option = 0;
        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> colours = new ArrayList<String>();
        String enterColour = "";
        String Add = "";

        colours.add("blue");
        colours.add("red");
        colours.add("green");
        colours.add("mauve");

        do
        {
            System.out.println("1. Add a colour");
            System.out.println("2. Delete a colour ");
            System.out.println("3. Show the colour list");
            System.out.println("4. Quit");
            System.out.println("Enter a number to select a menu option:");
            option = keyboard.nextInt();
            keyboard.nextLine();


            if (option == 1)
            {
                System.out.println("Enter the colour to add to the arraylist of colours");
                enterColour = keyboard.nextLine();
                colours.add(enterColour);
                System.out.println(colours.get(colours.indexOf(enterColour)));
            }
            else if (option == 2)
            {
                System.out.println("Enter the colour to delete from the arraylist of colours:");
                enterColour = keyboard.nextLine().toLowerCase();
                ;
                if (colours.contains(enterColour))
                    colours.remove(enterColour);
                else
                    System.out.println("Unable to find that colour");


            }

            else if (option == 3)
            {

                //for(int counter=0; counter<colours.size(); counter++)
                for (String count : colours)
                {
                    // System.out.println(colours.get(counter));
                    System.out.println(count);
                }

                System.out.println("List of all Colors:" + colours);
            }

        }
        while (option != 4);
    }
}