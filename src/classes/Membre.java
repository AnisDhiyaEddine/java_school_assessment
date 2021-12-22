package classes;

public class Membre extends Personne {
    Membre(String nom, String prenom, String adresse, String telephone, String email) {
        super(nom, prenom, adresse, telephone, email);
    }

    void effectuerUneVisite(){}
    void voterSurUnArbre(){}
    void cotiser(){}
    void effectuerUnCompteRendu(){}

    public static void main(String[] args) {
        System.out.println("member handler is being executed");
        while(true){}
    }
}
