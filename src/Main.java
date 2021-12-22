import utiles.*;

import java.io.File;

import classes.*;	
public class Main {

    static private String arbresURL = "https://data.iledefrance.fr//explore/dataset/les-arbres/download?format=csv&timezone=Europe/Berlin&use_labels_for_header=false";
    public static void main(String[] args) {
        System.out.println("Bienvenue dans la console");

        // Dependencies download
        if(FsHandler.fileExists("assets/arbres.csv")) {
            int choix = Integer.parseInt(IOHandler.lireClavier("le fichier arbres.csv existe déja, pour le mettre à jour, tapez 1, tapez 0 sinon : "));
            if(choix == 1) {
                FsHandler.updateFile(arbresURL, "assets/arbres.csv");
            }            
        } else {
            FsHandler.downloadFile(arbresURL, "assets/arbres.csv");
        }
        
        IOHandler.ecrire(FsHandler.readFile("assets/arbres.csv"));
    }
}


/*
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
*/