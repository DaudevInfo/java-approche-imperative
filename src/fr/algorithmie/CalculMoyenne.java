package fr.algorithmie;

public class CalculMoyenne {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        int sommeArray = 0;

        // Essai de la boucle for-each
        for (int i : array) {
            sommeArray += i;
        }

        System.out.println("Moyenne du tableau"+ sommeArray/array.length);
    }
}
