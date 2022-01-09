package classes;
import java.util.Vector;
import utiles.IOHandler;
import utiles.*;

/**
    President classe fille de la classe Personne
 */
public class President extends Personne {

    public President(String nom, String prenom, String adresse, String telephone, String email) {
        super(nom, prenom, adresse, telephone, email);
    }

/**
  * Cette méthode ajoute un donateur à une liste de donateurs.
  * L'utilisateur indique la nature (personne morale/physique) du donateur et son nom, puis il est ajouté à une liste des donateurs. 
  * @param nature  la nature du donateur, de type String.
  * @param nom  le nom du donateur, de type String.
  * @param donateurs  le vector qui contient la liste des donateurs.
  */

    public void ajouterUnDonateur(String nature, String nom, Vector<Donateur> donateurs) {
        Donateur donateur = new Donateur(nature, nom);
        donateurs.add(donateur);
    }
/**
  * Cette méthode ajoute un membre à une liste de membres.
  * L'utilisateur indique les coordonées du nouveau membre
  * @param nom  le nom du membre, de type String.
  * @param prenom  le prenom du membre, de type String.
  * @param adresse  l'adresse du membre, de type String.
* @param telephone  le numéro de téléphone du membre, de type String.
  * @param membres  le vector qui contient la liste des membres.
  * @param email  l'email du membre, de type String.
  */

    public void ajouterUnMembre(String nom, String prenom, String adresse, String telephone, String email, Vector<Membre> membres) {
        Membre membre = new Membre(nom, prenom, adresse, telephone, email);
        membres.add(membre);
    }

/**
  * Cette méthode radie un membre d'une liste de membres.
  * L'utilisateur indique le nom et le prénom, puis il est radié d'une liste des membres. 
  * @param nom  le nom du membre, de type String.
  * @param prenom  le prenom du membre, de type String.
  * @param membres  le vector qui contient la liste des membres.
*/

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
/**
  * Cette méthode supprime un donateur d'une liste de donateurs.
  * L'utilisateur indique le nom et la nature du donateur, puis il est supprimé d'une liste des donateurs. 
  * @param nature  la nature du donateur, de type String.
  * @param nom  le nom du donateur, de type String.
  * @param donateurs  le vector qui contient la liste des donateurs.
*/

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
/**
  * Cette méthode ajoute une nouvelle facture. 
  * @param association  l'association, de type association.
*/
    public void nouvelleFacture(Association association){
        double montant = Double.parseDouble(IOHandler.lireClavier("Entrez le montant de la facture"));
        association.setFactures(association.getFactures() + montant);
    }
}
