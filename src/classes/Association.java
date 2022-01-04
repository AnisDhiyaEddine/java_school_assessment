package classes;

import java.sql.Timestamp;  
import java.text.*;



import java.util.*;
import utiles.*;

public class Association {
    private String nom;
    private President president;
    private Vector<Membre> membres = new Vector<Membre>();
    private Vector<Donateur> donateurs = new Vector<Donateur>();
    private Vector<Arbre> arbres = new Vector<Arbre>();
    private Vector<Arbre> arbresRemarquables = new Vector<Arbre>();
    private double comptes;
    private double montant_visite = 100;
    private Vector <String> compteRendus = new Vector<String>();
    private double factures = 0;
    private Vector<Arbre> arbresVotés = new Vector<Arbre>();


    public Association(String nom){
        this.nom = nom;
    }

    public President getPresident(){
        return president;
    }

    public void setPresident(President president){
        this.president = president;
    }

    public Vector<Membre> getMembres(){
        return membres;
    }

    public void setMembres(Vector<Membre> membres){
        this.membres = membres;
    }

    public Vector<Donateur> getDonateurs(){
        return donateurs;
    }

    public void setDonateurs(Vector<Donateur> donateurs){
        this.donateurs = donateurs;
    }

    public Vector<Arbre> getArbres(){
        return arbres;
    }

    public void setArbres(Vector<Arbre> arbres){
        this.arbres = arbres;
    }

    public double getComptes(){
        return comptes;
    }

    public void setComptes(double comptes){
        this.comptes = comptes;
    }

    public double getFactures(){
        return factures;
    }

    public void setFactures(double factures){
        this.factures = factures;
    }

    public Vector<Arbre> getArbresRemarquables(){
        return arbresRemarquables;
    }

    public void set_montant_visite(double montant_visite){
        this.montant_visite = montant_visite;
    }

    public double get_montant_visite(){
        return montant_visite;
    }

    public Vector<String> getCompteRendus(){
        return compteRendus;
    }

    public void setCompteRendus(Vector<String> compteRendus){
        this.compteRendus = compteRendus;
    }

    public void payerLesFactures(){
        if (comptes >= factures){
            comptes -= factures;
            factures = 0;
        }else{
            System.out.println("Vous n'avez pas assez d'argent pour payer les factures");	
        }
    }

    public void proposerDesVisites(){
        Collections.sort(arbresRemarquables, new Comparator<Arbre>() {
            @Override
            public int compare(Arbre o1, Arbre o2) {
                return o1.get_derniereVisite().compareTo(o2.get_derniereVisite());
            }
        });
    }



    public void remplirLesArbres(){
        String liste = FsHandler.readFile("assets/arbres.csv");
        String[] arbresLignes = liste.split("\n");
        Arbre arbre;
        try {
            for (int i = 1; i < arbresLignes.length; i++) {
            String[] arbresColonnes = arbresLignes[i].split(";");
            arbre = new Arbre(arbresColonnes[8], arbresColonnes[9],arbresColonnes[10], arbresColonnes[15], arbresColonnes[13], arbresColonnes[12], arbresColonnes[14],arbresColonnes[15]);
            if(arbre != null) this.arbres.add(arbre);
         }

         for(Arbre el : arbres){
            if(! el.get_remarquable().equals("NON")){	
                arbresRemarquables.add(el);
            }
         }

        } catch (Exception e) {
            System.out.println("Erreur lors de la création des arbres");
        }
    }	



    public void genererUnRapport(){
        
    }

    public void demanderDesDons( double montant, String nature, String nom){
        for(Donateur donateur : donateurs){
            if(donateur.getNature().equals(nature) && donateur.getNom().equals(nom)){
                donateur.donner(montant, this);
            }
        }
    }

    public void proposerUneListedesArbres(){
        Vector<Arbre> aProposer = new Vector<Arbre>();
        Collections.sort(arbresRemarquables, new Comparator<Arbre>() {
            @Override
            public int compare(Arbre o1, Arbre o2) {
                return o1.get_nombreDeVotes() - o2.get_nombreDeVotes();
            }
        });

        for(int i = 0; i < 5; i++){
                aProposer.add(arbresRemarquables.get(i));
        }

        System.out.println("Voici les arbres à proposer à la municipalité : ");
        for(Arbre el : aProposer){
            System.out.println(el.toString());
        }
    }


    @Override
    public String toString() {
        return "Association{" +
                "nom='" + nom + '\'' +
                ", nombre des arbres=" + arbres.size() +
                '}';
    }
}







/*

         Vector<Arbre> arbresTries = new Vector<Arbre>();

            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date date = dateFormat.parse("23/09/2007");
            long time = date.getTime();
        
            arbres.get(0).set_derniereVisite(new Timestamp(time));
            arbresTries.add(arbres.get(0));

            date = dateFormat.parse("03/09/2007");
            time = date.getTime();

            arbres.get(1).set_derniereVisite(new Timestamp(time));
            arbresTries.add(arbres.get(1));

            date = dateFormat.parse("12/09/2007");
            time = date.getTime();

            arbres.get(2).set_derniereVisite(new Timestamp(time));
            arbresTries.add(arbres.get(2));

            date = dateFormat.parse("07/09/2007");
            time = date.getTime();

            arbres.get(3).set_derniereVisite(new Timestamp(time));
            arbresTries.add(arbres.get(3));

            date = dateFormat.parse("19/09/2007");
            time = date.getTime();
            arbres.get(4).set_derniereVisite(new Timestamp(time));
            arbresTries.add(arbres.get(4));

            // Afficher les arbres triés
            for(int i = 0; i < arbresTries.size(); i++){
                System.out.println(arbresTries.get(i).toString());
            }

            System.out.println("\n\n");
                        // Afficher les arbres triés
                        for(int i = 0; i < arbresTries.size(); i++){
                            System.out.println(arbresTries.get(i).toString());
                        }
*/