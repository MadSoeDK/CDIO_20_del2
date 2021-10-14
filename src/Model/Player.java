package Model;

import Model.Account;

public class Player {

    private boolean winner;
    private int placement;
    private String name;
    Account account;

    //Sets up a Model.Player with name, account and starting position
    public Player(String name) {
        this.name = name;
        account = new Account();
        placement = 0;
    }

    public void changePlacement(int amount) {
        placement = placement + amount;
    }
    public void setPlacement(int position) {
        placement = position;
    }
    public int getPlacement() {
        return placement;
    }
    public String getName(){ return name; }
    public int getPlayerBalance(){return account.getBalance();}
    public void setPlayerBalance(int amount) {account.setBalance(amount);}
    public boolean hasWon() {
        if (account.getBalance() >= 3000) {
            winner = true;
            return true;
        }
        return false;
    }
}
