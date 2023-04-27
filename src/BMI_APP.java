import java.util.*;

public class BMI_APP
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter height in inches >>> ");
        double height = scan.nextDouble();
        System.out.print("Enter weight in pounds >>> ");
        double weight = scan.nextDouble();

        height /= 39.37;
        weight /= 2.205;

        double bmi = weight / Math.pow(height, 2);
        System.out.println("\nYour BMI is >>> " + bmi);
    }
}
