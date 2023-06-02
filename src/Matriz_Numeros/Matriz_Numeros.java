package Matriz_Numeros;

import java.util.Random;
import java.util.Scanner;

public class Matriz_Numeros {

    static final int vertical = 15;
    static final int horizontal = 15;
    static int[][] matrizGlobal;

    public static void main(String[] args) {
        matrizGlobal = new int[vertical][horizontal];
        llenadoMatriz();

    }

    public static void llenadoMatriz() {
        int opcion;
        do {
            Scanner intro = new Scanner(System.in);
            System.out.println("--Eliga juna opcion--");
            System.out.println("\n1-llenar matriz con numeros aletorios");
            System.out.println("2-llenar con multiplos de un numero ingresado");
            System.out.println("3-Mostrar Promedio de las esquinas");
            System.out.println("4-Buscar un numero en la matriz");
            System.out.println("5-Mostrar el promedio de las diagonales");
            System.out.println("6-ordenar de mayor a menor la fila seleccionada");
            System.out.println("");
            opcion = intro.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("\n--Eliga juna opcion--\n");
                    System.out.println("1-Matriz con rango de numeros manual");
                    System.out.println("2-Matriz con rango de numeros automatico");
                    int tipo = intro.nextInt();
                    switch (tipo) {
                        case 1:
                            matrizGlobal = matrizManual(matrizGlobal);
                        case 2:
                            matrizGlobal = matrizAutomatica(matrizGlobal);
                    }
                case 2:
                    matrizMultiplos(matrizGlobal);
                    break;
                case 3:
                    if (matrizVacia()==true) {
                        llenadoMatriz();
                    } else {
                        System.out.println(promedioEzquinas());
                    }
                    break;
                case 4:
                    if (matrizVacia()==true) {
                        llenadoMatriz();

                    } else {
                        System.out.println(Buscarnumero());
                    }
                    break;
                case 5:
                    if (matrizVacia()==true) {
                        llenadoMatriz();

                    }
                    break;
                case 6:
                    if (matrizVacia()==true) {
                        llenadoMatriz();

                    }
                    break;

            }

        } while (opcion != 7);
    }

    public static boolean matrizVacia() {
        boolean vacia = true;
        for (int i = 0; i < matrizGlobal.length; i++) {
            for (int j = 0; j < matrizGlobal.length; j++) {
                if (matrizGlobal[i][j] != 0) {
                    vacia = false;
                }
            }

        }
        return vacia;
    }

    public static int[][] matrizManual(int[][] matriz) {
        Scanner intro = new Scanner(System.in);
        Random aleatorio = new Random();
        System.out.println("Ingrese Rango: ");
        System.out.print("Del: ");
        int desde = intro.nextInt();
        System.out.print("Hasta");
        int hasta = intro.nextInt();
        for (int i = 0; i < vertical; i++) {
            for (int j = 0; j < horizontal; j++) {
                matriz[i][j] = aleatorio.nextInt(hasta - desde) + desde;
            }
        }
        return matriz;
    }

    public static int[][] matrizAutomatica(int[][] matriz) {
        Random aleatorio = new Random();
        for (int i = 0; i < vertical; i++) {
            for (int j = 0; j < horizontal; j++) {
                matriz[i][j] = aleatorio.nextInt(1000 - 100) + 100;
            }
        }
        return matriz;
    }

    public static int[][] matrizMultiplos(int[][] matriz) {
        Random aleatorio = new Random();
        for (int i = 0; i < vertical; i++) {
            for (int j = 0; j < horizontal; j++) {
                matriz[i][j] = aleatorio.nextInt(10 - 1) + 1 * 10;
            }
        }
        return matriz;
    }

    public static String promedioEzquinas() {
        int prom = (matrizGlobal[0][0] + matrizGlobal[0][14] + matrizGlobal[14][0] + matrizGlobal[14][14]) / 4;
        return ("El promedio de las 4 ezquina es :" + prom);
    }

    public static String Buscarnumero() {
        String resultado = "";
        boolean encontro = false;
        Scanner intro = new Scanner(System.in);
        System.out.println("-Ingrese el numero que desea buscar-");
        int numero = intro.nextInt();
        for (int i = 0; i < matrizGlobal.length; i++) {
            for (int j = 0; j < matrizGlobal.length; j++) {
                if (matrizGlobal[i][j] == numero) {
                    encontro = true;
                    String coordenadas = ("El numero fue encontrado en la casilla [" + (i + 1) + "] , [" + (j + 1) + "] de la matriz\n");
                    resultado += coordenadas;
                }
            }
        }
        if (encontro == false) {
            resultado += "El numero no se encuentra en la matriz\n";
        }
        return resultado;
    }

}
