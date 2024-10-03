package fr.algorithmie;

import java.util.Arrays;

public class ComparaisonTableau {
    public static void main(String[] args) {
        int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4} ;
        int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
        int eltIdentique = 0;
        int eltIdentiquePartout = 0;

        for (int i= 0; i < array1.length && i < array2.length; i++) {
            if (array1[i] == array2[i]) {
                eltIdentique++;
            }
        }
        System.out.println("Nombre d'élément identique et au même endroit :"+eltIdentique );

        // variante 
        for (int i= 0; i < array1.length ; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    eltIdentiquePartout++;
                    break;
                }
            }
        }
        System.out.println("Nombre d'élément identique et dans tout le tableau :"+eltIdentiquePartout );

    }
}
