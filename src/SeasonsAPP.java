// Name: Pranav Pakanati
// Period: Jarrell 2B

import java.util.*;

public class SeasonsAPP
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the month >>> ");
        int month = scan.nextInt();
        System.out.print("Enter the day >>> ");
        int day = scan.nextInt();

        if (month == 12 || month <= 3)
        {
            // could be winter
            if (month == 12 && day >= 16 || month == 3 && day <= 15)
            {
                System.out.println("Winter");
            }
            else if (month == 12)
            {
                System.out.println("Fall");
            }
            else if (month == 3)
            {
                System.out.println("Spring");
            }
            else
            {
                System.out.println("Winter");
            }
        }
        else if (month <= 6)
        {
            // could be spring
            if (month == 6 && day <= 15)
            {
                System.out.println("Spring");
            }
            else if (month == 6)
            {
                System.out.println("Summer");
            }
            else
            {
                System.out.println("Spring");
            }
        }
        else if (month <= 9)
        {
            // could be summer
            if (month == 9 && day <= 15)
            {
                System.out.println("Summer");
            }
            else if (month == 9)
            {
                System.out.println("Fall");
            }
            else
            {
                System.out.println("Summer");
            }
        }
        else
        {
            System.out.println("Fall");
        }
    }
}
