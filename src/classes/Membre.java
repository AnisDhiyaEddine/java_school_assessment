package classes;


public class Membre extends Personne {
    Membre(String nom, String prenom, String adresse, String telephone, String email) {
        super(nom, prenom, adresse, telephone, email);
    }
    private int montant_cotisé = 0;
    public int get_montant_cotisé(){
        return montant_cotisé;
    }
    public void set_montant_cotisé(int montant){
        this.montant_cotisé = montant;
    }


    void effectuerUneVisite(){}
    void voterSurUnArbre(){}
    void effectuerUnCompteRendu(){}

    public static void main(String[] args) {
        System.out.println("member handler is being executed");
        while(true){}
    }
}
