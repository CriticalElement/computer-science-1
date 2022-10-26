// Name: Pranav Pakanati
// Period: Jarrell 2B

import java.util.*;

public class BasicBlackJack
{
    public static void main(String[] args)
    {
        // 1: yes
        Scanner scan = new Scanner(System.in);

        // 2:
        System.out.print("Enter an int >>> ");
        int apples = scan.nextInt();
        if (apples > 0)
        {
            System.out.println("Hello World!");
        }

        // 3:
        System.out.print("Enter an int >>> ");
        apples = scan.nextInt();
        if (apples % 2 == 0)
        {
            System.out.println("omg it's even no way!!!11111111!!1");
        }

        // 4:
        else
        {
            System.out.println("Hmm that's odd!");
        }

        // 5:
        int votingAge = 18;
        System.out.print("Enter your age >>> ");
        int actualAge = scan.nextInt();
        if (actualAge >= votingAge)
        {
            System.out.println("You can vote");
        }
        else
        {
            System.out.println("You can't vote");
        }

        // 6:
        System.out.println("Enter angles of a triangle: ");
        System.out.print("Enter an angle >>> ");
        int angle1 = scan.nextInt();
        System.out.print("Enter another angle >>> ");
        int angle2 = scan.nextInt();
        System.out.print("Enter another angle >>> ");
        int angle3 = scan.nextInt();

        if (angle1 + angle2 + angle3 != 180)
        {
            System.out.println("Error: angles do not add up to 180");
        }
        else if (angle1 == angle2 && angle2 == angle3)
        {
            System.out.println("Equilateral");
        }
        else if (angle1 == angle2 || angle2 == angle3)
        {
            System.out.println("Isosceles");
        }
        else
        {
            System.out.println("Scalene");
        }
    }
}
