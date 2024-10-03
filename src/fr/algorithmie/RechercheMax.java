package fr.algorithmie;

public class RechercheMax {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        int maxArray = array[0]; // Stockage de la valeur Max du tableau
        int indexMaxArray = 0; // Stockage de l'index de la valeur Max
        for (int i = 0; i < array.length; i++) {
            if (maxArray <= array[i]) {
                indexMaxArray = i;
                maxArray = array[i];
            }
        }
        System.out.println("Max du tableau : "+ maxArray+ " Index : "+ indexMaxArray);
    }

}
