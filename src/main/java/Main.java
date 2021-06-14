import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Biens.Chambre;
import Services.Services;
import Menu.Menu;
import Utilisateurs.Client;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
   

    public static void main(String args[]){
        Services service =new Services();
        Validator valid= new Validator();
        List<Chambre> listChambre = new ArrayList<>();
        Menu menu=new Menu();
        int choix;
        do{
            choix=menu.menuAcceuil();
            switch(choix){
                case 1:
                System.out.println(" \t ******** CATALOGUE DE BIENS IMMOBILLIERS ********");
                service.listerChambre(listChambre);
                menu.menuCatalogue();
                case 2:
                    System.out.println(" \t ******** PAGE D\'INSCRIPTION ********");

                    System.out.print("Entrer le numéro de votre carte d'identité: ");
                    String nci = scanner.nextLine();
                    while(valid.isNci(nci)==false || valid.isVide(nci)){
                        System.out.print("Numero de carte d'identite incorrecte, réessayer: ");
                        nci = scanner.nextLine();
                    }
                    System.out.print("Entrer votre nom complet (Nom et Prénom(s)): ");
                    String nomComplet = scanner.nextLine();
                    while(valid.isVide(nomComplet)){
                        System.out.print("Veuillez entrer votre nom et votre/vos prénom(s): ");
                        nomComplet = scanner.nextLine();
                    }
                    System.out.print("Entrer votre numéro de téléphone: ");
                    String tel = scanner.nextLine();
                    while(valid.isVide(tel) || valid.isTel(tel)==false){
                        System.out.print("Veuillez un numéro de téléphone valide: ");
                        tel = scanner.nextLine();
                    }
                    System.out.print("Entrer votre adresse: ");
                    String adresse = scanner.nextLine();
                    while(valid.isVide(adresse)){
                        System.out.print("Veuillez une adresse valide: ");
                        adresse = scanner.nextLine();
                    }
                    System.out.print("Entrer votre adresse email: ");
                    String email = scanner.nextLine();
                    while(valid.isVide(email) || valid.isMail(email)==false){
                        System.out.print("Veuillez une adresse mail valide: ");
                        email = scanner.nextLine();
                    }
                    System.out.print("Entrer votre mot de passe: ");
                    String password = scanner.nextLine();
                    while(valid.isVide(password)){
                        System.out.print("Veuillez une adresse mail valide: ");
                        password = scanner.nextLine();
                    }
                    Client client = new Client(Integer.parseInt(nci), nomComplet, Integer.parseInt(tel), adresse, email, password);
                    if (service.addClient(client)){
                        System.out.println("Inscription réussie");
                    };
                case 3:
                    System.out.println("******** PAGE DE CONNECTION ********");

                case 4:
                    System.out.println("******** LISTES DES LOCAUX DISPONIBLES ********");

                case 5:
                    System.out.println("******** LISTES DES LOCAUX ********");
                    String choixLocaux;
                    int choixLocauxInt;
                    do{
                        System.out.println("Quel type de local recherchez vous ? "
                                + "\n 1-Appartement "
                                + "\n 2-Chambre");
                        System.out.print("Faites votre choix: ");
                        choixLocaux= scanner.nextLine();
                        choixLocauxInt= Integer.parseInt(choixLocaux);
                    }while(choixLocauxInt!=1 && choixLocauxInt!=2);
                    if(choixLocauxInt ==1){
                        System.out.println("******** LISTE DES APPARTEMENTS ********");

                    }else{
                        System.out.println("******** LISTE DES CHAMBRES ********");

                    }
            }

        }while(choix !=5);
    }
}
