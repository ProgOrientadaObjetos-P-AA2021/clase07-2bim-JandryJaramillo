package paquete04;

public class TransporteBus extends Transporte {

    private String cooperativaBus;

    public void establecerCooperativaBus(String n) {
        cooperativaBus = n;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 2;
    }

    public String obtenerCooperativaBus() {
        return cooperativaBus;
    }

}
