package Plazas;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculadoraCosto {

    private int tarifaminuto;

    public CalculadoraCosto(int tarifaminuto) {
        this.tarifaminuto = tarifaminuto;
    }

    public int getTarifaminuto() {
        return tarifaminuto;
    }

    public void setTarifaminuto(int tarifaminuto) {
        this.tarifaminuto = tarifaminuto;
    }

    public long calcularTotal(LocalDateTime inicio, LocalDateTime termino) {
        long tiempo = inicio.until(termino, ChronoUnit.MINUTES);

        return (this.tarifaminuto * tiempo);
    }
}
