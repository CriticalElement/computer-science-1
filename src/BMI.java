// Name: Pranav Pakanati
// Period: Jarrell 2B
import java.util.*;


public class BMI
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        // 1:
        String hi = "hi, ";
        String mom = "Mom";
        System.out.println(hi + mom);

        // wtf happened to 2

        // 3:
        String someName = "Bob";
        System.out.println("Hello, " + someName + "!");

        // 4:
        String hello = "Hello";
        String world = "World";
        System.out.println(hello + ", " + world + "... Goodbye");

        // 5:
        int a = 14;
        int b = 6;
        System.out.println(a + " % " + b + " is " + a % b);

        // 6:
        System.out.print("Enter an integer: ");
        int num1 = scan.nextInt();
        System.out.println(num1 + 10);
        scan.nextLine();

        // 7:
        System.out.print("Enter your name: ");
        String name1 = scan.nextLine();
        System.out.println("Hello, " + name1 + "!");

        // 8:
        System.out.print("Enter a double: ");
        double something = scan.nextDouble();
        System.out.println(something * something);
        scan.nextLine();

        // 9:
        System.out.print("Enter a String: ");
        String name2 = scan.nextLine();
        System.out.print("Enter an integer: ");
        int age = scan.nextInt();
        System.out.println(name2 + " is " + age + " years old");
        scan.nextLine();

        // 10:
        System.out.print("Enter a double: ");
        double radius = scan.nextDouble();
        System.out.println(radius * radius * 3.14159);
        scan.nextLine();

        // 11:
        System.out.print("Enter the number of seconds of free fall >>> ");
        double time = scan.nextDouble();
        System.out.println("Distance traveled >>> " + time * time * 1/2 * 32.174 + "ft");
        scan.nextLine();

        // 12:
        System.out.print("Enter your name: ");
        name1 = scan.nextLine();
        System.out.println(name1 + name1 + name1);
    }
}
