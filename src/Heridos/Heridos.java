package Heridos;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Heridos {

    static ArrayList<Integer> hospitales = new ArrayList<>();
    static ArrayList<Integer> ordenHospitales = new ArrayList<>();
    static ArrayList<Integer> heridosGrabes = new ArrayList<>();
    static ArrayList<Integer> heridosMedios = new ArrayList<>();
    static ArrayList<Integer> heridosLeves = new ArrayList<>();
    static ArrayList<Integer> distancia = new ArrayList<>();
    static ArrayList<Double> puntos = new ArrayList<>();
    static ArrayList<Double> ordenPuntos = new ArrayList<>();
    static ArrayList<Integer> helicopteros = new ArrayList<>();

    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {
        int opcion;
        do {
            System.out.println("------------------------------");
            Scanner intro = new Scanner(System.in);
            menu();
            System.out.println("");
            System.out.println("   -Ingrese Una Opcion-");
            try {
                opcion = intro.nextInt();
            } catch (Exception e) {
                opcion = -1;
            }
            System.out.println("");
            switch (opcion) {
                case 1:
                    datosManuales();
                    break;
                case 2:
                    datosAleatorios();
                    break;

                case 3:
                    if (hospitales.size() == 0) {
                        ejecutar();
                    } else {
                        datosHeridos();
                    }
                    break;
                case 4:
                    if (hospitales.size() == 0) {
                        ejecutar();
                    } else {
                        ordenHospitales();
                    }
                    break;
                case 5:
                    if (hospitales.size() == 0) {
                        ejecutar();
                    } else {
                        tabla();
                    }
                    break;
                case 6:
                    if (hospitales.size() == 0) {
                        ejecutar();
                    } else {
                        helicopteros();
                    }
                    break;
                case 7:
                    break;

                default:
                    System.out.println("Ingrese un numero valido");
                    break;
            }

        } while (opcion != 7);

    }

    public static void menu() {
        System.out.println(" ");
        System.out.println("1- Ingresar numero de heridos ");
        System.out.println("2- Numero de heridos aleatorio ");
        System.out.println("3- Datos Sobre Los heridos ");
        System.out.println("4- Prioridad de Hospitales");
        System.out.println("5- Mostrar Tabla:");
        System.out.println("6- Cantidad de Helicopteros por hospital");
        System.out.println("7- Salir ");

    }

    public static void datosAleatorios() {
        limpiar();

        Random random = new Random();
        int valor = random.nextInt(9) + 1;
        for (int i = 0; i < valor; i++) {
            hospitales.add(hospitales.size() + 1);
            heridosGrabes.add(random.nextInt(29) + 1);
            heridosMedios.add(random.nextInt(29) + 1);
            heridosLeves.add(random.nextInt(29) + 1);
            distancia.add(random.nextInt(500) + 100);
            double pts = ((heridosGrabes.get(i) * 0.4) + (heridosMedios.get(i) * 0.2) + (heridosLeves.get(i) * 0.1) + (distancia.get(i) * 0.3));
            puntos.add(pts);
        }
        for (int i = 0; i < hospitales.size(); i++) {
            int coliopteros = 0;
            int suma = 0;
            suma = heridosGrabes.get(i) + heridosMedios.get(i) + heridosLeves.get(i);
            while (suma > 1) {
                suma = suma - 10;
                coliopteros++;
            }
            helicopteros.add(coliopteros);
        }

    }

    public static void datosManuales() {
        limpiar();
        Scanner intro = new Scanner(System.in);
        try {
            System.out.println(" ");
            System.out.println("Ingrese Cantidad De Hospitales");
            int CantidadHospitales = intro.nextInt();
            for (int i = 0; i < CantidadHospitales; i++) {
                hospitales.add(hospitales.size() + 1);
                System.out.println("Ingrese Cantidad De Heridos Grabes Del Hospital N°" + (i + 1));
                heridosGrabes.add(intro.nextInt());
                System.out.println("Ingrese Cantidad De Heridos Medios Del Hospital N°" + (i + 1));
                heridosMedios.add(intro.nextInt());
                System.out.println("Ingrese Cantidad De Heridos Leves Del Hospital N°" + (i + 1));
                heridosLeves.add(intro.nextInt());
                System.out.println("Ingrese Distancia del Hospital N° " + (i + 1));
                distancia.add(intro.nextInt());
                double pts = ((heridosGrabes.get(i) * 0.4) + (heridosMedios.get(i) * 0.2) + (heridosLeves.get(i) * 0.1) + (distancia.get(i) * 0.3));
                puntos.add(pts);
                System.out.println("");
            }
        } catch (Exception e) {
            System.out.println("---Ingrese datos Validos---");
            datosManuales();
        }

        for (int i = 0; i < hospitales.size(); i++) {
            int coliopteros = 0;
            int suma = 0;
            suma = heridosGrabes.get(i) + heridosMedios.get(i) + heridosLeves.get(i);
            while (suma > 1) {
                suma = suma - 10;
                coliopteros++;
            }
            helicopteros.add(coliopteros);
        }

    }

    public static void datosHeridos() {
        int total = 0;
        int grabes = 0;
        int medios = 0;
        int leves = 0;

        for (int i = 0; i < hospitales.size(); i++) {
            total = total + heridosGrabes.get(i) + heridosMedios.get(i) + heridosLeves.get(i);
            grabes = grabes + heridosGrabes.get(i);
            medios = medios + heridosMedios.get(i);
            leves = leves + heridosLeves.get(i);
        }
        System.out.println("Cantidad de Heridos Grabes: " + grabes);
        System.out.println("Cantidad de Heridos Medio: " + medios);
        System.out.println("Cantidad de Heridos Leves: " + leves);
        System.out.println("Cantidad de Heridos Total: " + total);

    }

    public static void ordenHospitales() {
        ordenHospitales = hospitales;
        ordenPuntos = puntos;

        int auxiliarHospitales = 0;
        double auxiliarPuntos = 0;
        for (int i = 0; i < hospitales.size(); i++) {
            for (int j = 0; j < hospitales.size(); j++) {
                if (ordenPuntos.get(i) > ordenPuntos.get(j)) {
                    auxiliarPuntos = ordenPuntos.get(i);
                    auxiliarHospitales = ordenHospitales.get(i);
                    ordenHospitales.set(i, ordenHospitales.get(j));
                    ordenPuntos.set(i, ordenPuntos.get(j));
                    ordenHospitales.set(j, auxiliarHospitales);
                    ordenPuntos.set(j, auxiliarPuntos);
                }
            }

        }
        for (int i = 0; i < ordenHospitales.size(); i++) {
            System.out.println("Hospital N° " + ordenHospitales.get(i) + " con: " + ordenPuntos.get(i) + " Puntos");

        }
    }

    public static void helicopteros() {

        for (int i = 0; i < helicopteros.size(); i++) {
            System.out.println("El Hospital N° " + (i + 1) + " Necesita: " + helicopteros.get(i) + " Helicopteros" + "");
        }

    }

    public static void tabla() {
        System.out.println(" |Hospital|" + " |Herido Grabes|" + " |Heridos Medios|" + " |Heridos Lebes|" + " |Distancia|" + " |Helicopteros|" + " |Puntos|");
        for (int i = 0; i < hospitales.size(); i++) {
            System.out.print("     " + hospitales.get(i) + "\t" + "\t  " + heridosGrabes.get(i) + "\t" + "\t   " + heridosMedios.get(i) + "\t" + "\t    " + heridosLeves.get(i) + "\t" + "\t" + distancia.get(i) + "\t" + "\t" + helicopteros.get(i) + "\t  " + puntos.get(i));
            System.out.println("");

        }
    }

    public static void limpiar() {
        distancia.clear();
        helicopteros.clear();
        heridosGrabes.clear();
        heridosLeves.clear();
        heridosMedios.clear();
        hospitales.clear();
        ordenHospitales.clear();
        ordenPuntos.clear();
        puntos.clear();
    }
}
