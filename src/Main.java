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

        // Le point d'entrer du programme
        System.out.println("Bienvenu dans notre console");
        Association association = new Association("Asso arbres");
        association.remplirLesArbres();
        System.out.println("Nombre d'arbres : " + association.getArbres().size());
        System.out.println("Nombre d'arbres remarquables : " + association.getArbresRemarquables().size());
        
        int role = Integer.parseInt(IOHandler.lireClavier("Veuillez choisir votre rôle : \n1. President \n2. Membre \n3. Association \n4. Quitter"));
        switch(role){
            case 1: {
                String nom = IOHandler.lireClavier("Veuillez entrer votre nom : ");
                String prenom = IOHandler.lireClavier("Veuillez entrer votre prénom : ");
                String adresse = IOHandler.lireClavier("Veuillez entrer votre adresse : ");
                String telephone = IOHandler.lireClavier("Veuillez entrer votre numéro de téléphone : ");
                String email = IOHandler.lireClavier("Veuillez entrer votre email : ");
                association.setPresident( new President(nom, prenom, adresse, telephone, email));
                System.out.println("Bienvenue dans les fonctions du président");
                int choix = Integer.parseInt(IOHandler.lireClavier("Veuillez choisir une action : \n1. Ajouter un donnateur \n2. Ajouter un membre \n3. Virer un membre \n4. Supprimer un donnateur \n5. Quitter"));
                switch(choix){
                    case 1: {
                        String nomDonateur = IOHandler.lireClavier("Veuillez entrer le nom du donnateur : ");
                        String nature = IOHandler.lireClavier("Veuillez entrer la nature du donnateur : ");
                        association.getPresident().ajouterUnDonnateur(nature,nomDonateur, association.getDonateurs());
                        break;
                    }
                    case 2: {
                        String nomMembre = IOHandler.lireClavier("Veuillez entrer le nom du membre : ");
                        String prenomMembre = IOHandler.lireClavier("Veuillez entrer le prénom du membre : ");
                        String adresseMembre = IOHandler.lireClavier("Veuillez entrer l'adresse du membre : ");
                        String telephoneMembre = IOHandler.lireClavier("Veuillez entrer le numéro de téléphone du membre : ");
                        String emailMembre = IOHandler.lireClavier("Veuillez entrer l'email du membre : ");
                        association.getPresident().ajouterUnMembre(nomMembre, prenomMembre, adresseMembre, telephoneMembre, emailMembre, association.getMembres());
                        break;
                    }
                    case 3: {
                        String nomMembre = IOHandler.lireClavier("Veuillez entrer le nom du membre : ");
                        String prenomMembre = IOHandler.lireClavier("Veuillez entrer le prénom du membre : ");
                        association.getPresident().virerUnMembre(nomMembre, prenomMembre, association.getMembres());
                        break;
                    }
                    case 4: {
                        String nomDonateur = IOHandler.lireClavier("Veuillez entrer le nom du donnateur : ");
                        String prenomDonateur = IOHandler.lireClavier("Veuillez entrer le prénom du donnateur : ");
                        association.getPresident().supprimerUnDonnateur(nomDonateur, prenomDonateur, association.getDonateurs());
                        break;
                    }
                    case 5: {
                        System.out.println("Au revoir");
                        break;
                    }
                }
                break;
            }
            case 2: {
                break;
            }
            case 3: {
                System.out.println("Bienvenue dans les fonctions de l'association");
                System.out.println("Veuillez choisir une action : \n1. Générer un rapport \n2. Payer les factures \n3. Proposer des dons \n4.Recevoir des cotisations \n5. Proposer des visites \n6. Proposer une liste des arbres \n7. Authentifier un membre \n8. Payer les membres \n9. Quitter");
                int choix = Integer.parseInt(IOHandler.lireClavier("Veuillez entrer votre choix : "));
                switch(choix){
                    case 1: {
                        association.genererUnRapport();
                        break;
                    }
                    case 2: {
                        association.payerLesFactures();
                        break;
                    }
                    case 3: {
                        association.demanderDesDons();
                        break;
                    }
                    case 5: {
                        association.proposerDesVisites();
                        break;
                    }
                    case 6: {
                        association.proposerUneListedesArbres();
                        break;
                    }
    
                    case 9: {
                        System.out.println("Au revoir");
                        break;
                    }
                    default: {
                        System.out.println("Veuillez entrer un chiffre entre 1 et 10");
                        break;
                    }
                }
            }
            default: {
                System.out.println("Vous avez choisi de quitter");
                break;
            }
        }

        while(true){}
    }
}