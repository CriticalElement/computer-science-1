// Name: Pranav Pakanati
// Period: Jarrell 2B

import java.util.Scanner;

public class HailstoneSeries
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        // 1:
        int sum = 0;
        int num;
        System.out.print("Enter an integer (or 0 to quit) >>> ");
        while ((num = scan.nextInt()) != 0)
        {
            sum += num;
            System.out.print("Enter an integer (or 0 to quit) >>> ");
        }
        System.out.println("Sum of integers >>> " + sum + "\n");

        // 2:
        // no

        // 3:
        double potency = 100;
        double effectiveness = 0.88;
        int month = 0;
        while (potency > 50)
        {
            System.out.println("Month " + month + " Potency: " + potency);
            potency *= effectiveness;
            month++;
        }
        System.out.println("Month " + month + " Potency: " + potency + " <<< DISCARD\n");


        // 4:
        int pin = 4123;
        int attempts = 0;
        System.out.print("Enter a PIN number >>> ");
        while (scan.nextInt() != pin)
        {
            attempts++;

            if (attempts == 3)
            {
                System.out.println("Attempt limit exceeded. Account has been locked.");
                break;
            }
            System.out.print("Invalid PIN, try again. Enter a PIN number >>> ");
        }
        if (attempts != 3)
        {
            System.out.println("Access granted.");
        }
    }
}
