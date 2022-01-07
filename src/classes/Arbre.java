package classes;

import java.sql.Timestamp;

public class Arbre {
    public String libellefrancais = "";
    public String genre = "";
    public String espece = "";
    public String remarquable = "";
    public String hauteurenm = "";
    public String circonferenceencm = "";	
    public String stadedeveloppement = "";
    public String geo_point_2d = "";
    public boolean visite_programmée = false;
    public Timestamp derniereVisite = null;
    public int nombreDeVotes = 0;

    public Arbre(
        String libellefrancais,
        String genre,
        String espece,
        String remarquable,
        String hauteurenm,
        String circonferenceencm,	
        String stadedeveloppement,
        String geo_point_2d
    ){
        this.libellefrancais = libellefrancais;
        this.genre = genre;
        this.espece = espece;
        this.remarquable = remarquable;
        this.hauteurenm = hauteurenm;
        this.circonferenceencm = circonferenceencm;	
        this.stadedeveloppement = stadedeveloppement;
        this.geo_point_2d = geo_point_2d;
    }

    public String get_libellefrancais(){
        return libellefrancais;
    }

    public String get_genre(){
        return genre;
    }

    public String get_espece(){
        return espece;
    }

    public String get_remarquable(){
        return remarquable;
    }

    public String get_hauteurenm(){
        return hauteurenm;
    }

    public String get_circonferenceencm(){
        return circonferenceencm;
    }

    public String get_stadedeveloppement(){
        return stadedeveloppement;
    }   

    public String get_geo_point_2d(){
        return geo_point_2d;
    }

    public Timestamp get_derniereVisite(){
        return derniereVisite;
    }

    public void set_derniereVisite(Timestamp derniereVisite){
        this.derniereVisite = derniereVisite;
    }

    public void set_visite_programmée(boolean visite_programmée){
        this.visite_programmée = visite_programmée;
    }

    public boolean get_visite_programmée(){
        return visite_programmée;
    }

    public int get_nombreDeVotes(){
        return nombreDeVotes;
    }

    public void set_nombreDeVotes(int nombreDeVotes){
        this.nombreDeVotes = nombreDeVotes;
    }

    @Override
    public String toString() {
        return "\n\nArbre {\n" +
            "libellefrancais: " + libellefrancais + '\n' +
            "genre: " + genre + '\n' +
            "espece: " + espece + '\n' +
            "remarquable: " + remarquable + '\n' +
            "hauteurenm: " + hauteurenm + '\n' +
            "circonferenceencm: " + circonferenceencm + '\n' +
            "stadedeveloppement: " + stadedeveloppement + '\n' +
            "geo_point_2d: " + geo_point_2d + '\n' +	
            "nombreDeVotes: " + nombreDeVotes + '\n' +	
            "visite programmée: " + visite_programmée + '\n' +
            "\n}";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((circonferenceencm == null) ? 0 : circonferenceencm.hashCode());
        result = prime * result + ((espece == null) ? 0 : espece.hashCode());
        result = prime * result + ((genre == null) ? 0 : genre.hashCode());
        result = prime * result + ((hauteurenm == null) ? 0 : hauteurenm.hashCode());
        result = prime * result + ((libellefrancais == null) ? 0 : libellefrancais.hashCode());
        result = prime * result + ((remarquable == null) ? 0 : remarquable.hashCode());
        result = prime * result + ((stadedeveloppement == null) ? 0 : stadedeveloppement.hashCode());
        result = prime * result + ((geo_point_2d == null) ? 0 : geo_point_2d.hashCode());
        return result;
    }
}
