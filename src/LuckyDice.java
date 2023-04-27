import java.util.Scanner;

public class LuckyDice
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        // 1:
        System.out.print("Enter an integer >>> ");
        int num = scan.nextInt();
        System.out.print("Factors of " + num + " >>> ");
        for (int i = 1; i <= num; i++)
        {
            if (num % i == 0)
            {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");

        // 2:
        System.out.print("Enter an integer >>> ");
        num = scan.nextInt();
        int coolNumbers = 0;
        for (int i = 0; i <= num; i++)
        {
            if (i % 3 == 1 && i % 4 == 1 && i % 5 == 1)
            {
                coolNumbers++;
            }
        }
        System.out.println("There are " + coolNumbers + " cool numbers up to " + num + "\n");

        // 3:
        System.out.print("Enter an integer >>> ");
        num = scan.nextInt();
        coolNumbers = 0;
        int i = 0;
        while (i <= num)
        {
            if (i % 3 == 1 && i % 4 == 1 && i % 5 == 1)
            {
                coolNumbers++;
            }
            i++;
        }
        System.out.println("There are " + coolNumbers + " cool numbers up to " + num + "\n");

        // 4:
        // no

        // 5:
        System.out.print("Enter an integer >>> ");
        num = scan.nextInt();
        int sum = 0;
        for (int j = 1; j <= num / 2; j++)
        {
            if (num % j == 0)
            {
                sum += j;
            }
        }
        if (sum == num)
        {
            System.out.println(num + " is a perfect number");
        }
        else
        {
            System.out.println(num + " is not a perfect number");
        }
        System.out.println();

        // 6:
        System.out.print("Enter an integer >>> ");
        num = scan.nextInt();
        i = 1;
        sum = 0;
        do {
            if (num % i == 0)
            {
                sum += i;
            }
            i++;
        }
        while (i <= num / 2);
        if (sum == num)
        {
            System.out.println(num + " is a perfect number");
        }
        else
        {
            System.out.println(num + " is not a perfect number");
        }

        // 7:
        // your mom
    }
}
