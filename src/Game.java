public class Game {
    public static void main(String[] args) {

        //Instantiate each Field object and store in array
        Field[] fields = {
                new Field("Tower", 250),
                new Field("Crater", -100),
                new Field("Palace gates", 100),
                new Field("Cold Desert", -20),
                new Field("Walled city", 180),
                new Field("Monastery", 0),
                new Field("Black cave", -70),
                new Field("Huts in the mountain", 60),
                new Field("The Werewall (werewolf-wall)", -80),
                new Field("The pit", -50),
                new Field("Goldmine", 650),
        };
    }
}
