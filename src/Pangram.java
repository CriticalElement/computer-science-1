import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Pangram
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner scan = new Scanner(new File("pangramTester.txt"));
        final char[] letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

        while (scan.hasNextLine()) {
            String inputText = scan.nextLine();
            String parsedText = inputText.replaceAll("\\W", "");
            char[] textChars = parsedText.toCharArray();
            int[] occurrences = new int[26];
            for (char textChar : textChars) {
                occurrences[Arrays.binarySearch(letters, textChar)] += 1;
            }
            boolean isPangram = true;
            String identifierText = "PANGRAM";
            for (int occurrence : occurrences) {
                if (occurrence == 0) {
                    isPangram = false;
                    identifierText = "NEITHER";
                    break;
                }
            }
            if (textChars.length == 26 && isPangram) {
                identifierText = "PERFECT";
            }

            System.out.println(identifierText + ": " + inputText);
        }
    }
}
