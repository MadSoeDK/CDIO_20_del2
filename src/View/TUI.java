package View;
import java.util.Scanner;

public class TUI {
    Scanner input = new Scanner(System.in);

    public static void startGame() {
        System.out.println("Velkommen til spillet.\n Vælg venligst et sprog (Please choose a language).\n" +
                "For at vælge dansk så klik 1 og Enter. To choose english press 2 and Enter.");
    }

    public static void printPlayersTurn(int player) {
        Scanner input = new Scanner(System.in);
        System.out.println("Player " + (player+1) + " Starts, Press Enter");
        input.nextLine();
    }

    public static void printFaceValue(int facevalue1, int facevalue2) {
        Scanner input = new Scanner(System.in);
        System.out.println("You rolled: " + facevalue1 + " and " + facevalue2);
        input.nextLine();
    }

    public static void printPlayerPlacement(int placement) {
        Scanner input = new Scanner(System.in);
        System.out.println("Your placement is: " + placement);
        input.nextLine();
    }
    public static void printTurnEffect(String field, String description, int rent) {
        System.out.println("Your placement is: " + field);
        System.out.println(description);
        System.out.println("You Balance is changed by: "+ rent);
    }
}
