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

    @Override
    public String toString() {
        return "Arbre{" +
            "libellefrancais='" + libellefrancais + '\'' +
            ", genre='" + genre + '\'' +
            ", espece='" + espece + '\'' +
            ", remarquable='" + remarquable + '\'' +
            ", hauteurenm='" + hauteurenm + '\'' +
            ", circonferenceencm='" + circonferenceencm + '\'' +
            ", stadedeveloppement='" + stadedeveloppement + '\'' +
            ", geo_point_2d='" + geo_point_2d + '\'' +
            ", derniereVisite=" + derniereVisite +
            '}';
    }
}
