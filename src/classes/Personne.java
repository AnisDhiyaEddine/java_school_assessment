package classes;

/**
 * Cette classe est caractérisée par les attributs suivantss :
    nom
    prenom
    adresse 
    telephone 
    email
    Elle est classe mère de la classe Membre et President
 */

public class Personne {

/** 
    nom est une chaîne de caractère représentant le nom de la personne. 
 */  
    private String nom;
/** 
    prenom est une chaîne de caractère représentant le prenom de la personne. 
 */
    private String prenom;
/** 
    adresse est une chaîne de caractère représentant l'adresse de la personne. 
 */
    private String adresse;
/** 
    telephone est une chaîne de caractère représentant le numero de telephone de la personne. 
 */
    private String telephone;
/** 
    email est une chaîne de caractère représentant l'adresse mail de la personne. 
 */
    private String email;
/**
    Constructeur de Personne 
    @param nom
    @param prenom
    @param personne 
    @param adresse 
    @param telephone 
    @param email

 */
    public Personne(String nom, String prenom, String adresse, String telephone, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.email = email;
    }
/**
    Méthode getNom qui permet de récupérer le nom de la personne
    @return nom
 */
    public String getNom() {
        return nom;
    }
/**
    Méthode setNom qui permet de modifier l'attribut nom alors qu'il est en private
    @param nom
 */
    public void setNom(String nom) {
        this.nom = nom;
    }
/**
    Méthode getPrenom qui permet de récupérer le prenom de la personne
    @return prenom
 */
    public String getPrenom() {
        return prenom;
    }
/**
    Méthode setPrenom qui permet de modifier l'attribut prenom alors qu'il est en private
    @param prenom
 */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
/**
    Méthode getAdresse qui permet de récupérer l'adresse de la personne
    @return adresse
 */
    public String getAdresse() {
        return adresse;
    }
/**
    Méthode setAdresse qui permet de modifier l'attribut adresse alors qu'il est en private
    @param adresse
 */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
/**
    Méthode getTelephone qui permet de récupérer le numéro de telephone de de la personne
    @return telephone
 */
    public String getTelephone() {
        return telephone;
    }
/**
    Méthode setTelephone qui permet de modifier l'attribut telephone alors qu'il est en private
    @param telephone
 */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
/**
    Méthode getEmail qui permet de récupérer l'email de la personne
    @return email
 */
    public String getEmail() {
        return email;
    }
/**
    Méthode setEmail qui permet de modifier l'attribut email alors qu'il est en private
    @param email
 */
    public void setEmail(String email) {
        this.email = email;
    }
/**
    Redéfinition de la méthode toString 
    @return String
    * qui correspond à toutes les informations d'une personne (tous les attributs de la classe Personne)
 */
    @Override
    public String toString() {
        return "Personne [nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", telephone=" + telephone + ", email=" + email + "]";
    }

    
}
