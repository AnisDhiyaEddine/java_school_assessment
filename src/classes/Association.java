package classes;

import java.util.Vector;
import utiles.*;

public class Association {
    private String nom;
    private President president;
    private Vector<Membre> membres = new Vector<Membre>();
    private Vector<Personne> donateurs = new Vector<Personne>();
    private Vector<Arbre> arbres = new Vector<Arbre>();
    private double comptes;


    public Association(String nom){
        this.nom = nom;
    }

    public President getPresident(){
        return president;
    }

    public void setPresident(President president){
        this.president = president;
    }

    public Vector<Membre> getMembres(){
        return membres;
    }

    public void setMembres(Vector<Membre> membres){
        this.membres = membres;
    }

    public Vector<Personne> getDonateurs(){
        return donateurs;
    }

    public void setDonateurs(Vector<Personne> donateurs){
        this.donateurs = donateurs;
    }

    public Vector<Arbre> getArbres(){
        return arbres;
    }

    public void setArbres(Vector<Arbre> arbres){
        this.arbres = arbres;
    }

    public double getComptes(){
        return comptes;
    }

    public void setComptes(double comptes){
        this.comptes = comptes;
    }


    public void genererUnRapport(){}
    public void recevoirUnCompteRendu(){}
    public void payerLesFactures(){}
    public void demanderDesDons(){}
    public void receverDesCotisations(){}
    public void proposerDesVisites(){}
    public void proposerUneListedesArbres(){}
    public void authentifierUnMembre(){}
    public void payerLesMembres(){}

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

    @Override
    public String toString() {
        return "nom association: " + this.nom + " President " + this.getPresident() + " nombre des membres " + this.getMembres().size() +  " -- testing purposes";
    }
}
