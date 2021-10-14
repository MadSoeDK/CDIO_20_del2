package Controller;

import Model.Player;
import View.*;

public class Game {
    public static void main(String[] args) {

        TUI.startGame();

        //Choose language
        TUI.language();

        //Choose player names -> Create players
        TUI.chooseNames();

        //Future option for user created dice?
        GameController.createDice();

        int playerTurn;

        //No winners? Play Game!
        while (GameController.getPlayer(0).getPlayerBalance() <= 3000 || GameController.getPlayer(1).getPlayerBalance() <= 3000) {
            //Do one round
            for (playerTurn = 0; playerTurn < GameController.getPlayers().length; playerTurn++) {
                do {
                    //Get the current Player
                    Player currentPlayer = GameController.getPlayer(playerTurn);
                    TUI.printPlayersTurn(currentPlayer);

                    //Get the sum of the dies
                    int rollSum = GameController.roll();
                    TUI.printFaceValue(rollSum);

                    //Set the placement of the player depending on the roll sum
                    GameController.move(currentPlayer, rollSum);
                    TUI.printCurrentField(currentPlayer);

                    //Gets the Field rent by the placement of the player
                    int rent = GameController.getField(currentPlayer.getPlacement()).getRent();

                    //Calculate current players balance
                    currentPlayer.setPlayerBalance(rent);
                    TUI.printPlayerScore(currentPlayer);

                    //Next player turn. Option for checking rolling pair
                } while( false );
                System.out.println(playerTurn);
            }
        }

        /*do {
            //Do a round for each player
            for (playerTurn = 0; playerTurn < GameController.getPlayers().length; playerTurn++) {

                //Get the current Player
                Player currentPlayer = GameController.getPlayer(playerTurn);
                TUI.printPlayersTurn(currentPlayer);

                //Get the sum of the dies
                int rollSum = GameController.roll();
                TUI.printFaceValue(rollSum);

                //Set the placement of the player depending on the roll sum
                GameController.move(currentPlayer, rollSum);
                TUI.printCurrentField(currentPlayer);

                //Gets the Field rent by the placement of the player
                int rent = GameController.getField(currentPlayer.getPlacement()).getRent();

                //Calculate current players balance
                currentPlayer.setPlayerBalance(rent);
                TUI.printPlayerScore(currentPlayer);

                //Next player turn
            }
            // If there is a winner, break the game loop
        } while (!GameController.getPlayer(playerTurn).hasWon());*/

        // Determine who is the winner
        GameController.isWinner(GameController.getPlayers());
    }
}