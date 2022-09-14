public class Transport extends OptionVoyage {
    
    public boolean _trajetLong;

    public static int TARIF_LONG = 1500;
    public static int TARIF_BASE = 200;


    public Transport(String nom, double PrixForfait, boolean trajetLong){

        super(nom,PrixForfait);
        this._trajetLong = trajetLong;
        
    }

    public Transport(String nom, double PrixForfait){

        super(nom,PrixForfait);
        this._trajetLong = false;
        
    }
    
    public double prix(){
        double result = 0;
        if(_trajetLong == true){
            result = TARIF_LONG;
        }
        else 
            result = TARIF_BASE;
        
        result = result + super.prix();

        return result;
        }
    }
 





