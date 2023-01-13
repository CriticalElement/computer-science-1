// Name: Pranav Pakanati, Akshay Gajjala, Shaunak Sethi
// Period: Jarrell 2B

import java.util.Scanner;

public class TShirtLauncher
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        // 1:
        System.out.println("1: ");
        System.out.print("Enter a double >>> ");
        double x = scan.nextDouble();
        System.out.print("Enter a double >>> ");
        double y = scan.nextDouble();
        System.out.println(Math.PI * (Math.pow(x, 6) - Math.pow(y, 6)));

        // 2:
        System.out.println("\n2: ");
        System.out.print("Enter a double >>> ");
        double r = scan.nextDouble();
        System.out.println(4/3f * Math.PI * Math.pow(r, 3));

        // 3:
        System.out.println("\n3: ");
        System.out.print("Enter a double >>> ");
        double z = scan.nextDouble();
        System.out.println(Math.abs(Math.pow(z, 4) - 1));

        // 4:
        System.out.println("\n4: ");
        System.out.print("Enter a double >>> ");
        x = scan.nextDouble();
        System.out.println(Math.log10(Math.abs(1 + x)));

        // 5:
        System.out.println("\n5: ");
        System.out.print("Enter a double >>> ");
        x = scan.nextDouble();
        System.out.println(Math.pow(x, 2) * Math.pow(Math.E, x));

        // 6:
        System.out.println("\n6: ");
        System.out.print("Enter a double >>> ");
        double a = scan.nextDouble();
        System.out.print("Enter a double >>> ");
        double b = scan.nextDouble();
        System.out.println(Math.sqrt(Math.pow(a, 2) - Math.pow(b, 2)));

        // 7:
        // no

        // 8:
        System.out.println("\n8: ");
        System.out.print("Enter a double >>> ");
        double bearing = scan.nextDouble();
        System.out.println(Math.round(bearing / 10));

        // 9:
        System.out.println("\n9: ");
        System.out.print("Enter a integer >>> ");
        int i = scan.nextInt();
        System.out.print("Enter a integer >>> ");
        int j = scan.nextInt();
        System.out.print("Enter a integer >>> ");
        int k = scan.nextInt();
        System.out.println(Math.min(Math.min(i, j), k));
    }
}
