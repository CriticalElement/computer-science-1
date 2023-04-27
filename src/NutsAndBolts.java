import java.util.*;

public class NutsAndBolts
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        // 1:
        System.out.print("Enter an integer: ");
        int num1 = scan.nextInt();
        System.out.print("Enter an integer: ");
        int num2 = scan.nextInt();

        if (num1 > num2)
        {
            System.out.println(num1);
        }
        else if (num2 > num1)
        {
            System.out.println(num2);
        }
        else
        {
            System.out.println("Numbers are equal");
        }
        System.out.println();

        // 2:
        System.out.print("Enter the dollar value of the total bill >>> $ ");
        double totalBill = scan.nextDouble();
        double discount = 0;

        if (totalBill > 2000)
        {
            discount = 0.15;
        }
        else if (totalBill >= 1000 && totalBill <= 2000)
        {
            discount = 0.10;
        }

        System.out.println("Total bill after discounts (if applicable) >>> $ " + (totalBill - (totalBill * discount)));
        System.out.println();

        // 3:
        System.out.print("Enter the dollar value of the total bill >>> $ ");
        totalBill = scan.nextDouble();
        discount = 0;

        if (totalBill > 2000)
        {
            discount = 0.15;
        }
        else if (totalBill >= 1000 && totalBill <= 2000)
        {
            discount = 0.10;
        }

        double discounted = totalBill - (totalBill * discount);
        System.out.print("Do you have a coupon?  Enter true or false >>> ");
        boolean hasCoupon = scan.nextBoolean();

        if (hasCoupon)
        {
            discounted -= discounted * 0.05;
        }

        System.out.println("Total bill after discounts (if applicable) >>> $ " + discounted);
        System.out.println();

        // 4:
        // no

        // 5:
        System.out.print("Enter a year: ");
        int year = scan.nextInt();
        if (year % 400 == 0)
        {
            System.out.println("" + year + " is a leap year");
        }
        else if (year % 100 == 0)
        {
            System.out.println("" + year + " is not a leap year");
        }
        else if (year % 4 == 0)
        {
            System.out.println("" + year + " is a leap year");
        }
        else
        {
            System.out.println("" + year + " is not a leap year");
        }
    }
}
