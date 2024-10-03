package fr.algorithmie;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Scanner;

public class InteractifTableMult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int nb= -1;


        while (nb > 10 || nb < 1) {
            System.out.print("saisir un Nombre (entre 0 et 10): ");
            nb = scanner.nextInt() ;
        }
        for (int i = 1; i < 11; i++) {
            System.out.println(nb +"*"+i+"="+i*nb );
        }

    }
}
