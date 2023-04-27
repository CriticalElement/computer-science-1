import java.util.Scanner;

public class PrimeCheckerAPP
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int repeat = 1;
        while (repeat == 1)
        {
            System.out.print("Enter an integer to check if prime >>> ");
            int num = scan.nextInt();
            boolean prime = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    prime = false;
                }
            }
            if (prime) {
                System.out.println(num + " is a prime number");
            }
            else {
                System.out.println(num + " is composite");
            }
            System.out.print("Enter 1 to keep checking, enter 2 to quit >>> ");
            repeat = scan.nextInt();
        }
    }
}
