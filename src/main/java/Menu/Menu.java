package Menu;

import java.util.Scanner;


public class Menu{
    Scanner scanner= new Scanner(System.in);
    
    public int menuAcceuil(){
        int choix;
        System.out.println
        ("Menu"
        + "\n 1-Voir catalogue"  
        + "\n 2-S'inscrire"
        + "\n 3-Se connecter"
        + "\n 4-Lister les locaux disponibles"
        + "\n 5-Lister les locaux par type"
        + "\n 6-Quitter");
        System.out.print("Faites votre choix : ");
        choix = Integer.parseInt(scanner.nextLine());
        return choix;
    }

    public int menuConnexionClient(){
        int choix;
        System.out.println
        ("Menu"
        + "\n 1-Reserver un bien"  
        + "\n 2-Voir détail bien"
        + "\n 3-Lister les locaux disponibles"
        + "\n 4-Lister les locaux par type"
        + "\n 5-Deconnection");
        System.out.print("Faites votre choix : ");
        choix = Integer.parseInt(scanner.nextLine());
        return choix;
    }

    public int menuConnexionAdmin(){
        int choix;
        System.out.println
        ("Menu"
        + "\n 1-Ajouter un local"  
        + "\n 2-Lister réservations par client"
        + "\n 3-Annuler réservation"
        + "\n 4-Lister les locaux par type"
        + "\n 5-Deconnection");
        System.out.print("Faites votre choix : ");
        choix = Integer.parseInt(scanner.nextLine());
        return choix;
    }

    public int menuCatalogue(){
        int choix;
        System.out.println(
            "Menu"
            + "\n 1-Reserver un bien"
            + "\n 2-Voir détail bien"
            + "\n 3-Lister les locaux disponibles"
            + "\n 4-Lister les locaux par types "
            + "\n 5-Retour ");
            System.out.print("Faites votre choix");
            choix= Integer.parseInt(scanner.nextLine());
             return choix;
    }
}