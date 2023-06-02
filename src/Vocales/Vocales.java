/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vocales;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Vocales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Intro = new Scanner(System.in);
        char letras[]= {'a','e','i','o','u'};
        int cantidad[]= new int[5];
        System.out.println("ingrese Palabra");
        String palabra = Intro.next();

        char[] letrasPalabra = new char[palabra.length()];
        for (int x = 0; x < palabra.length(); x++) {
            letrasPalabra[x] = palabra.charAt(x);

            System.out.println(1 + x);
        }
        for (int j = 0; j < letrasPalabra.length; j++) {
            for (int i = 0; i < letras.length; i++) {
                if (letrasPalabra[j]==letras[i]) {
                    cantidad[i]++;
                }
            }

        }
        System.out.println("La letra a esta: " + cantidad[0]);
        System.out.println("La letra e esta: " + cantidad[1]);
        System.out.println("La letra i esta: " + cantidad[2]);
        System.out.println("La letra o esta: " + cantidad[3]);
        System.out.println("La letra u esta: " + cantidad[4]);
    }
}
