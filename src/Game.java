import View.TUI;

import java.util.Scanner;

import static View.TUI.languageArray;

/**
 * Runs the game with the main method
 * Contains arrays with fields, players and langaugeoutput.
 * Contains raflecup object that contains dies.
 */
public class Game {
    private static int sum;
    private static int currentPlayer = 0;

    private static Field[] fields = new Field[11];

    private static Player[] players = {
            new Player("Player 1"),
            new Player("Player 2")
    };

    private static Cup rafleCup = new Cup();

    public static void main(String[] args) {
        TUI.startGame();

        TUI.language();

        /**
         * Load in field text after language have been choosen
         */
        Field[] fields = {
                new Field("Tower", 250, TUI.languageArray[8]),
                new Field("Crater", -100, TUI.languageArray[9]),
                new Field("Palace gates", 100, TUI.languageArray[10]),
                new Field("Cold Desert", -20, TUI.languageArray[11]),
                new Field("Walled city", 180, TUI.languageArray[12]),
                new Field("Monastery", 0, TUI.languageArray[13]),
                new Field("Black Cave", -70, TUI.languageArray[14]),
                new Field("Huts in the Mountain", 60, TUI.languageArray[15]),
                new Field("The Werewall (Werewolf-Wall)", -80, TUI.languageArray[16]),
                new Field("The Pit", -50, TUI.languageArray[17]),
                new Field("Goldmine", 650, TUI.languageArray[18])
        };

        /** Start Game Loop (Break statement is used to end game */
        while ( 1 == 1 ){

            TUI.printPlayersTurn(currentPlayer);

            sum = rafleCup.getSum();

            TUI.printFaceValue(rafleCup.getFacevalue1(), rafleCup.getFacevalue2());

            /** Move player */
            players[currentPlayer].changePlacement(sum);

            /** Print player placement */
            TUI.printPlayerPlacement(players[currentPlayer].getPlacement());

            /** Print turn effect */
            TUI.printTurnEffect(fields[sum-2].getName(), fields[sum-2].getDescription(), fields[sum-2].getRent());

            /** Sets current playerbalance */
            players[currentPlayer].setPlayerBalance(fields[sum-2].getRent());

            /** Prints current player balance */
            TUI.printPlayerBalance(players[currentPlayer].getPlayerBalance());

            /**
             * If player rolled 10 - player gets extra turn
             */
            if (sum==10){
                System.out.println(TUI.languageArray[7]);
            }
            else {
                if (currentPlayer==0){
                    currentPlayer=1;
                } else {
                    currentPlayer=0;
                }
            }

            /**
             * End game if the current players balance is above 3000
             */
            if (players[currentPlayer].getPlayerBalance() > 3000) {
                //Check account balance
                System.out.println("PLAYER " + (currentPlayer+1) + TUI.languageArray[6]);
                break;
            }
        }
    }
}
