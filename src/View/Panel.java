package View;

import javax.swing.*;

public class Panel extends JFrame {
    private JLabel locationName;
    private JLabel locationDesc;
    private JLabel diceRolls;
    private JPanel GUI_Form;
    private JButton continueButton;
    private JLabel gameText;

    public Panel(){
        setTitle("Dice Game");
        setContentPane(GUI_Form);
        setSize(400,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    void setGameText (String text){
        gameText.setText(text);
    }

    public static void main(String[] args) {
        Panel gui = new Panel();
    }
}
