import View.Panel;
import View.TUI;
import View.GUI;

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
        GUI.startGame();

        // Initialize form
        Panel panel = new Panel();
        //TUI.language();
        GUI.language(2);

        /**
         * Load in field text after language have been choosen
         */
        Field[] fields = {
                new Field("Tower", 250, GUI.languageArray[8]),
                new Field("Crater", -100, GUI.languageArray[9]),
                new Field("Palace gates", 100, GUI.languageArray[10]),
                new Field("Cold Desert", -20, GUI.languageArray[11]),
                new Field("Walled city", 180, GUI.languageArray[12]),
                new Field("Monastery", 0, GUI.languageArray[13]),
                new Field("Black Cave", -70, GUI.languageArray[14]),
                new Field("Huts in the Mountain", 60, GUI.languageArray[15]),
                new Field("The Werewall (Werewolf-Wall)", -80, GUI.languageArray[16]),
                new Field("The Pit", -50, GUI.languageArray[17]),
                new Field("Goldmine", 650, GUI.languageArray[18])
        };

        /** Start Game Loop (Break statement is used to end game */
        while ( 1 == 1 ){

            GUI.printPlayersTurn(currentPlayer, panel);

            sum = rafleCup.getSum();

            //Print facevalue
            GUI.printFaceValue(rafleCup.getFacevalue1(), rafleCup.getFacevalue2(), panel);
            //TUI.printFaceValue(rafleCup.getFacevalue1(), rafleCup.getFacevalue2());

            /** Move player */
            players[currentPlayer].changePlacement(sum);

            /** Print player placement */
            GUI.printPlayerPlacement(players[currentPlayer].getPlacement(), panel);

            /** Print turn effect */
            GUI.printTurnEffect(fields[sum-2].getName(), fields[sum-2].getDescription(), fields[sum-2].getRent(), panel);

            /** Sets current playerbalance */
            players[currentPlayer].setPlayerBalance(fields[sum-2].getRent(), panel, currentPlayer);

                //Print player balance
                GUI.printPlayerBalance(players[currentPlayer].getPlayerBalance(), panel);
            /** Prints current player balance */
            GUI.printPlayerBalance(players[currentPlayer].getPlayerBalance(), panel);

            /**
             * If player rolled 10 - player gets extra turn
             */
            if (sum==10){
                GUI.printWerewolfTurn(panel, "Because you ran from the Werewolves you gain an extra turn.");
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
                GUI.printWerewolfTurn(panel,"PLAYER " + (currentPlayer+1) +  "HAS WON THE GAME BY EARNING 3000 POINTS");
                break;
            }
        }
    }
}
