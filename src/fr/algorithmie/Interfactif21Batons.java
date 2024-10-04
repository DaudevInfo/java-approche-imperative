package fr.algorithmie;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Interfactif21Batons {
        public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;
        int nbBatonnetsRestant = 21;
        int choix=0 ;
        int coupJoueur;

        while (choix !=4) {
            // Lancement du jeu, on fait choisir un mode
            System.out.println("Menu");
            System.out.println("1 - Je commence");
            System.out.println("2 - Ordinateur commence");
            System.out.println("3 - Règle du jeu");
            System.out.println("4 - Quit");
            System.out.print(" Choix: ");
            choix = scanner.nextInt();


            switch (choix) {
                case 1 :
                    System.out.println(" Dommage tu ne peux que perdre !!!");
                    while (nbBatonnetsRestant > 0) {
                        coupJoueur = joueurJoue(nbBatonnetsRestant);
                        nbBatonnetsRestant -= coupJoueur;
                        if (nbBatonnetsRestant == 0) {
                            System.out.println(" Fin du jeu - Tu as perdu !");
                            return;
                        }
                        nbBatonnetsRestant = ordiJoue(coupJoueur, nbBatonnetsRestant);
                        if (nbBatonnetsRestant == 0) {
                            System.out.println(" Fin du jeu - Tu as gagné !");
                            return;
                        }
                    }
                    break;
                case 2:
                    while (nbBatonnetsRestant > 0) {
                        nbBatonnetsRestant = ordiJoue(0, nbBatonnetsRestant);
                        if (nbBatonnetsRestant == 0) {
                            System.out.println(" Fin du jeu - Tu as gagné !");
                            return;
                        }

                        coupJoueur = joueurJoue(nbBatonnetsRestant);
                        nbBatonnetsRestant -= coupJoueur;
                        if (nbBatonnetsRestant == 0) {
                            System.out.println(" Fin du jeu - Tu as perdu !");
                            return;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Il y a 21 batonnets");
                    System.out.println("Chaque joueur enlève 1 à 3 batonnets");
                    System.out.println("Celui qui enlève le dernier à perdu");
                    break;
                case 4:
                    System.out.println("Bye Bye");
                    break;
                default:
                    System.out.println("il faut lire les instructions");
                    break;
            }
        }
    }
    static int ordiJoue( int coupPrecedent, int nbBatonnetsRestant)
    {
        Random randomNumbers = new Random ();
        int nbARetirer= 0;

        /* Prise en compte par l'ordi en systématique des meilleurs coups pour le final
           Au dessus de 8 batons restants on joue aux hasards quand l'ordi commence
           et on fait jouer l'ordi pour gagner dans l'autre cas (cad on joue pour que
           le coup de l'ordi + précédent = 4
        */
        switch (nbBatonnetsRestant ) {
            case 6, 5, 1, 2:
                nbARetirer = 1;
                break;
            case 7, 3:
                nbARetirer = 2;
                break;
            case 8,4 :
                nbARetirer = 3;
                break;
            default:
                switch (coupPrecedent) {
                    case 0: // On laisse l'ordi jouer au hasard
                        nbARetirer = randomNumbers.nextInt(nbMax(nbBatonnetsRestant)) + 1;
                        break;
                    case 1, 2, 3: // on guide l'ordi
                        nbARetirer = 4 - coupPrecedent;
                        break;
                    default: // coup impossible
                        System.out.println(" erreur");
                        break;
                }
        }
        System.out.println(" L'Ordi joue il enlève "+nbARetirer+ " batonnets");
        nbBatonnetsRestant -= nbARetirer;
        System.out.println( " maintenant il ne reste que :"+ nbBatonnetsRestant+ " batonnets\n");
        return nbBatonnetsRestant;
    }

    static int joueurJoue( int nbBatonnetsRestant) {
        int nbARetirer =0;
        Scanner scanner = new Scanner(System.in) ;



        while (nbARetirer < 1 || nbARetirer > nbMax(nbBatonnetsRestant)) {
            System.out.println("Nombre de batonnets à retirer (entre 1 et " + nbMax(nbBatonnetsRestant) + ")");
            System.out.print(" Nombre: ");
            nbARetirer = scanner.nextInt();
        }

        System.out.println( " maintenant il ne reste que :"+ (nbBatonnetsRestant-nbARetirer)+ " batonnets\n");
        return nbARetirer;
    }

    // Calcul du max possible pour le prochain coup 1,2 ou 3
    static int nbMax(int nbBatonnets)
    {
        if (nbBatonnets == 2) {
            return 2;
        }   else if (nbBatonnets == 1)
        {
            return 1;
        } else if (nbBatonnets >0 )
        {
            return 3;
        }
        return 0;
    }
}
