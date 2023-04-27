import java.io.*;
import java.util.*;

public class SimonSays
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner scan = new Scanner(new File("simonTester.txt"));

        int total = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < total; i++)
        {
            String command = scan.nextLine();
            if (command.startsWith("Simon says "))
            {
                System.out.println(command.substring(11));
            }
        }
    }
}
