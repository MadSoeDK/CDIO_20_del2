public class Account {

    private int balance;

    //Sets the player balance when a player is added
    public Account () {
        balance = 1000;
    }

    public void changeBalance(int amount) {
        balance = balance + amount;
    }
}
