package fr.algorithmie;

public class AffichageInverse {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        int[] arrayCopy = new int[array.length];

        System.out.println("Affichage des valeurs de tableau");
        for (int i = 0; i < array.length; i++) {
            System.out.println("index " + i+ " valeurs :"+ array[i]);
        }

        System.out.println("\nAffichage des valeurs de tableau en ordre inversé");
        for (int i = array.length-1; i >=0 ; i--) {
            System.out.println("index " + i+ " valeurs :"+ array[i]);
        }

        System.out.println("\nCopie du tableau et contrôle");
        for (int i = 0; i < array.length; i++) {
            arrayCopy[i] = array[i];
        }
        for (int i = 0; i < arrayCopy.length; i++) {
            System.out.println("index " + i+ " valeurs :"+ arrayCopy[i]);
        }

    }
}
