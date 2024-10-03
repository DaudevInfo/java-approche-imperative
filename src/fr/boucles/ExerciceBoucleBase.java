package fr.boucles;

public class ExerciceBoucleBase {
    public static void main(String[] args) {
        System.out.println("Affichez tous les nombres de 1 à 10");
        for (int i = 1; i < 11; i++) {
            System.out.println("Nombre : "+i);
        }

        System.out.println("\n Affichez 20 fois votre nom et votre prénom");
        for (int i = 0; i < 20 ; i++) {
            System.out.println("Daudey Sebastien : "+(i+1));
        }

        System.out.println("\n Affichez les éléments pairs de 2 à 100");
        for (int i = 1; i <= 50; i++) {
            System.out.println("Nombre pairs: "+(i*2));
        }

        System.out.println("Affichez les éléments impairs de 1 à 99");
        for (int i = 0; i < 50; i++) {
            System.out.println("Nombre impairs: "+((i*2)+1));
        }
    }
}
