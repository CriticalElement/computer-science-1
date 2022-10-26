import java.util.*;

public class EvenOrOdd
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scan.nextInt();
        System.out.print("The integer " + num + " is ");
        if (num % 2 == 0)
        {
            System.out.print("even.");
        }
        else
        {
            System.out.print("odd.");
        }
    }
}
