// Name: Pranav Pakanati
// Period: Jarrell 2B

import java.util.Scanner;

public class WeightOnPlanets
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("What is your weight on the Earth? ");
        double weight = scan.nextDouble();
        System.out.println("1. Voltar");
        System.out.println("2. Krypton");
        System.out.println("3. Fertos");
        System.out.println("4. Servontos");
        System.out.print("Selection? ");
        int selection = scan.nextInt();
        String planet;

        switch (selection)
        {
            case 1:
                weight *= 0.091;
                planet = "Voltar";
                break;
            case 2:
                weight *= 0.720;
                planet = "Krypton";
                break;
            case 3:
                weight *= 0.865;
                planet = "Fertos";
                break;
            case 4:
                weight *= 4.612;
                planet = "Servontos";
                break;
            default:
                planet = "Unknown";
                weight = Double.MAX_VALUE;
        }

        System.out.println("Your weight on " + planet + " would be " + weight);

    }
}
