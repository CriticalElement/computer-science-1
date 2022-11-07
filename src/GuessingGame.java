// Name: Pranav Pakanati
// Period: Jarrell 2B

import java.util.Scanner;

public class GuessingGame
{
    public static void main(String[] args)
    {
        // 1:
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer >>> ");
        int num = scan.nextInt();

        int i = 1;
        while (i <= num)
        {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        // 2:
        System.out.print("Enter an integer >>> ");
        num = scan.nextInt();

        int sum = 0;
        i = 1;
        while (i <= num)
        {
            sum += i;
            i++;
        }
        System.out.println("Sum of all numbers from 1 to " + num + " >>> " + sum);

        // 3:
        System.out.print("Enter an integer >>> ");
        num = scan.nextInt();

        sum = 0;
        i = 1;
        while (i <= num)
        {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println("Sum of all even numbers from 1 to " + num + " >>> " + sum);

        // 4:
        // no

        // 5:
        System.out.print("Enter an integer >>> ");
        num = scan.nextInt();

        sum = 0;
        i = 1;
        while (i <= num)
        {
            if (i % 7 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println("Sum of all multiples of 7 from 1 to " + num + " >>> " + sum);

        // 6:
        System.out.print("Enter an integer >>> ");
        num = scan.nextInt();

        sum = 0;
        i = 1;
        while (i <= num)
        {
            if (i % 8 == 0 || i % 13 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println("Sum of all multiples of 8 or 13 from 1 to " + num + " >>> " + sum);
    }
}
