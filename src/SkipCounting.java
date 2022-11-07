// Name: Pranav Pakanati
// Period: Jarrell 2B

import java.util.Scanner;

public class SkipCounting
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the multiplier: ");
        int multiplier = scan.nextInt();
        System.out.print("Enter the highest end value: ");
        int endValue = scan.nextInt();

        int beginValue = multiplier;
        while (beginValue <= endValue)
        {
            System.out.println(beginValue);
            beginValue += multiplier;
        }
    }
}
