// Name: Pranav Pakanati
// Period: Jarrell 2B

import java.util.Random;
import java.util.Scanner;

public class FullBlackJack
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int keepPlaying = 1;

        while (keepPlaying == 1)
        {
            System.out.println("*****************************");
            System.out.println("*   Welcome to the casino   *");
            System.out.println("*****************************\n");

            int dealerValue = 0;
            dealerValue += random.nextInt(10) + 2;
            dealerValue += random.nextInt(10) + 2;
            System.out.println("The dealer has her cards");

            int cardValue = 0;
            cardValue += random.nextInt(10) + 2;
            System.out.println("Your first card is >>> " + cardValue);
            int secondCard = random.nextInt(10) + 2;
            System.out.println("Your second card is >>> " + secondCard);
            cardValue += secondCard;
            System.out.println("Your total is >>> " + cardValue + "\n");

            boolean end = false;
            while (!end)
            {
                System.out.print("Enter 1 to hit, enter 2 to stay >>> ");
                int action = scan.nextInt();
                if (action == 1)
                {
                    int next = random.nextInt(10) + 2;
                    System.out.println("Next card >>> " + next);
                    cardValue += next;
                    System.out.println("Current total >>> " + cardValue);
                    if (dealerValue <= 14)
                    {
                        dealerValue += random.nextInt(10) + 2;
                    }

                    if (dealerValue > 21 || cardValue > 21)
                    {
                        end = true;
                        if (cardValue > 21)
                        {
                            System.out.println("Bust!");
                        }
                    }
                }
                else
                {
                    if (dealerValue <= 14)
                    {
                        dealerValue += random.nextInt(10) + 2;
                    }
                    end = true;
                }
            }

            System.out.println("\nYou have >>> " + cardValue);
            System.out.println("Dealer shows >>> " + dealerValue);

            if (dealerValue > 21 && cardValue > 21)
            {
                System.out.println("Both players bust!");
            }
            else if (dealerValue > 21)
            {
                System.out.println("Dealer busts! You win!");
            }
            else if (cardValue > 21)
            {
                System.out.println("You bust! Dealer wins!");
            }
            else if (dealerValue == cardValue)
            {
                System.out.println("Tie!");
            }
            else if (dealerValue > cardValue)
            {
                System.out.println("Dealer wins!");
            }
            else
            {
                System.out.println("You win!");
            }

            System.out.print("Enter 1 to play again or 2 to quit >>> ");
            keepPlaying = scan.nextInt();
            System.out.println();
        }
    }
}
