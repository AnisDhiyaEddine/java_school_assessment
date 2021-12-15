package utiles;
import java.io.*; 

/*
    This class is used to handle the input and output of the program.
    We will use it to read the input from the user and write the output to the user.

TO DO:
    - Add a method to read the input from the user. (lireClavier)

*/




public class IOHandler {
    static public String lireClavier(String message) {
        try {
            System.out.print(message);
            BufferedReader clavier =
            new BufferedReader(new InputStreamReader(System.in));
            return clavier.readLine();
        } catch (Exception e) {
            return "erreur dans fonction lireClavier";
        }
    }
}
