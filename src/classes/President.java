package classes;
import java.util.Vector;

import utiles.*;

public class President extends Personne {
    // Une première version des attributs de la classe President
    public President(String nom, String prenom, String adresse, String telephone, String email) {
        super(nom, prenom, adresse, telephone, email);
    }

    public void ajouterUnDonnateur(String nom, String prenom, String adresse, String telephone, String email, Vector<Personne> donateurs) {
        Personne donateur = new Personne(nom, prenom, adresse, telephone, email);
        donateurs.add(donateur);
    }

    public void ajouterUnMembre(String nom, String prenom, String adresse, String telephone, String email, Vector<Membre> membres) {
        Membre membre = new Membre(nom, prenom, adresse, telephone, email);
        membres.add(membre);
    }

    public void virerUnMembre(String nom, String prenom, Vector<Membre> membres){
        for(Membre m : membres){
            if(m.getNom().equals(nom) && m.getPrenom().equals(prenom)){
                membres.remove(m);
                System.out.println("Le membre a été virer avec succès.");
                return;
            }
        }
        System.out.println("Le membre n'a pas été trouvé.");
    }

    public void supprimerUnDonnateur(String nom, String prenom, Vector<Personne> donateurs){
        for(Personne p : donateurs){
            if(p.getNom().equals(nom) && p.getPrenom().equals(prenom)){
                donateurs.remove(p);
                System.out.println("Le donnateur a été supprimer avec succès.");
                return;
            }
        }
        System.out.println("Le donnateur n'a pas été trouvé.");
    }
}
