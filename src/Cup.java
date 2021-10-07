public class Cup {

    // Initialize Variables
    private final int QUANTITY=2;
    private int sum;
    private int pair;
    // What did the die show
    private int facevalue1;
    private int facevalue2;

    Die Die1;
    Die Die2;

    // Create Die Objects
    public Cup() {
        Die1 = new Die();
        Die2 = new Die();
    }

    public int getSum() {
        facevalue1 = Die1.getFacevalue();
        facevalue2 = Die2.getFacevalue();
        sum = facevalue1+facevalue2;
        //System.out.println("Their sum is: "+sum);
        return sum;
    }
    public int getFacevalue1() {
        return facevalue1;
    }
    public int getFacevalue2() {
        return facevalue2;
    }

    public int getPair() {
        if (facevalue1==facevalue2)
        {
            pair=1;
        }
        else
        {
            pair=0;
        }
        return pair;
    }
}