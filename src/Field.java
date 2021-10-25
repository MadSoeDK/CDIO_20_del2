public class Field {

    //Initialize variables
    //private int number;
    private int rent;
    private String name;
    private String description;

    //Sets up field name and field rent for each object by using the arrays
    public Field (String fieldname, int fieldrent, String fieldDescription) {
        name = fieldname;
        rent = fieldrent;
        description = fieldDescription;
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
