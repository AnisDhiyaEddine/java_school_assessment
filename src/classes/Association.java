package classes;

public class Association {
    private President president;
    private Membre[] membres;
    private Arbre[] arbres;
    private double comptes;


    void genererUnRapport(){}
    void recevoirUnCompteRendu(){}
    void payerLesFactures(){}
    void demanderDesDons(){}
    void receverDesCotisations(){}
    void mettreÀjourLesArbres(){
        // TODO - pour gérer les mises à jour des fichier de données
    }
    void proposerDesVisites(){}
    void proposerUneListedesArbres(){}
    void authentifierUnMembre(){
        // TODO renvoie les informations du membre
    }
    void supprimmerUnMembre(){}
    void payerLesMembres(){}



    public static void main(String[] args) {
        System.out.println("association handler is being executed");
        while(true){}
    }
}
