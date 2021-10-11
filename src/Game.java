import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        // Create Scanner for player input
        Scanner input = new Scanner(System.in);

        //Instantiate each Field and store in array
        Field[] fields = {
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

        //Instantiate each Player and store in array
        Player[] players = {
                new Player("Player 1"),
                new Player("Player 2")
        };

        // Start Game Loop
        while (1==1){
            System.out.println("Player 1 Starts, Press Enter");



            // End Game
            break;
        }
    }
}
