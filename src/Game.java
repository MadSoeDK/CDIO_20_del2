public class Game {
    public static void main(String[] args) {

        //Field name array
        String[] fieldsname = { "Tower", "Crater", "Palace gates", "Cold Desert", "Walled city", "Monastery ", "Black cave", "Huts in the mountain", "The Werewall (werewolf-wall)", "The pit", "Goldmine" };

        //Field rent array
        int[] fieldsrent = { 250, -100, 100, -20, 180, 0, -70, 60, -80, -50, 650 };

        //Initilize all the fields with the arrays
        Field Fields = new Field(fieldsname, fieldsrent);

    }
}
