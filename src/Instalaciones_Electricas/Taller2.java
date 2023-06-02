package Instalaciones_Electricas;

public class Taller2 {

    public static void main(String[] args) {
        Medidor medidor = new Medidor();
        InstalacionElectrica intalacion = new InstalacionElectrica();
        AparatosElectricos plancha = new AparatosElectricos(0, Tipo.Resistivo, 1000, "Plancha");
        AparatosElectricos aspiradora = new AparatosElectricos(0, Tipo.Inductivo, 675, "Aspiradora");
        AparatosElectricos televisor = new AparatosElectricos(50, Tipo.Electronico, 760, "Plancha");
        intalacion.add(plancha);
        intalacion.add(aspiradora);
        intalacion.add(televisor);
        System.out.println(intalacion.toString());

        System.out.println(medidor.Consumo(intalacion, 3));
        plancha.Encendido(true);
        aspiradora.Encendido(true);
        System.out.println(medidor.Consumo(intalacion, 3));
        System.out.println(plancha.getPotencia());

        plancha.Encendido(false);
        televisor.Encendido(true);
        System.out.println(medidor.Consumo(intalacion, 3));
    }

}
