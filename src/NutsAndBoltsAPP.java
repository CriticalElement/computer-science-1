// Name: Pranav Pakanati
// Period: Jarrell 2B

import java.util.*;

public class NutsAndBoltsAPP
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Number of bolts >>> ");
        int bolts = scan.nextInt();
        System.out.print("Number of nuts >>> ");
        int nuts = scan.nextInt();
        System.out.print("Number of washers >>> ");
        int washers = scan.nextInt();
        System.out.println();

        boolean correctNuts = true;
        boolean correctWashers = true;
        if (bolts > nuts)
        {
            correctNuts = false;
        }
        if (bolts * 2 > washers)
        {
            correctWashers = false;
        }

        if (correctNuts && correctWashers)
        {
            System.out.println("Order OK!");
        }
        if (!correctNuts)
        {
            System.out.println("Warning! Check order: too few nuts");
        }
        if (!correctWashers)
        {
            System.out.println("Warning! Check order: too few washers");
        }
        System.out.println();

        System.out.println("Total cost (in cents) >>> " + (bolts * 5 + nuts * 3 + washers));
    }
}
