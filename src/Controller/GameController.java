package Controller;

import Model.Cup;
import Model.Field;
import Model.Player;

public class GameController {

    private static Cup raffleCup;

    //Instantiate each Model Field and store in array
    private static Field[] field = {
            new Field("Tower", 250),
            new Field("Crater", -100),
            new Field("Palace gates", 100),
            new Field("Cold Desert", -20),
            new Field("Walled city", 180),
            new Field("Monastery", 0),
            new Field("Black cave", -70),
            new Field("Huts in the mountain", 60),
            new Field("The Werewall (werewolf-wall)", -80),
            new Field("The pit", -50),
            new Field("Goldmine", 650),
    };

    //Model player array with up to 4 players
    private static Player[] player = new Player[4];

    // Create a single Player (Player object)
    public static void createPlayer(String name, int index) {
        if (index < player.length) {
            do {
                player[index] = new Player(name);
                index++;
            } while ( false );
        }
    }

    //Get players array
    public static Player[] getPlayers() {
        return player;
    }

    //Get a single player from array index
    public static Player getPlayer(int index) {
        return player[index];
    }

    //Create a die pair
    public static void createDice() {
        raffleCup = new Cup();
    }
    public static Cup getCup() {
        return raffleCup;
    }

    //Roll cup return sum facevalues
    public static int roll() {
        return raffleCup.getSum();
    }

    //Sets player at Field index
    public static void move (Player player, int rollSum) {
        player.setPlacement(rollSum - 2);
    }

    public static Field getField (int index) {
        return field[index];
    }

    //Loop through Players and check if their score is higher than 3000. Return array of winners
    public static Player[] isWinner(Player[] player) {
        Player[] winners = new Player[4];

        for (int i = 0; i < player.length; i++) {
            if (player[i] != null) {
                if (player[i].hasWon()) {
                    winners[i] = player[i];
                }
            }
        }
        return winners;
    }
}
