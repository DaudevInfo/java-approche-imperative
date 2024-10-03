package fr.algorithmie;

import java.util.Arrays;

public class SommeDeTableauxDiff {
    public static void main(String[] args) {
        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
        int[] sommeArray = new int[1];
        int i = 0;

        /* On fait la sommme des 2 tableaux jusqu'à ce que l'on ait parcouru
           les 2 tableaux.
           On agrandi le tableau de sommme à chaque itération */
        while (i < array1.length || i < array2.length) {

            System.out.print(" Index :" + i);
            if (i < array1.length) {
                sommeArray[i] += array1[i];
                System.out.print(" " + array1[i]);

            }
            ;
            if (i < array2.length) {
                sommeArray[i] += array2[i];
                System.out.print(" + " + array2[i]);
            }
            ;
            System.out.println(" = " + sommeArray[i]);
            i++;
            sommeArray = Arrays.copyOf(sommeArray, sommeArray.length + 1);
        }
    }
}
