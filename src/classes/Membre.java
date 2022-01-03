package classes;
import java.sql.Timestamp;  

import java.util.Vector;

public class Membre extends Personne {
    Membre(String nom, String prenom, String adresse, String telephone, String email) {
        super(nom, prenom, adresse, telephone, email);
    }

    private int nombreDeVotes = 5;
    private int montant_cotisé = 0;

    public int get_montant_cotisé(){
        return montant_cotisé;
    }
    public void set_montant_cotisé(int montant){
        this.montant_cotisé = montant;
    }


    void programmerUneVisite(String libellefrancais, String genre, String espece, String stadedeveloppement, Vector<Arbre> arbresProposés) {
        for(Arbre arbre : arbresProposés) {
            if(arbre.get_libellefrancais().equals(libellefrancais) && arbre.get_genre().equals(genre) && arbre.get_espece().equals(espece) && arbre.get_stadedeveloppement().equals(stadedeveloppement)) {
                if(arbre.get_visite_programmée() == false) {
                    arbre.set_visite_programmée(true);
                }
                else {
                    System.out.println("Oops une visite est déjà programmée pour cet arbre");
                }
            }
        }
    }

    void voterSurUnArbre(Vector<Arbre> tousArbres, Vector<Arbre> arbresVotés, String libellefrancais){
        if(this.nombreDeVotes <= 0) {
            System.out.println("Vous avez déjà voté sur 5 arbres");
        }
        else {
            this.nombreDeVotes--;
            for(Arbre arbre : tousArbres) {
                if(arbre.get_libellefrancais().equals(libellefrancais)) {
                    arbresVotés.add(arbre);
                }
            }
        }
    }

    void effectuerUnCompteRendu(String libellefrancais, String genre, String espece, String stadedeveloppement, Vector<Arbre> arbresProposés) {
        for(Arbre arbre : arbresProposés) {
            if(arbre.get_libellefrancais().equals(libellefrancais) && arbre.get_genre().equals(genre) && arbre.get_espece().equals(espece) && arbre.get_stadedeveloppement().equals(stadedeveloppement)) {
                if(arbre.get_visite_programmée() == true ) {
                    arbre.set_visite_programmée(false);
                    arbre.set_derniereVisite(new Timestamp(System.currentTimeMillis()));
                }
                else {
                    System.out.println("Oops cet arbre n'a pas été réservé pour une visite");
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("member handler is being executed");
        while(true){}
    }
}
