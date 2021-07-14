package paquete04;

public class TransporteAereo extends Transporte{
    
    private String cooperativaAerea;

    public void establecerCooperativaAerea(String n) {
        cooperativaAerea = n;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 65;
    }

    public String obtenerCooperativaAerea() {
        return cooperativaAerea;
    }
    
}