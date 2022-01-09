package classes;

import java.sql.Timestamp;  
import java.text.*;
import java.util.*;
import utiles.*;
/**
    Cette classe est caractérisée par les attributs suivants :
    nom 
    president 
    membres 
    donateurs 
    arbres 
    arbresRemarquables
    arbresVotés
    compteRendus
    comptes
    montantVisite
    factures 
    depenses 
    recettes
    nombreDesVisites

 */
public class Association {

/** 
    nom est une chaîne de caractère représentant le nom de l'association. 
 */ 
    private String nom;
/** 
    President un attribut qui désigne le président de l'association et qui renvoie donc à la classe President 
 */ 
    private President president;
/**
    membres est un tableau des membres de l'association
 */
    private Vector<Membre> membres = new Vector<Membre>();
/**
    donateurs est un tableau des donateurs de l'association
 */
    private Vector<Donateur> donateurs = new Vector<Donateur>();
/**
    arbres est un tableau d'Arbre
 */
    private Vector<Arbre> arbres = new Vector<Arbre>();
/**
    arbresRemarquables est un tableau d'Arbre
    L'association met à jour la liste des arbres remarquables
 */
    private Vector<Arbre> arbresRemarquables = new Vector<Arbre>();
/**
    arbresVotés est un tableau d'Arbre
    L'association met à jour la liste des arbres votés
 */
    private Vector<Arbre> arbresVotés = new Vector<Arbre>();
/**
    compteRendus est un tableau de String 
    qui correspond aux comptes rendus des visites
 */
    private Vector <String> compteRendus = new Vector<String>();
/**
    comptes est un double qui correspond aux comptes de l'association
 */
    private double comptes;
/**
    montantVisite est un double qui correspond au montant des visites fixé par l'association; ici 100
 */
    private double montantVisite = 100;
/**
    factures est un double qui correspond au montant des factures de l'association
 */
    private double factures = 0;
/**
    recettes est un double qui correspond au montant des recettes de l'association
 */
    private double recettes = 0;
/**
    depenses est un double qui correspond au montant des depenses de l'association
 */
    private double depenses = 0;
/**
    nombredeVisites est un entier qui correspond aux nombres de visites effectuées par les membres de l'association
 */
    private int nombreDesVisites = 0;

/**
    Constructeur de Association
    @param nom est le nom de l'association
 */
    public Association(String nom){
        this.nom = nom;
    }

/**
    Méthode getPresident qui permet de récupérer le président de l'association
    @return president
 */
    public President getPresident(){
        return president;
    }

/**
    Méthode setPresident qui permet de modifier l'attribut president alors qu'il est en private
    @param president est le nouveau président de l'association
 */
    public void setPresident(President president){
        this.president = president;
    }

/**
    Méthode getMembres qui permet de récupérer la liste des membres de l'association
    @return membres
 */
    public Vector<Membre> getMembres(){
        return membres;
    }

/**
    Méthode setMembres qui permet de modifier la liste des membres de l'association alors que l'attribut est en private
    @param membres est la nouvelle liste des membres de l'association
 */
    public void setMembres(Vector<Membre> membres){
        this.membres = membres;
    }

/**
    Méthode getDonateurs qui permet de récupérer la liste des donateurs de l'association
    @return donateurs
 */
    public Vector<Donateur> getDonateurs(){
        return donateurs;
    }

/**
    Méthode setDonateurs qui permet de modifier la liste des donateurs de l'association alors que l'attribut est en private
    @param donateurs est la nouvelle liste des donateurs de l'association
 */
    public void setDonateurs(Vector<Donateur> donateurs){
        this.donateurs = donateurs;
    }

/**
    Méthode getArbres qui permet de récupérer la liste des Arbres
    @return arbres
 */
    public Vector<Arbre> getArbres(){
        return arbres;
    }

/**
    Méthode setArbres qui permet de modifier la liste des arbres de l'association alors que l'attribut est en private
    @param arbres est la nouvelle liste des arbres de l'association
 */
    public void setArbres(Vector<Arbre> arbres){
        this.arbres = arbres;
    }

/**
    Méthode getComptes qui permet de récupérer les comptes de l'association
    @return comptes
 */
    public double getComptes(){
        return comptes;
    }

/**
    Méthode setComptes qui permet de modifier l'attribut comptes alors qu'il est en private
    @param comptes sont les nouveaux comptes de l'association
 */
    public void setComptes(double comptes){
        this.comptes = comptes;
    }

/**
    Méthode getFactures qui permet de récupérer les factures de l'association
    @return factures
 */
    public double getFactures(){
        return factures;
    }

/**
    Méthode setFactures qui permet de modifier l'attribut factures alors qu'il est en private
    @param factures sont les nouvelles factures de l'association
 */
    public void setFactures(double factures){
        this.factures = factures;
    }

/**
    Méthode set_recettes qui permet de modifier l'attribut recettes alors qu'il est en private
    @param recettes sont les nouvelles recettes de l'association
 */
    public void set_recettes(double recettes){
        this.recettes = recettes;
    }

/**
    Méthode get_recettes qui permet de récupérer les recettes de l'association
    @return recettes 
 */
    public double get_recettes(){
        return recettes;
    }

/**
    Méthode set_depenses qui permet de modifier l'attribut depenses alors qu'il est en private
    @param depenses sont les nouvelles depenses de l'association
 */ 
    public void set_depenses(double depenses){
        this.depenses = depenses;
    }

/**
    Méthode get_depenses qui permet de récupérer les depenses de l'association
    @return depenses
 */
    public double get_depenses(){
        return depenses;
    }

/**
    Méthode getArbresRemarquables qui permet de récupérer la liste des Arbres remarquables
    @return arbresRemarquables
 */
    public Vector<Arbre> getArbresRemarquables(){
        return arbresRemarquables;
    }

/**
    Méthode set_montantVisite qui permet de modifier l'attribut montantVisite alors qu'il est en private
    @param montantVisite le budget d'une seule visite
 */
    public void set_montantVisite(double montantVisite){
        this.montantVisite = montantVisite;
    }

/**
    Méthode get_montantVisite qui permet de récupérer le montant des visites de l'association
    @return montantVisite
 */
    public double get_montantVisite(){
        return montantVisite;
    }

/**
    Méthode getCompteRendus qui permet de récupérer la liste des comptes rendus de l'association
    @return compteRendus
 */
    public Vector<String> getComptesRendus(){
        return compteRendus;
    }

/**
    Méthode setCompteRendus qui permet de modifier la liste des comptes rendus de l'association alors que l'attribut est en private
    @param compteRendus est la nouvelle liste des comptes rendus de l'association
 */
    public void setCompteRendus(Vector<String> compteRendus){
        this.compteRendus = compteRendus;
    }

/**
    Méthode setNombreVisites qui permet de modifier l'attribut nombreDesVisites alors qu'il est en private
    @param nombreDesVisites est le nombre de visites de l'association
 */
    public void setNombreVisites(int nombreDesVisites){
        this.nombreDesVisites = nombreDesVisites;
    }

/**
    Méthode getNombreVisites qui permet de récupérer le nombre de visites de l'association
    @return nombreDesVisites
 */
    public int getNombreVisites(){
        return nombreDesVisites;
    }

/**
    Méthode getArbresVotés qui permet de récupérer la liste des Arbres votés de l'association
    @return arbresVotés
 */
    public Vector<Arbre> getArbresVotés(){
        return arbresVotés;
    }

/**
    Méthode setArbresVotés qui permet de modifier la liste des arbres votés de l'association alors que l'attribut est en private
    @param arbresVotés est la nouvelle liste des arbres votés de l'association
 */
    public void setArbresVotés(Vector<Arbre> arbresVotés){
        this.arbresVotés = arbresVotés;
    }

/**
  * Cette méthode permet de payer les factures.
  * Si les comptes sont positifs le paiement est effectué sinon un message est déclenché  
*/
    public void payerLesFactures(){
        if (comptes >= factures){
            comptes -= factures;
            depenses += factures;
            factures = 0;
            System.out.println("Paiement effectué");
        }else{
            System.out.println("Vous n'avez pas assez d'argent pour payer les factures");	
        }
    }

/**
  * Cette méthode permet de proposer des visites aux membres.
  * Liste d'arbres remarqueables qui est triée par ancienneté de dernière viste dans la méthode
  * @return vector des arbresRemarquables triés par ancienneté de dernière viste
*/

