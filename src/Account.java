import static java.lang.Math.abs;

public class Account {

    private int balance;

    //Sets the player balance when a player is added
    public Account () {
        balance = 1000;
    }

    /**
     * Changes the balance. The balance can't be negative, and is then set to 0.
     * @param amount Positive or negative integer
     */
    public void setBalance(int amount) {
        if(amount < 0 && amount > balance) {
            balance = 0;
        } else {
            balance = balance + amount;
        }
    }

    public int getBalance() {
        return balance;
    }
}
