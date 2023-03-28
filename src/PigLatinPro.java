import java.util.Arrays;
import java.util.Scanner;

public class PigLatinPro
{
    public static void main(String[] args)
    {
        final String[] VOWELS = new String[] {"a", "e", "i", "o", "u"};

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a word or phrase to be translated (type \"quit\" to quit): ");
            String input = scan.nextLine();
            if (input.equalsIgnoreCase("quit")) {
                return;
            }
            String originalPhrase = input.toLowerCase();
            originalPhrase = originalPhrase.replaceAll("[^a-zA-Z0-9_ ]", "");
            String[] words = originalPhrase.split(" ");

            for (String word : words) {
                if (Arrays.binarySearch(VOWELS, word.substring(0, 1)) < 0) { // if the first character is a consonant
                    boolean hasVowel = false;
                    int letterYIndex = -1;
                    for (int i = 0; i < word.length(); i++) {
                        if (word.substring(i, i + 1).equals("y")) {
                            letterYIndex = i;
                            break;
                        }
                    }
                    int firstVowelIndex = 0;
                    for (int i = 1; i < word.length(); i++) {
                        if (Arrays.binarySearch(VOWELS, word.substring(i, i + 1)) >= 0) { // find first vowel in word
                            firstVowelIndex = i;
                            hasVowel = true;
                            break;
                        }
                    }
                    if (!hasVowel && letterYIndex != -1) { // if y is the only vowel in the string
                        firstVowelIndex = letterYIndex;
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
