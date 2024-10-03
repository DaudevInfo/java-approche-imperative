package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int nb= 0;
        int somme= 0;

        System.out.print("saisir un Nombre positif: ");
        nb = scanner.nextInt() ;

        for (int i = 1; i <= nb; i++) {
            somme +=i;
        }
        System.out.print("Somme des entiers entre 1 et "+nb+ " = " +somme);

    }
}
