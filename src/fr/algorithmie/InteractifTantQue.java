package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int nb= 0;


        while (nb > 10 || nb < 1) {
            System.out.print("saisir un Nombre (entre 0 et 10): ");
            nb = scanner.nextInt() ;

        }
        System.out.println("Bravo !");
    }
}
