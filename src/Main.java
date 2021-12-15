import utiles.*;
import classes.*;	
public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenue dans la console");
        System.out.println("-> Si vous Etes un membre tapez 1 \n-> Si vous etes le president tapez 2 \n-> Pour quitter tapez 0");	
        int role =  Integer.parseInt(IOHandler.lireClavier("Tapez un chiffre ") ); 
        
        switch (role) {
            case 1:
                Membre.main(args);
                break;
            case 2:
                President.main(args);
                break;
            default:
                break;
        }
        int i = 0;
        while(true){}
    }
}
