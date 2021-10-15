package View;
import java.util.Scanner;

public class TUI {

    public static void startGame() {
        System.out.println("Velkommen til spillet.\n Vælg venligst et sprog (Please choose a language).\n" +
                "For at vælge dansk så klik 1 og Enter. To choose english press 2 and Enter.");
    }

    public static void printPlayersTurn(int player){
        System.out.println("Player " + (player+1) + " Starts, Press Enter");
        Scanner input = new Scanner(System.in);
        input.nextLine();
    }

}
