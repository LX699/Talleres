package Instalaciones_Electricas;

public abstract class Electrico {
    protected int potencia;

    public Electrico(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "\npotencia =" + potencia ;
    }
    
    
    
    


    
}
