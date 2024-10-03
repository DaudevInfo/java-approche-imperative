package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int nb= 0;
        int max= 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("saisir le "+ i+ " Nombre: ");
            nb = scanner.nextInt() ;
            if (max <nb) max= nb;
        }
        System.out.print("Le plus grand nombre saisi est le "+max);

    }
}
