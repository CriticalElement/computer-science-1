// Name: Pranav Pakanati
// Period: Jarrell 2B

import java.io.*;
import java.util.*;

public class FastFood
{
    public static void main(String[] args) throws Exception
    {
        Scanner scan = new Scanner(new File("order.txt"));

        int hotDogs = 0;
        int hamburgers = 0;
        int sodas = 0;
        double total = 0;

        String nextItem;

        while (!(nextItem = scan.nextLine()).equals("stop"))
        {
            switch (nextItem) {
                case "hot dog":
                    hotDogs++;
                    break;
                case "hamburger":
                    hamburgers++;
                    break;
                case "soda":
                    sodas++;
                    break;
            }
        }

        System.out.println("MrBeast Burger");
        System.out.println("Receipt");
        total += hotDogs * 2.50;
        System.out.printf(hotDogs + " hot dogs (2.50 each):\t\t\t%.2f\n", hotDogs * 2.50);
        total += hamburgers * 3.25;
        System.out.printf(hamburgers + " hamburgers (3.25 each):\t\t%.2f\n", hamburgers * 3.25);
        total += sodas * 1.25;
        System.out.printf(sodas + " sodas (1.25 each):\t\t\t%.2f\n", sodas * 1.25);
        System.out.printf("Order Total:\t\t\t\t\t%.2f", total);
    }
}