    public Vector<Arbre> proposerDesVisites(){
        Collections.sort(arbresRemarquables, new Comparator<Arbre>() {
            @Override
            public int compare(Arbre o1, Arbre o2) {
                if(o1.get_derniereVisite() == null){
                    return -1;
                }

                if(o2.get_derniereVisite() == null){
                    return 1;
                }
                return o1.get_derniereVisite().compareTo(o2.get_derniereVisite());
            }
        });
        return arbresRemarquables;
    }

/**
  * Cette méthode permet d'ajouter des arbres dans la liste.
  * Message bloquant
*/

    public void remplirLesArbres(){
        String liste = FsHandler.readFile("assets/arbres.csv");
        String[] arbresLignes = liste.split("\n");
        Arbre arbre;
        try {
            for (int i = 1; i < arbresLignes.length; i++) {
            String[] arbresColonnes = arbresLignes[i].split(";");
            arbre = new Arbre(arbresColonnes[8], arbresColonnes[9],arbresColonnes[10], arbresColonnes[15], arbresColonnes[13], arbresColonnes[12], arbresColonnes[14],arbresColonnes[16]);
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

/**
    Méthode qui permet de générer un rapport qui contient les informations suivantes : 
    nom de l'association
    recettes 
    depenses
    comptes 
    montant des visites 
    nombre de visites
    @return String 
    * contenant toutes ces informations
 */

    public String genererUnRapport(){
        String rapport = "\n Rapport de l'association " + this.nom + 
        " recettes : " + this.recettes + 
        " euros, depenses : " + this.depenses + 
        " euros, comptes : " + this.comptes + 
        " euros, montant des visites : " + this.montantVisite + 
        " euros, le nmbre des visite effectuées : " + this.nombreDesVisites + "\n";
        return rapport;
    }

/**
    Méthode qui permet à l'association de demander des dons aux donateurs 
    @param montant est le montant du don
    * montant du don demandé
    @param nature est la nature du donateur
    @param nom est le nom du donateur
    * nature et nom du donateur afin de le retrouver dans la liste des donateurs de l'association
    La méthode met aussi à jour les recettes de l'association lorsque le donateur est trouvé
 */
    public void demanderDesDons( double montant, String nature, String nom){

        if(nature == "" && nom == "") {
            // Vu qu'on a pas encore rajouter la persistance des données, on crée un donateur temporaire
            donateurs.add(new Donateur("test", "test"));
            demanderDesDons(montant, "test", "test");
            donateurs.remove(donateurs.size()-1);
        }

        if(donateurs.size() == 0){
            System.out.println("Il n'y a pas de donateurs");
        }else{
            for(Donateur donateur : donateurs){
                if(donateur.getNature().equals(nature) && donateur.getNom().equals(nom)){
                donateur.donner(montant, this);
                recettes += montant;
                }
            }
        }
    }

/**
    La méthode permet à l'association de proposer une liste d'arbres
    Celle-ci est basée sur les arbres votés 
    Elle trie la liste des arbres votés en foncion du nombres de votes,
    et ajoute les 5 premiers 
 */
    public void proposerUneListedesArbres(){
        Vector<Arbre> aProposer = new Vector<Arbre>();
        Collections.sort(arbresVotés, new Comparator<Arbre>() {
            @Override
            public int compare(Arbre o1, Arbre o2) {
                return o1.get_nombreDeVotes() - o2.get_nombreDeVotes();
            }
        });

        for(int i = 0; i < 5; i++){
                aProposer.add(arbresVotés.get(i));
        }

        System.out.println("Voici les arbres à proposer à la municipalité : ");
        for(Arbre el : aProposer){
            System.out.println(el.toString());
        }
    }

/**
    Cette méthode est un test pour la proposition des arbres votés
    Il faut dans un premier temps ajouter un president afin qu'il puisse ajouter des membres#setPresident
    Il faut ensuite jouter des memebres afin qu'ils puissent voter #ajouterUnMembre
    Il ne reste plus qu'à utiliser la méthode voterSurUnArbre de la classe Membre 
 */
    public void testProposerUneListedesArbres(){
        setPresident( new President("test", "test", "test", "test", "test"));
        president.ajouterUnMembre("test1", "test1", "test1", "test1", "test1", membres);
        president.ajouterUnMembre("test2", "test2", "test2", "test2", "test2", membres);
        president.ajouterUnMembre("test3", "test3", "test3", "test3", "test3", membres);

    	membres.get(0).voterSurUnArbre(arbres, arbresVotés, "Tilleul", "48.8575236733368,2.273512784480306");
    	membres.get(0).voterSurUnArbre(arbres, arbresVotés, "Platane", "48.847974826347695,2.391709735925394");
    	membres.get(0).voterSurUnArbre(arbres, arbresVotés, "Charme", "48.85212056146794,2.412624900479169");
    	membres.get(0).voterSurUnArbre(arbres, arbresVotés, "Sophora", "48.87009602025182,2.395182637194809");

    	membres.get(1).voterSurUnArbre(arbres, arbresVotés, "Tilleul", "48.8575236733368,2.273512784480306");
    	membres.get(1).voterSurUnArbre(arbres, arbresVotés, "Platane", "48.847974826347695,2.391709735925394");
    	membres.get(1).voterSurUnArbre(arbres, arbresVotés, "Charme", "48.85212056146794,2.412624900479169");
    	membres.get(1).voterSurUnArbre(arbres, arbresVotés, "Sophora", "48.87009602025182,2.395182637194809");

    	membres.get(2).voterSurUnArbre(arbres, arbresVotés, "Tilleul", "48.8575236733368,2.273512784480306");
    	membres.get(2).voterSurUnArbre(arbres, arbresVotés, "Platane", "48.847974826347695,2.391709735925394");
    	membres.get(2).voterSurUnArbre(arbres, arbresVotés, "Charme", "48.85212056146794,2.412624900479169");
    	membres.get(2).voterSurUnArbre(arbres, arbresVotés, "Sophora", "48.87009602025182,2.395182637194809");
    	proposerUneListedesArbres();
    }

/**
    Redéfinition de la méthode toString 
    @return String
    * qui correspond à toutes les informations de l'association (tous les attributs de la classe Association)
 */
    @Override
    public String toString() {
        return "Association{" +
                "nom='" + nom + '\'' +
                ", nombre des arbres=" + arbres.size() +
                '}';
    }
}