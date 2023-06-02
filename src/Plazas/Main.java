package Plazas;

public class Main {


    public static void main(String[] args) {
        Automovil auto = new Automovil("asdasd");
        Automovil auto1 = new Automovil("123123");
        Estacionamiento estacionamiento = new Estacionamiento(10);
        if (estacionamiento.Estacionar(auto,0)==true){
            System.out.println("Auto estacionado");
        }else{
            System.out.println("El puesto esta ocupado");
        }
        
        
       
    }
    
}
