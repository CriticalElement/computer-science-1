import java.util.Scanner;

public class BinaryConversionAPP
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("0 for binary, 1 for hexadecimal >>> ");
        int option = scan.nextInt();
        scan.nextLine();
        if (option == 0) {
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
        else {
            System.out.print("Enter hexadecimal number >>> ");
            String hexadecimalString = scan.nextLine();
            int hexNum = Integer.parseInt(hexadecimalString, 16);
            System.out.println(hexadecimalString + " hexadecimal == " + hexNum + " decimal");
        }
    }
}
