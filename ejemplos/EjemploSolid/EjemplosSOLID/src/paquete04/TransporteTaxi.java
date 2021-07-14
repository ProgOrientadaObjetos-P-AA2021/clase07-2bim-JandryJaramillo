package paquete04;

public class TransporteTaxi extends Transporte {
    private String cooperativaTaxi;    
    
    public void establecerCooperativaTaxi(String n){
        cooperativaTaxi = n;
    }    
    
    public void establecerTarifa(){
        tarifa = 3;
    }
        
    public String obtenerCooperativaTaxi(){
        return cooperativaTaxi;
    }
            
}