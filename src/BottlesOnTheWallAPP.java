// Name: Pranav Pakanati
// Period: Jarrell 2B

import java.util.Scanner;

public class BottlesOnTheWallAPP
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age (whole number only) >>> ");
        int age = scan.nextInt();
        String drink;

        if (age < 21)
        {
            drink = "Coke";
        }
        else
        {
            System.out.print("Do you prefer beer or Coke? (enter 1 for beer, 2 for Coke) >>> ");
            int choice = scan.nextInt();
            if (choice == 1)
            {
                drink = "beer";
            }
            else
            {
                drink = "Coke";
            }
        }
        System.out.println();

        int i = 99;
        while (i > 1) {
            System.out.println(i + " bottles of " + drink + " on the wall");
            System.out.println(i + " bottles of " + drink);
            System.out.println("Take one down, pass it around, " + i + " bottles of " + drink + " on the wall!\n");
            i--;
        }
        System.out.println("1 bottle of " + drink + " on the wall");
        System.out.println("1 bottle of " + drink);
        System.out.println("Take one down, pass it around, zero bottles of " + drink + " on the wall!");
    }
}
