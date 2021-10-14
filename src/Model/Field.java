package Model;

public class Field {

    //Initialize variables
    //private int number;
    private int rent;
    private String name;
    private String description;

    //Sets up field name and field rent for each object by using the arrays
    public Field (String fieldName, int fieldRent) {
        fieldName = name;
        fieldRent = rent;
    }
    public int getRent() {
        return rent;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
}
