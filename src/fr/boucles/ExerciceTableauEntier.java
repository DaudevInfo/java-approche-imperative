package fr.boucles;

public class ExerciceTableauEntier {
    public static void main(String[] args) {

        System.out.println("Parcours d'un tableau d'entier");
        int[] tabEntier = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            tabEntier[i]=i+1;
        }
        System.out.println("1° élt :" + tabEntier[0] + " Taille : "+ tabEntier.length+ " dernier elt : "+ tabEntier[tabEntier.length-1]);

        // Modification du 4° elt du tableau
        tabEntier[3]=8;

    }

}
