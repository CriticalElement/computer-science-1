// Name: Pranav Pakanati
// Period: Jarrell 2B

import java.util.*;
public class Calculator
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        // 1:
        System.out.print("Enter an integer: ");
        int a = scan.nextInt();
        if (a == 9)
        {
            System.out.println("#1");
        }

        // 2:
        System.out.print("Enter an integer: ");
        int b = scan.nextInt();
        if (b == 9 || b > 20)
        {
            System.out.println("#2");
        }

        // 3:
        System.out.print("Enter an integer: ");
        int c = scan.nextInt();
        if (c == 5 || c == 6)
        {
            System.out.println("#3");
        }

        // 5:
        System.out.print("Enter an integer: ");
        int d = scan.nextInt();
        if (d != 4)
        {
            System.out.println("#5");
        }

        // 6:
        System.out.print("Enter a double: ");
        double e = scan.nextDouble();
        if (e < 10 && e > 2 && e != 7.5)
        {
            System.out.println("#6");
        }

        // 7:
        System.out.print("Enter a double: ");
        double f = scan.nextDouble();
        double g = 20;
        if (f > (g - 4) && f < (g + 4))
        {
            System.out.println("#7");
        }

        // 8:
        System.out.println("Welcome to Mr. Jarrell’s RPG Quest:");
        System.out.println("Assign stats to your character (max 15 points TOTAL)");
        System.out.println("****************************************************");
        System.out.print("Enter strength (from 1 to 10) >>> ");
        int strength = scan.nextInt();
        System.out.print("Enter health (1 to 10) >>> ");
        int health = scan.nextInt();
        System.out.print("Enter magic (from 1 to 10) >>> ");
        int magic = scan.nextInt();
        System.out.println();

        if ((strength + health + magic) > 15)
        {
            strength = 5;
            health = 5;
            magic = 5;
            System.out.println("Point limit exceeded!  Default values assigned");
        }

        System.out.println("Strength = " + strength + ", health = " + health + ", magic = " + magic + ". Good luck!");
    }
}
