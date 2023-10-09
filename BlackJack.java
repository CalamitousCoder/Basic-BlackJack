import java.util.Random;
import java.util.Scanner;

/********************************************************************************
 *@file BlackJack.java
 *@brief This program lets the user play a simplified version of BlackJack
 *@author Destiny Hale
 ********************************************************************************/
public class BlackJack {
    public static void main(String[] args) {
        //variables that need to outside loop for scope reasons
        boolean keepPlaying = true;
        int trackPlayerWins = 0;
        int trackDealerWins = 0;

        while (keepPlaying){

        // More variables
        boolean playerDone = false;
        boolean playerBust = false;
        int playerScore = 0;
        int dealerScore = 0;
        boolean dealerBust = false;

        Random random = new Random();
        Scanner userInput = new Scanner(System.in);

        // Just for aesthetics
        System.out.println("The game of Black Jack is about to begin");
        System.out.println();
        System.out.println("________________________________________");
        System.out.println("            Black Jack Table");
        System.out.println("________________________________________");

        System.out.println("Player's turn");
        // Handles all of Player's turn. Stop when they say done or hit 21
        while (!playerDone) {
            //generates cards and let player chose to hit or not
            String hitOrDone;
            int randomCard = random.nextInt(10) + 1;
            playerScore += randomCard;

            // stops loop for bust
            if (playerScore >= 21) {
                playerDone = true;
                System.out.println("Bust!");
                playerBust = true;
                break;
            }
            System.out.println("Card:    " + randomCard + " current score:     " + playerScore);
            System.out.print("(h) hit me again!  (d) I'm done ");
            hitOrDone = userInput.next();
            // stops loop
            if (hitOrDone.equals("d")) {
                playerDone = true;
            }

        }
        System.out.println("Player's final score is " + playerScore);

        //handles Dealer's turn
        while (dealerScore <= 17) {
            //gives Dealer's card until he busts or score is >= 17
            int randomCard = random.nextInt(10) + 1;
            dealerScore += randomCard;

            // stops loop for bust
            if (dealerScore >= 21) {
                System.out.println("Bust!");
                dealerBust = true;
                break;
            }
            System.out.println("Card:    " + randomCard + " current score:     " + dealerScore);
        }
        System.out.println("The dealer's final score is " + dealerScore);

//Just for formatting
        System.out.println();
        System.out.println();

        // Decide winner also count wins
        if (playerBust && dealerBust) {
            System.out.println("It's a tie!");
        } else if (playerBust) {
            System.out.println("The dealer wins.");
            trackDealerWins++;
        } else if (dealerBust) {
            System.out.println("You win!");
           trackPlayerWins++;
        } else if (dealerScore == playerScore) {
            System.out.println("It's a tie!");
        } else if (dealerScore > playerScore) {
            System.out.println("The dealer wins.");
            trackDealerWins++;
        } else {
            System.out.println("You win!");
            trackPlayerWins++;
            System.out.println();
        }
        System.out.println("Would you like to keep playing? (y/n)");
        String playerAnswer = userInput.next();
        keepPlaying = playerAnswer.equals("y");
    }
        System.out.println("Player won " + trackPlayerWins + " times");
        System.out.println("Dealer won " + trackDealerWins + " times");

        }
    }
