public class Field {

    //Initialize variables
    private int number;
    private int rent;
    String name;
    String description;

    //Sets up field name and field rent for each object by using the arrays
    public Field (String[] fieldsname, int[] fieldsrent) {
        for (int i = 0; i > fieldsname.length && i > fieldsrent.length; i++) {
            name = fieldsname[i];
            rent = fieldsrent[i];
        }
    }
}
