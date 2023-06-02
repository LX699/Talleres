package Datos_Palabras;

import java.util.Scanner;

public class Datos_Palabras {

    public static void main(String[] args) {
        int opcion;
        do {
            Scanner intro = new Scanner(System.in);
            System.out.println("");

            System.out.println("");
            menu();
            System.out.println("");
            System.out.println("          ----Elija una opcion----");
            opcion = intro.nextInt();
            System.out.println("");
            switch (opcion) {
                case 1:
                    letraspalabra(arreglo());
                    break;
                case 2:
                    vocales(arreglo());
                    break;
                case 3:
                    todasVocales(arreglo());
                    break;
                case 4:
                    letra(arreglo());
                    break;
                case 5:
                    palindromo(arreglo());
                    break;
            }

        } while (opcion != 6);
    }

    public static void menu() {
        System.out.println("               ----Menu----");
        System.out.println("1-Mostrar la cantidad de letras de una palabra seleccionada");
        System.out.println("2-Contar las vocales de una palabra");
        System.out.println("3-Contar las vocales de todas la palabras");
        System.out.println("4-Contar cantidad de  veces que aparece la letra ingresada");
        System.out.println("5-Reconoser si  una palabra es palindromo");
        System.out.println("6-salir");
    }

    public static String[] arreglo() {
        String[] palabras = {"arroz", "nuevo", "papel", "calabaza", "linterna", "uno", "limpio", "ana", "libro", "campo", "perro", "reconocer"};
        return palabras;
    }

    public static void letraspalabra(String[] palabra) {
        System.out.println("----Cantidad de letras de  una palabra----");
        Scanner intro = new Scanner(System.in);
        System.out.println("Ingrese el numero de  la palabra:");
        int numeropalabra = intro.nextInt() - 1;
        String caracter = palabra[numeropalabra];
        System.out.println("La Palabra " + caracter + " Tiene " + caracter.length() + " Letras");
    }

    public static void vocales(String[] palabra) {
        System.out.println("----Cantidad de vocales en la palabra----");
        Scanner intro = new Scanner(System.in);

        int vocales = 0;
        System.out.println("Ingrese el numero de  la palabra:");
        int numeropalabra = intro.nextInt() - 1;
        String caracter = palabra[numeropalabra];
        char simbologia;
        for (int i = 0; i < caracter.length(); i++) {
            simbologia = caracter.charAt(i);
            if ((simbologia == 'a') || (simbologia == 'e') || (simbologia == 'i') || (simbologia == 'o') || (simbologia == 'u')) {
                vocales++;
            }
        }
        System.out.println("la Palabra: " + caracter + " Tiene: " + vocales + " vocales");

    }

    public static void todasVocales(String[] palabra) {
        System.out.println("----Todas las vocales  presentes en el arreglo----");
        int vocales = 0;
        char simbologia;
        for (int i = 0; i < palabra.length; i++) {
            String caracter = palabra[i];
            for (int j = 0; j < caracter.length(); j++) {
                simbologia = caracter.charAt(j);
                if ((simbologia == 'a') || (simbologia == 'e') || (simbologia == 'i') || (simbologia == 'o') || (simbologia == 'u')) {
                    vocales++;
                }
            }
        }
        System.out.println("El total de Vocales presentes en el arreglo es de: " + vocales);
    }

    public static void letra(String[] palabra) {
        System.out.println("----Bucar una letra----");
        Scanner intro = new Scanner(System.in);
        System.out.println("Ingrese la letra que desea buscar:");
        char letra = intro.next().charAt(0);
        int letrarepetida = 0;
        char simbologia;
        for (int i = 0; i < palabra.length; i++) {
            String caracter = palabra[i];
            for (int j = 0; j < caracter.length(); j++) {
                simbologia = caracter.charAt(j);
                if (simbologia == letra) {
                    letrarepetida++;
                }
            }
        }
        System.out.println("la Letra: " + letra + " aparece: " + letrarepetida + " veces en el arreglo");
    }

    public static void palindromo(String[] palabra) {
        System.out.println("----Verificacion de Palindromos----");
        Scanner intro = new Scanner(System.in);
        System.out.println("Ingrese el numero de  la palabra:");
        int numeropalabra = intro.nextInt() - 1;
        String caracter = palabra[numeropalabra];
        char[] simbologia = new char[caracter.length()];
        int contador = 0;
        for (int i = 0; i < caracter.length(); i++) {
            simbologia[i] = caracter.charAt(i);
        }
        for (int i = 0; i < caracter.length(); i++) {
            if (simbologia[i] == caracter.charAt(caracter.length() - 1 - i)) {
                contador++;
            }

        }
        if (contador == caracter.length()) {
            System.out.println("La Palabra: " + caracter + " es palindromo");
        } else {
            System.out.println("La Palabra: " + caracter + " no es palindromo");
        }
    }
}
