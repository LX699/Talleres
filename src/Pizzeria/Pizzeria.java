/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizzeria;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Pizzeria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // la c agregada en las entradas es para referirce al costo
        // la P agregada en los int es para referirce al precio 
        Scanner intro= new Scanner(System.in);
        
        
        int totalPizzas=0,numeroDePizzas=0;
        String otraPizza;
        int pTamano[]= {1000,1500,5000};
        int pExtra[]={500,450,1000,100,1100};
        String tamano[] = {"1 = Pequeña","2 = Mediana","3 = Grande"};
        String tipoPizza[]= {"1 = Mediterranea","2 = Vegetariana","3 = Americana","4 = Texana"};
        String extra[]= {"1 = Extra Queso","2 = Peperoni","3 = Aceitunass","4 = Piña","5 = Sardina"};
        
        
        do{
            System.out.println("Elija El Tamaño de la pizza");
        
        for (int i = 0; i < tamano.length; i++) {
            System.out.println(tamano[i]);
        }
        int cTamano= intro.nextInt()-1;
        
        System.out.println("Eliga El Tipo De Pizza: ");
        for (int i = 0; i < tipoPizza.length; i++) {
            System.out.println(tipoPizza[i]);
        }
        int cTipoPizza= intro.nextInt()-1;
        
        int totalextras=0;
        String otroextra;
        do{
        System.out.println("Elija Los Extra: ");
        for (int i = 0; i < extra.length; i++) {
            System.out.println(extra[i]);
        }
        int cExtra= intro.nextInt()-1;
        totalextras=totalextras+pExtra[cExtra];
            System.out.println("Otro Extra: si o no");
            otroextra= intro.next();
        }while (otroextra.equals("si"));
        
        int total = pTamano[cTamano]+totalextras;
        
        System.out.println(tipoPizza[cTipoPizza]);
        System.out.println("$"+total);
        
            System.out.println("Desea Comprar otra pizza: si o no");
            otraPizza= intro.next();
            totalPizzas= totalPizzas+total;
            numeroDePizzas++;
            
    }while ( otraPizza.equals("si"));
        
        System.out.println("El Total De Las Pizzas Es :");
        System.out.println("$"+totalPizzas);
        
    
}
}