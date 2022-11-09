// Name: Pranav Pakanati
// Period: Jarrell 2B

import java.util.Scanner;

public class HailstoneSeriesAPP
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int largest = 0;
        System.out.print("Enter an integer >>> ");
        int start = scan.nextInt();
        int steps = 0;
        while (start != 1)
        {
            System.out.println(start);
            largest = Math.max(largest, start);
            if (start % 2 == 0)
            {
                start /= 2;
            }
            else
            {
                start = start * 3 + 1;
            }
            steps++;
        }
        System.out.println(1 + "\n");
        System.out.println("Series took " + steps + " to reach a value of 1");
        System.out.println("Largest integer generated: " + largest);
    }
}
