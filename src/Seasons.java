import java.util.*;

public class Seasons
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        // 1:
        System.out.print("Enter left tire pressure >>> ");
        int leftPressure = scan.nextInt();
        System.out.print("Enter right tire pressure >>> ");
        int rightPressure = scan.nextInt();
        if (leftPressure < 36 || rightPressure < 36)
        {
            System.out.println("Warning! Low tire pressure");
        }
        System.out.println();

        // 2:
        System.out.print("Enter left tire pressure >>> ");
        leftPressure = scan.nextInt();
        System.out.print("Enter right tire pressure >>> ");
        rightPressure = scan.nextInt();
        if (Math.abs(leftPressure - rightPressure) >= 4)
        {
            System.out.println("Warning! Uneven tire pressure");
        }
        System.out.println();

        // 3:
        // no

        // 4:
        System.out.print("Enter a numerical grade >>> ");
        double grade = scan.nextDouble();

        if (grade <= 59)
        {
            System.out.println("F");
        }
        else if (grade <= 69)
        {
            System.out.println("D");
        }
        else if (grade <= 79)
        {
            System.out.println("C");
        }
        else if (grade <= 89)
        {
            System.out.println("B");
        }
        else
        {
            System.out.println("A");
        }
        System.out.println();

        // 5:
        System.out.print("Enter an integer >>> ");
        int num = scan.nextInt();
        if (num % 10 >= 5)
        {
            System.out.println(num / 10 * 10 + 10);
        }
        else
        {
            System.out.println(num / 10 * 10);
        }
    }
}
