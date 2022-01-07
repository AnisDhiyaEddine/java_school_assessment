import utiles.*;
import classes.*;
import java.io.File;
public class Main {

    static private String arbresURL = "https://data.iledefrance.fr//explore/dataset/les-arbres/download?format=csv&timezone=Europe/Berlin&use_labels_for_header=false";
    public static void main(String[] args) {
        System.out.println("Bienvenue dans la console");

        // Dependencies download
        if(FsHandler.fileExists("assets/arbres.csv")) {
            int choix = Integer.parseInt(IOHandler.lireClavier("le fichier arbres.csv existe déja, pour le mettre à jour, tapez 1, tapez 0 sinon : "));
            if(choix == 1) {
                FsHandler.updateFile(arbresURL, "assets/arbres.csv");
            }            
        } else {
            FsHandler.downloadFile(arbresURL, "assets/arbres.csv");
        }

        System.out.println("Bienvenue dans notre console");
        Association association = new Association("Asso arbres");
        association.remplirLesArbres();
        System.out.println("Nombre d'arbres : " + association.getArbres().size());
        System.out.println("Nombre d'arbres remarquables : " + association.getArbresRemarquables().size());
        System.out.println("exemple d'arbre pour les tests : " + association.getArbresRemarquables().get(0));
        System.out.println();
        int role = Integer.parseInt(IOHandler.lireClavier("Veuillez choisir votre rôle : \n1. President \n2. Membre \n3. Association \n4. Quitter  "));
        switch(role){
            case 1: {                
                String nom = IOHandler.lireClavier("Veuillez entrer votre nom : ");
                String prenom = IOHandler.lireClavier("Veuillez entrer votre prénom : ");
                String adresse = IOHandler.lireClavier("Veuillez entrer votre adresse : ");
                String telephone = IOHandler.lireClavier("Veuillez entrer votre numéro de téléphone : ");
                String email = IOHandler.lireClavier("Veuillez entrer votre email : ");
                President president = new President(nom, prenom, adresse, telephone, email);
                System.out.println("Bienvenue dans les fonctions du président");

                boolean cont = true;
                while(cont){
                    int choix = Integer.parseInt(IOHandler.lireClavier("Veuillez choisir une action : \n1. Ajouter un donateur \n2. Ajouter un membre \n3. Radier un membre \n4. Supprimer un donateur \n5. Quitter  "));
                    switch(choix){
                        case 1: {
                            String nature = IOHandler.lireClavier("Veuillez entrer la nature du donateur : ");
                            String nomDonateur = IOHandler.lireClavier("Veuillez entrer le nom du donateur : ");
                            president.ajouterUnDonateur(nature, nomDonateur , association.getDonateurs());
                            System.out.println("Le donateur a bien été ajouté");
                            System.out.println("\n Nombre de donateurs : " + association.getDonateurs().size() + "\n");
                            break;
                        }
                        case 2: {
                            String nomMembre = IOHandler.lireClavier("Veuillez entrer le nom du membre : ");
                            String prenomMembre = IOHandler.lireClavier("Veuillez entrer le prénom du membre : ");
                            String adresseMembre = IOHandler.lireClavier("Veuillez entrer l'adresse du membre : ");
                            String telephoneMembre = IOHandler.lireClavier("Veuillez entrer le numéro de téléphone du membre : ");
                            String emailMembre = IOHandler.lireClavier("Veuillez entrer l'email du membre : ");
                            president.ajouterUnMembre(nomMembre, prenomMembre, adresseMembre, telephoneMembre, emailMembre, association.getMembres());
                            System.out.println("\n Nombre de membres : " + association.getMembres().size() + "\n");
                            break;
                        }
                        case 3: {
                            String nomMembre = IOHandler.lireClavier("Veuillez entrer le nom du membre à radier : ");
                            String prenomMembre = IOHandler.lireClavier("Veuillez entrer le prenom du membre à radier : ");
                            president.radierUnMembre(nom, prenom, association.getMembres());
                            System.out.println("\n Nombre de membres : " + association.getMembres().size() + "\n");
                            break;
                        }
                        case 4: {
                            String natureDonateur = IOHandler.lireClavier("Veuillez entrer la nature du donateur à supprimer : ");
                            String nomDonateur = IOHandler.lireClavier("Veuillez entrer le nom du donateur à supprimer : ");
                            president.supprimerUnDonateur(natureDonateur, nomDonateur, association.getDonateurs());
                            System.out.println("Le donateur a bien été supprimé");
                            System.out.println("Nombre de donateurs : " + association.getDonateurs().size());
                            break;
                        }
                        case 5: {
                            cont = false;
                            break;
                        }
                        default : {
                            System.out.println("Veuillez entrer une action valide");
                        }
                    }
                }
                break;
            }
            case 2: {
                String nom = IOHandler.lireClavier("Veuillez entrer votre nom : ");
                String prenom = IOHandler.lireClavier("Veuillez entrer votre prénom : ");
                String adresse = IOHandler.lireClavier("Veuillez entrer votre adresse : ");
                String telephone = IOHandler.lireClavier("Veuillez entrer votre numéro de téléphone : ");
                String email = IOHandler.lireClavier("Veuillez entrer votre email : ");
                Membre membre = new Membre(nom, prenom, adresse, telephone, email);
                System.out.println("Bienvenue dans les fonctions du membre");
                
                boolean cont = true;
                while(cont){
                    int choix = Integer.parseInt(IOHandler.lireClavier("Veuillez choisir une action : \n1. Authentification \n2. Programmer une visite \n3. Faire une cotisation \n4. Voter sur un arbre \n5. Effectuer un compte rendu \n6. Quitter  "));
    	            switch(choix){
                        case 1: {
                            membre.authentification();
                            break;
                        }
                        case 2: {
                            String libellefrancais = IOHandler.lireClavier("Veuillez entrer le libélé de l'arbre : ");
                            String point_2d = IOHandler.lireClavier("Veuillez entrer le point 2D de l'arbre : ");
                            membre.programmerUneVisite(libellefrancais, point_2d , association.proposerDesVisites());
                            // Feedback à l'interieur de la fonction                    
                            break;
                        }
                        case 3: {
                            System.out.println("Avant la cotisation les comptes sont à : " + association.getComptes() + " euros");
                            membre.cotiser(association);
                            System.out.println("Votre cotisation a bien été prise en compte");
                            System.out.println("Apres la cotisation les comptes sont à : " + association.getComptes() + " euros");
                            break;
                        }
                        case 4: {
                            String libelleFrancais = IOHandler.lireClavier("Veuillez entrer le libelle de l'arbre : ");
                            String point_2d = IOHandler.lireClavier("Veuillez entrer les coordonnées de l'arbre séparé par une vergile sans espace : ");
                            membre.voterSurUnArbre(association.getArbres(), association.getArbresVotés(), libelleFrancais, point_2d);
                            System.out.println("Vous avez voté pour l'arbre " + association.getArbresVotés().get(association.getArbresVotés().size()-1));	
                            break;
                        }
                        case 5: {
                            String libelleFrancais = IOHandler.lireClavier("Veuillez entrer le libelle de l'arbre : ");
                            String point_2d = IOHandler.lireClavier("Veuillez entrer les coordonnées de l'arbre séparé par une vergule sans espace : ");
                            membre.testEffectuerUnCompteRendu(libelleFrancais, point_2d, association.proposerDesVisites(), association);
                            System.out.println("Votre compte rendu a bien été pris en compte");
                            System.out.println("Le dernier compte rendu est : " + association.getComptesRendus().get(association.getComptesRendus().size()-1));
                            break;
                        }
                        case 6: {
                            cont = false;
                            break;
                        }
                        default: {
                            System.out.println("Veuillez choisir une action valide");
                        }
                    }
                }
                break;
            }
            case 3: {
                System.out.println("Bienvenue dans les fonctions de l'association");
                
                boolean cont = true;
                while(cont){
                    int choix = Integer.parseInt(IOHandler.lireClavier("Veuillez choisir une action : \n1. Générer un rapport \n2. Payer les factures \n3. Proposer des dons \n4. Proposer une liste des arbres \n5. Quitter  "));
                    switch(choix){
                        case 1: {
                            System.out.println(association.genererUnRapport());
                            break;
                        }
                        case 2: {
                            System.out.println("Avant la paiement des factures les comptes sont à : " + association.getComptes() + " euros");
                            System.out.println("Avant la paiement les factures sont à :" + association.getFactures() + " euros");
                            association.payerLesFactures();
                            System.out.println("Apres la paiement des factures les comptes sont à : " + association.getComptes() + " euros");
                            System.out.println("Apres la paiement les factures sont à :" + association.getFactures() + " euros");
                            break;
                        }
                        case 3: {
                            double montant = Double.parseDouble(IOHandler.lireClavier("Veuillez entrer le montant du don : "));
                            System.out.println("Avant la donation les comptes sont à : " + association.getComptes() + " euros");
                            association.demanderDesDons(montant, "", "");
                            System.out.println("Apres la donation les comptes sont à : " + association.getComptes() + " euros");
                            break;
                        }
                        case 4: {
                            association.testProposerUneListedesArbres();
                            break;
                        }
                        case 5: {
                            System.out.println("Au revoir");
                            cont = false;
                            break;
                        }
                        default: {
                            System.out.println("Veuillez entrer un chiffre entre 1 et 6");
                            break;
                        }
                    }
                }
            }
            default: {
                System.out.println("Vous avez choisi de quitter");
                break;
            }
        }
    }
}