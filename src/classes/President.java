package classes;
import java.util.Vector;
import utiles.IOHandler;
import utiles.*;

public class President extends Personne {
    // Une première version des attributs de la classe President
    public President(String nom, String prenom, String adresse, String telephone, String email) {
        super(nom, prenom, adresse, telephone, email);
    }

    public void ajouterUnDonateur(String nature, String nom, Vector<Donateur> donateurs) {
        Donateur donateur = new Donateur(nature, nom);
        donateurs.add(donateur);
    }

    public void ajouterUnMembre(String nom, String prenom, String adresse, String telephone, String email, Vector<Membre> membres) {
        Membre membre = new Membre(nom, prenom, adresse, telephone, email);
        membres.add(membre);
    }

    public void radierUnMembre(String nom, String prenom, Vector<Membre> membres){
        for(Membre m : membres){
            if(m.getNom().equals(nom) && m.getPrenom().equals(prenom) && (m.getCotisation().size() == 0)){
                membres.remove(m);
                System.out.println("Le membre a été viré avec succès.");
                return;
            }
        }
        System.out.println("Le membre n'a pas été trouvé ou a déja cotisé.");
    }

    public void supprimerUnDonateur(String nature, String nom, Vector<Donateur> donateurs){
        for(Donateur p : donateurs){
            if(p.getNom().equals(nom) && p.getNature().equals(nature)){
                donateurs.remove(p);
                System.out.println("Le donateur a été supprimer avec succès.");
                return;
            }
        }
        System.out.println("Le donateur n'a pas été trouvé.");
    }

    public void nouvelleFacture(Association association){
        double montant = Double.parseDouble(IOHandler.lireClavier("Entrez le montant de la facture"));
        association.setFactures(association.getFactures() + montant);
    }
}
