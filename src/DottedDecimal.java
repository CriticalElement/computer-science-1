import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DottedDecimal
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner scan = new Scanner(new File("dot.dat"));

        int numLines = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < numLines; i++) {
            String ipAddress = scan.nextLine();
            String[] split = ipAddress.split("\\.");

            //noinspection ForLoopReplaceableByForEach
            for (int j = 0; j < split.length; j++) {
                System.out.printf("%08d", Integer.parseInt(Integer.toBinaryString(Integer.parseInt(split[j]))));
            }
            System.out.println();
        }
    }
}
