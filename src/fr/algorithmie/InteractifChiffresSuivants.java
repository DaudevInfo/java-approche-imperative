package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int nb= 0;

        System.out.print("saisir un Nombre : ");
        nb = scanner.nextInt() ;
        for (int i = 0; i < 10; i++) {
            System.out.print(" "+(nb+i+1));
        }


    }
}
