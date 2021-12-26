package classes;

import java.util.Vector;

import utiles.FsHandler;

public class Association {
    private President president;
    private Membre[] membres;
    private Vector<Arbre> arbres = new Vector<Arbre>();
    private double comptes;


    void genererUnRapport(){}
    void recevoirUnCompteRendu(){}
    void payerLesFactures(){}
    void demanderDesDons(){}
    void receverDesCotisations(){}
    static void mettreÀjourLesArbres(){
        // TODO - pour gérer les mises à jour des fichier de données
    }
    void proposerDesVisites(){}
    void proposerUneListedesArbres(){}
    void authentifierUnMembre(){
        // TODO renvoie les informations du membre
    }
    void supprimmerUnMembre(){}
    void payerLesMembres(){}


    public void remplirLesArbres(){
        String liste = FsHandler.readFile("assets/arbres.csv");
        String[] arbresLignes = liste.split("\n");
        Arbre arbre;
        try {
            for (int i = 1; i < arbresLignes.length; i++) {
            String[] arbresColonnes = arbresLignes[i].split(";");
            arbre = new Arbre(Integer.parseInt(arbresColonnes[0]), arbresColonnes[3],arbresColonnes[6],arbresColonnes[8],arbresColonnes[9],arbresColonnes[10],arbresColonnes[15]);
            if(arbre != null) this.arbres.add(arbre);
         }
        } catch (Exception e) {
            System.out.println("Erreur lors de la création des arbres");
        }
    }	


    public static void main(String[] args) {
        System.out.println("association handler is being executed");
        while(true){}
    }
}
