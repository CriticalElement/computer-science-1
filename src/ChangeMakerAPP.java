import java.util.Scanner;

@SuppressWarnings("WeakerAccess")
public class ChangeMakerAPP
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the amount paid? ");
        double paid = scan.nextDouble();
        System.out.print("What is the cost? ");
        double cost = scan.nextDouble();

        makeChange(paid, cost);
    }

    public static void makeChange(double paid, double cost)
    {
        double[] denominations = new double[] {20, 10, 5, 1, 0.25, 0.10, 0.05, 0.01};
        String[] amountString = new String[] {"$20:", "$10:", "$5: ", "$1: ", "25c:", "10c:", "5c: ", "1c: "};
        int[] count = new int[denominations.length];

        while (paid - cost > 0.009)
        {
            for (int i = 0; i < denominations.length; i++) {
                if (paid - denominations[i] - cost >= -0.009) {
                    count[i]++;
                    paid -= denominations[i];
                    break;
                }
            }
        }

        for (int i = 0; i < denominations.length; i++) {
            if (i == 4)
                System.out.println();
            System.out.println(amountString[i] + "\t" + count[i]);
        }
    }
}
