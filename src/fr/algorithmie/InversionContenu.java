package fr.algorithmie;

public class InversionContenu {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        int[] arrayCopy = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            arrayCopy[array.length-1-i] = array[i];
        }
        System.out.println("Affichage des valeurs des deux tableau");
        for (int i = 0; i < array.length; i++) {
            System.out.println("index " + i+ " valeurs Array :"+ array[i]+ " -- ArrayCopy :"+ arrayCopy[i]);
        }
    }
}
