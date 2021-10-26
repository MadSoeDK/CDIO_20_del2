package View;

import javax.swing.*;
import java.awt.*;

public class Panel extends JFrame {
    private JLabel locationName;
    private JLabel diceRolls;
    private JPanel GUI_Form;
    private JButton continueButton;
    private JTextArea gameText;

    public Panel(){
        setTitle("Dice Game");
        setContentPane(GUI_Form);
        setSize(400,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        gameText.setBackground(Color.white);
        //gameText.setForeground(Color.black);
        GUI_Form.setBackground(Color.white);
    }

    void setGameText (String text){
        gameText.setText(text);
    }

    void setDiceRollsText (String text){
        diceRolls.setText(text);
    }

    void setLocationNameText (String text){
        locationName.setText(text);
    }

    public static void main(String[] args) {
        Panel gui = new Panel();
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
