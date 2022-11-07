// Name: Pranav Pakanati
// Period: Jarrell 2B

import java.util.Scanner;
import java.util.Random;

public class GuessingGameAPP
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Let's play a guessing game!");
        System.out.println("The number to guess will be from 1 to 1000");
        System.out.println("You will have 7 attempts to guess the number correctly\n");

        Random random = new Random();
        int randomNumber = random.nextInt(1000) + 1;
        int guesses = 7;
        while (guesses > 0)
        {
            System.out.print("Enter your guess (whole number from 1 to 1000) >>> ");
            int guess = scan.nextInt();
            if (guess == randomNumber)
            {
                System.out.println("Congratulations! You win!");
                break;
            }
            else if (guess < randomNumber)
            {
                if (guesses == 1)
                {
                    System.out.println("Out of guesses! You lose! Number was >>> " + randomNumber);
                    break;
                }
                System.out.println("Too low! Guesses remaining >>> " + --guesses);
            }
            else
            {
                if (guesses == 1)
                {
                    System.out.println("Out of guesses! You lose! Number was >>> " + randomNumber);
                    break;
                }
                System.out.println("Too high! Guesses remaining >>> " + --guesses);
            }
        }
    }
}
