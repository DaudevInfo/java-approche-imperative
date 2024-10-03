package fr.algorithmie;

public class Rotation {
    public static void main(String[] args) {
        int[] array = {0,1,2,3} ;
        int premierElt = 0;
        int i;

        System.out.println("\ntableau initial");
        for (int j = 0; j < array.length; j++) {
            System.out.print(" "+array[j]);
        }

        // Inversion
        premierElt = array[0];
        for (i = 0; i < array.length-1; i++) {
            array[i]= array [i+1];
        }
        array[i]= premierElt;

        System.out.println("\ntableau inversé");
        for (int j = 0; j < array.length; j++) {
            System.out.print(" "+array[j]);
        }
    }
}
