package classes;

/**
    Cette classe est caractérisée par les attributs suivants : 
    nom 
    nature 
 */
public class Donateur {

/** 
    nom est une chaîne de caractère représentant le nom du donateur. 
 */
    private String nom;

/** 
    nature est une chaîne de caractère représentant la nature du donateur. 
 */
    private String nature;

/**
    Constructeur de Donateur
    @param nom
    @param nature
 */
    public Donateur(String nature, String nom){
        this.nature = nature;
        this.nom = nom;
    }
/** 
    La méthode donner permet au donateur d'effectuer un don à l'association
    @param montant
    *   ce qui correspond au montant du don
    @param association
    *   correspond à l'association qui reçoit le don
    @see association#setComptes
    *   permet de mettre directement à jour les comptes de l'association
    @see association#getComptes
    *   permet de récupérer les comptes de l'association avant le don afin de les mettre à jour
     */ 

    public void donner(double montant, Association association){
        association.setComptes(association.getComptes() + montant);
    }

/**
    Méthode qui getNom permet de récupérer le nom du donateur
    @return nom
 */
    public String getNom(){
        return nom;
    }
/**
    Méthode setNom qui permet de modifier l'attribut nom alors qu'il est en private
    @param nom
 */
    public void setNom(String nom){
        this.nom = nom;
    }
/**
    Méthode qui getNature permet de récupérer la nature du donateur
    @return nature
 */
    public String getNature(){
        return nature;
    }
/**
    Méthode setNature qui permet de modifier l'attribut nature alors qu'il est en private
    @param nature
 */
    public void setNature(String nature){
        this.nature = nature;
    }

}
