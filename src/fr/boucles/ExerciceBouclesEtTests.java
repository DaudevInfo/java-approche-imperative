package fr.boucles;

public class ExerciceBouclesEtTests {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

        System.out.println("Elément du tableau dans l'ordre");
        for (int i = 0; i < array.length; i++) {
            System.out.println("elt :"+array[i]);
        }

        System.out.println("\nElément du tableau dans l'ordre inverse");
        for (int i = array.length-1; i >=0; i--) {
            System.out.println("elt :"+array[i]);
        }

        System.out.println("\nElément du tableau >3");
        for (int i = 0; i < array.length; i++) {
            if (array[i] >=3) {
                System.out.println("elt :"+array[i]);
            }
        }

        System.out.println("\nElément du tableau pair");
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2 == 0) {
                System.out.println("elt :"+array[i]);
            }
        }

        System.out.println("\nElément du tableau index pair");
        for (int i = 0; i < array.length; i++) {
            if (i%2 == 0) {
                System.out.println("index :"+i+" elt :"+array[i]);
            }
        }

        System.out.println("\nElément du tableau impair");
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2 != 0) {
                System.out.println("elt :"+array[i]);
            }
        }
    }
}
