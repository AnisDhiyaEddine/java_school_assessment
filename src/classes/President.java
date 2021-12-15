package classes;
public class President extends Personne {


    // Une première version des attributs de la classe President
    President(String nom, String prenom, String adresse, String telephone, String email) {
        super(nom, prenom, adresse, telephone, email);
    }

    void ajouterUnDonnateur(){}
    void ajouterUnMembre(){}
    void virerUnMembre(){}
    void supprimerUnDonnateur(){}
    
    public static void main(String[] args) {
        System.out.println("president handler is being executed");
        while(true){}
    }
}
