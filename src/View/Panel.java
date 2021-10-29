package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel extends JFrame {
    private JLabel locationName;
    private JLabel diceRolls;
    private JPanel GUI_Form;
    private JButton continueButton;
    private JTextArea gameText;
    private JLabel player1Score;
    private JLabel player2Score;
    private JLabel playerTurn;
    private JButton danishButton;
    private JButton englishButton;
    int button=0;

    public Panel(){
        setTitle("Dice Game");
        setContentPane(GUI_Form);
        setSize(400,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        gameText.setBackground(Color.white);
        gameText.setForeground(Color.black);
        GUI_Form.setBackground(Color.white);
        continueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pressButton();
            }
        });
        danishButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent dan) {
                setLanguage(1);
            }
        });
        englishButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent eng) {
                setLanguage(2);
            }
        });
    }

    public void pressButton(){
        button=1;
    }
    public void setLanguage(int a){
        GUI.language(a);
    }
    public int buttonPressed(){
        return button;
    }
    public void resetButton(){
        button=0;
    }

    void setGameText (String text){
        gameText.setText(text);
    }

    void setPlayerTurnText (String text){
        playerTurn.setText(text);
    }

    void setDiceRollsText (String text){
        diceRolls.setText(text);
    }

    void setLocationNameText (String text){
        locationName.setText(text);
    }

    public void setPlayer1ScoreText (String text){
        player1Score.setText(text);
    }
    public void setPlayer2ScoreText (String text){ player2Score.setText(text);
    }

    public static void main(String[] args) {
        Panel gui = new Panel();
    }

}
