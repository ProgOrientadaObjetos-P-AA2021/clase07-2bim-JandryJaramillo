package paquete04;

public class TransporteTransvia extends Transporte{
    
    private String cooperativaTransvia;

    public void establecerCooperativaTransvia(String n) {
        cooperativaTransvia = n;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 10;
    }

    public String obtenerCooperativaTransvia() {
        return cooperativaTransvia;
    }
    
}