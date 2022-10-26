// Name: Pranav Pakanati
// Period: Jarrell 2B

import java.util.*;

public class CalculatorAPP
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("1 – addition \t\t(+)");
        System.out.println("2 – subtraction \t(-)");
        System.out.println("3 – multiplication \t(*)");
        System.out.println("4 – division \t\t(/)");
        System.out.println("5 – modulus \t\t(%)\n");

        System.out.print("Enter the number of your desired operation from the menu above >>> ");
        int operation = scan.nextInt();
        if (operation < 1 || operation > 5)
        {
            throw new IndexOutOfBoundsException("Enter a value between 1 and 5");
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
        System.out.println(first + " " + op + " " + second + " = " + result);
    }
}
