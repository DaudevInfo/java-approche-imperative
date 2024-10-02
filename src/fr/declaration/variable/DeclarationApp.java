package fr.declaration.variable;

import java.sql.SQLOutput;

public class DeclarationApp {

    public static void main (String[]args) {
        byte  b=1;
        short s=2;
        int i=3;
        long l=4L;
        float f=5.0f;
        double d=2.0d;
        String randomString = "Voici le résultat du calcul : \n 1+5 = 6";
        System.out.println("b=" +b +" s="+ s + " i="+i + "l="+l+" f="+f+" d="+ d);
        System.out.println(randomString);
    }
}
