package classes;

import java.sql.Timestamp;

/**
 * Cette classe est caractérisée par les informations suivantes :
 * libellefrancais
 * genre
 * espece
 * remarquable
 * hauteurenm
 * circonferenceencm
 * stadededeveloppement
 * geo_point_2d
 * visite_programme
 * derniereVisite
 * nombreDeVotes
 */

public class Arbre {

     /** 
     * libellefrancais est une chaîne de caractère représentant le nom de l'arbre. 
     */
    public String libellefrancais = "";
    /** 
     * genre est une chaîne de caractère représentant le genre de l'arbre. 
     */
    public String genre = "";
    /** 
     * espece est une chaîne de caractère représentant l'espece de l'arbre. 
     */
    public String espece = "";
    /** 
     * remarquable est une chaîne de caractère indiquant si l'arbre est remarquable. 
     */
    public String remarquable = "";
    /** 
     * hauteurenm est une chaîne de caractère représentant la hauteur en m de l'arbre. 
     */
    public String hauteurenm = "";
    /** 
     * circonferenceencm est une chaîne de caractère représentant la circonference en cm de l'arbre. 
     */
    public String circonferenceencm = "";
    /** 
     * stadedeveloppement est une chaîne de caractère représentant le stade de developpement l'arbre. 
     */	
    public String stadedeveloppement = "";
    /** 
     * geo_point_2d est une chaîne de caractère représentant la postition de l'arbre. 
     */
    public String geo_point_2d = "";
    /** 
     * visite_programmée est un boolean indiquant si une visite a été programmé  pour l'arbre. 
     */
    public boolean visite_programmée = false;
    /** 
     * derniere visite est un time stamp représentant la dernière visite de l'arbre(hérite de la classe java.util.Date pour encapsuler des données ). 
     */
    public Timestamp derniereVisite = null;
    /** 
     * nombreDevotes est un entier représentant le nombre de vote de l'arbre(hérite de la classe java.util.Date pour encapsuler des données ). 
     * initialement à zéro
     */
    public int nombreDeVotes = 0;

    /** 
     * Constructeur de Arbre
     * @param libellefrancais 
     * @param genre
     * @param espece
     * @param remarquable
     * @param hauteurenm
     * @param circonferenceencm
     * @param stadedeveloppement 
     * @param geo_point_2d
     */ 

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

/**
    Méthode qui permet de récupérer le nom de l'arbre.
    @return libellefrancais 
 */
    public String get_libellefrancais(){
        return libellefrancais;
    }
/**
    Méthode qui permet de récupérer le genre de l'arbre.
    @return genre 
 */
    public String get_genre(){
        return genre;
    }
/**
    Méthode qui permet de récupérer l'espece de l'arbre.
    @return espece 
 */
    public String get_espece(){
        return espece;
    }
/**
    Méthode qui permet de récupérer si l'arbre est remarquable.
    @return remarquable 
 */
    public String get_remarquable(){
        return remarquable;
    }
/**
    Méthode qui permet de récupérer la hauteur en m de l'arbre.
    @return hauteurenm
 */

    public String get_hauteurenm(){
        return hauteurenm;
    }
/**
    Méthode qui permet de récupérer la circonference en cm de l'arbre.
    @return circonferenceencm 
 */
    public String get_circonferenceencm(){
        return circonferenceencm;
    }
/**
    Méthode qui permet de récupérer le stade de développement de l'arbre.
    @return stadededeveloppement 
 */
    public String get_stadedeveloppement(){
        return stadedeveloppement;
    }   
/**
    Méthode qui permet de récupérer la position de l'arbre.
    @return geo_point_2d 
 */
    public String get_geo_point_2d(){
        return geo_point_2d;
    }
/**
    Méthode qui permet de récupérer la derinière visite.
    @return derniereVisite 
 */
    public Timestamp get_derniereVisite(){
        return derniereVisite;
    }
/**
    Méthode qui permet de modifier l'attribut derniereVsite alors qu'il est en private
    @param derniereVisite
 */
    public void set_derniereVisite(Timestamp derniereVisite){
        this.derniereVisite = derniereVisite;
    }
/**
    Méthode qui permet de modifier l'attribut visite_programmee alors qu'il est en private
    @param visite_programmée
 */

    public void set_visite_programmée(boolean visite_programmée){
        this.visite_programmée = visite_programmée;
    }

/**
    Méthode qui permet de récupérer si une visite est programmee.
    @return visite_programmée 
 */
    public boolean get_visite_programmée(){
        return visite_programmée;
    }
/**
    Méthode qui permet de récupérer le nombre de votes de l'arbre.
    @return nombreDeVotes 
 */
    public int get_nombreDeVotes(){
        return nombreDeVotes;
    }
/**
    Méthode qui permet de modifier l'attribut nombreDeVotes alors qu'il est en private
    @param nombreDevotes
 */
    public void set_nombreDeVotes(int nombreDeVotes){
        this.nombreDeVotes = nombreDeVotes;
    }

/**
    Redéfinition de la méthode to String
    @return une chaine de caractère
    * qui correspond à toutes les informations d'un arbre (tous les attributs de la classe Arbre)
 */
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