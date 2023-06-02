package Instalaciones_Electricas;

import java.util.ArrayList;

public class InstalacionElectrica {

    private int cosumoPorHora;
    private ArrayList<AparatosElectricos> Aparatos = new ArrayList<>();

    public InstalacionElectrica() {

    }

    public int getCosumoPorHora() {
        this.cosumoPorHora=0;
        for (int i = 0; i < this.Aparatos.size(); i++) {
            this.cosumoPorHora += this.Aparatos.get(i).getPotenciaActual();
        }
        return this.cosumoPorHora;
    }

    public ArrayList<AparatosElectricos> getAparatos() {
        return Aparatos;
    }

    public boolean add(AparatosElectricos aparato) {
        this.Aparatos.add(aparato);
        return true;
    }

    @Override
    public String toString() {
        String info = "";
        for (int i = 0; i < this.Aparatos.size(); i++) {
            info += "\n" + this.Aparatos.get(i).toString();
        }
        return info;
    }

}
