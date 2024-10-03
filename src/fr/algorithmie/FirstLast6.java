package fr.algorithmie;

public class FirstLast6 {
    public static void main(String[] args) {
        int[] array1 = {6, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        int[] array2 = {3, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, 6} ;
        int[] array3 = {2, 6, 6, -4} ;
        int[] array4 = {};
        boolean resultat ;

        /* Comment tester sans outil de test :)) */
        resultat = array1.length >0 && (array1[0] == 6 || array1[array1.length-1]==6);
        System.out.println("Resultat attendu true = "+ resultat);

        resultat = array2.length >0 && (array2[0] == 6 || array2[array2.length-1]==6);
        System.out.println("Resultat attendu true = "+ resultat);

        resultat = array3.length >0 && (array3[0] == 6 || array3[array3.length-1]==6);
        System.out.println("Resultat attendu false = "+ resultat);

        resultat = array4.length >0 && (array4[0] == 6 || array4[array4.length-1]==6);
        System.out.println("Resultat attendu false = "+ resultat);
    }
}
