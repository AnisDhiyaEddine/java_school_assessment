package classes;
import java.sql.Timestamp;  
import utiles.IOHandler;
import java.util.Vector;

/**
    Membre classe fille de la classe Personne
    @see Personne
    Cette classe est aussi caractérisée par les attributs suivants : 
    nombreDeVotes
    cotisations
 */
public class Membre extends Personne {
    public Membre(String nom, String prenom, String adresse, String telephone, String email) {
        super(nom, prenom, adresse, telephone, email);
    }
/**
    Entier qui représente le nombre de votes d'un membre 
    La valeur par défaut est 5; celle-ci est fixée
 */
    private int nombreDeVotes = 5;

/**
    Tableau de double qui représente l'historique de toutes les cotisations des membres
 */
    private Vector<Double> cotisations = new Vector<Double>();

/**
    Méthode getCotisation qui permet de récupérer le tableau des cotisations du membre
    @return cotisation
 */
    public Vector<Double> getCotisation() {
        return cotisations;
    }
/**
    Méthode setCotisation qui permet de modifier le tableau des cotisations alors qu'il est en private
    @param cotisation
 */
    public void setCotisation(Vector<Double> cotisation) {
        this.cotisations = cotisation;
    }
/**
    Méthode qui permet au membre de programmer une visite 
    @param libellefrancais
    @param geo_point_2d
    @param arbresRemarquables
    @see association#arbresRemarquables
    @see arbre#get_libellefrancais()
    @see arbre#get_geo_point_2d()
    @see arbre#get_visite_programmée()
    @see arbre#set_visite_programmée(boolean)
    @see arbre#toString()
 */
    public void programmerUneVisite(String libellefrancais, String geo_point_2d, Vector<Arbre> arbresRemarquables) {
        for(Arbre arbre : arbresRemarquables) {
            if(arbre.get_libellefrancais().equals(libellefrancais) && ("   " + arbre.get_geo_point_2d() + "   ").contains(geo_point_2d) ) {
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
/**
    Méthode qui permet au membre de voter sur un arbre
    Celle-ci met à jour le nombre de votes de l'arbre voté dans la classe Arbre
    @param tousArbres
    @param arbresVotés
    @param libellefrancais
    @param geo_point_2d
    * Il nous faut le libelle ainsi que le point 2d afin de bien différencier les arbres 
    @see nombreDeVotes 
    @see arbre#get_libellefrancais()
    @see arbre#get_geo_point_2d()
    @see arbre#set_nombreDeVotes(int)
    @see arbre#get_nombreDeVote()
    @see arbres#arbresVotés
    @see arbres#tousArbres
 */
    public void voterSurUnArbre(Vector<Arbre> tousArbres, Vector<Arbre> arbresVotés, String libellefrancais, String geo_point_2d){
        if(this.nombreDeVotes <= 0) {
            System.out.println("Vous avez déjà voté sur 5 arbres");
        }
        
        else {
            for(Arbre arbre : tousArbres) {
                if(arbre.get_libellefrancais().equals(libellefrancais) && ("   " + arbre.get_geo_point_2d() + "   ").contains(geo_point_2d) ) {
                    arbre.set_nombreDeVotes(arbre.get_nombreDeVotes() + 1);
                    arbresVotés.add(arbre);
                    this.nombreDeVotes--;
                }
            }
        }
    }

/**
    Méthode qui permet d'effectuer un compte rendu 
    Elle met en même temps à jour le nombre de Visites effectués par les membres
    Celle-ci modifie aussi le statut 'visite_programmé' de l'abre en False car celle-ci a été effectué
    Elle met aussi à jour les comptes de l'association en lui retirant le montant de la visite payé au membre
    @param libellefrancais
    @param geo_point_2d
    @param arbresRemarquable
    @param association 
    @see association#arbresRemarquables
    @see arbre#get_libellefrancais()
    @see arbre#get_geo_point_2d()
    @see arbre#get_visite_programmée()
    @see association#getComptes()
    @see association#setComptes(double)
    @see association#get_montantVisite()
    * monant des visites fixées par l'association
    @see arbre#set_visite_programmée(boolean)
    @see arbre#set_derniereVisite(Timestamp)
    @see IOHandler#lireClavier
    @see association#getComptesRendus()
    * ajoute le nouveau compte rendu dans la classe association 
    @see association#setNombreVisites(int)
    @see association#getNombreVisites()
 */

    public void effectuerUnCompteRendu(String libellefrancais, String geo_point_2d, Vector<Arbre> arbresRemarquable, Association association) {
        for(Arbre arbre : arbresRemarquable) {
            if(arbre.get_libellefrancais().equals(libellefrancais) && ("   " + arbre.get_geo_point_2d() + "   ").contains(geo_point_2d)) {
                if(arbre.get_visite_programmée() == true && association.getComptes() > association.get_montantVisite() ) {
                    arbre.set_visite_programmée(false);
                    arbre.set_derniereVisite(new Timestamp(System.currentTimeMillis()));
                    association.setComptes(association.getComptes() - association.get_montantVisite());
                    String compteRendu = IOHandler.lireClavier("Veuillez entrer votre compte rendu: \n");
                    compteRendu = compteRendu + "\nDate: " + new Timestamp(System.currentTimeMillis());
                    association.getComptesRendus().add(compteRendu);
                    association.setNombreVisites(association.getNombreVisites() + 1);
                } else {
                    System.out.println("Oops vous ne pouvez pas effectuer de compte rendu");
                }
            }
        }
    }

/**
    Méthode qui permet au membre de cotiser 
    Celle-ci met, par la même occasion, à jour les comptes de l'association (et les recettes de celle-ci)
    Elle permet aussi de mettre à jour le tableau des cotisations du membre 
    @param association 
    @see association 
    @see IOHandler#lireClavier
    @see association#getComptes()
    @see association#setComptes(double)
    @see association#get_recettes()
    @see association#set_recettes(double)
 */
    public void cotiser(Association association) {
       double montant = Double.parseDouble(IOHandler.lireClavier("Veuillez entrer le montant de votre cotisation: "));
         if(montant > 0) {
                association.setComptes(association.getComptes() + montant);
                this.cotisations.add(montant);
                association.set_recettes(association.get_recettes() + montant);
         }
         else {
              System.out.println("Montant invalide");
         }
    }
/**
    Méthode qui fait appel à la méthode toString de la classe 
    Permet d'afficher les informations du membre 
 */
    public void authentification(){
      System.out.println(toString());
    }

/**
    Méthode test qui permet d'effectuer un compte rendu 
    @param libellefrancais
    @param geo_point_2d
    @param arbresRemarquable
    @param association 
    @see association#demanderDesDons(double,String,String)
    * Fait appel à la méthode de la classe association demanderDesDons afin d'alimenter les comptes de l'association pour pouvoir payer la visite 
    @see association#set_montantVisite(double)
    * met à jour le montant des visites de l'association 
    @see programmerUneVisite(String, String, Vector<Arbre>)
    * Fait appel à cette méthode afin que la visite soit en staut programmée pour pouvoir par la suite effectuer un compte rendu
    @see  effectuerUnCompteRendu(String, String, Vector<Arbre>, association)
 */
    public void testEffectuerUnCompteRendu(String libellefrancais, String geo_point_2d, Vector<Arbre> arbresRemarquable, Association association){
        association.demanderDesDons(10000, "", "");
        association.set_montantVisite(100);
        programmerUneVisite(libellefrancais, geo_point_2d, association.getArbres());
        effectuerUnCompteRendu(libellefrancais, geo_point_2d, association.getArbres(), association);
        
    }
/**
    Redéfinition de la méthode toString 
    @return String
    * qui correspond à toutes les informations du membre (tous les attributs de la classe Membre)
 */
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
