// Name: Pranav Pakanati
// Period: Jarrell 2B

import java.util.Scanner;

public class BinaryConversionAPP
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter binary number >>> ");
        String binaryString = scan.nextLine();

        int[] binaryArray = new int[binaryString.length()];
        for (int i = 0; i < binaryString.length(); i++) {
            binaryArray[i] = Integer.parseInt(binaryString.substring(i, i + 1));
        }

        int sum = 0;
        for (int i = 0; i < binaryArray.length; i++) {
            sum += Math.pow(2, binaryArray.length - i - 1) * binaryArray[i];
        }

        System.out.println(binaryString + " binary == " + sum + " decimal");
    }
}
