import java.util.Scanner;

public class PrimeChecker
{
    public static void main(String[] args)
    {
        // 1:
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
        }
        System.out.println();

        // 2:
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 3:
        for (int i = 2; i < 21; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 4:
        for (int i = 20; i < 26; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 5:
        for (int i = 10; i < 90; i += 10) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 6:
        // no

        // 7:
        for (int i = 0; i > -11; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 8:
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer >>> ");
        int iterations = scan.nextInt();
        for (int i = 0; i < iterations; i++) {
            System.out.print("* ");
        }
        System.out.println();

        // 9:
        for (int i = 1; i < 11; i++) {
            System.out.print(i * i + " ");
        }
        System.out.println();

        // 10:
        for (int i = 1; i < 10; i++) {
            if (i % 3 == 0) {
                System.out.print("? ");
            }
            else {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // 11:
        int total = 1;
        System.out.print("Enter an integer >>> ");
        iterations = scan.nextInt();
        for (int i = 1; i <= iterations; i++) {
            total *= i;
        }
        System.out.println(total);
    }
}
