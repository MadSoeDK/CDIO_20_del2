import javax.swing.*;

public class Interface extends JFrame {
    private JLabel locationName;
    private JLabel locationDesc;
    private JLabel diceRolls;
    private JPanel GUI_Form;

    Interface (){
        setTitle("Dice Game");
        setContentPane(GUI_Form);
        setSize(400,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        Interface gui = new Interface();
    }
}
