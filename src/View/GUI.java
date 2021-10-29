package View;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GUI {

    Scanner input = new Scanner(System.in);

    public static String[] languageArray;

    public static void startGame() {
        System.out.println("Velkommen til spillet.\n Vælg venligst et sprog (Please choose a language).\n" +
                "For at vælge dansk så klik 1 og Enter. To choose english press 2 and Enter.");
    }

    // Tager input til at vælge sprog
    public static void language (int chosenLanguage){
        //int chosenLanguage;

        languageArray = Language.chooseLanguage(chosenLanguage);
    }

    public static void printPlayersTurn(int player, Panel panel) {
        Scanner input = new Scanner(System.in);
        panel.setGameText("Player " + (player+1) + ' ' + languageArray[0]);
        panel.setPlayerTurnText("Player " + (player+1) + "'s Turn");
        awaitButtonPress(panel);
    }

    public static void printFaceValue(int facevalue1, int facevalue2, Panel panel) {
        Scanner input = new Scanner(System.in);
        panel.setDiceRollsText(languageArray[1] + ' ' + facevalue1 + languageArray[2] + ' ' + facevalue2);
        //awaitButtonPress(panel);
    }

    public static void printPlayerPlacement(int placement, Panel panel) {
        Scanner input = new Scanner(System.in);
        panel.setLocationNameText(languageArray[3] + ' ' + placement);
        //awaitButtonPress(panel);
    }
    public static void printTurnEffect(String field, String description, int rent, Panel panel) {
        Scanner input = new Scanner(System.in);
        panel.setGameText(description+"\n"+languageArray[4] + ' ' + rent);
        panel.setLocationNameText((languageArray[3] + ' ' + field));
        awaitButtonPress(panel);
    }
    public static void printPlayerBalance(int balance, Panel panel) {
        System.out.println(languageArray[5] + ' ' + balance);
    }
    public static void printWerewolfTurn(Panel panel, String string){
        panel.setGameText(string);
    }

    static void awaitButtonPress(Panel panel){
        while (panel.buttonPressed()==0)
        {
            System.out.println("");
        }
        panel.resetButton();
    }
}
