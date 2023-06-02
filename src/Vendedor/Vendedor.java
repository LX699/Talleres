package Vendedor;

import java.util.Random;

public class Vendedor {
//    Primero que nada definimos los atributos de cada  vendedor

    Random random = new Random();
    private String nombre;
    private String rut;
    private int[] dias = arreglo();
    private float evaluacion = random.nextInt(5) + 1;
    private float promedioVentas = promedioVentas();

    public Vendedor(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut;
    }

    public Vendedor() {

    }

    private int[] arreglo() {
        Random random = new Random();
        int[] semana = new int[5];
        for (int i = 0; i < semana.length; i++) {
            semana[i] = random.nextInt(100000);
        }
        return semana;
    }

    private float promedioVentas() {
        int suma = 0;
        for (int i = 0; i < this.dias.length; i++) {
            suma += this.dias[i];
        }
        return suma / 5;
    }

    public int getMejorDia() {
        int mejorDia = this.dias[0];
        for (int i = 0; i < this.dias.length; i++) {
            if (dias[i] > mejorDia) {
                mejorDia = dias[i];
            }
        }
        return mejorDia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public float getEvaluacion() {
        return evaluacion;
    }

    public float getPromedioVentas() {
        return promedioVentas;
    }

    public int[] getDias() {
        return dias;
    }
    public void getDatos(){
        System.out.println("\nNombre: "+this.nombre +"\nRut "+this.rut);
        for (int i = 0; i < this.dias.length; i++) {
            System.out.println("Dia "+(+i+1)+": "+ dias[i]);
        }
        System.out.println("Promedio semanal: "+promedioVentas);
        System.out.println("Evaluacion del empleado: "+evaluacion+" puntos");
    }

}
