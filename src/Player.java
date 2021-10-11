public class Player {

    private int placement;
    private String name;
    Account account;

    //Sets up a Player with name, account and starting position
    public Player(String name) {
        this.name = name;
        account = new Account();
        placement = 0;
    }

    public void changePlacement(int amount) {
        placement = amount;
    }
    public void setPlacement(int position) {
        placement = position;
    }
    public int getPlacement() {
        return placement;
    }
    public String getName(){ return name;}
    public int getPlayerBalance(){return account.getBalance();}
    public void setPlayerBalance(int amount) {account.setBalance(amount);}
}
