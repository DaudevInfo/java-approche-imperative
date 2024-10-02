package fr.tableaux;

import java.lang.reflect.Array;

public class ExerciceDeclarationTab {
    public static void main(String[] args) {

        // Exercice : déclaration de base

        // Déclaration du tableau
        int[] tabEntier = {8, -7,12,1,-2,14,17,9};

        // Affichage des valeurs du tableau
        System.out.println("Affichage des informations du tableau \n- premier élément : " + tabEntier[0]);
        System.out.println("- longueur du tableau : " + tabEntier.length);
        System.out.println("- dernier élément du tableau : " + tabEntier[tabEntier.length-1]);

        // Génération d'une erreur en essayant d'afficher un élt supérieur au max du tableau
        System.out.println("- valeur de l'index 10 : " + tabEntier[10]);

    }
}
