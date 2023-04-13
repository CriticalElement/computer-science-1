import java.util.Scanner;

@SuppressWarnings("WeakerAccess")
public class ApproximatePIAPP
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of iterations you want to approximate pi with >>> ");
        int iterations = scan.nextInt();

        System.out.println(approximatePI(iterations));
    }

    public static double approximatePI(int iterations)
    {
        double accumulate = 0;
        double numerator = -1;
        for (int n = 1; n <= iterations; n++) {
            numerator *= -1;
            double denominator = 2 * n - 1;
            accumulate += numerator / denominator;
        }
        return accumulate * 4;
    }
}
