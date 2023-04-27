import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Palindromes
{
    @SuppressWarnings("StringConcatenationInLoop") // no StringBuilder in CS1 :skull:
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner scan = new Scanner(new File("palindromes.txt"));

        while (scan.hasNext())
        {
            String forward = scan.nextLine();
            String backward = "";
            for (int i = forward.length() - 1; i >= 0; i--)
            {
                String letter = forward.substring(i, i + 1);
                backward += letter;
            }
            String forwardParsed = forward.replaceAll("[^a-zA-Z\\d]", "");
            String backwardParsed = backward.replaceAll("[^a-zA-Z\\d]", "");
            // regex explanation:
            // [^...] - match a single character not present in the following list (...)
            // a-zA-Z - match any lowercase or uppercase character
            // \d - match any digit
            // therefore, the regex matches all characters that are NOT alphanumeric
            // which are characters like . , ! ? ' - : <literal space character>
            // and all of these characters get replaced by an empty string "", effectively deleting the characters

            // technically you don't need the \d because there aren't any numbers in the test string, but whatever

            if (forwardParsed.equalsIgnoreCase(backwardParsed))
            {
                System.out.printf("%-75s PALINDROME\n\n", forward);
            }
            else
            {
                System.out.printf("%-75s NOT PALINDROME\n\n", forward);
            }
        }
    }
}
