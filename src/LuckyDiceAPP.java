// Name: Pranav Pakanati
// Period: Jarrell 2B

import java.util.Random;
import java.util.Scanner;

public class LuckyDiceAPP
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Number of faces on each die? >>> ");
        int numFaces = scan.nextInt();
        System.out.print("Number of simulations? >>> ");
        int numSimulations = scan.nextInt();
        System.out.println();

        int rollTotal = 0;
        for (int i = 1; i <= numSimulations; i++)
        {
            int total = 0;
            int runs = 0;
            while (total < 1000)
            {
                total += (random.nextInt(numFaces) + 1) + (random.nextInt(numFaces) + 1);
                runs++;
            }
            System.out.println("Simulation " + i + " - number of rolls to reach 1000 >>> " + runs);
            rollTotal += runs;
        }
        System.out.println("\nAverage number of rolls, for all simulations >>> " + rollTotal / numSimulations);
    }
}
