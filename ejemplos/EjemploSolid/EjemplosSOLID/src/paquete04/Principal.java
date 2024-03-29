package paquete04;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        
        TransporteBus bus = new TransporteBus();
        bus.establecerCooperativaBus("24 Mayo");
        bus.establecerTarifa();
        
        TransporteTaxi taxi = new TransporteTaxi();
        taxi.establecerCooperativaTaxi("Yahuarcuna");
        taxi.establecerTarifa();
        
        TransporteTransvia t3 = new TransporteTransvia();
        t3.establecerCooperativaTransvia("Sauces");
        t3.establecerTarifa();
        
        TransporteAereo aereo = new TransporteAereo();
        aereo.establecerCooperativaAerea("El valle");
        aereo.establecerTarifa();
        
        TransporteMaritimo mar = new TransporteMaritimo();        
        mar.establecerCooperativaMaritima("Catamayo");
        mar.establecerTarifa();
        
        ArrayList<Transporte> lista = new ArrayList<>();
        lista.add(bus);
        lista.add(taxi);
        lista.add(t3);
        lista.add(aereo);
        lista.add(mar);
        
        TiposTransporte tipos = new TiposTransporte(); 
        tipos.establecerTransportes(lista);
        tipos.establecerPromedioTarifas();             
        
        System.out.printf("Promedio de Tarifas: %.2f\n", 
                tipos.obtenerPromedioTarifas());        
    }
}