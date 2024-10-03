package fr.algorithmie;

public class AffichageSuite {
    public static void main(String[] args) {
        System.out.println("Boucle For afficher tous les nombres de 1 à 10 inclus");
        for (int i = 1; i < 11; i++) {
            System.out.println("Nombre :"+i);
        }

        System.out.println("\nBoucle For afficher tous les nombres pairs entre 0 et 10 inclus");
        for (int i = 0; i < 6; i++) {
            System.out.println("Nombre :"+i*2);
        }

        System.out.println("\nBoucle For afficher tous les nombres impairs entre 0 et 9 inclus");
        for (int i = 1; i < 6; i++) {
            System.out.println("Nombre :"+(i*2-1));
        }

        System.out.println("\nBoucle While afficher tous les nombres de 1 à 10 inclus");
        int i = 1;
        while (i<11) {
            System.out.println("Nombre :"+i);
            i++;
        }

        System.out.println("\nBoucle While afficher tous les nombres pairs entre 0 et 10 inclus");
        i = 0;
        while (i<6) {
            System.out.println("Nombre :"+i*2);
            i++;
        }

        System.out.println("\nBoucle While afficher tous les nombres impairs entre 0 et 9 inclus");
        i = 1;
        while (i<6) {
            System.out.println("Nombre :"+(i*2-1));
            i++;
        }
    }
}
