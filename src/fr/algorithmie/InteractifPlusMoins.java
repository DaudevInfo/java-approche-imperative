package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int nb= 0;
        int nbCoups = 0;
        Random randomNumbers = new Random ();
        int nbATrouver = randomNumbers.nextInt(100);
        System.out.println(" << SPOIL>> Nombre à trouver  : "+ nbATrouver);

        System.out.println("Devinez un nombre (entre 1 et 100");

        while (nb != nbATrouver ) {
            nbCoups ++;
            System.out.print( " Nombre: ");
            nb = scanner.nextInt() ;
            if (nb < nbATrouver) {
                System.out.println("Essayez au-dessus");
            } else if (nb > nbATrouver) {
                System.out.println("Essayez au-dessous");
            }

        }
        System.out.print("Bravo, vous avez trouvé en "+ nbCoups+" coups");

    }
}
