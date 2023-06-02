package Instalaciones_Electricas;

public class Medidor {

    private int consumoAcumulado;
    private int Costo;

    public Medidor() {

    }

    public String Consumo(InstalacionElectrica intalacion, int horas) {
        this.consumoAcumulado = (intalacion.getCosumoPorHora() * horas);
        this.Costo = consumoAcumulado * 100;

        return "\nConsumo Acumulado= " + this.consumoAcumulado + "KWh" + "\nCosto= $" + this.Costo;
    }

}
