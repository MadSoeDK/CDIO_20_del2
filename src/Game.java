import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        // Set Variables
        int sum = 0;
        int currentPlayer = 0;

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

        // Instatiate Cup
        Cup rafleCup = new Cup();

        // Start Game Loop
        while (1==1){
            System.out.println("Player " + (currentPlayer+1) + " Starts, Press Enter");
            String enter = input.nextLine(); // Press enter to continue

            // Get Player Balance
            // Roll
                sum=rafleCup.getSum();

            // Get Sum
                System.out.println("You rolled: " + rafleCup.getFacevalue1());
                System.out.println("And then: " + rafleCup.getFacevalue2());
                enter = input.nextLine(); // Press enter to continue

            // Move Player
                players[currentPlayer].changePlacement(sum);
                System.out.println("Your placement is: " + players[currentPlayer].getPlacement());
                enter = input.nextLine(); // Press enter to continue

            // Complete Field Effect
                System.out.println("You have arrived at: " + fields[sum].getName());
                System.out.println(fields[sum].getDescription());

            // Next turn
                if (currentPlayer==0){
                    currentPlayer=1;
                }
                else
                {
                    currentPlayer=0;
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
