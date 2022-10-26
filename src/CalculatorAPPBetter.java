// Name: Pranav Pakanati
// Period: Jarrell 2B

import java.util.*;

public class CalculatorAPPBetter
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_RED = "\u001B[31m";

        while (true)
        {
            System.out.println("1 – addition \t\t(+)");
            System.out.println("2 – subtraction \t(-)");
            System.out.println("3 – multiplication \t(*)");
            System.out.println("4 – division \t\t(/)");
            System.out.println("5 – modulus \t\t(%)\n");
            System.out.println("q - quit");

            System.out.print("Enter the number of your desired operation from the menu above >>> ");
            String input = scan.next();
            if (input.equalsIgnoreCase("q"))
            {
                System.out.println("Goodbye!");
                return;
            }
            int operation;
            try
            {
                operation = Integer.parseInt(input);
            }
            catch (NumberFormatException e)
            {
                System.out.println(ANSI_RED + "Enter a value between 1 and 5, or type q to quit\n" + ANSI_RESET);
                continue;
            }
            if (operation < 1 || operation > 5)
            {
                System.out.println(ANSI_RED + "Enter a value between 1 and 5\n" + ANSI_RESET);
                continue;
            }

            System.out.print("Enter first number >>> ");
            double first = scan.nextDouble();
            System.out.print("Enter second number >>> ");
            double second = scan.nextDouble();
            System.out.println();

            double result;
            String op;
            if (operation == 1)
            {
                result = first + second;
                op = "+";
            }
            else if (operation == 2)
            {
                result = first - second;
                op = "-";
            }
            else if (operation == 3)
            {
                result = first * second;
                op = "*";
            }
            else if (operation == 4)
            {
                result = first / second;
                op = "/";
            }
            else
            {
                result = first % second;
                op = "%";
            }
            System.out.println(first + " " + op + " " + second + " = " + result + "\n");
        }
    }
}
