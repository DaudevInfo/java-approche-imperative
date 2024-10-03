package fr.algorithmie;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class InteractifStockageNombre {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;
        int[] array = new int[0];
        int index = 0;
        int choix =0;
        int nb =0;

        System.out.println("Menu");
        System.out.println("1 - Ajouter un Nombre");
        System.out.println("2 - Afficher les nombres existants");

        while (choix != 2 )
        {
            System.out.print( " Choix: ");
            choix = scanner.nextInt() ;
            switch (choix) {
                case 1:
                    System.out.print("saisir un Nombre");
                    nb = scanner.nextInt() ;
                    array = Arrays.copyOf(array, array.length + 1);
                    array[index++] = nb;
                    break;
                case 2:
                    if (index == 0) {
                        System.out.println("Tableau vide");
                        break;
                    }
                    System.out.print("Tableau saisi :");
                    for (int i = 0; i < index ; i++) {
                        System.out.print(array[i]+" ");
                    }
                    break;
                default:
                    System.out.println("choisir une option entre 1 et 2");
                    break ;
            }
        }


    }
}
