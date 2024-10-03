package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class InteractifFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int a =0;
        int b =1;
        int c = 0;
        int rang =0;

        System.out.println("Suite Fibonnacci");
        System.out.print("Saisir le rang souhaité : ");

        rang = scanner.nextInt() ;
        System.out.print(" Tableau demandé");
        switch (rang) {
                case 0:
                    System.out.print(" 0");
                    break;
                case 1:
                    System.out.print(" 0 1");
                    break;
                default:
                    if (rang <0) {
                        System.out.print("Tableau vide");
                        break;
                    }
                    System.out.print(" 0 1");
                    for (int i = 2; i < rang ; i++) {
                        c= a+b;
                        a= b;
                        b= c;
                        System.out.print(" "+c);
                    }
                    break ;

        }
    }
}
