// Name: Pranav Pakanati
// Period: Jarrell 2B

import java.util.Random;
import java.util.Scanner;

public class RPSLS
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        // initialize the counters
        int rounds = 0;
        int wins = 0;
        int ties = 0;
        int losses = 0;

        boolean keepPlaying = true;
        while (keepPlaying)
        {
            System.out.println("Let's play RPSLS!\n");
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");
            System.out.println("4. Lizard");
            System.out.println("5. Spock");
            System.out.print("What is your selection? ");

            int selection = scan.nextInt();
            int computerSelection = random.nextInt(5) + 1;

            System.out.println();

            // check if wins / losses / draws
            switch (selection)
            {
                case 1:
                    System.out.println("You chose Rock.");
                    switch (computerSelection)
                    {
                        case 1:
                            System.out.println("The computer chose Rock.");
                            System.out.println("The two rocks bounce harmlessly off each other.");
                            System.out.println("You have tied.");
                            ties++;
                            break;
                        case 2:
                            System.out.println("The computer chose Paper.");
                            System.out.println("Paper covers rock.");
                            System.out.println("The computer wins.");
                            losses++;
                            break;
                        case 3:
                            System.out.println("The computer chose Scissors.");
                            System.out.println("Rock crushes scissors.");
                            System.out.println("You win!");
                            wins++;
                            break;
                        case 4:
                            System.out.println("The computer chose Lizard.");
                            System.out.println("Rock crushes lizard.");
                            System.out.println("You win!");
                            wins++;
                            break;
                        case 5:
                            System.out.println("The computer chose Spock.");
                            System.out.println("Spock vaporizes rock.");
                            System.out.println("The computer wins.");
                            losses++;
                            break;
                    }
                    break;
                case 2:
                    System.out.println("You chose Paper.");
                    switch (computerSelection)
                    {
                        case 1:
                            System.out.println("The computer chose Rock.");
                            System.out.println("Paper covers rock.");
                            System.out.println("You win!");
                            wins++;
                            break;
                        case 2:
                            System.out.println("The computer chose Paper.");
                            System.out.println("The two papers wrap each other, but nothing happens.");
                            System.out.println("You have tied.");
                            ties++;
                            break;
                        case 3:
                            System.out.println("The computer chose Scissors.");
                            System.out.println("Scissors cuts paper.");
                            System.out.println("The computer wins.");
                            losses++;
                            break;
                        case 4:
                            System.out.println("The computer chose Lizard.");
                            System.out.println("Lizard eats paper.");
                            System.out.println("The computer wins.");
                            losses++;
                            break;
                        case 5:
                            System.out.println("The computer chose Spock.");
                            System.out.println("Paper disproves Spock.");
                            System.out.println("You win!");
                            wins++;
                            break;
                    }
                    break;
                case 3:
                    System.out.println("You chose Scissors.");
                    switch (computerSelection)
                    {
                        case 1:
                            System.out.println("The computer chose Rock.");
                            System.out.println("Rock crushes scissors.");
                            System.out.println("The computer wins.");
                            losses++;
                            break;
                        case 2:
                            System.out.println("The computer chose Paper.");
                            System.out.println("Scissors cuts paper.");
                            System.out.println("You win!");
                            wins++;
                            break;
                        case 3:
                            System.out.println("The computer chose Scissors.");
                            System.out.println("The two scissors try to cut each other, but nothing happens.");
                            System.out.println("You have tied.");
                            ties++;
                            break;
                        case 4:
                            System.out.println("The computer chose Lizard.");
                            System.out.println("Scissors decapitates lizard.");
                            System.out.println("You win!");
                            wins++;
                            break;
                        case 5:
                            System.out.println("The computer chose Spock.");
                            System.out.println("Spock smashes scissors.");
                            System.out.println("The computer wins.");
                            losses++;
                            break;
                    }
                    break;
                case 4:
                    System.out.println("You chose Lizard.");
                    switch (computerSelection)
                    {
                        case 1:
                            System.out.println("The computer chose Rock.");
                            System.out.println("Rock crushes lizard.");
                            System.out.println("The computer wins.");
                            losses++;
                            break;
                        case 2:
                            System.out.println("The computer chose Paper.");
                            System.out.println("Lizard eats paper.");
                            System.out.println("You win!");
                            wins++;
                            break;
                        case 3:
                            System.out.println("The computer chose Scissors.");
                            System.out.println("Scissors decapitates lizard.");
                            System.out.println("The computer wins.");
                            losses++;
                            break;
                        case 4:
                            System.out.println("The computer chose Lizard.");
                            System.out.println("The two lizards try to bite each other, but nothing happens.");
                            System.out.println("You have tied.");
                            ties++;
                            break;
                        case 5:
                            System.out.println("The computer chose Spock.");
                            System.out.println("Lizard poisons Spock.");
                            System.out.println("You win!");
                            wins++;
                            break;
                    }
                    break;
                case 5:
                    System.out.println("You chose Spock.");
                    switch (computerSelection)
                    {
                        case 1:
                            System.out.println("The computer chose Rock.");
                            System.out.println("Spock vaporizes rock.");
                            System.out.println("You win!");
                            wins++;
                            break;
                        case 2:
                            System.out.println("The computer chose Paper.");
                            System.out.println("Paper disproves Spock.");
                            System.out.println("The computer wins.");
                            losses++;
                            break;
                        case 3:
                            System.out.println("The computer chose Scissors.");
                            System.out.println("Spock smashes scissors.");
                            System.out.println("You win!");
                            wins++;
                            break;
                        case 4:
                            System.out.println("The computer chose Lizard.");
                            System.out.println("Lizard poisons Spock.");
                            System.out.println("The computer wins.");
                            losses++;
                            break;
                        case 5:
                            System.out.println("The computer chose Spock.");
                            System.out.println("Spock tries to disprove Spock, but nothing happens.");
                            System.out.println("You have tied.");
                            ties++;
                            break;
                    }
            }

            rounds++;

            // check if the user wants to play again
            System.out.print("\nDo you want to play again? (Y or N) ");
            if (scan.next().equalsIgnoreCase("N"))
            {
                keepPlaying = false;
            }
            System.out.println();
        }

        System.out.println("Summary:");
        System.out.println("Rounds:\t\t" + rounds);
        System.out.printf("Wins:\t\t" + wins + "\t%.1f%%\n", (double) wins / rounds * 100);
        System.out.printf("Losses:\t\t" + losses + "\t%.1f%%\n", (double) losses / rounds * 100);
        System.out.printf("Ties:\t\t" + ties + "\t%.1f%%\n", (double) ties / rounds * 100);
    }
}
