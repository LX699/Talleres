package Plazas;

import java.time.LocalDateTime;

public class Estacionamiento {

    private int capacidad;
    private Registro[] registros;
    CalculadoraCosto calcular = new CalculadoraCosto(25);

    public Estacionamiento(int capacidad) {
        this.capacidad = capacidad;
        this.registros = new Registro[this.capacidad];
        for (int i = 0; i < registros.length; i++) {
            registros[i].getPlaza().setNumero(i + 1);
        }
    }

    public boolean Estacionar(Automovil autoCliente, int numeroPlaza) {
        if (this.registros[numeroPlaza].getPlaza().isOcupado() == false) {
            return false;
        } else {
            this.registros[numeroPlaza].getPlaza().setAutomovilEstacionado(autoCliente);
            return true;
        }
    }

    public long finalizarServicio(int numeroDePlaza) {
        long costo = calcular.calcularTotal(registros[numeroDePlaza].getHoraInicio(), registros[numeroDePlaza].getHoraTermino());
        return costo;
    }

    public void imprimirPlazas() {

    }

    private void imprimirPlazasDisponibles() {

    }
}
