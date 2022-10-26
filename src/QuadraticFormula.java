// Name: Pranav Pakanati
// Period: Jarrell 2B

import java.util.*;

public class QuadraticFormula
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value for coefficient a >>> ");
        double a = scan.nextDouble();
        System.out.print("Enter value for coefficient b >>> ");
        double b = scan.nextDouble();
        System.out.print("Enter value for coefficient c >>> ");
        double c = scan.nextDouble();

        double discrim = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
        double root1 = (-b + discrim) / (2 * a);
        double root2 = (-b - discrim) / (2 * a);

        System.out.println("\nThe roots of the polynomial are " + root1 + ", " + root2);
    }
}
