import View.TUI;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        // Set Variables
        int sum;
        int currentPlayer = 0;

        // Create Scanner for player input
        Scanner input = new Scanner(System.in);

        //Instantiate each Field and store in array
        Field[] fields = {
                new Field("Tower", 250, "The Tower is quite tall yet seems abandoned, until you find a pile of gold and its decayed former owner..."),
                new Field("Crater", -100, "One wrong step and you tumble down the steep depths of The Crater, throwing plenty of your belongings out of your pockets..."),
                new Field("Palace gates", 100, "Marvelous Palace Gates greet you on your journey, beautiful decoration as far as the eye can see. They wouldn't notice one missing, right?"),
                new Field("Cold Desert", -20, "Travelling The Cold Desert at night is, well, Cold. You eat though plenty of food supplies to keep warm."),
                new Field("Walled city", 180, "Wall strong enough to repell a trebuchet with ease, The Walled City provides a good nights sleep."),
                new Field("Monastery", 0, "Tired, you stumble across a peaceful little Monastery. For a single night you sleep peacefully."),
                new Field("Black Cave", -70, "You walk though a pitch Black Cave. You Step on a sharp rock and bleed profusely using almost all of your bandages."),
                new Field("Huts in the Mountain", 60, "Idyllic little huts litter the clearance in the Mountains. A nice family offers you stay for the night and a free meal."),
                new Field("The Werewall (Werewolf-Wall)", -80, "The full Moon stands proudly on the night sky, Howls of foul beasts chill your bones. RUN! Run the night away!"),
                new Field("The Pit", -50, "You come across a great big hole in the ground with a big crowd around it and see two gladiators ready to fight! You place a bet, however on the one who will lose his head..."),
                new Field("Goldmine", 650, "You enter a Gold Mine. Piles of Gold as far as the eye can see. You steal as much as you can carry without getting noticed!"),
        };

        //Instantiate each Player and store in array
        Player[] players = {
                new Player("Player 1"),
                new Player("Player 2")
        };

        // Instatiate Cup
        Cup rafleCup = new Cup();

        //Print
        TUI.startGame();

        TUI.language();

        // Start Game Loop (Break statement is used to end game)
        while (1==1){
            //Print player turn
            TUI.printPlayersTurn(currentPlayer);

            //Roll
            sum = rafleCup.getSum();

            //Print facevalue
            TUI.printFaceValue(rafleCup.getFacevalue1(), rafleCup.getFacevalue2());

            // Move Player
            players[currentPlayer].changePlacement(sum);

            //Print player placement
            TUI.printPlayerPlacement(players[currentPlayer].getPlacement());

            // Complete Turn Effect
                //Prints fieldname, description and rents to the player
                TUI.printTurnEffect(fields[sum-2].getName(), fields[sum-2].getDescription(), fields[sum-2].getRent());

                //Set playerbalance
                players[currentPlayer].setPlayerBalance(fields[sum-2].getRent());

                //Print player balance
                TUI.printPlayerBalance(players[currentPlayer].getPlayerBalance());

            // Next turn
            if (sum==10){
                System.out.println("Because you ran from the Werewolves you gain an extra turn.");
            }
            else
            {
                if (currentPlayer==0){
                    currentPlayer=1;
                }
                else
                {
                    currentPlayer=0;
                }
            }

            // End Game if player is
            if (players[currentPlayer].getPlayerBalance()>3000){
                //Check account balance
                System.out.println("PLAYER " + (currentPlayer+1) + "HAS WON THE GAME BY EARNING 3000 POINTS");
                break;
            }
        }
    }
}
