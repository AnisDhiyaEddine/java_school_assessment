package classes;
public class Arbre {
    public int idbase = 0;
    public String arrondissement = "";; 
    public String adresse = "";
    public String libellefrancais = "";
    public String genre = "";
    public String espece = "";
    public String remarquable = "";


    public Arbre(
        int idbase ,
        String arrondissement ,
        String adresse ,
        String libellefrancais ,
        String genre ,
        String espece ,
        String remarquable
    ){
        this.idbase = idbase;
        this.arrondissement = arrondissement;
        this.adresse = adresse;
        this.libellefrancais = libellefrancais;
        this.genre = genre;
        this.espece = espece;
        this.remarquable = remarquable;
    }

    @Override
    public String toString() {
       return "Arbre [idbase=" + idbase + ", arrondissement=" + arrondissement + ", adresse=" + adresse + ", libellefrancais=" + libellefrancais + ", genre=" + genre + ", espece=" + espece + ", remarquable=" + remarquable + "]";
    }
}
