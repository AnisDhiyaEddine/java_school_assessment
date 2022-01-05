package classes;
import java.sql.Timestamp;  
import utiles.IOHandler;
import java.util.Vector;

public class Membre extends Personne {
    public Membre(String nom, String prenom, String adresse, String telephone, String email) {
        super(nom, prenom, adresse, telephone, email);
    }

    private int nombreDeVotes = 5;
    private Vector<Double> cotisations = new Vector<Double>();

    public Vector<Double> getCotisation() {
        return cotisations;
    }

    public void setCotisation(Vector<Double> cotisation) {
        this.cotisations = cotisation;
    }

    public void programmerUneVisite(String libellefrancais, String genre, String espece, String stadedeveloppement, Vector<Arbre> arbresProposés) {
        for(Arbre arbre : arbresProposés) {
            if(arbre.get_libellefrancais().equals(libellefrancais) && arbre.get_genre().equals(genre) && arbre.get_espece().equals(espece) && arbre.get_stadedeveloppement().equals(stadedeveloppement)) {
                if(arbre.get_visite_programmée() == false) {
                    arbre.set_visite_programmée(true);
                    System.out.println("La visite a bien été programmée");
                    System.out.println(arbre.toString());
                } 
                else {
                    System.out.println("Oops une visite est déjà programmée pour cet arbre");
                }
            }
        }
    }

    public void voterSurUnArbre(Vector<Arbre> tousArbres, Vector<Arbre> arbresVotés, String libellefrancais){
        if(this.nombreDeVotes <= 0) {
            System.out.println("Vous avez déjà voté sur 5 arbres");
        }
        else {
            this.nombreDeVotes--;
            for(Arbre arbre : tousArbres) {
                if(arbre.get_libellefrancais().equals(libellefrancais)) {
                    arbresVotés.add(arbre);
                    arbre.set_nombreDeVotes(arbre.get_nombreDeVotes() + 1);
                }
            }
        }
    }

    public void effectuerUnCompteRendu(String libellefrancais, String genre, String espece, String stadedeveloppement, Vector<Arbre> arbresProposés, Association association) {
        for(Arbre arbre : arbresProposés) {
            if(arbre.get_libellefrancais().equals(libellefrancais) && arbre.get_genre().equals(genre) && arbre.get_espece().equals(espece) && arbre.get_stadedeveloppement().equals(stadedeveloppement)) {
                if(arbre.get_visite_programmée() == true && association.getComptes() > association.get_montantVisite() ) {
                    arbre.set_visite_programmée(false);
                    arbre.set_derniereVisite(new Timestamp(System.currentTimeMillis()));
                    association.setComptes(association.getComptes() - association.get_montantVisite());
                    String compteRendu = IOHandler.lireClavier("Veuillez entrer votre compte rendu");
                    compteRendu = compteRendu + "\nDate: " + new Timestamp(System.currentTimeMillis());
                    association.getCompteRendus().add(compteRendu);
                    association.setNombreVisites(association.getNombreVisites() + 1);
                }
                else {
                    System.out.println("Oops vous ne pouvez pas effectuer de compte rendu");
                }
            }
        }
    }

    public void cotiser(Association association) {
       double montant = Double.parseDouble(IOHandler.lireClavier("Veuillez entrer le montant de votre cotisation"));
         if(montant > 0) {
                association.setComptes(association.getComptes() + montant);
                this.cotisations.add(montant);
                association.set_recettes(association.get_recettes() + montant);
         }
         else {
              System.out.println("Montant invalide");
         }
    }

    public void authentification(){
      System.out.println(toString());
    }

    @Override
    public String toString() {
        return " Membre{" +
                "nom=" + this.getNom() +
                ", prenom=" + this.getPrenom() +
                ", adresse=" + this.getAdresse() +
                ", telephone=" + this.getTelephone() +
                ", email=" + this.getEmail() +
                ", nombreDeVotes=" + nombreDeVotes +
                ", cotisations=" + cotisations.toString() +
                '}';
    }
}
