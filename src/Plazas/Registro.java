package Plazas;

import java.time.LocalDateTime;

public class Registro {

    private LocalDateTime horaInicio;
    private LocalDateTime horaTermino;
    private Plaza plaza;

    public Registro(Plaza plaza) {
        this.plaza = plaza;
        this.horaInicio = LocalDateTime.now();
    }

    public void FinalizarRegistro() {
        this.horaTermino = LocalDateTime.now();
    }

    public LocalDateTime getHoraInicio() {
        return horaInicio;
    }

    public LocalDateTime getHoraTermino() {
        return horaTermino;
    }

    public Plaza getPlaza() {
        return plaza;
    }

}
