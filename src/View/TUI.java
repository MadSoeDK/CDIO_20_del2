package View;
import Controller.Game;
import Controller.GameController;
import Model.Player;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TUI {

    private static String[] languageArray;
    //private static String[] nameArray = new String[4];
    //private static int[] dieArray;

    public static void startGame() {
        System.out.println("Velkommen til spillet Goldmine (Welcome to the game Goldmine).\n Vælg venligst et sprog (Please choose a language).\n" +
                "For at vælge dansk så klik 1 og Enter. To choose english press 2 and Enter.");
    }

    // User language selection
    public static int language(){
        int chosenLanguage;

        do {
            try {
                Scanner input = new Scanner(System.in);
                chosenLanguage = input.nextInt();
            }
            catch (InputMismatchException e){
                chosenLanguage = 0;
            }
        } while ((chosenLanguage != 1) && (chosenLanguage != 2));

        languageArray = Language.chooseLanguage(chosenLanguage);
        return (chosenLanguage);
    }

    // User selects playername and Player objects is created
    public static void chooseNames() {
        System.out.println("How many do you want to play? You can play up to 4.");
        Scanner input = new Scanner(System.in);
        int totalPlayers = input.nextInt();
        final int MAXPLAYERS = 4;

        // Put player names in array one at a time
        for (int i = 0; i < MAXPLAYERS && i < totalPlayers; i++) {
            System.out.println("Player: " + (i + 1) + ". Select your name:");
            Scanner name = new Scanner(System.in);
            String playerName = name.nextLine();
            GameController.createPlayer(playerName, i);
            System.out.println("Your player name is: " + playerName);
        }
    }

    public static void printPlayersTurn(Player player){
        Scanner input = new Scanner(System.in);
        System.out.println(player.getName() + "'s" + languageArray[5]);
        input.nextLine();
    }

    public static void printFaceValue(int rollSum){
        System.out.println(languageArray[6] + " " + rollSum);
    }

    // Print player balance
    public static void printPlayerBalance(Player player){
        System.out.println(languageArray[7] + " " + player.getPlayerBalance());
    }

    //Print current
    public static void printCurrentField(Player player){
        System.out.println("Current Field is" + " " + GameController.getField(player.getPlacement()).getName());
    }

    //Print winner
    public static void printWinners(Player[] winners) {
        for (int i = 0; i < winners.length; i++) {
            System.out.println(" " + winners);
        }
    }

    /* Unused stuff...
    // Fortæller spiller hvilket sprog de har valgt
    public static void printLanguage(){
        System.out.println(languageArray[0]);
    }

    // Fortæller hvad spiller slog
    public static void printFaceValue(){
        System.out.println(languageArray[6] + " " + Game.getDieFaceValue(0) + " + " + Game.getDieFaceValue(1) + " = " + Game.getRollSum());
    }

    // Fortæller spillerens nye score
    public static void printPlayerScore(int player){
        System.out.println(languageArray[7] + " " + Game.getPlayerScore(player));
    }*/
}