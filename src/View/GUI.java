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
    public static void language (){
        int chosenLanguage;

        do {
            try {
                Scanner input1 = new Scanner(System.in);
                chosenLanguage = input1.nextInt();
            }
            catch (InputMismatchException e){
                chosenLanguage = 0;
            }
        } while ((chosenLanguage != 1) && (chosenLanguage != 2));

        languageArray = Language.chooseLanguage(chosenLanguage);
    }

    public static void printPlayersTurn(int player, Panel panel) {
        Scanner input = new Scanner(System.in);
        panel.setGameText("Player " + (player+1) + ' ' + languageArray[0]);
        input.nextLine();
    }

    public static void printFaceValue(int facevalue1, int facevalue2) {
        Scanner input = new Scanner(System.in);
        System.out.println(languageArray[1] + ' ' + facevalue1 + languageArray[2] + ' ' + facevalue2);
        input.nextLine();
    }

    public static void printPlayerPlacement(int placement) {
        Scanner input = new Scanner(System.in);
        System.out.println(languageArray[3] + ' ' + placement);
        input.nextLine();
    }
    public static void printTurnEffect(String field, String description, int rent) {
        System.out.println(languageArray[3] + ' ' + field);
        System.out.println(description);
        System.out.println(languageArray[4] + ' ' + rent);
    }
    public static void printPlayerBalance(int balance) {
        System.out.println(languageArray[5] + ' ' + balance);
        System.out.println("...");
    }
}
