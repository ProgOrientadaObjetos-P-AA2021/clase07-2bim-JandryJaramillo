package paquete04;

public abstract class Transporte {
    protected double tarifa;
    
    public abstract void establecerTarifa();
    
    public double obtenerTarifa(){
        return tarifa;
    }
}
