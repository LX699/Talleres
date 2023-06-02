package Vendedor;

import java.util.ArrayList;
import java.util.Scanner;

public class Vendedor_Main {

    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {
        ArrayList<Vendedor> vendedores = new ArrayList<Vendedor>();
        Scanner intro = new Scanner(System.in);
        int opcion = 0;
        do {
            menu();
            System.out.println("---Ingrese  una opcion---");
            try {
                opcion = intro.nextInt();
                if ((opcion >= 1) || (opcion <= 6)) {
                }
            } catch (Exception e) {
                System.out.println("--Ingrese caracteres validos--");
                System.out.println("");
            }

            switch (opcion) {
                case 1:
                    generarVendedor(vendedores);
                    break;
                case 2:
                    promedioVentas(vendedores);
                    break;
                case 3:
                    promedioPersonas(vendedores);
                    break;
                case 4:
                    mejorVenta(vendedores);
                    mejorPromedioVentas(vendedores);
                    mejorEvaluacion(vendedores);
                    break;
                case 5:
                    detalles(vendedores);
                    break;
                case 6:
                    break;
            }
        } while (opcion != 6);
    }

    public static void menu() {
        System.out.println("\n   -----Menu------");
        System.out.println("1- Ingresar vendedor");
        System.out.println("2- Promedio de ventas de la semana");
        System.out.println("3- Promedio de ventas por empleado");
        System.out.println("4- Mejores vendedores");
        System.out.println("5- Detalle de vendedores");
        System.out.println("6- Salir");
        System.out.println(" ");
    }

    public static void generarVendedor(ArrayList<Vendedor> vendedor) {
        Scanner intro = new Scanner(System.in);
        System.out.println("\n-Ingrese el nombre del Vendedor-");
        String nombre = intro.next();
        System.out.println("-Ingrese rut del vendedor-");
        String rut = intro.next();
        vendedor.add(new Vendedor(nombre, rut));

    }

    public static void promedioVentas(ArrayList<Vendedor> vendedor) {
        int suma = 0;
        for (int i = 0; i < vendedor.size(); i++) {
            suma += vendedor.get(i).getPromedioVentas();
        }
        int promedio = suma / 5;
        System.out.println("\nEl promedio de ventas de la semana fue de: $" + promedio);
    }

    public static void promedioPersonas(ArrayList<Vendedor> vendedor) {
        for (int i = 0; i < vendedor.size(); i++) {
            System.out.println("\nEl promedio de ventas de " + vendedor.get(i).getNombre() + " es de: $" + vendedor.get(i).getPromedioVentas());

        }
    }

    public static void mejorVenta(ArrayList<Vendedor> vendedor) {
        int indice = 0;
        int mejorVenta = vendedor.get(0).getMejorDia();
        for (int i = 0; i < vendedor.size(); i++) {
            if (vendedor.get(i).getMejorDia() > mejorVenta) {
                mejorVenta = vendedor.get(i).getMejorDia();
                indice = i;
            }
            System.out.println("\nEl vendedor: " + vendedor.get(indice).getNombre() + " Logro el mayor monto vendido en un dia con: $" + mejorVenta);
        }
    }

    public static void mejorPromedioVentas(ArrayList<Vendedor> vendedor) {
        int indice = 0;
        float mejorPromedio = vendedor.get(0).getPromedioVentas();
        for (int i = 0; i < vendedor.size(); i++) {
            if (vendedor.get(i).getPromedioVentas() > mejorPromedio) {
                mejorPromedio = vendedor.get(i).getPromedioVentas();
                indice = i;
            }
        }
        System.out.println("\nEl vendedor: " + vendedor.get(indice).getNombre() + " Tiene el Mejor Promedio de ventas con: $" + mejorPromedio);

    }

    public static void mejorEvaluacion(ArrayList<Vendedor> vendedor) {
        int indice = 0;
        float mejorEvaluacion = vendedor.get(0).getEvaluacion();
        for (int i = 0; i < vendedor.size(); i++) {
            if (vendedor.get(i).getEvaluacion() > mejorEvaluacion) {
                mejorEvaluacion = vendedor.get(i).getEvaluacion();
                indice = i;
            }
        }
        System.out.println("\nEl vendedor: " + vendedor.get(indice).getNombre() + " Es el mejor evaluado con: " + mejorEvaluacion + " Puntos");

    }

    public static void detalles(ArrayList<Vendedor> vendedor) {
        for (int i = 0; i < vendedor.size(); i++) {
            vendedor.get(i).getDatos();
        }

    }

}
