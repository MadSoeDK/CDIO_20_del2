public class Player {

    private int placement;
    private final String name;
    Account account;

    //Sets up a Player with name, account and starting position
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
}
