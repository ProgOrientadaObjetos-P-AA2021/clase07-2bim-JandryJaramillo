package paquete10;

public class APIDisney implements APIMovie{
    
    private String apiKey;
    
    @Override
    public void establecerApiKey(String ak){
        apiKey = ak+123123;
    }
    
    @Override
    public String obtenerApiKey(){
        return apiKey;
    }
    
}