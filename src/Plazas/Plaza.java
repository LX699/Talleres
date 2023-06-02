package Plazas;

public class Plaza {

    private int numero;
    private boolean ocupado;
    private Automovil automovil;

    public Plaza(int numero) {
        this.numero = numero;
        this.ocupado = false;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public void setAutomovilEstacionado(Automovil automovil) {
        this.automovil = automovil;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}
