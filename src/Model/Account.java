package Model;

public class Account {

    private int balance;

    //Sets the player balance when a player is added
    public Account () {
        balance = 1000;
    }

    public void changeBalance(int amount) {
        balance = balance + amount;
    }
    public int getBalance() {
        return balance;
    }
    public int setBalance(int amount) {
        return balance = balance + amount;
    }
}
