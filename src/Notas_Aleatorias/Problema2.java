/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Notas_Aleatorias;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner intro = new Scanner(System.in);
        
        System.out.println("ingrese el numero de alumnos: ");
        int numeroAlum=intro.nextInt();
        
        String []alumnos= new String[numeroAlum];
        int i;
        int x;
        for ( i = 0; i < numeroAlum; i++) {
            System.out.println("Ingrese el numbre del alumno N°"+ (i+1));
            alumnos[i]=intro.next();
            
        }
        int[]notas= new int[numeroAlum];
        
        for (x = 0; x < numeroAlum; x++) {
            Random aleatorio = new Random();
            notas[x] = aleatorio.nextInt(7) + 1;
            
            
            
            System.out.println("El alumno: "+alumnos[x]+ "  tubo nota: "+notas[x]);
        }
        
    }
    
}
