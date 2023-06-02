package Instalaciones_Electricas;

public class AparatosElectricos extends Electrico implements Encendible {

    private int potenciaActual;
    private String nombre;
    private int consumoPasivo;
    private Tipo tipo;
    private boolean estado;

    public AparatosElectricos(int consumoPasivo, Tipo tipo, int potencia, String nombre) {
        super(potencia);
        this.consumoPasivo = consumoPasivo;
        this.tipo = tipo;
        this.nombre = nombre;
        Encendido(false);
    }

    @Override
    public boolean Encendido(boolean encendido) {
        if (encendido == true) {
            this.potenciaActual = this.potencia + this.consumoPasivo;
        }
        if (encendido == false) {
            this.potenciaActual = 0 + this.consumoPasivo;
        }
        this.estado = encendido;
        return encendido;
    }

    public int getPotencia() {
        return potencia;
    }

    public int getPotenciaActual() {
        return potenciaActual;
    }

    @Override
    public String toString() {
        return "\nNombre= " + this.nombre + super.toString() + "\nPotencia Actual= " + this.potenciaActual + "\nConsumo Pasivo=" + this.consumoPasivo + "\nTipo=" + this.tipo + "\nEncendido= " + this.estado;
    }

}
