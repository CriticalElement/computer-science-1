// Name: Pranav Pakanati
// Period: Jarrell 2B

import java.util.*;

public class BasicBlackJackAPP
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        // hand values
        System.out.print("Player 1, enter hand value >>> ");
        int hand1 = scan.nextInt();
        System.out.print("Player 2, enter hand value >>> ");
        int hand2 = scan.nextInt();
        System.out.println();

        // determine who wins
        if (hand1 > 21 && hand2 > 21)
        {
            System.out.println("Both players bust!");
        }
        else if (hand1 > 21)
        {
            System.out.println("Player 2 wins!");
        }
        else if (hand2 > 21)
        {
            System.out.println("Player 1 wins!");
        }
        else if (hand1 == hand2)
        {
            System.out.println("Tie!");
        }
        else if (hand1 > hand2)
        {
            System.out.println("Player 1 wins!");
        }
        else
        {
            System.out.println("Player 2 wins!");
        }
        System.out.println();

        // round 2
        System.out.print("Player 1, enter hand value >>> ");
        hand1 = scan.nextInt();
        System.out.print("Player 2, enter hand value >>> ");
        hand2 = scan.nextInt();
        System.out.println();

        // determine who wins
        if (hand1 > 21 && hand2 > 21)
        {
            System.out.println("Both players bust!");
        }
        else if (hand1 > 21)
        {
            System.out.println("Player 2 wins!");
        }
        else if (hand2 > 21)
        {
            System.out.println("Player 1 wins!");
        }
        else if (hand1 == hand2)
        {
            System.out.println("Tie!");
        }
        else if (hand1 > hand2)
        {
            System.out.println("Player 1 wins!");
        }
        else
        {
            System.out.println("Player 2 wins!");
        }
        System.out.println();

        // round 3
        System.out.print("Player 1, enter hand value >>> ");
        hand1 = scan.nextInt();
        System.out.print("Player 2, enter hand value >>> ");
        hand2 = scan.nextInt();
        System.out.println();

        // determine who wins
        if (hand1 > 21 && hand2 > 21)
        {
            System.out.println("Both players bust!");
        }
        else if (hand1 > 21)
        {
            System.out.println("Player 2 wins!");
        }
        else if (hand2 > 21)
        {
            System.out.println("Player 1 wins!");
        }
        else if (hand1 == hand2)
        {
            System.out.println("Tie!");
        }
        else if (hand1 > hand2)
        {
            System.out.println("Player 1 wins!");
        }
        else
        {
            System.out.println("Player 2 wins!");
        }
        System.out.println();
    }
}
