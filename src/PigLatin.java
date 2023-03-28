import java.util.Arrays;
import java.util.Scanner;

public class PigLatin
{
    public static void main(String[] args)
    {
        String[] vowels = new String[] {"a", "e", "i", "o", "u"};

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a word or phrase to be translated (type \"quit\" to quit): ");
            String input = scan.nextLine();
            if (input.equalsIgnoreCase("quit")) {
                return;
            }
            String originalPhrase = input.toLowerCase();
            String[] words = originalPhrase.split(" ");

            for (String word : words) {
                word = word.replaceAll("\\W", "");
                if (Arrays.binarySearch(vowels, word.substring(0, 1)) < 0) { // if the first character is a consonant
                    int firstVowelIndex = 0;
                    for (int i = 1; i < word.length(); i++) {
                        if (Arrays.binarySearch(vowels, word.substring(i, i + 1)) >= 0) { // find first vowel in word
                            firstVowelIndex = i;
                            break;
                        }
                    }
                    String movedChars = word.substring(0, firstVowelIndex);
                    String inPlaceChars = word.substring(firstVowelIndex);
                    System.out.print(inPlaceChars + movedChars + "ay ");
                }
                else { // first letter is a vowel
                    System.out.print(word + "hay ");
                }
            }

            System.out.println();
        }
    }
}
