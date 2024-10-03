package fr.algorithmie;

public class RechercheMin {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        int minArray = array[0]; // Stockage de la valeur Min du tableau
        int indexMinArray = 0; // Stockage de l'index de la valeur Min

        for (int i = 0; i < array.length; i++) {
            if (minArray >= array[i]) {
                indexMinArray = i;
                minArray = array[i];
            }
        }
        System.out.println("Max du tableau : "+ minArray+ " Index : "+ indexMinArray);
    }

}
