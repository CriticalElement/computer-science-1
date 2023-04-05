import java.util.Random;

@SuppressWarnings("WeakerAccess")
public class ApproximatePI
{
    public static void main(String[] args)
    {
        System.out.println(isPositive(5));
        System.out.println(isOdd(3));
        System.out.println(getMax(2, 5));
        System.out.println(rollDice());
        System.out.println(rollDice(20));
        System.out.println(capitalizeFirst("hello"));
        System.out.println(circleArea(3));
        System.out.println(isMultiple(8, 4));
        System.out.println(convertTime(3, true));
        printDiagonal("hello");
    }

    public static boolean isPositive(int a)
    {
        return a > 0;
    }

    public static boolean isOdd(int a)
    {
        return a % 2 != 0;
    }

    public static int getMax(int a, int b)
    {
        if (a > b)
        {
            return a;
        }
        return b;
    }

    public static int rollDice()
    {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    public static int rollDice(int numFaces)
    {
        Random random = new Random();
        return random.nextInt(numFaces) + 1;
    }

    public static String capitalizeFirst(String name)
    {
        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }

    public static double circleArea(double radius)
    {
        return Math.PI * radius * radius;
    }

    public static boolean isMultiple(int a, int b)
    {
        return a % b == 0;
    }

    public static String convertTime(double time, boolean isMinutes)
    {
        if (isMinutes) {
            return time + " minutes is " + time * 60 + " seconds";
        }
        else {
            return time + " seconds is " + time / 60 + " minutes";
        }
    }

    public static void printDiagonal(String s)
    {
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println(s.substring(i, i + 1));
        }
    }
}
