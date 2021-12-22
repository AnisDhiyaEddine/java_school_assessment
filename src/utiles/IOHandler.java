package utiles;
import java.io.*; 


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

    static public void ecrire(String message) {
        System.out.println(message);
    }
}
