package classes;

public class Donateur {

    private String nom;
    private String nature;
    public Donateur(String nature, String nom){
        this.nature = nature;
        this.nom = nom;
    }

    public void donner(double montant, Association association){
        association.setComptes(association.getComptes() + montant);
    }

    public String getNom(){
        return nom;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public String getNature(){
        return nature;
    }

    public void setNature(String nature){
        this.nature = nature;
    }
}
